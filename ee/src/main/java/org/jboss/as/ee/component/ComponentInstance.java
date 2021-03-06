/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.ee.component;

import org.jboss.invocation.Interceptor;
import org.jboss.invocation.InterceptorFactoryContext;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * An instance of a Java EE component.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public interface ComponentInstance extends Serializable {

    /**
     * Get the component associated with this instance.
     *
     * @return the component
     */
    Component getComponent();

    /**
     * Get the actual object instance.  The object instance has all injections filled.
     *
     * @return the instance
     */
    Object getInstance();

    /**
     * Get the interceptor for the given method.
     *
     * @param method the method
     * @return the interceptor
     * @throws IllegalStateException if the method does not exist
     */
    Interceptor getInterceptor(Method method) throws IllegalStateException;

    /**
     * Get the {@link InterceptorFactoryContext} associated with this component instance.
     *
     * @return the InterceptorFactoryContext for this instance
     */
    InterceptorFactoryContext getInterceptorFactoryContext();
}
