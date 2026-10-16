package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.android.libraries.maps.model.StreetViewPanoramaLocation;
import com.google.android.libraries.maps.model.StreetViewPanoramaOrientation;

/* loaded from: classes3.dex */
public interface zyj {
    public static final StreetViewPanoramaCamera a = new StreetViewPanoramaCamera(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    StreetViewPanoramaCamera a();

    StreetViewPanoramaLocation b();

    StreetViewPanoramaOrientation c(int i, int i2);

    void d(vhx vhxVar);

    void e(via viaVar);

    void f(vid vidVar);

    void g(vig vigVar);

    void h(zyi zyiVar);

    boolean i();

    void onPause();

    void onResume();
}
