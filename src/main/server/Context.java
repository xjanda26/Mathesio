package main.server;

import main.config.Config;
import main.database.DatabaseBuilder;
import main.database.Database;

public class Context {
    private Config config;
    private Database database;

    public Context(){
        createConfig();
    }

    public void createConfig(){
        this.config = Config.getInstance();
    }

    public Database createDb(){
        this.database = new DatabaseBuilder().setHost(this.config.getUrl()).setName(this.config.getUsername()).setPassword(this.config.getPassword()).connect();
        return this.database;
    }

    public Database getDb(){
        return this.database;
    }
}