package androidx.credentials;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import com.waze.strings.DisplayStrings;
import h.g.b.o;
import h.g.b.x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreatePublicKeyCredentialRequest extends CreateCredentialRequest {
    public static final String BUNDLE_KEY_CLIENT_DATA_HASH = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";
    public static final String BUNDLE_KEY_CONDITIONAL_CREATE = "androidx.credentials.BUNDLE_KEY_IS_CONDITIONAL_REQUEST";
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final String BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST";
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final boolean isConditional;
    private final String requestJson;

    /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z3, int i2, o oVar) {
        this(str, bArr, z, z2, displayInfo, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? Companion.toCredentialDataBundle$credentials(str, bArr) : bundle, (i2 & 128) != 0 ? Companion.toCandidateDataBundle$credentials(str, bArr) : bundle2, ((i2 & 256) == 0) & z3);
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public final boolean isConditional() {
        return this.isConditional;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials$default(Companion companion, String str, String str2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            return companion.getRequestDisplayInfo$credentials(str, str2);
        }

        public static /* synthetic */ Bundle toCredentialDataBundle$credentials$default(Companion companion, String str, byte[] bArr, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                bArr = null;
            }
            return companion.toCredentialDataBundle$credentials(str, bArr);
        }

        public final CreatePublicKeyCredentialRequest createFrom$credentials(Bundle bundle, String str, Bundle bundle2) throws FrameworkClassParsingException {
            CreateCredentialRequest.DisplayInfo requestDisplayInfo$credentials$default;
            x.f(bundle, "data");
            x.f(bundle2, "candidateQueryData");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                x.c(string);
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                boolean z = bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                try {
                    requestDisplayInfo$credentials$default = CreateCredentialRequest.DisplayInfo.Companion.createFrom(bundle);
                } catch (IllegalArgumentException unused) {
                    requestDisplayInfo$credentials$default = getRequestDisplayInfo$credentials$default(this, string, null, 2, null);
                }
                return new CreatePublicKeyCredentialRequest(string, byteArray, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), z, requestDisplayInfo$credentials$default, str, bundle, bundle2, bundle.getBoolean(CreatePublicKeyCredentialRequest.BUNDLE_KEY_CONDITIONAL_CREATE), null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        public final CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials(String str, String str2) throws JSONException {
            x.f(str, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("user");
                String string = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                x.c(string);
                return new CreateCredentialRequest.DisplayInfo(string, string2, (Icon) null, str2);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        public final Bundle toCandidateDataBundle$credentials(String str, byte[] bArr) {
            x.f(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        public final Bundle toCredentialDataBundle$credentials(String str, byte[] bArr) {
            x.f(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr) {
        this(str, bArr, false, null, false, false, 60, null);
        x.f(str, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z) {
        this(str, bArr, z, null, false, false, 56, null);
        x.f(str, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2) {
        this(str, bArr, z, str2, false, false, 48, null);
        x.f(str, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, boolean z2) {
        this(str, bArr, z, str2, z2, false, 32, null);
        x.f(str, "requestJson");
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z3, o oVar) {
        this(str, bArr, z, z2, displayInfo, str2, bundle, bundle2, z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, String str3, boolean z2) {
        this(str, bArr, z2, z, Companion.getRequestDisplayInfo$credentials(str, str3), str2, null, null, false, DisplayStrings.DS_ACCIDENT, null);
        x.f(str, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, boolean z2, boolean z3) {
        this(str, bArr, z2, z, Companion.getRequestDisplayInfo$credentials$default(Companion, str, null, 2, null), str2, null, null, z3, 192, null);
        x.f(str, "requestJson");
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, boolean z2, boolean z3, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? null : bArr, z & ((i2 & 4) == 0), (i2 & 8) != 0 ? null : str2, z2 & ((i2 & 16) == 0), z3 & ((i2 & 32) == 0));
    }

    private CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z3) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, bundle2, false, z, displayInfo, str2, z2);
        this.requestJson = str;
        this.clientDataHash = bArr;
        this.isConditional = z3;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
        if (z3) {
            bundle2.putBoolean(BUNDLE_KEY_CONDITIONAL_CREATE, true);
            bundle.putBoolean(BUNDLE_KEY_CONDITIONAL_CREATE, true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str) {
        this(str, null, false, null, false, false, 62, null);
        x.f(str, "requestJson");
    }
}
