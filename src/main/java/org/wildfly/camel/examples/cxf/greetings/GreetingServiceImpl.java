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
package org.wildfly.camel.examples.cxf.greetings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebService(serviceName="greeting", endpointInterface = "org.wildfly.camel.examples.cxf.greetings.GreetingService")
public class GreetingServiceImpl {

    @WebMethod(operationName = "greet")
    public Subject greet(@WebParam(name = "message") String message, @WebParam(name = "name") String name) {
        Subject sub = new Subject();

        sub.setCodiceSoggetto(name);
        sub.setCodiceFiscale("XXXXXXXXXXXXXXXX");
        try {
            sub.setDataNascita(new SimpleDateFormat("DD/MM/YYYY").parse("19/03/1980"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        sub.setCognomeRagioneSociale(message);
        sub.setDenominazioneComune("MILANO");
        sub.setTipoSoggetto("TIPO");

        return sub;
    }
}
