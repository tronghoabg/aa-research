package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adcv implements defpackage.adcu {
    private static final defpackage.wbn a;
    private static final defpackage.wbn b;

    static {
        defpackage.wbl wblVarA = new defpackage.wbl(defpackage.way.a("com.google.android.gms.car"), "", "", false, false).b().a();
        a = wblVarA.e("UsbStatusLoggingFeature__check_android_auto_support_using_shared_pref", true);
        b = wblVarA.e("UsbStatusLoggingFeature__enable_usb_status_logging", false);
    }

    @Override // defpackage.adcu
    public final boolean a() {
        return ((java.lang.Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.adcu
    public final boolean b() {
        return ((java.lang.Boolean) b.b()).booleanValue();
    }
}
