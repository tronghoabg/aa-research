package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes2.dex */
public final class okn extends ojj {
    public final Context a;

    public okn(Context context) {
        super(yxo.USB_SIGNAL_DISABLED, false);
        this.a = context;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new okm(this);
    }

    @Override // defpackage.ojj
    public final int d() {
        if (Build.VERSION.SDK_INT < 31) {
            return 1;
        }
        try {
            return !((DevicePolicyManager) this.a.getSystemService(DevicePolicyManager.class)).isUsbDataSignalingEnabled() ? 2 : 1;
        } catch (IllegalStateException unused) {
            return 1;
        }
    }

    @Override // defpackage.ojj
    public final void b() {
    }
}
