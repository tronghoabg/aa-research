package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class aaab implements ztt {
    private final aaac b;
    private final double c;
    private int g;
    private int h;
    private int i;
    private int j;
    private CameraPosition d = y(new CameraPosition(new LatLng(0.0d, 0.0d), 3.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
    private final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    private vez e = null;

    public aaab(aaac aaacVar, float f) {
        this.b = aaacVar;
        this.c = Math.max(1.0d, Math.floor(f));
    }

    private static CameraPosition y(CameraPosition cameraPosition) {
        if (cameraPosition.tilt != BitmapDescriptorFactory.HUE_RED || cameraPosition.bearing != BitmapDescriptorFactory.HUE_RED) {
            zrn.d("Non zero bearing and tilt", " are not supported in Lite Mode");
        }
        if (cameraPosition.zoom != Math.round(r0)) {
            zrn.d("Non integer zooms", " are not supported in Lite Mode");
        }
        return new CameraPosition(cameraPosition.target, Math.round(Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(22.0f, cameraPosition.zoom))), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    private final void z(CameraPosition cameraPosition) {
        this.d = y(cameraPosition);
        this.b.c.b();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            try {
                ((vez) it.next()).a(this.d);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        vez vezVar = this.e;
        if (vezVar != null) {
            try {
                vezVar.a(this.d);
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    @Override // defpackage.ztt
    public final float a(LatLng latLng) {
        return 22.0f;
    }

    @Override // defpackage.ztt
    public final float b() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.ztt
    public final CameraPosition c() {
        return this.d;
    }

    @Override // defpackage.ztt
    public final CameraPosition d(LatLngBounds latLngBounds) {
        aaac aaacVar = this.b;
        int width = aaacVar.getWidth();
        int height = aaacVar.getHeight();
        latLngBounds.getCenter();
        double d = this.c;
        double d2 = 22.0d;
        aaan aaanVarE = aaao.e(latLngBounds.southwest, 22.0d, d);
        aaan aaanVarE2 = aaao.e(latLngBounds.northeast, 22.0d, d);
        if (latLngBounds.southwest.longitude > latLngBounds.northeast.longitude) {
            long j = aaanVarE2.a;
            double dPow = Math.pow(2.0d, 22.0d) * 256.0d * d;
            aaanVarE2 = new aaan(j + ((int) dPow), aaanVarE2.b);
        }
        long j2 = aaanVarE.a;
        long j3 = aaanVarE.b;
        long j4 = aaanVarE2.a - j2;
        long j5 = j3 - aaanVarE2.b;
        while (true) {
            if (j4 <= width && j5 <= height) {
                return new CameraPosition(latLngBounds.getCenter(), (float) d2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            d2 -= 1.0d;
            j4 >>= 1;
            j5 >>= 1;
        }
    }

    @Override // defpackage.ztt
    public final void f(vez vezVar) {
        this.f.add(vezVar);
    }

    @Override // defpackage.ztt
    public final void g(CameraPosition cameraPosition, int i) {
        z(cameraPosition);
    }

    @Override // defpackage.ztt
    public final void h(CameraPosition cameraPosition, int i) {
        z(cameraPosition);
    }

    @Override // defpackage.ztt
    public final void i(LatLng latLng, int i) {
        CameraPosition cameraPosition = this.d;
        z(new CameraPosition(latLng, cameraPosition.zoom, cameraPosition.tilt, cameraPosition.bearing));
    }

    @Override // defpackage.ztt
    public final void j(LatLngBounds latLngBounds, int i, int i2) {
        z(d(latLngBounds));
    }

    @Override // defpackage.ztt
    public final void k(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        zrn.d("newLatLngBounds with size", " is not supported in Lite Mode");
    }

    @Override // defpackage.ztt
    public final void l(LatLng latLng, float f, int i) {
        CameraPosition cameraPosition = this.d;
        z(new CameraPosition(latLng, f, cameraPosition.tilt, cameraPosition.bearing));
    }

    @Override // defpackage.ztt
    public final void m() {
        this.f.clear();
    }

    @Override // defpackage.ztt
    public final void n(vez vezVar) {
        this.f.remove(vezVar);
    }

    @Override // defpackage.ztt
    public final void o(float f, float f2, int i) {
        zrn.d("scrollBy", " is not supported in Lite Mode");
    }

    @Override // defpackage.ztt
    public final void p(vez vezVar) {
        this.e = vezVar;
    }

    @Override // defpackage.ztt
    public final void q(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    @Override // defpackage.ztt
    public final void s(zts ztsVar, int i, veb vebVar, zys zysVar) {
        boolean z = true;
        if (i == 0) {
            i = 0;
            if (vebVar != null) {
                z = false;
            }
        }
        zkt.e(z, "Callback supplied with instantaneous camera movement");
        ztsVar.a(this, i, zysVar);
    }

    @Override // defpackage.ztt
    public final void t(float f, int i) {
        CameraPosition cameraPosition = this.d;
        z(new CameraPosition(cameraPosition.target, cameraPosition.zoom + f, cameraPosition.tilt, cameraPosition.bearing));
    }

    @Override // defpackage.ztt
    public final void u(float f, int i, int i2, int i3) {
        zrn.d("zoomBy with focus", " is not supported in Lite Mode");
    }

    @Override // defpackage.ztt
    public final void v(float f, int i) {
        CameraPosition cameraPosition = this.d;
        z(new CameraPosition(cameraPosition.target, f, cameraPosition.tilt, cameraPosition.bearing));
    }

    @Override // defpackage.ztt
    public final void w(float f) {
        zrn.d("zoomByCumulative", " is not supported in Lite Mode");
    }

    @Override // defpackage.ztt
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final aaao e() {
        aaac aaacVar = this.b;
        return new aaao(this.d, aaacVar.getWidth(), aaacVar.getHeight(), this.c, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.ztt
    public final void r() {
    }
}
