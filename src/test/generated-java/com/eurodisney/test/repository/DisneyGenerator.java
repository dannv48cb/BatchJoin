/*
 * (c) Copyright 2005-2014 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/service/ModelGenerator.e.vm.java
 */
package com.eurodisney.test.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import com.eurodisney.test.domain.Disney;
import com.eurodisney.test.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class DisneyGenerator {

    /**
     * Returns a new Disney instance filled with random values.
     */
    public Disney getDisney() {
        Disney disney = new Disney();

        // primary key column must be set manually
        disney.setId(ValueGenerator.getUniqueInteger());
        // simple attributes follows
        disney.setName("a");
        disney.setRealname("a");
        return disney;
    }

}