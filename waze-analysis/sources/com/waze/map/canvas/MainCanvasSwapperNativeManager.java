package com.waze.map.canvas;

import java.util.Set;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MainCanvasSwapperNativeManager extends bb {
    public static final int $stable;
    public static final MainCanvasSwapperNativeManager INSTANCE = new MainCanvasSwapperNativeManager();
    private static final kotlinx.coroutines.b.bn<Set<String>> _swapReadyCanvasIds;
    private static final ch<Set<String>> swapReadyCanvasIds;

    static {
        kotlinx.coroutines.b.bn<Set<String>> bnVarB = ck.b(e.c.d.a.p());
        _swapReadyCanvasIds = bnVarB;
        swapReadyCanvasIds = kotlinx.coroutines.b.ai.U(bnVarB);
        $stable = 8;
    }

    private MainCanvasSwapperNativeManager() {
    }

    public final ch<Set<String>> getSwapReadyCanvasIds() {
        return swapReadyCanvasIds;
    }

    public final native void initNativeLayerNTV();

    @Override // com.waze.map.canvas.bb
    public void onMainCanvasRestored(String str) {
        Object objD;
        h.g.b.x.f(str, "canvasId");
        kotlinx.coroutines.b.bn<Set<String>> bnVar = _swapReadyCanvasIds;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, e.c.d.a.u((Set) objD, str)));
    }

    @Override // com.waze.map.canvas.bb
    public void onMainCanvasSwapped(String str) {
        Object objD;
        h.g.b.x.f(str, "canvasId");
        kotlinx.coroutines.b.bn<Set<String>> bnVar = _swapReadyCanvasIds;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, e.c.d.a.w((Set) objD, str)));
    }

    public final native String prepareGenericCanvasForSwappingNTV(int i2, int i3);

    public final native void restoreToMainCanvasNTV(String str);

    public final native boolean startSwappingNTV(String str);
}
