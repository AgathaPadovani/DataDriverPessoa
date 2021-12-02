/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadrivepessoa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author padov
 */
public class CadastraPessoa {
    List<Pessoa> pessoa = new ArrayList<>();
    
    
    public void addPessoa (Pessoa p){
        pessoa.add(p);
        
    }
    
    public Pessoa buscaPessoa(String nomePessoa){
        for (Pessoa b:pessoa){
            if(b.getNome().equals(nomePessoa)){
                return b;
            }
            
        }
        return null;
                
    }
    
    public Pessoa buscaPessoa(Pessoa p){
        for (Pessoa b:pessoa){
            if (b == p)
            {
                return b;
            }
        }return null;
    }
    
    public String GerarRelatorio()
    {
        String x = " ";
        for (Pessoa b:pessoa){
            x += "Nome: "+b.getNome()+ "\n";
            x += "Endereço: "+b.getEndereço()+ "\n";
            x += "Idade: "+b.getIdade()+ "\n";
            x +=  "================================================\n";
        }return x;
    }
    
    public boolean RemovePessoa (String nomePessoa){
       Pessoa b = buscaPessoa(nomePessoa);
        if(b != null)
       {
            pessoa.remove(b);
            
            return true;
        }
        return false;
                
    }
    //ou
    
    public boolean RemoverPessoa (Pessoa p){
        
        if(pessoa.contains(p))
        {
            pessoa.remove(p);
            
            return true;
        }
        return false;
                
    }
    
    public boolean AtualizarPessoa (Pessoa p){
        if (pessoa.contains(p)){
         Pessoa b =buscaPessoa(p);
         b.setNome(p.getNome());
         b.setEndereço(p.getEndereço());
         b.setIdade(p.getIdade());
         return true;
         
         }return false;
         
    }
}

