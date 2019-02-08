package edu.cn.deepdive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DataLoader {

  private String filename;

  public DataLoader(String filename) {
    this.filename = filename;
  }

  public int[][] load() throws IOException {
    File file = new File(filename);
    InputStream input = null;
    InputStreamReader reader = null;
    BufferedReader buffer = null;
    try {
      input = new FileInputStream(file);
      reader = new InputStreamReader(input);
      buffer  = new BufferedReader(reader);
      String line = buffer.readLine();
      while (line != null) {
        String[] parts = line.split("\\s+");
        line = buffer.readLine();
      }
    } finally {
      buffer.close();
      reader.close();
      input.close();
    }
    return null;
  }


}
