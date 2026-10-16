package androidx.camera.camera2.pipe.compat;

import kotlinx.coroutines.h.i;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ConcurrentSessionSequencer {
    private final kotlinx.coroutines.h.a sharedMutex = i.c();

    public final kotlinx.coroutines.h.a getSharedMutex() {
        return this.sharedMutex;
    }
}
