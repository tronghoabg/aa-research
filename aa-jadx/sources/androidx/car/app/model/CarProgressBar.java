package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class CarProgressBar {
    private final androidx.car.app.model.CarColor mColor;
    private final float mProgress;

    CarProgressBar(defpackage.tr trVar) {
        float f = trVar.a;
        this.mProgress = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        androidx.car.app.model.CarColor carColor = trVar.b;
        this.mColor = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.CarProgressBar)) {
            return false;
        }
        androidx.car.app.model.CarProgressBar carProgressBar = (androidx.car.app.model.CarProgressBar) obj;
        return this.mProgress == carProgressBar.mProgress && j$.util.Objects.equals(this.mColor, carProgressBar.mColor);
    }

    public androidx.car.app.model.CarColor getColor() {
        return this.mColor;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Float.valueOf(this.mProgress), this.mColor);
    }

    public java.lang.String toString() {
        return "[progress: " + this.mProgress + ", color: " + this.mColor + "]";
    }

    private CarProgressBar() {
        this.mProgress = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.mColor = null;
    }
}
