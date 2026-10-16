package androidx.car.app.hardware.common;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(3)
/* loaded from: classes.dex */
public final class CarUnit {
    public static final int IMPERIAL_GALLON = 204;
    public static final int KILOMETER = 3;
    public static final int KILOMETERS_PER_HOUR = 102;
    public static final int LITER = 202;
    public static final int METER = 2;
    public static final int METERS_PER_SEC = 101;
    public static final int MILE = 4;
    public static final int MILES_PER_HOUR = 103;
    public static final int MILLILITER = 201;
    public static final int MILLIMETER = 1;
    public static final int US_GALLON = 203;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarDistanceUnit {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarSpeedUnit {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarVolumeUnit {
    }

    private CarUnit() {
    }

    public static String toString(int i) {
        if (i == 1) {
            return "MILLIMETER";
        }
        if (i == 2) {
            return "METER";
        }
        if (i == 3) {
            return "KILOMETER";
        }
        if (i == 4) {
            return "MILE";
        }
        switch (i) {
            case 101:
                return "METERS_PER_SEC";
            case 102:
                return "KILOMETERS_PER_HOUR";
            case MILES_PER_HOUR /* 103 */:
                return "MILES_PER_HOUR ";
            default:
                switch (i) {
                    case MILLILITER /* 201 */:
                        return "MILLILITER";
                    case LITER /* 202 */:
                        return "LITER";
                    case US_GALLON /* 203 */:
                        return "US_GALLON ";
                    case IMPERIAL_GALLON /* 204 */:
                        return "IMPERIAL_GALLON";
                    default:
                        return "UNKNOWN";
                }
        }
    }
}
