package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class fzw {
    public final fzy a;
    public final boolean b;
    public final CarColor c;
    public final fzy d;
    public final CarColor e;

    public fzw(fzy fzyVar, boolean z, CarColor carColor, fzy fzyVar2, CarColor carColor2) {
        this.a = fzyVar;
        this.b = z;
        this.c = carColor;
        this.d = fzyVar2;
        this.e = carColor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzw)) {
            return false;
        }
        fzw fzwVar = (fzw) obj;
        return affa.f(this.a, fzwVar.a) && this.b == fzwVar.b && affa.f(this.c, fzwVar.c) && affa.f(this.d, fzwVar.d) && affa.f(this.e, fzwVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarColor carColor = this.c;
        int iF = (((iHashCode + a.f(this.b)) * 31) + (carColor == null ? 0 : carColor.hashCode())) * 31;
        fzy fzyVar = this.d;
        int iHashCode2 = (iF + (fzyVar == null ? 0 : fzyVar.hashCode())) * 31;
        CarColor carColor2 = this.e;
        return iHashCode2 + (carColor2 != null ? carColor2.hashCode() : 0);
    }

    public final String toString() {
        return "BadgedImageInternal(image=" + this.a + ", hasDot=" + this.b + ", dotColor=" + this.c + ", icon=" + this.d + ", iconBackgroundColor=" + this.e + ")";
    }
}
