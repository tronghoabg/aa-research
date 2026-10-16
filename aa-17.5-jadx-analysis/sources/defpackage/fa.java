package defpackage;

import android.content.IntentFilter;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
final class fa extends ez {
    final /* synthetic */ fe a;
    public final ncp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(fe feVar, ncp ncpVar) {
        super(feVar);
        this.a = feVar;
        this.b = ncpVar;
    }

    @Override // defpackage.ez
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.ez
    public final void b() throws PackageManager.NameNotFoundException {
        this.a.S(true, true);
    }
}
