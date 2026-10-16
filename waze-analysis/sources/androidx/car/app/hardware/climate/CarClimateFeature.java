package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarZone;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class CarClimateFeature {
    private final List<CarZone> mCarZones;
    private final int mFeature;

    /* compiled from: WazeSource */
    public final class Builder {
        List<CarZone> mCarZones = new ArrayList();
        final int mFeature;

        public Builder(int i2) {
            this.mFeature = i2;
        }

        public Builder addCarZones(CarZone... carZoneArr) {
            this.mCarZones.addAll(Arrays.asList(carZoneArr));
            return this;
        }

        public CarClimateFeature build() {
            return new CarClimateFeature(this);
        }
    }

    CarClimateFeature(Builder builder) {
        this.mCarZones = DesugarCollections.unmodifiableList(builder.mCarZones);
        this.mFeature = builder.mFeature;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CarClimateFeature carClimateFeature = (CarClimateFeature) obj;
            if (Objects.equals(Integer.valueOf(this.mFeature), Integer.valueOf(carClimateFeature.mFeature)) && Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public List<CarZone> getCarZones() {
        return this.mCarZones;
    }

    public int getFeature() {
        return this.mFeature;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mFeature), this.mCarZones);
    }

    public String toString() {
        return "ClimateProfileFeature{mFeature='" + this.mFeature + "', mCarZones=" + this.mCarZones + '}';
    }
}
