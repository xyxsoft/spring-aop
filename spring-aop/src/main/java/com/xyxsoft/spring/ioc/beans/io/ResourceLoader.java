package com.xyxsoft.spring.ioc.beans.io;

import java.net.URL;

/**
 * 
 * @author xyxsoft@126.com
 *
 */
public class ResourceLoader {
	
	
	public Resource getResource(String location) {
		URL resource=this.getClass().getClassLoader().getResource(location);
		return new UrlResource(resource);
	}

}
