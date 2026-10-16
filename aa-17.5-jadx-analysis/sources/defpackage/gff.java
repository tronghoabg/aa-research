package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class gff extends gfk {
    public final geu a;
    public final CarIcon b;
    public final boolean c;
    private final aezr d = woy.dG(new gbz(this, 2));

    public gff(geu geuVar, CarIcon carIcon, boolean z) {
        this.a = geuVar;
        this.b = carIcon;
        this.c = z;
    }

    @Override // defpackage.gfk
    public final cmw a(int i, bux buxVar, int i2) {
        cmw cmwVarC;
        buxVar.v(-1585463547);
        CarIcon carIcon = this.b;
        Integer numValueOf = null;
        if (carIcon == null) {
            buxVar.o();
            return null;
        }
        geu geuVar = this.a;
        Drawable drawableG = hbz.g(geuVar, carIcon, b());
        if (drawableG != null) {
            buxVar.v(-788967824);
            IconCompat icon = carIcon.getIcon();
            if (icon != null && icon.b() == 2) {
                numValueOf = Integer.valueOf(icon.a());
            }
            if ((drawableG instanceof AnimatedVectorDrawable) && numValueOf != null && (geuVar.d().e() || geuVar.d().f())) {
                buxVar.v(-788653670);
                cmwVarC = fwn.g(numValueOf.intValue(), buxVar);
                buxVar.o();
                buxVar.o();
            } else {
                buxVar.v(-788589283);
                buxVar.o();
                cmwVarC = ijl.c(drawableG, buxVar);
                buxVar.o();
            }
        } else {
            buxVar.v(-788524803);
            buxVar.o();
            Integer numValueOf2 = Integer.valueOf(i);
            boolean zE = buxVar.E(this);
            boolean z = true;
            if ((((i2 & 14) ^ 6) <= 4 || !buxVar.A(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean z2 = zE | z;
            Object objG = buxVar.g();
            if (z2 || objG == buw.a) {
                objG = new gfe(this, i, null);
                buxVar.x(objG);
            }
            cmwVarC = ijl.c((Drawable) byx.g(null, numValueOf2, (afeg) objG, buxVar).a(), buxVar);
        }
        buxVar.o();
        return cmwVarC;
    }

    public final hmb b() {
        return (hmb) this.d.a();
    }

    public final boolean c() {
        IconCompat icon;
        CarIcon carIcon = this.b;
        return !(carIcon == null || (icon = carIcon.getIcon()) == null || icon.b() != 2) || this.a.d().d();
    }
}
