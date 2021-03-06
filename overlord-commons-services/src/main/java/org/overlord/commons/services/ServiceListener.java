/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.overlord.commons.services;

/**
 * Callback interface for handling service lookups.
 *
 */
public interface ServiceListener<T> {

    /**
     * This method is invoked to indicate a service has been registered.
     * 
     * @param service The service
     */
    public void registered(T service);

    /**
     * This method is invoked to indicate a service has been unregistered.
     * 
     * @param service The service
     */
    public void unregistered(T service);

}
