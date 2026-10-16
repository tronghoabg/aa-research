package defpackage;

import android.content.Intent;
import androidx.car.app.IStartCarApp;

/* loaded from: classes2.dex */
final class jys extends IStartCarApp.Stub {
    private static final yph a = yph.c("CarApp.H");
    private final String b;
    private boolean c = true;

    public jys(String str) {
        this.b = str;
    }

    @Override // androidx.car.app.IStartCarApp
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IStartCarApp
    public final void startCarApp(Intent intent) {
        if (!this.c) {
            ((ype) ((ype) a.h()).ai((char) 2852)).u("App attempted to start app more than once from a single notification");
            throw new SecurityException("Attempted to start app twice from the same notification action");
        }
        this.c = false;
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.rS);
        String str = this.b;
        rrbVarH.f(str);
        ohsVarJ.F(rrbVarH.l());
        intent.putExtra("CAR_APP_NOTIFICATION_INTENT", true);
        jwn.a(str, intent, false);
    }
}
