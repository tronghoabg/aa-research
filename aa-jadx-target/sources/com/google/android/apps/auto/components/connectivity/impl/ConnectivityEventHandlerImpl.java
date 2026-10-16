package com.google.android.apps.auto.components.connectivity.impl;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ConnectivityEventHandlerImpl implements defpackage.kng {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ConnBroadcast");
    private static final defpackage.ygw d = defpackage.ygw.t("android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED", "android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE", "android.hardware.usb.action.USB_STATE");
    private static final defpackage.yhx e = defpackage.yhx.q("Android Auto", "Android Open Automotive Protocol", "Android");
    public final java.util.Set b;
    public final java.util.Set c;
    private final android.content.Context f;
    private final defpackage.xzi g;
    private final defpackage.rhc h;
    private boolean i;
    private int j;
    private com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.ConnectivityEventBroadcastReceiver k;
    private long l;
    private long m;
    private boolean n;
    private final android.net.ConnectivityManager.NetworkCallback o;
    private volatile int p;

    public static class ConnectivityEventBroadcastReceiver extends defpackage.kxb {
        public static final /* synthetic */ int a = 0;

        @Override // defpackage.mdl
        protected final defpackage.vlu a() {
            return new defpackage.vlu("ConnectivityEventHandlerImpl");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
        @Override // defpackage.kxb
        public final void c(android.content.Context context, final android.content.Intent intent) throws wfo {
            defpackage.jrm jrmVar = defpackage.jrm.PROJECTION;
            if (((defpackage.jrm) defpackage.mkp.a.i(defpackage.jrm.class)) != defpackage.jrm.SHARED_SERVICE) {
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.a.g()).ai((char) 3301)).u("Connectivity events should only be handled from SHARED_SERVICE");
                return;
            }
            final defpackage.knh knhVar = (defpackage.knh) defpackage.mkp.a.k(defpackage.knh.class);
            final defpackage.kng kngVar = (defpackage.kng) defpackage.mkp.a.k(defpackage.kng.class);
            if (knhVar == null || kngVar == null) {
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.a.h()).ai((char) 3300)).u("ConnectivityLogger/ConnectivityEventHandler not registered.");
                return;
            }
            defpackage.ojm.a();
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            final defpackage.mmi mmiVarE = e();
            defpackage.mkp.a.d.execute(new java.lang.Runnable() { // from class: kpg
                @Override // java.lang.Runnable
                public final void run() {
                    int i = com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.ConnectivityEventBroadcastReceiver.a;
                    kngVar.a(intent, jElapsedRealtime);
                    knhVar.o(mmiVarE);
                }
            });
            java.lang.String action = intent.getAction();
            if ("com.google.android.apps.auto.components.connectivity.ACTION_SESSION_EXPIRED".equals(action) || j$.util.Objects.equals(action, "android.bluetooth.device.action.ACL_DISCONNECTED")) {
                kngVar.d();
                return;
            }
            java.lang.String action2 = intent.getAction();
            if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action2) || "com.google.android.gms.car.FIRST_ACTIVITY".equals(action2)) {
                kngVar.c();
            }
        }
    }

    public ConnectivityEventHandlerImpl(android.content.Context context) {
        defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.kpe(context, 0));
        defpackage.kpe kpeVar = new defpackage.kpe(context, 2);
        this.b = new java.util.HashSet();
        this.c = new java.util.HashSet();
        this.l = 0L;
        this.m = 0L;
        this.n = false;
        this.p = 1;
        this.o = new defpackage.kpf();
        this.f = context;
        this.g = xziVarAQ;
        this.h = (defpackage.rhc) kpeVar.fF();
    }

    private static int e(android.content.Context context) {
        android.content.Intent intentE = defpackage.duw.e(context, null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"), null, 2);
        if (intentE == null) {
            return 0;
        }
        return intentE.getIntExtra("plugged", 0);
    }

    private final android.net.ConnectivityManager f() {
        return (android.net.ConnectivityManager) this.f.getSystemService("connectivity");
    }

    private final boolean g(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (defpackage.adax.ai()) {
            return new ozp(this.f, defpackage.mpr.f().b()).f(bluetoothDevice, false);
        }
        return false;
    }

    private static final boolean h(java.lang.String str) {
        return defpackage.mpr.f().b().d(str);
    }

    private static final void i(int i) {
        if (i == 2) {
            ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).d(defpackage.yyn.USB_CHARGER_CONNECTED);
        } else if (i == 1) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3322)).u("AC Power adapter connected.");
        }
    }

    private final int j() {
        android.hardware.usb.UsbAccessory[] accessoryList = ((android.hardware.usb.UsbManager) this.f.getSystemService("usb")).getAccessoryList();
        if (accessoryList == null || (accessoryList.length) == 0) {
            return 2;
        }
        for (android.hardware.usb.UsbAccessory usbAccessory : accessoryList) {
            if (e.contains(usbAccessory.getModel())) {
                return 6;
            }
        }
        return 7;
    }

    private final void k(int i, long j) {
        if (i != this.p) {
            if (i == 2) {
                int i2 = this.p;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    return;
                }
            }
            this.p = i;
            defpackage.yyn yynVar = defpackage.yyn.UNKNOWN;
            int i3 = this.p;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            switch (i4) {
                case defpackage.abnt.b /* 0 */:
                    ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3327)).u("Unexpected USB state: UNKNOWN");
                    return;
                case 1:
                    yynVar = defpackage.yyn.GH_USB_DISCONNECTED;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    yynVar = defpackage.yyn.GH_USB_CONNECTED;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    yynVar = defpackage.yyn.GH_USB_CONFIGURED;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    yynVar = defpackage.yyn.GH_USB_ACCESSORY;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    yynVar = defpackage.yyn.ANDROID_AUTO_USB_ACCESSORY_CONNECTED;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    yynVar = defpackage.yyn.NON_ANDROID_AUTO_ACCESSORY_CONNECTED;
                    break;
            }
            ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).g(yynVar, j$.util.OptionalInt.empty(), j);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:203:0x046c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0512  */
    /* JADX WARN: Code duplicated, block: B:253:0x051a A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x0524  */
    /* JADX WARN: Code duplicated, block: B:257:0x052c A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x0536  */
    /* JADX WARN: Code duplicated, block: B:261:0x053e A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0548  */
    /* JADX WARN: Code duplicated, block: B:265:0x0550 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x055a  */
    /* JADX WARN: Code duplicated, block: B:269:0x0562 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x0577  */
    /* JADX WARN: Code duplicated, block: B:273:0x057f A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x0589  */
    /* JADX WARN: Code duplicated, block: B:277:0x0591 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x059b  */
    /* JADX WARN: Code duplicated, block: B:281:0x05a3 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:285:0x05bf A[Catch: rsn -> 0x0840, TRY_ENTER, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:287:0x060a A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:289:0x061a A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x063b A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:293:0x0646  */
    /* JADX WARN: Code duplicated, block: B:295:0x0649  */
    /* JADX WARN: Code duplicated, block: B:297:0x064c A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:298:0x064f A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:299:0x0652 A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:300:0x0655 A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x065f  */
    /* JADX WARN: Code duplicated, block: B:305:0x0667 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:307:0x0671  */
    /* JADX WARN: Code duplicated, block: B:309:0x0679 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x068d  */
    /* JADX WARN: Code duplicated, block: B:313:0x0695 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:315:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:317:0x06b2 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:321:0x06cf A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:323:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:325:0x06eb A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:327:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:329:0x06fd A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x0707  */
    /* JADX WARN: Code duplicated, block: B:333:0x070f A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:335:0x0716  */
    /* JADX WARN: Code duplicated, block: B:337:0x071e A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0728  */
    /* JADX WARN: Code duplicated, block: B:341:0x0730 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:343:0x0745  */
    /* JADX WARN: Code duplicated, block: B:345:0x074d A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:347:0x0762  */
    /* JADX WARN: Code duplicated, block: B:349:0x076a A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x0773  */
    /* JADX WARN: Code duplicated, block: B:353:0x077b A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:355:0x078f  */
    /* JADX WARN: Code duplicated, block: B:357:0x0797 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:359:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:361:0x07a9 A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:363:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:365:0x07bb A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:367:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:369:0x07d8 A[Catch: rsn -> 0x0840, TRY_ENTER, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:371:0x07de A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:373:0x07ec A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:375:0x07f8 A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:376:0x0801 A[Catch: rsn -> 0x0840, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:379:0x0813  */
    /* JADX WARN: Code duplicated, block: B:381:0x081b A[Catch: rsn -> 0x0840, TRY_ENTER, TRY_LEAVE, TryCatch #0 {rsn -> 0x0840, blocks: (B:247:0x0503, B:253:0x051a, B:257:0x052c, B:261:0x053e, B:265:0x0550, B:269:0x0562, B:273:0x057f, B:277:0x0591, B:281:0x05a3, B:285:0x05bf, B:287:0x060a, B:289:0x061a, B:291:0x063b, B:297:0x064c, B:301:0x0657, B:298:0x064f, B:299:0x0652, B:300:0x0655, B:305:0x0667, B:309:0x0679, B:313:0x0695, B:317:0x06b2, B:321:0x06cf, B:325:0x06eb, B:329:0x06fd, B:333:0x070f, B:337:0x071e, B:341:0x0730, B:345:0x074d, B:349:0x076a, B:353:0x077b, B:357:0x0797, B:361:0x07a9, B:365:0x07bb, B:369:0x07d8, B:371:0x07de, B:373:0x07ec, B:375:0x07f8, B:377:0x0805, B:376:0x0801, B:381:0x081b), top: B:388:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:412:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x024b, code lost:
    
        r1 = r6.c(r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0253, code lost:
    
        if (r1.f() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0255, code lost:
    
        r7 = (defpackage.sbg) r19.g.fF();
        r1 = ((com.google.android.gms.carsetup.CarInfoInternal) r1.b()).a;
        r8 = defpackage.yyg.a.n();
        r9 = defpackage.yyy.a.n();
        r1 = r1.a();
        r9.t();
        r10 = (defpackage.yyy) r9.b;
        r1.getClass();
        r10.d = r1;
        r10.b |= 2;
        r8.t();
        r1 = (defpackage.yyg) r8.b;
        r9 = (defpackage.yyy) r9.q();
        r9.getClass();
        r1.e = r9;
        r1.b |= 1;
        r1 = defpackage.yyh.LOCAL_DB_CAR_INFO;
        r9 = defpackage.ygw.d;
        r7.f(r8, r1, defpackage.ymx.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ac, code lost:
    
        r6.close();
        r1 = g(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02b3, code lost:
    
        if (r1 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02b9, code lost:
    
        if (h(r5) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02bb, code lost:
    
        r6 = defpackage.yhx.m(defpackage.xzd.c(',').b().g(defpackage.adax.Y()));
        r2 = r2.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02d5, code lost:
    
        if (r2 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d7, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d9, code lost:
    
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02e1, code lost:
    
        if (r6.hasNext() == false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02ed, code lost:
    
        if (r2.contains((java.lang.String) r6.next()) == false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02ef, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02f0, code lost:
    
        r4.a(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02fd, code lost:
    
        if (defpackage.acoo.a.fF().d() != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0303, code lost:
    
        if (defpackage.acoo.h() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0309, code lost:
    
        if (h(r5) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x030b, code lost:
    
        r19.h.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0310, code lost:
    
        r19.b.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0315, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0316, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0318, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x031c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x031d, code lost:
    
        r0.addSuppressed(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0320, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0329, code lost:
    
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(r20.getAction()) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x032f, code lost:
    
        if (defpackage.acpv.s() != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0337, code lost:
    
        if (r19.b.contains(r5) == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r2.equals("android.bluetooth.device.action.ACL_DISCONNECTED") != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x033d, code lost:
    
        if (h(r5) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x033f, code lost:
    
        r4.d(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_DISCONNECTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0344, code lost:
    
        r19.b.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0349, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04b7, code lost:
    
        if (r2.equals("android.intent.action.ACTION_POWER_DISCONNECTED") != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04b9, code lost:
    
        r2 = r19.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04c3, code lost:
    
        if (r20.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED") == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04c5, code lost:
    
        r1 = e(r2);
        r19.j = r1;
        i(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04ce, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04d7, code lost:
    
        if (r20.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04d9, code lost:
    
        r0 = r19.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04dc, code lost:
    
        if (r0 != 2) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04de, code lost:
    
        ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).d(defpackage.yyn.USB_CHARGER_DISCONNECTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04ed, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04ef, code lost:
    
        if (r0 != 1) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04f1, code lost:
    
        ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).d(defpackage.yyn.AC_ONLY_USB_CHARGER_DISCONNECTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0500, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (r2.equals("android.intent.action.ACTION_POWER_CONNECTED") != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0217, code lost:
    
        if (r2.equals("android.bluetooth.device.action.ACL_CONNECTED") != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0219, code lost:
    
        r2 = (android.bluetooth.BluetoothDevice) r20.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x021f, code lost:
    
        if (r2 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0221, code lost:
    
        r4 = (defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class);
        r5 = r2.getAddress();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0237, code lost:
    
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(r20.getAction()) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023d, code lost:
    
        if (defpackage.adax.aH() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023f, code lost:
    
        r4.d(defpackage.yyn.CONNECTIVITY_EVENT_ACL_CONNECTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0244, code lost:
    
        r6 = new defpackage.jlv(r19.f);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.kng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Intent r20, long r21) {
        /*
            Method dump skipped, instruction units count: 2368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.a(android.content.Intent, long):void");
    }

    @Override // defpackage.kng
    public final void b(java.lang.String str) {
        defpackage.mkp.a.d.execute(new defpackage.kos(this, str, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kng
    public final void c() {
        defpackage.jrm jrmVar = defpackage.jrm.PROJECTION;
        if (((defpackage.jrm) defpackage.mkp.a.i(defpackage.jrm.class)) != defpackage.jrm.SHARED_SERVICE) {
            throw new java.lang.IllegalStateException();
        }
        if (this.k != null) {
            return;
        }
        this.k = new com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.ConnectivityEventBroadcastReceiver();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        defpackage.ygw ygwVar = d;
        int i = ((defpackage.ymx) ygwVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            intentFilter.addAction((java.lang.String) ygwVar.get(i2));
        }
        defpackage.duw.e(this.f.getApplicationContext(), this.k, intentFilter, null, 2);
        if (this.i) {
            return;
        }
        try {
            f().registerNetworkCallback(new android.net.NetworkRequest.Builder().addCapability(12).build(), this.o);
            this.i = true;
        } catch (java.lang.SecurityException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2)).ai((char) 3332)).u("Register networkCallback");
            ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).d(defpackage.yyn.INTERNET_FAILED_TO_LOG);
        }
    }

    @Override // defpackage.kng
    public final void d() {
        if (this.k == null) {
            return;
        }
        this.f.getApplicationContext().unregisterReceiver(this.k);
        if (this.i) {
            f().unregisterNetworkCallback(this.o);
            this.i = false;
        }
        this.k = null;
    }
}
