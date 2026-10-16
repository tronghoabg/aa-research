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
public final class SteeringWheelHeatProfile {
    private final Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSteeringWheelHeatValues;

    /* compiled from: WazeSource */
    public final class Builder {
        Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSteeringWheelHeatValues;

        public Builder(Map<Set<CarZone>, Pair<Integer, Integer>> map) {
            this.mCarZoneSetsToSteeringWheelHeatValues = DesugarCollections.unmodifiableMap(map);
        }

        public SteeringWheelHeatProfile build() {
            return new SteeringWheelHeatProfile(this);
        }
    }

    SteeringWheelHeatProfile(Builder builder) {
        this.mCarZoneSetsToSteeringWheelHeatValues = DesugarCollections.unmodifiableMap(builder.mCarZoneSetsToSteeringWheelHeatValues);
    }

    public Map<Set<CarZone>, Pair<Integer, Integer>> getCarZoneSetsToSteeringWheelHeatValues() {
        return this.mCarZoneSetsToSteeringWheelHeatValues;
    }
}
