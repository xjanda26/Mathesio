package main.database;


public class DatabaseBuilder {

    private String host;
    private String password;
    private String name;

    public DatabaseBuilder setHost(String host){
        this.host = host;
        return this;
    }

    public DatabaseBuilder setPassword (String pass){
        this.password = pass;
        return this;
    }

    public DatabaseBuilder setName (String name){
        this.name = name;
        return this;
    }

    public Database connect(){
        Database db = new Database(this.name, this.password, this.host);
        return  db;
    }
}