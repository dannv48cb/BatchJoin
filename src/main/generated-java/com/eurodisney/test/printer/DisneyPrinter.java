/*
 * (c) Copyright 2005-2014 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/printer/Printer.e.vm.java
 */
package com.eurodisney.test.printer;

import java.util.Locale;

import javax.inject.Named;
import javax.inject.Singleton;

import com.eurodisney.test.domain.Disney;
import com.eurodisney.test.domain.Disney_;
import com.eurodisney.test.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link Disney} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class DisneyPrinter extends GenericPrinter<Disney> {
    public DisneyPrinter() {
        super(Disney.class, Disney_.name);
    }

    @Override
    public String print(Disney disney, Locale locale) {
        if (disney == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, disney.getName());
        return ret.toString();
    }
}