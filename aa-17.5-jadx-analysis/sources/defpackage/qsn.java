package defpackage;

import android.content.Intent;
import android.hardware.usb.UsbAccessory;

/* loaded from: classes2.dex */
public final class qsn extends rht {
    public final /* synthetic */ qso a;

    public qsn(qso qsoVar) {
        this.a = qsoVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        String action = intent.getAction();
        if (((UsbAccessory) intent.getParcelableExtra("accessory")) == null || !action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
            return;
        }
        qso qsoVar = this.a;
        rbe.e(qsoVar.f, new qjv(this, 17));
    }
}
