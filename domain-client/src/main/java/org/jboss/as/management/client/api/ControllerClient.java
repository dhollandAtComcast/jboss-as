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
package org.jboss.as.management.client.api;

import org.jboss.dmr.ModelNode;

/**
 * Client interface for interacting with a remote "controller"; either a {@code DomainController}
 * a {@code HostController} or a {@code ServerController}.
 *
 * @author Brian Stansberry
 */
public interface ControllerClient {

    /**
     * Pass a detyped request to the controller and ask it to execute it.
     *
     * @param request ModelNode representing the request. Cannot be
     *                <code>null</code>
     *
     * @return ModelNode representing the result of the request
     */
    ModelNode execute(ModelNode request);

    /**
     * Pass a detyped request to the controller and ask it to execute it.
     *
     * @param request ModelNode representing the request
     * @param listener listener to receive notifications as the remote contoller provides
     *           elements of the ultimate result. May be <code>null</code>
     *
     * @return ModelNode representing the result of the request
     */
    ModelNode execute(ModelNode request, ControllerExecutionListener listener);
}