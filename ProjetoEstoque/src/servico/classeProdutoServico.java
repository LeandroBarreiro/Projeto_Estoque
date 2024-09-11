package servico;

import java.util.ArrayList;

import dominio.ClasseProduto;
import repositorio.ClasseProdutoRepo;

public class classeProdutoServico extends baseServico<ClasseProduto>{

    private ClasseProdutoRepo repositorio;

    public classeProdutoServico(){
        this.repositorio = new ClasseProdutoRepo();
    }

    @Override
    public ArrayList<ClasseProduto> Navegar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Navegar'");
    }

    @Override
    public ClasseProduto Ler(int chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Ler'");
    }

    @Override
    public ClasseProduto Editar(ClasseProduto obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Editar'");
    }

    @Override
    public ClasseProduto Adicionar(ClasseProduto obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Adicionar'");
    }

    @Override
    public ClasseProduto Deletar(int chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Deletar'");
    }

}
