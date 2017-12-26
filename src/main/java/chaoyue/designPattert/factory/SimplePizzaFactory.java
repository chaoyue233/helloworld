package chaoyue.designPattert.factory;

import chaoyue.designPattert.factory.pizza.CheesePizza;
import chaoyue.designPattert.factory.pizza.PepperoniPizza;
import chaoyue.designPattert.factory.pizza.Pizza;
import chaoyue.designPattert.factory.pizza.VeggiePizza;

/**
 * 简单工厂方法 就是通过这边维护if-else
 */
public class SimplePizzaFactory {
  public Pizza createPizza(String type){
    Pizza pizza = null;
    if(type.equals("cheese")){
      pizza = new CheesePizza();
    }else if(type.equals("pepperoni")){
      pizza = new PepperoniPizza();
    }else if(type.equals("clam")){
      pizza = new CheesePizza();
    }else if(type.equals("veggie")){
      pizza = new VeggiePizza();
    }
    return pizza;
  }

}