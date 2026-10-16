package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public interface ztt {
    public static final CameraPosition a = CameraPosition.fromLatLngZoom(new LatLng(0.0d, 0.0d), 1.0f);

    float a(LatLng latLng);

    float b();

    CameraPosition c();

    CameraPosition d(LatLngBounds latLngBounds);

    zxm e();

    void f(vez vezVar);

    void g(CameraPosition cameraPosition, int i);

    void h(CameraPosition cameraPosition, int i);

    void i(LatLng latLng, int i);

    void j(LatLngBounds latLngBounds, int i, int i2);

    void k(LatLngBounds latLngBounds, int i, int i2, int i3, int i4);

    void l(LatLng latLng, float f, int i);

    void m();

    void n(vez vezVar);

    void o(float f, float f2, int i);

    void p(vez vezVar);

    void q(int i, int i2, int i3, int i4);

    void r();

    void s(zts ztsVar, int i, veb vebVar, zys zysVar);

    void t(float f, int i);

    void u(float f, int i, int i2, int i3);

    void v(float f, int i);

    void w(float f);
}
