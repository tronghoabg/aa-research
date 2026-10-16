package androidx.car.app.model;

import android.location.Location;
import androidx.camera.video.AudioStats;
import androidx.car.app.annotations.CarProtocol;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class CarLocation {
    private final double mLat;
    private final double mLng;

    private CarLocation(double d2, double d3) {
        this.mLat = d2;
        this.mLng = d3;
    }

    public static CarLocation create(Location location) {
        Objects.requireNonNull(location);
        return create(location.getLatitude(), location.getLongitude());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarLocation)) {
            return false;
        }
        CarLocation carLocation = (CarLocation) obj;
        return Double.doubleToLongBits(this.mLat) == Double.doubleToLongBits(carLocation.mLat) && Double.doubleToLongBits(this.mLng) == Double.doubleToLongBits(carLocation.mLng);
    }

    public double getLatitude() {
        return this.mLat;
    }

    public double getLongitude() {
        return this.mLng;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.mLat), Double.valueOf(this.mLng));
    }

    public String toString() {
        return "[" + getLatitude() + ", " + getLongitude() + "]";
    }

    private CarLocation() {
        this(AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public static CarLocation create(double d2, double d3) {
        return new CarLocation(d2, d3);
    }
}
