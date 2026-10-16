package androidx.car.app.hardware.climate;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class CarClimateFeature {
    private final java.util.List<androidx.car.app.hardware.common.CarZone> mCarZones;
    private final int mFeature;

    CarClimateFeature(defpackage.rt rtVar) {
        java.util.List list = rtVar.b;
        this.mCarZones = j$.util.DesugarCollections.unmodifiableList(null);
        int i = rtVar.a;
        this.mFeature = 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            androidx.car.app.hardware.climate.CarClimateFeature carClimateFeature = (androidx.car.app.hardware.climate.CarClimateFeature) obj;
            if (j$.util.Objects.equals(java.lang.Integer.valueOf(this.mFeature), java.lang.Integer.valueOf(carClimateFeature.mFeature)) && j$.util.Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List<androidx.car.app.hardware.common.CarZone> getCarZones() {
        return this.mCarZones;
    }

    public int getFeature() {
        return this.mFeature;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.mFeature), this.mCarZones);
    }

    public java.lang.String toString() {
        return "ClimateProfileFeature{mFeature='" + this.mFeature + "', mCarZones=" + this.mCarZones + '}';
    }
}
