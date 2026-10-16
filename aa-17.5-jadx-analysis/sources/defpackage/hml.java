package defpackage;

import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class hml implements gmw {
    public final fvv a;
    public final gac b;
    public final CarText c;

    public hml(fvv fvvVar, gac gacVar, CarText carText) {
        this.a = fvvVar;
        this.b = gacVar;
        this.c = carText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hml)) {
            return false;
        }
        hml hmlVar = (hml) obj;
        return affa.f(this.a, hmlVar.a) && affa.f(this.b, hmlVar.b) && affa.f(this.c, hmlVar.c);
    }

    public final int hashCode() {
        fvv fvvVar = this.a;
        int iHashCode = fvvVar == null ? 0 : fvvVar.hashCode();
        gac gacVar = this.b;
        int iHashCode2 = gacVar == null ? 0 : gacVar.hashCode();
        int i = iHashCode * 31;
        CarText carText = this.c;
        return ((i + iHashCode2) * 31) + (carText != null ? carText.hashCode() : 0);
    }

    public final String toString() {
        return "VoicePlateWidgetInternal(action=" + this.a + ", icon=" + this.b + ", placeholderText=" + this.c + ")";
    }
}
