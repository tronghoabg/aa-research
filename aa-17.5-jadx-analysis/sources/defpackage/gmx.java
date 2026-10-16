package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class gmx implements gmw {
    public final List a;
    public final CarText b;
    public final fvu c;
    public final fvu d;

    public gmx(List list, CarText carText, fvu fvuVar, fvu fvuVar2) {
        this.a = list;
        this.b = carText;
        this.c = fvuVar;
        this.d = fvuVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmx)) {
            return false;
        }
        gmx gmxVar = (gmx) obj;
        return affa.f(this.a, gmxVar.a) && affa.f(this.b, gmxVar.b) && affa.f(this.c, gmxVar.c) && affa.f(this.d, gmxVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarText carText = this.b;
        int iHashCode2 = (iHashCode + (carText == null ? 0 : carText.hashCode())) * 31;
        fvu fvuVar = this.c;
        int iHashCode3 = (iHashCode2 + (fvuVar == null ? 0 : fvuVar.hashCode())) * 31;
        fvu fvuVar2 = this.d;
        return iHashCode3 + (fvuVar2 != null ? fvuVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ItemWidgetInternal(items=" + this.a + ", title=" + this.b + ", action=" + this.c + ", headerAction=" + this.d + ")";
    }
}
