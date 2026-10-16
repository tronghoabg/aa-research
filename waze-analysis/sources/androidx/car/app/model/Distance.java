package androidx.car.app.model;

import androidx.camera.video.AudioStats;
import androidx.car.app.annotations.CarProtocol;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class Distance {
    public static final int UNIT_FEET = 6;
    public static final int UNIT_KILOMETERS = 2;
    public static final int UNIT_KILOMETERS_P1 = 3;
    public static final int UNIT_METERS = 1;
    public static final int UNIT_MILES = 4;
    public static final int UNIT_MILES_P1 = 5;
    public static final int UNIT_YARDS = 7;
    private final double mDisplayDistance;
    private final int mDisplayUnit;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit {
    }

    private Distance() {
        this.mDisplayDistance = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.mDisplayUnit = 1;
    }

    public static Distance create(double d2, int i2) {
        if (d2 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return new Distance(d2, i2);
        }
        throw new IllegalArgumentException("displayDistance must be a positive value");
    }

    private static String unitToString(int i2) {
        switch (i2) {
            case 1:
                return CmcdData.OBJECT_TYPE_MANIFEST;
            case 2:
                return "km";
            case 3:
                return "km_p1";
            case 4:
                return AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_IDENTIFIER;
            case 5:
                return "mi_p1";
            case 6:
                return "ft";
            case 7:
                return "yd";
            default:
                return "?";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Distance)) {
            return false;
        }
        Distance distance = (Distance) obj;
        return this.mDisplayUnit == distance.mDisplayUnit && this.mDisplayDistance == distance.mDisplayDistance;
    }

    public double getDisplayDistance() {
        return this.mDisplayDistance;
    }

    public int getDisplayUnit() {
        return this.mDisplayUnit;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.mDisplayDistance), Integer.valueOf(this.mDisplayUnit));
    }

    public String toString() {
        return String.format(Locale.US, "%.04f%s", Double.valueOf(this.mDisplayDistance), unitToString(this.mDisplayUnit));
    }

    private Distance(double d2, int i2) {
        this.mDisplayDistance = d2;
        this.mDisplayUnit = i2;
    }
}
