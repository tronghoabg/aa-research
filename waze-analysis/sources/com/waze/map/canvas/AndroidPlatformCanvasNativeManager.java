package com.waze.map.canvas;

import java.util.Set;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AndroidPlatformCanvasNativeManager extends c implements d {
    public static final a Companion = new a();
    private final kotlinx.coroutines.b.bn<Set<String>> canvases;
    private final com.waze.shared_infra.i.e logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformCanvasNativeManager(com.waze.shared_infra.i.e eVar, com.waze.native_managers.j jVar) {
        super(jVar);
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        this.logger = eVar;
        this.canvases = ck.b(e.c.d.a.p());
    }

    public static final AndroidPlatformCanvasNativeManager getInstance() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = Companion;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(AndroidPlatformCanvasNativeManager.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(AndroidPlatformCanvasNativeManager.class);
        }
        return (AndroidPlatformCanvasNativeManager) bVarC.a(mVar, null, null);
    }

    public final native void initNativeLayerNTV();

    public final void onCanvasCreated$third_party_waze_client_android_project_map_src_main_android_platform_canvas_native_manager(String str) {
        Object objD;
        h.g.b.x.f(str, "canvasId");
        this.logger.a("will add canvas ".concat(String.valueOf(str)));
        kotlinx.coroutines.b.bn<Set<String>> bnVarM28513getCanvases = m28513getCanvases();
        do {
            objD = bnVarM28513getCanvases.d();
        } while (!bnVarM28513getCanvases.f(objD, e.c.d.a.w((Set) objD, str)));
    }

    public final void onCanvasRemoved$third_party_waze_client_android_project_map_src_main_android_platform_canvas_native_manager(String str) {
        Object objD;
        h.g.b.x.f(str, "canvasId");
        this.logger.a("will remove canvas ".concat(String.valueOf(str)));
        kotlinx.coroutines.b.bn<Set<String>> bnVarM28513getCanvases = m28513getCanvases();
        do {
            objD = bnVarM28513getCanvases.d();
        } while (!bnVarM28513getCanvases.f(objD, e.c.d.a.u((Set) objD, str)));
    }

    /* renamed from: getCanvases, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.b.bn<Set<String>> m28513getCanvases() {
        return this.canvases;
    }
}
