package defpackage;

import android.app.NotificationChannel;
import android.app.Service;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class sbb extends Service {
    private static final ypf a;
    private static final int g;
    public sbg b;
    public rxr c;
    protected BluetoothDevice d;
    private boolean k;
    private final BroadcastReceiver h = new sba(this);
    private final Handler i = new sss(Looper.getMainLooper());
    private boolean j = false;
    private long l = 60000;
    public final lgx f = new lgx((char[]) null);
    final Runnable e = new rzy(this, 4, null);

    static {
        Duration.ofSeconds(1L);
        a = ols.R("CAR.WIFI.INFO");
        g = R.id.car_startup_service_notification_id;
    }

    protected rxr a() {
        return rxr.a(this);
    }

    public final void b(sbe sbeVar) {
        if (Build.VERSION.SDK_INT >= 30 || this.j || ((AtomicLong) this.f.a).get() + 5000000000L > SystemClock.elapsedRealtimeNanos()) {
            if (this.j) {
                this.c.d(this, rhx.c.a());
            }
            dsx dsxVar = new dsx(this, null);
            dsxVar.i(getString(R.string.car_app_name));
            dsw dswVar = new dsw();
            xxh xxhVar = sbeVar.d;
            dswVar.d((CharSequence) xxhVar.e());
            dsxVar.o(dswVar);
            dsxVar.i((CharSequence) sbeVar.c.e());
            dsxVar.h((CharSequence) xxhVar.e());
            dsxVar.t = getResources().getColor(R.color.car_light_blue_500);
            dsxVar.n(2131231122);
            dsxVar.i = -1;
            getString(R.string.car_app_name);
            xxh xxhVar2 = sbeVar.f;
            if (xxhVar2.f()) {
                dsxVar.g((dst) xxhVar2.b());
            }
            dsxVar.g(new dst(0, getString(R.string.common_dismiss), ssn.b(this, new Intent("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND").setPackage(getPackageName()), ssn.a)));
            kwp kwpVarE = kwp.e(this);
            if (kwpVarE.c("car.default_notification_channel") == null) {
                a.l().ai(8658).y("Creating notification channel %s", "car.default_notification_channel");
                kwpVarE.d(new NotificationChannel("car.default_notification_channel", getString(R.string.car_app_name), 3));
            }
            if (kwpVarE.c("car.low_priority_notification_channel") == null) {
                a.l().ai(8657).y("Creating notification channel %s", "car.low_priority_notification_channel");
                kwpVarE.d(new NotificationChannel("car.low_priority_notification_channel", getString(R.string.car_status_notification_channel_name), 2));
            }
            xxh xxhVar3 = sbeVar.e;
            if (xxhVar3.f() && xxhVar3.b() == sbf.a) {
                dsxVar.x = "car.low_priority_notification_channel";
            } else {
                dsxVar.x = "car.default_notification_channel";
            }
            startForeground(g, dsxVar.a());
            a.f().ai(8666).u("started foreground service");
            Handler handler = this.i;
            Runnable runnable = this.e;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.l);
        }
    }

    public final void c() {
        if (this.j) {
            this.i.removeCallbacks(this.e);
            this.c.e(this);
            stopForeground(true);
            a.f().ai(8668).u("stopped foreground service");
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(xxh xxhVar) {
        if (!xxhVar.f()) {
            a.h().ai(8659).u("Notification option is not present. Not starting foreground service.");
            return false;
        }
        sbe sbeVar = (sbe) xxhVar.b();
        if (Build.VERSION.SDK_INT >= 30) {
            b(sbeVar);
            if (sbeVar.b) {
                c();
            }
            return true;
        }
        if (sbeVar.b) {
            c();
            return false;
        }
        if (!sbeVar.a) {
            return false;
        }
        b(sbeVar);
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.j = adbu.d();
        a.f().ai(8660).y("onCreate usbMonitoringEnabled %b", Boolean.valueOf(this.j));
        this.l = adbr.a.gu().b();
        if (this.j) {
            this.c = a();
            this.b = new sbg(this, (UsbManager) getSystemService("usb"));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
            intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("com.google.android.gms.car_setup.CAR_STARTUP_NOTIFICATION");
            intentFilter.addAction("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND");
            intentFilter.addAction("com.google.android.gms.car_setup.RESET_CONNECTION");
            intentFilter.addAction("com.google.android.gms.car.USB_ISSUE_FOUND");
            BroadcastReceiver broadcastReceiver = this.h;
            dup.e(this, broadcastReceiver, intentFilter, null, 2);
            etb.a(this).b(broadcastReceiver, intentFilter);
            this.k = true;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (this.k) {
            this.k = false;
            BroadcastReceiver broadcastReceiver = this.h;
            unregisterReceiver(broadcastReceiver);
            etb.a(this).c(broadcastReceiver);
        }
        this.i.removeCallbacks(this.e);
    }

    @Override // android.app.Service
    @ResultIgnorabilityUnspecified
    public int onStartCommand(Intent intent, int i, int i2) {
        sbg sbgVar;
        if (intent == null) {
            a.h().ai(8664).u("Null intent. Using default notification to start in foreground.");
            d(xxh.h(sbg.a(this)));
            return 2;
        }
        String action = intent.getAction();
        boolean zD = false;
        boolean booleanExtra = intent.getBooleanExtra("car_setup.SUPPORTS_ANDROID_AUTO", false);
        if (!booleanExtra || !this.j || (sbgVar = this.b) == null) {
            yop yopVarAi = a.h().ai(8661);
            Boolean boolValueOf = Boolean.valueOf(booleanExtra);
            zjc zjcVar = zjc.a;
            yopVarAi.R("Did not start foreground service: projected=%b, usbMonitoringEnabled=%b, notificationManager=%s", new zjd(zjcVar, boolValueOf), new zjd(zjcVar, Boolean.valueOf(this.j)), new zjd(zjcVar, this.b));
        } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
            this.d = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            sbg sbgVar2 = this.b;
            sbg.a.l().ai(8671).u("onBluetoothConnected");
            sbgVar2.d = true;
            zD = d(sbgVar2.c());
        } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
            this.d = null;
            zD = d(sbgVar.b());
        } else if (!"com.google.android.gms.car_setup.START_USB_PROJECTION".equals(action)) {
            a.h().ai(8663).y("Unrecognized action %s", new zjd(zjc.a, action));
        }
        if (!"com.google.android.gms.car_setup.START_USB_PROJECTION".equals(action) && !zD && Build.VERSION.SDK_INT >= 30) {
            a.h().ai(8662).u("Foreground service did not start. Starting now with default notification.");
            d(xxh.h(sbg.a(this)));
        }
        return 2;
    }
}
