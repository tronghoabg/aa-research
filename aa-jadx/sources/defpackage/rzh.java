package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rzh {
    public final android.hardware.usb.UsbAccessory a;
    public final boolean b;
    public final boolean c;

    public rzh(android.hardware.usb.UsbAccessory usbAccessory, boolean z, boolean z2) {
        this.a = usbAccessory;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rzh) {
            defpackage.rzh rzhVar = (defpackage.rzh) obj;
            android.hardware.usb.UsbAccessory usbAccessory = this.a;
            if (usbAccessory != null ? usbAccessory.equals(rzhVar.a) : rzhVar.a == null) {
                if (this.b == rzhVar.b && this.c == rzhVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        android.hardware.usb.UsbAccessory usbAccessory = this.a;
        int iHashCode = usbAccessory == null ? 0 : usbAccessory.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "Accessory{usbAccessory=" + java.lang.String.valueOf(this.a) + ", isAndroidAutoAccessory=" + this.b + ", isConnected=" + this.c + "}";
    }

    public rzh() {
        throw null;
    }
}
