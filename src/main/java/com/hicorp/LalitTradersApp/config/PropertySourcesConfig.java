/**
 * 
 *//*
package com.hicorp.LalitTradersApp.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

*//**
 * @author Krishna Khatana
 *
 *//*
@Configuration
public class PropertySourcesConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(PropertySourcesConfig.class);

	private static final String PROPERTIES_LOCATION = "/home/finance/applications/configurations/";
	private static final String DEFAULT_LOCATION = "C:/configurations/C2/";//configurations/";
	private static final String DEFAULT = "default";
	private static final String DEV = "dev";
	private static final String QA = "qa";
	private static final String PROD = "prod";
	
	@Profile(DEFAULT)
	public static class DefaultConfig {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			LOGGER.info("PropertySourcesConfig: DefaultConfig");
			return getPropertySourcesPlaceholderConfigurerByEnv(DEFAULT);
		}
	}
	
	
	@Profile(DEV)
	public static class DevConfig {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			LOGGER.info("PropertySourcesConfig: DevConfig");
			return getPropertySourcesPlaceholderConfigurerByEnv(DEV);
		}
	}

	@Profile(QA)
	public static class QaConfig {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			LOGGER.info("PropertySourcesConfig: QaConfig");
			return getPropertySourcesPlaceholderConfigurerByEnv(QA);
		}
	}

	@Profile(PROD)
	public static class ProdConfig {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			LOGGER.info("PropertySourcesConfig: ProdConfig");
			return getPropertySourcesPlaceholderConfigurerByEnv(PROD);
		}
	}
	
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurerByEnv(String env) {
		PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
		pspc.setIgnoreResourceNotFound(true);
		final List<Resource> resourceLst = new ArrayList<Resource>();
		List<String> propFileList = getPropFileList(env);
		for (String filePath : propFileList) {
			resourceLst.add(new FileSystemResource(filePath));
		}
		pspc.setLocations(resourceLst.toArray(new Resource[] {}));
		return pspc;
	}
	
	public static List<String> getPropFileList(String env) {
		List<String> fileList = new ArrayList<String>();
		String fileName = "";
		String propertiesLocation = "";
		
		LOGGER.error("-- loading Env : " + env );

		// If spring.profiles.active not set then use default location
		if (StringUtils.equals(env, DEV) || StringUtils.equals(env, QA) || StringUtils.equals(env, PROD)) {
			propertiesLocation = System.getenv(PROPERTIES_LOCATION);
		} else {
			//propertiesLocation = System.getenv(PROPERTIES_LOCATION); // TEMP
			propertiesLocation = DEFAULT_LOCATION;
			env = DEFAULT;
		}
		// If propertiesLocation blank use default location
		if (StringUtils.isBlank(propertiesLocation)) {
			propertiesLocation = DEFAULT_LOCATION;
			env = DEFAULT;
		}
		
		LOGGER.error("-- loading Env : " + env );
		
		LOGGER.error("-- propertiesLocation : " + propertiesLocation );
		
		propertiesLocation = DEFAULT_LOCATION;

		File[] listOfFiles = FileUtils.getFile(propertiesLocation).listFiles();
		if (listOfFiles != null) {
			for (File f : FileUtils.getFile(propertiesLocation).listFiles()) {
				fileName = f.getName();
				if (StringUtils.isNotBlank(fileName)) {
					//if (StringUtils.lowerCase(fileName).endsWith("-" + env + ".properties")) {
						fileList.add(propertiesLocation + fileName);
					//}
				}
			}
		}else{
			LOGGER.error("ERROR IN LOADING ENVIRONMENT PROPERTY FILES FOR : " + env);
			throw new RuntimeErrorException(new Error("ERROR IN LOADING ENVIRONMENT PROPERTY FILES FOR :" + env));
		}
		return fileList;

	}
	
	
}
*/