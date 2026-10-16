package androidx.car.app.hardware.climate;

import android.util.Pair;
import androidx.car.app.hardware.common.CarZone;
import defpackage.g9;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CabinTemperatureProfile {
    static final Map<Set<CarZone>, Pair<Float, Float>> DEFAULT_CELSIUS_TEMPERATURE_MAP;
    static final float DEFAULT_TEMPERATURE_INCREMENT = -1.0f;
    static final Pair<Float, Float> DEFAULT_TEMPERATURE_RANGE;
    private final Map<Set<CarZone>, Pair<Float, Float>> mCarZoneSetsToCabinCelsiusTemperatureRanges;
    private final float mCelsiusSupportedIncrement;
    private final float mFahrenheitSupportedIncrement;
    private final Pair<Float, Float> mSupportedMinMaxCelsiusRange;
    private final Pair<Float, Float> mSupportedMinMaxFahrenheitRange;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Map<Set<CarZone>, Pair<Float, Float>> mCarZoneSetsToCabinCelsiusTemperatureRanges;
        float mCelsiusSupportedIncrement;
        float mFahrenheitSupportedIncrement;
        Pair<Float, Float> mSupportedMinMaxCelsiusRange;
        Pair<Float, Float> mSupportedMinMaxFahrenheitRange;

        public Builder() {
            Pair<Float, Float> pair = CabinTemperatureProfile.DEFAULT_TEMPERATURE_RANGE;
            this.mSupportedMinMaxCelsiusRange = pair;
            this.mSupportedMinMaxFahrenheitRange = pair;
            this.mCarZoneSetsToCabinCelsiusTemperatureRanges = CabinTemperatureProfile.DEFAULT_CELSIUS_TEMPERATURE_MAP;
            this.mCelsiusSupportedIncrement = CabinTemperatureProfile.DEFAULT_TEMPERATURE_INCREMENT;
            this.mFahrenheitSupportedIncrement = CabinTemperatureProfile.DEFAULT_TEMPERATURE_INCREMENT;
        }

        public CabinTemperatureProfile build() {
            return new CabinTemperatureProfile(this);
        }

        public Builder setCarZoneSetsToCabinCelsiusTemperatureRanges(Map<Set<CarZone>, Pair<Float, Float>> map) {
            this.mCarZoneSetsToCabinCelsiusTemperatureRanges = map;
            return this;
        }

        public Builder setCelsiusSupportedIncrement(float f) {
            this.mCelsiusSupportedIncrement = f;
            return this;
        }

        public Builder setFahrenheitSupportedIncrement(float f) {
            this.mFahrenheitSupportedIncrement = f;
            return this;
        }

        public Builder setSupportedMinMaxCelsiusRange(Pair<Float, Float> pair) {
            this.mSupportedMinMaxCelsiusRange = pair;
            return this;
        }

        public Builder setSupportedMinMaxFahrenheitRange(Pair<Float, Float> pair) {
            this.mSupportedMinMaxFahrenheitRange = pair;
            return this;
        }
    }

    static {
        Float fValueOf = Float.valueOf(DEFAULT_TEMPERATURE_INCREMENT);
        DEFAULT_TEMPERATURE_RANGE = new Pair<>(fValueOf, fValueOf);
        Object[] objArr = new Object[8];
        Set setSingleton = Collections.singleton(CarZone.CAR_ZONE_GLOBAL);
        Pair pair = new Pair(fValueOf, fValueOf);
        if (setSingleton == null) {
            throw new NullPointerException("null key in entry: null=" + pair);
        }
        objArr[0] = setSingleton;
        objArr[1] = pair;
        Objects.requireNonNull(setSingleton);
        Objects.requireNonNull(objArr[1]);
        DEFAULT_CELSIUS_TEMPERATURE_MAP = new g9(objArr, 1, null);
    }

    public CabinTemperatureProfile(Builder builder) {
        this.mSupportedMinMaxCelsiusRange = builder.mSupportedMinMaxCelsiusRange;
        this.mSupportedMinMaxFahrenheitRange = builder.mSupportedMinMaxFahrenheitRange;
        this.mCarZoneSetsToCabinCelsiusTemperatureRanges = builder.mCarZoneSetsToCabinCelsiusTemperatureRanges;
        this.mCelsiusSupportedIncrement = builder.mCelsiusSupportedIncrement;
        this.mFahrenheitSupportedIncrement = builder.mFahrenheitSupportedIncrement;
    }

    public Map<Set<CarZone>, Pair<Float, Float>> getCarZoneSetsToCabinCelsiusTemperatureRanges() {
        if (hasCarZoneSetsToCabinCelsiusTemperatureRanges()) {
            return this.mCarZoneSetsToCabinCelsiusTemperatureRanges;
        }
        throw new IllegalStateException("Celsius min/max range corresponding to car zones is not available.");
    }

    public float getCelsiusSupportedIncrement() {
        if (hasCelsiusSupportedIncrement()) {
            return this.mCelsiusSupportedIncrement;
        }
        throw new IllegalStateException("Celsius increment value is not available.");
    }

    public float getFahrenheitSupportedIncrement() {
        if (hasFahrenheitSupportedIncrement()) {
            return this.mFahrenheitSupportedIncrement;
        }
        throw new IllegalStateException("Fahrenheit increment value is not available.");
    }

    public Pair<Float, Float> getSupportedMinMaxCelsiusRange() {
        if (hasSupportedMinMaxCelsiusRange()) {
            return this.mSupportedMinMaxCelsiusRange;
        }
        throw new IllegalStateException("Celsius min/max range is not available.");
    }

    public Pair<Float, Float> getSupportedMinMaxFahrenheitRange() {
        if (hasSupportedMinMaxFahrenheitRange()) {
            return this.mSupportedMinMaxFahrenheitRange;
        }
        throw new IllegalStateException("Fahrenheit min/max range is not available.");
    }

    public boolean hasCarZoneSetsToCabinCelsiusTemperatureRanges() {
        return this.mCarZoneSetsToCabinCelsiusTemperatureRanges != DEFAULT_CELSIUS_TEMPERATURE_MAP;
    }

    public boolean hasCelsiusSupportedIncrement() {
        return this.mCelsiusSupportedIncrement != DEFAULT_TEMPERATURE_INCREMENT;
    }

    public boolean hasFahrenheitSupportedIncrement() {
        return this.mFahrenheitSupportedIncrement != DEFAULT_TEMPERATURE_INCREMENT;
    }

    public boolean hasSupportedMinMaxCelsiusRange() {
        return !this.mSupportedMinMaxCelsiusRange.equals(DEFAULT_TEMPERATURE_RANGE);
    }

    public boolean hasSupportedMinMaxFahrenheitRange() {
        return !this.mSupportedMinMaxFahrenheitRange.equals(DEFAULT_TEMPERATURE_RANGE);
    }
}
