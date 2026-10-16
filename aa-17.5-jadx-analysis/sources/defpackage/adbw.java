package defpackage;

/* loaded from: classes.dex */
public final class adbw implements adbv {
    private static final war a;
    private static final war b;

    static {
        wap wapVarA = new wap(wac.a("com.google.android.gms.car"), "", "", false, false).b().a();
        a = wapVarA.e("UsbStatusLoggingFeature__check_android_auto_support_using_shared_pref", true);
        b = wapVarA.e("UsbStatusLoggingFeature__enable_usb_status_logging", false);
    }

    @Override // defpackage.adbv
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.adbv
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
