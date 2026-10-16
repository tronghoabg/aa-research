package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaeo implements aadp {
    private final float a;
    private final int b = 1;

    public aaeo(float f) {
        this.a = f;
    }

    @Override // defpackage.aadp
    public final int a() {
        return 1;
    }

    @Override // defpackage.aadp
    @ResultIgnorabilityUnspecified
    public final CameraPosition c(aaet aaetVar, long j) {
        CameraPosition cameraPositionG = aaetVar.g();
        float fMax = Math.max(Math.min(cameraPositionG.tilt + this.a, 90.0f), BitmapDescriptorFactory.HUE_RED);
        CameraPosition.Builder builder = CameraPosition.builder(cameraPositionG);
        builder.tilt(fMax);
        return builder.build();
    }

    @Override // defpackage.aadp
    public final CameraPosition d() {
        return null;
    }

    @Override // defpackage.aadp
    public final zro e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaeo)) {
            return false;
        }
        aaeo aaeoVar = (aaeo) obj;
        if (this.a != aaeoVar.a) {
            return false;
        }
        int i = aaeoVar.b;
        return true;
    }

    @Override // defpackage.aadp
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), 1});
    }

    @Override // defpackage.aadp
    public final boolean i() {
        return true;
    }

    @Override // defpackage.aadp
    public final boolean j(CameraPosition cameraPosition, aaet aaetVar) {
        return true;
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.d("tiltByDeg", this.a);
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
