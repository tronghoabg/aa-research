package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarZone;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public final class ClimateStateRequest<T> {
    private final List<CarZone> mCarZones;
    private final int mFeature;
    private final T mRequestedValue;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder<T> {
        List<CarZone> mCarZones = Collections.EMPTY_LIST;
        final int mRequestedFeature;
        final T mRequestedValue;

        public Builder(int i, T t) {
            this.mRequestedValue = t;
            this.mRequestedFeature = i;
        }

        public Builder<T> addCarZones(CarZone carZone) {
            this.mCarZones.add(carZone);
            return this;
        }

        public ClimateStateRequest<T> build() {
            return new ClimateStateRequest<>(this);
        }
    }

    public ClimateStateRequest(Builder<T> builder) {
        this.mFeature = builder.mRequestedFeature;
        this.mRequestedValue = builder.mRequestedValue;
        if (builder.mCarZones.isEmpty()) {
            this.mCarZones = Collections.singletonList(CarZone.CAR_ZONE_GLOBAL);
        } else {
            this.mCarZones = builder.mCarZones;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ClimateStateRequest.class == obj.getClass()) {
            ClimateStateRequest climateStateRequest = (ClimateStateRequest) obj;
            if (Integer.valueOf(this.mFeature).equals(Integer.valueOf(climateStateRequest.mFeature)) && Objects.equals(this.mCarZones, climateStateRequest.mCarZones) && Objects.equals(this.mRequestedValue, climateStateRequest.mRequestedValue)) {
                return true;
            }
        }
        return false;
    }

    public List<CarZone> getCarZones() {
        return this.mCarZones;
    }

    public int getRequestedFeature() {
        return this.mFeature;
    }

    public T getRequestedValue() {
        return this.mRequestedValue;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mFeature), this.mCarZones, this.mRequestedValue);
    }

    public String toString() {
        return "ClimateStateRequest{mFeature='" + this.mFeature + "', mCarZones=" + this.mCarZones + ", mRequestedValue=" + this.mRequestedValue + '}';
    }
}
