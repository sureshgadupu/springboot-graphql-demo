package com.fullstackcode.springboot.graphql;

import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@SpringBootApplication
public class SpringbootGraphqlDemoApplication implements RuntimeWiringConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraphqlDemoApplication.class, args);

	}

	@Override
	public void configure(RuntimeWiring.Builder builder) {
		builder.scalar(ExtendedScalars.Date);
	}

}
