package androidx.credentials;

import android.os.Bundle;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GetCredentialResponse {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_CREDENTIAL_DATA = "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA";
    private static final String EXTRA_CREDENTIAL_TYPE = "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE";
    private final Credential credential;

    public GetCredentialResponse(Credential credential) {
        x.f(credential, "credential");
        this.credential = credential;
    }

    public static final Bundle asBundle(GetCredentialResponse getCredentialResponse) {
        return Companion.asBundle(getCredentialResponse);
    }

    public static final GetCredentialResponse fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final Credential getCredential() {
        return this.credential;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Bundle asBundle(GetCredentialResponse getCredentialResponse) {
            x.f(getCredentialResponse, "response");
            Bundle bundle = new Bundle();
            bundle.putString(GetCredentialResponse.EXTRA_CREDENTIAL_TYPE, getCredentialResponse.getCredential().getType());
            bundle.putBundle(GetCredentialResponse.EXTRA_CREDENTIAL_DATA, getCredentialResponse.getCredential().getData());
            return bundle;
        }

        public final GetCredentialResponse fromBundle(Bundle bundle) {
            Bundle bundle2;
            x.f(bundle, "bundle");
            String string = bundle.getString(GetCredentialResponse.EXTRA_CREDENTIAL_TYPE);
            if (string == null || (bundle2 = bundle.getBundle(GetCredentialResponse.EXTRA_CREDENTIAL_DATA)) == null) {
                return null;
            }
            return new GetCredentialResponse(Credential.Companion.createFrom(string, bundle2));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
