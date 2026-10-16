package androidx.car.app.hardware.climate;

import android.util.Pair;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarZone;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class FanSpeedLevelProfile {
    private final Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToFanSpeedLevelRanges;

    /* compiled from: WazeSource */
    public final class Builder {
        Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToFanSpeedLevelRanges;

        public Builder(Map<Set<CarZone>, Pair<Integer, Integer>> map) {
            this.mCarZoneSetsToFanSpeedLevelRanges = DesugarCollections.unmodifiableMap(map);
        }

        public FanSpeedLevelProfile build() {
            return new FanSpeedLevelProfile(this);
        }
    }

    FanSpeedLevelProfile(Builder builder) {
        this.mCarZoneSetsToFanSpeedLevelRanges = DesugarCollections.unmodifiableMap(builder.mCarZoneSetsToFanSpeedLevelRanges);
    }

    public Map<Set<CarZone>, Pair<Integer, Integer>> getCarZoneSetsToFanSpeedLevelRanges() {
        return this.mCarZoneSetsToFanSpeedLevelRanges;
    }
}
