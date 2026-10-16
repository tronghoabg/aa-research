package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarZone;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class FanDirectionProfile {
    private final Map<Set<CarZone>, Set<Integer>> mCarZoneSetsToFanDirectionValues;

    /* compiled from: WazeSource */
    public final class Builder {
        Map<Set<CarZone>, Set<Integer>> mCarZoneSetsToFanDirectionValues;

        public Builder(Map<Set<CarZone>, Set<Integer>> map) {
            this.mCarZoneSetsToFanDirectionValues = DesugarCollections.unmodifiableMap(map);
        }

        public FanDirectionProfile build() {
            return new FanDirectionProfile(this);
        }
    }

    FanDirectionProfile(Builder builder) {
        this.mCarZoneSetsToFanDirectionValues = DesugarCollections.unmodifiableMap(builder.mCarZoneSetsToFanDirectionValues);
    }

    public Map<Set<CarZone>, Set<Integer>> getCarZoneSetsToFanDirectionValues() {
        return this.mCarZoneSetsToFanDirectionValues;
    }
}
