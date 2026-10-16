package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.CancellationSignal;
import j$.util.Map;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class lsc extends lhf {
    public static final yph a = yph.c("GH.MediaSearchIntentPr");
    public ComponentName b;
    public ComponentName c;
    public boolean e;
    public CancellationSignal d = new CancellationSignal();
    private final Map g = new HashMap();
    public final Map f = new HashMap();

    public lsc() {
        eqj eqjVarA = lgx.b().a(mpz.d);
        eqjVarA.fE(this, new lnc(this, 13));
        tby.C(eqjVarA, new lqc(20)).fE(this, new lkn(8));
        int i = 7;
        tby.v(tby.C(eqjVarA, new lpx(loy.j(), i)), new lry(1)).fE(this, new lkn(9));
        eqj eqjVarB = loh.b();
        eqjVarB.fE(this, new lnc(this, 14));
        tby.v(tby.C(eqjVarB, new lpx(loy.j(), i)), new lry(0)).fE(this, new lnc(this, 15));
    }

    public static CancellationSignal a(eqa eqaVar, ComponentName componentName, ComponentName componentName2, String str, Bundle bundle) {
        CancellationSignal cancellationSignal = new CancellationSignal();
        g(eqaVar, cancellationSignal, componentName, componentName2, str, bundle);
        return cancellationSignal;
    }

    public static eqj b(ComponentName componentName) {
        return tby.C(tby.v(loy.j().b(componentName), new lqc(18)), new lqc(19));
    }

    public static lsc f() {
        return (lsc) mki.a.i(lsc.class);
    }

    public static void g(eqa eqaVar, final CancellationSignal cancellationSignal, ComponentName componentName, final ComponentName componentName2, final String str, final Bundle bundle) {
        eqm eqmVar = new eqm(false);
        if (componentName != null) {
            szp.i(h(componentName), eqaVar, new lrb(cancellationSignal, componentName, eqmVar, 3));
        } else {
            eqmVar.m(true);
        }
        eqj eqjVarD = tby.D(h(componentName2), eqmVar);
        if (!Objects.equals(componentName, componentName2)) {
            lsa lsaVar = new lsa(eqjVarD, 1000L);
            szp.i(tby.t(new lsa(b(componentName2), 15000L)), eqaVar, new lnc(componentName2, 16));
            eqjVarD = lsaVar;
        }
        szp.i(tby.t(eqjVarD), eqaVar, new eqn() { // from class: lrx
            @Override // defpackage.eqn
            public final void eS(Object obj) {
                lod lodVar = (lod) obj;
                yph yphVar = lsc.a;
                if (cancellationSignal.isCanceled()) {
                    ((ype) ((ype) lsc.a.h()).ai(4257)).y("playFromSearch on %s cancelled due to newer search", componentName2);
                    return;
                }
                Bundle bundle2 = bundle;
                String str2 = str;
                lpa lpaVar = (lpa) lodVar.i.d(yzz.MEDIA_ASSISTANT_SEARCH);
                ((ype) lpa.a.l().ai(4134)).S("playFromSearch: component=%s context=%s query=%s extras=%s", lpaVar.j(), lpaVar.k(), str2, bundle2);
                lpaVar.c.z(str2, bundle2);
                lpaVar.l(yzy.fb, null);
            }
        });
    }

    private static eqj h(ComponentName componentName) {
        return tby.v(loy.j().f(componentName), new lry(2));
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((eqm) it.next()).m(null);
        }
        Iterator it2 = this.f.values().iterator();
        while (it2.hasNext()) {
            ((eqm) it2.next()).m(null);
        }
    }

    public final eqm e(ComponentName componentName) {
        return (eqm) Map.EL.computeIfAbsent(this.g, componentName, new lka(17));
    }
}
