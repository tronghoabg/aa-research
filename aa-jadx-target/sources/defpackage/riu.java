package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class riu implements defpackage.xzi {
    private final /* synthetic */ int a;

    public /* synthetic */ riu(int i) {
        this.a = i;
    }

    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        boolean z = true;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.xzi xziVar = defpackage.riv.a;
                return android.os.Build.VERSION.SDK_INT >= 30 ? new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.FirstActivityImpl") : new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.car.FirstActivity");
            case 1:
                defpackage.xzi xziVar2 = defpackage.riv.a;
                return android.os.Build.VERSION.SDK_INT >= 30 ? new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarSetupServiceImpl") : new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.CarSetupService");
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.xzi xziVar3 = defpackage.riv.a;
                return android.os.Build.VERSION.SDK_INT >= 30 ? new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarStartupServiceImpl") : new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.wifi.CarWifiConnectionService");
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Long.valueOf(defpackage.adcq.a.fF().a());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Long.valueOf(defpackage.adcq.a.fF().d());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Long.valueOf(defpackage.adcq.a.fF().i());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqk yqkVar = com.google.android.gms.carsetup.CarSetupServiceImpl.a;
                defpackage.adbn adbnVar = defpackage.adbn.a;
                return java.lang.Boolean.valueOf(adbnVar.fF().c() && !adbnVar.fF().b());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.content.Context context = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.h;
                context.getClass();
                android.hardware.usb.UsbManager usbManager = (android.hardware.usb.UsbManager) context.getSystemService("usb");
                usbManager.getClass();
                java.util.Iterator it = usbManager.getPorts().iterator();
                while (it.hasNext()) {
                    android.hardware.usb.UsbPortStatus status = ((android.hardware.usb.UsbPort) it.next()).getStatus();
                    if (status != null && status.isConnected()) {
                        return java.lang.Boolean.valueOf(z);
                    }
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqk yqkVar2 = defpackage.shl.a;
                return new defpackage.rkq(defpackage.ygw.r("com.google.android.gms", "com.google.android.projection.gearhead"));
            case 9:
                int i = defpackage.sqn.a;
                return java.util.regex.Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
            case 10:
                return defpackage.vwk.a();
            case 11:
                java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.wba.a;
                return defpackage.ysr.cg(java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new waz(0)));
            case 12:
                defpackage.whm.a.fF();
                return null;
            case 13:
                defpackage.xzi xziVar4 = defpackage.whm.a;
                java.lang.System.loadLibrary("mappedcountercacheversionjni");
                return null;
            default:
                int i2 = com.google.android.projection.gearhead.GhApplication.b;
                return defpackage.ysr.cg(java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
        }
    }
}
