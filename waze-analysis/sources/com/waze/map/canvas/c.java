package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class c {
    private final com.waze.native_managers.j wazeMainLooperDispatcher;

    public c(com.waze.native_managers.j jVar) {
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        this.wazeMainLooperDispatcher = jVar;
    }

    static final void onCanvasCreatedJNI$lambda$0(c cVar, String str) {
        h.g.b.x.d(cVar, "null cannot be cast to non-null type com.waze.map.canvas.AndroidPlatformCanvasNativeManager");
        ((AndroidPlatformCanvasNativeManager) cVar).onCanvasCreated$third_party_waze_client_android_project_map_src_main_android_platform_canvas_native_manager(str);
    }

    static final void onCanvasRemovedJNI$lambda$0(c cVar, String str) {
        h.g.b.x.d(cVar, "null cannot be cast to non-null type com.waze.map.canvas.AndroidPlatformCanvasNativeManager");
        ((AndroidPlatformCanvasNativeManager) cVar).onCanvasRemoved$third_party_waze_client_android_project_map_src_main_android_platform_canvas_native_manager(str);
    }

    public final com.waze.native_managers.j getWazeMainLooperDispatcher() {
        return this.wazeMainLooperDispatcher;
    }

    protected final void onCanvasCreatedJNI(String str) {
        h.g.b.x.f(str, "canvasId");
        this.wazeMainLooperDispatcher.post(new b(this, str, 1));
    }

    protected final void onCanvasRemovedJNI(String str) {
        h.g.b.x.f(str, "canvasId");
        this.wazeMainLooperDispatcher.post(new b(this, str, 0));
    }
}
