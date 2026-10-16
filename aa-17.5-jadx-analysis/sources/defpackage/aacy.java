package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aacy implements aadp, aadq {
    private final aadp a;
    private final aael b;

    public aacy(aadp aadpVar, veb vebVar) {
        this.a = aadpVar;
        this.b = new aael(vebVar);
    }

    @Override // defpackage.aadp
    public final int a() {
        return this.a.a();
    }

    public final veb b() {
        return this.b.a;
    }

    @Override // defpackage.aadp
    public final CameraPosition c(aaet aaetVar, long j) {
        return this.a.c(aaetVar, j);
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
        if (!(obj instanceof aacy)) {
            return false;
        }
        aacy aacyVar = (aacy) obj;
        return a.C(this.a, aacyVar.a) && a.C(b(), aacyVar.b());
    }

    @Override // defpackage.aadq
    public final aadp f() {
        return this.a;
    }

    @Override // defpackage.aadp
    public final void g(boolean z) {
        this.a.g(z);
        aael aaelVar = this.b;
        if (z) {
            aaelVar.a();
        } else {
            aaelVar.b();
        }
    }

    @Override // defpackage.aadp
    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // defpackage.aadp
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.aadp
    public final boolean j(CameraPosition cameraPosition, aaet aaetVar) {
        return this.a.j(cameraPosition, aaetVar);
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("animation", this.a);
        zsaVarA.b("callback", b());
        return zsaVarA.toString();
    }

    @Override // defpackage.aadp
    public final /* synthetic */ void k() {
    }
}
