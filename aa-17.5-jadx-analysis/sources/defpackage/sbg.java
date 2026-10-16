package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbManager;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sbg {
    public static final ypf a = ols.R("CAR.WIFI.INFO");
    public final Context c;
    public boolean g;
    public boolean h;
    final sbc b = new sbc();
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    private boolean i = false;

    public sbg(Context context, UsbManager usbManager) {
        this.g = false;
        this.h = false;
        this.c = context;
        Intent intentE = dup.e(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, 4);
        this.g = intentE != null && e(intentE);
        this.h = usbManager.getAccessoryList() != null;
    }

    public static sbe a(Context context) {
        sbd sbdVarA = sbe.a();
        sbdVarA.d(context.getString(R.string.car_startup_available_title));
        sbdVarA.c(true);
        sbdVarA.b(true);
        return sbdVarA.a();
    }

    public static final boolean e(Intent intent) {
        return (intent.getIntExtra("plugged", 0) & 3) != 0;
    }

    public final xxh b() {
        a.l().ai(8672).u("onBluetoothDisconnected");
        this.d = false;
        return c();
    }

    public final xxh c() {
        boolean z;
        boolean z2;
        Context context = this.c;
        String string = context.getString(R.string.car_startup_available_title);
        String string2 = context.getString(R.string.car_startup_bluetooth_connected);
        sbf sbfVar = sbf.a;
        boolean z3 = this.e;
        dst dstVar = null;
        if (z3 || (this.d && !this.h)) {
            if (this.g || z3) {
                if (!this.f || z3) {
                    string = context.getString(R.string.car_startup_connecting_title);
                    this.i = false;
                    string2 = "";
                } else {
                    string = context.getString(R.string.car_startup_error_title);
                    string2 = context.getString(R.string.car_startup_charge_only_detected);
                    sbfVar = sbf.b;
                    Intent intent = new Intent("com.google.android.gms.car_setup.CAR_STARTUP_NOTIFICATION");
                    intent.putExtra("NOTIFICATION_TYPE_EXTRA", 0);
                    intent.putExtra("PARCEL_EXTRA", new BinderParcel(this.b));
                    intent.setPackage(context.getPackageName());
                    dstVar = new dst(0, context.getString(R.string.common_learn_more), ssn.b(context, intent, ssn.a | 134217728));
                    this.i = true;
                    d(rrr.a);
                }
            } else if (this.i) {
                z2 = true;
                z = false;
            }
            z = false;
            z2 = false;
        } else {
            this.i = false;
            z = true;
            z2 = false;
        }
        sbd sbdVarA = sbe.a();
        sbdVarA.c((z || z2) ? false : true);
        sbdVarA.b(z);
        if (!z) {
            sbdVarA.d(string);
            sbdVarA.a = xxh.h(string2);
            sbdVarA.b = xxh.h(sbfVar);
            if (dstVar != null) {
                sbdVarA.c = xxh.h(dstVar);
            }
        }
        return xxh.h(sbdVarA.a());
    }

    public final void d(rrr rrrVar) {
        ols.L(this.c, "com.google.android.gms.car.CAR_STARTUP_NOTIFICATION", rrrVar, null);
    }
}
