package androidx.car.app.hardware.climate;

import androidx.car.app.hardware.common.CarZone;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class FanDirectionProfile {
    private final Map<Set<CarZone>, Set<Integer>> mCarZoneSetsToFanDirectionValues;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Map<Set<CarZone>, Set<Integer>> mCarZoneSetsToFanDirectionValues;

        public Builder(Map<Set<CarZone>, Set<Integer>> map) {
            this.mCarZoneSetsToFanDirectionValues = Collections.unmodifiableMap(map);
        }

        public FanDirectionProfile build() {
            return new FanDirectionProfile(this);
        }
    }

    public FanDirectionProfile(Builder builder) {
        this.mCarZoneSetsToFanDirectionValues = Collections.unmodifiableMap(builder.mCarZoneSetsToFanDirectionValues);
    }

    public Map<Set<CarZone>, Set<Integer>> getCarZoneSetsToFanDirectionValues() {
        return this.mCarZoneSetsToFanDirectionValues;
    }
}
