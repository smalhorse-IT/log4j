package com.zixue.mazz.log;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.io.UnsupportedEncodingException;

/**
 * 自定义日志类，实现按照不同业务分类打印日志
 * @author mazz
 */
public class CustomerLogger {

    //private static final String ENCODING = System.getProperty("file.encoding");
    //private String messageEncoding = "UTF-8";
    private Logger logger = null;

    public CustomerLogger(String name) {
        logger = Logger.getLogger(name);
    }

    public void debug(Object message) {
        debug(message, (Throwable)null);
    }

    public void debug(Object message, Throwable e) {
        logger.log(Level.DEBUG, message, e);
    }

    public void info(Object message) {
        info(message, (Throwable)null);
    }

    public void info(Object message, Throwable e) {
        logger.log(Level.INFO, message, e);
    }

    public void warn(Object message) {
        warn(message, (Throwable)null);
    }

    public void warn(Object message, Throwable e) {
        logger.log(Level.WARN, message, e);
    }

    public void error(Object message) {
        error(message, (Throwable)null);
    }

    public void error(Object message, Throwable e) {
        logger.log(Level.ERROR, message, e);
    }

    public void fatal(Object message) {
        fatal(message, (Throwable)null);
    }

    public void fatal(Object message, Throwable e) {
        logger.log(Level.FATAL, message, e);
    }
}
