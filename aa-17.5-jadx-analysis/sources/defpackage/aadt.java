package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aadt implements aadp, aadq {
    public final aadp a;
    private volatile boolean b = false;

    public aadt(aadp aadpVar) {
        this.a = aadpVar;
    }

    @Override // defpackage.aadp
    public final int a() {
        return this.a.a();
    }

    public final void b() {
        this.b = true;
    }

    @Override // defpackage.aadp
    public final CameraPosition c(aaet aaetVar, long j) {
        CameraPosition cameraPositionC = this.a.c(aaetVar, j);
        if (this.b) {
            return null;
        }
        return cameraPositionC;
    }

    @Override // defpackage.aadp
    public final CameraPosition d() {
        return this.a.d();
    }

    @Override // defpackage.aadp
    public final zro e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aadt)) {
            return false;
        }
        aadt aadtVar = (aadt) obj;
        return a.C(this.a, aadtVar.a) && a.C(Boolean.valueOf(this.b), Boolean.valueOf(aadtVar.b));
    }

    @Override // defpackage.aadq
    public final aadp f() {
        return this.a;
    }

    @Override // defpackage.aadp
    public final void g(boolean z) {
        this.a.g(z);
    }

    @Override // defpackage.aadp
    public final boolean h() {
        return this.b || this.a.h();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // defpackage.aadp
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.aadp
    public final boolean j(CameraPosition cameraPosition, aaet aaetVar) {
        if (this.b) {
            return false;
        }
        return this.a.j(cameraPosition, aaetVar);
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("animation", this.a);
        zsaVarA.g("isCancelled", this.b);
        return zsaVarA.toString();
    }

    @Override // defpackage.aadp
    public final /* synthetic */ void k() {
    }
}
