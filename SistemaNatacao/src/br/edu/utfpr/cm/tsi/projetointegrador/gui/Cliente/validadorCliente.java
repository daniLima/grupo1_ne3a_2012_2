/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.gui.Cliente;

import java.util.InputMismatchException;

/**
 *
 * @author Daniele
 */
public class validadorCliente {
    
        public static boolean isCPF(String CPF) {
// considera-se erro CPF's formados por uma sequencia de numeros iguais

        if (CPF.equals("00000000000")) {
            return true;
        }

        if (CPF.equals("00000000000") || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
// converte o i-esimo caractere do CPF em um numero:
// por exemplo, transforma o caractere '0' no inteiro 0        
// (48 eh a posicao de '0' na tabela ASCII)        
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

// Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    static public boolean isCnpj(String cnpj) {
        try {
            int soma = 0, aux, dig;
            String cnpj_calc = cnpj.substring(0, 12);

            if (cnpj.length() != 14) {
                return false;
            }

            char[] chr_cnpj = cnpj.toCharArray();

            /*
             * Primeira parte
             */
            for (int i = 0; i < 4; i++) {
                if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                    soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
                }
            }
            for (int i = 0; i < 8; i++) {
                if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
                    soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
                }
            }
            dig = 11 - (soma % 11);

            cnpj_calc += (dig == 10 || dig == 11)
                    ? "0" : Integer.toString(dig);

            /*
             * Segunda parte
             */
            soma = 0;
            for (int i = 0; i < 5; i++) {
                if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                    soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
                }
            }
            for (int i = 0; i < 8; i++) {
                if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
                    soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
                }
            }
            dig = 11 - (soma % 11);
            cnpj_calc += (dig == 10 || dig == 11)
                    ? "0" : Integer.toString(dig);

            return cnpj.equals(cnpj_calc);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isEmail(String email) {
        try {
            String[] nome_e_dominio = email.split("@");
            if (nome_e_dominio.length != 2) {
                return false;
            } else {
                String[] dominio = nome_e_dominio[1].split("\\.");
                if (dominio.length < 2) {
                    return false;
                }

            }

        } catch (Exception e) {

            return false;
        }
        return true;

    }

   
    public static boolean isData(String data) {
        data = data.replace("/", "");
        data = data.replace("/", "");
        try {


            int dia = Integer.parseInt(data.substring(0, 2));
            int mes = Integer.parseInt(data.substring(2, 4));
            int ano = Integer.parseInt(data.substring(4, 8));
                boolean bissesto;
            int f4 = 0;
            int f100 = 0;
            int f400 = 0;
            if (ano % 4 == 0) {
                f4 = 1;
            }
            if (ano % 100 == 0) {
                f100 = 1;
            }

            if (ano % 400 == 0) {
                f400 = 1;
            }

            if ((f4 == 1 && f100 == 0) || (f4 == 1 && f400 == 1)) {
                bissesto = true;
            } else {
                bissesto = false;
            }

            if (mes > 12 && mes > 0) {
                return false;
            } else {
                if (dia < 1) {
                    return false;
                }
                switch (mes) {
                    case 1:
                        if (dia <= 31) {
                            return true;
                        }
                        break;
                    case 2:
                        if (bissesto) {
                            if (dia <= 29) {
                                return true;
                            }
                        } else {
                            if (dia <= 28) {
                                return true;
                            }
                        }
                        break;
                    case 3:
                        if (dia <= 31) {
                            return true;
                        }
                        break;
                    case 4:
                        if (dia <= 30) {
                            return true;
                        }
                        break;
                    case 5:
                        if (dia <= 31) {
                            return true;
                        }
                        break;
                    case 6:
                        if (dia <= 30) {
                            return true;
                        }
                        break;
                    case 7:
                        if (dia <= 31) {
                            return true;
                        }
                        break;
                    case 8:
                        if (dia <= 31) {
                            return true;
                        }
                        break;
                    case 9:
                        if (dia <= 30) {
                            return true;
                        }
                        break;
                    case 10:
                        if (dia <= 31) {
                            return true;
                        }
                        break;
                    case 11:
                        if (dia <= 30) {
                            return true;
                        }
                        break;
                    case 12:
                        if (dia <= 31) {
                            return true;
                        }
                        break;
                }
            }

            return false;
        } catch (Exception e) {
            return false;
        }
    }
}

    

