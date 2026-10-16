package androidx.car.app.hardware.climate;

import android.util.Pair;
import androidx.car.app.hardware.common.CarZone;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class FanSpeedLevelProfile {
    private final Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToFanSpeedLevelRanges;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToFanSpeedLevelRanges;

        public Builder(Map<Set<CarZone>, Pair<Integer, Integer>> map) {
            this.mCarZoneSetsToFanSpeedLevelRanges = Collections.unmodifiableMap(map);
        }

        public FanSpeedLevelProfile build() {
            return new FanSpeedLevelProfile(this);
        }
    }

    public FanSpeedLevelProfile(Builder builder) {
        this.mCarZoneSetsToFanSpeedLevelRanges = Collections.unmodifiableMap(builder.mCarZoneSetsToFanSpeedLevelRanges);
    }

    public Map<Set<CarZone>, Pair<Integer, Integer>> getCarZoneSetsToFanSpeedLevelRanges() {
        return this.mCarZoneSetsToFanSpeedLevelRanges;
    }
}
