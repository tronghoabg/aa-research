package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;

/* loaded from: classes3.dex */
final class xcn extends mdd {
    final /* synthetic */ xco a;

    public xcn(xco xcoVar) {
        this.a = xcoVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("UsbDisconnectReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        String action = intent.getAction();
        if (((UsbAccessory) intent.getParcelableExtra("accessory")) == null || !action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
            return;
        }
        this.a.d.f("EVENT_CAR_DISCONNECTED", null);
    }
}
