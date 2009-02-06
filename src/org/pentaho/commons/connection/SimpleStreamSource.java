package org.pentaho.commons.connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * A simple POJO implementation of IPentahoStreamSource
 * @author jamesdixon
 *
 */
public class SimpleStreamSource implements IPentahoStreamSource {

  private String name;
  
  private String contentType;
  
  private InputStream inputStream;
  
  private OutputStream outputStream;
  
  public SimpleStreamSource( String name, String contentType, InputStream inputStream, OutputStream outputStream ) {
    this.name = name;
    this.contentType = contentType;
    this.inputStream = inputStream;
    this.outputStream = outputStream;
  }
  
  public String getContentType() {
    return contentType;
  }

  public InputStream getInputStream() throws IOException {
    return inputStream;
  }

  public String getName() {
    return name;
  }

  public OutputStream getOutputStream() throws IOException {
    return outputStream;
  }

}