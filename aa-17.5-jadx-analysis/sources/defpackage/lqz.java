package defpackage;

import android.content.ComponentName;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class lqz extends lhf {
    public static final yph a = yph.c("GH.MediaDefaultAppCtrl");

    public lqz() {
        lqy lqyVar = new lqy();
        this.j.c(lqyVar);
        eqy.a(tby.d(lpq.i().f(), lgx.b().a(mpz.d), new kuu(14))).fE(this, lqyVar);
    }

    public static boolean a(ComponentName componentName) {
        return componentName.equals(mkn.F) || componentName.equals(mkn.G);
    }

    private static void b(ComponentName componentName, int i, mpz mpzVar) {
        ((ype) ((ype) a.f()).ai(4211)).M("Setting default media app to %s, category: %s", new zjd(zjc.a, componentName.flattenToString()), mpzVar);
        lgv.a().f(mpzVar, componentName);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, mpzVar == mpz.d ? yzy.hh : yzy.hi);
        rrbVarH.p(componentName);
        rrbVarH.z(i);
        ohsVarJ.F(rrbVarH.l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    private static final void e(mpz mpzVar) {
        Stream map = Collection.EL.stream(lem.a().b(kio.b().e(), nyj.d(nyi.a))).filter(new kxo(17)).map(new lka(13));
        int i = yfq.d;
        Collector collector = ycm.a;
        yfq<ComponentName> yfqVar = (yfq) map.collect(collector);
        if (yfqVar.isEmpty()) {
            ((ype) ((ype) a.f()).ai((char) 4209)).u("No media app present.");
            return;
        }
        HashMap map2 = new HashMap();
        for (ComponentName componentName : yfqVar) {
            map2.put(componentName.getPackageName(), componentName);
        }
        abru abruVarB = acsf.b();
        for (int i2 = 0; i2 < abruVarB.b.size(); i2++) {
            ComponentName componentName2 = (ComponentName) map2.get((String) abruVarB.b.get(i2));
            if (componentName2 != null) {
                b(componentName2, yfqVar.size(), mpzVar);
                return;
            }
        }
        yfq yfqVar2 = yfqVar;
        if (mpzVar == mpz.e) {
            yfqVar2 = (List) Collection.EL.stream(yfqVar).filter(new kxo(18)).collect(collector);
        }
        if (yfqVar2.isEmpty()) {
            ((ype) ((ype) a.f()).ai((char) 4210)).u("No phone media app present for PHONE_MEDIA category default app.");
        } else {
            b((ComponentName) Collection.EL.stream(yfqVar2).min(Comparator.CC.comparing(new lka(14), String.CASE_INSENSITIVE_ORDER)).get(), yfqVar2.size(), mpzVar);
        }
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        lha lhaVarA = lgv.a();
        mpz mpzVar = mpz.d;
        if (lhaVarA.a(mpzVar) == null) {
            e(mpzVar);
        }
        if (lmi.a().e()) {
            lha lhaVarA2 = lgv.a();
            mpz mpzVar2 = mpz.e;
            if (lhaVarA2.a(mpzVar2) == null) {
                ComponentName componentNameA = lgv.a().a(mpzVar);
                if (componentNameA == null || a(componentNameA)) {
                    e(mpzVar2);
                    return;
                }
                ((ype) ((ype) a.f()).ai((char) 4212)).y("Setting default phone media app to the default media app %s", new zjd(zjc.a, componentNameA));
                lgv.a().f(mpzVar2, componentNameA);
            }
        }
    }
}
