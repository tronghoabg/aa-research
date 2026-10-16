package defpackage;

/* loaded from: classes.dex */
final class adq extends cxt<adr> {
    private final float a;
    private final Object b;

    public adq(float f, Object obj) {
        this.a = f;
        this.b = obj;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new adr(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((adr) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adq)) {
            return false;
        }
        adq adqVar = (adq) obj;
        return adqVar.a == this.a && affa.f(adqVar.b, this.b);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        Object obj = this.b;
        return iFloatToIntBits + (obj != null ? obj.hashCode() : 0);
    }
}
