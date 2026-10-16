package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class abpu {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public abpu(android.content.Context context) {
        defpackage.rrc rrcVar = new defpackage.rrc(context);
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        defpackage.yhx yhxVar = defpackage.rit.d;
        defpackage.yhx yhxVar2 = defpackage.rit.e;
        defpackage.rrd rrdVar = new defpackage.rrd(java.util.concurrent.TimeUnit.SECONDS);
        this.c = rrcVar;
        this.b = yhxVar;
        this.d = yhxVar2;
        this.a = rrdVar;
    }

    public final synchronized defpackage.yxv a() {
        defpackage.yxv yxvVar;
        java.lang.Object obj = this.c;
        android.content.IntentFilter intentFilter = defpackage.rrc.a;
        android.content.Context context = ((defpackage.rrc) obj).b;
        android.content.Intent intentE = defpackage.duw.e(context, null, intentFilter, null, 4);
        if (intentE != null && intentE.getBooleanExtra("present", false)) {
            defpackage.abor aborVarN = defpackage.yxv.a.n();
            android.os.BatteryManager batteryManager = (android.os.BatteryManager) context.getSystemService("batterymanager");
            int intProperty = batteryManager == null ? -1 : batteryManager.getIntProperty(1);
            if (intProperty >= 0) {
                aborVarN.t();
                defpackage.yxv yxvVar2 = (defpackage.yxv) aborVarN.b;
                yxvVar2.b |= 8;
                yxvVar2.f = intProperty;
            }
            int intExtra = intentE.getIntExtra("plugged", -1);
            if (intExtra >= 0) {
                aborVarN.t();
                defpackage.yxv yxvVar3 = (defpackage.yxv) aborVarN.b;
                yxvVar3.b = 1 | yxvVar3.b;
                yxvVar3.c = intExtra;
            }
            int intExtra2 = intentE.getIntExtra("status", -1);
            if (intExtra2 >= 0) {
                aborVarN.t();
                defpackage.yxv yxvVar4 = (defpackage.yxv) aborVarN.b;
                yxvVar4.b |= 2;
                yxvVar4.d = intExtra2;
            }
            int intExtra3 = intentE.getIntExtra("level", -1);
            int intExtra4 = intentE.getIntExtra("scale", -1);
            if (intExtra3 >= 0 && intExtra4 > 0) {
                aborVarN.t();
                defpackage.yxv yxvVar5 = (defpackage.yxv) aborVarN.b;
                yxvVar5.b = 4 | yxvVar5.b;
                yxvVar5.e = (intExtra3 * 100) / intExtra4;
            }
            int intExtra5 = intentE.getIntExtra("temperature", Integer.MIN_VALUE);
            if (intExtra5 != Integer.MIN_VALUE) {
                aborVarN.t();
                defpackage.yxv yxvVar6 = (defpackage.yxv) aborVarN.b;
                yxvVar6.b |= 16;
                yxvVar6.g = intExtra5;
            }
            yxvVar = (defpackage.yxv) aborVarN.q();
        } else {
            yxvVar = defpackage.yxv.a;
        }
        return yxvVar;
    }

    public abpu(java.lang.String str, defpackage.wfb wfbVar, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.d = str;
        this.c = wfbVar;
        this.b = bool;
        this.a = bool2;
    }

    public abpu(defpackage.abrf abrfVar, java.lang.Object obj, defpackage.abrf abrfVar2, java.lang.Object obj2) {
        this.c = abrfVar;
        this.a = obj;
        this.d = abrfVar2;
        this.b = obj2;
    }

    public abpu(defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3) {
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.c = xynVar;
        this.a = xynVar2;
        this.d = xynVar3;
    }
}
