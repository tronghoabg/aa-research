package androidx.credentials;

import android.os.Bundle;
import android.util.Log;
import androidx.credentials.internal.ConversionUtilsKt;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SignalAllAcceptedCredentialIdsRequest extends SignalCredentialStateRequest {
    public static final String SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE = "androidx.credentials.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE";
    private static final String TAG = "SignalAcceptedIdsReq";
    public static final Companion Companion = new Companion(null);
    private static final String RP_ID_KEY = "rpId";
    private static final String USER_ID_KEY = "userId";
    private static final String ACCEPTED_CREDENTIAL_IDS_KEY = "allAcceptedCredentialIds";
    private static final List<String> REQUIRED_KEYS = i.i(RP_ID_KEY, USER_ID_KEY, ACCEPTED_CREDENTIAL_IDS_KEY);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalAllAcceptedCredentialIdsRequest(String str, Bundle bundle, String str2) {
        super(SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE, str, bundle, str2);
        x.f(str, "requestJson");
        x.f(bundle, "requestData");
        if (Companion.isValidRequestJson(str)) {
            return;
        }
        throw new IllegalArgumentException("Structural/type validation failed for JSON: '" + str + "'");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isValidRequestJson(String str) throws JSONException {
            x.f(str, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(str);
                for (String str2 : SignalAllAcceptedCredentialIdsRequest.REQUIRED_KEYS) {
                    if (!jSONObject.has(str2)) {
                        Log.e(SignalAllAcceptedCredentialIdsRequest.TAG, "Request json is missing required key " + str2);
                        return false;
                    }
                }
                String string = jSONObject.getString(SignalAllAcceptedCredentialIdsRequest.USER_ID_KEY);
                x.e(string, "getString(...)");
                if (!ConversionUtilsKt.isValidBase64Url(string)) {
                    return false;
                }
                JSONArray jSONArray = jSONObject.getJSONArray(SignalAllAcceptedCredentialIdsRequest.ACCEPTED_CREDENTIAL_IDS_KEY);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = jSONArray.get(i2);
                    if (!(obj instanceof String) || !ConversionUtilsKt.isValidBase64Url((String) obj)) {
                        return false;
                    }
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public final Bundle toRequestData(String str) {
            x.f(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.signal_request_json_key", str);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalAllAcceptedCredentialIdsRequest(String str) {
        this(str, null);
        x.f(str, "requestJson");
    }

    public /* synthetic */ SignalAllAcceptedCredentialIdsRequest(String str, Bundle bundle, String str2, int i2, o oVar) {
        this(str, bundle, (i2 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalAllAcceptedCredentialIdsRequest(String str, String str2) {
        this(str, Companion.toRequestData(str), str2);
        x.f(str, "requestJson");
    }
}
