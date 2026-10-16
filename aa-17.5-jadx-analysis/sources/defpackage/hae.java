package defpackage;

import androidx.car.app.model.Shape;

/* loaded from: classes2.dex */
public final class hae {
    public final fyj a;
    public final Shape b;

    public hae(fyj fyjVar, Shape shape) {
        this.a = fyjVar;
        this.b = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hae)) {
            return false;
        }
        hae haeVar = (hae) obj;
        return affa.f(this.a, haeVar.a) && affa.f(this.b, haeVar.b);
    }

    public final int hashCode() {
        fyj fyjVar = this.a;
        int iHashCode = fyjVar == null ? 0 : fyjVar.hashCode();
        Shape shape = this.b;
        return (iHashCode * 31) + (shape != null ? shape.hashCode() : 0);
    }

    public final String toString() {
        return "BannerStyleInternal(background=" + this.a + ", shape=" + this.b + ")";
    }

    public hae() {
        this(null, null);
    }
}
