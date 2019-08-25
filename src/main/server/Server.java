package main.server;

import main.entities.Comment;

public class Server {

    private API api;

    public void start(){
        //zapne server
    }

    public void stop(){
        //vypne server
    }

    public void handle (Request.type request, String author, String text, long id){
        Context con = new Context();
        api = new API(con);
        switch (request){
            case CREATE:
                api.createComment(author, text);
                break;
            case UP:
                api.doUpVote(id);
                break;
            case DOWN:
                api.doDownVote(id);
                break;
            case EDIT:
                api.edit(id, text);
            case REPLY:
                api.doReply(id, author, text);
                break;
            case REPORT:
                api.doReport(id);
        }
    }
}
