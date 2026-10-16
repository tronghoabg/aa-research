package androidx.car.app.hardware.climate;

import android.util.Pair;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarZone;
import com.google.d.d.bq;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class CabinTemperatureProfile {
    static final Map<Set<CarZone>, Pair<Float, Float>> DEFAULT_CELSIUS_TEMPERATURE_MAP;
    static final float DEFAULT_TEMPERATURE_INCREMENT = -1.0f;
    static final Pair<Float, Float> DEFAULT_TEMPERATURE_RANGE;
    private final Map<Set<CarZone>, Pair<Float, Float>> mCarZoneSetsToCabinCelsiusTemperatureRanges;
    private final float mCelsiusSupportedIncrement;
    private final float mFahrenheitSupportedIncrement;
    private final Pair<Float, Float> mSupportedMinMaxCelsiusRange;
    private final Pair<Float, Float> mSupportedMinMaxFahrenheitRange;

    /* compiled from: WazeSource */
    public final class Builder {
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
            this.mCelsiusSupportedIncrement = -1.0f;
            this.mFahrenheitSupportedIncrement = -1.0f;
        }

        public CabinTemperatureProfile build() {
            return new CabinTemperatureProfile(this);
        }

        public Builder setCarZoneSetsToCabinCelsiusTemperatureRanges(Map<Set<CarZone>, Pair<Float, Float>> map) {
            this.mCarZoneSetsToCabinCelsiusTemperatureRanges = map;
            return this;
        }

        public Builder setCelsiusSupportedIncrement(float f2) {
            this.mCelsiusSupportedIncrement = f2;
            return this;
        }

        public Builder setFahrenheitSupportedIncrement(float f2) {
            this.mFahrenheitSupportedIncrement = f2;
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
        Float fValueOf = Float.valueOf(-1.0f);
        DEFAULT_TEMPERATURE_RANGE = new Pair<>(fValueOf, fValueOf);
        bq bqVar = new bq();
        bqVar.d(Collections.singleton(CarZone.CAR_ZONE_GLOBAL), new Pair(fValueOf, fValueOf));
        DEFAULT_CELSIUS_TEMPERATURE_MAP = bqVar.a();
    }

    CabinTemperatureProfile(Builder builder) {
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
        return this.mCelsiusSupportedIncrement != -1.0f;
    }

    public boolean hasFahrenheitSupportedIncrement() {
        return this.mFahrenheitSupportedIncrement != -1.0f;
    }

    public boolean hasSupportedMinMaxCelsiusRange() {
        return !this.mSupportedMinMaxCelsiusRange.equals(DEFAULT_TEMPERATURE_RANGE);
    }

    public boolean hasSupportedMinMaxFahrenheitRange() {
        return !this.mSupportedMinMaxFahrenheitRange.equals(DEFAULT_TEMPERATURE_RANGE);
    }
}
