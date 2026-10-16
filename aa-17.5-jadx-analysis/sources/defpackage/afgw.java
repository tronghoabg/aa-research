package defpackage;

/* loaded from: classes.dex */
public final class afgw implements afgx {
    private final float a;
    private final float b;

    public afgw(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* bridge */ /* synthetic */ boolean e(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.a && fFloatValue <= this.b;
    }

    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.afgx
    public final /* bridge */ /* synthetic */ Comparable c() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.afgx
    public final /* bridge */ /* synthetic */ Comparable d() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afgw) {
            if (b() && ((afgw) obj).b()) {
                return true;
            }
            afgw afgwVar = (afgw) obj;
            return this.a == afgwVar.a && this.b == afgwVar.b;
        }
        return false;
    }

    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
