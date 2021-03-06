/*
 * Copyright 2007-2011 the original author or authors.
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

package org.shept.org.springframework.web.bind.support;

import org.springframework.web.context.request.WebRequest;

/** 
 * @version $$Id: ComponentBindingInitializer.java 34 2010-08-20 16:46:49Z aha $$
 *
 * @author Andi
 *
 */
public interface ComponentBindingInitializer {

	/**
	 * Initialize the given DataBinder for the given request.
	 * @param binder the DataBinder to initialize
	 * @param request the web request that the data binding happens within
	 * @param componentPath the path within the bound object
	 */
	void initBinder(WebRequest request, ComponentDataBinder binder, String componentPath );

}
