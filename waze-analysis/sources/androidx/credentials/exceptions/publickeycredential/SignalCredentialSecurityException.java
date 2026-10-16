package androidx.credentials.exceptions.publickeycredential;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SignalCredentialSecurityException extends SignalCredentialStateException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_SIGNAL_CREDENTIAL_STATE_SECURITY_EXCEPTION = "androidx.credentials.SignalCredentialStateException.TYPE_SECURITY";

    public /* synthetic */ SignalCredentialSecurityException(CharSequence charSequence, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : charSequence);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public SignalCredentialSecurityException(CharSequence charSequence) {
        super(TYPE_SIGNAL_CREDENTIAL_STATE_SECURITY_EXCEPTION, charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignalCredentialSecurityException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
