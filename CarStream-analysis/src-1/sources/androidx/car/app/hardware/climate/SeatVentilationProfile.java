package androidx.car.app.hardware.climate;

import android.util.Pair;
import androidx.car.app.hardware.common.CarZone;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SeatVentilationProfile {
    private final Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSeatVentilationValues;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Map<Set<CarZone>, Pair<Integer, Integer>> mCarZoneSetsToSeatVentilationValues;

        public Builder(Map<Set<CarZone>, Pair<Integer, Integer>> map) {
            this.mCarZoneSetsToSeatVentilationValues = Collections.unmodifiableMap(map);
        }

        public SeatVentilationProfile build() {
            return new SeatVentilationProfile(this);
        }
    }

    public SeatVentilationProfile(Builder builder) {
        this.mCarZoneSetsToSeatVentilationValues = Collections.unmodifiableMap(builder.mCarZoneSetsToSeatVentilationValues);
    }

    public Map<Set<CarZone>, Pair<Integer, Integer>> getCarZoneSetsToSeatVentilationValues() {
        return this.mCarZoneSetsToSeatVentilationValues;
    }
}
