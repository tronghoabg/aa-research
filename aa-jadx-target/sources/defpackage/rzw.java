package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rzw {
    protected final android.content.Context a;
    protected final android.hardware.usb.UsbManager b;
    private defpackage.xyn c = defpackage.xxe.a;

    protected rzw(android.content.Context context, android.hardware.usb.UsbManager usbManager) {
        this.a = context;
        this.b = usbManager;
    }

    public static defpackage.rzw f(android.content.Context context, android.hardware.usb.UsbManager usbManager) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? new defpackage.rzc(context, usbManager) : new ryy(context, usbManager);
    }

    public abstract java.util.Map a();

    public abstract void b();

    public abstract boolean c();

    final defpackage.rzs e() {
        int i = rzl.a;
        android.content.Intent intentE = defpackage.duw.e(this.a, null, new android.content.IntentFilter("android.hardware.usb.action.USB_STATE"), null, 2);
        if (intentE != null) {
            return defpackage.rzs.c(intentE.getExtras());
        }
        return null;
    }

    final boolean g() {
        if (!this.c.f()) {
            this.c = defpackage.xyn.h(java.lang.Boolean.valueOf(c()));
        }
        return ((java.lang.Boolean) this.c.b()).booleanValue();
    }
}
