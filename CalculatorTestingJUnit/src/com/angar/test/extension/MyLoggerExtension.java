package com.angar.test.extension;

import java.util.logging.Logger;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyLoggerExtension implements BeforeEachCallback, AfterEachCallback {
	private Logger logger;
	public MyLoggerExtension(String msg) {
		System.out.println(msg);
	}
	public MyLoggerExtension() {
		
	}
	@Override
	public void beforeEach(ExtensionContext arg0) throws Exception {
		logger = Logger.getLogger(arg0.getClass().getName());
		logger.info("Using extension. Inside BeforeEach in method: " + arg0.getDisplayName());
	}
	@Override
	public void afterEach(ExtensionContext arg0) throws Exception {
		logger.info("Using extension. Inside AfterEach in method: " + arg0.getDisplayName());
		logger = null;
	}
}
