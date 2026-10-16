package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreateDigitalCredentialRequest extends CreateCredentialRequest {
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final Companion Companion = new Companion(null);
    public static final String UNUSED_USER_ID = "unused";
    private final String requestJson;

    private CreateDigitalCredentialRequest(String str, String str2, Bundle bundle, Bundle bundle2) {
        super(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, bundle, bundle2, false, false, Companion.populateUnusedDisplayInfo$credentials(), str2, false);
        this.requestJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CreateDigitalCredentialRequest createFrom$credentials(Bundle bundle, String str, Bundle bundle2) throws FrameworkClassParsingException {
            x.f(bundle, "data");
            x.f(bundle2, "candidateQueryData");
            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
            if (string != null) {
                return new CreateDigitalCredentialRequest(string, str, bundle, bundle2, null);
            }
            throw new FrameworkClassParsingException();
        }

        public final CreateCredentialRequest.DisplayInfo populateUnusedDisplayInfo$credentials() {
            return new CreateCredentialRequest.DisplayInfo(CreateDigitalCredentialRequest.UNUSED_USER_ID, (CharSequence) null, 2, (o) null);
        }

        public final Bundle toBundle$credentials(String str) {
            x.f(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateDigitalCredentialRequest(String str, String str2) {
        this(str, str2, Companion.toBundle$credentials(str), new Bundle());
        x.f(str, "requestJson");
    }

    public /* synthetic */ CreateDigitalCredentialRequest(String str, String str2, Bundle bundle, Bundle bundle2, o oVar) {
        this(str, str2, bundle, bundle2);
    }
}
