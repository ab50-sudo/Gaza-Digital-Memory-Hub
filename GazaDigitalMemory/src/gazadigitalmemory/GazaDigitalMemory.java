package gazadigitalmemory;

import java.util.Date;

public class GazaDigitalMemory {

    private int mediaId;
    private String type; 
    private Date uploadDate;

    public GazaDigitalMemory(int mediaId, String type, Date uploadDate) {
        this.mediaId = mediaId;
        this.type = type;
        this.uploadDate = uploadDate;
    }

    public void displayMediaInfo() {
        System.out.println("--- Media Module Details ---");
        System.out.println("ID: " + mediaId);
        System.out.println("Type: " + type);
        System.out.println("Upload Date: " + uploadDate);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        GazaDigitalMemory mediaRecord = new GazaDigitalMemory(101, "Video Archive", new Date());
        
        mediaRecord.displayMediaInfo();
        
        System.out.println("Execution Completed Successfully.");
    }
}