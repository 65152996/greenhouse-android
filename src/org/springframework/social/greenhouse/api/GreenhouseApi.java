/*
 * Copyright 2011 the original author or authors.
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
package org.springframework.social.greenhouse.api;

import org.springframework.social.greenhouse.api.impl.GreenhouseTemplate;

/**
 * Interface specifying a basic set of operations for interacting with Greenhouse.
 * Implemented by {@link GreenhouseTemplate}. Not often used directly, but a
 * useful option to enhance testability, as it can easily be mocked or stubbed.
 * 
 * @author Roy Clarkson
 */
public interface GreenhouseApi {
	
	/**
	 * Returns true if the GreenhouseApi is configured to act on behalf of a user (eg., if it was created with OAuth credentials).
	 */
	boolean isAuthorizedForUser();
	
	/**
	 * Returns the portion of the Greenhouse API containing the event operations.
	 */
	EventOperations eventOperations();
	
	/**
	 * Returns the portion of the Greenhouse API containing the session operations.
	 */
	SessionOperations sessionOperations();
	
	/**
	 * Returns the portion of the Greenhouse API containing the user operations.
	 */
	UserOperations userOperations();
	
}
