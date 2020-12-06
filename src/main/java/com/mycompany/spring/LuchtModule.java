/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring;

/**
 *
 * @author Victoria
 */
import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
 

class LuchtModule {

  private  Long id;
  private  int valueTem,valueHum;

  LuchtModule() {}

  LuchtModule(int valueTem, int valueHum) {
        this.valueTem = valueTem;
        this.valueHum = valueHum;
  }
    public LuchtModule(Long id, int valueTem, int valueHum) {
        this.id = id;
        this.valueTem = valueTem;
        this.valueHum = valueHum;
    }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }


    public int getValueTem() {
        return valueTem;
    }

    public void setValueTem(int valueTem) {
        this.valueTem = valueTem;
    }

    public int getValueHum() {
        return valueHum;
    }

    public void setValueHum(int valueHum) {
        this.valueHum = valueHum;
    }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof LuchtModule))
      return false;
    LuchtModule luchtmodule = (LuchtModule) o;
    return Objects.equals(this.id, luchtmodule.id) && Objects.equals(this.valueHum, luchtmodule.valueHum)
        && Objects.equals(this.valueTem, luchtmodule.valueTem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.valueHum, this.valueTem);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", name='" + this.valueHum + '\'' + ", role='" + this.valueTem + '\'' + '}';
  }
}