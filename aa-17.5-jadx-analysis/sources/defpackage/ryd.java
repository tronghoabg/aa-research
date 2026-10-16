package defpackage;

import android.hardware.usb.UsbManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ryd extends rza {
    private static final ypf c = ols.R("CAR.SERVICE");

    @Override // defpackage.rza
    public final Map a() {
        HashMap map = new HashMap();
        UsbManager usbManager = this.b;
        for (ryt rytVar : ryq.c(usbManager)) {
            ryv ryvVarA = ryq.a(usbManager, rytVar);
            if (ryvVarA != null) {
                map.put(rytVar.toString(), ryvVarA);
            }
        }
        return map;
    }

    @Override // defpackage.rza
    public final void b() {
        ryq.b(this.b);
    }

    @Override // defpackage.rza
    public final boolean c() {
        try {
            UsbManager usbManager = this.b;
            for (ryt rytVar : ryq.c(usbManager)) {
                ryq.a(usbManager, rytVar);
            }
            return true;
        } catch (ClassCastException | rye unused) {
            c.h().ai(8550).u("Unabled to get USB port status, USB babysitter will be disabled.");
            return false;
        }
    }
}
