package defpackage;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Vibrator;
import android.widget.RemoteViews;
import com.google.android.apps.auto.components.bugreport.BugreporterReceiver;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class pgt {
    public static final yph a = yph.c("GH.WirelessNotify");
    public final Context b;
    public final Handler c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final NotificationManager n;
    public final int o;
    public final Vibrator p;
    public boolean q;
    public boolean r;
    public boolean s;
    public BluetoothDevice t;
    public AlertDialog u;
    public Optional v = Optional.empty();
    public final Runnable w = new pfp(this, 4);
    public final ajdr x;
    private final boolean y;

    public pgt(pgs pgsVar) {
        Context context = pgsVar.a;
        this.b = context;
        this.c = pgsVar.b;
        this.d = pgsVar.c;
        this.e = pgsVar.d;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.n = notificationManager;
        this.p = (Vibrator) context.getSystemService("vibrator");
        this.x = pgsVar.e;
        this.f = aczv.bd();
        this.g = aczj.c();
        this.o = (int) aczv.b();
        boolean z = true;
        this.y = Build.VERSION.SDK_INT >= 30;
        this.h = Build.VERSION.SDK_INT >= 30;
        boolean z2 = Build.VERSION.SDK_INT >= 30 && aczv.ap();
        this.j = z2;
        boolean z3 = Build.VERSION.SDK_INT >= 34 && aczv.as();
        this.k = z3;
        boolean z4 = hrp.a() && aczv.ar();
        this.l = z4;
        boolean z5 = Build.VERSION.SDK_INT >= 30 && aczv.aq();
        this.m = z5;
        if (!z2 && !z5 && !z3 && !z4) {
            z = false;
        }
        this.i = z;
        this.s = false;
        notificationManager.createNotificationChannel(mas.a(context));
    }

    public final Notification a() {
        dsx dsxVarD = d();
        dsxVarD.r = "service";
        dsxVarD.i(this.b.getText(R.string.wireless_connecting_to_android_auto_notification_title));
        dsxVarD.m(0, 0, true);
        return dsxVarD.a();
    }

    final Intent b() {
        Intent className = new Intent().setClassName(this.b, "com.google.android.apps.auto.components.frx.phonescreen.TapHeadUnitActivity");
        className.setFlags(536870912);
        return className;
    }

    public final dsx c() {
        dsx dsxVarD = d();
        dsxVarD.e(2, false);
        dsxVarD.r = "err";
        return dsxVarD;
    }

    public final dsx d() {
        boolean zAP = aczv.aP();
        int i = true != zAP ? -1 : 1;
        mas.c();
        Context context = this.b;
        dsx dsxVar = new dsx(context, "gearhead_connection_status");
        dsxVar.e(2, true);
        dsxVar.l();
        dsxVar.r = "status";
        dsxVar.u = i;
        dsxVar.n(R.drawable.ic_android_auto);
        dsxVar.i = zAP ? 1 : 0;
        dsxVar.t = context.getColor(R.color.gearhead_sdk_light_blue_800);
        return dsxVar;
    }

    public final void e(Notification notification) {
        this.n.notify(this.d, notification);
        this.v = Optional.of(notification);
    }

    public final void f(pag pagVar) {
        Notification notificationA;
        if (this.q) {
            return;
        }
        if (this.h) {
            try {
                Object obj = this.x.d;
                if (((eqj) obj).e() != null) {
                    if (oni.c((qrn) ((eqj) obj).e()) == 1 && (pagVar == pag.FOUND_COMPATIBLE_WIFI_NETWORK || pagVar == pag.VERSION_CHECK_COMPLETE)) {
                        this.q = true;
                        this.r = false;
                        ((ype) a.l().ai((char) 6630)).y("Handled wireless setup event %s, but connected over USB to wireless capable HU, showing projection notification. ", pagVar.name());
                        i();
                        ((kny) this.x.e).d(yxi.WIRELESS_SERVICE_STARTS_AFTER_USB_PROJECTION);
                        return;
                    }
                }
            } catch (IllegalStateException | qrz e) {
                ((ype) ((ype) a.l().p(e)).ai((char) 6626)).u("Unable to obtain car connection type");
            }
        }
        if (this.f) {
            dsx dsxVarD = d();
            Context context = this.b;
            dsxVarD.i(context.getText(R.string.wireless_press_hu_button_notification_title));
            dsxVarD.h(context.getText(R.string.wireless_press_hu_button_notification_text));
            Object obj2 = this.x.a;
            Context applicationContext = context.getApplicationContext();
            BluetoothDevice bluetoothDevice = this.t;
            RemoteViews remoteViews = new RemoteViews(applicationContext.getPackageName(), R.layout.wifi_start_notification);
            Intent intentPutExtra = new Intent().setAction("com.google.android.projection.gearhead.START_WIRELESS_PROJECTION").setPackage(applicationContext.getPackageName()).setFlags(268435456).setComponent(new ComponentName(applicationContext, "com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver")).putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
            ClipData clipData = wdu.a;
            remoteViews.setOnClickPendingIntent(R.id.start_button, wdu.c(applicationContext, 123, intentPutExtra, 201326592));
            dsxVarD.w = remoteViews;
            dsxVarD.t = context.getColor(R.color.wifi_start_notification_background);
            notificationA = dsxVarD.a();
        } else if (this.g) {
            dsx dsxVarD2 = d();
            Context context2 = this.b;
            dsxVarD2.i(context2.getText(R.string.wireless_press_hu_button_notification_title));
            dsxVarD2.h(context2.getText(R.string.wireless_press_hu_button_notification_text));
            dsxVarD2.g = wdu.b(context2, 0, b(), 201326592);
            notificationA = dsxVarD2.a();
        } else {
            dsx dsxVarD3 = d();
            Context context3 = this.b;
            dsxVarD3.i(context3.getText(R.string.wireless_press_hu_button_notification_title));
            dsxVarD3.h(context3.getText(R.string.wireless_press_hu_button_notification_text));
            dsxVarD3.g = wdu.b(context3, 0, b(), 201326592);
            notificationA = dsxVarD3.a();
        }
        e(notificationA);
    }

    public final void g() {
        if (!this.g || this.q) {
            return;
        }
        dsx dsxVarD = d();
        Context context = this.b;
        dsxVarD.i(context.getText(R.string.wireless_connecting_to_car_notification_title));
        dsxVarD.t = context.getColor(R.color.wifi_start_notification_background);
        dsxVarD.m(0, 0, true);
        e(dsxVarD.a());
    }

    public final void h(pag pagVar) {
        boolean z = this.i;
        woy.aa(z, "Showing wifi reconnect notification when reconnectNotificationEnabled is false.");
        boolean z2 = true;
        this.s = true;
        ((ype) a.l().ai((char) 6632)).y("Showing notification to reconnect wifi message for event '%s'", pagVar.name());
        woy.aa(z, "User initiated wifi disconnect is not enabled.");
        boolean z3 = this.k && pagVar.equals(pag.USER_REJECT_WIFI_UNAVAILABLE);
        if ((!this.l || (!pagVar.equals(pag.USER_DISCONNECTED_ANOTHER_NETWORK_CONNECTED) && !pagVar.equals(pag.USER_DISCONNECTED_FROM_WIFI_NETWORK) && !pagVar.equals(pag.USER_DISCONNECTED_MD_WIFI_ADAPTER_OFF))) && (!this.m || !pagVar.equals(pag.USER_DISCONNECTED_MD_WIFI_ADAPTER_OFF))) {
            z2 = false;
        }
        Intent action = new Intent().setAction("com.google.android.projection.gearhead.USER_INITIATED_START_WIRELESS_PROJECTION");
        Context context = this.b;
        Intent intentPutExtra = action.setPackage(context.getPackageName()).setFlags(268435456).setComponent(new ComponentName(context, "com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService")).putExtra("android.bluetooth.device.extra.DEVICE", this.t).putExtra("WIFI_INTENT_PARAM_SHOW_DISMISS_NOTIFICATION_SHADE_TOAST_ON_RECONNECT", z3);
        ClipData clipData = wdu.a;
        PendingIntent pendingIntentD = wdu.d(context, 0, intentPutExtra, 201326592);
        dsx dsxVarD = d();
        dsxVarD.i(context.getText(R.string.wireless_turn_on_wifi_notification_title));
        dsxVarD.f(0, context.getText(R.string.android_auto_reconnect_wifi_action_text), pendingIntentD);
        if (z3 || z2) {
            dsxVarD.h(context.getText(R.string.wireless_disconnected_from_wifi_network_content_text));
        }
        e(dsxVarD.a());
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, oqe] */
    @ResultIgnorabilityUnspecified
    public final void i() {
        BluetoothDevice bluetoothDevice;
        Context context = this.b;
        dsx dsxVarD = d();
        dsxVarD.i(context.getText(R.string.android_auto_projecting_notification_title));
        if (acxa.av()) {
            dsxVarD.g = wdu.b(context, 0, new Intent().setComponent(new ComponentName(context, "com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity")).setFlags(335544320), 201326592);
        }
        if (this.y && this.r && (((bluetoothDevice = this.t) == null || !this.x.a.j(bluetoothDevice)) && ((eqj) this.x.c).e() == null)) {
            dsxVarD.f(0, context.getText(R.string.android_auto_disconnect_action_text), wdu.c(context, 0, new Intent().setAction("com.google.android.apps.auto.carservice.service.impl.ACTION_STOP_PROJECTION").setComponent(new ComponentName(context, "com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks$CarModeBroadcastReceiver")), 201326592));
            dsxVarD.h(context.getText(R.string.android_auto_using_bt_and_wifi_notification_text));
        } else {
            dsxVarD.h(context.getText(R.string.android_auto_projecting_notification_text));
        }
        if (kgi.i()) {
            dsxVarD.f(0, context.getText(R.string.android_auto_bugreport_action_text), wdu.c(context, 0, BugreporterReceiver.c("ORIGIN_NOTIFICATION", null), 201326592));
            dsxVarD.f(0, context.getText(R.string.android_auto_screenshot_action_text), wdu.c(context, 0, BugreporterReceiver.d(), 201326592));
        }
        e(dsxVarD.a());
    }
}
