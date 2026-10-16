package androidx.camera.viewfinder.core.impl;

import android.util.CloseGuard;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CloseGuardApi30Impl implements CloseGuardImpl {
    private final CloseGuard platformImpl = new CloseGuard();

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void close() {
        this.platformImpl.close();
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void open(String str) {
        x.f(str, "closeMethodName");
        this.platformImpl.open(str);
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void warnIfOpen() {
        this.platformImpl.warnIfOpen();
    }
}
