package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afhw implements defpackage.afhx {
    private final float a;
    private final float b;

    public afhw(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* bridge */ /* synthetic */ boolean e(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return ((java.lang.Number) comparable).floatValue() <= ((java.lang.Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Comparable comparable) {
        float fFloatValue = ((java.lang.Number) comparable).floatValue();
        return fFloatValue >= this.a && fFloatValue <= this.b;
    }

    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.afhx
    public final /* bridge */ /* synthetic */ java.lang.Comparable c() {
        return java.lang.Float.valueOf(this.b);
    }

    @Override // defpackage.afhx
    public final /* bridge */ /* synthetic */ java.lang.Comparable d() {
        return java.lang.Float.valueOf(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.afhw) {
            if (b() && ((defpackage.afhw) obj).b()) {
                return true;
            }
            defpackage.afhw afhwVar = (defpackage.afhw) obj;
            return this.a == afhwVar.a && this.b == afhwVar.b;
        }
        return false;
    }

    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return this.a + ".." + this.b;
    }
}
