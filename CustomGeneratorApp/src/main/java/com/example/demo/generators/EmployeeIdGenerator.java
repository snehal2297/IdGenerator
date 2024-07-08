package com.example.demo.generators;

import java.util.Properties;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;

@Component
public class EmployeeIdGenerator implements IdentifierGenerator,Configurable {
	String prefix="IT";
	
	 @Override
	    public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) {
	        prefix = params.getProperty("prefix");
	    }

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		
		
		  String query = "SELECT COUNT(e) FROM Employee e";
	        Long count = (Long) session.createQuery(query).uniqueResult();
	        return prefix + (count + 1);
	}

}
