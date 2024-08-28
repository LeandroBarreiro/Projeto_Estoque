package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<Tdominio> {
    
    protected ArrayList<Tdominio> tabela;

    public ArrayList<Tdominio> getTabela(){
        return this.tabela;
    }

    public abstract void preencherDados();

    public BaseFakeDB(){
        this.preencherDados();
    }
}
