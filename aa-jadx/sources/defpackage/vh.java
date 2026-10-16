package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vh {
    public final androidx.car.app.model.CarLocation a;
    public androidx.car.app.model.PlaceMarker b;

    public vh(androidx.car.app.model.Place place) {
        this.a = place.getLocation();
        this.b = place.getMarker();
    }

    public vh(androidx.car.app.model.CarLocation carLocation) {
        this.a = carLocation;
    }
}
