package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.CarText;
import androidx.car.app.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class Trip {
    private final CarText mCurrentRoad;
    private final List<TravelEstimate> mDestinationTravelEstimates;
    private final List<Destination> mDestinations;
    private final boolean mIsLoading;
    private final List<TravelEstimate> mStepTravelEstimates;
    private final List<Step> mSteps;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        CarText mCurrentRoad;
        boolean mIsLoading;
        final List<Destination> mDestinations = new ArrayList();
        final List<Step> mSteps = new ArrayList();
        final List<TravelEstimate> mDestinationTravelEstimates = new ArrayList();
        final List<TravelEstimate> mStepTravelEstimates = new ArrayList();

        public Builder addDestination(Destination destination, TravelEstimate travelEstimate) {
            List<Destination> list = this.mDestinations;
            Objects.requireNonNull(destination);
            list.add(destination);
            List<TravelEstimate> list2 = this.mDestinationTravelEstimates;
            Objects.requireNonNull(travelEstimate);
            list2.add(travelEstimate);
            return this;
        }

        public Builder addStep(Step step, TravelEstimate travelEstimate) {
            List<Step> list = this.mSteps;
            Objects.requireNonNull(step);
            list.add(step);
            List<TravelEstimate> list2 = this.mStepTravelEstimates;
            Objects.requireNonNull(travelEstimate);
            list2.add(travelEstimate);
            return this;
        }

        public Trip build() {
            if (this.mDestinations.size() != this.mDestinationTravelEstimates.size()) {
                throw new IllegalArgumentException("Destinations and destination travel estimates sizes must match");
            }
            if (this.mSteps.size() != this.mStepTravelEstimates.size()) {
                throw new IllegalArgumentException("Steps and step travel estimates sizes must match");
            }
            if (!this.mIsLoading || this.mSteps.isEmpty()) {
                return new Trip(this);
            }
            throw new IllegalArgumentException("Step information may not be set while loading");
        }

        public Builder setCurrentRoad(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.mCurrentRoad = CarText.create(charSequence);
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }
    }

    public Trip(Builder builder) {
        this.mDestinations = CollectionUtils.unmodifiableCopy(builder.mDestinations);
        this.mSteps = CollectionUtils.unmodifiableCopy(builder.mSteps);
        this.mDestinationTravelEstimates = CollectionUtils.unmodifiableCopy(builder.mDestinationTravelEstimates);
        this.mStepTravelEstimates = CollectionUtils.unmodifiableCopy(builder.mStepTravelEstimates);
        this.mCurrentRoad = builder.mCurrentRoad;
        this.mIsLoading = builder.mIsLoading;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj;
        return Objects.equals(this.mDestinations, trip.mDestinations) && Objects.equals(this.mSteps, trip.mSteps) && Objects.equals(this.mDestinationTravelEstimates, trip.mDestinationTravelEstimates) && Objects.equals(this.mStepTravelEstimates, trip.mStepTravelEstimates) && Objects.equals(this.mCurrentRoad, trip.mCurrentRoad) && Boolean.valueOf(this.mIsLoading).equals(Boolean.valueOf(trip.mIsLoading));
    }

    public CarText getCurrentRoad() {
        return this.mCurrentRoad;
    }

    public List<TravelEstimate> getDestinationTravelEstimates() {
        return CollectionUtils.emptyIfNull(this.mDestinationTravelEstimates);
    }

    public List<Destination> getDestinations() {
        return CollectionUtils.emptyIfNull(this.mDestinations);
    }

    public List<TravelEstimate> getStepTravelEstimates() {
        return CollectionUtils.emptyIfNull(this.mStepTravelEstimates);
    }

    public List<Step> getSteps() {
        return CollectionUtils.emptyIfNull(this.mSteps);
    }

    public int hashCode() {
        return Objects.hash(this.mDestinations, this.mSteps, this.mDestinationTravelEstimates, this.mStepTravelEstimates, this.mCurrentRoad);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "[ destinations : " + this.mDestinations.toString() + ", steps: " + this.mSteps.toString() + ", dest estimates: " + this.mDestinationTravelEstimates.toString() + ", step estimates: " + this.mStepTravelEstimates.toString() + ", road: " + CarText.toShortString(this.mCurrentRoad) + ", isLoading: " + this.mIsLoading + "]";
    }

    private Trip() {
        List list = Collections.EMPTY_LIST;
        this.mDestinations = list;
        this.mSteps = list;
        this.mDestinationTravelEstimates = list;
        this.mStepTravelEstimates = list;
        this.mCurrentRoad = null;
        this.mIsLoading = false;
    }
}
