package defpackage;

import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class gfy {
    public final View a;
    public final bwq b;
    public final bwq c;
    public final bwq d;
    public long e;
    public long f;
    public final bwq g;
    private final geu h;
    private final bwq i;

    public gfy(View view, geu geuVar) {
        this.a = view;
        this.h = geuVar;
        gzc gzcVar = gzc.a;
        bxp bxpVar = bxp.c;
        this.b = new ParcelableSnapshotMutableState(gzcVar, bxpVar);
        this.i = new ParcelableSnapshotMutableState(null, bxpVar);
        this.c = new ParcelableSnapshotMutableState(null, bxpVar);
        this.d = new ParcelableSnapshotMutableState(czz.Y(1, 1, 0, 28), bxpVar);
        this.e = cjn.i(0);
        this.f = cjn.i(0);
        this.g = new ParcelableSnapshotMutableState(adv.a(1.0f), bxpVar);
    }

    private static final boolean g(hju hjuVar) {
        hjt hjtVar = hjuVar instanceof hjt ? (hjt) hjuVar : null;
        if (hjtVar != null) {
            return hjtVar.k;
        }
        return false;
    }

    public final adu a() {
        return (adu) this.g.a();
    }

    public final cfy b(cfy cfyVar) {
        return c().a() ? awd.u(cfyVar, null, 3) : awd.c(cfyVar, 1.0f);
    }

    public final gzc c() {
        return (gzc) this.b.a();
    }

    public final hju d() {
        return (hju) this.i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024a  */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.cfy r33, defpackage.cfy r34, defpackage.bux r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfy.e(cfy, cfy, bux, int, int):void");
    }

    public final void f(hju hjuVar) {
        this.i.b(hjuVar);
    }
}
