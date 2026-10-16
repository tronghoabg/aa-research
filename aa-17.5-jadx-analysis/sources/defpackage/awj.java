package defpackage;

/* loaded from: classes.dex */
public final class awj extends cxt<awk> {
    private final float a;
    private final float b;

    public awj(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new awk(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        awk awkVar = (awk) cfxVar;
        awkVar.a = this.a;
        awkVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof awj)) {
            return false;
        }
        awj awjVar = (awj) obj;
        return Float.compare(this.a, awjVar.a) == 0 && Float.compare(this.b, awjVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
