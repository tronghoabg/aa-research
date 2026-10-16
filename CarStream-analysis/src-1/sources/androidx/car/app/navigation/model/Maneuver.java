package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.constraints.CarIconConstraints;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class Maneuver {
    public static final int TYPE_DEPART = 1;
    public static final int TYPE_DESTINATION = 39;
    public static final int TYPE_DESTINATION_LEFT = 41;
    public static final int TYPE_DESTINATION_RIGHT = 42;
    public static final int TYPE_DESTINATION_STRAIGHT = 40;
    public static final int TYPE_FERRY_BOAT = 37;
    public static final int TYPE_FERRY_BOAT_LEFT = 47;
    public static final int TYPE_FERRY_BOAT_RIGHT = 48;
    public static final int TYPE_FERRY_TRAIN = 38;
    public static final int TYPE_FERRY_TRAIN_LEFT = 49;
    public static final int TYPE_FERRY_TRAIN_RIGHT = 50;
    public static final int TYPE_FORK_LEFT = 25;
    public static final int TYPE_FORK_RIGHT = 26;
    public static final int TYPE_KEEP_LEFT = 3;
    public static final int TYPE_KEEP_RIGHT = 4;
    public static final int TYPE_MERGE_LEFT = 27;
    public static final int TYPE_MERGE_RIGHT = 28;
    public static final int TYPE_MERGE_SIDE_UNSPECIFIED = 29;
    public static final int TYPE_NAME_CHANGE = 2;
    public static final int TYPE_OFF_RAMP_NORMAL_LEFT = 23;
    public static final int TYPE_OFF_RAMP_NORMAL_RIGHT = 24;
    public static final int TYPE_OFF_RAMP_SLIGHT_LEFT = 21;
    public static final int TYPE_OFF_RAMP_SLIGHT_RIGHT = 22;
    public static final int TYPE_ON_RAMP_NORMAL_LEFT = 15;
    public static final int TYPE_ON_RAMP_NORMAL_RIGHT = 16;
    public static final int TYPE_ON_RAMP_SHARP_LEFT = 17;
    public static final int TYPE_ON_RAMP_SHARP_RIGHT = 18;
    public static final int TYPE_ON_RAMP_SLIGHT_LEFT = 13;
    public static final int TYPE_ON_RAMP_SLIGHT_RIGHT = 14;
    public static final int TYPE_ON_RAMP_U_TURN_LEFT = 19;
    public static final int TYPE_ON_RAMP_U_TURN_RIGHT = 20;
    public static final int TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW = 34;
    public static final int TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE = 35;
    public static final int TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW = 32;
    public static final int TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE = 33;
    public static final int TYPE_ROUNDABOUT_ENTER_CCW = 45;
    public static final int TYPE_ROUNDABOUT_ENTER_CW = 43;
    public static final int TYPE_ROUNDABOUT_EXIT_CCW = 46;
    public static final int TYPE_ROUNDABOUT_EXIT_CW = 44;
    public static final int TYPE_STRAIGHT = 36;
    public static final int TYPE_TURN_NORMAL_LEFT = 7;
    public static final int TYPE_TURN_NORMAL_RIGHT = 8;
    public static final int TYPE_TURN_SHARP_LEFT = 9;
    public static final int TYPE_TURN_SHARP_RIGHT = 10;
    public static final int TYPE_TURN_SLIGHT_LEFT = 5;
    public static final int TYPE_TURN_SLIGHT_RIGHT = 6;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_U_TURN_LEFT = 11;
    public static final int TYPE_U_TURN_RIGHT = 12;
    private final CarIcon mIcon;
    private final int mRoundaboutExitAngle;
    private final int mRoundaboutExitNumber;
    private final int mType;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        private CarIcon mIcon;
        private boolean mIsRoundaboutExitAngleSet;
        private boolean mIsRoundaboutExitNumberSet;
        private int mRoundaboutExitAngle;
        private int mRoundaboutExitNumber;
        private final int mType;

        public Builder(int i) {
            if (!Maneuver.isValidType(i)) {
                throw new IllegalArgumentException("Maneuver must have a valid type");
            }
            this.mType = i;
        }

        public Maneuver build() {
            if (Maneuver.isExitNumberRequired(this.mType) && !this.mIsRoundaboutExitNumberSet) {
                throw new IllegalArgumentException("Maneuver missing roundaboutExitNumber");
            }
            if (!Maneuver.isValidTypeWithExitAngle(this.mType) || this.mIsRoundaboutExitAngleSet) {
                return new Maneuver(this.mType, this.mRoundaboutExitNumber, this.mRoundaboutExitAngle, this.mIcon);
            }
            throw new IllegalArgumentException("Maneuver missing roundaboutExitAngle");
        }

        public Builder setIcon(CarIcon carIcon) {
            Objects.requireNonNull(carIcon);
            this.mIcon = carIcon;
            return this;
        }

        public Builder setRoundaboutExitAngle(int i) {
            if (!Maneuver.isValidTypeWithExitAngle(this.mType)) {
                throw new IllegalArgumentException("Maneuver does not include roundaboutExitAngle");
            }
            if (i < 1 || i > 360) {
                throw new IllegalArgumentException("Maneuver must include a valid exit angle");
            }
            this.mIsRoundaboutExitAngleSet = true;
            this.mRoundaboutExitAngle = i;
            return this;
        }

        public Builder setRoundaboutExitNumber(int i) {
            if (!Maneuver.isValidTypeWithExitNumber(this.mType)) {
                throw new IllegalArgumentException("Maneuver does not include roundaboutExitNumber");
            }
            if (i < 1) {
                throw new IllegalArgumentException("Maneuver must include a valid exit number");
            }
            this.mIsRoundaboutExitNumberSet = true;
            this.mRoundaboutExitNumber = i;
            return this;
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public Maneuver(int i, int i2, int i3, CarIcon carIcon) {
        this.mType = i;
        this.mRoundaboutExitNumber = i2;
        this.mRoundaboutExitAngle = i3;
        CarIconConstraints.DEFAULT.validateOrThrow(carIcon);
        this.mIcon = carIcon;
    }

    public static boolean isExitNumberRequired(int i) {
        return i == 32 || i == 34;
    }

    public static boolean isValidType(int i) {
        return i >= 0 && i <= 50;
    }

    public static boolean isValidTypeWithExitAngle(int i) {
        return i == 33 || i == 35;
    }

    public static boolean isValidTypeWithExitNumber(int i) {
        return i == 32 || i == 34 || i == 33 || i == 35;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Maneuver)) {
            return false;
        }
        Maneuver maneuver = (Maneuver) obj;
        return this.mType == maneuver.mType && this.mRoundaboutExitNumber == maneuver.mRoundaboutExitNumber && this.mRoundaboutExitAngle == maneuver.mRoundaboutExitAngle && Objects.equals(this.mIcon, maneuver.mIcon);
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getRoundaboutExitAngle() {
        return this.mRoundaboutExitAngle;
    }

    public int getRoundaboutExitNumber() {
        return this.mRoundaboutExitNumber;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), Integer.valueOf(this.mRoundaboutExitNumber), Integer.valueOf(this.mRoundaboutExitAngle), this.mIcon);
    }

    public String toString() {
        return "[type: " + this.mType + ", exit #: " + this.mRoundaboutExitNumber + ", exit angle: " + this.mRoundaboutExitAngle + ", icon: " + this.mIcon + "]";
    }

    private Maneuver() {
        this.mType = 0;
        this.mRoundaboutExitNumber = 0;
        this.mRoundaboutExitAngle = 0;
        this.mIcon = null;
    }
}
