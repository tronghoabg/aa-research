package defpackage;

/* loaded from: classes.dex */
public final class awc extends cxt<awe> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final boolean f;

    public awc(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = z;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new awe(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        awe aweVar = (awe) cfxVar;
        aweVar.a = this.a;
        aweVar.b = this.b;
        aweVar.c = this.c;
        aweVar.d = this.d;
        aweVar.e = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awc)) {
            return false;
        }
        awc awcVar = (awc) obj;
        return Float.compare(this.a, awcVar.a) == 0 && Float.compare(this.b, awcVar.b) == 0 && Float.compare(this.c, awcVar.c) == 0 && Float.compare(this.d, awcVar.d) == 0 && this.f == awcVar.f;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + (true != this.f ? 1237 : 1231);
    }
}
