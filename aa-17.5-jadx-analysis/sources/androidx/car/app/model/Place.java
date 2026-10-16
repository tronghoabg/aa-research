package androidx.car.app.model;

import defpackage.rb;
import defpackage.vc;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class Place {
    private final CarLocation mLocation;
    private final PlaceMarker mMarker;

    public Place(vc vcVar) {
        this.mLocation = vcVar.a;
        this.mMarker = vcVar.b;
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
        carLocation.getClass();
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

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }
}
