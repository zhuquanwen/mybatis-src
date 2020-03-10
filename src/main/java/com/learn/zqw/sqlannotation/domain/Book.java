package com.learn.zqw.sqlannotation.domain;

/**
 * Book实体类
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2020/3/8 12:05
 * @since jdk1.8
 */

public class Book {

    private Integer id;

    private String name;

    private Integer num;

    private Library library;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public Library getLibrary() {
    return library;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }
}
