package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;
import androidx.car.app.model.constraints.CarColorConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class TravelEstimate {
    public static final long REMAINING_TIME_UNKNOWN = -1;
    private final DateTimeWithZone mArrivalTimeAtDestination;
    private final Distance mRemainingDistance;
    private final CarColor mRemainingDistanceColor;
    private final CarColor mRemainingTimeColor;
    private final long mRemainingTimeSeconds;
    private final CarIcon mTripIcon;
    private final CarText mTripText;

    private TravelEstimate() {
        this.mRemainingDistance = null;
        this.mRemainingTimeSeconds = 0L;
        this.mArrivalTimeAtDestination = null;
        CarColor carColor = CarColor.DEFAULT;
        this.mRemainingTimeColor = carColor;
        this.mRemainingDistanceColor = carColor;
        this.mTripText = null;
        this.mTripIcon = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelEstimate)) {
            return false;
        }
        TravelEstimate travelEstimate = (TravelEstimate) obj;
        return Objects.equals(this.mRemainingDistance, travelEstimate.mRemainingDistance) && this.mRemainingTimeSeconds == travelEstimate.mRemainingTimeSeconds && Objects.equals(this.mArrivalTimeAtDestination, travelEstimate.mArrivalTimeAtDestination) && Objects.equals(this.mRemainingTimeColor, travelEstimate.mRemainingTimeColor) && Objects.equals(this.mRemainingDistanceColor, travelEstimate.mRemainingDistanceColor) && Objects.equals(this.mTripText, travelEstimate.mTripText) && Objects.equals(this.mTripIcon, travelEstimate.mTripIcon);
    }

    public DateTimeWithZone getArrivalTimeAtDestination() {
        return this.mArrivalTimeAtDestination;
    }

    public Distance getRemainingDistance() {
        return this.mRemainingDistance;
    }

    public CarColor getRemainingDistanceColor() {
        return this.mRemainingDistanceColor;
    }

    public CarColor getRemainingTimeColor() {
        return this.mRemainingTimeColor;
    }

    public long getRemainingTimeSeconds() {
        long j = this.mRemainingTimeSeconds;
        if (j >= 0) {
            return j;
        }
        return -1L;
    }

    @RequiresCarApi(5)
    public CarIcon getTripIcon() {
        return this.mTripIcon;
    }

    @RequiresCarApi(5)
    public CarText getTripText() {
        return this.mTripText;
    }

    public int hashCode() {
        return Objects.hash(this.mRemainingDistance, Long.valueOf(this.mRemainingTimeSeconds), this.mArrivalTimeAtDestination, this.mRemainingTimeColor, this.mRemainingDistanceColor, this.mTripText, this.mTripIcon);
    }

    public String toString() {
        return "[ remaining distance: " + this.mRemainingDistance + ", time (s): " + this.mRemainingTimeSeconds + ", ETA: " + this.mArrivalTimeAtDestination + "]";
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        final DateTimeWithZone mArrivalTimeAtDestination;
        final Distance mRemainingDistance;
        CarColor mRemainingDistanceColor;
        CarColor mRemainingTimeColor;
        long mRemainingTimeSeconds = -1;
        CarIcon mTripIcon;
        CarText mTripText;

        /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
        public static final class Api26Impl {
            private Api26Impl() {
            }

            public static Builder setRemainingTime(Builder builder, Duration duration) {
                Objects.requireNonNull(duration);
                builder.mRemainingTimeSeconds = Builder.validateRemainingTime(duration.getSeconds());
                return builder;
            }
        }

        public Builder(Distance distance, DateTimeWithZone dateTimeWithZone) {
            CarColor carColor = CarColor.DEFAULT;
            this.mRemainingTimeColor = carColor;
            this.mRemainingDistanceColor = carColor;
            Objects.requireNonNull(distance);
            this.mRemainingDistance = distance;
            Objects.requireNonNull(dateTimeWithZone);
            this.mArrivalTimeAtDestination = dateTimeWithZone;
        }

        public static long validateRemainingTime(long j) {
            if (j >= 0 || j == -1) {
                return j;
            }
            throw new IllegalArgumentException("Remaining time must be a larger than or equal to zero, or set to REMAINING_TIME_UNKNOWN");
        }

        public TravelEstimate build() {
            return new TravelEstimate(this);
        }

        public Builder setRemainingDistanceColor(CarColor carColor) {
            CarColorConstraints carColorConstraints = CarColorConstraints.STANDARD_ONLY;
            Objects.requireNonNull(carColor);
            carColorConstraints.validateOrThrow(carColor);
            this.mRemainingDistanceColor = carColor;
            return this;
        }

        public Builder setRemainingTime(Duration duration) {
            return Api26Impl.setRemainingTime(this, duration);
        }

        public Builder setRemainingTimeColor(CarColor carColor) {
            CarColorConstraints carColorConstraints = CarColorConstraints.STANDARD_ONLY;
            Objects.requireNonNull(carColor);
            carColorConstraints.validateOrThrow(carColor);
            this.mRemainingTimeColor = carColor;
            return this;
        }

        public Builder setRemainingTimeSeconds(long j) {
            this.mRemainingTimeSeconds = validateRemainingTime(j);
            return this;
        }

        @RequiresCarApi(5)
        public Builder setTripIcon(CarIcon carIcon) {
            CarIconConstraints carIconConstraints = CarIconConstraints.DEFAULT;
            Objects.requireNonNull(carIcon);
            carIconConstraints.validateOrThrow(carIcon);
            this.mTripIcon = carIcon;
            return this;
        }

        @RequiresCarApi(5)
        public Builder setTripText(CarText carText) {
            Objects.requireNonNull(carText);
            this.mTripText = carText;
            CarTextConstraints.TEXT_WITH_COLORS.validateOrThrow(carText);
            return this;
        }

        public Builder(Distance distance, ZonedDateTime zonedDateTime) {
            CarColor carColor = CarColor.DEFAULT;
            this.mRemainingTimeColor = carColor;
            this.mRemainingDistanceColor = carColor;
            Objects.requireNonNull(distance);
            this.mRemainingDistance = distance;
            Objects.requireNonNull(zonedDateTime);
            this.mArrivalTimeAtDestination = DateTimeWithZone.create(zonedDateTime);
        }
    }

    public TravelEstimate(Builder builder) {
        this.mRemainingDistance = builder.mRemainingDistance;
        this.mRemainingTimeSeconds = builder.mRemainingTimeSeconds;
        this.mArrivalTimeAtDestination = builder.mArrivalTimeAtDestination;
        this.mRemainingTimeColor = builder.mRemainingTimeColor;
        this.mRemainingDistanceColor = builder.mRemainingDistanceColor;
        this.mTripText = builder.mTripText;
        this.mTripIcon = builder.mTripIcon;
    }
}
