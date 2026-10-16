package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20980a;

    public av(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f20980a = aVar;
    }

    public final /* synthetic */ com.waze.o.bi a() {
        com.google.v.du duVarBuild = ((com.google.v.dm) this.f20980a).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (com.waze.o.bi) duVarBuild;
    }

    public final void b(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.o.bh) this.f20980a).a(str);
    }

    public final void c(double d2) {
        ((com.waze.o.bh) this.f20980a).b(d2);
    }

    public final void d(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.o.bh) this.f20980a).c(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    public final com.waze.car_lib.l.d e() {
        return new com.waze.car_lib.l.d((com.waze.shared_infra.o.a) this.f20980a);
    }

    public /* synthetic */ av(com.waze.o.bh bhVar) {
        this.f20980a = bhVar;
    }
}
