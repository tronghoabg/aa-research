package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18121a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f18122b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18123c;

    i(h.g.a.l lVar, bn bnVar, int i2) {
        this.f18123c = i2;
        this.f18121a = lVar;
        this.f18122b = bnVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        if (this.f18123c != 0) {
            this.f18121a.invoke(new as(this.f18122b));
            return h.ab.f48028a;
        }
        this.f18121a.invoke(new ar(this.f18122b));
        return h.ab.f48028a;
    }
}
