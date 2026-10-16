package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kfs implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.BatterySaverMonitor");
    static final android.content.ComponentName b = new android.content.ComponentName("com.google.android.projection.gearhead", defpackage.kfs.class.getName());
    private final java.lang.Runnable e;
    private final android.content.Context f;
    public final defpackage.eqs c = new defpackage.eqs();
    private final android.os.Handler d = new android.os.Handler();
    private final android.content.BroadcastReceiver g = new defpackage.kfr(this);

    public kfs(android.content.Context context) {
        this.e = new defpackage.kfq(defpackage.ocn.a(), context, 0);
        this.f = context;
    }

    public static void b(defpackage.zbd zbdVar) {
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.BATTERY_SAVER, zbdVar).l());
    }

    public final void a() {
        if (defpackage.acol.c()) {
            this.d.removeCallbacks(this.e);
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        a();
        this.f.unregisterReceiver(this.g);
    }

    public final void e(long j) {
        if (defpackage.acol.c()) {
            this.d.postDelayed(this.e, j);
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        boolean zF = f();
        if (zF) {
            b(defpackage.zbd.rp);
            e(5000L);
        } else {
            b(defpackage.zbd.rs);
        }
        this.c.m(java.lang.Boolean.valueOf(zF));
        defpackage.duw.e(this.f, this.g, new android.content.IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), null, 2);
    }

    public final boolean f() {
        android.os.PowerManager powerManager = (android.os.PowerManager) this.f.getSystemService("power");
        powerManager.getClass();
        return powerManager.isPowerSaveMode();
    }
}
