package androidx.credentials;

import android.os.Bundle;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreatePasswordResponse extends CreateCredentialResponse {
    public static final Companion Companion = new Companion(null);

    public CreatePasswordResponse() {
        this(new Bundle());
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CreatePasswordResponse createFrom$credentials(Bundle bundle) {
            x.f(bundle, "data");
            return new CreatePasswordResponse(bundle, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ CreatePasswordResponse(Bundle bundle, o oVar) {
        this(bundle);
    }

    private CreatePasswordResponse(Bundle bundle) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle);
    }
}
