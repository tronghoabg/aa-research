package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* loaded from: classes.dex */
public abstract class aoe extends cwe implements cys, cpm, cwc, aog {
    private aqz E;
    private aou F;
    private sm G;
    private ca H;
    private asf a;
    private arw b;
    private boolean c;
    public api d;
    public afec e;
    public boolean f;
    public aixl g;
    public boolean h;
    private ank i;
    private cwd k;
    private cwd l;
    private ann m;
    private anm n;
    private anl o;
    private long j = 0;
    private long p = 0;
    private long D = 9205357640488583168L;

    public aoe(afec afecVar, boolean z, asf asfVar, api apiVar) {
        this.d = apiVar;
        this.e = afecVar;
        this.f = z;
        this.a = asfVar;
    }

    private final void A() {
        cwd cwdVar = this.l;
        if (cwdVar != null) {
            V(cwdVar);
        }
        cwd cwdVar2 = this.k;
        if (cwdVar2 != null) {
            V(cwdVar2);
        }
        this.l = null;
        this.k = null;
    }

    private final void B() {
        i().j(ano.c);
    }

    static /* synthetic */ void J(aoe aoeVar, cqu cquVar, long j, long j2, int i) {
        anm anmVar = aoeVar.n;
        if (anmVar == null) {
            anmVar = new anm();
            aoeVar.n = anmVar;
        }
        anmVar.c = cquVar;
        anmVar.d = j;
        aqz aqzVar = aoeVar.E;
        if (aqzVar == null) {
            aoeVar.E = new aqz(aoeVar.d, 0L);
        } else {
            if ((i & 4) != 0) {
                j2 = 0;
            }
            aqzVar.a = aoeVar.d;
            aqzVar.b = j2;
        }
        anmVar.e = false;
        aoeVar.H = anmVar;
    }

