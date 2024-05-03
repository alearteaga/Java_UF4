package Classes_Abstractes;


abstract class BaseDeDatos {
    public abstract void conectar();
    public abstract void desconectar();
    public abstract void consulta(String consulta);
}

class MySQL extends BaseDeDatos {
    @Override
    public void conectar() {
        System.out.println("Conectándose a la base de datos MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectándose de la base de datos MySQL");
    }

    @Override
    public void consulta(String consulta) {
        System.out.println("Realizando consulta en MySQL: " + consulta);
    }
}

class PostgreSQL extends BaseDeDatos {
    @Override
    public void conectar() {
        System.out.println("Conectándose a la base de datos PostgreSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectándose de la base de datos PostgreSQL");
    }

    @Override
    public void consulta(String consulta) {
        System.out.println("Realizando consulta en PostgreSQL: " + consulta);
    }
}
