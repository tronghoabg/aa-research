package androidx.credentials.exceptions.domerrors;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class QuotaExceededError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_QUOTA_EXCEEDED_ERROR = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR";

    public QuotaExceededError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_QUOTA_EXCEEDED_ERROR);
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