    private final void L(cqu cquVar, cqu cquVar2, long j) {
        if (this.G == null) {
            this.G = new sm((byte[]) null);
        }
        ((tsu) Y().a).n(cquVar, 0L);
        long jY = aclh.y(cquVar2.c, j);
        this.p = 0L;
        if (((Boolean) this.e.invoke(new crc(cquVar.i))).booleanValue()) {
            if (!this.h) {
                if (this.g == null) {
                    this.g = afpt.r(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
                }
                X();
            }
            this.D = crt.j(bzi.o(this)).k(0L);
            i().j(new anq(jY));
        }
    }

    private final void X() {
        this.h = true;
        if (this.g == null) {
            this.g = afpt.r(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        }
        ahnc.d(N(), null, 0, new aod(this, null), 3);
    }

    private final sm Y() {
        sm smVar = this.G;
        if (smVar != null) {
            return smVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    private final ank eg() {
        ank ankVar = this.i;
        if (ankVar != null) {
            return ankVar;
        }
        ank ankVar2 = new ank(null);
        this.i = ankVar2;
        return ankVar2;
    }

    private final void eh(long j) {
        ann annVar = this.m;
        if (annVar == null) {
            annVar = new ann();
            this.m = annVar;
        }
        annVar.c = j;
        this.H = annVar;
    }

    private final void ei() {
        l();
        if (this.h) {
            B();
        }
        this.G = null;
    }

    private final void ej(cqu cquVar, long j) {
        this.j = a.ai(this.j, j);
        long jK = crt.j(bzi.o(this)).k(0L);
        long j2 = this.D;
        if (j2 != 9205357640488583168L && jK != j2) {
            this.p = a.ai(this.p, aclh.y(jK, j2));
        }
        this.D = jK;
        sm smVarY = Y();
        ((tsu) smVarY.a).n(cquVar, this.p);
        i().j(new anp(j, false));
    }

    private final aixl i() {
        aixl aixlVar = this.g;
        if (aixlVar != null) {
            return aixlVar;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    private final void l() {
        this.j = 0L;
        ank ankVarEg = eg();
        ankVarEg.e = 3;
        ankVarEg.c = false;
        ankVarEg.d = false;
        this.H = ankVarEg;
    }

    private final void m(cqu cquVar, long j, aqz aqzVar) {
        anl anlVar = this.o;
        if (anlVar == null) {
            anlVar = new anl();
            this.o = anlVar;
        }
        anlVar.c = cquVar;
        anlVar.d = j;
        aqzVar.b = 0L;
        this.H = anlVar;
    }

    @Override // defpackage.cys
    public final /* synthetic */ boolean C() {
        return false;
    }

    protected final void F() {
        if (this.k == null) {
            ajy ajyVar = new ajy(this);
            W(ajyVar);
            this.k = ajyVar;
        }
    }

    public final void G(afec afecVar, boolean z, asf asfVar, api apiVar, boolean z2) {
        this.e = afecVar;
        if (this.f != z) {
            this.f = z;
            z2 = true;
            if (!z) {
                A();
                w();
                this.F = null;
            }
        }
        if (!affa.f(this.a, asfVar)) {
            w();
            this.a = asfVar;
        }
        if (this.d != apiVar) {
            this.d = apiVar;
        } else if (!z2) {
            return;
        }
        if (this.c) {
            ei();
        }
        aou aouVar = this.F;
        if (aouVar != null) {
            aouVar.f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.cpm
    public final void H(aagd aagdVar, cqm cqmVar) {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.f) {
            aou aouVar = this.F;
            if (aouVar == null) {
                aouVar = new aou(this);
                this.F = aouVar;
            }
            if (this.l == null) {
                aouVar.getClass();
                ajy ajyVar = new ajy(aouVar);
                W(ajyVar);
                this.l = ajyVar;
            }
            aou aouVar2 = this.F;
            if (aouVar2 != null) {
                if (aouVar2.d == null) {
                    aouVar2.d = aouVar2.a();
                }
                ca caVar = aouVar2.d;
                if (caVar == null) {
                    throw new IllegalArgumentException("currentDragState should not be null");
                }
                Object obj4 = null;
                int i = 0;
                boolean z = true;
                if (caVar instanceof aoq) {
                    aoq aoqVar = (aoq) caVar;
                    ?? r0 = aagdVar.c;
                    if (r0.isEmpty()) {
                        return;
                    }
                    int size = r0.size();
                    while (i < size) {
                        if (!ca.aI((cpl) r0.get(i))) {
                            return;
                        } else {
                            i++;
                        }
                    }
                    cpl cplVar = (cpl) woy.bF(r0);
                    int i2 = aoqVar.e;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    int i4 = 2;
                    if (i3 == 2) {
                        i2 = !aouVar2.a.k() ? 1 : 2;
                    }
                    aoqVar.e = i2;
                    if (cqmVar == cqm.a) {
                        if (i2 == 2) {
                            cplVar.a();
                            aoqVar.c = true;
                        } else {
                            i4 = i2;
                        }
                        aoqVar.d = true;
                        i2 = i4;
                    }
                    if (cqmVar == cqm.b) {
                        if (i2 == 1) {
                            aou.j(aouVar2, cplVar, cplVar.a, 0L, 12);
                            return;
                        } else {
                            if (aoqVar.c) {
                                int i5 = aagdVar.a;
                                aouVar2.i(cplVar, cplVar, new cpk(i5), 0L);
                                aouVar2.h(cplVar, new cpk(i5), 0L);
                                aouVar2.e(cplVar.a);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (caVar instanceof aos) {
                    aos aosVar = (aos) caVar;
                    if (cqmVar != cqm.a) {
                        ?? r02 = aagdVar.c;
                        int size2 = r02.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = r02.get(i6);
                            if (((cpl) obj2).a == aosVar.d) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        cpl cplVar2 = (cpl) obj2;
                        if (cplVar2 == null) {
                            int size3 = r02.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size3) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = r02.get(i7);
                                if (((cpl) obj3).d) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            cplVar2 = (cpl) obj3;
                            if (cplVar2 == null) {
                                aouVar2.b();
                                return;
                            }
                            aosVar.d = cplVar2.a;
                        }
                        cpl cplVar3 = cplVar2;
                        if (cqmVar == cqm.b) {
                            if (cplVar3.g) {
                                cpl cplVar4 = aosVar.c;
                                if (cplVar4 == null) {
                                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                }
                                long j = aosVar.d;
                                aqz aqzVar = aouVar2.c;
                                if (aqzVar == null) {
                                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                                }
                                aouVar2.c(cplVar4, j, aqzVar);
                            } else if (ca.aJ(cplVar3)) {
                                int size4 = r02.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size4) {
                                        break;
                                    }
                                    Object obj5 = r02.get(i8);
                                    if (((cpl) obj5).d) {
                                        obj4 = obj5;
                                        break;
                                    }
                                    i8++;
                                }
                                cpl cplVar5 = (cpl) obj4;
                                if (cplVar5 == null) {
                                    aouVar2.b();
                                } else {
                                    aosVar.d = cplVar5.a;
                                }
                            } else {
                                aoe aoeVar = aouVar2.a;
                                float fAM = ca.aM((dcc) bzi.x(aoeVar, dbc.n), 1);
                                aqz aqzVar2 = aouVar2.c;
                                if (aqzVar2 == null) {
                                    throw new IllegalArgumentException("Touch slop detector not initialized.");
                                }
                                api apiVar = aoeVar.d;
                                int i9 = aagdVar.a;
                                cpk cpkVar = new cpk(i9);
                                long jB = aqzVar2.b(aclh.y(ca.aG(cplVar3, apiVar, cpkVar), ca.aH(cplVar3, apiVar, cpkVar)), fAM);
                                if ((9223372034707292159L & jB) != 9205357640488583168L) {
                                    cplVar3.a();
                                    cpl cplVar6 = aosVar.c;
                                    cplVar6.getClass();
                                    aouVar2.i(cplVar6, cplVar3, new cpk(i9), jB);
                                    aouVar2.h(cplVar3, new cpk(i9), jB);
                                    aouVar2.e(cplVar3.a);
                                } else {
                                    aosVar.e = true;
                                }
                            }
                        }
                        if (cqmVar == cqm.c && aosVar.e) {
                            if (!cplVar3.g) {
                                aosVar.e = false;
                                return;
                            }
                            cpl cplVar7 = aosVar.c;
                            if (cplVar7 == null) {
                                throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                            }
                            long j2 = aosVar.d;
                            aqz aqzVar3 = aouVar2.c;
                            if (aqzVar3 == null) {
                                throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                            }
                            aouVar2.c(cplVar7, j2, aqzVar3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (caVar instanceof aor) {
                    aor aorVar = (aor) caVar;
                    if (cqmVar == cqm.c) {
                        ?? r15 = aagdVar.c;
                        int size5 = r15.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size5) {
                                if (((cpl) r15.get(i10)).g) {
                                    z = false;
                                    break;
                                }
                                i10++;
                            } else {
                                break;
                            }
                        }
                        int size6 = r15.size();
                        while (true) {
                            if (i >= size6) {
                                break;
                            }
                            if (!((cpl) r15.get(i)).d) {
                                i++;
                            } else if (!r15.isEmpty()) {
                                if (z) {
                                    cpl cplVar8 = (cpl) woy.bF(r15);
                                    aoe aoeVar2 = aouVar2.a;
                                    int i11 = aagdVar.a;
                                    long jAG = ca.aG(cplVar8, aoeVar2.d, new cpk(i11));
                                    cpl cplVar9 = aorVar.c;
                                    cplVar9.getClass();
                                    long jY = aclh.y(jAG, ca.aG(cplVar9, aoeVar2.d, new cpk(i11)));
                                    cpl cplVar10 = aorVar.c;
                                    if (cplVar10 == null) {
                                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                    }
                                    aou.j(aouVar2, cplVar10, aorVar.d, jY, 8);
                                    return;
                                }
                                return;
                            }
                        }
                        aouVar2.b();
                        return;
                    }
                    return;
                }
                if (!(caVar instanceof aot)) {
                    throw new aezs();
                }
                aot aotVar = (aot) caVar;
                if (cqmVar == cqm.b) {
                    long j3 = aotVar.c;
                    ?? r152 = aagdVar.c;
                    int size7 = r152.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size7) {
                            obj = null;
                            break;
                        }
                        obj = r152.get(i12);
                        if (((cpl) obj).a == j3) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    cpl cplVar11 = (cpl) obj;
                    if (cplVar11 != null) {
                        if (!ca.aJ(cplVar11)) {
                            if (cplVar11.g) {
                                aouVar2.g();
                                return;
                            }
                            aoe aoeVar3 = aouVar2.a;
                            int i13 = aagdVar.a;
                            api apiVar2 = aoeVar3.d;
                            cpk cpkVar2 = new cpk(i13);
                            aouVar2.h(cplVar11, new cpk(i13), true != cplVar11.g ? aclh.y(ca.aG(cplVar11, apiVar2, cpkVar2), ca.aH(cplVar11, apiVar2, cpkVar2)) : 0L);
                            cplVar11.a();
                            return;
                        }
                        int size8 = r152.size();
                        while (true) {
                            if (i >= size8) {
                                break;
                            }
                            Object obj6 = r152.get(i);
                            if (((cpl) obj6).d) {
                                obj4 = obj6;
                                break;
                            }
                            i++;
                        }
                        cpl cplVar12 = (cpl) obj4;
                        if (cplVar12 != null) {
                            aotVar.c = cplVar12.a;
                            return;
                        }
                        if (cplVar11.g || !ca.aJ(cplVar11)) {
                            aouVar2.g();
                        } else {
                            cpk cpkVar3 = new cpk(aagdVar.a);
                            sm smVarK = aouVar2.k();
                            aoe aoeVar4 = aouVar2.a;
                            smVarK.d(cplVar11.b, a.ai(ca.aG(cplVar11, aoeVar4.d, cpkVar3), aouVar2.b));
                            float fC = ((dcc) bzi.x(aoeVar4, dbc.n)).c();
                            long jC = aouVar2.k().c(roc.aA(fC, fC));
                            aouVar2.k().e();
                            aoeVar4.K(new anr(aoi.b(jC), true));
                        }
                        aouVar2.b();
                    }
                }
            }
        }
    }

    @Override // defpackage.cpm
    public final void I() {
        aou aouVar = this.F;
        if (aouVar != null) {
            aouVar.f();
        }
    }

    public final void K(ca caVar) {
        if ((caVar instanceof anq) && !this.h) {
            this.h = true;
            X();
        }
        i().j(caVar);
    }

    @Override // defpackage.ajx
    public final String d() {
        if (this.f) {
            ca caVar = this.H;
            if (caVar instanceof ank) {
                return ((ank) caVar).d ? "waiting" : "idle";
            }
            if ((caVar instanceof anm) || (caVar instanceof anl)) {
                return "waiting";
            }
            if (caVar instanceof ann) {
                return "recognized";
            }
        }
        return "idle";
    }

    public abstract Object ee(afeg afegVar, afck afckVar);

    public abstract void ef(anr anrVar);

    @Override // defpackage.cys
    public final /* synthetic */ long eq() {
        return ty.c(0, 0, 0, 0);
    }

    public abstract void j(long j);

    public abstract boolean k();

    @Override // defpackage.aog
    public final api n() {
        return this.d;
    }

    @Override // defpackage.cys
    public final void o() {
        if (this.c) {
            ei();
        }
        this.c = false;
    }

    @Override // defpackage.cfx
    /* renamed from: p */
    public /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cfx
    public final void q() {
        this.h = false;
        w();
        this.p = 0L;
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.afck r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aoa
            if (r0 == 0) goto L13
            r0 = r6
            aoa r0 = (defpackage.aoa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aoa r0 = new aoa
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.woy.dF(r6)
            arw r6 = r5.b
            if (r6 == 0) goto L4c
            asf r2 = r5.a
            if (r2 == 0) goto L49
            arv r4 = new arv
            r4.<init>(r6)
            r0.c = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 == r1) goto L48
            goto L49
        L48:
            return r1
        L49:
            r6 = 0
            r5.b = r6
        L4c:
            anr r6 = new anr
            r0 = 0
            r2 = 0
            r6.<init>(r0, r2)
            r5.ef(r6)
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoe.r(afck):java.lang.Object");
    }

    public void s(cql cqlVar, cqm cqmVar, long j) {
        Object obj;
        Object obj2;
        String str;
        String str2;
        Object obj3;
        boolean z = true;
        this.c = true;
        if (this.f) {
            F();
            if (this.H == null) {
                this.H = eg();
            }
            ca caVar = this.H;
            if (caVar == null) {
                throw new IllegalArgumentException("currentDragState should not be null");
            }
            int i = 2;
            Object obj4 = null;
            if (caVar instanceof ank) {
                ank ankVar = (ank) caVar;
                List list = cqlVar.a;
                if (!list.isEmpty() && aqx.f(cqlVar, false)) {
                    cqu cquVar = (cqu) woy.bF(list);
                    int i2 = ankVar.e;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i3 == 2) {
                        i2 = !k() ? 1 : 2;
                    }
                    ankVar.e = i2;
                    if (cqmVar == cqm.a) {
                        if (i2 == 2) {
                            cquVar.b();
                            ankVar.c = true;
                        } else {
                            i = i2;
                        }
                        ankVar.d = true;
                        i2 = i;
                    }
                    if (cqmVar == cqm.b) {
                        if (i2 == 1) {
                            J(this, cquVar, cquVar.a, 0L, 12);
                            return;
                        } else {
                            if (ankVar.c) {
                                L(cquVar, cquVar, 0L);
                                ej(cquVar, 0L);
                                eh(cquVar.a);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(caVar instanceof anm)) {
                if (caVar instanceof anl) {
                    anl anlVar = (anl) caVar;
                    if (cqmVar == cqm.c) {
                        List list2 = cqlVar.a;
                        int size = list2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                if (((cqu) list2.get(i4)).c()) {
                                    z = false;
                                    break;
                                }
                                i4++;
                            } else {
                                break;
                            }
                        }
                        int size2 = list2.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                break;
                            }
                            if (!((cqu) list2.get(i5)).d) {
                                i5++;
                            } else if (!list2.isEmpty()) {
                                if (z) {
                                    long j2 = ((cqu) woy.bF(list2)).c;
                                    cqu cquVar2 = anlVar.c;
                                    cquVar2.getClass();
                                    long jY = aclh.y(j2, cquVar2.c);
                                    cqu cquVar3 = anlVar.c;
                                    if (cquVar3 == null) {
                                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                    }
                                    J(this, cquVar3, anlVar.d, jY, 8);
                                    return;
                                }
                                return;
                            }
                        }
                        l();
                        return;
                    }
                    return;
                }
                if (!(caVar instanceof ann)) {
                    throw new aezs();
                }
                ann annVar = (ann) caVar;
                if (cqmVar == cqm.b) {
                    long j3 = annVar.c;
                    List list3 = cqlVar.a;
                    int size3 = list3.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size3) {
                            obj = null;
                            break;
                        }
                        obj = list3.get(i6);
                        if (((cqu) obj).a == j3) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    cqu cquVar4 = (cqu) obj;
                    if (cquVar4 != null) {
                        if (!tl.m(cquVar4)) {
                            if (cquVar4.c()) {
                                B();
                                return;
                            } else {
                                ej(cquVar4, tl.p(cquVar4));
                                cquVar4.b();
                                return;
                            }
                        }
                        int size4 = list3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                break;
                            }
                            Object obj5 = list3.get(i7);
                            if (((cqu) obj5).d) {
                                obj4 = obj5;
                                break;
                            }
                            i7++;
                        }
                        cqu cquVar5 = (cqu) obj4;
                        if (cquVar5 != null) {
                            annVar.c = cquVar5.a;
                            return;
                        }
                        if (cquVar4.c() || !tl.m(cquVar4)) {
                            B();
                        } else {
                            float fC = ((dcc) bzi.x(this, dbc.n)).c();
                            ((tsu) Y().a).n(cquVar4, 0L);
                            long jC = Y().c(roc.aA(fC, fC));
                            Y().e();
                            i().j(new anr(aoi.b(jC), false));
                            this.c = false;
                        }
                        l();
                        return;
                    }
                    return;
                }
                return;
            }
            anm anmVar = (anm) caVar;
            if (cqmVar != cqm.a) {
                List list4 = cqlVar.a;
                int size5 = list4.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size5) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list4.get(i8);
                    if (((cqu) obj2).a == anmVar.d) {
                        break;
                    } else {
                        i8++;
                    }
                }
                cqu cquVar6 = (cqu) obj2;
                if (cquVar6 == null) {
                    int size6 = list4.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size6) {
                            obj3 = null;
                            break;
                        }
                        obj3 = list4.get(i9);
                        if (((cqu) obj3).d) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    cquVar6 = (cqu) obj3;
                    if (cquVar6 == null) {
                        l();
                        return;
                    }
                    anmVar.d = cquVar6.a;
                }
                if (cqmVar != cqm.b) {
                    str = "AwaitTouchSlop.initialDown was not initialized";
                } else {
                    if (cquVar6.c()) {
                        str2 = "AwaitTouchSlop.initialDown was not initialized";
                        cqu cquVar7 = anmVar.c;
                        if (cquVar7 == null) {
                            throw new IllegalArgumentException(str2);
                        }
                        long j4 = anmVar.d;
                        aqz aqzVar = this.E;
                        if (aqzVar == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                        }
                        m(cquVar7, j4, aqzVar);
                    } else if (tl.m(cquVar6)) {
                        int size7 = list4.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size7) {
                                break;
                            }
                            Object obj6 = list4.get(i10);
                            if (((cqu) obj6).d) {
                                obj4 = obj6;
                                break;
                            }
                            i10++;
                        }
                        cqu cquVar8 = (cqu) obj4;
                        if (cquVar8 == null) {
                            l();
                        } else {
                            anmVar.d = cquVar8.a;
                        }
                        str = "AwaitTouchSlop.initialDown was not initialized";
                    } else {
                        float fAM = ca.aM((dcc) bzi.x(this, dbc.n), cquVar6.i);
                        aqz aqzVar2 = this.E;
                        if (aqzVar2 == null) {
                            throw new IllegalArgumentException("Touch slop detector not initialized.");
                        }
                        long j5 = cquVar6.g;
                        long j6 = cquVar6.c;
                        str2 = "AwaitTouchSlop.initialDown was not initialized";
                        long jB = aqzVar2.b(aclh.y(j6, j5), fAM);
                        if ((jB & 9223372034707292159L) != 9205357640488583168L) {
                            this.j = a.ai(this.j, tl.p(cquVar6));
                            float fAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.j & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (r11 >> 32))));
                            api apiVar = this.d;
                            float f = fAtan2 * 57.29578f;
                            boolean zC = apiVar == null ? true : aoi.c(apiVar, f);
                            affq affqVar = new affq();
                            ale aleVar = new ale(f, affqVar, i);
                            afeh afehVar = aoi.a;
                            ca.bd(this, new acm(aleVar, 14));
                            if (zC || !affqVar.a) {
                                cquVar6.b();
                                cqu cquVar9 = anmVar.c;
                                cquVar9.getClass();
                                L(cquVar9, cquVar6, jB);
                                ej(cquVar6, jB);
                                eh(cquVar6.a);
                            } else {
                                anmVar.e = true;
                            }
                        } else {
                            anmVar.e = true;
                            this.j = a.ai(this.j, aclh.y(j6, j5));
                        }
                    }
                    str = str2;
                }
                if (cqmVar == cqm.c && anmVar.e) {
                    if (!cquVar6.c()) {
                        anmVar.e = false;
                        return;
                    }
                    cqu cquVar10 = anmVar.c;
                    if (cquVar10 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    long j7 = anmVar.d;
                    aqz aqzVar3 = this.E;
                    if (aqzVar3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    m(cquVar10, j7, aqzVar3);
                }
            }
        }
    }

    @Override // defpackage.cys
    public final /* synthetic */ void t() {
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r2.b(r8, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.anq r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aob
            if (r0 == 0) goto L13
            r0 = r8
            aob r0 = (defpackage.aob) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aob r0 = new aob
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            arw r7 = r0.e
            anq r0 = r0.d
            defpackage.woy.dF(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            anq r7 = r0.d
            defpackage.woy.dF(r8)
            goto L56
        L3c:
            defpackage.woy.dF(r8)
            arw r8 = r6.b
            if (r8 == 0) goto L56
            asf r2 = r6.a
            if (r2 == 0) goto L56
            arv r5 = new arv
            r5.<init>(r8)
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 == r1) goto L6c
        L56:
            arw r8 = new arw
            r8.<init>()
            asf r2 = r6.a
            if (r2 == 0) goto L6d
            r0.d = r7
            r0.e = r8
            r0.c = r3
            java.lang.Object r0 = r2.b(r8, r0)
            if (r0 == r1) goto L6c
            goto L6d
        L6c:
            return r1
        L6d:
            r0 = r7
            r7 = r8
        L6f:
            r6.b = r7
            long r7 = r0.c
            r6.j(r7)
            afak r6 = defpackage.afak.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoe.u(anq, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.anr r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aoc
            if (r0 == 0) goto L13
            r0 = r7
            aoc r0 = (defpackage.aoc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aoc r0 = new aoc
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            anr r6 = r0.d
            defpackage.woy.dF(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.woy.dF(r7)
            arw r7 = r5.b
            if (r7 == 0) goto L50
            asf r2 = r5.a
            if (r2 == 0) goto L4d
            arx r4 = new arx
            r4.<init>(r7)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 == r1) goto L4c
            goto L4d
        L4c:
            return r1
        L4d:
            r7 = 0
            r5.b = r7
        L50:
            r5.ef(r6)
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoe.v(anr, afck):java.lang.Object");
    }

    public final void w() {
        arw arwVar = this.b;
        if (arwVar != null) {
            asf asfVar = this.a;
            if (asfVar != null) {
                asfVar.c(new arv(arwVar));
            }
            this.b = null;
        }
    }

    @Override // defpackage.cys
    public final /* synthetic */ void E() {
    }
}
