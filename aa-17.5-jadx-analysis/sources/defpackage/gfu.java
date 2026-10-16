package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class gfu extends gfk {
    private final Drawable a;

    public gfu(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.gfk
    public final cmw a(int i, bux buxVar, int i2) {
        cmw cmwVarC;
        buxVar.v(-1382209157);
        Drawable drawable = this.a;
        if (drawable == null) {
            buxVar.v(-1541470286);
            buxVar.o();
            cmwVarC = null;
        } else {
            buxVar.v(-1541470285);
            cmwVarC = ijl.c(drawable, buxVar);
            buxVar.o();
        }
        buxVar.o();
        return cmwVarC;
    }
}
