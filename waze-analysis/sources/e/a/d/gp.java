package e.a.d;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gp implements e.a.cs {

    /* renamed from: a, reason: collision with root package name */
    private final List f47054a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.cr f47055b;

    gp(List list, e.a.cr crVar) {
        this.f47054a = com.google.d.d.bn.n(list);
        this.f47055b = crVar;
    }

    @Override // e.a.cs
    public final void a(e.a.dm dmVar, List list, List list2) {
        e.a.dt.d(dmVar, list, list2);
        for (e.a.ct ctVar : this.f47054a) {
            if (ctVar.a() <= dmVar.a()) {
                this.f47055b.c();
                ctVar.d();
            }
            ctVar.b();
        }
    }

    @Override // e.a.cs
    public final void b(e.a.dm dmVar, List list, List list2) {
        e.a.dt.e(dmVar, list, list2);
        for (e.a.ct ctVar : this.f47054a) {
            if (ctVar.a() <= dmVar.a()) {
                this.f47055b.c();
                ctVar.d();
            }
            ctVar.c();
        }
    }
}
