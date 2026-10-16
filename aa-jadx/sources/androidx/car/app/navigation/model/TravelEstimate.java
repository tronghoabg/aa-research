package androidx.car.app.navigation.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class TravelEstimate {
    public static final long REMAINING_TIME_UNKNOWN = -1;
    private final androidx.car.app.model.DateTimeWithZone mArrivalTimeAtDestination;
    private final androidx.car.app.model.Distance mRemainingDistance;
    private final androidx.car.app.model.CarColor mRemainingDistanceColor;
    private final androidx.car.app.model.CarColor mRemainingTimeColor;
    private final long mRemainingTimeSeconds;
    private final androidx.car.app.model.CarIcon mTripIcon;
    private final androidx.car.app.model.CarText mTripText;

    TravelEstimate(defpackage.xp xpVar) {
        androidx.car.app.model.Distance distance = xpVar.a;
        this.mRemainingDistance = null;
        long j = xpVar.b;
        this.mRemainingTimeSeconds = 0L;
        androidx.car.app.model.DateTimeWithZone dateTimeWithZone = xpVar.c;
        this.mArrivalTimeAtDestination = null;
        androidx.car.app.model.CarColor carColor = xpVar.d;
        this.mRemainingTimeColor = null;
        androidx.car.app.model.CarColor carColor2 = xpVar.e;
        this.mRemainingDistanceColor = null;
        androidx.car.app.model.CarText carText = xpVar.f;
        this.mTripText = null;
        androidx.car.app.model.CarIcon carIcon = xpVar.g;
        this.mTripIcon = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.navigation.model.TravelEstimate)) {
            return false;
        }
        androidx.car.app.navigation.model.TravelEstimate travelEstimate = (androidx.car.app.navigation.model.TravelEstimate) obj;
        return j$.util.Objects.equals(this.mRemainingDistance, travelEstimate.mRemainingDistance) && this.mRemainingTimeSeconds == travelEstimate.mRemainingTimeSeconds && j$.util.Objects.equals(this.mArrivalTimeAtDestination, travelEstimate.mArrivalTimeAtDestination) && j$.util.Objects.equals(this.mRemainingTimeColor, travelEstimate.mRemainingTimeColor) && j$.util.Objects.equals(this.mRemainingDistanceColor, travelEstimate.mRemainingDistanceColor) && j$.util.Objects.equals(this.mTripText, travelEstimate.mTripText) && j$.util.Objects.equals(this.mTripIcon, travelEstimate.mTripIcon);
    }

    public androidx.car.app.model.DateTimeWithZone getArrivalTimeAtDestination() {
        return this.mArrivalTimeAtDestination;
    }

    public androidx.car.app.model.Distance getRemainingDistance() {
        return this.mRemainingDistance;
    }

    public androidx.car.app.model.CarColor getRemainingDistanceColor() {
        return this.mRemainingDistanceColor;
    }

    public androidx.car.app.model.CarColor getRemainingTimeColor() {
        return this.mRemainingTimeColor;
    }

    public long getRemainingTimeSeconds() {
        long j = this.mRemainingTimeSeconds;
        if (j >= 0) {
            return j;
        }
        return -1L;
    }

    public androidx.car.app.model.CarIcon getTripIcon() {
        return this.mTripIcon;
    }

    public androidx.car.app.model.CarText getTripText() {
        return this.mTripText;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mRemainingDistance, java.lang.Long.valueOf(this.mRemainingTimeSeconds), this.mArrivalTimeAtDestination, this.mRemainingTimeColor, this.mRemainingDistanceColor, this.mTripText, this.mTripIcon);
    }

    public java.lang.String toString() {
        return "[ remaining distance: " + this.mRemainingDistance + ", time (s): " + this.mRemainingTimeSeconds + ", ETA: " + this.mArrivalTimeAtDestination + "]";
    }

    private TravelEstimate() {
        this.mRemainingDistance = null;
        this.mRemainingTimeSeconds = 0L;
        this.mArrivalTimeAtDestination = null;
        androidx.car.app.model.CarColor carColor = androidx.car.app.model.CarColor.DEFAULT;
        this.mRemainingTimeColor = carColor;
        this.mRemainingDistanceColor = carColor;
        this.mTripText = null;
        this.mTripIcon = null;
    }
}
