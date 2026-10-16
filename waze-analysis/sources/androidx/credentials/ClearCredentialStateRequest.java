package androidx.credentials;

import android.os.Bundle;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ClearCredentialStateRequest {
    private static final String BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST";
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CLEAR_CREDENTIAL_STATE = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";
    public static final String TYPE_CLEAR_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL";
    private final Bundle requestBundle;
    private final String requestType;

    public ClearCredentialStateRequest(String str) {
        x.f(str, "requestType");
        this.requestType = str;
        Bundle bundle = new Bundle();
        this.requestBundle = bundle;
        if (x.n(str, TYPE_CLEAR_CREDENTIAL_STATE) || x.n(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            if (x.n(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
                bundle.putBoolean(BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST, true);
            }
        } else {
            throw new IllegalArgumentException("The request type " + str + " is not supported.");
        }
    }

    public final Bundle getRequestBundle() {
        return this.requestBundle;
    }

    public final String getRequestType() {
        return this.requestType;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialStateRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ClearCredentialStateRequest(String str, int i2, o oVar) {
        this(1 == (i2 & 1) ? TYPE_CLEAR_CREDENTIAL_STATE : str);
    }
}
