package keke.edgebox.bokz.gwt.client.model;

import java.io.Serializable;

public class BookInfo implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 8752924304997583445L;
  private String name;
  private String type;
  private long id;

  public BookInfo(long id, String name, String type) {
    super();
    this.id = id;
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
