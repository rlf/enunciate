/*
 * Copyright 2006 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.enunciate.modules.rest;

import org.codehaus.enunciate.contract.validation.BaseValidator;
import org.codehaus.enunciate.contract.validation.ValidationResult;
import org.codehaus.enunciate.contract.rest.RESTMethod;
import org.codehaus.enunciate.contract.rest.RESTNoun;

import java.util.List;
import java.util.Map;

/**
 * The default REST validator.
 * 
 * @author Ryan Heaton
 */
public class RESTValidator extends BaseValidator {

  @Override
  public ValidationResult validateRESTAPI(Map<RESTNoun, List<RESTMethod>> restAPI) {
    ValidationResult result = super.validateRESTAPI(restAPI);

    // Can't think of any additional rules beyond what's
    // already in the default deployment module.... 

    return result;
  }
}
