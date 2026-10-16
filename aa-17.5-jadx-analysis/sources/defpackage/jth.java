package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class jth implements jtf {
    private final String a;
    private boolean b;

    public jth(qw qwVar) {
        String packageName = qwVar.a.getPackageName();
        packageName.getClass();
        this.a = packageName;
    }

    private final void e(yzy yzyVar) {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzyVar);
        rrbVarH.p(new ComponentName(this.a, ""));
        ohsVarJ.F(rrbVarH.l());
    }

    @Override // defpackage.jtf
    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        e(yzy.bx);
    }

    @Override // defpackage.jtf
    public final void b() {
        e(yzy.bz);
    }

    @Override // defpackage.jtf
    public final void c() {
        e(yzy.bA);
    }

    @Override // defpackage.jtf
    public final void d() {
        e(yzy.by);
    }
}
