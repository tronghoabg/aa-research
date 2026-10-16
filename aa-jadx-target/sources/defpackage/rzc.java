package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rzc extends defpackage.rzw {
    private static final defpackage.yqk c = defpackage.omv.n("CAR.SERVICE");

    public static rzq d(android.hardware.usb.UsbPortStatus usbPortStatus) {
        rzp rzpVar = new rzp();
        rzpVar.b(usbPortStatus.isConnected());
        rzpVar.c(usbPortStatus.getCurrentDataRole());
        rzpVar.e(usbPortStatus.getCurrentPowerRole());
        rzpVar.f(usbPortStatus.getSupportedRoleCombinations());
        rzpVar.d(usbPortStatus.getCurrentMode());
        return rzpVar.a();
    }

    @Override // defpackage.rzw
    public final java.util.Map a() {
        java.util.HashMap map = new java.util.HashMap();
        for (android.hardware.usb.UsbPort usbPort : this.b.getPorts()) {
            android.hardware.usb.UsbPortStatus status = usbPort.getStatus();
            if (status != null) {
                map.put(usbPort.toString(), d(status));
            }
        }
        return map;
    }

    @Override // defpackage.rzw
    public final void b() {
        if (defpackage.a.N() && defpackage.adcq.a.fF().u()) {
            c.l().ai(8577).u("Resetting connection using new API in Android-R");
            this.b.resetUsbGadget();
            return;
        }
        if (!defpackage.sqs.e()) {
            rzl.b(this.b);
            return;
        }
        c.l().ai(8576).u("Resetting connection via setRoles on UsbPort");
        for (android.hardware.usb.UsbPort usbPort : this.b.getPorts()) {
            android.hardware.usb.UsbPortStatus status = usbPort.getStatus();
            if (status != null && status.isConnected()) {
                usbPort.setRoles(1, 1);
            }
        }
    }

    @Override // defpackage.rzw
    public final boolean c() {
        return true;
    }
}
