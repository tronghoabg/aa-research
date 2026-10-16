package com.waze.ui.w;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43538a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f43539b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f43540c;

    ae(h.g.a.l lVar, c cVar, int i2) {
        this.f43540c = i2;
        this.f43538a = lVar;
        this.f43539b = cVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f43540c;
        c cVar = this.f43539b;
        if (i2 != 0) {
            this.f43538a.invoke(new com.waze.ui.w.b.f(com.waze.ui.w.b.b.f43628c, cVar.d()));
            return h.ab.f48028a;
        }
        this.f43538a.invoke(new com.waze.ui.w.b.f(com.waze.ui.w.b.b.f43627b, cVar.d()));
        return h.ab.f48028a;
    }
}
