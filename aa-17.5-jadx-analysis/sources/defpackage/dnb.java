package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class dnb {
    public static final bvf a;
    private static final bvf b;

    static {
        blz blzVar = new blz(18);
        bxp bxpVar = bxp.c;
        b = new bvo(bxpVar, blzVar);
        a = new bvo(bxpVar, new blz(19));
    }

    public static final int a(dnu dnuVar, boolean z) {
        boolean z2 = dnuVar.b;
        int i = dnuVar.a;
        return z ? i | 8192 : i & (-8193);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [afck, byte[]] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.dnt r23, defpackage.afdr r24, defpackage.dnu r25, defpackage.afeg r26, defpackage.bux r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnb.b(dnt, afdr, dnu, afeg, bux, int, int):void");
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final void d(WindowManager.LayoutParams layoutParams) {
        layoutParams.flags &= -3;
        layoutParams.dimAmount = BitmapDescriptorFactory.HUE_RED;
    }
}
