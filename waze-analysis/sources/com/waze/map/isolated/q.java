package com.waze.map.isolated;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.native_managers.i f29244a;

    public q(com.waze.native_managers.i iVar) {
        h.g.b.x.f(iVar, "taskScheduler");
        this.f29244a = iVar;
    }

    @Override // com.waze.map.isolated.b
    public final /* bridge */ /* synthetic */ c a(String str) {
        h.g.b.x.f(str, "canvasId");
        return new NativeCanvasTouchController(str, this.f29244a);
    }
}
