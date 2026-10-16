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
public final class SeatVentilationProfile {
    private final Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSeatVentilationValues;

    /* compiled from: WazeSource */
    public final class Builder {
        Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSeatVentilationValues;

        public Builder(Map<Set<CarZone>, Pair<Integer, Integer>> map) {
            this.mCarZoneSetsToSeatVentilationValues = DesugarCollections.unmodifiableMap(map);
        }

        public SeatVentilationProfile build() {
            return new SeatVentilationProfile(this);
        }
    }

    SeatVentilationProfile(Builder builder) {
        this.mCarZoneSetsToSeatVentilationValues = DesugarCollections.unmodifiableMap(builder.mCarZoneSetsToSeatVentilationValues);
    }

    public Map<Set<CarZone>, Pair<Integer, Integer>> getCarZoneSetsToSeatVentilationValues() {
        return this.mCarZoneSetsToSeatVentilationValues;
    }
}
