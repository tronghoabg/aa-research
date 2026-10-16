package androidx.camera.common;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DiscreteRotationMath {
    public static final DiscreteRotationMath INSTANCE = new DiscreteRotationMath();

    private DiscreteRotationMath() {
    }

    public static final int fromSurfaceRotation(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 90;
        }
        if (i2 == 2) {
            return 180;
        }
        if (i2 == 3) {
            return DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN;
        }
        throw new IllegalArgumentException("Unexpected Surface rotation " + i2 + "!");
    }

    public static final void requireDiscreteRotation(int i2) {
        if (i2 == 0 || i2 == 90 || i2 == 180 || i2 == 270) {
            return;
        }
        throw new IllegalArgumentException("Unexpected rotation: " + i2 + ". Value must be one of 0, 90, 180, 270");
    }

    public static final int round(float f2) {
        return ((Math.round((f2 % 360.0f) / 90.0f) * 90) + DisplayStrings.DS_ONE_DAY_AGO) % DisplayStrings.DS_ONE_DAY_AGO;
    }

    public static final int round(int i2) {
        return ((((i2 % DisplayStrings.DS_ONE_DAY_AGO) + 405) / 90) * 90) % DisplayStrings.DS_ONE_DAY_AGO;
    }
}
