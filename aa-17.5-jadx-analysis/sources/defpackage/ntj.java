package defpackage;

import android.telephony.TelephonyManager$CellInfoCallback;
import java.util.List;

/* loaded from: classes.dex */
final class ntj extends TelephonyManager$CellInfoCallback {
    final /* synthetic */ ntm a;

    public ntj(ntm ntmVar) {
        this.a = ntmVar;
    }

    public final synchronized void onCellInfo(List list) {
        ntm ntmVar = this.a;
        if (ntmVar.n()) {
            ntmVar.a();
        }
    }
}
