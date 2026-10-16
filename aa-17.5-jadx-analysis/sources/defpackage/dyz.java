package defpackage;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class dyz {
    public static final boolean a() {
        int i = dza.a;
        return Build.VERSION.SDK_INT <= dwq.a;
    }

    public static Spanned b(String str) {
        return Html.fromHtml(str, 0);
    }

    public static final bym c(ept eptVar, bux buxVar) {
        return byx.f(eptVar.b(), afcp.a, bxp.c, buxVar, 0);
    }

    public static final bym d(aiyk aiykVar, Object obj, bux buxVar) {
        eqa eqaVar = (eqa) buxVar.f(erz.a);
        eps epsVar = eps.d;
        afcp afcpVar = afcp.a;
        ept lifecycle = eqaVar.getLifecycle();
        Object[] objArr = {aiykVar, lifecycle, epsVar, afcpVar};
        boolean zE = buxVar.E(lifecycle) | buxVar.A(epsVar.ordinal()) | buxVar.E(afcpVar) | buxVar.E(aiykVar);
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zE || objS == buw.a) {
            erv ervVar = new erv(lifecycle, epsVar, afcpVar, aiykVar, null);
            bvvVar.ad(ervVar);
            objS = ervVar;
        }
        afeg afegVar = (afeg) objS;
        Object objS2 = bvvVar.S();
        Object obj2 = buw.a;
        if (objS2 == obj2) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(obj, bxp.c);
            bvvVar.ad(parcelableSnapshotMutableState);
            objS2 = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objS2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zE2 = buxVar.E(afegVar);
        Object objS3 = bvvVar.S();
        if (zE2 || objS3 == obj2) {
            ams amsVar = new ams(afegVar, bwqVar, (afck) null, 9, (short[]) null);
            bvvVar.ad(amsVar);
            objS3 = amsVar;
        }
        bvq.h(objArrCopyOf, (afeg) objS3, buxVar);
        return bwqVar;
    }
}
