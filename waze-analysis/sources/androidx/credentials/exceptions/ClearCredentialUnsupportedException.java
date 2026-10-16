package androidx.credentials.exceptions;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ClearCredentialUnsupportedException extends ClearCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION";

    public /* synthetic */ ClearCredentialUnsupportedException(CharSequence charSequence, int i2, o oVar) {
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

    public ClearCredentialUnsupportedException(CharSequence charSequence) {
        super(TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION, charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialUnsupportedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
