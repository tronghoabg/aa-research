package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class bgu {
    public static final bgu a = new bgu();

    public final void a(Drawable drawable, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(257732500);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(drawable) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cfv cfvVar = cfy.e;
            long j = als.a;
            cfy cfyVarI = awd.i(cfvVar, 24.0f);
            boolean zE = buxVarC.E(drawable);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new bgb(drawable, 7);
                bvvVar.ad(objS);
            }
            atk.c(bxc.p(cfyVarI, (afec) objS), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(this, drawable, i, 15, null);
        }
    }
}
