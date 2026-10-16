package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class DistanceSpan extends androidx.car.app.model.CarSpan {
    private final androidx.car.app.model.Distance mDistance;

    private DistanceSpan() {
        this.mDistance = null;
    }

    public static androidx.car.app.model.DistanceSpan create(androidx.car.app.model.Distance distance) {
        distance.getClass();
        return new androidx.car.app.model.DistanceSpan(distance);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.DistanceSpan) {
            return j$.util.Objects.equals(this.mDistance, ((androidx.car.app.model.DistanceSpan) obj).mDistance);
        }
        return false;
    }

    public androidx.car.app.model.Distance getDistance() {
        androidx.car.app.model.Distance distance = this.mDistance;
        distance.getClass();
        return distance;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mDistance);
    }

    public java.lang.String toString() {
        return "[distance: " + this.mDistance + "]";
    }

    private DistanceSpan(androidx.car.app.model.Distance distance) {
        this.mDistance = distance;
    }
}
