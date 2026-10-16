package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* loaded from: classes.dex */
class ecp extends eco {
    public ecp(ecy ecyVar, WindowInsets windowInsets) {
        super(ecyVar, windowInsets);
    }

    @Override // defpackage.ecv
    public dzz B() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new dzz(displayCutout);
    }

    @Override // defpackage.ecv
    public ecy C() {
        return ecy.q(this.a.consumeDisplayCutout(), null);
    }

    @Override // defpackage.ecn, defpackage.ecv
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecp)) {
            return false;
        }
        ecp ecpVar = (ecp) obj;
        return Objects.equals(this.a, ecpVar.a) && Objects.equals(this.b, ecpVar.b) && v(this.c, ecpVar.c);
    }

    @Override // defpackage.ecv
    public int hashCode() {
        return this.a.hashCode();
    }

    public ecp(ecy ecyVar, ecp ecpVar) {
        super(ecyVar, ecpVar);
    }
}
