package com.zixue.mazz.controller;

import com.zixue.mazz.log.CustomerLogger;
import com.zixue.mazz.utils.Constants;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/test")
public class testController {

    Logger log = Logger.getLogger(testController.class);
    CustomerLogger customerLogger = null;//分类日志

    @RequestMapping(value = "/frameLog",method = RequestMethod.GET)
    public Map<Object,Object> frameLog() {
        customerLogger = new CustomerLogger(Constants.FRAME_LOGGER_PREFIX);
        Map map = new HashMap(10);
        map.put("logType","frameLog");
        customerLogger.debug("This is debuglog about frameLog:" + map);
        customerLogger.info("This is infolog about frameLog:" + map);
        return map;
    }

    @RequestMapping(value = "/businessLog",method = RequestMethod.GET)
    public Map<Object,Object> businessLog() {
        customerLogger = new CustomerLogger(Constants.BUSINESS_LOGGER_PREFIX);
        Map map = new HashMap(10);
        map.put("logType","businessLog");
        customerLogger.debug("This is debuglog about businessLog:" + map);
        customerLogger.info("This is infolog about businessLog:" + map);
        return map;
    }

    @RequestMapping(value = "/daoLog",method = RequestMethod.GET)
    public Map<Object,Object> daoLog() {
        customerLogger = new CustomerLogger(Constants.DAO_LOGGER_PREFIX);
        Map map = new HashMap(10);
        map.put("logType","daoLog");
        customerLogger.debug("This is debuglog about daoLog:" + map);
        customerLogger.info("This is infolog about daoLog:" + map);
        return map;
    }

    @RequestMapping(value = "/sysLog",method = RequestMethod.GET)
    public Map<Object,Object> test() {
        Map map = new HashMap(10);
        map.put("logType","sysLog");
        log.debug("This is debuglog about sysLog:" + map);
        log.info("This is infolog about sysLog:" + map);
        return map;
    }
}
