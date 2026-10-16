package defpackage;

import android.content.Context;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;

/* loaded from: classes2.dex */
public final class ryn {
    public static final ygr a = ygr.q("Android", "Android Auto", "Android Open Automotive Protocol");

    public static rym a(Context context) {
        UsbAccessory[] accessoryList;
        UsbManager usbManager = (UsbManager) context.getSystemService("usb");
        UsbAccessory usbAccessory = null;
        boolean z = false;
        if (usbManager != null && (accessoryList = usbManager.getAccessoryList()) != null && (accessoryList.length) != 0) {
            for (UsbAccessory usbAccessory2 : accessoryList) {
                if (a.contains(usbAccessory2.getModel())) {
                    z = true;
                    usbAccessory = usbAccessory2;
                }
            }
            return new rym(accessoryList[0], false, true);
        }
        return new rym(usbAccessory, z, z);
    }
}
