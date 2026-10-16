package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class ijl {
    public static final /* synthetic */ int a = 0;
    private static final aezr b = woy.dH(3, new grl(10));

    public static final long a(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return 9205357640488583168L;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        return (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
    }

    public static final Handler b() {
        return (Handler) b.a();
    }

    public static final cmw c(Drawable drawable, bux buxVar) {
        Object ijkVar;
        boolean zC = buxVar.C(drawable);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            if (drawable == null) {
                objG = ijm.a;
            } else {
                if (drawable instanceof ColorDrawable) {
                    ijkVar = new cmv(cjn.i(((ColorDrawable) drawable).getColor()));
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    drawableMutate.getClass();
                    ijkVar = new ijk(drawableMutate);
                }
                objG = ijkVar;
            }
            buxVar.x(objG);
        }
        return (cmw) objG;
    }
}
