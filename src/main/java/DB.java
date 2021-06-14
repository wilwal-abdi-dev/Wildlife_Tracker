import org.sql2o.Sql2o;


    public class DB {
        //use the line below if you want to run locally replacing user with db username and pass with db password
        // The line below runs app on heroku comment the line below if you want to run your app locally these are my
        // credentials so they  will not work for you
        public static Sql2o sql2o = new Sql2o( "jdbc:postgresql://ec2-34-200-72-77.compute-1.amazonaws.com:5432/dbdm5s1n8hejg", "moringa", "Access");
    }


