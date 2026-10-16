package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class mwc {
    private static final yzz a = yzz.DASHBOARD;

    public static final void a(yzy yzyVar, ComponentName componentName) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, a, yzyVar);
        if (componentName != null) {
            rrbVarH.p(componentName);
        }
        ebf.j().F(rrbVarH.l());
    }

    public static final void b(yzy yzyVar, String str) {
        a(yzyVar, str != null ? new ComponentName(str, "") : null);
    }

    public static final void c(yzy yzyVar, Integer num) {
        rrb rrbVarK;
        if (num != null) {
            rrbVarK = odn.a().i(num.intValue(), a, yzyVar);
        } else {
            rrbVarK = odn.a().k(a, yzyVar);
        }
        ebf.j().F(rrbVarK.l());
    }
}
