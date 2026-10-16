package androidx.credentials;

import android.os.Bundle;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class SignalCredentialStateRequest {
    public static final Companion Companion = new Companion(null);
    private static final String SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE = "androidx.credentials.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE";
    private static final String SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE = "androidx.credentials.SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE";
    public static final String SIGNAL_REQUEST_JSON_KEY = "androidx.credentials.signal_request_json_key";
    private static final String SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE = "androidx.credentials.SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE";
    private final String origin;
    private final Bundle requestData;
    private final String requestJson;
    private final String type;

    public SignalCredentialStateRequest(String str, String str2, Bundle bundle, String str3) {
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(str2, "requestJson");
        x.f(bundle, "requestData");
        this.type = str;
        this.requestJson = str2;
        this.requestData = bundle;
        this.origin = str3;
    }

    public static final SignalCredentialStateRequest createFrom(String str, Bundle bundle, String str2) {
        return Companion.createFrom(str, bundle, str2);
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final Bundle getRequestData() {
        return this.requestData;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SignalCredentialStateRequest createFrom(String str, String str2, String str3) {
            x.f(str, "requestType");
            x.f(str2, "requestJson");
            int iHashCode = str.hashCode();
            if (iHashCode != -1620108889) {
                if (iHashCode != 661746467) {
                    if (iHashCode == 847956843 && str.equals("androidx.credentials.SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE")) {
                        return new SignalUnknownCredentialRequest(str2, str3);
                    }
                } else if (str.equals("androidx.credentials.SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE")) {
                    return new SignalCurrentUserDetailsRequest(str2, str3);
                }
            } else if (str.equals("androidx.credentials.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE")) {
                return new SignalAllAcceptedCredentialIdsRequest(str2, str3);
            }
            throw new IllegalArgumentException("Request type is not supported");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final SignalCredentialStateRequest createFrom(String str, Bundle bundle, String str2) {
            x.f(str, "requestType");
            x.f(bundle, "requestData");
            String string = bundle.getString("androidx.credentials.signal_request_json_key");
            if (string != null) {
                return createFrom(str, string, str2);
            }
            throw new IllegalArgumentException("Bundle was missing requestJson");
        }
    }

    public static final SignalCredentialStateRequest createFrom(String str, String str2, String str3) {
        return Companion.createFrom(str, str2, str3);
    }

    public /* synthetic */ SignalCredentialStateRequest(String str, String str2, Bundle bundle, String str3, int i2, o oVar) {
        this(str, str2, bundle, (i2 & 8) != 0 ? null : str3);
    }
}
