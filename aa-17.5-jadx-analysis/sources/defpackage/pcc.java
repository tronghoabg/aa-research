package defpackage;

import android.hardware.usb.UsbAccessory;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class pcc implements rkz {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pcc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rkz
    public final Object a(pat patVar) throws IOException {
        int i = this.b;
        if (i == 0) {
            pce pceVar = (pce) this.a;
            AtomicReference atomicReference = pceVar.c;
            atomicReference.set(null);
            pat patVar2 = pat.WIFI_NETWORK_DELAY_AVAILABLE;
            boolean z = patVar != patVar2;
            if (patVar == patVar2) {
                pceVar.a.l().u("Delay the onAvailable delivery intentionally.");
                atomicReference.set(new aitm());
            }
            return Boolean.valueOf(!z);
        }
        if (i == 1) {
            if (patVar != pat.IO_EXCEPTION) {
                return Integer.valueOf(((kod) this.a).a.read());
            }
            throw new IOException("Failed to read due to failure injection");
        }
        if (i == 2) {
            if (patVar == pat.WIFI_NETWORK_LOST) {
                ((pce) this.a).a.l().u("Schedule onLost callback intentionally which will be triggered in the PostInjectionAction.");
            }
            return afak.a;
        }
        if (i == 3) {
            return ((php) this.a).i(patVar);
        }
        if (i == 4) {
            return ((phr) this.a).i(patVar);
        }
        ypf ypfVar = UsbConnectionHelper.a;
        return patVar == pat.NO_USB_ACCESSORIES ? new UsbAccessory[0] : this.a;
    }
}
