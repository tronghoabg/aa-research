package defpackage;

import android.content.ComponentName;
import android.os.Build;
import android.view.inputmethod.InputConnection;

/* loaded from: classes2.dex */
public final class kaf implements hjr {
    private final ComponentName a;

    public kaf(ComponentName componentName) {
        this.a = componentName;
    }

    @Override // defpackage.hjr
    public final void a(InputConnection inputConnection, Runnable runnable) {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.sH);
        rrbVarH.p(this.a);
        ohsVarJ.F(rrbVarH.l());
        kfl.h().O(new qjj(inputConnection, runnable));
    }

    @Override // defpackage.hjr
    public final boolean b() {
        return kfl.h().K() && aczc.v() && Build.VERSION.SDK_INT >= 31;
    }

    @Override // defpackage.hjr
    public final void c(ieb iebVar) {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.sH);
        rrbVarH.p(this.a);
        ohsVarJ.F(rrbVarH.l());
        kfl.h().O(new kag(iebVar));
    }
}
