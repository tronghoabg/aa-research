package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(7)
/* loaded from: classes.dex */
public class ExteriorDimensions {
    public static final int CURB_TO_CURB_TURNING_RADIUS_INDEX = 7;
    public static final int HEIGHT_INDEX = 0;
    public static final int LENGTH_INDEX = 1;
    public static final int TRACK_WIDTH_FRONT_INDEX = 5;
    public static final int TRACK_WIDTH_REAR_INDEX = 6;
    public static final int WHEEL_BASE_INDEX = 4;
    public static final int WIDTH_INCLUDING_MIRRORS_INDEX = 3;
    public static final int WIDTH_INDEX = 2;
    private final CarValue<Integer[]> mExteriorDimensions;

    public ExteriorDimensions() {
        this.mExteriorDimensions = CarValue.UNKNOWN_INTEGER_ARRAY;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExteriorDimensions) {
            return this.mExteriorDimensions.equals(((ExteriorDimensions) obj).mExteriorDimensions);
        }
        return false;
    }

    public CarValue<Integer[]> getExteriorDimensions() {
        return this.mExteriorDimensions;
    }

    public int hashCode() {
        return Objects.hash(this.mExteriorDimensions);
    }

    public String toString() {
        return "[ exteriorDimensions: " + this.mExteriorDimensions + " ]";
    }

    public ExteriorDimensions(CarValue<Integer[]> carValue) {
        this.mExteriorDimensions = carValue;
    }
}
