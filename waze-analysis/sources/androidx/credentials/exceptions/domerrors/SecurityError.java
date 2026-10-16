package androidx.credentials.exceptions.domerrors;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SecurityError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SECURITY_ERROR = "androidx.credentials.TYPE_SECURITY_ERROR";

    public SecurityError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SECURITY_ERROR);
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
