package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final am[] f51850a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.b f51851b;

    public e(am[] amVarArr) {
        this.f51850a = amVarArr;
        this.f51851b = h.e.b.f(amVarArr.length);
    }

    public final Object a(h.c.e eVar) {
        l lVar = new l(h.c.a.h.d(eVar), 1);
        lVar.u();
        l lVar2 = lVar;
        am[] amVarArr = this.f51850a;
        int length = amVarArr.length;
        c[] cVarArr = new c[length];
        for (int i2 = 0; i2 < length; i2++) {
            am amVar = amVarArr[i2];
            amVar.x();
            c cVar = new c(this, lVar2);
            cVar.f51781a = aj.U(amVar, true, cVar);
            cVarArr[i2] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i3 = 0; i3 < length; i3++) {
            cVarArr[i3].b(dVar);
        }
        if (lVar2.h()) {
            dVar.a();
        } else {
            bo.m(lVar2, dVar);
        }
        Object objJ = lVar.j();
        if (objJ == h.c.a.a.f48038a) {
            h.d.b.c(eVar);
        }
        return objJ;
    }
}
