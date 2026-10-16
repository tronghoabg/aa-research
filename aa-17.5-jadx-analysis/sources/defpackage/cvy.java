package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class cvy extends cfx implements cwu, cwk, cyu, cys, cvs, cyq, cws, cwl, chu, cii, cio, cyn, cgx {
    public cfw a;
    public boolean b;
    public final HashSet c;
    public cst d;
    private cvn e;

    public cvy(cfw cfwVar) {
        this.r = cyd.a(cfwVar);
        this.a = cfwVar;
        this.b = true;
        this.c = new HashSet();
    }

    @Override // defpackage.cys
    public final boolean C() {
        cfw cfwVar = this.a;
        cfwVar.getClass();
        return true;
    }

    @Override // defpackage.cys
    public final void E() {
        cfw cfwVar = this.a;
        cfwVar.getClass();
    }

    @Override // defpackage.cwk
    public final void a() {
        this.b = true;
        cjn.w(this);
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        boolean z;
        cfw cfwVar = this.a;
        cfwVar.getClass();
        chd chdVar = (chd) cfwVar;
        if (this.b && ((z = cfwVar instanceof chc))) {
            if (z) {
                ((ces) ((czq) bzi.s(this)).w.a).b(this, cvz.a, new cxm(cfwVar, 1));
            }
            this.b = false;
        }
        chdVar.eZ(cxdVar);
    }

    @Override // defpackage.cii
    public final void c(cie cieVar) {
        cfw cfwVar = this.a;
        if (!(cfwVar instanceof chz)) {
            crt.c("applyFocusProperties called on wrong node");
        }
        ((chz) cfwVar).d();
    }

    @Override // defpackage.cvs
    public final cvr d() {
        cvn cvnVar = this.e;
        return cvnVar != null ? cvnVar : cvo.a;
    }

    @Override // defpackage.cyq
    public final Object ek(Object obj) {
        cfw cfwVar = this.a;
        cfwVar.getClass();
        return ((cul) cfwVar).d();
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        cfw cfwVar = this.a;
        cfwVar.getClass();
        return ((csy) cfwVar).h(ctsVar, ctoVar, j);
    }

    @Override // defpackage.cys
    public final /* synthetic */ long eq() {
        return ty.c(0, 0, 0, 0);
    }

    @Override // defpackage.cfx
    public final void er() {
        r(true);
    }

    @Override // defpackage.cwl
    public final void es(cst cstVar) {
        cfw cfwVar = this.a;
        cfwVar.getClass();
        ((cua) cfwVar).d();
    }

    @Override // defpackage.cxs
    public final void et(long j) {
        cfw cfwVar = this.a;
        if (cfwVar instanceof cuf) {
            ((cuf) cfwVar).d();
        }
    }

    @Override // defpackage.chu
    public final void eu(cis cisVar) {
        cfw cfwVar = this.a;
        if (!(cfwVar instanceof cht)) {
            crt.c("onFocusEvent called on wrong node");
        }
        ((cht) cfwVar).d();
    }

    @Override // defpackage.cws
    public final void f(cst cstVar) {
        this.d = cstVar;
        cfw cfwVar = this.a;
        if (cfwVar instanceof cud) {
            ((cud) cfwVar).d();
        }
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        int i;
        char c;
        cfw cfwVar = this.a;
        cfwVar.getClass();
        ddg ddgVar = (ddg) cfwVar;
        ddr ddrVar = new ddr();
        ddrVar.a = ddgVar.a;
        ddgVar.b.invoke(ddrVar);
        decVar.getClass();
        ddr ddrVar2 = (ddr) decVar;
        if (ddrVar.a) {
            ddrVar2.a = true;
        }
        if (ddrVar.b) {
            ddrVar2.b = true;
        }
        aan aanVar = ddrVar.c;
        Object[] objArr = aanVar.b;
        Object[] objArr2 = aanVar.c;
        long[] jArr = aanVar.a;
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
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        deb debVar = (deb) obj;
                        aan aanVar2 = ddrVar2.c;
                        if (!aan.f(aanVar2, debVar)) {
                            aanVar2.m(debVar, obj2);
                        } else if (obj2 instanceof ddf) {
                            Object objA = aanVar2.a(debVar);
                            objA.getClass();
                            ddf ddfVar = (ddf) objA;
                            String str = ddfVar.a;
                            c = '\b';
                            if (str == null) {
                                str = ((ddf) obj2).a;
                            }
                            aanVar2.m(debVar, new ddf(str, ddfVar.b));
                        }
                        c = '\b';
                    } else {
                        c = '\b';
                    }
                    j >>= c;
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

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        cfw cfwVar = this.a;
        cfwVar.getClass();
        return ((csy) cfwVar).d(csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        cfw cfwVar = this.a;
        cfwVar.getClass();
        return ((csy) cfwVar).e(csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        cfw cfwVar = this.a;
        cfwVar.getClass();
        return ((csy) cfwVar).f(csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        cfw cfwVar = this.a;
        cfwVar.getClass();
        return ((csy) cfwVar).g(csqVar, cspVar, i);
    }

    @Override // defpackage.cgx
    public final long l() {
        return dln.k(bzi.r(this, 128).c);
    }

    @Override // defpackage.cgx
    public final dlg m() {
        return bzi.q(this).r;
    }

    @Override // defpackage.cgx
    public final dlr n() {
        return bzi.q(this).s;
    }

    @Override // defpackage.cys
    public final void o() {
        cfw cfwVar = this.a;
        cfwVar.getClass();
        cqx cqxVar = ((cra) cfwVar).c;
        if (cqxVar.d == 2) {
            cra craVar = cqxVar.c;
            long jUptimeMillis = SystemClock.uptimeMillis();
            chk chkVar = new chk(craVar, 8);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            motionEventObtain.setSource(0);
            chkVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            cqxVar.b();
        }
    }

    @Override // defpackage.cfx
    /* renamed from: p */
    public final void t() {
        if (this.a instanceof cra) {
            o();
        }
    }

    @Override // defpackage.cfx
    public final void q() {
        u();
    }

    public final void r(boolean z) {
        if (!this.A) {
            crt.c("initializeModifier called on unattached node");
        }
        cfw cfwVar = this.a;
        if ((this.r & 32) != 0) {
            if (cfwVar instanceof cvp) {
                bzi.s(this).C(new ahp(this, 19));
            }
            if (cfwVar instanceof cvt) {
                cvt cvtVar = (cvt) cfwVar;
                cvn cvnVar = this.e;
                if (cvnVar == null || !cvnVar.c(cvtVar.e())) {
                    this.e = new cvn(cvtVar);
                    cfx cfxVar = bzi.q(this).v.e;
                    cfxVar.getClass();
                    if (((cyx) cfxVar).a) {
                        cvq cvqVar = ((czq) bzi.s(this)).D;
                        bzi bziVarE = cvtVar.e();
                        cvqVar.b().p(this);
                        cvqVar.c().p(bziVarE);
                        cvqVar.a();
                    }
                } else {
                    cvnVar.a = cvtVar;
                    cvq cvqVar2 = ((czq) bzi.s(this)).D;
                    bzi bziVarE2 = cvtVar.e();
                    cvqVar2.b().p(this);
                    cvqVar2.c().p(bziVarE2);
                    cvqVar2.a();
                }
            }
        }
        if ((this.r & 4) != 0) {
            if (cfwVar instanceof chc) {
                this.b = true;
            }
            if (!z) {
                bzi.r(this, 2).ak();
            }
        }
        if ((this.r & 2) != 0) {
            cfx cfxVar2 = bzi.q(this).v.e;
            cfxVar2.getClass();
            if (((cyx) cfxVar2).a) {
                cyc cycVar = this.w;
                cycVar.getClass();
                ((cwx) cycVar).H(this);
                cycVar.am();
            }
            if (!z) {
                bzi.r(this, 2).ak();
                bzi.q(this).I();
            }
        }
        if (cfwVar instanceof cus) {
            ((cus) cfwVar).d(bzi.q(this));
        }
        if ((this.r & 128) != 0 && (cfwVar instanceof cuf)) {
            cfx cfxVar3 = bzi.q(this).v.e;
            cfxVar3.getClass();
            if (((cyx) cfxVar3).a) {
                bzi.q(this).I();
            }
        }
        if ((this.r & 4194304) != 0 && (cfwVar instanceof cud)) {
            this.d = null;
            cfx cfxVar4 = bzi.q(this).v.e;
            cfxVar4.getClass();
            if (((cyx) cfxVar4).a) {
                cym cymVarS = bzi.s(this);
                czq czqVar = (czq) cymVarS;
                czqVar.z.e.n(new cvx(this));
                czqVar.U(null);
            }
        }
        if ((this.r & 256) != 0 && (cfwVar instanceof cua)) {
            cfx cfxVar5 = bzi.q(this).v.e;
            cfxVar5.getClass();
            if (((cyx) cfxVar5).a) {
                bzi.q(this).I();
            }
        }
        if (cfwVar instanceof cin) {
            ((cin) cfwVar).d().d.n(this);
        }
        int i = this.r;
        if ((i & 16) != 0 && (cfwVar instanceof cra)) {
            ((cra) cfwVar).c.a = this.w;
        }
        if ((i & 8) != 0) {
            bzi.s(this).B();
        }
    }

    @Override // defpackage.cys
    public final void s(cql cqlVar, cqm cqmVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        cfw cfwVar = this.a;
        cfwVar.getClass();
        cqx cqxVar = ((cra) cfwVar).c;
        List list = cqlVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cqu cquVar = (cqu) list.get(i);
            if (tl.k(cquVar) || tl.m(cquVar)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((cqu) list.get(i2)).c()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        cra craVar = cqxVar.c;
        if (craVar.b) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    cqu cquVar2 = (cqu) list.get(i3);
                    if (tl.k(cquVar2) || tl.m(cquVar2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        if (cqxVar.d != 3) {
            if (cqmVar == cqm.a && z3) {
                cqxVar.b = cqlVar;
                cqxVar.a(cqlVar, !z || craVar.b);
            }
            if (cqmVar == cqm.b && z && affa.f(cqlVar, cqxVar.b) && craVar.b) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((cqu) list.get(i4)).b();
                }
            }
            if (cqmVar == cqm.c && !z3 && !affa.f(cqlVar, cqxVar.b)) {
                cqxVar.a(cqlVar, true);
            }
        }
        if (cqmVar == cqm.c) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    cqxVar.b();
                    break;
                } else if (!tl.m((cqu) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (affa.f(cqlVar, cqxVar.b) && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((cqu) list.get(i6)).c()) {
                        i6++;
                    } else if (!craVar.b) {
                        cqxVar.c(cqlVar);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((cqu) list.get(i7)).b();
                }
            }
        }
    }

    @Override // defpackage.cys
    public final /* synthetic */ void t() {
        o();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void u() {
        if (!this.A) {
            crt.c("unInitializeModifier called on unattached node");
        }
        cfw cfwVar = this.a;
        if ((this.r & 32) != 0) {
            if (cfwVar instanceof cvt) {
                cvq cvqVar = ((czq) bzi.s(this)).D;
                bzi bziVarE = ((cvt) cfwVar).e();
                aag aagVar = cvqVar.d;
                if (aagVar == null) {
                    aagVar = new aag(16);
                    cvqVar.d = aagVar;
                }
                aagVar.p(bzi.q(this));
                cvqVar.d().p(bziVarE);
                cvqVar.a();
            }
            if (cfwVar instanceof cvp) {
                ((cvp) cfwVar).d();
            }
        }
        if ((this.r & 8) != 0) {
            bzi.s(this).B();
        }
        if (cfwVar instanceof cin) {
            ((cin) cfwVar).d().d.m(this);
        }
    }

    public final void v() {
        if (this.A) {
            this.c.clear();
            cyp cypVar = ((czq) bzi.s(this)).w;
            ((ces) cypVar.a).b(this, cvz.b, new ahp(this, 20));
        }
    }

    @Override // defpackage.cyn
    public final boolean w() {
        return this.A;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }
}
