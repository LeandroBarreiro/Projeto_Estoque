package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoVisao {
    public void Exibir(){

        ClasseProdutoFakeDB fakedb = new ClasseProdutoFakeDB();
        ArrayList<ClasseProduto> tab = fakedb.getTabela();
        for (ClasseProduto cp : tab) {
            this.Imprimir(cp);
        }
    }

       /*ClasseProduto cp1 = new ClasseProduto();
        cp1.setCodigo(1);
        cp1.setDescricao("Carnes");
        cp1.setDataDeInclusao(LocalDate.now());
        System.out.println("Classe de produto: ");
        System.out.println("Código: " + cp1.getCodigo());
        System.out.println("Descrição: " + cp1.getDescricao());
        System.out.println("Data de inclusão: " + cp1.getDataDeInclusao());
        
        ClasseProduto cp2 = new ClasseProduto(2, "Bebidas", LocalDate.now());
        System.out.println("Classe de produto: ");
        System.out.println("Código: " + cp2.getCodigo());
        System.out.println("Descrição: " + cp2.getDescricao());
        System.out.println("Data de inclusão: " + cp2.getDataDeInclusao());*/
    

    private void Imprimir(ClasseProduto alvo){
        System.out.println("Classe de produto: ");
        System.out.println("Código: " + alvo.getCodigo());
        System.out.println("Descrição: " + alvo.getDescricao());
        System.out.println("Data de inclusão: " + alvo.getDataDeInclusao());
    }
}
