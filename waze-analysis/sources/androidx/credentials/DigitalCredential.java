package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import h.g.b.o;
import h.g.b.x;
import h.n.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DigitalCredential extends Credential {
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final Companion Companion = new Companion(null);
    private static final int STRING_LEN_THRESHOLD = 250000;
    public static final String TYPE_DIGITAL_CREDENTIAL = "androidx.credentials.TYPE_DIGITAL_CREDENTIAL";
    private final String credentialJson;

    private DigitalCredential(String str, Bundle bundle) {
        super(TYPE_DIGITAL_CREDENTIAL, bundle);
        this.credentialJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
        }
    }

    public final String getCredentialJson() {
        return this.credentialJson;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final DigitalCredential createFrom$credentials(Bundle bundle) throws FrameworkClassParsingException {
            x.f(bundle, "data");
            try {
                Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                x.c(obj);
                o oVar = null;
                return obj instanceof byte[] ? new DigitalCredential(new String((byte[]) obj, a.f48221b), bundle, oVar) : new DigitalCredential((String) obj, bundle, oVar);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toBundle$credentials(String str) {
            x.f(str, "responseJson");
            Bundle bundle = new Bundle();
            if (str.length() < DigitalCredential.STRING_LEN_THRESHOLD) {
                bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
                return bundle;
            }
            byte[] bytes = str.getBytes(a.f48221b);
            x.e(bytes, "getBytes(...)");
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", bytes);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DigitalCredential(String str) {
        this(str, Companion.toBundle$credentials(str));
        x.f(str, "credentialJson");
    }

    public /* synthetic */ DigitalCredential(String str, Bundle bundle, o oVar) {
        this(str, bundle);
    }
}
