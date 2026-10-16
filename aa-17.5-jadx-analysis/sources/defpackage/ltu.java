package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class ltu {
    public static final ltt a = new ltt();
    public static final afgl b = new lcj(mki.b, 10);

    public static final ltu a() {
        return (ltu) b.getValue(a, ltt.a[0]);
    }

    private static final void d(yzy yzyVar, ComponentName componentName) {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEMORY, yzyVar);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
    }

    public final void b(ComponentName componentName) {
        d(yzy.MD, componentName);
    }

    public final void c(int i, ComponentName componentName) {
        d(i != 5 ? i != 10 ? i != 15 ? i != 20 ? i != 40 ? i != 60 ? i != 80 ? yzy.MC : yzy.MB : yzy.MA : yzy.Mz : yzy.My : yzy.Mx : yzy.Mw : yzy.Mv, componentName);
    }
}
