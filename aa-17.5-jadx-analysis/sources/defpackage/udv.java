package defpackage;

/* loaded from: classes3.dex */
public final class udv {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/PlacementPassTracker");
    public aehj b = new aehf(null);
    public aens c = new aenq(null);
    public aesy d = new aesu(null);
    public aehj e = new aehf(null);
    public aens f = new aenq(null);
    public aesy g = new aesu(null);
    public final aexc h = new aexc(null);

    public static xxh a(int i, long j, String str, aehj aehjVar, aens aensVar, aesy aesyVar) {
        udo udoVar;
        udo udoVar2 = (udo) aehjVar.p(i);
        if (udoVar2 != null) {
            return xxh.h(udoVar2);
        }
        if (j != 0) {
            udo udoVar3 = (udo) aensVar.p(j);
            if (udoVar3 != null) {
                return xxh.h(udoVar3);
            }
        } else if (!str.isEmpty() && (udoVar = (udo) aesyVar.get(str)) != null) {
            return xxh.h(udoVar);
        }
        return xvy.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, ubf] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, ubf] */
    final void b() {
        aetu it = ((aehf) this.b).l().iterator();
        while (it.hasNext()) {
            aehh aehhVar = (aehh) it.next();
            if (!this.e.c(aehhVar.a())) {
                ((udo) aehhVar.getValue()).c.b().x(2);
            }
        }
        this.b.clear();
        this.c.clear();
        this.d.clear();
        aetu it2 = ((aehf) this.e).l().iterator();
        while (it2.hasNext()) {
            ((udo) ((aehh) it2.next()).getValue()).c.b().x(2);
        }
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
    }
}
