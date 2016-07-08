/*
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.jsmpp.session.state;

import java.io.IOException;

import org.jsmpp.bean.Command;
import org.jsmpp.extra.SessionState;
import org.jsmpp.session.BaseResponseHandler;
import org.jsmpp.session.ResponseHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is unbound state implementation of {@link SMPPSessionState}. All
 * this method is throw {@link IOException} since when the state is unbound we
 * should not give any positive response.
 * 
 * @author uudashr
 * @version 1.0
 * @since 2.0
 * 
 */
class SMPPSessionUnbound implements SMPPSessionState {
    private static final String INVALID_PROCESS_FOR_UNBOUND_SESSION = "Invalid process for unbound session state";
    private static final Logger logger = LoggerFactory.getLogger(SMPPSessionUnbound.class);
    
    public SessionState getSessionState() {
        return SessionState.UNBOUND;
    }

    public void processBind(Command pduHeader, byte[] pdu,
            ResponseHandler responseHandler) throws IOException
    {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }

    public void processBindResp(Command pduHeader, byte[] pdu,
            ResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }

    public void processDeliverSm(Command pduHeader, byte[] pdu,
            ResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }

    public void processEnquireLink(Command pduHeader, byte[] pdu,
            BaseResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }

    public void processEnquireLinkResp(Command pduHeader, byte[] pdu,
            BaseResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }

    public void processGenericNack(Command pduHeader, byte[] pdu,
            BaseResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }

    public void processSubmitSmResp(Command pduHeader, byte[] pdu,
            ResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }
    
    public void processSubmitMultiResp(Command pduHeader, byte[] pdu,
            ResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }
    
    public void processUnbind(Command pduHeader, byte[] pdu,
            BaseResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }

    public void processUnbindResp(Command pduHeader, byte[] pdu,
            BaseResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }

    public void processUnknownCid(Command pduHeader, byte[] pdu,
            BaseResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }

    public void processQuerySmResp(Command pduHeader, byte[] pdu,
            ResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }
    
    public void processDataSm(Command pduHeader, byte[] pdu,
            BaseResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }
    
    public void processDataSmResp(Command pduHeader, byte[] pdu,
            BaseResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }
    
    public void processCancelSmResp(Command pduHeader, byte[] pdu,
            ResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }
    
    public void processReplaceSmResp(Command pduHeader, byte[] pdu,
            ResponseHandler responseHandler) throws IOException {
        throw new IOException(INVALID_PROCESS_FOR_UNBOUND_SESSION);
    }
    
    public void processAlertNotification(Command pduHeader, byte[] pdu,
            ResponseHandler responseHandler) {
        logger.error("SYSTEM ERROR. Receiving alert_notification while on unbound state");
    }
}
