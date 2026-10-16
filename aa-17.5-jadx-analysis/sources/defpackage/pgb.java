package defpackage;

import android.net.wifi.WifiInfo;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class pgb implements pah {
    public final ozt a;
    final /* synthetic */ pgr b;
    private final pah c;

    public pgb(pgr pgrVar, pah pahVar, ozt oztVar) {
        this.b = pgrVar;
        this.c = pahVar;
        this.a = oztVar;
    }

    @Override // defpackage.pah
    public final void a(String str, int i, WifiInfo wifiInfo, int i2, int i3) {
        this.b.z.d(new isp(this, str, i, wifiInfo, 11));
        this.c.a(str, i, wifiInfo, i2, i3);
    }

    @Override // defpackage.pah
    public final void b() {
        ((ype) pgr.a.l().ai((char) 6471)).u("wirelessSetupManager shutting down.");
        pgr pgrVar = this.b;
        pgrVar.c(pgrVar.o);
    }

    @Override // defpackage.pah
    public final void c(pag pagVar, Bundle bundle) {
        if (pag.PROJECTION_INITIATED == pagVar) {
            pgr pgrVar = this.b;
            pgrVar.z.d(new pfp(this, 3));
        }
        pagVar.ordinal();
    }
}
