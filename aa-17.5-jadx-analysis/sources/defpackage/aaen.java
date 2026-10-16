package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaen implements aadp {
    private final CameraPosition a;
    private final boolean b;
    private final int d;
    private final boolean c = true;
    private boolean f = false;
    private CameraPosition e = null;

    public aaen(CameraPosition cameraPosition, boolean z, int i) {
        this.a = cameraPosition;
        this.b = z;
        this.d = i;
    }

    @Override // defpackage.aadp
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aadp
    @ResultIgnorabilityUnspecified
    public final CameraPosition c(aaet aaetVar, long j) {
        CameraPosition cameraPositionG = aaetVar.g();
        this.e = cameraPositionG;
        CameraPosition cameraPosition = this.a;
        if (a.C(cameraPositionG, cameraPosition)) {
            this.f = true;
        }
        return cameraPosition;
    }

    @Override // defpackage.aadp
    public final CameraPosition d() {
        return this.a;
    }

    @Override // defpackage.aadp
    public final zro e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaen)) {
            return false;
        }
        aaen aaenVar = (aaen) obj;
        if (a.C(this.a, aaenVar.a) && this.b == aaenVar.b) {
            boolean z = aaenVar.c;
            if (this.d == aaenVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aadp
    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), true, Integer.valueOf(this.d)});
    }

    @Override // defpackage.aadp
    public final boolean i() {
        return this.b;
    }

    @Override // defpackage.aadp
    public final boolean j(CameraPosition cameraPosition, aaet aaetVar) {
        if (a.C(this.e, cameraPosition)) {
            this.f = true;
        }
        return true;
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("destination", this.a);
        zsaVarA.g("isUserGesture", this.b);
        zsaVarA.g("allowClamp", true);
        zsaVarA.e("animationReason", this.d);
        return zsaVarA.toString();
    }

    @Override // defpackage.aadp
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.aadp
    public final void g(boolean z) {
    }
}
