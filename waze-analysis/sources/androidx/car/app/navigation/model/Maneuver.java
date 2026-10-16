package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.constraints.CarIconConstraints;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
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

    /* compiled from: WazeSource */
    public final class Builder {
        private CarIcon mIcon;
        private boolean mIsRoundaboutExitAngleSet;
        private boolean mIsRoundaboutExitNumberSet;
        private int mRoundaboutExitAngle;
        private int mRoundaboutExitNumber;
        private final int mType;

        public Builder(int i2) {
            if (!Maneuver.isValidType(i2)) {
                throw new IllegalArgumentException("Maneuver must have a valid type");
            }
            this.mType = i2;
        }

        public Maneuver build() {
            int i2 = this.mType;
            if (Maneuver.isExitNumberRequired(i2) && !this.mIsRoundaboutExitNumberSet) {
                throw new IllegalArgumentException("Maneuver missing roundaboutExitNumber");
            }
            if (!Maneuver.isValidTypeWithExitAngle(i2) || this.mIsRoundaboutExitAngleSet) {
                return new Maneuver(i2, this.mRoundaboutExitNumber, this.mRoundaboutExitAngle, this.mIcon);
            }
            throw new IllegalArgumentException("Maneuver missing roundaboutExitAngle");
        }

        public Builder setIcon(CarIcon carIcon) {
            this.mIcon = (CarIcon) Objects.requireNonNull(carIcon);
            return this;
        }

        public Builder setRoundaboutExitAngle(int i2) {
            if (!Maneuver.isValidTypeWithExitAngle(this.mType)) {
                throw new IllegalArgumentException("Maneuver does not include roundaboutExitAngle");
            }
            if (i2 <= 0 || i2 > 360) {
                throw new IllegalArgumentException("Maneuver must include a valid exit angle");
            }
            this.mIsRoundaboutExitAngleSet = true;
            this.mRoundaboutExitAngle = i2;
            return this;
        }

        public Builder setRoundaboutExitNumber(int i2) {
            if (!Maneuver.isValidTypeWithExitNumber(this.mType)) {
                throw new IllegalArgumentException("Maneuver does not include roundaboutExitNumber");
            }
            if (i2 <= 0) {
                throw new IllegalArgumentException("Maneuver must include a valid exit number");
            }
            this.mIsRoundaboutExitNumberSet = true;
            this.mRoundaboutExitNumber = i2;
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    Maneuver(int i2, int i3, int i4, CarIcon carIcon) {
        this.mType = i2;
        this.mRoundaboutExitNumber = i3;
        this.mRoundaboutExitAngle = i4;
        CarIconConstraints.DEFAULT.validateOrThrow(carIcon);
        this.mIcon = carIcon;
    }

    static boolean isExitNumberRequired(int i2) {
        return i2 == 32 || i2 == 34;
    }

    static boolean isValidType(int i2) {
        return i2 >= 0 && i2 <= 50;
    }

    static boolean isValidTypeWithExitAngle(int i2) {
        return i2 == 33 || i2 == 35;
    }

    static boolean isValidTypeWithExitNumber(int i2) {
        return i2 == 32 || i2 == 34 || i2 == 33 || i2 == 35;
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
