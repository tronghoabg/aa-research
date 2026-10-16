package defpackage;

import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;

/* loaded from: classes2.dex */
public final class sgi extends ssu {
    final /* synthetic */ UsbConnectionHelper a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgi(UsbConnectionHelper usbConnectionHelper) {
        super(null);
        this.a = usbConnectionHelper;
    }

    @Override // defpackage.ssu
    public final void a(Intent intent) {
        String action = intent.getAction();
        UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
        UsbConnectionHelper.a.l().ai(8905).y("USB detached %s", usbAccessory);
        if (usbAccessory == null || action == null || !action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
            return;
        }
        UsbConnectionHelper.b.set(false);
        this.a.c.b();
    }
}
