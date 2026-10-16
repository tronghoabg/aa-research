package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;

@rb
/* loaded from: classes2.dex */
public final class fvv implements gmo {
    public final int a;
    public final boolean b;
    public final int c;
    public final CarColor d;
    public final CarIcon e;
    public final afdr f;
    public final gcs g;
    public final boolean h;
    public final fvw i;

    public fvv(int i, boolean z, int i2, CarColor carColor, CarIcon carIcon, afdr afdrVar, gcs gcsVar, boolean z2, fvw fvwVar) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = carColor;
        this.e = carIcon;
        this.f = afdrVar;
        this.g = gcsVar;
        this.h = z2;
        this.i = fvwVar;
    }

    public static /* synthetic */ fvv d(fvv fvvVar, int i, fvw fvwVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fvvVar.a;
        }
        return new fvv(i, fvvVar.b, fvvVar.c, fvvVar.d, fvvVar.e, fvvVar.f, fvvVar.g, fvvVar.h, fvwVar);
    }

    public final boolean a() {
        fvw fvwVar = this.i;
        if (fvwVar != null) {
            return fvwVar.a;
        }
        return false;
    }

    public final boolean b() {
        return (this.a & 1) != 0;
    }

    public final boolean c() {
        return this.i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvv)) {
            return false;
        }
        fvv fvvVar = (fvv) obj;
        return this.a == fvvVar.a && this.b == fvvVar.b && this.c == fvvVar.c && affa.f(this.d, fvvVar.d) && affa.f(this.e, fvvVar.e) && affa.f(this.f, fvvVar.f) && affa.f(this.g, fvvVar.g) && this.h == fvvVar.h && affa.f(this.i, fvvVar.i);
    }

    public final int hashCode() {
        CarColor carColor = this.d;
        int iHashCode = carColor == null ? 0 : carColor.hashCode();
        boolean z = this.b;
        int i = this.a;
        int i2 = this.c;
        CarIcon carIcon = this.e;
        int iHashCode2 = carIcon == null ? 0 : carIcon.hashCode();
        int iF = (((((i * 31) + a.f(z)) * 31) + i2) * 31) + iHashCode;
        afdr afdrVar = this.f;
        int iHashCode3 = ((((iF * 31) + iHashCode2) * 31) + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31;
        gcs gcsVar = this.g;
        int iHashCode4 = (((iHashCode3 + (gcsVar == null ? 0 : gcsVar.hashCode())) * 31) + a.f(this.h)) * 31;
        fvw fvwVar = this.i;
        return iHashCode4 + (fvwVar != null ? fvwVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActionInternal(flags=" + this.a + ", isEnabled=" + this.b + ", type=" + this.c + ", backgroundColor=" + this.d + ", icon=" + this.e + ", onClick=" + this.f + ", title=" + this.g + ", isStandard=" + this.h + ", actionTimeInfo=" + this.i + ")";
    }

    public fvv() {
        this(0, true, 0, null, null, null, null, false, null);
    }
}
