package defpackage;

/* loaded from: classes.dex */
public final class cgc extends cxt<cgd> {
    private final float a;

    public cgc(float f) {
        this.a = f;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cgd(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((cgd) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cgc) && Float.compare(this.a, ((cgc) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=" + this.a + ")";
    }
}
