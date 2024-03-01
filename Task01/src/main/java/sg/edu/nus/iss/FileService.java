package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    private static List<String> contents = new ArrayList<>();

    public static List<String> getContents() {
        return contents;
    }

    public static void setContents(List<String> contents) {
        FileService.contents = contents;
    }

        public void ReadCSV (InputStream is) throws IOException{
        String item;
        InputStreamReader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);
        while((item = br.readLine()) != null){
            contents.add(item);
        }
        br.close();
        reader.close();
    }

    public void WriteAsCSV(OutputStream os){
        OutputStreamWriter writer = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(writer);
        try{
            for(String item: contents){
                try{
                    bw.write(item);
                    bw.newLine();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }finally{
            try{
                writer.flush();
                bw.flush();
                writer.close();
                bw.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }


}
