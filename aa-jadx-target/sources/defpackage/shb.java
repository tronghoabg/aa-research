package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class shb {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SETUP");
    private static final defpackage.yhx c = defpackage.yhx.p(5, 3);
    public static final defpackage.sjr b = new defpackage.sjr((byte[]) null);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(android.content.Intent intent) {
        if (intent == null) {
            a.h().ai(8915).u("Null intent. Unable to determine connection type.");
            return -1;
        }
        java.lang.String action = intent.getAction();
        if (action == null) {
            a.h().ai(8914).u("Null intent action. Unable to determine connection type.");
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
        a.h().ai(8913).y("Unknown connection type: %s", action);
        return -1;
    }

    public static void b(android.content.Context context, android.content.Intent intent, defpackage.xzi xziVar, boolean z) {
        android.hardware.usb.UsbAccessory usbAccessory;
        java.lang.String action = intent.getAction();
        if (("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(action) || "android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE".equals(action) || ("android.hardware.usb.action.USB_STATE".equals(action) && intent.getBooleanExtra("accessory", false) && intent.getBooleanExtra("configured", false))) && android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.sjr sjrVar = b;
            if (sjrVar.c()) {
                defpackage.yqk yqkVar = a;
                yqkVar.f().ai(8916).y("Using FirstActivity bypass from intent: %s", intent);
                if (!defpackage.tnx.f(context)) {
                    yqkVar.f().ai(8923).u("User is locked");
                    defpackage.omv.i(context, defpackage.yyn.CAR_SETUP_DIRECT_BOOT_USER_LOCKED);
                    sjrVar.b();
                    return;
                }
                if ("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(intent.getAction()) && intent.hasExtra("accessory")) {
                    usbAccessory = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory");
                    if (usbAccessory == null) {
                        yqkVar.h().ai(8922).u("Null USB Accessory from ACTION_USB_ACCESSORY_ATTACHED intent.");
                        sjrVar.b();
                        return;
                    }
                } else {
                    rzh rzhVarA = rzi.a(context);
                    android.hardware.usb.UsbAccessory usbAccessory2 = rzhVarA.a;
                    if (usbAccessory2 == null || !rzhVarA.b || !rzhVarA.c) {
                        yqkVar.h().ai(8917).y("Accessory is not valid: %s", usbAccessory2);
                        sjrVar.b();
                        return;
                    }
                    usbAccessory = usbAccessory2;
                }
                defpackage.omv.i(context, defpackage.yyn.CAR_SETUP_ACCESSORY_CONNECTED);
                if (defpackage.qtp.a(context).g() && sdp.a(context)) {
                    yqkVar.h().ai(8921).y("Detected unsupported device, ignoring %s", intent);
                    defpackage.omv.i(context, defpackage.yyn.CAR_SETUP_DEVICE_UNSUPPORTED);
                    sjrVar.b();
                } else if (defpackage.sfq.a.c(context)) {
                    yqkVar.h().ai(8920).y("Detected user disabled Gearhead, ignoring %s", intent);
                    defpackage.omv.i(context, defpackage.yyn.CAR_SETUP_GEARHEAD_DISABLED);
                    sjrVar.b();
                } else if (d(context, intent)) {
                    yqkVar.f().ai(8919).u("PreSetup flow started, exiting for now");
                    defpackage.omv.i(context, defpackage.yyn.CAR_SETUP_PRE_SETUP);
                    sjrVar.b();
                } else {
                    yqkVar.f().ai(8918).u("Starting handoff.");
                    c(context, usbAccessory, xziVar, z);
                    sjrVar.b();
                }
            }
        }
    }

    public static void c(android.content.Context context, android.hardware.usb.UsbAccessory usbAccessory, defpackage.xzi xziVar, boolean z) {
        defpackage.ypu ypuVarAi = a.f().ai(8928);
        defpackage.xzi xziVar2 = defpackage.riv.b;
        ypuVarAi.y("Starting carService: %s", new defpackage.zkf(defpackage.zke.a, ((android.content.ComponentName) xziVar2.fF()).flattenToString()));
        com.google.android.gms.carsetup.setup.SetupBinder setupBinder = (com.google.android.gms.carsetup.setup.SetupBinder) xziVar.fF();
        android.content.Intent intent = new android.content.Intent("android.hardware.usb.action.USB_ACCESSORY_ATTACHED");
        intent.putExtra("EXTRA_LOCAL_BINDER", setupBinder);
        intent.putExtra("accessory", usbAccessory);
        intent.setComponent((android.content.ComponentName) xziVar2.fF());
        intent.putExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        intent.putExtra("show_permission_errors", z);
        setupBinder.a = intent;
        defpackage.omv.i(context, defpackage.yyn.CAR_SETUP_STARTED_SETUP_SERVICE);
        if (android.os.Build.VERSION.SDK_INT < 30) {
            context.startService(intent);
        } else {
            g(context, intent);
        }
    }

    public static boolean d(android.content.Context context, android.content.Intent intent) {
        boolean zD = defpackage.sfq.a.d(context);
        defpackage.yqk yqkVar = a;
        yqkVar.f().ai(8926).y("Checking preSetup required: gearheadUpToDate=%b", java.lang.Boolean.valueOf(zD));
        int iA = a(intent);
        if (iA != 1) {
            yqkVar.f().ai(8927).w("Presetup does not support connectionType=%s", iA);
            return false;
        }
        int i = sdp.a;
        int iB = sdp.b(context);
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        if (defpackage.acvq.g() && c.contains(java.lang.Integer.valueOf(iB))) {
            f(context);
            int i2 = sgn.a;
            sgn.a(context, 1, iB, intent);
            return true;
        }
        if (zD) {
            sgh.m.f().ai(8890).u("Sending presetup finish request");
            context.sendBroadcast(sgh.n);
            return false;
        }
        f(context);
        int i3 = sgn.a;
        sgn.a(context, 1, iB, intent);
        return true;
    }

    public static boolean e(android.content.Intent intent) {
        return android.os.Build.VERSION.SDK_INT >= 30 && a(intent) == 1;
    }

    private static void f(android.content.Context context) {
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager != null) {
            a.f().ai(8912).y("Starting presetup isKeyguardLocked=%b", java.lang.Boolean.valueOf(keyguardManager.isKeyguardLocked()));
        }
    }

    private static void g(android.content.Context context, android.content.Intent intent) {
        try {
            intent.putExtra("start_foreground_immediately", true);
            a$.ExternalSyntheticApiModelOutline1.m(context, intent);
        } catch (android.app.ForegroundServiceStartNotAllowedException e) {
            a.h().p(e).ai(8929).u("Unable to start foreground service.");
            intent.putExtra("start_foreground_immediately", false);
            context.startService(intent);
        }
    }
}
