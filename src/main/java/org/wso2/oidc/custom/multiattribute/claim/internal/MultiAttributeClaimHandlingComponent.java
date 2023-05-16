package org.wso2.oidc.custom.multiattribute.claim.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.user.core.service.RealmService;

public class MultiAttributeClaimHandlingComponent {

    private static Log log = LogFactory.getLog(MultiAttributeClaimHandlingComponent.class);
    private static RealmService realmService;

    protected void activate(ComponentContext ctxt) {

        try {
            log.info("Carbon OIDC Multi attribute Custom Claim Handler activated successfully.");
        } catch (Exception e) {
            log.error("Failed to activate Carbon OIDC Multi attribute Custom Claim Handler ", e);
        }
    }

    protected void deactivate(ComponentContext ctxt) {

        if (log.isDebugEnabled()) {
            log.debug("Carbon OIDC Multi attribute Custom Claim Handler is deactivated ");
        }
    }

    protected void setRealmService(RealmService realmService) {

        MultiAttributeClaimHandlingComponent.realmService = realmService;
        if (log.isDebugEnabled()) {
            log.debug("RealmService is set in the Carbon OIDC Multi attribute Custom Claim Handler bundle");
        }
    }

    protected void unsetRealmService(RealmService realmService) {

        MultiAttributeClaimHandlingComponent.realmService = null;
        if (log.isDebugEnabled()) {
            log.debug("RealmService is unset in the Carbon OIDC Multi attribute Custom Claim Handler bundle");
        }
    }

    public static RealmService getRealmService() {

        return MultiAttributeClaimHandlingComponent.realmService;
    }

}
