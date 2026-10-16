package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
public final class zxo implements zxp {
    private static final String a = "zxo";
    private final xyc b;

    public zxo(xyc xycVar) {
        zkt.n(xycVar, "drd");
        this.b = xycVar;
    }

    @Override // defpackage.zxp
    public final void c(zxq zxqVar) {
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, a.bW(zxqVar, "onQuotaResponse(", ")"));
        }
        int i = zxqVar.e;
        if (i != 1) {
            String str2 = zxqVar.b;
            if (str2 != null) {
                zrn.b(str2);
            } else if (i == 2) {
                zrn.b("This application has been blocked by the Google Maps SDK for Android. This might be because of an incorrectly registered key.");
            } else {
                zrn.b("This application has exceeded its quota for the Google Maps SDK for Android.");
            }
            ((zst) this.b.gu()).u();
        }
    }
}
