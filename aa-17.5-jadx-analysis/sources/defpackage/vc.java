package defpackage;

import androidx.car.app.model.CarLocation;
import androidx.car.app.model.Place;
import androidx.car.app.model.PlaceMarker;

/* loaded from: classes2.dex */
public final class vc {
    public final CarLocation a;
    public PlaceMarker b;

    public vc(Place place) {
        this.a = place.getLocation();
        this.b = place.getMarker();
    }

    public vc(CarLocation carLocation) {
        this.a = carLocation;
    }
}
