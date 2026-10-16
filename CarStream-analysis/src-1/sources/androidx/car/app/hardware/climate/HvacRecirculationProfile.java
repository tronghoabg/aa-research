package androidx.car.app.hardware.climate;

import androidx.car.app.hardware.common.CarZone;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class HvacRecirculationProfile {
    private final List<Set<CarZone>> mSupportedCarZones;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        final List<Set<CarZone>> mSupportedCarZones;

        public Builder(List<Set<CarZone>> list) {
            this.mSupportedCarZones = list;
        }

        public HvacRecirculationProfile build() {
            return new HvacRecirculationProfile(this);
        }
    }

    public HvacRecirculationProfile(Builder builder) {
        this.mSupportedCarZones = builder.mSupportedCarZones;
    }

    public List<Set<CarZone>> getSupportedCarZones() {
        return this.mSupportedCarZones;
    }
}
