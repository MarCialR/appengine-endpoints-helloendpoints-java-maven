package com.example.helloendpoints;

public class Free {

  public String message;

  public Free() {};

  public Free(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
