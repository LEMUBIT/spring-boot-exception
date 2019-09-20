package lemubit.academy.springbootexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * The @ControllerAdvice annotation was first introduced in Spring 3.2.
 * It allows you to handle exceptions across the whole application,
 * not just to an individual controller
 * **/
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView handleArithmeticException(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e.toString());
        modelAndView.setViewName("mathError");
        return modelAndView;
    }

    @ExceptionHandler(value={java.lang.NullPointerException.class})
    public ModelAndView handlerNullPointerException(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e.toString());
        modelAndView.setViewName("nullPointerError");
        return modelAndView;
    }
}
