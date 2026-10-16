package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BeginCreatePasswordCredentialRequest extends BeginCreateCredentialRequest {
    public static final Companion Companion = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginCreatePasswordCredentialRequest(CallingAppInfo callingAppInfo, Bundle bundle) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, callingAppInfo);
        x.f(bundle, "candidateQueryData");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final BeginCreatePasswordCredentialRequest createFrom$credentials(Bundle bundle, CallingAppInfo callingAppInfo) throws FrameworkClassParsingException {
            x.f(bundle, "data");
            try {
                return new BeginCreatePasswordCredentialRequest(callingAppInfo, bundle);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
