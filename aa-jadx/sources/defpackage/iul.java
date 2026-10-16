package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iul extends defpackage.rip {
    private final android.os.Handler a;
    private final java.lang.Runnable b;

    public iul(android.os.Handler handler, java.lang.Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (((android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory")) != null) {
            action.getClass();
            if (action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
                defpackage.rbz.e(this.a, this.b);
            }
        }
    }
}
