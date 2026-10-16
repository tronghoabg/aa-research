package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cwi extends defpackage.cge implements defpackage.cxe, defpackage.cwu, defpackage.czc, defpackage.cza, defpackage.cwb, defpackage.cyy, defpackage.cxc, defpackage.cwv, defpackage.cic, defpackage.ciq, defpackage.ciw, defpackage.cyv, defpackage.che {
    public defpackage.cgd a;
    public boolean b;
    public final java.util.HashSet c;
    public defpackage.ctc d;
    private defpackage.cvw e;

    public cwi(defpackage.cgd cgdVar) {
        this.r = defpackage.cym.a(cgdVar);
        this.a = cgdVar;
        this.b = true;
        this.c = new java.util.HashSet();
    }

    @Override // defpackage.cza
    public final boolean C() {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        return true;
    }

    @Override // defpackage.cza
    public final void E() {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
    }

    @Override // defpackage.cwu
    public final void a() {
        this.b = true;
        defpackage.dai.G(this);
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        boolean z;
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        defpackage.chk chkVar = (defpackage.chk) cgdVar;
        if (this.b && ((z = cgdVar instanceof chj))) {
            if (z) {
                ((defpackage.cez) ((defpackage.czz) defpackage.cjv.t(this)).w.a).b(this, defpackage.cwj.a, new defpackage.cwg(cgdVar, 2));
            }
            this.b = false;
        }
        chkVar.eh(cxnVar);
    }

    @Override // defpackage.ciq
    public final void c(defpackage.cim cimVar) {
        defpackage.cgd cgdVar = this.a;
        if (!(cgdVar instanceof defpackage.cih)) {
            defpackage.csc.c("applyFocusProperties called on wrong node");
        }
        ((defpackage.cih) cgdVar).d();
    }

    @Override // defpackage.cwb
    public final defpackage.cwa d() {
        defpackage.cvw cvwVar = this.e;
        return cvwVar != null ? cvwVar : defpackage.cvx.a;
    }

    @Override // defpackage.cwv
    public final void dA(defpackage.ctc ctcVar) {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        ((defpackage.cuj) cgdVar).d();
    }

    @Override // defpackage.cyb
    public final void dB(long j) {
        defpackage.cgd cgdVar = this.a;
        if (cgdVar instanceof defpackage.cuo) {
            ((defpackage.cuo) cgdVar).d();
        }
    }

    @Override // defpackage.cic
    public final void dC(defpackage.cja cjaVar) {
        defpackage.cgd cgdVar = this.a;
        if (!(cgdVar instanceof defpackage.cib)) {
            defpackage.csc.c("onFocusEvent called on wrong node");
        }
        ((defpackage.cib) cgdVar).d();
    }

    @Override // defpackage.cyy
    public final java.lang.Object ds(java.lang.Object obj) {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        return ((defpackage.cuu) cgdVar).d();
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        return ((defpackage.cth) cgdVar).h(cubVar, ctxVar, j);
    }

    @Override // defpackage.cza
    public final /* synthetic */ long dy() {
        return defpackage.ud.b(0, 0, 0, 0);
    }

    @Override // defpackage.cge
    public final void dz() {
        r(true);
    }

    @Override // defpackage.cxc
    public final void f(defpackage.ctc ctcVar) {
        this.d = ctcVar;
        defpackage.cgd cgdVar = this.a;
        if (cgdVar instanceof defpackage.cum) {
            ((defpackage.cum) cgdVar).d();
        }
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        int i;
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        defpackage.ddo ddoVar = (defpackage.ddo) cgdVar;
        defpackage.ddz ddzVar = new defpackage.ddz();
        ddzVar.a = ddoVar.a;
        ddoVar.b.invoke(ddzVar);
        dekVar.getClass();
        defpackage.ddz ddzVar2 = (defpackage.ddz) dekVar;
        if (ddzVar.a) {
            ddzVar2.a = true;
        }
        if (ddzVar.b) {
            ddzVar2.b = true;
        }
        defpackage.aau aauVar = ddzVar.c;
        java.lang.Object[] objArr = aauVar.b;
        java.lang.Object[] objArr2 = aauVar.c;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        java.lang.Object obj = objArr[i5];
                        java.lang.Object obj2 = objArr2[i5];
                        defpackage.dej dejVar = (defpackage.dej) obj;
                        defpackage.aau aauVar2 = ddzVar2.c;
                        if (!defpackage.aau.f(aauVar2, dejVar)) {
                            aauVar2.m(dejVar, obj2);
                        } else if (obj2 instanceof defpackage.ddn) {
                            java.lang.Object objA = aauVar2.a(dejVar);
                            objA.getClass();
                            defpackage.ddn ddnVar = (defpackage.ddn) objA;
                            java.lang.String str = ddnVar.a;
                            if (str == null) {
                                str = ((defpackage.ddn) obj2).a;
                            }
                            aauVar2.m(dejVar, new defpackage.ddn(str, ddnVar.b));
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        return ((defpackage.cth) cgdVar).d(cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        return ((defpackage.cth) cgdVar).e(cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        return ((defpackage.cth) cgdVar).f(cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        return ((defpackage.cth) cgdVar).g(cszVar, csyVar, i);
    }

    @Override // defpackage.che
    public final long l() {
        return defpackage.dlv.f(defpackage.cjv.s(this, 128).c);
    }

    @Override // defpackage.che
    public final defpackage.dlo m() {
        return defpackage.cjv.r(this).r;
    }

    @Override // defpackage.che
    public final defpackage.dlz n() {
        return defpackage.cjv.r(this).s;
    }

    @Override // defpackage.cza
    public final void o() {
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        defpackage.crg crgVar = ((defpackage.crj) cgdVar).c;
        if (crgVar.d == 2) {
            defpackage.crj crjVar = crgVar.c;
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            defpackage.chs chsVar = new defpackage.chs(crjVar, 8);
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            chsVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            crgVar.b();
        }
    }

    @Override // defpackage.cge
    /* JADX INFO: renamed from: p */
    public final void t() {
        if (this.a instanceof defpackage.crj) {
            o();
        }
    }

    @Override // defpackage.cge
    public final void q() {
        u();
    }

    public final void r(boolean z) {
        if (!this.A) {
            defpackage.csc.c("initializeModifier called on unattached node");
        }
        defpackage.cgd cgdVar = this.a;
        int i = 1;
        if ((this.r & 32) != 0) {
            if (cgdVar instanceof defpackage.cvy) {
                defpackage.cjv.t(this).C(new defpackage.cwg(this, i));
            }
            if (cgdVar instanceof defpackage.cwc) {
                defpackage.cwc cwcVar = (defpackage.cwc) cgdVar;
                defpackage.cvw cvwVar = this.e;
                if (cvwVar == null || !cvwVar.c(cwcVar.e())) {
                    this.e = new defpackage.cvw(cwcVar);
                    defpackage.cge cgeVar = defpackage.cjv.r(this).v.e;
                    cgeVar.getClass();
                    if (((defpackage.czf) cgeVar).a) {
                        defpackage.cvz cvzVar = ((defpackage.czz) defpackage.cjv.t(this)).D;
                        defpackage.cjv cjvVarE = cwcVar.e();
                        cvzVar.b().p(this);
                        cvzVar.c().p(cjvVarE);
                        cvzVar.a();
                    }
                } else {
                    cvwVar.a = cwcVar;
                    defpackage.cvz cvzVar2 = ((defpackage.czz) defpackage.cjv.t(this)).D;
                    defpackage.cjv cjvVarE2 = cwcVar.e();
                    cvzVar2.b().p(this);
                    cvzVar2.c().p(cjvVarE2);
                    cvzVar2.a();
                }
            }
        }
        if ((this.r & 4) != 0) {
            if (cgdVar instanceof chj) {
                this.b = true;
            }
            if (!z) {
                defpackage.cjv.s(this, 2).ak();
            }
        }
        if ((this.r & 2) != 0) {
            defpackage.cge cgeVar2 = defpackage.cjv.r(this).v.e;
            cgeVar2.getClass();
            if (((defpackage.czf) cgeVar2).a) {
                defpackage.cyl cylVar = this.w;
                cylVar.getClass();
                ((defpackage.cxh) cylVar).H(this);
                cylVar.am();
            }
            if (!z) {
                defpackage.cjv.s(this, 2).ak();
                defpackage.cjv.r(this).I();
            }
        }
        if (cgdVar instanceof defpackage.cvb) {
            ((defpackage.cvb) cgdVar).d(defpackage.cjv.r(this));
        }
        if ((this.r & 128) != 0 && (cgdVar instanceof defpackage.cuo)) {
            defpackage.cge cgeVar3 = defpackage.cjv.r(this).v.e;
            cgeVar3.getClass();
            if (((defpackage.czf) cgeVar3).a) {
                defpackage.cjv.r(this).I();
            }
        }
        if ((this.r & 4194304) != 0 && (cgdVar instanceof defpackage.cum)) {
            this.d = null;
            defpackage.cge cgeVar4 = defpackage.cjv.r(this).v.e;
            cgeVar4.getClass();
            if (((defpackage.czf) cgeVar4).a) {
                defpackage.cyu cyuVarT = defpackage.cjv.t(this);
                defpackage.czz czzVar = (defpackage.czz) cyuVarT;
                czzVar.z.d.n(new defpackage.cwh(this));
                czzVar.U(null);
            }
        }
        if ((this.r & 256) != 0 && (cgdVar instanceof defpackage.cuj)) {
            defpackage.cge cgeVar5 = defpackage.cjv.r(this).v.e;
            cgeVar5.getClass();
            if (((defpackage.czf) cgeVar5).a) {
                defpackage.cjv.r(this).I();
            }
        }
        if (cgdVar instanceof defpackage.civ) {
            ((defpackage.civ) cgdVar).d().d.n(this);
        }
        int i2 = this.r;
        if ((i2 & 16) != 0 && (cgdVar instanceof defpackage.crj)) {
            ((defpackage.crj) cgdVar).c.a = this.w;
        }
        if ((i2 & 8) != 0) {
            defpackage.cjv.t(this).B();
        }
    }

    @Override // defpackage.cza
    public final void s(defpackage.cqu cquVar, defpackage.cqv cqvVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        defpackage.cgd cgdVar = this.a;
        cgdVar.getClass();
        defpackage.crg crgVar = ((defpackage.crj) cgdVar).c;
        java.util.List list = cquVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            defpackage.crd crdVar = (defpackage.crd) list.get(i);
            if (defpackage.tq.j(crdVar) || defpackage.tq.l(crdVar)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((defpackage.crd) list.get(i2)).c()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        defpackage.crj crjVar = crgVar.c;
        if (crjVar.b) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                defpackage.crd crdVar2 = (defpackage.crd) list.get(i3);
                if (!defpackage.tq.j(crdVar2) && !defpackage.tq.l(crdVar2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        if (crgVar.d != 3) {
            if (cqvVar == defpackage.cqv.a && z3) {
                crgVar.b = cquVar;
                crgVar.a(cquVar, !z || crjVar.b);
            }
            if (cqvVar == defpackage.cqv.b && z && defpackage.afga.f(cquVar, crgVar.b) && crjVar.b) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((defpackage.crd) list.get(i4)).b();
                }
            }
            if (cqvVar == defpackage.cqv.c && !z3 && !defpackage.afga.f(cquVar, crgVar.b)) {
                crgVar.a(cquVar, true);
            }
        }
        if (cqvVar == defpackage.cqv.c) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    crgVar.b();
                    break;
                } else if (!defpackage.tq.l((defpackage.crd) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (defpackage.afga.f(cquVar, crgVar.b) && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((defpackage.crd) list.get(i6)).c()) {
                        if (crjVar.b) {
                            break;
                        }
                        crgVar.c(cquVar);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((defpackage.crd) list.get(i7)).b();
                }
            }
        }
    }

    @Override // defpackage.cza
    public final /* synthetic */ void t() {
        o();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    public final void u() {
        if (!this.A) {
            defpackage.csc.c("unInitializeModifier called on unattached node");
        }
        defpackage.cgd cgdVar = this.a;
        if ((this.r & 32) != 0) {
            if (cgdVar instanceof defpackage.cwc) {
                defpackage.cvz cvzVar = ((defpackage.czz) defpackage.cjv.t(this)).D;
                defpackage.cjv cjvVarE = ((defpackage.cwc) cgdVar).e();
                defpackage.aan aanVar = cvzVar.d;
                if (aanVar == null) {
                    aanVar = new defpackage.aan(16);
                    cvzVar.d = aanVar;
                }
                aanVar.p(defpackage.cjv.r(this));
                cvzVar.d().p(cjvVarE);
                cvzVar.a();
            }
            if (cgdVar instanceof defpackage.cvy) {
                ((defpackage.cvy) cgdVar).d();
            }
        }
        if ((this.r & 8) != 0) {
            defpackage.cjv.t(this).B();
        }
        if (cgdVar instanceof defpackage.civ) {
            ((defpackage.civ) cgdVar).d().d.m(this);
        }
    }

    public final void v() {
        if (this.A) {
            this.c.clear();
            defpackage.cyx cyxVar = ((defpackage.czz) defpackage.cjv.t(this)).w;
            ((defpackage.cez) cyxVar.a).b(this, defpackage.cwj.b, new defpackage.cwg(this, 0));
        }
    }

    @Override // defpackage.cyv
    public final boolean w() {
        return this.A;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }
}
