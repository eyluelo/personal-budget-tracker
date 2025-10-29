package com.budgettracker.util;

import java.io.File;
import java.io.IOException;

public class FileUtil {

    public static boolean fileExists(File file) throws IOException{
        if (file.exists()){return true;}
        else {throw new IOException("file does not exist");
        }
    } //don't like this way change later


}
