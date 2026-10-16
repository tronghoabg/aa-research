package defpackage;

import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class aaek implements aadp {
    private static final String a = "aaek";
    private final aacz b;
    private boolean c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;

    public aaek(aacz aaczVar) {
        synchronized (this) {
            this.b = aaczVar;
            this.c = false;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = BitmapDescriptorFactory.HUE_RED;
            this.g = BitmapDescriptorFactory.HUE_RED;
            this.h = BitmapDescriptorFactory.HUE_RED;
            this.i = BitmapDescriptorFactory.HUE_RED;
        }
    }

    @Override // defpackage.aadp
    public final int a() {
        return 1;
    }

    public final synchronized void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.d += f;
        this.e += f2;
        this.f += f5;
        this.g += f6;
        if (f != BitmapDescriptorFactory.HUE_RED || f2 != BitmapDescriptorFactory.HUE_RED) {
            this.h = f3;
            this.i = f4;
        }
        this.c = true;
    }

    @Override // defpackage.aadp
    public final synchronized CameraPosition c(aaet aaetVar, long j) {
        CameraPosition cameraPositionG = aaetVar.g();
        float f = this.h;
        float f2 = this.i;
        float f3 = this.f;
        float f4 = this.g;
        float f5 = this.d;
        float f6 = this.e;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = BitmapDescriptorFactory.HUE_RED;
        if (Math.abs(f5) < 0.001d && Math.abs(f6) < 0.001d && f3 == BitmapDescriptorFactory.HUE_RED && f4 == BitmapDescriptorFactory.HUE_RED) {
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.c = false;
            return null;
        }
        if (f3 != BitmapDescriptorFactory.HUE_RED || f4 != BitmapDescriptorFactory.HUE_RED) {
            LatLng latLngI = aaetVar.i(f3, f4, false);
            if (latLngI == null) {
                String str = a;
                if (zrn.e(str, 3)) {
                    Log.d(str, String.format("Failed to pan [%f, %f] for %s @ %s", Float.valueOf(f3), Float.valueOf(f4), cameraPositionG, aaetVar));
                }
            }
            if (latLngI != null) {
                CameraPosition.Builder builder = CameraPosition.builder(cameraPositionG);
                builder.target(latLngI);
                cameraPositionG = builder.build();
            }
        }
        if (f6 != BitmapDescriptorFactory.HUE_RED) {
            cameraPositionG = aaetVar.e(cameraPositionG, f6, new aadu(f, f2));
        }
        if (f5 == BitmapDescriptorFactory.HUE_RED) {
            return cameraPositionG;
        }
        return aaetVar.f(cameraPositionG, f5, new aadu(f, f2), this.b);
    }

    @Override // defpackage.aadp
    public final CameraPosition d() {
        return null;
    }

    @Override // defpackage.aadp
    public final zro e() {
        return null;
    }

    @Override // defpackage.aadp
    public final synchronized boolean h() {
        return !this.c;
    }

    @Override // defpackage.aadp
    public final boolean i() {
        return true;
    }

    @Override // defpackage.aadp
    public final synchronized boolean j(CameraPosition cameraPosition, aaet aaetVar) {
        return true;
    }

    public final synchronized String toString() {
        zsa zsaVarA;
        zsaVarA = zsa.a(this);
        zsaVarA.g("isOngoing", this.c);
        zsaVarA.d("totalZoomBy", this.d);
        zsaVarA.d("totalRotateBy", this.e);
        zsaVarA.d("totalDeltaX", this.f);
        zsaVarA.d("totalDeltaY", this.g);
        zsaVarA.d("x", this.h);
        zsaVarA.d("y", this.i);
        zsaVarA.e("animationReason", 1);
        return zsaVarA.toString();
    }

    @Override // defpackage.aadp
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.aadp
    public final void g(boolean z) {
    }
}
