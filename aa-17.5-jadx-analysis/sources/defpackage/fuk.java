package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class fuk implements gmw {
    public final List a;
    public final fvu b;
    public final CarText c;
    public final CarText d;
    public final fzw e;

    public fuk(List list, fvu fvuVar, CarText carText, CarText carText2, fzw fzwVar) {
        this.a = list;
        this.b = fvuVar;
        this.c = carText;
        this.d = carText2;
        this.e = fzwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuk)) {
            return false;
        }
        fuk fukVar = (fuk) obj;
        return affa.f(this.a, fukVar.a) && affa.f(this.b, fukVar.b) && affa.f(this.c, fukVar.c) && affa.f(this.d, fukVar.d) && affa.f(this.e, fukVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fvu fvuVar = this.b;
        int iHashCode2 = (iHashCode + (fvuVar == null ? 0 : fvuVar.hashCode())) * 31;
        CarText carText = this.c;
        int iHashCode3 = (iHashCode2 + (carText == null ? 0 : carText.hashCode())) * 31;
        CarText carText2 = this.d;
        int iHashCode4 = (iHashCode3 + (carText2 == null ? 0 : carText2.hashCode())) * 31;
        fzw fzwVar = this.e;
        return iHashCode4 + (fzwVar != null ? fzwVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActionsWidgetInternal(actions=" + this.a + ", headerAction=" + this.b + ", titlePrimary=" + this.c + ", titleSecondary=" + this.d + ", titleImage=" + this.e + ")";
    }

    public fuk() {
        this(afbe.a, null, null, null, null);
    }
}
