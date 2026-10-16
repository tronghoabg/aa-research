package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class aaaw {
    public static final aaaw a = new aaaw();

    public static toi a(LatLng latLng) {
        return new toi(latLng.latitude, latLng.longitude);
    }

    public static ttn b(CameraPosition cameraPosition, tto ttoVar) {
        ttn ttnVar = ttn.a;
        ttl ttlVar = new ttl();
        ttlVar.d(a(cameraPosition.target));
        ttlVar.e = cameraPosition.zoom;
        ttlVar.f = cameraPosition.tilt;
        ttlVar.g = cameraPosition.bearing;
        if (ttoVar == null) {
            ttoVar = tto.a;
        }
        ttlVar.i = ttoVar;
        return ttlVar.a();
    }

    public static CameraPosition c(ttn ttnVar) {
        CameraPosition.Builder builder = new CameraPosition.Builder();
        builder.target(d(ttnVar.g));
        builder.zoom(ttnVar.l);
        builder.tilt(ttnVar.m);
        builder.bearing(ttnVar.n);
        return builder.build();
    }

    public static LatLng d(toi toiVar) {
        return new LatLng(toiVar.a, toiVar.b);
    }

    public static final int e(float f) {
        int iFloatToIntBits = Float.floatToIntBits(f);
        if (iFloatToIntBits == Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) {
            iFloatToIntBits = Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
        }
        return iFloatToIntBits < 0 ? iFloatToIntBits ^ Alert.DURATION_SHOW_INDEFINITELY : iFloatToIntBits;
    }
}
