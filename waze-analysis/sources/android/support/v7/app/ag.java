package android.support.v7.app;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ag extends ai {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f508a;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(an anVar, Context context) {
        super(anVar);
        this.f508a = anVar;
        this.f509c = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // android.support.v7.app.ai
    public final int a() {
        return this.f509c.isPowerSaveMode() ? 2 : 1;
    }

    @Override // android.support.v7.app.ai
    final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // android.support.v7.app.ai
    public final void c() throws PackageManager.NameNotFoundException {
        this.f508a.x();
    }
}
