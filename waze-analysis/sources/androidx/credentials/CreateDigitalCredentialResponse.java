package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreateDigitalCredentialResponse extends CreateCredentialResponse {
    public static final String BUNDLE_KEY_RESPONSE_JSON = "androidx.credentials.BUNDLE_KEY_RESPONSE_JSON";
    public static final Companion Companion = new Companion(null);
    private final String responseJson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateDigitalCredentialResponse(String str) {
        super(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, Companion.toBundle$credentials(str));
        x.f(str, "responseJson");
        this.responseJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
        }
    }

    public final String getResponseJson() {
        return this.responseJson;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CreateDigitalCredentialResponse createFrom$credentials(Bundle bundle) throws FrameworkClassParsingException {
            x.f(bundle, "data");
            try {
                String string = bundle.getString(CreateDigitalCredentialResponse.BUNDLE_KEY_RESPONSE_JSON);
                x.c(string);
                return new CreateDigitalCredentialResponse(string);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toBundle$credentials(String str) {
            x.f(str, "responseJson");
            Bundle bundle = new Bundle();
            bundle.putString(CreateDigitalCredentialResponse.BUNDLE_KEY_RESPONSE_JSON, str);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
