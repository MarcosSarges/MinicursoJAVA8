/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author MP
 */
public class Teste {

    public static void main(String[] args) {
        Mae mae = new Mae();
        mae.setNome("Mae");
        mae.andar();

        Filha filha = new Filha();
        filha.setNome("Filha");
        filha.andar();
        filha.brincar(filha.getNome());
   
    }
}
