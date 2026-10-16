package androidx.car.app.hardware.climate;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.climate.CarClimateFeature;
import defpackage.ad;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public final class ClimateProfileRequest {
    static final Set<Integer> ALL_FEATURES = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)));
    public static final int FEATURE_CABIN_TEMPERATURE = 4;
    public static final int FEATURE_CAR_ZONE_MAPPING = 17;
    public static final int FEATURE_FAN_DIRECTION = 6;
    public static final int FEATURE_FAN_SPEED = 5;
    public static final int FEATURE_HVAC_AC = 2;
    public static final int FEATURE_HVAC_AUTO_MODE = 12;
    public static final int FEATURE_HVAC_AUTO_RECIRCULATION = 11;
    public static final int FEATURE_HVAC_DEFROSTER = 14;
    public static final int FEATURE_HVAC_DUAL_MODE = 13;
    public static final int FEATURE_HVAC_ELECTRIC_DEFROSTER = 16;
    public static final int FEATURE_HVAC_MAX_AC = 3;
    public static final int FEATURE_HVAC_MAX_DEFROSTER = 15;
    public static final int FEATURE_HVAC_POWER = 1;
    public static final int FEATURE_HVAC_RECIRCULATION = 10;
    public static final int FEATURE_SEAT_TEMPERATURE_LEVEL = 7;
    public static final int FEATURE_SEAT_VENTILATION_LEVEL = 8;
    public static final int FEATURE_STEERING_WHEEL_HEAT = 9;
    private final List<CarClimateFeature> mRequestFeatures;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        boolean mAllProfiles = false;
        List<CarClimateFeature> mFeatures = new ArrayList();

        public Builder addClimateProfileFeatures(CarClimateFeature... carClimateFeatureArr) {
            for (CarClimateFeature carClimateFeature : carClimateFeatureArr) {
                int feature = carClimateFeature.getFeature();
                if (!ClimateProfileRequest.ALL_FEATURES.contains(Integer.valueOf(feature))) {
                    throw new IllegalArgumentException(ad.b(feature, "Invalid flag for climate profile request: "));
                }
                if (this.mFeatures.contains(carClimateFeature)) {
                    throw new IllegalArgumentException(ad.b(feature, "Flag already registered in climate profile request: "));
                }
                this.mFeatures.add(carClimateFeature);
            }
            return this;
        }

        public ClimateProfileRequest build() {
            return new ClimateProfileRequest(this);
        }

        public Builder setAllClimateProfiles() {
            this.mAllProfiles = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ClimateProfileFeature {
    }

    public ClimateProfileRequest(Builder builder) {
        if (builder.mAllProfiles) {
            this.mRequestFeatures = Collections.unmodifiableList(constructAllFeatures());
        } else {
            this.mRequestFeatures = Collections.unmodifiableList(builder.mFeatures);
        }
    }

    private List<CarClimateFeature> constructAllFeatures() {
        Set<Integer> set = ALL_FEATURES;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new CarClimateFeature.Builder(it.next().intValue()).build());
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClimateProfileRequest.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.mRequestFeatures, ((ClimateProfileRequest) obj).mRequestFeatures);
    }

    public Set<Integer> getAllClimateProfiles() {
        return ALL_FEATURES;
    }

    public List<CarClimateFeature> getClimateProfileFeatures() {
        return this.mRequestFeatures;
    }

    public int hashCode() {
        return Objects.hash(this.mRequestFeatures);
    }

    public String toString() {
        return "ClimateProfileRequest{mRequestFeatures=" + this.mRequestFeatures + '}';
    }
}
