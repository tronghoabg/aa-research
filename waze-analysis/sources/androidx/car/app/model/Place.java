package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class Place {
    private final CarLocation mLocation;
    private final PlaceMarker mMarker;

    Place(Builder builder) {
        this.mLocation = builder.mLocation;
        this.mMarker = builder.mMarker;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return Objects.equals(this.mLocation, place.mLocation) && Objects.equals(this.mMarker, place.mMarker);
    }

    public CarLocation getLocation() {
        return (CarLocation) Objects.requireNonNull(this.mLocation);
    }

    public PlaceMarker getMarker() {
        return this.mMarker;
    }

    public int hashCode() {
        return Objects.hash(this.mLocation, this.mMarker);
    }

    public String toString() {
        return "[ location: " + this.mLocation + ", marker: " + this.mMarker + "]";
    }

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        CarLocation mLocation;
        PlaceMarker mMarker;

        public Builder(Place place) {
            Objects.requireNonNull(place);
            this.mLocation = place.getLocation();
            this.mMarker = place.getMarker();
        }

        public Place build() {
            return new Place(this);
        }

        public Builder setMarker(PlaceMarker placeMarker) {
            this.mMarker = (PlaceMarker) Objects.requireNonNull(placeMarker);
            return this;
        }

        public Builder(CarLocation carLocation) {
            this.mLocation = (CarLocation) Objects.requireNonNull(carLocation);
        }
    }
}
