package sample.spring.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Patinya Yongyai on 4/10/2017 AD.
 */
@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class);

    @Pointcut(value="execution(* sample.spring.*Service.*(..))")
    public void invokeServiceMethod() {}

    @Before(value="invokeServiceMethod()")
    public void log(JoinPoint joinPoint) {
        logger.info("Entering "
                + joinPoint.getTarget().getClass().getSimpleName() + "'s "
                + joinPoint.getSignature().getName());

        Object[] args = joinPoint.getArgs();
        for (int i = 0 ; i < args.length ; i++) {
            logger.info("args[" + i + "] -> " + args[i]);
        }
    }
}