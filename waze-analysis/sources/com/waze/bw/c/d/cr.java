package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cr implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18055a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f18056b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18057c;

    cr(h.g.a.l lVar, int i2, int i3) {
        this.f18057c = i3;
        this.f18055a = lVar;
        this.f18056b = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f18057c != 0) {
            h.g.b.x.f((com.waze.z.a.ad) obj, "it");
            this.f18055a.invoke(new aw(this.f18056b));
            return h.ab.f48028a;
        }
        h.g.b.x.f((com.waze.z.a.ad) obj, "it");
        this.f18055a.invoke(new bg(this.f18056b));
        return h.ab.f48028a;
    }
}
