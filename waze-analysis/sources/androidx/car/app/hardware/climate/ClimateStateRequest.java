package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarZone;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class ClimateStateRequest<T> {
    private final List<CarZone> mCarZones;
    private final int mFeature;
    private final T mRequestedValue;

    /* compiled from: WazeSource */
    public final class Builder<T> {
        List<CarZone> mCarZones = Collections.EMPTY_LIST;
        final int mRequestedFeature;
        final T mRequestedValue;

        public Builder(int i2, T t) {
            this.mRequestedValue = t;
            this.mRequestedFeature = i2;
        }

        public Builder<T> addCarZones(CarZone carZone) {
            this.mCarZones.add(carZone);
            return this;
        }

        public ClimateStateRequest<T> build() {
            return new ClimateStateRequest<>(this);
        }
    }

    ClimateStateRequest(Builder<T> builder) {
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
        if (obj != null && getClass() == obj.getClass()) {
            ClimateStateRequest climateStateRequest = (ClimateStateRequest) obj;
            if (Objects.equals(Integer.valueOf(this.mFeature), Integer.valueOf(climateStateRequest.mFeature)) && Objects.equals(this.mCarZones, climateStateRequest.mCarZones) && Objects.equals(this.mRequestedValue, climateStateRequest.mRequestedValue)) {
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
