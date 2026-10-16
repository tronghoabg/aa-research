package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class sgm extends ssu {
    @Override // defpackage.ssu
    public final void a(Intent intent) {
        boolean z = false;
        boolean booleanExtra = intent.getBooleanExtra("connected", false);
        boolean booleanExtra2 = intent.getBooleanExtra("configured", false);
        boolean booleanExtra3 = intent.getBooleanExtra("accessory", false);
        if (!booleanExtra || !booleanExtra2) {
            z = booleanExtra3;
        } else if (booleanExtra3) {
            return;
        }
        if (UsbConnectionHelper.TrackedParcelFileDescriptor.i == 0 || SystemClock.elapsedRealtime() - UsbConnectionHelper.TrackedParcelFileDescriptor.i >= 2000 || !((Boolean) UsbConnectionHelper.TrackedParcelFileDescriptor.j.gu()).booleanValue()) {
            List list = UsbConnectionHelper.TrackedParcelFileDescriptor.a;
            synchronized (list) {
                if (!list.isEmpty()) {
                    UsbConnectionHelper.a.f().ai(8906).S("Closing %s FDs due to USB disconnect (connected=%s, configured=%s, accessory=%s)", new vps(list.size()), new vpt(booleanExtra), new vpt(booleanExtra2), new vpt(z));
                }
            }
            try {
                UsbConnectionHelper.TrackedParcelFileDescriptor.b();
            } catch (IOException e) {
                throw new xyj(e);
            }
        }
    }
}
