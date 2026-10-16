package kotlinx.coroutines.h;

import h.ab;
import h.g.a.q;
import java.util.Objects;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.dl;
import kotlinx.coroutines.e.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class m implements j {

    /* renamed from: a, reason: collision with root package name */
    private final int f52034a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.d f52035b;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.a.d f52037d;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.a.b f52039f;

    /* renamed from: g, reason: collision with root package name */
    private final q f52040g;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.a.c f52036c = h.e.b.g(0);

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.a.c f52038e = h.e.b.g(0);

    public m(int i2, int i3) {
        this.f52034a = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Semaphore should have at least 1 permit, but had " + i2);
        }
        o oVar = new o(0L, null, 2);
        this.f52035b = h.e.b.h(oVar);
        this.f52037d = h.e.b.h(oVar);
        this.f52039f = h.e.b.f(i2 - i3);
        this.f52040g = new com.waze.main_screen.c.d.a(this, 20);
    }

    private final int a() {
        int i2;
        int iB;
        do {
            kotlinx.a.b bVar = this.f52039f;
            i2 = this.f52034a;
            iB = bVar.b();
        } while (iB > i2);
        return iB;
    }

    private final void h() {
        kotlinx.a.b bVar;
        int i2;
        int iD;
        do {
            bVar = this.f52039f;
            i2 = this.f52034a;
            iD = bVar.d();
            if (iD <= i2) {
                return;
            }
        } while (!bVar.g(iD, i2));
    }

    private final boolean i(dl dlVar) {
        Object objC;
        kotlinx.a.d dVar = this.f52037d;
        o oVar = (o) dVar.b();
        long jC = this.f52038e.c();
        long j2 = jC / n.f52047g;
        o oVar2 = oVar;
        k kVar = k.f52032a;
        loop0: while (true) {
            objC = kotlinx.coroutines.e.d.c(oVar2, j2, kVar);
            if (!ai.a(objC)) {
                kotlinx.coroutines.e.e eVarB = ai.b(objC);
                while (true) {
                    kotlinx.coroutines.e.e eVar = (kotlinx.coroutines.e.e) dVar.b();
                    if (eVar.f51893a >= eVarB.f51893a) {
                        break loop0;
                    }
                    if (!eVarB.x()) {
                        break;
                    }
                    if (dVar.e(eVar, eVarB)) {
                        if (eVar.v()) {
                            eVar.q();
                        }
                    } else if (eVarB.v()) {
                        eVarB.q();
                    }
                }
            } else {
                break;
            }
        }
        o oVar3 = (o) ai.b(objC);
        int i2 = (int) (jC % n.f52047g);
        if (oVar3.b().d(i2).e(null, dlVar)) {
            dlVar.z(oVar3, i2);
            return true;
        }
        if (!oVar3.b().d(i2).e(n.f52043c, n.f52044d)) {
            int i3 = kotlinx.coroutines.ai.f51347a;
            return false;
        }
        if (dlVar instanceof kotlinx.coroutines.k) {
            ((kotlinx.coroutines.k) dlVar).d(ab.f48028a, this.f52040g);
        } else {
            if (!(dlVar instanceof kotlinx.coroutines.g.l)) {
                Objects.toString(dlVar);
                throw new IllegalStateException("unexpected: ".concat(dlVar.toString()));
            }
            ((kotlinx.coroutines.g.l) dlVar).i(ab.f48028a);
        }
        return true;
    }

    @Override // kotlinx.coroutines.h.j
    public final int b() {
        return Math.max(this.f52039f.d(), 0);
    }

    @Override // kotlinx.coroutines.h.j
    public final Object c(h.c.e eVar) {
        if (a() <= 0) {
            kotlinx.coroutines.l lVarK = bo.k(h.c.a.h.d(eVar));
            try {
                if (!i(lVarK)) {
                    e(lVarK);
                }
                Object objJ = lVarK.j();
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (objJ == aVar) {
                    h.d.b.c(eVar);
                }
                if (objJ != aVar) {
                    objJ = ab.f48028a;
                }
                if (objJ == aVar) {
                    return objJ;
                }
            } catch (Throwable th) {
                lVarK.x();
                throw th;
            }
        }
        return ab.f48028a;
    }

    @Override // kotlinx.coroutines.h.j
    public final void d() {
        Object objC;
        boolean zJ;
        do {
            kotlinx.a.b bVar = this.f52039f;
            int i2 = this.f52034a;
            int iC = bVar.c();
            if (iC >= i2) {
                h();
                throw new IllegalStateException("The number of released permits cannot be greater than " + i2);
            }
            if (iC >= 0) {
                return;
            }
            kotlinx.a.d dVar = this.f52035b;
            o oVar = (o) dVar.b();
            long jC = this.f52036c.c();
            long j2 = jC / n.f52047g;
            o oVar2 = oVar;
            l lVar = l.f52033a;
            while (true) {
                objC = kotlinx.coroutines.e.d.c(oVar2, j2, lVar);
                if (!ai.a(objC)) {
                    kotlinx.coroutines.e.e eVarB = ai.b(objC);
                    while (true) {
                        kotlinx.coroutines.e.e eVar = (kotlinx.coroutines.e.e) dVar.b();
                        if (eVar.f51893a >= eVarB.f51893a) {
                            break;
                        }
                        if (!eVarB.x()) {
                            break;
                        }
                        if (dVar.e(eVar, eVarB)) {
                            if (eVar.v()) {
                                eVar.q();
                            }
                        } else if (eVarB.v()) {
                            eVarB.q();
                        }
                    }
                } else {
                    break;
                }
            }
            o oVar3 = (o) ai.b(objC);
            oVar3.p();
            zJ = false;
            if (oVar3.f51893a <= j2) {
                int i3 = (int) (jC % n.f52047g);
                Object objA = oVar3.b().d(i3).a(n.f52043c);
                if (objA == null) {
                    int i4 = n.f52042b;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            if (!oVar3.b().d(i3).e(n.f52043c, n.f52045e)) {
                                break;
                            }
                        } else if (oVar3.b().d(i3).b() == n.f52044d) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (objA != n.f52046f) {
                    if (objA instanceof kotlinx.coroutines.k) {
                        kotlinx.coroutines.k kVar = (kotlinx.coroutines.k) objA;
                        Object objI = kVar.i(ab.f48028a, this.f52040g);
                        if (objI != null) {
                            kVar.b(objI);
                            zJ = true;
                        }
                    } else {
                        if (!(objA instanceof kotlinx.coroutines.g.l)) {
                            Objects.toString(objA);
                            throw new IllegalStateException("unexpected: ".concat(objA.toString()));
                        }
                        zJ = ((kotlinx.coroutines.g.l) objA).j(this, ab.f48028a);
                    }
                }
            }
        } while (!zJ);
    }

    protected final void e(kotlinx.coroutines.k kVar) {
        while (a() <= 0) {
            if (i((dl) kVar)) {
                return;
            }
        }
        kVar.d(ab.f48028a, this.f52040g);
    }

    public final boolean f() {
        while (true) {
            kotlinx.a.b bVar = this.f52039f;
            int i2 = this.f52034a;
            int iD = bVar.d();
            if (iD > i2) {
                h();
            } else {
                if (iD <= 0) {
                    return false;
                }
                if (bVar.g(iD, iD - 1)) {
                    return true;
                }
            }
        }
    }

    protected final void g(kotlinx.coroutines.g.l lVar) {
        while (a() <= 0) {
            if (i((dl) lVar)) {
                return;
            }
        }
        lVar.i(ab.f48028a);
    }
}
