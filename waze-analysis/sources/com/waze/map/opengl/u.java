package com.waze.map.opengl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class u implements com.waze.shared_infra.s.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f29563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29564b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29565c;

    public /* synthetic */ u(Object obj, Object obj2, int i2) {
        this.f29565c = i2;
        this.f29563a = obj;
        this.f29564b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object, java.lang.Runnable] */
    @Override // com.waze.shared_infra.s.d
    public final void a() {
        int i2 = this.f29565c;
        if (i2 == 0) {
            WazeMapRenderer.k((WazeMapRenderer) this.f29563a, this.f29564b);
        } else {
            if (i2 == 1) {
                WazeMapRenderer.j((WazeMapRenderer) this.f29563a, this.f29564b);
                return;
            }
            ?? r1 = this.f29564b;
            if (i2 != 2) {
                WazeRenderer.r((WazeRenderer) this.f29563a, r1);
            } else {
                WazeRenderer.s((WazeRenderer) this.f29563a, r1);
            }
        }
    }
}
