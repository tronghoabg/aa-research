package defpackage;

import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class aadx implements aadp {
    private static final String a = "aadx";
    private float b;
    private float c;
    private long d;
    private boolean e;

    public aadx(float f, float f2) {
        synchronized (this) {
            this.b = f * (-0.001f);
            this.c = f2 * (-0.001f);
            this.d = 0L;
            this.e = false;
        }
    }

    @Override // defpackage.aadp
    public final int a() {
        return 1;
    }

    @Override // defpackage.aadp
    public final synchronized CameraPosition c(aaet aaetVar, long j) {
        if (h()) {
            return null;
        }
        if (!this.e) {
            this.d = j;
            this.e = true;
            return null;
        }
        long j2 = j - this.d;
        this.d = j;
        float fExp = (float) Math.exp((-j2) * 0.006f);
        float f = this.b;
        float f2 = (1.0f - fExp) / 0.006f;
        float f3 = f * f2;
        float f4 = this.c;
        float f5 = f2 * f4;
        this.b = f * fExp;
        this.c = f4 * fExp;
        CameraPosition cameraPositionG = aaetVar.g();
        LatLng latLngI = aaetVar.i(f3, f5, false);
        if (latLngI != null) {
            CameraPosition.Builder builder = CameraPosition.builder(cameraPositionG);
            builder.target(latLngI);
            return builder.build();
        }
        String str = a;
        if (zrn.e(str, 3)) {
            Log.d(str, "Failed to raycast [" + f3 + "," + f5 + "] for " + String.valueOf(aaetVar));
        }
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = BitmapDescriptorFactory.HUE_RED;
        return null;
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
        if (Math.abs(this.b) < 0.15f) {
            if (Math.abs(this.c) < 0.15f) {
                return true;
            }
        }
        return false;
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
        zsaVarA.d("velocityX", this.b);
        zsaVarA.d("velocityY", this.c);
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
