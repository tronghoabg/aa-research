package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class z {

    /* renamed from: a, reason: collision with root package name */
    private static final h.g.a.l f51741a = new kotlinx.coroutines.z(3);

    /* renamed from: b, reason: collision with root package name */
    private static final h.g.a.p f51742b = new com.waze.cf.j(8);

    public static final k a(k kVar) {
        return kVar instanceof ch ? kVar : d(kVar, f51741a, f51742b);
    }

    public static final k b(k kVar, h.g.a.p pVar) {
        h.g.a.l lVar = f51741a;
        h.g.b.x.d(pVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        h.g.b.au.h(pVar, 2);
        return d(kVar, lVar, pVar);
    }

    public static final k c(k kVar, h.g.a.l lVar) {
        return d(kVar, lVar, f51742b);
    }

    private static final k d(k kVar, h.g.a.l lVar, h.g.a.p pVar) {
        if (kVar instanceof i) {
            i iVar = (i) kVar;
            if (iVar.f51686a == lVar && iVar.f51687b == pVar) {
                return kVar;
            }
        }
        return new i(kVar, lVar, pVar);
    }
}
