package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.RequestValidationHelper;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GetRestoreCredentialOption extends CredentialOption {
    private static final String BUNDLE_KEY_GET_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_REQUEST";
    private static final Companion Companion = new Companion(null);
    private final String requestJson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRestoreCredentialOption(String str) {
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, Companion.toRequestDataBundle(str), new Bundle(), false, false, a.p(), 2000);
        x.f(str, "requestJson");
        this.requestJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle toRequestDataBundle(String str) {
            Bundle bundle = new Bundle();
            bundle.putString(GetRestoreCredentialOption.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_REQUEST, str);
            return bundle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
