package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.internal.RequestValidationHelper;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreateRestoreCredentialResponse extends CreateCredentialResponse {
    public static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE";
    public static final Companion Companion = new Companion(null);
    private final String responseJson;

    private CreateRestoreCredentialResponse(String str, Bundle bundle) {
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, bundle);
        this.responseJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    public static final CreateRestoreCredentialResponse createFrom(Bundle bundle) {
        return Companion.createFrom(bundle);
    }

    public final String getResponseJson() {
        return this.responseJson;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CreateRestoreCredentialResponse createFrom(Bundle bundle) throws CreateCredentialUnknownException {
            x.f(bundle, "data");
            String string = bundle.getString(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE);
            if (string != null) {
                return new CreateRestoreCredentialResponse(string, bundle, null);
            }
            throw new CreateCredentialUnknownException("The response bundle did not contain the response data. This should not happen.");
        }

        public final Bundle toBundle$credentials(String str) {
            x.f(str, "responseJson");
            Bundle bundle = new Bundle();
            bundle.putString(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE, str);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialResponse(String str) {
        this(str, Companion.toBundle$credentials(str));
        x.f(str, "responseJson");
    }

    public /* synthetic */ CreateRestoreCredentialResponse(String str, Bundle bundle, o oVar) {
        this(str, bundle);
    }
}
