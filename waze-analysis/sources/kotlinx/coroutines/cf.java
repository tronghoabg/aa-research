package kotlinx.coroutines;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class cf implements br {

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.d f51799b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.a.d f51800c;

    public cf(boolean z) {
        this.f51799b = h.e.b.h(z ? cg.f51807g : cg.f51806f);
        this.f51800c = h.e.b.h(null);
    }

    public static final /* synthetic */ void G(cf cfVar, by byVar, q qVar, Object obj) {
        int i2 = ai.f51347a;
        q qVar2 = qVar;
        q qVarAc = ac(qVar2);
        if (qVarAc == null || !cfVar.ab(byVar, qVarAc, obj)) {
            byVar.bL().j(2);
            q qVarAc2 = ac(qVar2);
            if (qVarAc2 == null || !cfVar.ab(byVar, qVarAc2, obj)) {
                cfVar.k(cfVar.h(byVar, obj));
            }
        }
    }

    public static final /* synthetic */ void R(cf cfVar, kotlinx.coroutines.g.l lVar) {
        Object objBX;
        do {
            objBX = cfVar.bX();
            if (!(objBX instanceof bl)) {
                if (!(objBX instanceof u)) {
                    objBX = cg.b(objBX);
                }
                lVar.i(objBX);
                return;
            }
        } while (cfVar.e(objBX) < 0);
        lVar.g(aj.U(cfVar, true, new bz(cfVar, lVar)));
    }

    public static final /* synthetic */ void S(cf cfVar, kotlinx.coroutines.g.l lVar) {
        if (cfVar.aa()) {
            lVar.g(aj.U(cfVar, true, new ca(cfVar, lVar)));
        } else {
            lVar.i(h.ab.f48028a);
        }
    }

    public static /* synthetic */ CancellationException T(cf cfVar, Throwable th) {
        return cfVar.D(th, null);
    }

    private final ck U(bl blVar) {
        ck ckVarBL = blVar.bL();
        if (ckVarBL != null) {
            return ckVarBL;
        }
        if (blVar instanceof az) {
            return new ck();
        }
        if (blVar instanceof bv) {
            Y((bv) blVar);
            return null;
        }
        Objects.toString(blVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(blVar)));
    }

    private final void V(bl blVar, Object obj) throws Throwable {
        p pVarE = E();
        if (pVarE != null) {
            pVarE.dispose();
            L(cm.f51811a);
        }
        v vVar = null;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th = uVar != null ? uVar.f52067a : null;
        if (blVar instanceof bv) {
            try {
                ((bv) blVar).a(th);
                return;
            } catch (Throwable th2) {
                bU(new v("Exception in completion handler " + blVar + " for " + this, th2));
                return;
            }
        }
        ck ckVarBL = blVar.bL();
        if (ckVarBL != null) {
            ckVarBL.j(1);
            ck ckVar = ckVarBL;
            Object objG = ckVar.g();
            h.g.b.x.d(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (kotlinx.coroutines.e.z zVarH = (kotlinx.coroutines.e.z) objG; !h.g.b.x.n(zVarH, ckVar); zVarH = zVarH.h()) {
                if (zVarH instanceof bv) {
                    try {
                        ((bv) zVarH).a(th);
                    } catch (Throwable th3) {
                        v vVar2 = vVar;
                        if (vVar2 != null) {
                            e.a.h.ad.c(vVar2, th3);
                        } else {
                            vVar = new v("Exception in completion handler " + zVarH + " for " + this, th3);
                        }
                    }
                }
            }
            v vVar3 = vVar;
            if (vVar3 != null) {
                bU(vVar3);
            }
        }
    }

    private final void W(ck ckVar, Throwable th) throws Throwable {
        ckVar.j(4);
        ck ckVar2 = ckVar;
        Object objG = ckVar2.g();
        h.g.b.x.d(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        v vVar = null;
        for (kotlinx.coroutines.e.z zVarH = (kotlinx.coroutines.e.z) objG; !h.g.b.x.n(zVarH, ckVar2); zVarH = zVarH.h()) {
            if (zVarH instanceof bv) {
                bv bvVar = (bv) zVarH;
                if (bvVar.c()) {
                    try {
                        bvVar.a(th);
                    } catch (Throwable th2) {
                        v vVar2 = vVar;
                        if (vVar2 != null) {
                            e.a.h.ad.c(vVar2, th2);
                        } else {
                            vVar = new v("Exception in completion handler " + zVarH + " for " + this, th2);
                        }
                    }
                }
            }
        }
        v vVar3 = vVar;
        if (vVar3 != null) {
            bU(vVar3);
        }
        Z(th);
    }

    private final void X(az azVar) {
        ck ckVar = new ck();
        this.f51799b.e(azVar, azVar.bM() ? ckVar : new bk(ckVar));
    }

    private final void Y(bv bvVar) {
        bvVar.l(new ck());
        this.f51799b.e(bvVar, bvVar.h());
    }

    private final boolean Z(Throwable th) {
        if (l()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        p pVarE = E();
        return (pVarE == null || pVarE == cm.f51811a) ? z : pVarE.d(th) || z;
    }

    private final boolean aa() {
        Object objBX;
        do {
            objBX = bX();
            if (!(objBX instanceof bl)) {
                return false;
            }
        } while (e(objBX) < 0);
        return true;
    }

    private final boolean ab(by byVar, q qVar, Object obj) {
        while (aj.U(qVar.f52061a, false, new bx(this, byVar, qVar, obj)) == cm.f51811a) {
            qVar = ac(qVar);
            if (qVar == null) {
                return false;
            }
        }
        return true;
    }

    private static final q ac(kotlinx.coroutines.e.z zVar) {
        while (zVar.bN()) {
            zVar = zVar.i();
        }
        while (true) {
            zVar = zVar.h();
            if (!zVar.bN()) {
                if (zVar instanceof q) {
                    return (q) zVar;
                }
                if (zVar instanceof ck) {
                    return null;
                }
            }
        }
    }

    private static final String ad(Object obj) {
        if (!(obj instanceof by)) {
            return obj instanceof bl ? ((bl) obj).bM() ? "Active" : "New" : obj instanceof u ? "Cancelled" : "Completed";
        }
        by byVar = (by) obj;
        return byVar.f() ? "Cancelling" : byVar.g() ? "Completing" : "Active";
    }

    private final int e(Object obj) {
        if (obj instanceof az) {
            if (((az) obj).bM()) {
                return 0;
            }
            if (!this.f51799b.e(obj, cg.f51807g)) {
                return -1;
            }
            J();
            return 1;
        }
        if (!(obj instanceof bk)) {
            return 0;
        }
        if (!this.f51799b.e(obj, ((bk) obj).bL())) {
            return -1;
        }
        J();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(kotlinx.coroutines.by r8, java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.cf.h(kotlinx.coroutines.by, java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof bl)) {
            return cg.f51802b;
        }
        if (((obj instanceof az) || (obj instanceof bv)) && !(obj instanceof q) && !(obj2 instanceof u)) {
            bl blVar = (bl) obj;
            int i2 = ai.f51347a;
            if (!this.f51799b.e(blVar, cg.a(obj2))) {
                return cg.f51803c;
            }
            bV(obj2);
            V(blVar, obj2);
            return obj2;
        }
        bl blVar2 = (bl) obj;
        ck ckVarU = U(blVar2);
        if (ckVarU == null) {
            return cg.f51803c;
        }
        Throwable th = null;
        by byVar = blVar2 instanceof by ? (by) blVar2 : null;
        if (byVar == null) {
            byVar = new by(ckVarU, null);
        }
        h.g.b.aq aqVar = new h.g.b.aq();
        synchronized (byVar) {
            if (byVar.g()) {
                return cg.f51802b;
            }
            byVar.i();
            if (byVar != blVar2 && !this.f51799b.e(blVar2, byVar)) {
                return cg.f51803c;
            }
            int i3 = ai.f51347a;
            boolean zF = byVar.f();
            u uVar = obj2 instanceof u ? (u) obj2 : null;
            if (uVar != null) {
                byVar.e(uVar.f52067a);
            }
            Throwable thC = byVar.c();
            boolean z = !zF;
            Boolean.valueOf(z).getClass();
            if (true == z) {
                th = thC;
            }
            aqVar.f48105a = th;
            Throwable th2 = (Throwable) aqVar.f48105a;
            if (th2 != null) {
                W(ckVarU, th2);
            }
            ck ckVar = ckVarU;
            q qVarAc = ac(ckVar);
            if (qVarAc != null && ab(byVar, qVarAc, obj2)) {
                return cg.f51801a;
            }
            ckVarU.j(2);
            q qVarAc2 = ac(ckVar);
            return (qVarAc2 == null || !ab(byVar, qVarAc2, obj2)) ? h(byVar, obj2) : cg.f51801a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    private final Throwable j(Object obj) {
        CancellationException cancellationExceptionC;
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th != null ? th : new bs(bO(), null, this);
        }
        cf cfVar = (cf) obj;
        Object objBX = cfVar.bX();
        if (objBX instanceof by) {
            cancellationExceptionC = ((by) objBX).c();
        } else if (objBX instanceof u) {
            cancellationExceptionC = ((u) objBX).f52067a;
        } else {
            if (objBX instanceof bl) {
                Objects.toString(objBX);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(objBX)));
            }
            cancellationExceptionC = null;
        }
        bs bsVar = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        if (bsVar == null) {
            bsVar = new bs("Parent job is ".concat(ad(objBX)), cancellationExceptionC, cfVar);
        }
        return bsVar;
    }

    public final Object C(Object obj) {
        Object objI;
        do {
            objI = i(bX(), obj);
            if (objI == cg.f51802b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                u uVar = obj instanceof u ? (u) obj : null;
                throw new IllegalStateException(str, uVar != null ? uVar.f52067a : null);
            }
        } while (objI == cg.f51803c);
        return objI;
    }

    protected final CancellationException D(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = bO();
        }
        return new bs(str, th, this);
    }

    public final p E() {
        return (p) this.f51800c.b();
    }

    public final ax F(boolean z, bv bvVar) {
        boolean zK;
        bvVar.f51769c = this;
        while (true) {
            Object objBX = bX();
            if (objBX instanceof az) {
                az azVar = (az) objBX;
                if (!azVar.bM()) {
                    X(azVar);
                } else if (this.f51799b.e(objBX, bvVar)) {
                    break;
                }
            } else {
                if (!(objBX instanceof bl)) {
                    if (z) {
                        Object objBX2 = bX();
                        u uVar = objBX2 instanceof u ? (u) objBX2 : null;
                        bvVar.a(uVar != null ? uVar.f52067a : null);
                    }
                    return cm.f51811a;
                }
                bl blVar = (bl) objBX;
                ck ckVarBL = blVar.bL();
                if (ckVarBL == null) {
                    h.g.b.x.d(objBX, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Y((bv) objBX);
                } else {
                    if (bvVar.c()) {
                        by byVar = blVar instanceof by ? (by) blVar : null;
                        Throwable thC = byVar != null ? byVar.c() : null;
                        if (thC != null) {
                            if (z) {
                                bvVar.a(thC);
                            }
                            return cm.f51811a;
                        }
                        zK = ckVarBL.k(bvVar, 5);
                    } else {
                        zK = ckVarBL.k(bvVar, 1);
                    }
                    if (zK) {
                        break;
                    }
                }
            }
        }
        return bvVar;
    }

    public void H(Throwable th) throws Throwable {
        M(th);
    }

    protected final void I(br brVar) {
        int i2 = ai.f51347a;
        if (brVar == null) {
            L(cm.f51811a);
            return;
        }
        brVar.x();
        p pVarW = brVar.w(this);
        L(pVarW);
        if (ca()) {
            pVarW.dispose();
            L(cm.f51811a);
        }
    }

    public final void K(bv bvVar) {
        Object objBX;
        do {
            objBX = bX();
            if (!(objBX instanceof bv)) {
                if (!(objBX instanceof bl) || ((bl) objBX).bL() == null) {
                    return;
                }
                bvVar.m();
                return;
            }
            if (objBX != bvVar) {
                return;
            }
        } while (!this.f51799b.e(objBX, cg.f51807g));
    }

    public final void L(p pVar) {
        this.f51800c.d(pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f1, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.cf.M(java.lang.Object):boolean");
    }

    public boolean N(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return M(th) && bJ();
    }

    protected boolean O(Throwable th) {
        return false;
    }

    public final boolean P(Object obj) throws Throwable {
        Object objI;
        do {
            objI = i(bX(), obj);
            if (objI == cg.f51802b) {
                return false;
            }
            if (objI == cg.f51801a) {
                return true;
            }
        } while (objI == cg.f51803c);
        k(objI);
        return true;
    }

    protected final kotlinx.coroutines.g.e Q() {
        cc ccVar = cc.f51796a;
        h.g.b.au.h(ccVar, 3);
        cd cdVar = cd.f51797a;
        h.g.b.au.h(cdVar, 3);
        return new kotlinx.coroutines.g.e(this, ccVar, cdVar, null);
    }

    public boolean bJ() {
        return true;
    }

    public boolean bK() {
        return false;
    }

    protected String bO() {
        return "Job was cancelled";
    }

    public String bP() {
        return aj.a(this);
    }

    public final Object bW() throws Throwable {
        Object objBX = bX();
        if (objBX instanceof bl) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objBX instanceof u) {
            throw ((u) objBX).f52067a;
        }
        return cg.b(objBX);
    }

    public final Object bX() {
        return this.f51799b.b();
    }

    @Override // kotlinx.coroutines.br
    public final ax bY(h.g.a.l lVar) {
        return F(true, new bq(lVar));
    }

    @Override // kotlinx.coroutines.br
    public final boolean bZ() {
        Object objBX = bX();
        return (objBX instanceof bl) && ((bl) objBX).bM();
    }

    @Override // kotlinx.coroutines.br
    public final boolean ca() {
        return !(bX() instanceof bl);
    }

    @Override // kotlinx.coroutines.br
    public final org.a.d.a cb() {
        ce ceVar = ce.f51798a;
        h.g.b.au.h(ceVar, 3);
        return new org.a.d.a(this, ceVar);
    }

    @Override // h.c.j
    public final <R> R fold(R r, h.g.a.p<? super R, ? super h.c.h, ? extends R> pVar) {
        return (R) h.c.a.h.e(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public final <E extends h.c.h> E get(h.c.i<E> iVar) {
        return (E) h.c.a.h.f(this, iVar);
    }

    @Override // h.c.h
    public final h.c.i<?> getKey() {
        return br.f51766a;
    }

    protected boolean l() {
        return false;
    }

    @Override // kotlinx.coroutines.br
    public final Object m(h.c.e eVar) {
        if (!aa()) {
            aj.Y(eVar.getContext());
            return h.ab.f48028a;
        }
        l lVar = new l(h.c.a.h.d(eVar), 1);
        lVar.u();
        l lVar2 = lVar;
        bo.l(lVar2, aj.U(this, true, new cs(lVar2)));
        Object objJ = lVar.j();
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (objJ == aVar) {
            h.d.b.c(eVar);
        }
        if (objJ != aVar) {
            objJ = h.ab.f48028a;
        }
        return objJ == aVar ? objJ : h.ab.f48028a;
    }

    @Override // h.c.j
    public final h.c.j minusKey(h.c.i<?> iVar) {
        return h.c.a.h.g(this, iVar);
    }

    @Override // kotlinx.coroutines.br
    public final CancellationException n() {
        Object objBX = bX();
        if (objBX instanceof by) {
            Throwable thC = ((by) objBX).c();
            if (thC != null) {
                return D(thC, String.valueOf(getClass().getSimpleName()).concat(" is cancelling"));
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        if (objBX instanceof bl) {
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        if (objBX instanceof u) {
            return T(this, ((u) objBX).f52067a);
        }
        return new bs(String.valueOf(getClass().getSimpleName()).concat(" has completed normally"), null, this);
    }

    @Override // kotlinx.coroutines.br
    public final h.m.h o() {
        return h.m.k.b(new cb(this, null));
    }

    @Override // h.c.j
    public final /* bridge */ h.c.j plus(h.c.j jVar) {
        return h.c.a.h.h(this, jVar);
    }

    @Override // kotlinx.coroutines.br
    public final ax q(boolean z, boolean z2, h.g.a.l lVar) {
        return F(z2, z ? new bp(lVar) : new bq(lVar));
    }

    @Override // kotlinx.coroutines.br
    public final br r() {
        p pVarE = E();
        if (pVarE != null) {
            return pVarE.b();
        }
        return null;
    }

    @Override // kotlinx.coroutines.br, kotlinx.coroutines.a.af
    public void s(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new bs(bO(), null, this);
        }
        H(cancellationException);
    }

    public final String toString() {
        return (bP() + "{" + ad(bX()) + "}") + "@" + aj.b(this);
    }

    @Override // kotlinx.coroutines.br
    public final boolean u() {
        Object objBX = bX();
        if (objBX instanceof u) {
            return true;
        }
        return (objBX instanceof by) && ((by) objBX).f();
    }

    @Override // kotlinx.coroutines.br
    public final p w(cf cfVar) {
        q qVar = new q(cfVar);
        ((bv) qVar).f51769c = this;
        q qVar2 = qVar;
        while (true) {
            Object objBX = bX();
            if (objBX instanceof az) {
                az azVar = (az) objBX;
                if (!azVar.bM()) {
                    X(azVar);
                } else if (this.f51799b.e(objBX, qVar2)) {
                    break;
                }
            } else {
                if (!(objBX instanceof bl)) {
                    Object objBX2 = bX();
                    u uVar = objBX2 instanceof u ? (u) objBX2 : null;
                    qVar.a(uVar != null ? uVar.f52067a : null);
                    return cm.f51811a;
                }
                ck ckVarBL = ((bl) objBX).bL();
                if (ckVarBL == null) {
                    h.g.b.x.d(objBX, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Y((bv) objBX);
                } else {
                    q qVar3 = qVar;
                    if (!ckVarBL.k(qVar3, 7)) {
                        boolean zK = ckVarBL.k(qVar3, 3);
                        Object objBX3 = bX();
                        if (objBX3 instanceof by) {
                            thC = ((by) objBX3).c();
                        } else {
                            int i2 = ai.f51347a;
                            u uVar2 = objBX3 instanceof u ? (u) objBX3 : null;
                            if (uVar2 != null) {
                                thC = uVar2.f52067a;
                            }
                        }
                        qVar.a(thC);
                        if (!zK) {
                            return cm.f51811a;
                        }
                        int i3 = ai.f51347a;
                    }
                }
            }
        }
        return qVar;
    }

    @Override // kotlinx.coroutines.br
    public final void x() {
        int iE;
        do {
            iE = e(bX());
            if (iE == 0) {
                return;
            }
        } while (iE != 1);
    }

    protected final Object z(h.c.e eVar) throws Throwable {
        Object objBX;
        do {
            objBX = bX();
            if (!(objBX instanceof bl)) {
                if (!(objBX instanceof u)) {
                    return cg.b(objBX);
                }
                Throwable th = ((u) objBX).f52067a;
                if (ai.c() && (eVar instanceof h.c.b.a.d)) {
                    throw kotlinx.coroutines.e.aj.a(th, (h.c.b.a.d) eVar);
                }
                throw th;
            }
        } while (e(objBX) < 0);
        bw bwVar = new bw(h.c.a.h.d(eVar), this);
        bwVar.u();
        bo.l(bwVar, aj.U(this, true, new cr(bwVar)));
        Object objJ = bwVar.j();
        if (objJ == h.c.a.a.f48038a) {
            h.d.b.c(eVar);
        }
        return objJ;
    }

    protected void J() {
    }

    public void bU(Throwable th) throws Throwable {
        throw th;
    }

    protected void bV(Object obj) {
    }

    protected void k(Object obj) {
    }
}
