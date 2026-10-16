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
public final class SeatTemperatureProfile {
    private final Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSeatTemperatureValues;

    /* compiled from: WazeSource */
    public final class Builder {
        Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSeatTemperatureValues;

        public Builder(Map<Set<CarZone>, Pair<Integer, Integer>> map) {
            this.mCarZoneSetsToSeatTemperatureValues = DesugarCollections.unmodifiableMap(map);
        }

        public SeatTemperatureProfile build() {
            return new SeatTemperatureProfile(this);
        }
    }

    SeatTemperatureProfile(Builder builder) {
        this.mCarZoneSetsToSeatTemperatureValues = DesugarCollections.unmodifiableMap(builder.mCarZoneSetsToSeatTemperatureValues);
    }

    public Map<Set<CarZone>, Pair<Integer, Integer>> getCarZoneSetsToSeatTemperatureValues() {
        return this.mCarZoneSetsToSeatTemperatureValues;
    }
}
