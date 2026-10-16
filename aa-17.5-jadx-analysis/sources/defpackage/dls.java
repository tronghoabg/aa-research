package defpackage;

/* loaded from: classes.dex */
final class dls implements dlw {
    private final float a;

    public dls(float f) {
        this.a = f;
    }

    @Override // defpackage.dlw
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.dlw
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dls) && Float.compare(this.a, ((dls) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ")";
    }
}
