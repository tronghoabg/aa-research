package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbManager;
import android.os.Build;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class rza {
    protected final Context a;
    protected final UsbManager b;
    private xxh c = xvy.a;

    protected rza(Context context, UsbManager usbManager) {
        this.a = context;
        this.b = usbManager;
    }

    public static rza f(Context context, UsbManager usbManager) {
        return Build.VERSION.SDK_INT >= 29 ? new ryh(context, usbManager) : new ryd(context, usbManager);
    }

    public abstract Map a();

    public abstract void b();

    public abstract boolean c();

    final ryx e() {
        int i = ryq.a;
        Intent intentE = dup.e(this.a, null, new IntentFilter("android.hardware.usb.action.USB_STATE"), null, 2);
        if (intentE != null) {
            return ryx.c(intentE.getExtras());
        }
        return null;
    }

    final boolean g() {
        if (!this.c.f()) {
            this.c = xxh.h(Boolean.valueOf(c()));
        }
        return ((Boolean) this.c.b()).booleanValue();
    }
}
