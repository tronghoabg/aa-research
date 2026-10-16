package com.waze.map.canvas;

import androidx.core.app.NotificationCompat;
import com.waze.jni.protos.map.MapOrientationModeChanged;
import com.waze.jni.protos.map.canvas.MainCanvasStateChanged;
import java.util.Map;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CanvasNativeCallbacksBridge extends p {
    public static final int $stable;
    public static final CanvasNativeCallbacksBridge INSTANCE = new CanvasNativeCallbacksBridge();
    private static final kotlinx.coroutines.b.bm<String> _mainCanvasFallthroughClickEvents;
    private static final kotlinx.coroutines.b.bn<Map<String, n>> _mainCanvasStateMapping;
    private static final kotlinx.coroutines.b.k<String> mainCanvasFallthroughClickEvents;
    private static final ch<Map<String, n>> mainCanvasStateMapping;

    static {
        kotlinx.coroutines.b.bn<Map<String, n>> bnVarB = ck.b(h.a.r.j());
        _mainCanvasStateMapping = bnVarB;
        mainCanvasStateMapping = kotlinx.coroutines.b.ai.U(bnVarB);
        kotlinx.coroutines.b.bm<String> bmVarE = bu.e(0, 16, kotlinx.coroutines.a.a.f51272b, 1);
        _mainCanvasFallthroughClickEvents = bmVarE;
        mainCanvasFallthroughClickEvents = bmVarE;
        $stable = 8;
    }

    private CanvasNativeCallbacksBridge() {
    }

    public final kotlinx.coroutines.b.k<String> getMainCanvasFallthroughClickEvents() {
        return mainCanvasFallthroughClickEvents;
    }

    public final ch<Map<String, n>> getMainCanvasStateMapping() {
        return mainCanvasStateMapping;
    }

    public final native void initNativeLayerNTV();

    @Override // com.waze.map.canvas.p
    public void onCanvasRemoved(String str) {
        Object objD;
        h.g.b.x.f(str, "canvasId");
        kotlinx.coroutines.b.bn<Map<String, n>> bnVar = _mainCanvasStateMapping;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.r.l((Map) objD, str)));
    }

    @Override // com.waze.map.canvas.p
    public void onMainCanvasFallthroughClickEvent(String str) {
        h.g.b.x.f(str, "canvasId");
        com.waze.shared_infra.i.h.a("onMainCanvasFallthroughClickEvent(canvasId:" + str + ")");
        _mainCanvasFallthroughClickEvents.c(str);
    }

    @Override // com.waze.map.canvas.p
    public void onMainCanvasOrientationChanged(String str, float f2) {
        Object objD;
        h.g.b.x.f(str, "canvasId");
        com.waze.shared_infra.i.h.a("onMainCanvasOrientationChanged(canvasId:" + str + ", orientationDegrees:" + f2 + ")");
        kotlinx.coroutines.b.bn<Map<String, n>> bnVar = _mainCanvasStateMapping;
        n nVar = (n) ((Map) bnVar.d()).get(str);
        if (nVar == null) {
            nVar = new n(null);
        }
        n nVarD = n.d(nVar, null, Float.valueOf(f2), null, 5);
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.r.p((Map) objD, new h.k(str, nVarD))));
    }

    @Override // com.waze.map.canvas.p
    public void onMainCanvasOrientationModeChanged(String str, MapOrientationModeChanged mapOrientationModeChanged) {
        Object objD;
        h.g.b.x.f(str, "canvasId");
        h.g.b.x.f(mapOrientationModeChanged, NotificationCompat.CATEGORY_EVENT);
        com.waze.shared_infra.i.h.a("onMainCanvasOrientationModeChanged(canvasId:" + str + ", mode:" + mapOrientationModeChanged.getOrientationMode() + ")");
        kotlinx.coroutines.b.bn<Map<String, n>> bnVar = _mainCanvasStateMapping;
        n nVar = (n) ((Map) bnVar.d()).get(str);
        if (nVar == null) {
            nVar = new n(null);
        }
        n nVarD = n.d(nVar, null, null, mapOrientationModeChanged.getOrientationMode(), 3);
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.r.p((Map) objD, new h.k(str, nVarD))));
    }

    @Override // com.waze.map.canvas.p
    public void onMainCanvasStateChanged(MainCanvasStateChanged mainCanvasStateChanged) {
        Object objD;
        h.g.b.x.f(mainCanvasStateChanged, "details");
        com.waze.shared_infra.i.h.a("onMainCanvasStateChanged(details:" + mainCanvasStateChanged + ")");
        kotlinx.coroutines.b.bn<Map<String, n>> bnVar = _mainCanvasStateMapping;
        n nVar = (n) ((Map) bnVar.d()).get(mainCanvasStateChanged.getCanvasId());
        if (nVar == null) {
            nVar = new n(null);
        }
        n nVarD = n.d(nVar, mainCanvasStateChanged.getCameraState(), null, null, 6);
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.r.p((Map) objD, new h.k(mainCanvasStateChanged.getCanvasId(), nVarD))));
    }
}
