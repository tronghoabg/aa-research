package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bsw extends bsl<bsx> {
    private final afdr a;
    private final afdr b;
    private final afdr c;
    private final afdr d;
    private final long f;
    private final long g;
    private final cmg h;
    private final cmg i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;

    public bsw(afdr afdrVar, afdr afdrVar2, afdr afdrVar3, afdr afdrVar4, long j, long j2, cmg cmgVar, cmg cmgVar2, float f, float f2, float f3, float f4) {
        this.a = afdrVar;
        this.b = afdrVar2;
        this.c = afdrVar3;
        this.d = afdrVar4;
        this.f = j;
        this.g = j2;
        this.h = cmgVar;
        this.i = cmgVar2;
        this.j = f;
        this.k = f2;
        this.l = f3;
        this.m = f4;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bsx(this.a, this.b, this.c, this.d, this.m, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    @Override // defpackage.bsl, defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bsx bsxVar = (bsx) cfxVar;
        super.m(bsxVar);
        bsxVar.k = this.a;
        bsxVar.l = this.b;
        bsxVar.m = this.c;
        bsxVar.n = this.d;
        float f = bsxVar.o;
        float f2 = this.m;
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f == f2) {
            return;
        }
        bsxVar.o = f2;
        bsxVar.d();
    }

    @Override // defpackage.bsl
    public final boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof bsw) && this.m == ((bsw) obj).m;
    }

    @Override // defpackage.bsl
    public final float f() {
        return this.j;
    }

    @Override // defpackage.bsl
    public final float g() {
        return this.l;
    }

    @Override // defpackage.bsl
    public final float h() {
        return this.k;
    }

    @Override // defpackage.bsl
    public final int hashCode() {
        return (super.hashCode() * 31) + Float.floatToIntBits(this.m);
    }

    @Override // defpackage.bsl
    public final long i() {
        return this.f;
    }

    @Override // defpackage.bsl
    public final long j() {
        return this.g;
    }

    @Override // defpackage.bsl
    public final cmg k() {
        return this.h;
    }

    @Override // defpackage.bsl
    public final cmg l() {
        return this.i;
    }
}
