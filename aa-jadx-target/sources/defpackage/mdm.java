package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mdm extends defpackage.mdl {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.BatteryMonitor");
    private static final android.content.IntentFilter b = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");

    public static final void c(android.content.Context context) {
        defpackage.zbd zbdVar;
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, b);
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                zbdVar = defpackage.zbd.CR;
            }
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.POWER_MONITORING, zbdVar).l());
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4780)).u("Battery status is not available, assuming not charging.");
        zbdVar = defpackage.zbd.CS;
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.POWER_MONITORING, zbdVar).l());
    }

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("BatteryChargingStateMonitor");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        c(context);
    }
}
