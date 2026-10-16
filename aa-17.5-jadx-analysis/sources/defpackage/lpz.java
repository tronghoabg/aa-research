package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class lpz {
    public static final yph a = yph.c("GH.MediaSugPvdr");
    public final Context b;

    public lpz(Context context) {
        this.b = context;
    }

    public static eqj a(ComponentName componentName) {
        eqj eqjVarC = tby.C(kiu.a(), new llf(componentName, 19));
        int i = yfq.d;
        return tby.v(tby.F(eqy.a(tby.c(eqjVarC, yls.a)), new kok(componentName, 4)), new llf(componentName, 20));
    }

    public static eqj c(lnr lnrVar, eqj eqjVar, int i) {
        if (i <= 7) {
            return tby.C(tby.v(eqjVar, new lmv(15)), new aia(lnrVar, i, 16));
        }
        ((ype) ((ype) a.h()).ai((char) 4181)).w("Breaking iteration at depth = %d.", 8);
        int i2 = yfq.d;
        yfq yfqVar = yls.a;
        afco afcoVar = tby.a;
        return new eqm(yfqVar);
    }

    public static lpz d() {
        return (lpz) mki.a.b(lpz.class, new lpu(2));
    }

    public static void e(ComponentName componentName, yzy yzyVar) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzyVar);
        if (componentName != null) {
            rrbVarH.p(componentName);
        }
        ebf.j().F(rrbVarH.l());
    }

    public final eqj b(ComponentName componentName) {
        eqj eqjVarC;
        if (!acsx.H()) {
            eqjVarC = eqy.c(kfl.h().a(), new llf(componentName, 17));
        } else if (componentName != null) {
            ((ype) a.l().ai((char) 4175)).y("Use Gearhead media browse suggestions for %s", componentName);
            eqjVarC = a(componentName);
        } else {
            ((ype) ((ype) a.h()).ai((char) 4174)).u("Did not attempt to use App browser suggestions for null componentName");
            int i = yfq.d;
            yfq yfqVar = yls.a;
            afco afcoVar = tby.a;
            eqjVarC = new eqm(yfqVar);
        }
        int i2 = yfq.d;
        return tby.v(tby.u(eqjVarC, yls.a), new lpx(this, 2));
    }
}
