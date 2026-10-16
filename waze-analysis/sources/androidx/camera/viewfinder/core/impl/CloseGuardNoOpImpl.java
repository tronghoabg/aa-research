package androidx.camera.viewfinder.core.impl;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CloseGuardNoOpImpl implements CloseGuardImpl {
    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void open(String str) {
        x.f(str, "closeMethodName");
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void close() {
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void warnIfOpen() {
    }
}
