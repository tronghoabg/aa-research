package defpackage;

import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class hgv implements gmo {
    public final CarText a;
    public final gac b;
    public final boolean c;
    public final afdr d;
    public final String e;

    public hgv(CarText carText, gac gacVar, boolean z, afdr afdrVar, String str) {
        str.getClass();
        this.a = carText;
        this.b = gacVar;
        this.c = z;
        this.d = afdrVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgv)) {
            return false;
        }
        hgv hgvVar = (hgv) obj;
        return affa.f(this.a, hgvVar.a) && affa.f(this.b, hgvVar.b) && this.c == hgvVar.c && affa.f(this.d, hgvVar.d) && affa.f(this.e, hgvVar.e);
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        gac gacVar = this.b;
        return (((((((iHashCode * 31) + (gacVar != null ? gacVar.hashCode() : 0)) * 31) + a.f(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TabInternal(title=" + this.a + ", icon=" + this.b + ", isActive=" + this.c + ", onClick=" + this.d + ", id=" + this.e + ")";
    }
}
