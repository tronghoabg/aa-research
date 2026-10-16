package androidx.car.app.hardware.climate;

import android.util.Pair;
import androidx.car.app.hardware.common.CarZone;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SteeringWheelHeatProfile {
    private final Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSteeringWheelHeatValues;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSteeringWheelHeatValues;

        public Builder(Map<Set<CarZone>, Pair<Integer, Integer>> map) {
            this.mCarZoneSetsToSteeringWheelHeatValues = Collections.unmodifiableMap(map);
        }

        public SteeringWheelHeatProfile build() {
            return new SteeringWheelHeatProfile(this);
        }
    }

    public SteeringWheelHeatProfile(Builder builder) {
        this.mCarZoneSetsToSteeringWheelHeatValues = Collections.unmodifiableMap(builder.mCarZoneSetsToSteeringWheelHeatValues);
    }

    public Map<Set<CarZone>, Pair<Integer, Integer>> getCarZoneSetsToSteeringWheelHeatValues() {
        return this.mCarZoneSetsToSteeringWheelHeatValues;
    }
}
