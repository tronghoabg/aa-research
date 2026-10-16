package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Place {
    private final androidx.car.app.model.CarLocation mLocation;
    private final androidx.car.app.model.PlaceMarker mMarker;

    public Place(defpackage.vh vhVar) {
        this.mLocation = vhVar.a;
        this.mMarker = vhVar.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Place)) {
            return false;
        }
        androidx.car.app.model.Place place = (androidx.car.app.model.Place) obj;
        return j$.util.Objects.equals(this.mLocation, place.mLocation) && j$.util.Objects.equals(this.mMarker, place.mMarker);
    }

    public androidx.car.app.model.CarLocation getLocation() {
        androidx.car.app.model.CarLocation carLocation = this.mLocation;
        carLocation.getClass();
        return carLocation;
    }

    public androidx.car.app.model.PlaceMarker getMarker() {
        return this.mMarker;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mLocation, this.mMarker);
    }

    public java.lang.String toString() {
        return "[ location: " + this.mLocation + ", marker: " + this.mMarker + "]";
    }

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }
}
