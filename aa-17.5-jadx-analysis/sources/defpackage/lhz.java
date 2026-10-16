package defpackage;

import android.os.Build;
import com.google.android.gms.car.AnalyticsSessionInfo;
import java.util.function.Supplier;

/* loaded from: classes.dex */
final class lhz implements Runnable {
    final /* synthetic */ Supplier a;
    final /* synthetic */ lia b;

    public lhz(lia liaVar, Supplier supplier) {
        this.a = supplier;
        this.b = liaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yph yphVar = lig.a;
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 8, yyv.LIFETIME_HEARTBEAT);
        if (Build.VERSION.SDK_INT >= 30) {
            lig.l((AnalyticsSessionInfo) this.a.get(), rquVarH);
        }
        ebf.j().F(rquVarH.l());
        this.b.a.postDelayed(this, lia.a());
    }
}
