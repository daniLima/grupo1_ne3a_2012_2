/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.coneccao;

import java.util.List;

/**
 *
 * @author Douglas Santiago
 */
public interface Produto {

    /**
     * Faz a inserção ou atualização da mercadoria na base de dados.
     * @param mercadoria
     * @throws <code>PersistenceException</code> se algum problema ocorrer.
     */
    void save(Produto produto);

    /**
     * Exclui o registro da mercadoria na base de dados.
     * @param mercadoria
     * @throws <code>PersistenceException</code> se algum problema ocorrer.
     */
    void remove(Produto produto);

    /**
     * @return Lista com todas as mercadorias cadastradas no banco de dados.
     * @throws <code>PersistenceException</code> se algum problema ocorrer.
     */
    List<Produto> getAll();

    /**
     * @param nome Filtro da pesquisa utilizando like.
     * @return Lista de mercadorias com filtro em nome.
     * @throws <code>PersistenceException</code> se algum problema ocorrer.
     */
    List<Produto> getMercadoriasByNome(String nome);

    /**
     * @param id filtro da pesquisa.
     * @return Mercadoria com filtro no id, caso não exista retorna <code>null</code>.
     * @throws <code>PersistenceException</code> se algum problema ocorrer.
     */
    Produto findById(Integer id);

    /**
     * Inicializa o componente de persistência.
     * @throws <code>PersistenceException</code> se algum problema ocorrer.
     */
    void init();
}
