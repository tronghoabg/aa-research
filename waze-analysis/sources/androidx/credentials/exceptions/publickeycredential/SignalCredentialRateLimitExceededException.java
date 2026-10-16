package androidx.credentials.exceptions.publickeycredential;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SignalCredentialRateLimitExceededException extends SignalCredentialStateException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_SIGNAL_CREDENTIAL_STATE_RATE_LIMIT_EXCEEDED_EXCEPTION = "androidx.credentials.SignalCredentialStateException.RATE_LIMIT_EXCEEDED";
    private final long retryMillis;

    public SignalCredentialRateLimitExceededException(long j2) {
        this(j2, null, 2, null);
    }

    public final long getRetryMillis() {
        return this.retryMillis;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public SignalCredentialRateLimitExceededException(long j2, CharSequence charSequence) {
        super(TYPE_SIGNAL_CREDENTIAL_STATE_RATE_LIMIT_EXCEEDED_EXCEPTION, charSequence);
        this.retryMillis = j2;
    }

    public /* synthetic */ SignalCredentialRateLimitExceededException(long j2, CharSequence charSequence, int i2, o oVar) {
        this(j2, (i2 & 2) != 0 ? null : charSequence);
    }
}
