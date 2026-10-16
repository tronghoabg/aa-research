package defpackage;

import android.hardware.usb.UsbPort;
import android.hardware.usb.UsbPortStatus;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ryh extends rza {
    private static final ypf c = ols.R("CAR.SERVICE");

    public static ryv d(UsbPortStatus usbPortStatus) {
        ryu ryuVar = new ryu();
        ryuVar.b(usbPortStatus.isConnected());
        ryuVar.c(usbPortStatus.getCurrentDataRole());
        ryuVar.e(usbPortStatus.getCurrentPowerRole());
        ryuVar.f(usbPortStatus.getSupportedRoleCombinations());
        ryuVar.d(usbPortStatus.getCurrentMode());
        return ryuVar.a();
    }

    @Override // defpackage.rza
    public final Map a() {
        HashMap map = new HashMap();
        for (UsbPort usbPort : this.b.getPorts()) {
            UsbPortStatus status = usbPort.getStatus();
            if (status != null) {
                map.put(usbPort.toString(), d(status));
            }
        }
        return map;
    }

    @Override // defpackage.rza
    public final void b() {
        if (a.O() && adbr.a.gu().u()) {
            c.l().ai(8552).u("Resetting connection using new API in Android-R");
            this.b.resetUsbGadget();
            return;
        }
        if (!spu.c()) {
            ryq.b(this.b);
            return;
        }
        c.l().ai(8551).u("Resetting connection via setRoles on UsbPort");
        for (UsbPort usbPort : this.b.getPorts()) {
            UsbPortStatus status = usbPort.getStatus();
            if (status != null && status.isConnected()) {
                usbPort.setRoles(1, 1);
            }
        }
    }

    @Override // defpackage.rza
    public final boolean c() {
        return true;
    }
}
