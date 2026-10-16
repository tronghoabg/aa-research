package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class aoj extends defpackage.cwo implements defpackage.cza, defpackage.cpv, defpackage.cwm, defpackage.aol {
    private defpackage.are D;
    private defpackage.aoz E;
    private defpackage.ca F;
    private defpackage.ask a;
    private defpackage.asb b;
    private boolean c;
    public defpackage.apn d;
    public defpackage.affc e;
    public boolean f;
    public aiyk g;
    public boolean h;
    private defpackage.anp i;
    private long j = 0;
    private defpackage.cwn k;
    private defpackage.cwn l;
    private defpackage.ans m;
    private defpackage.anr n;
    private defpackage.anq o;
    private defpackage.zz p;

    public aoj(defpackage.affc affcVar, boolean z, defpackage.ask askVar, defpackage.apn apnVar) {
        this.d = apnVar;
        this.e = affcVar;
        this.f = z;
        this.a = askVar;
    }

    private final void A() {
        defpackage.cwn cwnVar = this.l;
        if (cwnVar != null) {
            V(cwnVar);
        }
        defpackage.cwn cwnVar2 = this.k;
        if (cwnVar2 != null) {
            V(cwnVar2);
        }
        this.l = null;
        this.k = null;
    }

    private final void B() {
        i().j(defpackage.ant.c);
    }

    static /* synthetic */ void J(defpackage.aoj aojVar, defpackage.crd crdVar, long j, long j2, int i) {
        defpackage.anr anrVar = aojVar.n;
        if (anrVar == null) {
            anrVar = new defpackage.anr();
            aojVar.n = anrVar;
        }
        anrVar.c = crdVar;
        anrVar.d = j;
        defpackage.are areVar = aojVar.D;
        if (areVar == null) {
            aojVar.D = new defpackage.are(aojVar.d, 0L);
        } else {
            if ((i & 4) != 0) {
                j2 = 0;
            }
            areVar.a = aojVar.d;
            areVar.b = j2;
        }
        anrVar.e = false;
        aojVar.F = anrVar;
    }

    private final void L() {
        this.h = true;
        if (this.g == null) {
            this.g = defpackage.afqt.q(Integer.MAX_VALUE, 0, 6);
        }
        ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.aoi(this, null), 3);
    }

    private final void X(long j) {
        this.j = defpackage.a.ah(this.j, j);
        i().j(new defpackage.anu(j, false));
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private final defpackage.anp m24do() {
        defpackage.anp anpVar = this.i;
        if (anpVar != null) {
            return anpVar;
        }
        defpackage.anp anpVar2 = new defpackage.anp(null);
        this.i = anpVar2;
        return anpVar2;
    }

    private final void dp(long j, boolean z) {
        defpackage.ans ansVar = this.m;
        if (ansVar == null) {
            ansVar = new defpackage.ans();
            this.m = ansVar;
        }
        ansVar.c = j;
        ansVar.d = false;
        ansVar.e = z;
        this.F = ansVar;
    }

    private final void dq() {
        l();
        if (this.h) {
            B();
        }
        this.p = null;
    }

    private final void dr(defpackage.crd crdVar, defpackage.crd crdVar2, long j) {
        long jR = defpackage.acmj.r(crdVar2.c, j);
        if (((java.lang.Boolean) this.e.invoke(new defpackage.crl(crdVar.i))).booleanValue()) {
            if (!this.h) {
                if (this.g == null) {
                    this.g = defpackage.afqt.q(Integer.MAX_VALUE, 0, 6);
                }
                L();
            }
            defpackage.csc.g(defpackage.cjv.p(this)).k(0L);
            i().j(new defpackage.anv(jR));
        }
    }

    private final aiyk i() {
        aiyk aiykVar = this.g;
        if (aiykVar != null) {
            return aiykVar;
        }
        throw new java.lang.IllegalArgumentException("Events channel not initialized.");
    }

    private final void l() {
        this.j = 0L;
        defpackage.anp anpVarM24do = m24do();
        anpVarM24do.e = 3;
        anpVarM24do.c = false;
        anpVarM24do.d = false;
        this.F = anpVarM24do;
    }

    private final void m(defpackage.crd crdVar, long j, defpackage.are areVar) {
        defpackage.anq anqVar = this.o;
        if (anqVar == null) {
            anqVar = new defpackage.anq();
            this.o = anqVar;
        }
        anqVar.c = crdVar;
        anqVar.d = j;
        areVar.b = 0L;
        this.F = anqVar;
    }

    @Override // defpackage.cza
    public final /* synthetic */ boolean C() {
        return false;
    }

    protected final void F() {
        if (this.k == null) {
            defpackage.akd akdVar = new defpackage.akd(this);
            W(akdVar);
            this.k = akdVar;
        }
    }

    public final void G(defpackage.affc affcVar, boolean z, defpackage.ask askVar, defpackage.apn apnVar, boolean z2) {
        this.e = affcVar;
        if (this.f != z) {
            this.f = z;
            z2 = true;
            if (!z) {
                A();
                w();
                this.E = null;
            }
        }
        if (!defpackage.afga.f(this.a, askVar)) {
            w();
            this.a = askVar;
        }
        if (this.d != apnVar) {
            this.d = apnVar;
        } else if (!z2) {
            return;
        }
        if (this.c) {
            dq();
        }
        defpackage.aoz aozVar = this.E;
        if (aozVar != null) {
            aozVar.f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.cpv
    public final void H(defpackage.aahg aahgVar, defpackage.cqv cqvVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        if (this.f) {
            defpackage.aoz aozVar = this.E;
            if (aozVar == null) {
                aozVar = new defpackage.aoz(this);
                this.E = aozVar;
            }
            if (this.l == null) {
                aozVar.getClass();
                defpackage.akd akdVar = new defpackage.akd(aozVar);
                W(akdVar);
                this.l = akdVar;
            }
            defpackage.aoz aozVar2 = this.E;
            if (aozVar2 != null) {
                if (aozVar2.d == null) {
                    aozVar2.d = aozVar2.a();
                }
                defpackage.ca caVar = aozVar2.d;
                if (caVar == null) {
                    throw new java.lang.IllegalArgumentException("currentDragState should not be null");
                }
                java.lang.Object obj4 = null;
                int i = 0;
                boolean z = true;
                if (caVar instanceof defpackage.aov) {
                    defpackage.aov aovVar = (defpackage.aov) caVar;
                    ?? r0 = aahgVar.b;
                    if (r0.isEmpty()) {
                        return;
                    }
                    int size = r0.size();
                    while (i < size) {
                        if (!defpackage.ca.aI((cpu) r0.get(i))) {
                            return;
                        } else {
                            i++;
                        }
                    }
                    cpu cpuVar = (cpu) defpackage.afga.az(r0);
                    int i2 = aovVar.e;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    int i4 = 2;
                    if (i3 == 2) {
                        i2 = !aozVar2.a.k() ? 1 : 2;
                    }
                    aovVar.e = i2;
                    if (cqvVar == defpackage.cqv.a) {
                        if (i2 == 2) {
                            cpuVar.a();
                            aovVar.c = true;
                        } else {
                            i4 = i2;
                        }
                        aovVar.d = true;
                        i2 = i4;
                    }
                    if (cqvVar == defpackage.cqv.b) {
                        if (i2 == 1) {
                            defpackage.aoz.j(aozVar2, cpuVar, cpuVar.a, 0L, 12);
                            return;
                        } else {
                            if (aovVar.c) {
                                int i5 = aahgVar.a;
                                aozVar2.i(cpuVar, cpuVar, new defpackage.cpt(i5), 0L);
                                aozVar2.h(cpuVar, new defpackage.cpt(i5), 0L);
                                aozVar2.e(cpuVar.a);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (caVar instanceof defpackage.aox) {
                    defpackage.aox aoxVar = (defpackage.aox) caVar;
                    if (cqvVar != defpackage.cqv.a) {
                        ?? r1 = aahgVar.b;
                        int size2 = r1.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = r1.get(i6);
                            if (((cpu) obj2).a == aoxVar.d) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        cpu cpuVar2 = (cpu) obj2;
                        if (cpuVar2 == null) {
                            int size3 = r1.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size3) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = r1.get(i7);
                                if (((cpu) obj3).d) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            cpuVar2 = (cpu) obj3;
                            if (cpuVar2 == null) {
                                aozVar2.b();
                                return;
                            }
                            aoxVar.d = cpuVar2.a;
                        }
                        cpu cpuVar3 = cpuVar2;
                        if (cqvVar == defpackage.cqv.b) {
                            if (cpuVar3.g) {
                                cpu cpuVar4 = aoxVar.c;
                                if (cpuVar4 == null) {
                                    throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                }
                                long j = aoxVar.d;
                                defpackage.are areVar = aozVar2.c;
                                if (areVar == null) {
                                    throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                                }
                                aozVar2.c(cpuVar4, j, areVar);
                            } else if (defpackage.ca.aJ(cpuVar3)) {
                                int size4 = r1.size();
                                for (int i8 = 0; i8 < size4; i8++) {
                                    java.lang.Object obj5 = r1.get(i8);
                                    if (((cpu) obj5).d) {
                                        obj4 = obj5;
                                        break;
                                    }
                                }
                                cpu cpuVar5 = (cpu) obj4;
                                if (cpuVar5 == null) {
                                    aozVar2.b();
                                } else {
                                    aoxVar.d = cpuVar5.a;
                                }
                            } else {
                                defpackage.aoj aojVar = aozVar2.a;
                                float fAM = defpackage.ca.aM((defpackage.dck) defpackage.cjv.y(aojVar, defpackage.dbl.n), 1);
                                defpackage.are areVar2 = aozVar2.c;
                                if (areVar2 == null) {
                                    throw new java.lang.IllegalArgumentException("Touch slop detector not initialized.");
                                }
                                defpackage.apn apnVar = aojVar.d;
                                int i9 = aahgVar.a;
                                defpackage.cpt cptVar = new defpackage.cpt(i9);
                                long jB = areVar2.b(defpackage.acmj.r(defpackage.ca.aG(cpuVar3, apnVar, cptVar), defpackage.ca.aH(cpuVar3, apnVar, cptVar)), fAM);
                                if ((9223372034707292159L & jB) != 9205357640488583168L) {
                                    cpuVar3.a();
                                    cpu cpuVar6 = aoxVar.c;
                                    cpuVar6.getClass();
                                    aozVar2.i(cpuVar6, cpuVar3, new defpackage.cpt(i9), jB);
                                    aozVar2.h(cpuVar3, new defpackage.cpt(i9), jB);
                                    aozVar2.e(cpuVar3.a);
                                } else {
                                    aoxVar.e = true;
                                }
                            }
                        }
                        if (cqvVar == defpackage.cqv.c && aoxVar.e) {
                            if (!cpuVar3.g) {
                                aoxVar.e = false;
                                return;
                            }
                            cpu cpuVar7 = aoxVar.c;
                            if (cpuVar7 == null) {
                                throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                            }
                            long j2 = aoxVar.d;
                            defpackage.are areVar3 = aozVar2.c;
                            if (areVar3 == null) {
                                throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                            }
                            aozVar2.c(cpuVar7, j2, areVar3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (caVar instanceof defpackage.aow) {
                    defpackage.aow aowVar = (defpackage.aow) caVar;
                    if (cqvVar == defpackage.cqv.c) {
                        ?? r15 = aahgVar.b;
                        int size5 = r15.size();
                        for (int i10 = 0; i10 < size5; i10++) {
                            if (((cpu) r15.get(i10)).g) {
                                z = false;
                                break;
                            }
                        }
                        int size6 = r15.size();
                        while (i < size6) {
                            if (((cpu) r15.get(i)).d) {
                                if (r15.isEmpty()) {
                                    break;
                                }
                                if (z) {
                                    cpu cpuVar8 = (cpu) defpackage.afga.az(r15);
                                    defpackage.aoj aojVar2 = aozVar2.a;
                                    int i11 = aahgVar.a;
                                    long jAG = defpackage.ca.aG(cpuVar8, aojVar2.d, new defpackage.cpt(i11));
                                    cpu cpuVar9 = aowVar.c;
                                    cpuVar9.getClass();
                                    long jR = defpackage.acmj.r(jAG, defpackage.ca.aG(cpuVar9, aojVar2.d, new defpackage.cpt(i11)));
                                    cpu cpuVar10 = aowVar.c;
                                    if (cpuVar10 == null) {
                                        throw new java.lang.IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                    }
                                    defpackage.aoz.j(aozVar2, cpuVar10, aowVar.d, jR, 8);
                                    return;
                                }
                                return;
                            }
                            i++;
                        }
                        aozVar2.b();
                        return;
                    }
                    return;
                }
                if (!(caVar instanceof defpackage.aoy)) {
                    throw new defpackage.afas();
                }
                defpackage.aoy aoyVar = (defpackage.aoy) caVar;
                if (cqvVar == defpackage.cqv.b) {
                    long j3 = aoyVar.c;
                    ?? r16 = aahgVar.b;
                    int size7 = r16.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size7) {
                            obj = null;
                            break;
                        }
                        obj = r16.get(i12);
                        if (((cpu) obj).a == j3) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    cpu cpuVar11 = (cpu) obj;
                    if (cpuVar11 != null) {
                        if (!defpackage.ca.aJ(cpuVar11)) {
                            if (cpuVar11.g) {
                                aozVar2.g();
                                return;
                            }
                            defpackage.aoj aojVar3 = aozVar2.a;
                            int i13 = aahgVar.a;
                            defpackage.apn apnVar2 = aojVar3.d;
                            defpackage.cpt cptVar2 = new defpackage.cpt(i13);
                            aozVar2.h(cpuVar11, new defpackage.cpt(i13), true != cpuVar11.g ? defpackage.acmj.r(defpackage.ca.aG(cpuVar11, apnVar2, cptVar2), defpackage.ca.aH(cpuVar11, apnVar2, cptVar2)) : 0L);
                            cpuVar11.a();
                            return;
                        }
                        int size8 = r16.size();
                        while (i < size8) {
                            java.lang.Object obj6 = r16.get(i);
                            if (((cpu) obj6).d) {
                                obj4 = obj6;
                                break;
                            }
                            i++;
                        }
                        cpu cpuVar12 = (cpu) obj4;
                        if (cpuVar12 != null) {
                            aoyVar.c = cpuVar12.a;
                            return;
                        }
                        if (cpuVar11.g || !defpackage.ca.aJ(cpuVar11)) {
                            aozVar2.g();
                        } else {
                            defpackage.cpt cptVar3 = new defpackage.cpt(aahgVar.a);
                            defpackage.sr srVarK = aozVar2.k();
                            defpackage.aoj aojVar4 = aozVar2.a;
                            srVarK.d(cpuVar11.b, defpackage.a.ah(defpackage.ca.aG(cpuVar11, aojVar4.d, cptVar3), aozVar2.b));
                            float fC = ((defpackage.dck) defpackage.cjv.y(aojVar4, defpackage.dbl.n)).c();
                            long jC = aozVar2.k().c(defpackage.tna.aK(fC, fC));
                            aozVar2.k().e();
                            aojVar4.K(new defpackage.anw(defpackage.aon.b(jC), true));
                        }
                        aozVar2.b();
                    }
                }
            }
        }
    }

    @Override // defpackage.cpv
    public final void I() {
        defpackage.aoz aozVar = this.E;
        if (aozVar != null) {
            aozVar.f();
        }
    }

    public final void K(defpackage.ca caVar) {
        if ((caVar instanceof defpackage.anv) && !this.h) {
            this.h = true;
            L();
        }
        i().j(caVar);
    }

    @Override // defpackage.akc
    public final java.lang.String d() {
        if (this.f) {
            defpackage.ca caVar = this.F;
            if (caVar instanceof defpackage.anp) {
                return ((defpackage.anp) caVar).d ? "waiting" : "idle";
            }
            if ((caVar instanceof defpackage.anr) || (caVar instanceof defpackage.anq)) {
                return "waiting";
            }
            if (caVar instanceof defpackage.ans) {
                return "recognized";
            }
        }
        return "idle";
    }

    public abstract java.lang.Object dm(defpackage.affg affgVar, defpackage.afdk afdkVar);

    public abstract void dn(defpackage.anw anwVar);

    @Override // defpackage.cza
    public final /* synthetic */ long dy() {
        return defpackage.ud.b(0, 0, 0, 0);
    }

    public abstract void j(long j);

    public abstract boolean k();

    @Override // defpackage.aol
    public final defpackage.apn n() {
        return this.d;
    }

    @Override // defpackage.cza
    public final void o() {
        if (this.c) {
            dq();
        }
        this.c = false;
    }

    @Override // defpackage.cge
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cge
    public final void q() {
        this.h = false;
        w();
        A();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aof aofVar;
        if (afdkVar instanceof defpackage.aof) {
            aofVar = (defpackage.aof) afdkVar;
            int i = aofVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aofVar.c = i - Integer.MIN_VALUE;
            } else {
                aofVar = new defpackage.aof(this, afdkVar);
            }
        } else {
            aofVar = new defpackage.aof(this, afdkVar);
        }
        java.lang.Object obj = aofVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aofVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            defpackage.asb asbVar = this.b;
            if (asbVar != null) {
                defpackage.ask askVar = this.a;
                if (askVar != null) {
                    defpackage.asa asaVar = new defpackage.asa(asbVar);
                    aofVar.c = 1;
                    if (askVar.b(asaVar, aofVar) == afdrVar) {
                        return afdrVar;
                    }
                }
            }
            dn(new defpackage.anw(0L, false));
            return defpackage.afbk.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.afga.cz(obj);
        this.b = null;
        dn(new defpackage.anw(0L, false));
        return defpackage.afbk.a;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0248  */
    /* JADX WARN: Code duplicated, block: B:125:0x024e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0254  */
    /* JADX WARN: Code duplicated, block: B:129:0x025b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0267 A[LOOP:8: B:128:0x0259->B:132:0x0267, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0270  */
    /* JADX WARN: Code duplicated, block: B:137:0x0275  */
    /* JADX WARN: Code duplicated, block: B:138:0x027b  */
    /* JADX WARN: Code duplicated, block: B:140:0x028d  */
    /* JADX WARN: Code duplicated, block: B:142:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:151:0x0309  */
    /* JADX WARN: Code duplicated, block: B:152:0x031e  */
    /* JADX WARN: Code duplicated, block: B:153:0x032e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0336  */
    /* JADX WARN: Code duplicated, block: B:157:0x033b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0341  */
    /* JADX WARN: Code duplicated, block: B:160:0x0345  */
    /* JADX WARN: Code duplicated, block: B:162:0x034b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0351  */
    /* JADX WARN: Code duplicated, block: B:273:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:275:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:308:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x026c A[EDGE_INSN: B:309:0x026c->B:134:0x026c BREAK  A[LOOP:8: B:128:0x0259->B:132:0x0267], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    public void s(defpackage.cqu cquVar, defpackage.cqv cqvVar, long j) {
        ?? r25;
        ?? r13;
        boolean z;
        int i;
        ?? r6;
        defpackage.sr srVar;
        ?? r4;
        boolean z2;
        ?? r7;
        java.lang.String str;
        defpackage.crd crdVar;
        long j2;
        defpackage.are areVar;
        float fAM;
        defpackage.are areVar2;
        long j3;
        long j4;
        long jB;
        defpackage.apn apnVar;
        float f;
        boolean zC;
        int size;
        int i2;
        ?? r11;
        defpackage.crd crdVar2;
        ?? r8;
        java.util.List list;
        int size2;
        int i3;
        defpackage.crd crdVar3;
        defpackage.zz zzVar;
        ?? r9;
        boolean z3;
        int i4;
        int i5;
        java.lang.Object obj;
        defpackage.zz zzVar2;
        byte[] bArr;
        this.c = true;
        if (this.f) {
            F();
            if (this.F == null) {
                this.F = m24do();
            }
            defpackage.cqv cqvVar2 = defpackage.cqv.b;
            byte[] bArr2 = null;
            if (cqvVar == cqvVar2) {
                defpackage.zz zzVar3 = this.p;
                if (zzVar3 == null) {
                    zzVar3 = new defpackage.zz(10);
                    this.p = zzVar3;
                }
                java.util.List list2 = cquVar.a;
                int size3 = list2.size();
                int i6 = 0;
                while (i6 < size3) {
                    long j5 = ((defpackage.crd) list2.get(i6)).a;
                    if (zzVar3.d(j5) == null) {
                        defpackage.sr srVar2 = new defpackage.sr(bArr2);
                        bArr = bArr2;
                        int i7 = zzVar3.d;
                        if (i7 == 0 || j5 > zzVar3.b[i7 - 1]) {
                            if (zzVar3.a) {
                                long[] jArr = zzVar3.b;
                                if (i7 >= jArr.length) {
                                    java.lang.Object[] objArr = zzVar3.c;
                                    int i8 = 0;
                                    int i9 = 0;
                                    while (i8 < i7) {
                                        long[] jArr2 = jArr;
                                        java.lang.Object obj2 = objArr[i8];
                                        java.lang.Object[] objArr2 = objArr;
                                        if (obj2 != defpackage.aaa.a) {
                                            if (i8 != i9) {
                                                jArr2[i9] = jArr2[i8];
                                                objArr2[i9] = obj2;
                                                objArr2[i8] = bArr;
                                            }
                                            i9++;
                                        }
                                        i8++;
                                        jArr = jArr2;
                                        objArr = objArr2;
                                    }
                                    zzVar3.a = false;
                                    zzVar3.d = i9;
                                    i7 = i9;
                                }
                            }
                            long[] jArr3 = zzVar3.b;
                            if (i7 >= jArr3.length) {
                                int iC = defpackage.abg.c((i7 + 1) * 8) / 8;
                                long[] jArrCopyOf = java.util.Arrays.copyOf(jArr3, iC);
                                jArrCopyOf.getClass();
                                zzVar3.b = jArrCopyOf;
                                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(zzVar3.c, iC);
                                objArrCopyOf.getClass();
                                zzVar3.c = objArrCopyOf;
                            }
                            zzVar3.b[i7] = j5;
                            zzVar3.c[i7] = srVar2;
                            zzVar3.d = i7 + 1;
                        } else {
                            zzVar3.g(j5, srVar2);
                        }
                    } else {
                        bArr = bArr2;
                    }
                    i6++;
                    bArr2 = bArr;
                }
                r25 = bArr2;
                int size4 = list2.size();
                int i10 = 0;
                while (i10 < size4) {
                    defpackage.crd crdVar4 = (defpackage.crd) list2.get(i10);
                    java.lang.Object objD = zzVar3.d(crdVar4.a);
                    objD.getClass();
                    java.lang.Object obj3 = ((defpackage.sr) objD).a;
                    if (defpackage.tq.j(crdVar4)) {
                        ((ttq) obj3).o();
                    }
                    if (defpackage.tq.l(crdVar4)) {
                        i4 = size4;
                        i5 = i10;
                        obj = obj3;
                        zzVar2 = zzVar3;
                    } else {
                        java.util.List listA = crdVar4.a();
                        int size5 = listA.size();
                        int i11 = 0;
                        while (i11 < size5) {
                            defpackage.cqm cqmVar = (defpackage.cqm) listA.get(i11);
                            java.lang.Object obj4 = obj3;
                            ((ttq) obj4).n(cqmVar.a, defpackage.a.ah(cqmVar.e, 0L));
                            i11++;
                            zzVar3 = zzVar3;
                            size4 = size4;
                            i10 = i10;
                            obj3 = obj4;
                        }
                        i4 = size4;
                        i5 = i10;
                        obj = obj3;
                        zzVar2 = zzVar3;
                        ((ttq) obj).n(crdVar4.b, defpackage.a.ah(crdVar4.m, 0L));
                    }
                    if (defpackage.tq.l(crdVar4)) {
                        ttq ttqVar = (ttq) obj;
                        if (crdVar4.b - ttqVar.a > 40) {
                            ttqVar.o();
                        }
                    }
                    ((ttq) obj).a = crdVar4.b;
                    i10 = i5 + 1;
                    zzVar3 = zzVar2;
                    size4 = i4;
                }
            } else {
                r25 = 0;
            }
            defpackage.ca caVar = this.F;
            if (caVar == null) {
                throw new java.lang.IllegalArgumentException("currentDragState should not be null");
            }
            int i12 = 2;
            if (!(caVar instanceof defpackage.anp)) {
                if (caVar instanceof defpackage.anr) {
                    defpackage.anr anrVar = (defpackage.anr) caVar;
                    if (cqvVar != defpackage.cqv.a) {
                        java.util.List list3 = cquVar.a;
                        int size6 = list3.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size6) {
                                r7 = r25;
                                break;
                            }
                            r7 = list3.get(i13);
                            if (((defpackage.crd) r7).a == anrVar.d) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        defpackage.crd crdVar5 = (defpackage.crd) r7;
                        if (crdVar5 == null) {
                            int size7 = list3.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size7) {
                                    r8 = r25;
                                    break;
                                }
                                r8 = list3.get(i14);
                                if (((defpackage.crd) r8).d) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                            crdVar5 = (defpackage.crd) r8;
                            if (crdVar5 == null) {
                                l();
                            } else {
                                anrVar.d = crdVar5.a;
                                if (cqvVar != cqvVar2) {
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                } else if (!crdVar5.c()) {
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    crdVar = anrVar.c;
                                    if (crdVar != null) {
                                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                    }
                                    j2 = anrVar.d;
                                    areVar = this.D;
                                    if (areVar != null) {
                                        throw new java.lang.IllegalArgumentException(str);
                                    }
                                    m(crdVar, j2, areVar);
                                } else if (defpackage.tq.l(crdVar5)) {
                                    size = list3.size();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < size) {
                                            r11 = r25;
                                            break;
                                        }
                                        r11 = list3.get(i2);
                                        if (((defpackage.crd) r11).d) {
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    crdVar2 = (defpackage.crd) r11;
                                    if (crdVar2 == null) {
                                        l();
                                    } else {
                                        anrVar.d = crdVar2.a;
                                    }
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                } else {
                                    fAM = defpackage.ca.aM((defpackage.dck) defpackage.cjv.y(this, defpackage.dbl.n), crdVar5.i);
                                    areVar2 = this.D;
                                    if (areVar2 != null) {
                                        throw new java.lang.IllegalArgumentException("Touch slop detector not initialized.");
                                    }
                                    j3 = crdVar5.g;
                                    j4 = crdVar5.c;
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    jB = areVar2.b(defpackage.acmj.r(j4, j3), fAM);
                                    if ((jB & 9223372034707292159L) != 9205357640488583168L) {
                                        long jAh = defpackage.a.ah(this.j, defpackage.tq.o(crdVar5));
                                        this.j = jAh;
                                        float fAtan2 = (float) java.lang.Math.atan2(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (this.j & 4294967295L))), java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jAh >> 32))));
                                        apnVar = this.d;
                                        f = fAtan2 * 57.29578f;
                                        if (apnVar == null) {
                                            zC = true;
                                        } else {
                                            zC = defpackage.aon.c(apnVar, f);
                                        }
                                        defpackage.afgq afgqVar = new defpackage.afgq();
                                        defpackage.alj aljVar = new defpackage.alj(f, afgqVar, 2);
                                        defpackage.affh affhVar = defpackage.aon.a;
                                        defpackage.ca.bd(this, new defpackage.act(aljVar, 14));
                                        if (zC && afgqVar.a) {
                                            anrVar.e = true;
                                        } else {
                                            crdVar5.b();
                                            defpackage.crd crdVar6 = anrVar.c;
                                            crdVar6.getClass();
                                            dr(crdVar6, crdVar5, jB);
                                            X(jB);
                                            dp(crdVar5.a, false);
                                        }
                                    } else {
                                        anrVar.e = true;
                                        this.j = defpackage.a.ah(this.j, defpackage.acmj.r(j4, j3));
                                    }
                                }
                                if (cqvVar != defpackage.cqv.c && anrVar.e) {
                                    if (crdVar5.c()) {
                                        defpackage.crd crdVar7 = anrVar.c;
                                        if (crdVar7 == null) {
                                            throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                        }
                                        long j6 = anrVar.d;
                                        defpackage.are areVar3 = this.D;
                                        if (areVar3 == null) {
                                            throw new java.lang.IllegalArgumentException(str);
                                        }
                                        m(crdVar7, j6, areVar3);
                                    } else {
                                        anrVar.e = false;
                                        i = 0;
                                    }
                                }
                            }
                        } else {
                            if (cqvVar != cqvVar2) {
                                str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                            } else if (!crdVar5.c()) {
                                str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                crdVar = anrVar.c;
                                if (crdVar != null) {
                                    throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                }
                                j2 = anrVar.d;
                                areVar = this.D;
                                if (areVar != null) {
                                    throw new java.lang.IllegalArgumentException(str);
                                }
                                m(crdVar, j2, areVar);
                            } else if (defpackage.tq.l(crdVar5)) {
                                size = list3.size();
                                i2 = 0;
                                while (true) {
                                    if (i2 < size) {
                                        r11 = r25;
                                        break;
                                    }
                                    r11 = list3.get(i2);
                                    if (((defpackage.crd) r11).d) {
                                        break;
                                        break;
                                    }
                                    i2++;
                                }
                                crdVar2 = (defpackage.crd) r11;
                                if (crdVar2 == null) {
                                    l();
                                } else {
                                    anrVar.d = crdVar2.a;
                                }
                                str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                            } else {
                                fAM = defpackage.ca.aM((defpackage.dck) defpackage.cjv.y(this, defpackage.dbl.n), crdVar5.i);
                                areVar2 = this.D;
                                if (areVar2 != null) {
                                    throw new java.lang.IllegalArgumentException("Touch slop detector not initialized.");
                                }
                                j3 = crdVar5.g;
                                j4 = crdVar5.c;
                                str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                jB = areVar2.b(defpackage.acmj.r(j4, j3), fAM);
                                if ((jB & 9223372034707292159L) != 9205357640488583168L) {
                                    long jAh2 = defpackage.a.ah(this.j, defpackage.tq.o(crdVar5));
                                    this.j = jAh2;
                                    float fAtan3 = (float) java.lang.Math.atan2(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (this.j & 4294967295L))), java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jAh2 >> 32))));
                                    apnVar = this.d;
                                    f = fAtan3 * 57.29578f;
                                    if (apnVar == null) {
                                        zC = true;
                                    } else {
                                        zC = defpackage.aon.c(apnVar, f);
                                    }
                                    defpackage.afgq afgqVar2 = new defpackage.afgq();
                                    defpackage.alj aljVar2 = new defpackage.alj(f, afgqVar2, 2);
                                    defpackage.affh affhVar2 = defpackage.aon.a;
                                    defpackage.ca.bd(this, new defpackage.act(aljVar2, 14));
                                    if (zC) {
                                        crdVar5.b();
                                        defpackage.crd crdVar8 = anrVar.c;
                                        crdVar8.getClass();
                                        dr(crdVar8, crdVar5, jB);
                                        X(jB);
                                        dp(crdVar5.a, false);
                                    } else {
                                        crdVar5.b();
                                        defpackage.crd crdVar9 = anrVar.c;
                                        crdVar9.getClass();
                                        dr(crdVar9, crdVar5, jB);
                                        X(jB);
                                        dp(crdVar5.a, false);
                                    }
                                } else {
                                    anrVar.e = true;
                                    this.j = defpackage.a.ah(this.j, defpackage.acmj.r(j4, j3));
                                }
                            }
                            if (cqvVar != defpackage.cqv.c) {
                            }
                        }
                    }
                } else if (caVar instanceof defpackage.anq) {
                    defpackage.anq anqVar = (defpackage.anq) caVar;
                    if (cqvVar == defpackage.cqv.c) {
                        java.util.List list4 = cquVar.a;
                        int size8 = list4.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size8) {
                                z2 = true;
                                break;
                            } else {
                                if (((defpackage.crd) list4.get(i15)).c()) {
                                    z2 = false;
                                    break;
                                }
                                i15++;
                            }
                        }
                        int size9 = list4.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size9) {
                                if (((defpackage.crd) list4.get(i16)).d) {
                                    if (!list4.isEmpty()) {
                                        if (!z2) {
                                            break;
                                        }
                                        long j7 = ((defpackage.crd) defpackage.afga.az(list4)).c;
                                        defpackage.crd crdVar10 = anqVar.c;
                                        crdVar10.getClass();
                                        long jR = defpackage.acmj.r(j7, crdVar10.c);
                                        defpackage.crd crdVar11 = anqVar.c;
                                        if (crdVar11 == null) {
                                            throw new java.lang.IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                        }
                                        J(this, crdVar11, anqVar.d, jR, 8);
                                        break;
                                    }
                                    break;
                                }
                                i16++;
                            }
                            l();
                            break;
                        }
                    }
                } else {
                    if (!(caVar instanceof defpackage.ans)) {
                        throw new defpackage.afas();
                    }
                    defpackage.ans ansVar = (defpackage.ans) caVar;
                    if (cqvVar == defpackage.cqv.a && ansVar.e) {
                        long j8 = ansVar.c;
                        java.util.List list5 = cquVar.a;
                        int size10 = list5.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size10) {
                                r4 = r25;
                                break;
                            }
                            java.lang.Object obj5 = list5.get(i17);
                            if (((defpackage.crd) obj5).a == j8) {
                                r4 = obj5;
                                break;
                            }
                            i17++;
                        }
                        defpackage.crd crdVar12 = (defpackage.crd) r4;
                        if (crdVar12 != null && !crdVar12.c()) {
                            crdVar12.b();
                            ansVar.d = true;
                        }
                    } else {
                        boolean z4 = true;
                        if (cqvVar == cqvVar2) {
                            long j9 = ansVar.c;
                            java.util.List list6 = cquVar.a;
                            int size11 = list6.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 >= size11) {
                                    r13 = r25;
                                    break;
                                }
                                r13 = list6.get(i18);
                                if (((defpackage.crd) r13).a == j9) {
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                            defpackage.crd crdVar13 = (defpackage.crd) r13;
                            if (crdVar13 != null) {
                                boolean z5 = ansVar.d;
                                if (!crdVar13.c() || z5) {
                                    z = false;
                                    z4 = false;
                                } else {
                                    z = false;
                                }
                                ansVar.d = z;
                                if (defpackage.tq.l(crdVar13)) {
                                    int size12 = list6.size();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= size12) {
                                            r6 = r25;
                                            break;
                                        }
                                        r6 = list6.get(i19);
                                        if (((defpackage.crd) r6).d) {
                                            break;
                                        } else {
                                            i19++;
                                        }
                                    }
                                    defpackage.crd crdVar14 = (defpackage.crd) r6;
                                    if (crdVar14 == null) {
                                        if (z4 || !defpackage.tq.l(crdVar13)) {
                                            i = 0;
                                            B();
                                        } else {
                                            float fC = ((defpackage.dck) defpackage.cjv.y(this, defpackage.dbl.n)).c();
                                            defpackage.zz zzVar4 = this.p;
                                            i = 0;
                                            i().j(new defpackage.anw(defpackage.aon.b((zzVar4 == null || (srVar = (defpackage.sr) zzVar4.d(crdVar13.a)) == null) ? 0L : srVar.c(defpackage.tna.aK(fC, fC))), false));
                                            this.c = false;
                                        }
                                        l();
                                    } else {
                                        i = 0;
                                        ansVar.c = crdVar14.a;
                                    }
                                } else {
                                    i = 0;
                                    if (z4) {
                                        B();
                                    } else {
                                        X(z5 ? defpackage.acmj.r(crdVar13.c, crdVar13.g) : defpackage.tq.o(crdVar13));
                                        crdVar13.b();
                                    }
                                }
                            }
                        }
                    }
                }
                if (cqvVar == cqvVar2) {
                    list = cquVar.a;
                    size2 = list.size();
                    for (i3 = i; i3 < size2; i3++) {
                        crdVar3 = (defpackage.crd) list.get(i3);
                        if (!defpackage.tq.l(crdVar3) && (zzVar = this.p) != null) {
                            zzVar.h(crdVar3.a);
                        }
                    }
                }
            }
            defpackage.anp anpVar = (defpackage.anp) caVar;
            java.util.List list7 = cquVar.a;
            if (!list7.isEmpty()) {
                int size13 = list7.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size13) {
                        r9 = r25;
                        break;
                    }
                    r9 = list7.get(i20);
                    if (defpackage.tq.j((defpackage.crd) r9)) {
                        break;
                    } else {
                        i20++;
                    }
                }
                defpackage.crd crdVar15 = (defpackage.crd) r9;
                if (crdVar15 != null) {
                    int i21 = anpVar.e;
                    int i22 = i21 - 1;
                    if (i21 == 0) {
                        throw r25;
                    }
                    if (i22 == 2) {
                        i21 = !k() ? 1 : 2;
                    }
                    anpVar.e = i21;
                    if (cqvVar == defpackage.cqv.a) {
                        if (i21 == 2) {
                            crdVar15.b();
                            z3 = true;
                            anpVar.c = true;
                        } else {
                            z3 = true;
                            i12 = i21;
                        }
                        anpVar.d = z3;
                        i21 = i12;
                    } else {
                        z3 = true;
                    }
                    if (cqvVar == cqvVar2) {
                        if (i21 == z3) {
                            J(this, crdVar15, crdVar15.a, 0L, 12);
                        } else if (anpVar.c) {
                            dr(crdVar15, crdVar15, 0L);
                            X(0L);
                            dp(crdVar15.a, z3);
                        }
                    }
                }
            }
            i = 0;
            if (cqvVar == cqvVar2) {
                list = cquVar.a;
                size2 = list.size();
                while (i3 < size2) {
                    crdVar3 = (defpackage.crd) list.get(i3);
                    if (!defpackage.tq.l(crdVar3)) {
                    }
                }
            }
        }
    }

    @Override // defpackage.cza
    public final /* synthetic */ void t() {
        o();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r2.b(r8, r0) != r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.anv r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aog
            if (r0 == 0) goto L13
            r0 = r8
            aog r0 = (defpackage.aog) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aog r0 = new aog
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            afdr r1 = defpackage.afdr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            asb r7 = r0.e
            anv r0 = r0.d
            defpackage.afga.cz(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            anv r7 = r0.d
            defpackage.afga.cz(r8)
            goto L56
        L3c:
            defpackage.afga.cz(r8)
            asb r8 = r6.b
            if (r8 == 0) goto L56
            ask r2 = r6.a
            if (r2 == 0) goto L56
            asa r5 = new asa
            r5.<init>(r8)
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 == r1) goto L6c
        L56:
            asb r8 = new asb
            r8.<init>()
            ask r2 = r6.a
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
            afbk r6 = defpackage.afbk.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoj.u(anv, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(defpackage.anw anwVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aoh aohVar;
        if (afdkVar instanceof defpackage.aoh) {
            aohVar = (defpackage.aoh) afdkVar;
            int i = aohVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aohVar.c = i - Integer.MIN_VALUE;
            } else {
                aohVar = new defpackage.aoh(this, afdkVar);
            }
        } else {
            aohVar = new defpackage.aoh(this, afdkVar);
        }
        java.lang.Object obj = aohVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aohVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            defpackage.asb asbVar = this.b;
            if (asbVar != null) {
                defpackage.ask askVar = this.a;
                if (askVar != null) {
                    defpackage.asc ascVar = new defpackage.asc(asbVar);
                    aohVar.d = anwVar;
                    aohVar.c = 1;
                    if (askVar.b(ascVar, aohVar) == afdrVar) {
                        return afdrVar;
                    }
                }
            }
            dn(anwVar);
            return defpackage.afbk.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        anwVar = aohVar.d;
        defpackage.afga.cz(obj);
        this.b = null;
        dn(anwVar);
        return defpackage.afbk.a;
    }

    public final void w() {
        defpackage.asb asbVar = this.b;
        if (asbVar != null) {
            defpackage.ask askVar = this.a;
            if (askVar != null) {
                askVar.c(new defpackage.asa(asbVar));
            }
            this.b = null;
        }
    }

    @Override // defpackage.cza
    public final /* synthetic */ void E() {
    }
}
