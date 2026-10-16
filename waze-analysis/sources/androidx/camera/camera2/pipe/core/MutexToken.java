package androidx.camera.camera2.pipe.core;

import h.e.b;
import h.g.b.x;
import kotlinx.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MutexToken implements Token {
    private final a _released;
    private final kotlinx.coroutines.h.a mutex;

    public MutexToken(kotlinx.coroutines.h.a aVar) {
        x.f(aVar, "mutex");
        this.mutex = aVar;
        this._released = b.e(false);
    }

    @Override // androidx.camera.camera2.pipe.core.Token
    public boolean getReleased() {
        return this._released.c();
    }

    @Override // androidx.camera.camera2.pipe.core.Token
    public boolean release() {
        if (!this._released.b(false, true)) {
            return false;
        }
        this.mutex.unlock(null);
        return true;
    }
}
