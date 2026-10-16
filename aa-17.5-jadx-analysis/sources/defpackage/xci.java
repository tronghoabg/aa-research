package defpackage;

import com.google.android.gms.carsetup.SetupActivityImpl;
import com.google.android.projection.gearhead.frx.SetupActivity;

/* loaded from: classes3.dex */
public final class xci implements sek {
    final /* synthetic */ bc a;
    private final /* synthetic */ int b;

    public xci(bc bcVar, int i) {
        this.b = i;
        this.a = bcVar;
    }

    @Override // defpackage.sek
    public final void a(String str) {
        if (this.b != 0) {
            if ("EVENT_BACKBUTTON_PRESSED".equals(str) || "EVENT_CAR_PARKED".equals(str)) {
                ((SetupActivityImpl) this.a).m = true;
                return;
            }
            return;
        }
        if ("EVENT_BACKBUTTON_PRESSED".equals(str) || "EVENT_CAR_PARKED".equals(str)) {
            ((SetupActivity) this.a).m = true;
        }
    }
}
