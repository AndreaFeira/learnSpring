package it.duccio.util;

import java.util.Calendar;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.FactoryBean;

// This class is a Bean because implement the interface FactoryBean so it doesen't need
// @Service or other annotations
public class CalendarFactory implements FactoryBean<Calendar> {

  private Calendar instance = Calendar.getInstance();

  @PostConstruct
  private void initialize(){
    System.out.println("Init FactoryBean<Calendar> PostConstruct");
  }

  @Override
  public Calendar getObject() throws Exception {
    System.out.println("Get object by FactoryBean<Calendar>");
    return instance;
  }

  @Override
  public Class<?> getObjectType() {
    return Calendar.class;
  }

  public void addDays(int num){
    instance.add(Calendar.DAY_OF_YEAR, num);
  }
}
