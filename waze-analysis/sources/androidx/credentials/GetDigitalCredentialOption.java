package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GetDigitalCredentialOption extends CredentialOption {
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final Companion Companion = new Companion(null);
    private final String requestJson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDigitalCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i2) {
        super(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, bundle, bundle2, z, z2, set, i2);
        x.f(str, "requestJson");
        x.f(bundle, "requestData");
        x.f(bundle2, "candidateQueryData");
        x.f(set, "allowedProviders");
        this.requestJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
        }
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final GetDigitalCredentialOption createFrom$credentials(Bundle bundle, Bundle bundle2, boolean z, Set<ComponentName> set) throws FrameworkClassParsingException {
            x.f(bundle, "requestData");
            x.f(bundle2, "candidateQueryData");
            x.f(set, "allowedProviders");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                x.c(string);
                return new GetDigitalCredentialOption(string, bundle, bundle2, z, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), set, bundle.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 100));
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
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
    public GetDigitalCredentialOption(String str) {
        this(str, Companion.toBundle$credentials(str), new Bundle(), false, false, a.p(), 100);
        x.f(str, "requestJson");
    }
}
