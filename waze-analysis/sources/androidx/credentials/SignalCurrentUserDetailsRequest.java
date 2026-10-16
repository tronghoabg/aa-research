package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.ConversionUtilsKt;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SignalCurrentUserDetailsRequest extends SignalCredentialStateRequest {
    private static final String NAME_KEY = "name";
    public static final String SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE = "androidx.credentials.SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE";
    private static final String TAG = "SignalUserDetailsReq";
    public static final Companion Companion = new Companion(null);
    private static final String RP_ID_KEY = "rpId";
    private static final String USER_ID_KEY = "userId";
    private static final String DISPLAY_NAME_KEY = "displayName";
    private static final List<String> REQUIRED_KEYS = i.i(RP_ID_KEY, USER_ID_KEY, "name", DISPLAY_NAME_KEY);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCurrentUserDetailsRequest(String str, Bundle bundle, String str2) {
        super(SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE, str, bundle, str2);
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
                Iterator it = SignalCurrentUserDetailsRequest.REQUIRED_KEYS.iterator();
                while (it.hasNext()) {
                    if (!jSONObject.has((String) it.next())) {
                        return false;
                    }
                }
                String string = jSONObject.getString(SignalCurrentUserDetailsRequest.USER_ID_KEY);
                x.e(string, "getString(...)");
                return ConversionUtilsKt.isValidBase64Url(string);
            } catch (Exception unused) {
                return false;
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalCurrentUserDetailsRequest(String str) {
        this(str, null);
        x.f(str, "requestJson");
    }

    public /* synthetic */ SignalCurrentUserDetailsRequest(String str, Bundle bundle, String str2, int i2, o oVar) {
        this(str, bundle, (i2 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalCurrentUserDetailsRequest(String str, String str2) {
        this(str, SignalAllAcceptedCredentialIdsRequest.Companion.toRequestData(str), str2);
        x.f(str, "requestJson");
    }
}
