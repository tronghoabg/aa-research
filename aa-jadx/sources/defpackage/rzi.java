package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rzi {
    public static final defpackage.yhx a = defpackage.yhx.q("Android", "Android Auto", "Android Open Automotive Protocol");

    public static defpackage.rzh a(android.content.Context context) {
        android.hardware.usb.UsbAccessory[] accessoryList;
        android.hardware.usb.UsbManager usbManager = (android.hardware.usb.UsbManager) context.getSystemService("usb");
        android.hardware.usb.UsbAccessory usbAccessory = null;
        boolean z = false;
        if (usbManager != null && (accessoryList = usbManager.getAccessoryList()) != null && (accessoryList.length) != 0) {
            for (android.hardware.usb.UsbAccessory usbAccessory2 : accessoryList) {
                if (a.contains(usbAccessory2.getModel())) {
                    z = true;
                    usbAccessory = usbAccessory2;
                }
            }
            return new defpackage.rzh(accessoryList[0], false, true);
        }
        return new defpackage.rzh(usbAccessory, z, z);
    }
}
