package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aadw {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final CameraPosition d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public aadw(aadv aadvVar) {
        boolean z = aadvVar.a;
        boolean z2 = aadvVar.b;
        CameraPosition cameraPosition = aadvVar.c;
        boolean z3 = aadvVar.e;
        boolean z4 = aadvVar.f;
        boolean z5 = aadvVar.g;
        this.a = z;
        this.b = z2;
        this.c = false;
        zkt.n(cameraPosition, "rendererCameraPosition");
        this.d = cameraPosition;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aadw)) {
            return false;
        }
        aadw aadwVar = (aadw) obj;
        if (this.a == aadwVar.a && this.b == aadwVar.b) {
            boolean z = aadwVar.c;
            if (a.C(this.d, aadwVar.d) && this.e == aadwVar.e && this.f == aadwVar.f && this.g == aadwVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), false, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.g("isCameraMoving", this.a);
        zsaVarA.g("isUserGesture", this.b);
        zsaVarA.g("isSceneResolved", false);
        zsaVarA.b("rendererCameraPosition", this.d);
        zsaVarA.g("wasCameraClamped", this.e);
        zsaVarA.g("wasCameraDiscarded", this.f);
        zsaVarA.g("wasAnimationExhausted", this.g);
        return zsaVarA.toString();
    }
}
