package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class abos {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public abos(Context context) {
        rqi rqiVar = new rqi(context);
        rhx rhxVar = rhx.c;
        ygr ygrVar = rhx.d;
        ygr ygrVar2 = rhx.e;
        rqj rqjVar = new rqj(TimeUnit.SECONDS);
        this.c = rqiVar;
        this.b = ygrVar;
        this.d = ygrVar2;
        this.a = rqjVar;
    }

    public final synchronized ywq a() {
        ywq ywqVar;
        Object obj = this.c;
        IntentFilter intentFilter = rqi.a;
        Context context = ((rqi) obj).b;
        Intent intentE = dup.e(context, null, intentFilter, null, 4);
        if (intentE != null && intentE.getBooleanExtra("present", false)) {
            abnp abnpVarN = ywq.a.n();
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            int intProperty = batteryManager == null ? -1 : batteryManager.getIntProperty(1);
            if (intProperty >= 0) {
                abnpVarN.t();
                ywq ywqVar2 = (ywq) abnpVarN.b;
                ywqVar2.b |= 8;
                ywqVar2.f = intProperty;
            }
            int intExtra = intentE.getIntExtra("plugged", -1);
            if (intExtra >= 0) {
                abnpVarN.t();
                ywq ywqVar3 = (ywq) abnpVarN.b;
                ywqVar3.b = 1 | ywqVar3.b;
                ywqVar3.c = intExtra;
            }
            int intExtra2 = intentE.getIntExtra("status", -1);
            if (intExtra2 >= 0) {
                abnpVarN.t();
                ywq ywqVar4 = (ywq) abnpVarN.b;
                ywqVar4.b |= 2;
                ywqVar4.d = intExtra2;
            }
            int intExtra3 = intentE.getIntExtra("level", -1);
            int intExtra4 = intentE.getIntExtra("scale", -1);
            if (intExtra3 >= 0 && intExtra4 > 0) {
                abnpVarN.t();
                ywq ywqVar5 = (ywq) abnpVarN.b;
                ywqVar5.b = 4 | ywqVar5.b;
                ywqVar5.e = (intExtra3 * 100) / intExtra4;
            }
            int intExtra5 = intentE.getIntExtra("temperature", Integer.MIN_VALUE);
            if (intExtra5 != Integer.MIN_VALUE) {
                abnpVarN.t();
                ywq ywqVar6 = (ywq) abnpVarN.b;
                ywqVar6.b |= 16;
                ywqVar6.g = intExtra5;
            }
            ywqVar = (ywq) abnpVarN.q();
        } else {
            ywqVar = ywq.a;
        }
        return ywqVar;
    }

    public abos(String str, wed wedVar, Boolean bool, Boolean bool2) {
        this.d = str;
        this.c = wedVar;
        this.b = bool;
        this.a = bool2;
    }

    public abos(abqd abqdVar, Object obj, abqd abqdVar2, Object obj2) {
        this.c = abqdVar;
        this.a = obj;
        this.d = abqdVar2;
        this.b = obj2;
    }

    public abos(xxh xxhVar, xxh xxhVar2, xxh xxhVar3) {
        this.b = new AtomicBoolean(false);
        this.c = xxhVar;
        this.a = xxhVar2;
        this.d = xxhVar3;
    }
}
