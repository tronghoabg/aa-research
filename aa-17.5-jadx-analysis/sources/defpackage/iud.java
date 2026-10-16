package defpackage;

import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class iud extends rht {
    private final Handler a;
    private final Runnable b;

    public iud(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        String action = intent.getAction();
        if (((UsbAccessory) intent.getParcelableExtra("accessory")) != null) {
            action.getClass();
            if (action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
                rbe.e(this.a, this.b);
            }
        }
    }
}
