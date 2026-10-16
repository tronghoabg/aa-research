package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
public final class kad {
    public static final yph a = yph.c("CarApp.H");

    public static rrb a(yzy yzyVar) {
        return rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzyVar);
    }

    public static rrb b(yzy yzyVar, ComponentName componentName) {
        rrb rrbVarA = a(yzyVar);
        rrbVarA.p(componentName);
        return rrbVarA;
    }

    public static yfq c(qrn qrnVar, String str) {
        Intent intent = new Intent("androidx.car.app.CarAppService");
        if (str != null) {
            intent.addCategory(str);
        }
        Stream streamFilter = Collection.EL.stream(mjv.b().c(qrnVar, new nyk(intent, qpi.h, nyj.b()))).filter(new ghp(intent, 17)).map(new jxe(15)).filter(new hmd(14));
        int i = yfq.d;
        return (yfq) streamFilter.collect(ycm.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(yfq yfqVar, ywy ywyVar, String str) {
        int size = yfqVar.size();
        for (int i = 0; i < size; i++) {
            ComponentName componentName = (ComponentName) yfqVar.get(i);
            if (str != null) {
                ((ype) a.l().ai((char) 2890)).M("%s declared as a %s app", componentName.flattenToShortString(), str);
            } else {
                ((ype) a.l().ai((char) 2889)).y("%s does not declare category", componentName.flattenToShortString());
            }
        }
        rrb rrbVarA = a(yzy.sF);
        rrbVarA.q(yfqVar);
        rrbVarA.o = xxh.h(ywyVar);
        e(rrbVarA);
    }

    public static void e(rrb rrbVar) {
        ebf.j().F(rrbVar.l());
    }

    public static void f(yzy yzyVar, ComponentName componentName) {
        e(b(yzyVar, componentName));
    }

    public static void g(yzy yzyVar, String str) {
        f(yzyVar, new ComponentName(str, ""));
    }
}
