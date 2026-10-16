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
public final class GetPublicKeyCredentialOption extends CredentialOption {
    public static final String BUNDLE_KEY_CLIENT_DATA_HASH = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final String BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION";
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final String requestJson;

    private GetPublicKeyCredentialOption(String str, byte[] bArr, Set<ComponentName> set, Bundle bundle, Bundle bundle2, int i2) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, bundle2, false, true, set, i2);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final GetPublicKeyCredentialOption createFrom$credentials(Bundle bundle, Set<ComponentName> set, Bundle bundle2) throws FrameworkClassParsingException {
            x.f(bundle, "data");
            x.f(set, "allowedProviders");
            x.f(bundle2, "candidateQueryData");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                x.c(string);
                return new GetPublicKeyCredentialOption(string, byteArray, set, bundle, bundle2, bundle.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 100), null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toRequestDataBundle$credentials(String str, byte[] bArr) {
            x.f(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, GetPublicKeyCredentialOption.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPublicKeyCredentialOption(String str, byte[] bArr) {
        this(str, bArr, null, 4, null);
        x.f(str, "requestJson");
    }

    public /* synthetic */ GetPublicKeyCredentialOption(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i2, o oVar) {
        this(str, bArr, set, bundle, bundle2, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetPublicKeyCredentialOption(String str, byte[] bArr, Set<ComponentName> set) {
        x.f(str, "requestJson");
        x.f(set, "allowedProviders");
        Companion companion = Companion;
        this(str, bArr, set, companion.toRequestDataBundle$credentials(str, bArr), companion.toRequestDataBundle$credentials(str, bArr), 0, 32, null);
    }

    public /* synthetic */ GetPublicKeyCredentialOption(String str, byte[] bArr, Set set, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? null : bArr, (i2 & 4) != 0 ? a.p() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPublicKeyCredentialOption(String str) {
        this(str, null, null, 6, null);
        x.f(str, "requestJson");
    }

    /* synthetic */ GetPublicKeyCredentialOption(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i2, int i3, o oVar) {
        this(str, bArr, set, bundle, bundle2, (i3 & 32) != 0 ? 100 : i2);
    }
}
