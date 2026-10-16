package defpackage;

import android.content.ComponentName;
import android.graphics.Bitmap;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.time.Duration;

/* loaded from: classes.dex */
public final class nnu extends erm implements lth {
    public static final yph a = yph.c("RailWidgetVM");
    public final eqj b;
    public final eqj c;
    public final eqj d;
    public final eqj e;
    public final eqj f;
    public final eqj g;
    public final eqj i;
    public final eqj j;
    public final eqj k;
    private final /* synthetic */ lth l;
    private final eqj m;
    private final eqj n;
    private final boolean o;
    private final eqj p;
    private final eqj q;
    private final eqj r;
    private final aezr s;
    private final nnt t;
    private final eqj u;
    private final aitx v;
    private final eqj w;
    private final eqj x;
    private final eqj y;
    private final eqj z;

    public nnu(eqj eqjVar) {
        eqj eqmVar;
        eqj eqmVar2;
        eqjVar.getClass();
        lth lthVarE = lto.e(yzz.RAIL_WIDGET, null, null, null, 14);
        kkq kkqVarA = kkq.a.a();
        nfd nfdVarA = nfd.a.a();
        this.l = lthVarE;
        this.m = kkqVarA;
        this.n = nfdVarA;
        yph yphVar = nsr.a;
        boolean zD = ((nsr) mki.a.i(nsr.class)).b().D();
        this.o = zD;
        this.b = new mll("key_settings_show_rail_widget", new nnj(2));
        eqj eqjVar2 = (eqj) ((nfh) mki.a.i(nfh.class)).a;
        this.p = eqjVar2;
        afco afcoVar = tby.a;
        this.c = tby.u(new tbn(h(), eqjVar2, new nno(1)), false);
        this.d = lec.a.a().f() ? mud.h.a().c() : new eqm(false);
        int i = 5;
        int i2 = 4;
        int i3 = 3;
        if (zD) {
            int i4 = nuj.b;
            wer.c();
            eqmVar = eqy.b(eqy.b(eqy.b(((nuj) mki.a.i(nuj.class)).a(), new nle(i3)), new nle(i2)), new njq(new nle(i), 15));
        } else {
            eqmVar = new eqm(null);
        }
        this.e = eqmVar;
        int i5 = 20;
        int i6 = 7;
        int i7 = 6;
        if (zD) {
            eqmVar2 = eqy.b(tby.a(tby.y(eqy.b(nfdVarA, new nle(i7)), eqy.b(kkqVarA, new nle(i6))), eqy.b(eqmVar, new nna(i5))), new nle(8));
        } else {
            eqmVar2 = new eqm(false);
        }
        this.q = eqmVar2;
        eqj eqjVar3 = nva.a.a().f;
        this.r = eqjVar3;
        nna nnaVar = new nna(i3);
        eqjVar3.getClass();
        this.f = eqy.b(eqjVar3, nnaVar);
        nna nnaVar2 = new nna(i2);
        eqjVar3.getClass();
        this.g = eqy.b(eqjVar3, nnaVar2);
        this.s = new aezy(new ngz(this, 12));
        this.i = tby.j(((ltn) lthVarE).c, new nno(0));
        nnt nntVar = new nnt(this);
        this.t = nntVar;
        eqj eqjVarJ = tby.j(nntVar, new nno(2));
        this.u = eqjVarJ;
        aiwh aiwhVar = new aiwh(null);
        aivr aivrVarI = mkm.a.e().i();
        aivrVarI.getClass();
        aitx aitxVarB = ahni.b(affa.w(aiwhVar, aivrVarI));
        this.v = aitxVarB;
        aitxVarB.getClass();
        eqj eqjVarA = lthVarE.a(aitxVarB, false);
        this.w = eqjVarA;
        ltn ltnVar = (ltn) lthVarE;
        this.j = tby.i(h(), ltnVar.u, ltnVar.m, ltnVar.n, eqjVarA, ltnVar.j, eqjVarJ, ltnVar.g, ltnVar.h, new afen() { // from class: nnp
            @Override // defpackage.afen
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                GhIcon ghIconL;
                ComponentName componentName = (ComponentName) obj;
                ltg ltgVar = (ltg) obj2;
                ltg ltgVar2 = (ltg) obj3;
                ltg ltgVar3 = (ltg) obj4;
                aezu aezuVar = (aezu) obj5;
                ltr ltrVar = (ltr) obj6;
                nnq nnqVar = (nnq) obj7;
                CharSequence charSequence = (CharSequence) obj8;
                CharSequence charSequence2 = (CharSequence) obj9;
                componentName.getClass();
                aezuVar.getClass();
                nnqVar.getClass();
                charSequence.getClass();
                charSequence2.getClass();
                boolean z = false;
                if (nnqVar.a && !nsr.c().b().F()) {
                    z = true;
                }
                if (ltrVar != null) {
                    ghIconL = GhIcon.r(ltrVar.a, ltrVar.b);
                } else {
                    Bitmap bitmap = (Bitmap) aezuVar.a;
                    ghIconL = bitmap != null ? GhIcon.l(bitmap) : null;
                }
                nnu nnuVar = this.a;
                ncy ncyVar = new ncy(z, nnuVar, componentName, 2);
                return new nnl(new nnk(ghIconL == null ? GhIcon.j(componentName) : ghIconL, ncyVar, 2), ghIconL != null ? new nnk(ghIconL, new ncy(z, nnuVar, componentName, 3), 2) : null, ghIconL != null ? GhIcon.j(componentName) : null, false, false, false, 0, z, true, z, 0, nnqVar.b, charSequence, charSequence2, ncyVar, (z || ltgVar2 == null) ? null : nnuVar.l(nnu.o(ltgVar2), yzy.kY, componentName, 3), (z || ltgVar == null) ? null : nnuVar.l(nnu.o(ltgVar), yzy.kZ, componentName, 3), ltgVar3 != null ? nnuVar.l(nnu.o(ltgVar3), yzy.la, componentName, 3) : null, componentName, 3, 1096);
            }
        });
        eqj eqjVarAX = spu.aX(new njq(this, i3));
        nna nnaVar3 = new nna(i);
        eqjVarAX.getClass();
        eqj eqjVarB = tby.B(eqy.b(eqjVarAX, nnaVar3), new njq(this, i2));
        this.x = eqjVarB;
        eqj eqjVarAX2 = spu.aX(new erl(this, eqjVar, 13, (char[]) null));
        nna nnaVar4 = new nna(6);
        eqjVarAX2.getClass();
        eqj eqjVarB2 = tby.B(eqy.b(eqjVarAX2, nnaVar4), new njq(this, i));
        this.y = eqjVarB2;
        tbn tbnVar = new tbn(nfdVarA, kkqVarA, new nno(3));
        this.z = tbnVar;
        this.k = tby.j(new tbx(eqy.b(new tbn(tby.s(eqmVar2, eqjVarB, eqjVarB2), tbnVar, new ddw(19)), new nna(7)), Duration.ZERO), new ddw(20));
    }

    public static final ComponentName m(nur nurVar) {
        if (nurVar.x != nuo.e || !affa.f("com.google.android.projection.gearhead", nurVar.f)) {
            ComponentName componentName = nurVar.B;
            return componentName == null ? new ComponentName(nurVar.f, "") : componentName;
        }
        ComponentName componentName2 = mkn.b;
        componentName2.getClass();
        return componentName2;
    }

    public static final void n(yzy yzyVar, ComponentName componentName, int i) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.RAIL_WIDGET, yzyVar);
        rrbVarH.p(componentName);
        abnp abnpVarE = rrbVarH.E();
        abnpVarE.t();
        yza yzaVar = (yza) abnpVarE.b;
        yza yzaVar2 = yza.a;
        yzaVar.d = i - 1;
        yzaVar.b |= 2;
        ebf.j().F(rrbVarH.l());
    }

    public static final nnk o(ltg ltgVar) {
        return new nnk(ltgVar.a, 1, ltgVar.c);
    }

    public static final nnk p(nul nulVar) {
        String str = nulVar.b;
        if (str == null) {
            str = null;
        }
        return lxr.y(new nwu(nulVar.a, str, nulVar.c, nulVar.e));
    }

    @Override // defpackage.lth
    public final eqj a(aitx aitxVar, boolean z) {
        throw null;
    }

    @Override // defpackage.lth
    public final lkc b() {
        throw null;
    }

    @Override // defpackage.lth
    public final void c() {
        throw null;
    }

    @Override // defpackage.erm
    public final void d() {
        ahni.e(this.v, null);
    }

    @Override // defpackage.lth
    public final eqj e(aitx aitxVar) {
        throw null;
    }

    public final eqj f(eqj eqjVar) {
        return tby.c(tby.w(eqjVar, new njm(this, 8)), nnl.a);
    }

    public final eqj h() {
        return ((ltn) this.l).a;
    }

    public final eqj i() {
        return (eqj) this.s.a();
    }

    public final nnk j(nur nurVar) {
        GhIcon ghIconJ = nurVar.d;
        if (ghIconJ == null || ghIconJ.b == 8) {
            ghIconJ = nurVar.b;
        }
        if (ghIconJ == null) {
            ghIconJ = GhIcon.j(m(nurVar));
        }
        return l(lxr.y(new nwu(ghIconJ, nurVar.c)), yzy.kX, m(nurVar), nurVar.x.a());
    }

    public final void k(ComponentName componentName) {
        n(yzy.ld, componentName, 3);
        a.l().u("User exited HUN mode.");
        nnt nntVar = this.t;
        nntVar.m(false);
        nntVar.a();
    }

    public final nnk l(nnk nnkVar, yzy yzyVar, ComponentName componentName, int i) {
        return new nnk(nnkVar.a, nnkVar.c, new nnn(yzyVar, componentName, i, nnkVar, 0));
    }
}
