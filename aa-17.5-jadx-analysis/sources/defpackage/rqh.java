package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Map;

/* loaded from: classes.dex */
final class rqh {
    public final yfy a;
    public final Map b;
    public int c;

    static {
        ols.R("CAR.UiEventBatcher");
    }

    public rqh() {
        yfu yfuVar = new yfu(4);
        rqg rqgVar = new rqg(yrm.n(EnumSet.allOf(ouq.class)));
        yfuVar.e(yzy.nQ, rqgVar);
        yfuVar.e(yzy.nR, rqgVar);
        yfuVar.e(yzy.nS, rqgVar);
        yfy yfyVarD = yfuVar.d(true);
        this.b = new yw();
        this.a = yfyVarD;
    }

    public static void a(rre rreVar, yzy yzyVar, int i) {
        if (i <= 0) {
            return;
        }
        rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.TELEMETRY, yzyVar);
        rrbVarH.w(i);
        rrc rrcVar = (rrc) rrbVarH.l();
        yxc yxcVar = yxc.UI;
        yxb yxbVar = (yxb) rrcVar.g().q();
        int i2 = yfq.d;
        rreVar.a(yxcVar, yxbVar, yls.a);
    }

    static void b(zab zabVar) {
        ArrayList arrayList = new ArrayList();
        if ((zabVar.b & 2) != 0) {
            yzy yzyVarB = yzy.b(zabVar.e);
            arrayList.add("action=".concat(yzyVarB != null ? yzyVarB.sn : "UNRECOGNIZED_ENUM_VALUE"));
        }
        if ((zabVar.b & 1) != 0) {
            arrayList.add("context=".concat(String.valueOf(c(yzz.b(zabVar.d)))));
        }
        if ((zabVar.b & 16) != 0) {
            arrayList.add("screen=".concat(String.valueOf(c(yzz.b(zabVar.h)))));
        }
        if ((zabVar.b & 8) != 0) {
            arrayList.add("appPackage=".concat(String.valueOf(zabVar.g)));
        }
        if ((zabVar.b & 16384) != 0) {
            arrayList.add("componentName=".concat(String.valueOf(zabVar.r)));
        }
        if ((zabVar.b & 32768) != 0) {
            arrayList.add("eventCount=" + zabVar.s);
        }
        if ((zabVar.b & 4) != 0) {
            arrayList.add("durationMs=" + zabVar.f);
        }
        new xxd(", ").b(arrayList);
    }

    private static String c(yzz yzzVar) {
        return yzzVar != null ? yzzVar.name() : "UNRECOGNIZED_ENUM_VALUE";
    }
}
