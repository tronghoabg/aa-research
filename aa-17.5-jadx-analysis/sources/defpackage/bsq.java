package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bsq extends bsl<bsr> {
    private final afdr a;
    private final afec b;
    private final long c;
    private final long d;
    private final cmg f;
    private final cmg g;
    private final float h;
    private final float i;
    private final float j;

    public bsq(afdr afdrVar, afec afecVar, long j, long j2, cmg cmgVar, cmg cmgVar2, float f, float f2, float f3) {
        this.a = afdrVar;
        this.b = afecVar;
        this.c = j;
        this.d = j2;
        this.f = cmgVar;
        this.g = cmgVar2;
        this.h = f;
        this.i = f2;
        this.j = f3;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bsr(this.a, this.b, this.i, this.c, this.d, this.f, this.g, this.h, this.j);
    }

    @Override // defpackage.bsl, defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bsr bsrVar = (bsr) cfxVar;
        super.m(bsrVar);
        float f = bsrVar.m;
        float f2 = this.i;
        if (!dlj.c(f, f2)) {
            bsrVar.m = f2;
            cjn.w(bsrVar.n);
        }
        afdr afdrVar = bsrVar.k;
        afdr afdrVar2 = this.a;
        if (afdrVar == afdrVar2 && bsrVar.l == this.b) {
            return;
        }
        bsrVar.k = afdrVar2;
        bsrVar.l = this.b;
        bsrVar.n.d();
    }

    @Override // defpackage.bsl
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof bsq)) {
            return false;
        }
        bsq bsqVar = (bsq) obj;
        return dlj.c(this.i, bsqVar.i) && this.a == bsqVar.a && this.b == bsqVar.b;
    }

    @Override // defpackage.bsl
    public final float f() {
        return this.h;
    }

    @Override // defpackage.bsl
    public final float g() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.bsl
    public final float h() {
        return this.j;
    }

    @Override // defpackage.bsl
    public final int hashCode() {
        return (((((super.hashCode() * 31) + Float.floatToIntBits(this.i)) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    @Override // defpackage.bsl
    public final long i() {
        return this.c;
    }

    @Override // defpackage.bsl
    public final long j() {
        return this.d;
    }

    @Override // defpackage.bsl
    public final cmg k() {
        return this.f;
    }

    @Override // defpackage.bsl
    public final cmg l() {
        return this.g;
    }
}
