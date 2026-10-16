package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.Shape;

/* loaded from: classes2.dex */
public final class haj {
    public final CarColor a;
    public final CarColor b;
    public final CarColor c;
    public final Shape d;

    public haj(CarColor carColor, CarColor carColor2, CarColor carColor3, Shape shape) {
        this.a = carColor;
        this.b = carColor2;
        this.c = carColor3;
        this.d = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haj)) {
            return false;
        }
        haj hajVar = (haj) obj;
        return affa.f(this.a, hajVar.a) && affa.f(this.b, hajVar.b) && affa.f(this.c, hajVar.c) && affa.f(this.d, hajVar.d);
    }

    public final int hashCode() {
        CarColor carColor = this.a;
        int iHashCode = carColor == null ? 0 : carColor.hashCode();
        CarColor carColor2 = this.b;
        int iHashCode2 = carColor2 == null ? 0 : carColor2.hashCode();
        int i = iHashCode * 31;
        CarColor carColor3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (carColor3 == null ? 0 : carColor3.hashCode())) * 31;
        Shape shape = this.d;
        return iHashCode3 + (shape != null ? shape.hashCode() : 0);
    }

    public final String toString() {
        return "FilterChipStyleInternal(backgroundColor=" + this.a + ", contentColor=" + this.b + ", outlineColor=" + this.c + ", shape=" + this.d + ")";
    }

    public haj() {
        this(null, null, null, null);
    }
}
