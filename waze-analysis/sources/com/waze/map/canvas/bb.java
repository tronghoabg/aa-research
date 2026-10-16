package com.waze.map.canvas;

import com.waze.NativeManager;
import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class bb {
    public static final int $stable = 0;

    static final void onMainCanvasRestoredJNI$lambda$0(bb bbVar, String str) {
        h.g.b.x.d(bbVar, "null cannot be cast to non-null type com.waze.map.canvas.MainCanvasSwapperNativeManager");
        ((MainCanvasSwapperNativeManager) bbVar).onMainCanvasRestored(str);
    }

    static final void onMainCanvasSwappedJNI$lambda$0(bb bbVar, String str) {
        h.g.b.x.d(bbVar, "null cannot be cast to non-null type com.waze.map.canvas.MainCanvasSwapperNativeManager");
        ((MainCanvasSwapperNativeManager) bbVar).onMainCanvasSwapped(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void prepareGenericCanvasForSwapping$default(bb bbVar, int i2, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareGenericCanvasForSwapping");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        bbVar.prepareGenericCanvasForSwapping(i2, i3, lVar);
    }

    static final String prepareGenericCanvasForSwapping$lambda$0(bb bbVar, int i2, int i3) {
        h.g.b.x.d(bbVar, "null cannot be cast to non-null type com.waze.map.canvas.MainCanvasSwapperNativeManager");
        return ((MainCanvasSwapperNativeManager) bbVar).prepareGenericCanvasForSwappingNTV(i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void restoreToMainCanvas$default(bb bbVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: restoreToMainCanvas");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        bbVar.restoreToMainCanvas(str, lVar);
    }

    static final h.ab restoreToMainCanvas$lambda$0(bb bbVar, String str) {
        h.g.b.x.d(bbVar, "null cannot be cast to non-null type com.waze.map.canvas.MainCanvasSwapperNativeManager");
        ((MainCanvasSwapperNativeManager) bbVar).restoreToMainCanvasNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSwapping$default(bb bbVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSwapping");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        bbVar.startSwapping(str, lVar);
    }

    static final Boolean startSwapping$lambda$0(bb bbVar, String str) {
        h.g.b.x.d(bbVar, "null cannot be cast to non-null type com.waze.map.canvas.MainCanvasSwapperNativeManager");
        return Boolean.valueOf(((MainCanvasSwapperNativeManager) bbVar).startSwappingNTV(str));
    }

    public abstract void onMainCanvasRestored(String str);

    protected final void onMainCanvasRestoredJNI(String str) {
        h.g.b.x.f(str, "canvasId");
        NativeManager.runMainThreadTask(new b(this, str, 5));
    }

    public abstract void onMainCanvasSwapped(String str);

    protected final void onMainCanvasSwappedJNI(String str) {
        h.g.b.x.f(str, "canvasId");
        NativeManager.runMainThreadTask(new b(this, str, 6));
    }

    public void prepareGenericCanvasForSwapping(final int i2, final int i3, h.g.a.l<? super String, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.map.canvas.ay
            @Override // com.waze.hw
            public final Object a() {
                return bb.prepareGenericCanvasForSwapping$lambda$0(this.f28569a, i2, i3);
            }
        }, lVar != null ? new az(lVar, 1) : null);
    }

    public void restoreToMainCanvas(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        NativeManager.runNativeTask(new ba(this, str, 1), lVar != null ? new az(lVar, 0) : null);
    }

    public void startSwapping(String str, h.g.a.l<? super Boolean, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        NativeManager.runNativeTask(new ba(this, str, 0), lVar != null ? new az(lVar, 2) : null);
    }

    public final void prepareGenericCanvasForSwapping(int i2, int i3) {
        prepareGenericCanvasForSwapping$default(this, i2, i3, null, 4, null);
    }

    public final void restoreToMainCanvas(String str) {
        h.g.b.x.f(str, "canvasId");
        restoreToMainCanvas$default(this, str, null, 2, null);
    }

    public final void startSwapping(String str) {
        h.g.b.x.f(str, "canvasId");
        startSwapping$default(this, str, null, 2, null);
    }
}
