import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    

    public static void main(String[] args) {
        MusicOrganizer organiser1 = new MusicOrganizer();
        organiser1.addFile("katy perry");
        organiser1.addFile("micheal jackson");
        organiser1.listAllFiles();
        organiser1.listMatching("katy perry");
    }
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
       
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    public void listAllFiles(){
        for (String allFiles : files) {
            System.out.println(allFiles);
        }
    }

    public void listMatching(String suppliedFile){
        for (String file : files) {
           if (file.equals(suppliedFile)) {
            System.out.println(file);
           }
        }
    }
}
