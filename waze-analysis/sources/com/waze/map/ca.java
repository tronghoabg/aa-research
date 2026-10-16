package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ca implements com.waze.shared_infra.s.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28475b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28476c;

    public /* synthetic */ ca(Object obj, Object obj2, int i2) {
        this.f28476c = i2;
        this.f28474a = obj;
        this.f28475b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.waze.map.canvas.a.c, java.lang.Object] */
    @Override // com.waze.shared_infra.s.d
    public final void a() {
        int i2 = this.f28476c;
        if (i2 == 0) {
            ((MapPositionTrackerNativeManager) this.f28474a).positionUpdatedCallbacks.remove((Object) this.f28475b);
            return;
        }
        ?? r1 = this.f28475b;
        if (i2 != 1) {
            ((WazeMapNativeManager) this.f28474a).jniAdapters.remove((Object) r1);
        } else {
            ((GenericCanvasNativeManager) this.f28474a).jniAdapters.remove((Object) r1);
        }
    }
}
