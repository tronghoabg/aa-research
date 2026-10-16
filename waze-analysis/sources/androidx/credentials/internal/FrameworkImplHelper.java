package androidx.credentials.internal;

import android.credentials.Credential;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import androidx.credentials.Credential;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialResponse;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FrameworkImplHelper {
    public static final Companion Companion = new Companion(null);

    public static final GetCredentialRequest convertGetRequestToFrameworkClass(androidx.credentials.GetCredentialRequest getCredentialRequest) {
        return Companion.convertGetRequestToFrameworkClass(getCredentialRequest);
    }

    public static final GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse getCredentialResponse) {
        return Companion.convertGetResponseToJetpackClass(getCredentialResponse);
    }

    public static final void setOriginForGetRequest(androidx.credentials.GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
        Companion.setOriginForGetRequest(getCredentialRequest, builder);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final GetCredentialRequest convertGetRequestToFrameworkClass(androidx.credentials.GetCredentialRequest getCredentialRequest) {
            x.f(getCredentialRequest, "request");
            GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(androidx.credentials.GetCredentialRequest.Companion.getRequestMetadataBundle(getCredentialRequest));
            for (CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
                builder.addCredentialOption(new CredentialOption.Builder(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.isSystemProviderRequired()).setAllowedProviders(credentialOption.getAllowedProviders()).build());
            }
            setOriginForGetRequest(getCredentialRequest, builder);
            GetCredentialRequest getCredentialRequestBuild = builder.build();
            x.e(getCredentialRequestBuild, "build(...)");
            return getCredentialRequestBuild;
        }

        public final GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse getCredentialResponse) {
            x.f(getCredentialResponse, "response");
            Credential credential = getCredentialResponse.getCredential();
            x.e(credential, "getCredential(...)");
            Credential.Companion companion = androidx.credentials.Credential.Companion;
            String type = credential.getType();
            x.e(type, "getType(...)");
            Bundle data = credential.getData();
            x.e(data, "getData(...)");
            return new GetCredentialResponse(companion.createFrom(type, data));
        }

        public final void setOriginForGetRequest(androidx.credentials.GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
            x.f(getCredentialRequest, "request");
            x.f(builder, "builder");
            if (getCredentialRequest.getOrigin() != null) {
                builder.setOrigin(getCredentialRequest.getOrigin());
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
