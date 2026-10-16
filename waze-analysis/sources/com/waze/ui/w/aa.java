package com.waze.ui.w;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43524a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f43525b;

    aa(h.g.a.l lVar, int i2) {
        this.f43525b = i2;
        this.f43524a = lVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f43525b;
        if (i2 == 0) {
            this.f43524a.invoke(new com.waze.ui.w.b.i(com.waze.ui.f.t.f42312a));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            this.f43524a.invoke(com.waze.ui.w.b.d.f43692a);
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            this.f43524a.invoke(com.waze.ui.w.b.c.f43691a);
            return h.ab.f48028a;
        }
        this.f43524a.invoke(new com.waze.ui.w.b.e(com.waze.ui.w.b.k.f43701a));
        return h.ab.f48028a;
    }
}
