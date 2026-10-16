package androidx.credentials.exceptions;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreateCredentialCancellationException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_CREDENTIAL_CANCELLATION_EXCEPTION = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED";

    public /* synthetic */ CreateCredentialCancellationException(CharSequence charSequence, int i2, o oVar) {
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

    public CreateCredentialCancellationException(CharSequence charSequence) {
        super(TYPE_CREATE_CREDENTIAL_CANCELLATION_EXCEPTION, charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCredentialCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
