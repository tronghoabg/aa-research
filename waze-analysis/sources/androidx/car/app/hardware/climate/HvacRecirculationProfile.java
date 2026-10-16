package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarZone;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class HvacRecirculationProfile {
    private final List<Set<CarZone>> mSupportedCarZones;

    /* compiled from: WazeSource */
    public final class Builder {
        final List<Set<CarZone>> mSupportedCarZones;

        public Builder(List<Set<CarZone>> list) {
            this.mSupportedCarZones = list;
        }

        public HvacRecirculationProfile build() {
            return new HvacRecirculationProfile(this);
        }
    }

    HvacRecirculationProfile(Builder builder) {
        this.mSupportedCarZones = builder.mSupportedCarZones;
    }

    public List<Set<CarZone>> getSupportedCarZones() {
        return this.mSupportedCarZones;
    }
}
