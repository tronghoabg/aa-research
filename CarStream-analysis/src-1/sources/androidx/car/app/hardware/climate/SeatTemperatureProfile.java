package androidx.car.app.hardware.climate;

import android.util.Pair;
import androidx.car.app.hardware.common.CarZone;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SeatTemperatureProfile {
    private final Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSeatTemperatureValues;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSeatTemperatureValues;

        public Builder(Map<Set<CarZone>, Pair<Integer, Integer>> map) {
            this.mCarZoneSetsToSeatTemperatureValues = Collections.unmodifiableMap(map);
        }

        public SeatTemperatureProfile build() {
            return new SeatTemperatureProfile(this);
        }
    }

    public SeatTemperatureProfile(Builder builder) {
        this.mCarZoneSetsToSeatTemperatureValues = Collections.unmodifiableMap(builder.mCarZoneSetsToSeatTemperatureValues);
    }

    public Map<Set<CarZone>, Pair<Integer, Integer>> getCarZoneSetsToSeatTemperatureValues() {
        return this.mCarZoneSetsToSeatTemperatureValues;
    }
}
