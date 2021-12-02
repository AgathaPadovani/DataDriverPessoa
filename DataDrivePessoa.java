/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadrivepessoa;

/**
 *
 * @author padov
 */
public class DataDrivePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 =new Pessoa();
        p1.setNome("Tiago");
        p1.setEndereço("Rua Walter Fco Castela,768");
        p1.setTelefone("991657054");
        p1.setIdade(30);
        
        Pessoa p2 =new Pessoa();
        p2.setNome("Agatha");
        p2.setEndereço("Rua dos Jacarandas,28");
        p2.setTelefone("991314030");
        p2.setIdade(32);
        
         Pessoa p3 =new Pessoa();
        p3.setNome("Judith");
        p3.setEndereço("Rua Soldado Bueno,101");
        p3.setTelefone("991486111");
        p3.setIdade(67);
        
        CadastraPessoa cadastro = new CadastraPessoa();
        
        cadastro.addPessoa(p1);
        cadastro.addPessoa(p2);
        cadastro.addPessoa(p3);
      
        
        System.out.println(cadastro.GerarRelatorio());
        
        cadastro.RemovePessoa("Tiago");
        
        System.out.println(cadastro.GerarRelatorio());
        
        cadastro.RemoverPessoa(p3);
        
        System.out.println(cadastro.GerarRelatorio()); 
        
        p2.setIdade(21);
        cadastro.AtualizarPessoa(p2);
        
        System.out.println(cadastro.GerarRelatorio());
    }
    
}
