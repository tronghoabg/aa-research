package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cp implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18047a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f18048b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18049c;

    cp(h.g.a.l lVar, int i2, int i3) {
        this.f18049c = i3;
        this.f18047a = lVar;
        this.f18048b = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f18049c;
        if (i2 == 0) {
            this.f18047a.invoke(new av(this.f18048b));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            this.f18047a.invoke(new au(this.f18048b));
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            this.f18047a.invoke(new bf(this.f18048b));
            return h.ab.f48028a;
        }
        this.f18047a.invoke(new be(this.f18048b));
        return h.ab.f48028a;
    }
}
