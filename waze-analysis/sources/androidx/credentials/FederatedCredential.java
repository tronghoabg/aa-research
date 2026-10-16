package androidx.credentials;

import android.os.Bundle;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FederatedCredential extends Credential {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_FEDERATED_CREDENTIAL = "type.federated_credential";

    private FederatedCredential() {
        super(TYPE_FEDERATED_CREDENTIAL, new Bundle());
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
