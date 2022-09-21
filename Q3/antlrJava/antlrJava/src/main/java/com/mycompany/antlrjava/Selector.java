
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Selector{ 
    private int number; 
    private String attribute; 
    private String path; 




    Selector(int number, String attribute, String path){ 
        this.number = number; 
        this.attribute = attribute;
        this.path = path; 
    }


    if(this.attribute === "fspOldest"){ 
        this.fspOldest(false); 
    }else if(this.attribute === "fspNewest"){ 
        this.fspNewest();
    }else if(this.attribute === "fspBiggest"){ 
        fspBiggest(false); 
    }else if(this.attribute === "fspSmallest"){ 
        fspSmallest(); 
    }






    public void fspOldest(Boolean reverseStatus){ 
        final List<File> files = Arrays.asList(new File(this.path).listFiles()); 
        final Map<File, Long> modified = new HashMap<File, Long>(); 
        for (final File file : files){ 
            modified.put(file, file.lastModified()); 
        }

        Collections sortedFile = sortingFile(files, reverseStatus, modified); 
        if(this.sortedFile.length() < this.attribute){ 
            this.attribute = this.sortedFile.length(); 
        }
        for(int i = 0, i < this.attribute; i++){ 
            System.out.println(sortedFile[i]); 
        }


    }

    public void fspNewest(){ 
        this.fspOldest(true)
    }
    private Collections sortingFile(File file, Boolean reverseStatus, Map<File, Long> modified){
        if(reverseStatus == false){ 
            return Collections.sort(files, new Comparator<File>(){ 
                @override
                public int compare(final File f1, final File f2){ 
                    return modified.get(f1).compare(modified.get(f2))
                }
            }); 
        }else if(reverseStatus == true){ 
            return Collections.sort(files, new Comparator<File>(){ 
                @override
                public int compare(final File f1, final File f2){ 
                    return modified.get(f1).compare(modified.get(f2))
                }
            }, Collections.reverseOrder()); 
        } 

        return null; 


        
    }




    public void fspBiggest(Boolean reverseStatus){ 
        File files = new File(this.path); 
        Collections sortedSizeFile = sortingFileSize(files, reverseStatus);
        if(this.sortedSizeFile.length() < this.attribute){ 
            this.attribute = this.sortedFile.length(); 
        }
        for(int i = 0, i < this.attribute; i++){ 
            System.out.println(sortedSizeFile[i]); 
        }
    }

    public void fspSmallest(){ 
        fspBiggest(true)

    }

   private Collections sortingFileSize(File file, Boolean reverseStatus){
        if(reverseStatus == false){ 
            return Collections.sort(files); 
        }else if(reverseStatus == true){ 
            return Collections.sort(files,Collections.reverseOrder()); 
        } 

        return null; 


        
    }

}