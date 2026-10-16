package androidx.credentials.exceptions;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ClearCredentialUnknownException extends ClearCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CLEAR_CREDENTIAL_UNKNOWN_EXCEPTION = "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN";

    public /* synthetic */ ClearCredentialUnknownException(CharSequence charSequence, int i2, o oVar) {
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

    public ClearCredentialUnknownException(CharSequence charSequence) {
        super(TYPE_CLEAR_CREDENTIAL_UNKNOWN_EXCEPTION, charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialUnknownException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
