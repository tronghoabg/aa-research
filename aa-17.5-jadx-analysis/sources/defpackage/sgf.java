package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.Build;
import com.google.android.gms.carsetup.setup.SetupBinder;

/* loaded from: classes.dex */
public final class sgf {
    public static final ypf a = ols.R("CAR.SETUP");
    private static final ygr c = ygr.p(5, 3);
    public static final lgx b = new lgx((char[]) null);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(Intent intent) {
        if (intent == null) {
            a.h().ai(8890).u("Null intent. Unable to determine connection type.");
            return -1;
        }
        String action = intent.getAction();
        if (action == null) {
            a.h().ai(8889).u("Null intent action. Unable to determine connection type.");
            return -1;
        }
        switch (action.hashCode()) {
            case -1989641542:
                if (action.equals("com.google.android.gms.carsetup.START_DUPLEX")) {
                    return 0;
                }
                break;
            case -528141398:
                if (action.equals("com.google.android.gms.car.WIFI_ACTION_BRIDGE")) {
                    return 2;
                }
                break;
            case -494529457:
                if (action.equals("android.hardware.usb.action.USB_STATE")) {
                    return 1;
                }
                break;
            case -462095206:
                if (action.equals("com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START")) {
                    return 1;
                }
                break;
            case 276138536:
                if (action.equals("android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE")) {
                    return 1;
                }
                break;
            case 1099555123:
                if (action.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED")) {
                    return 1;
                }
                break;
        }
        a.h().ai(8888).y("Unknown connection type: %s", action);
        return -1;
    }

    public static void b(Context context, Intent intent, xyc xycVar, boolean z) {
        UsbAccessory usbAccessory;
        String action = intent.getAction();
        if (("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(action) || "android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE".equals(action) || ("android.hardware.usb.action.USB_STATE".equals(action) && intent.getBooleanExtra("accessory", false) && intent.getBooleanExtra("configured", false))) && Build.VERSION.SDK_INT >= 30) {
            lgx lgxVar = b;
            if (lgxVar.f()) {
                ypf ypfVar = a;
                ypfVar.f().ai(8891).y("Using FirstActivity bypass from intent: %s", intent);
                if (!tmz.f(context)) {
                    ypfVar.f().ai(8898).u("User is locked");
                    ols.M(context, yxi.CAR_SETUP_DIRECT_BOOT_USER_LOCKED);
                    lgxVar.e();
                    return;
                }
                if ("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(intent.getAction()) && intent.hasExtra("accessory")) {
                    usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
                    if (usbAccessory == null) {
                        ypfVar.h().ai(8897).u("Null USB Accessory from ACTION_USB_ACCESSORY_ATTACHED intent.");
                        lgxVar.e();
                        return;
                    }
                } else {
                    rym rymVarA = ryn.a(context);
                    UsbAccessory usbAccessory2 = rymVarA.a;
                    if (usbAccessory2 == null || !rymVarA.b || !rymVarA.c) {
                        ypfVar.h().ai(8892).y("Accessory is not valid: %s", usbAccessory2);
                        lgxVar.e();
                        return;
                    }
                    usbAccessory = usbAccessory2;
                }
                ols.M(context, yxi.CAR_SETUP_ACCESSORY_CONNECTED);
                if (qst.a(context).g() && sct.a(context)) {
                    ypfVar.h().ai(8896).y("Detected unsupported device, ignoring %s", intent);
                    ols.M(context, yxi.CAR_SETUP_DEVICE_UNSUPPORTED);
                    lgxVar.e();
                } else if (seu.a.c(context)) {
                    ypfVar.h().ai(8895).y("Detected user disabled Gearhead, ignoring %s", intent);
                    ols.M(context, yxi.CAR_SETUP_GEARHEAD_DISABLED);
                    lgxVar.e();
                } else if (d(context, intent)) {
                    ypfVar.f().ai(8894).u("PreSetup flow started, exiting for now");
                    ols.M(context, yxi.CAR_SETUP_PRE_SETUP);
                    lgxVar.e();
                } else {
                    ypfVar.f().ai(8893).u("Starting handoff.");
                    c(context, usbAccessory, xycVar, z);
                    lgxVar.e();
                }
            }
        }
    }

    public static void c(Context context, UsbAccessory usbAccessory, xyc xycVar, boolean z) {
        yop yopVarAi = a.f().ai(8903);
        xyc xycVar2 = rhz.b;
        yopVarAi.y("Starting carService: %s", new zjd(zjc.a, ((ComponentName) xycVar2.gu()).flattenToString()));
        SetupBinder setupBinder = (SetupBinder) xycVar.gu();
        Intent intent = new Intent("android.hardware.usb.action.USB_ACCESSORY_ATTACHED");
        intent.putExtra("EXTRA_LOCAL_BINDER", setupBinder);
        intent.putExtra("accessory", usbAccessory);
        intent.setComponent((ComponentName) xycVar2.gu());
        intent.putExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        intent.putExtra("show_permission_errors", z);
        setupBinder.a = intent;
        ols.M(context, yxi.CAR_SETUP_STARTED_SETUP_SERVICE);
        if (Build.VERSION.SDK_INT < 30) {
            context.startService(intent);
        } else {
            g(context, intent);
        }
    }

    public static boolean d(Context context, Intent intent) {
        boolean zD = seu.a.d(context);
        ypf ypfVar = a;
        ypfVar.f().ai(8901).y("Checking preSetup required: gearheadUpToDate=%b", Boolean.valueOf(zD));
        int iA = a(intent);
        if (iA != 1) {
            ypfVar.f().ai(8902).w("Presetup does not support connectionType=%s", iA);
            return false;
        }
        int i = sct.a;
        int iB = sct.b(context);
        rhx rhxVar = rhx.c;
        if (acuo.g() && c.contains(Integer.valueOf(iB))) {
            f(context);
            int i2 = sfr.a;
            sfr.a(context, 1, iB, intent);
            return true;
        }
        if (zD) {
            sfl.m.f().ai(8865).u("Sending presetup finish request");
            context.sendBroadcast(sfl.n);
            return false;
        }
        f(context);
        int i3 = sfr.a;
        sfr.a(context, 1, iB, intent);
        return true;
    }

    public static boolean e(Intent intent) {
        return Build.VERSION.SDK_INT >= 30 && a(intent) == 1;
    }

    private static void f(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager != null) {
            a.f().ai(8887).y("Starting presetup isKeyguardLocked=%b", Boolean.valueOf(keyguardManager.isKeyguardLocked()));
        }
    }

    private static void g(Context context, Intent intent) {
        try {
            intent.putExtra("start_foreground_immediately", true);
            context.startForegroundService(intent);
        } catch (ForegroundServiceStartNotAllowedException e) {
            a.h().p(e).ai(8904).u("Unable to start foreground service.");
            intent.putExtra("start_foreground_immediately", false);
            context.startService(intent);
        }
    }
}
