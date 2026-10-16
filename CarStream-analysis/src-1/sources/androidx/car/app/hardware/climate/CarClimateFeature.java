package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarZone;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public final class CarClimateFeature {
    private final List<CarZone> mCarZones;
    private final int mFeature;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        List<CarZone> mCarZones = new ArrayList();
        final int mFeature;

        public Builder(int i) {
            this.mFeature = i;
        }

        public Builder addCarZones(CarZone... carZoneArr) {
            this.mCarZones.addAll(Arrays.asList(carZoneArr));
            return this;
        }

        public CarClimateFeature build() {
            return new CarClimateFeature(this);
        }
    }

    public CarClimateFeature(Builder builder) {
        this.mCarZones = Collections.unmodifiableList(builder.mCarZones);
        this.mFeature = builder.mFeature;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CarClimateFeature.class == obj.getClass()) {
            CarClimateFeature carClimateFeature = (CarClimateFeature) obj;
            if (Integer.valueOf(this.mFeature).equals(Integer.valueOf(carClimateFeature.mFeature)) && Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
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
