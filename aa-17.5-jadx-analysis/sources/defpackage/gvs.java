package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class gvs implements gmw {
    public final fzw a;
    public final CarText b;
    public final fvu c;
    public final CarText d;
    public final List e;

    public gvs(fzw fzwVar, CarText carText, fvu fvuVar, CarText carText2, List list) {
        this.a = fzwVar;
        this.b = carText;
        this.c = fvuVar;
        this.d = carText2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvs)) {
            return false;
        }
        gvs gvsVar = (gvs) obj;
        return affa.f(this.a, gvsVar.a) && affa.f(this.b, gvsVar.b) && affa.f(this.c, gvsVar.c) && affa.f(this.d, gvsVar.d) && affa.f(this.e, gvsVar.e);
    }

    public final int hashCode() {
        fzw fzwVar = this.a;
        int iHashCode = fzwVar == null ? 0 : fzwVar.hashCode();
        CarText carText = this.b;
        int iHashCode2 = carText == null ? 0 : carText.hashCode();
        int i = iHashCode * 31;
        fvu fvuVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (fvuVar == null ? 0 : fvuVar.hashCode())) * 31;
        CarText carText2 = this.d;
        return ((iHashCode3 + (carText2 != null ? carText2.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "PaneWidgetInternal(headerIcon=" + this.a + ", headerText=" + this.b + ", headerAction=" + this.c + ", paneText=" + this.d + ", actions=" + this.e + ")";
    }

    public gvs() {
        this(null, null, null, null, afbe.a);
    }
}
