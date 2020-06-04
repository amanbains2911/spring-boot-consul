/**
 * 
 */
package com.aman.consul.api;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @author amanb
 *
 */
@ConfigurationProperties(prefix="my")
@Data
public class MyConfig {
	
	private String username;
	private String password;

}
