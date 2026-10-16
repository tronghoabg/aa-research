package defpackage;

import android.hardware.usb.UsbAccessory;

/* loaded from: classes2.dex */
public final class rym {
    public final UsbAccessory a;
    public final boolean b;
    public final boolean c;

    public rym(UsbAccessory usbAccessory, boolean z, boolean z2) {
        this.a = usbAccessory;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rym) {
            rym rymVar = (rym) obj;
            UsbAccessory usbAccessory = this.a;
            if (usbAccessory != null ? usbAccessory.equals(rymVar.a) : rymVar.a == null) {
                if (this.b == rymVar.b && this.c == rymVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        UsbAccessory usbAccessory = this.a;
        int iHashCode = usbAccessory == null ? 0 : usbAccessory.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "Accessory{usbAccessory=" + String.valueOf(this.a) + ", isAndroidAutoAccessory=" + this.b + ", isConnected=" + this.c + "}";
    }

    public rym() {
        throw null;
    }
}
