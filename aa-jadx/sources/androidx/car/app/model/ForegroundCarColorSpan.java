package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class ForegroundCarColorSpan extends androidx.car.app.model.CarSpan {
    private final androidx.car.app.model.CarColor mCarColor;

    private ForegroundCarColorSpan() {
        this.mCarColor = androidx.car.app.model.CarColor.DEFAULT;
    }

    public static androidx.car.app.model.ForegroundCarColorSpan create(androidx.car.app.model.CarColor carColor) {
        defpackage.wn.a.a(carColor);
        carColor.getClass();
        return new androidx.car.app.model.ForegroundCarColorSpan(carColor);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.ForegroundCarColorSpan) {
            return j$.util.Objects.equals(this.mCarColor, ((androidx.car.app.model.ForegroundCarColorSpan) obj).mCarColor);
        }
        return false;
    }

    public androidx.car.app.model.CarColor getColor() {
        return this.mCarColor;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mCarColor);
    }

    public java.lang.String toString() {
        return "[color: " + this.mCarColor + "]";
    }

    private ForegroundCarColorSpan(androidx.car.app.model.CarColor carColor) {
        this.mCarColor = carColor;
    }
}
