package com.xyxsoft.spring.ioc.io;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

import com.xyxsoft.spring.ioc.beans.io.Resource;
import com.xyxsoft.spring.ioc.beans.io.ResourceLoader;

public class ResourceLoaderTest {
	
	
	@Test
	public void test() throws Exception {
		ResourceLoader resourceLoader=new ResourceLoader();
		Resource resource=resourceLoader.getResource("springioc.xml");
		InputStream inputStream=resource.getInputStream();
		 Assert.assertNotNull(inputStream);
	}

}
