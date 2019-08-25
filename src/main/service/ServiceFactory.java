package main.service;

import main.database.Database;

public class ServiceFactory {

    public CommentService createCommentService(Database database){
        return new CommentService(database);
    }
}