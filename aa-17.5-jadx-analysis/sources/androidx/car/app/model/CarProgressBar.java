package androidx.car.app.model;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.rb;
import defpackage.tm;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class CarProgressBar {
    private final CarColor mColor;
    private final float mProgress;

    CarProgressBar(tm tmVar) {
        float f = tmVar.a;
        this.mProgress = BitmapDescriptorFactory.HUE_RED;
        CarColor carColor = tmVar.b;
        this.mColor = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarProgressBar)) {
            return false;
        }
        CarProgressBar carProgressBar = (CarProgressBar) obj;
        return this.mProgress == carProgressBar.mProgress && Objects.equals(this.mColor, carProgressBar.mColor);
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.mProgress), this.mColor);
    }

    public String toString() {
        return "[progress: " + this.mProgress + ", color: " + this.mColor + "]";
    }

    private CarProgressBar() {
        this.mProgress = BitmapDescriptorFactory.HUE_RED;
        this.mColor = null;
    }
}
