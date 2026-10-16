package kotlinx.coroutines.a;

import kotlinx.coroutines.ai;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.dl;
import kotlinx.coroutines.e.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements q, dl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f51278a;

    /* renamed from: b, reason: collision with root package name */
    private Object f51279b = m.p;

    /* renamed from: c, reason: collision with root package name */
    private kotlinx.coroutines.l f51280c;

    public b(k kVar) {
        this.f51278a = kVar;
    }

    @Override // kotlinx.coroutines.a.q
    public final Object a(h.c.e eVar) throws Throwable {
        u uVarP;
        Boolean bool;
        u uVar;
        boolean z = true;
        Boolean bool2 = true;
        if (this.f51279b == m.p || this.f51279b == m.t()) {
            k kVar = this.f51278a;
            u uVar2 = (u) kVar.f51300i.b();
            while (true) {
                boolean z2 = false;
                if (kVar.x()) {
                    this.f51279b = m.t();
                    Throwable thL = kVar.l();
                    if (thL != null) {
                        throw aj.b(thL);
                    }
                    z = false;
                } else {
                    long jC = kVar.f51296e.c();
                    long j2 = m.f51305a;
                    long j3 = jC / j2;
                    int i2 = (int) (jC % j2);
                    if (uVar2.f51893a != j3) {
                        uVarP = kVar.P(j3, uVar2);
                        if (uVarP == null) {
                            continue;
                        }
                    } else {
                        uVarP = uVar2;
                    }
                    Object objM = kVar.M(uVarP, i2, jC, null);
                    if (objM == m.m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objM == m.o) {
                        if (jC < kVar.b()) {
                            uVarP.p();
                        }
                        uVar2 = uVarP;
                    } else {
                        if (objM == m.n) {
                            kotlinx.coroutines.l lVarK = bo.k(h.c.a.h.d(eVar));
                            try {
                                this.f51280c = lVarK;
                                b bVar = this;
                                Object objM2 = kVar.M(uVarP, i2, jC, bVar);
                                if (objM2 == m.m) {
                                    k.ah(bVar, uVarP, i2);
                                } else {
                                    if (objM2 == m.o) {
                                        if (jC < kVar.b()) {
                                            uVarP.p();
                                        }
                                        u uVar3 = (u) kVar.f51300i.b();
                                        while (true) {
                                            if (kVar.x()) {
                                                kotlinx.coroutines.l lVar = this.f51280c;
                                                h.g.b.x.c(lVar);
                                                this.f51280c = null;
                                                this.f51279b = m.t();
                                                Throwable thL2 = kVar.l();
                                                if (thL2 == null) {
                                                    lVar.resumeWith(Boolean.valueOf(z2));
                                                } else {
                                                    kotlinx.coroutines.l lVar2 = lVar;
                                                    if (ai.c() && (lVar2 instanceof h.c.b.a.d)) {
                                                        thL2 = aj.a(thL2, lVar2);
                                                    }
                                                    lVar2.resumeWith(e.b.c.a(thL2));
                                                }
                                            } else {
                                                long jC2 = kVar.f51296e.c();
                                                long j4 = jC2 / j2;
                                                long j5 = j2;
                                                int i3 = (int) (jC2 % j5);
                                                Boolean bool3 = bool2;
                                                if (uVar3.f51893a != j4) {
                                                    u uVarP2 = kVar.P(j4, uVar3);
                                                    if (uVarP2 != null) {
                                                        uVar = uVarP2;
                                                    } else {
                                                        continue;
                                                        j2 = j5;
                                                        bool2 = bool3;
                                                        z2 = false;
                                                    }
                                                } else {
                                                    uVar = uVar3;
                                                }
                                                Object objM3 = kVar.M(uVar, i3, jC2, bVar);
                                                u uVar4 = uVar;
                                                if (objM3 == m.m) {
                                                    k.ah(bVar, uVar4, i3);
                                                    break;
                                                }
                                                if (objM3 == m.o) {
                                                    if (jC2 < kVar.b()) {
                                                        uVar4.p();
                                                    }
                                                    uVar3 = uVar4;
                                                    j2 = j5;
                                                    bool2 = bool3;
                                                    z2 = false;
                                                } else {
                                                    if (objM3 == m.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    uVar4.p();
                                                    this.f51279b = objM3;
                                                    this.f51280c = null;
                                                    h.g.a.l lVar3 = kVar.f51293a;
                                                    wVar = lVar3 != null ? new com.waze.ui.b.w(lVar3, objM3, 1) : null;
                                                    bool = bool3;
                                                }
                                            }
                                        }
                                    } else {
                                        bool = bool2;
                                        uVarP.p();
                                        this.f51279b = objM2;
                                        this.f51280c = null;
                                        h.g.a.l lVar4 = kVar.f51293a;
                                        if (lVar4 != null) {
                                            wVar = new com.waze.ui.b.w(lVar4, objM2, 1);
                                        }
                                    }
                                    lVarK.d(bool, wVar);
                                }
                                Object objJ = lVarK.j();
                                if (objJ == h.c.a.a.f48038a) {
                                    h.d.b.c(eVar);
                                }
                                return objJ;
                            } catch (Throwable th) {
                                lVarK.x();
                                throw th;
                            }
                        }
                        uVarP.p();
                        this.f51279b = objM;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlinx.coroutines.a.q
    public final Object b() throws Throwable {
        Object obj = this.f51279b;
        if (obj == m.p) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f51279b = m.p;
        if (obj != m.t()) {
            return obj;
        }
        throw aj.b(this.f51278a.N());
    }

    public final void c() {
        kotlinx.coroutines.l lVar = this.f51280c;
        h.g.b.x.c(lVar);
        this.f51280c = null;
        this.f51279b = m.t();
        Throwable thL = this.f51278a.l();
        if (thL == null) {
            lVar.resumeWith(false);
            return;
        }
        kotlinx.coroutines.l lVar2 = lVar;
        if (ai.c() && (lVar2 instanceof h.c.b.a.d)) {
            thL = aj.a(thL, lVar2);
        }
        lVar2.resumeWith(e.b.c.a(thL));
    }

    public final boolean d(Object obj) {
        kotlinx.coroutines.l lVar = this.f51280c;
        h.g.b.x.c(lVar);
        this.f51280c = null;
        this.f51279b = obj;
        kotlinx.coroutines.l lVar2 = lVar;
        h.g.a.l lVar3 = this.f51278a.f51293a;
        return m.w(lVar2, true, lVar3 != null ? new com.waze.ui.b.w(lVar3, obj, 1) : null);
    }

    @Override // kotlinx.coroutines.dl
    public final void z(kotlinx.coroutines.e.e eVar, int i2) {
        kotlinx.coroutines.l lVar = this.f51280c;
        if (lVar != null) {
            lVar.z(eVar, i2);
        }
    }
}
