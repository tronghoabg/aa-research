package com.waze.closure.domain;

import com.waze.native_managers.WazeNativeLooperDispatcher;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class f {
    private final WazeNativeLooperDispatcher wazeNativeLooperDispatcher;

    public f(WazeNativeLooperDispatcher wazeNativeLooperDispatcher) {
        x.f(wazeNativeLooperDispatcher, "wazeNativeLooperDispatcher");
        this.wazeNativeLooperDispatcher = wazeNativeLooperDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getClosureCandidates$default(f fVar, int i2, l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getClosureCandidates");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        fVar.getClosureCandidates(i2, lVar);
    }

    static final byte[][] getClosureCandidates$lambda$0(f fVar, int i2) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.closure.domain.ClosureNativeManager");
        return ((ClosureNativeManager) fVar).getClosureCandidatesNTV(i2);
    }

    public void getClosureCandidates(int i2, l<? super byte[][], ab> lVar) {
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new e(this, i2, 0), lVar);
    }

    public final WazeNativeLooperDispatcher getWazeNativeLooperDispatcher() {
        return this.wazeNativeLooperDispatcher;
    }

    public final void getClosureCandidates(int i2) {
        getClosureCandidates$default(this, i2, null, 2, null);
    }
}
