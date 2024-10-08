package repositorio;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoRepo extends BaseRepositorio<ClasseProduto> {

    private ClasseProdutoFakeDB db;

    public ClasseProdutoRepo(){
        this.db = new ClasseProdutoFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public ClasseProduto Read(int chave) {
        for (ClasseProduto cp : dados) {
            if (chave == cp.getCodigo()) {
                return cp;
            } 
        }
        return null;
    }

    @Override
    public ClasseProduto Edit(ClasseProduto instacia) {
        ClasseProduto cp = this.Read(instacia.getCodigo());
        if(cp != null){
            cp.setDescricao(instacia.getDescricao());
            return cp;
        }
        else{
            return null;
        }
    }

    @Override
    public ClasseProduto Add(ClasseProduto instacia) {
        int pos = this.dados.size() -1;
        ClasseProduto cp = this.dados.get(pos);
        int proxChave = cp.getCodigo() + 1;

       // ClasseProduto cp = this.dados.getLast();
        //int proxChave = cp.getCodigo() + 1;

        instacia.setCodigo(proxChave);
        this.dados.add(instacia);
        return instacia;
    }

    @Override
    public ClasseProduto Delete(int chave) {
        ClasseProduto cp = this.Read(chave);
        if (cp != null) {
            this.dados.remove(cp);
            return cp;
        }
        else{
            return null;
        }
    }
}
