package edu.bsu.CS222;


import java.io.IOException;
import java.io.InputStream;

public class WikipediaRevision {
    public JSONArray parseUsers (InputStream dataStream) throws IOException {
        return (JSONArray) Json.read(dataStream, "$..Revisions[*].user");
    }
    public JSONArray parseTime (InputStream dataStream) throws IOException{
        return (JSONArray) JsonPath.read(dataStream, "$..revisions[*].timestamp");
    }

    public JSONArray reversedList (JSONArray JSONList){
        JSONArray newList = new JSONArray();
        for (int i = JSONList.size() - 1; i >= 0; i--){
            newList.add(JSONList.get(i));
        }
        return newList;
    }

    public JSONArray parseRedirect(InputStream dataStream) throws IOException{
        JSONArray redirect = JsonPath.read(dataStream, "$..redirects[0][*]");
        System.out.println(redirect);
        return redirect;

    }
}