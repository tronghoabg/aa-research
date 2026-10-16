package com.waze.car_lib.o;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements com.waze.settings.tree.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.waze.reports_v2.c.r f20460a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20461b;

    public /* synthetic */ b(com.waze.reports_v2.c.r rVar, int i2) {
        this.f20461b = i2;
        this.f20460a = rVar;
    }

    @Override // com.waze.settings.tree.o
    public final com.waze.settings.tree.f a(String str) {
        int i2 = this.f20461b;
        if (i2 == 0) {
            h.g.b.x.f(str, "it");
            return this.f20460a.c(str);
        }
        if (i2 == 1) {
            h.g.b.x.f(str, "it");
            return this.f20460a.c(str);
        }
        if (i2 != 2) {
            h.g.b.x.f(str, "it");
            return this.f20460a.c(str);
        }
        h.g.b.x.f(str, "it");
        return this.f20460a.c(str);
    }
}
