/*
 * #%L
 * Wildfly Camel :: Example :: Camel CXF
 * %%
 * Copyright (C) 2013 - 2014 RedHat
 * %%
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
 * #L%
 */
package org.wildfly.camel.examples.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebService(serviceName="second", endpointInterface = "org.wildfly.camel.examples.cxf.SecondService")
public class SecondServiceImpl {

    @WebMethod(operationName = "greet")
    public Agency second(@WebParam(name = "message") String message, @WebParam(name = "name") String name) {
        Agency agency = new Agency();

        agency.setAgencyId("1111-111-33333");
        agency.setLocation("Mogliano Veneto");
        agency.setPrincipal("Pippo Pluto");

        return agency;
    }
}
