package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class Place {
    private final CarLocation mLocation;
    private final PlaceMarker mMarker;

    public Place(Builder builder) {
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
        CarLocation carLocation = this.mLocation;
        Objects.requireNonNull(carLocation);
        return carLocation;
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

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        CarLocation mLocation;
        PlaceMarker mMarker;

        public Builder(CarLocation carLocation) {
            Objects.requireNonNull(carLocation);
            this.mLocation = carLocation;
        }

        public Place build() {
            return new Place(this);
        }

        public Builder setMarker(PlaceMarker placeMarker) {
            Objects.requireNonNull(placeMarker);
            this.mMarker = placeMarker;
            return this;
        }

        public Builder(Place place) {
            Objects.requireNonNull(place);
            this.mLocation = place.getLocation();
            this.mMarker = place.getMarker();
        }
    }

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }
}
