package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;

/* loaded from: classes2.dex */
final class ex extends ez {
    public final PowerManager a;
    final /* synthetic */ fe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(fe feVar, Context context) {
        super(feVar);
        this.b = feVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.ez
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.ez
    public final void b() throws PackageManager.NameNotFoundException {
        this.b.S(true, true);
    }
}
