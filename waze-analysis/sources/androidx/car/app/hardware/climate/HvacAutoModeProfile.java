package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarZone;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class HvacAutoModeProfile {
    private final List<Set<CarZone>> mSupportedCarZoneSets;

    /* compiled from: WazeSource */
    public final class Builder {
        final List<Set<CarZone>> mSupportedCarZoneSets;

        public Builder(List<Set<CarZone>> list) {
            this.mSupportedCarZoneSets = list;
        }

        public HvacAutoModeProfile build() {
            return new HvacAutoModeProfile(this);
        }
    }

    HvacAutoModeProfile(Builder builder) {
        this.mSupportedCarZoneSets = builder.mSupportedCarZoneSets;
    }

    public List<Set<CarZone>> getSupportedCarZoneSets() {
        return this.mSupportedCarZoneSets;
    }
}
