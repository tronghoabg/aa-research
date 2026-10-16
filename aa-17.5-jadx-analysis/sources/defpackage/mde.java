package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
final class mde extends mdd {
    private static final yph a = yph.c("GH.BatteryMonitor");
    private static final IntentFilter b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public static final void c(Context context) {
        yzy yzyVar;
        Intent intentRegisterReceiver = context.registerReceiver(null, b);
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                yzyVar = yzy.CN;
            }
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.POWER_MONITORING, yzyVar).l());
        }
        ((ype) ((ype) a.h()).ai((char) 4777)).u("Battery status is not available, assuming not charging.");
        yzyVar = yzy.CO;
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.POWER_MONITORING, yzyVar).l());
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("BatteryChargingStateMonitor");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        c(context);
    }
}
