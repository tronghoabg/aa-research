package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class kfp implements lhg {
    public static final yph a = yph.c("GH.BatterySaverMonitor");
    public static final ComponentName b = new ComponentName("com.google.android.projection.gearhead", kfp.class.getName());
    private final Runnable e;
    private final Context f;
    public final eqm c = new eqm();
    private final Handler d = new Handler();
    private final BroadcastReceiver g = new kfo(this);

    public kfp(Context context) {
        this.e = new jpx(obs.a(), context, 2, (byte[]) null);
        this.f = context;
    }

    public static void b(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.BATTERY_SAVER, yzyVar).l());
    }

    public final void a() {
        if (acnj.c()) {
            this.d.removeCallbacks(this.e);
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        boolean zF = f();
        if (zF) {
            b(yzy.rn);
            e(5000L);
        } else {
            b(yzy.rq);
        }
        this.c.m(Boolean.valueOf(zF));
        dup.e(this.f, this.g, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), null, 2);
    }

    @Override // defpackage.lhg
    public final void d() {
        a();
        this.f.unregisterReceiver(this.g);
    }

    public final void e(long j) {
        if (acnj.c()) {
            this.d.postDelayed(this.e, j);
        }
    }

    public final boolean f() {
        PowerManager powerManager = (PowerManager) this.f.getSystemService("power");
        powerManager.getClass();
        return powerManager.isPowerSaveMode();
    }
}
