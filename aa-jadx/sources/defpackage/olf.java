package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class olf extends defpackage.okc {
    public final android.content.Context a;

    public olf(android.content.Context context) {
        super(defpackage.yyt.USB_SIGNAL_DISABLED, false);
        this.a = context;
    }

    @Override // defpackage.okc
    public final defpackage.okf a() {
        return new defpackage.ole(this);
    }

    @Override // defpackage.okc
    public final int d() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return 1;
        }
        try {
            return !((android.app.admin.DevicePolicyManager) this.a.getSystemService(android.app.admin.DevicePolicyManager.class)).isUsbDataSignalingEnabled() ? 2 : 1;
        } catch (java.lang.IllegalStateException unused) {
            return 1;
        }
    }

    @Override // defpackage.okc
    public final void b() {
    }
}
