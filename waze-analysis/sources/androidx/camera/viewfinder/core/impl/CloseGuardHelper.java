package androidx.camera.viewfinder.core.impl;

import android.os.Build;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CloseGuardHelper {
    public static final Companion Companion = new Companion(null);
    private final CloseGuardImpl impl;

    private CloseGuardHelper(CloseGuardImpl closeGuardImpl) {
        this.impl = closeGuardImpl;
    }

    public final void close() {
        this.impl.close();
    }

    public final void open(String str) {
        x.f(str, "closeMethodName");
        this.impl.open(str);
    }

    public final void warnIfOpen() {
        this.impl.warnIfOpen();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CloseGuardHelper create() {
            o oVar = null;
            return Build.VERSION.SDK_INT >= 30 ? new CloseGuardHelper(new CloseGuardApi30Impl(), oVar) : new CloseGuardHelper(new CloseGuardNoOpImpl(), oVar);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ CloseGuardHelper(CloseGuardImpl closeGuardImpl, o oVar) {
        this(closeGuardImpl);
    }
}
