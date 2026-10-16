package e.a.f.a;

import com.google.v.dm;
import com.google.v.du;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Locale;
import l.a.atn;
import l.a.atp;
import l.a.auj;
import l.a.aum;
import l.a.aup;
import l.a.ava;
import l.a.avc;
import l.a.awy;
import l.a.awz;
import l.a.ayc;
import l.a.ayd;
import l.a.aye;
import l.a.bfs;
import l.a.bms;
import l.a.bmz;
import l.a.bne;
import l.a.bnh;
import l.a.bnn;
import l.a.bnr;
import l.a.brk;
import l.a.brn;
import l.a.bse;
import l.a.cu;
import l.a.kg;
import l.a.ly;
import l.a.ma;
import l.a.mc;
import l.a.mf;
import l.a.mi;
import l.a.mk;
import l.a.mm;
import l.a.mp;
import l.a.ms;
import l.a.mv;
import l.a.mw;
import l.a.mx;
import l.a.my;
import l.a.nb;
import l.a.ne;
import l.a.nf;
import l.a.nh;
import l.a.nj;
import l.a.nl;
import l.a.nn;
import l.a.nq;
import l.a.ns;
import l.a.ny;
import l.a.oa;
import l.a.oi;
import l.a.ok;
import l.a.on;
import l.a.op;
import l.a.or;
import l.a.xm;
import l.a.xo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f47568a;

    public e(int i2) {
        kotlinx.a.d[] dVarArr = new kotlinx.a.d[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            dVarArr[i3] = h.e.b.h(null);
        }
        this.f47568a = dVarArr;
    }

    public final void A(boolean z) {
        ((awy) this.f47568a).a(z);
    }

    public final void B(boolean z) {
        ((awy) this.f47568a).b(z);
    }

    public final void C(boolean z) {
        ((awy) this.f47568a).c(z);
    }

    public final /* synthetic */ avc D() {
        du duVarBuild = ((dm) this.f47568a).build();
        x.e(duVarBuild, "build(...)");
        return (avc) duVarBuild;
    }

    public final void E(cu cuVar) {
        x.f(cuVar, "value");
        ((ava) this.f47568a).a(cuVar);
    }

    public final void F(nq nqVar) {
        x.f(nqVar, "value");
        ((ava) this.f47568a).d(nqVar);
    }

    public final void G(ns nsVar) {
        x.f(nsVar, "value");
        ((ava) this.f47568a).e(nsVar);
    }

    public final void H(ny nyVar) {
        x.f(nyVar, "value");
        ((ava) this.f47568a).f(nyVar);
    }

    public final void I(oa oaVar) {
        x.f(oaVar, "value");
        ((ava) this.f47568a).g(oaVar);
    }

    public final void J(oi oiVar) {
        x.f(oiVar, "value");
        ((ava) this.f47568a).h(oiVar);
    }

    public final void K(ok okVar) {
        x.f(okVar, "value");
        ((ava) this.f47568a).i(okVar);
    }

    public final void L(on onVar) {
        x.f(onVar, "value");
        ((ava) this.f47568a).j(onVar);
    }

    public final void M(op opVar) {
        x.f(opVar, "value");
        ((ava) this.f47568a).k(opVar);
    }

    public final void N(or orVar) {
        x.f(orVar, "value");
        ((ava) this.f47568a).l(orVar);
    }

    public final void O(xm xmVar) {
        x.f(xmVar, "value");
        ((ava) this.f47568a).m(xmVar);
    }

    public final void P(xo xoVar) {
        x.f(xoVar, "value");
        ((ava) this.f47568a).n(xoVar);
    }

    public final void Q(auj aujVar) {
        x.f(aujVar, "value");
        ((ava) this.f47568a).p(aujVar);
    }

    public final void R(aum aumVar) {
        x.f(aumVar, "value");
        ((ava) this.f47568a).q(aumVar);
    }

    public final void S(aup aupVar) {
        x.f(aupVar, "value");
        ((ava) this.f47568a).r(aupVar);
    }

    public final void T(bms bmsVar) {
        x.f(bmsVar, "value");
        ((ava) this.f47568a).u(bmsVar);
    }

    public final void U(bmz bmzVar) {
        x.f(bmzVar, "value");
        ((ava) this.f47568a).v(bmzVar);
    }

    public final void V(bne bneVar) {
        x.f(bneVar, "value");
        ((ava) this.f47568a).w(bneVar);
    }

    public final void W(bnh bnhVar) {
        x.f(bnhVar, "value");
        ((ava) this.f47568a).x(bnhVar);
    }

    public final void X(bnn bnnVar) {
        x.f(bnnVar, "value");
        ((ava) this.f47568a).y(bnnVar);
    }

    public final void Y(bnr bnrVar) {
        x.f(bnrVar, "value");
        ((ava) this.f47568a).z(bnrVar);
    }

    public final void Z(brk brkVar) {
        x.f(brkVar, "value");
        ((ava) this.f47568a).B(brkVar);
    }

    public final f a() {
        return new f(this);
    }

    public final void aa(brn brnVar) {
        x.f(brnVar, "value");
        ((ava) this.f47568a).C(brnVar);
    }

    public final void ab(bse bseVar) {
        x.f(bseVar, "value");
        ((ava) this.f47568a).D(bseVar);
    }

    public final /* synthetic */ atp ac() {
        du duVarBuild = ((dm) this.f47568a).build();
        x.e(duVarBuild, "build(...)");
        return (atp) duVarBuild;
    }

    public final void ad(kg kgVar) {
        x.f(kgVar, "value");
        ((atn) this.f47568a).a(kgVar);
    }

    public final void ae(bfs bfsVar) {
        x.f(bfsVar, "value");
        ((atn) this.f47568a).d(bfsVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    public final void c(String str, String str2) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i3), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        for (int i4 = 0; i4 < str2.length(); i4++) {
            char cCharAt2 = str2.charAt(i4);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i4), str2));
            }
        }
        while (true) {
            ?? r1 = this.f47568a;
            if (i2 >= r1.size()) {
                r1.add(str);
                r1.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((String) r1.get(i2))) {
                    r1.remove(i2);
                    r1.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
        }
    }

    public final kotlinx.a.d d(int i2) {
        return ((kotlinx.a.d[]) this.f47568a)[i2];
    }

    public final /* synthetic */ nh e() {
        du duVarBuild = ((dm) this.f47568a).build();
        x.e(duVarBuild, "build(...)");
        return (nh) duVarBuild;
    }

    public final void f(ly lyVar) {
        x.f(lyVar, "value");
        ((nf) this.f47568a).a(lyVar);
    }

    public final void g(ma maVar) {
        x.f(maVar, "value");
        ((nf) this.f47568a).b(maVar);
    }

    public final void h(mc mcVar) {
        x.f(mcVar, "value");
        ((nf) this.f47568a).c(mcVar);
    }

    public final void i(mf mfVar) {
        x.f(mfVar, "value");
        ((nf) this.f47568a).d(mfVar);
    }

    public final void j(mi miVar) {
        x.f(miVar, "value");
        ((nf) this.f47568a).e(miVar);
    }

    public final void k(mk mkVar) {
        x.f(mkVar, "value");
        ((nf) this.f47568a).f(mkVar);
    }

    public final void l(mm mmVar) {
        x.f(mmVar, "value");
        ((nf) this.f47568a).g(mmVar);
    }

    public final void m(ms msVar) {
        x.f(msVar, "value");
        ((nf) this.f47568a).h(msVar);
    }

    public final void n(mv mvVar) {
        x.f(mvVar, "value");
        ((nf) this.f47568a).i(mvVar);
    }

    public final void o(my myVar) {
        x.f(myVar, "value");
        ((nf) this.f47568a).j(myVar);
    }

    public final void p(nb nbVar) {
        x.f(nbVar, "value");
        ((nf) this.f47568a).k(nbVar);
    }

    public final void q(ne neVar) {
        x.f(neVar, "value");
        ((nf) this.f47568a).l(neVar);
    }

    public final void r(nj njVar) {
        x.f(njVar, "value");
        ((nf) this.f47568a).m(njVar);
    }

    public final void s(nl nlVar) {
        x.f(nlVar, "value");
        ((nf) this.f47568a).n(nlVar);
    }

    public final void t(nn nnVar) {
        x.f(nnVar, "value");
        ((nf) this.f47568a).o(nnVar);
    }

    public final /* synthetic */ my u() {
        du duVarBuild = ((dm) this.f47568a).build();
        x.e(duVarBuild, "build(...)");
        return (my) duVarBuild;
    }

    public final void v(mw mwVar) {
        x.f(mwVar, "value");
        ((mx) this.f47568a).a(mwVar);
    }

    public final void w(mp mpVar) {
        x.f(mpVar, "value");
        ((mx) this.f47568a).b(mpVar);
    }

    public final /* synthetic */ aye x() {
        du duVarBuild = ((dm) this.f47568a).build();
        x.e(duVarBuild, "build(...)");
        return (aye) duVarBuild;
    }

    public final void y(ayc aycVar) {
        x.f(aycVar, "value");
        ((ayd) this.f47568a).a(aycVar);
    }

    public final /* synthetic */ awz z() {
        du duVarBuild = ((dm) this.f47568a).build();
        x.e(duVarBuild, "build(...)");
        return (awz) duVarBuild;
    }

    public e() {
        this.f47568a = new ArrayList(20);
    }

    public /* synthetic */ e(dm dmVar) {
        this.f47568a = dmVar;
    }
}
