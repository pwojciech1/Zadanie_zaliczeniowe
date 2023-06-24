package com.populationtracker.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Klasa pomocnicza do obsługi logowania.
 */
public class LoggerUtil {
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

    public static void logInfo(String message) {
        logger.info(message);
    }
}
