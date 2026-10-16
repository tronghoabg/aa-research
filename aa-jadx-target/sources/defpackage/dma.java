package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dma implements defpackage.dme {
    private final float a;

    public dma(float f) {
        this.a = f;
    }

    @Override // defpackage.dme
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.dme
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.dma) && java.lang.Float.compare(this.a, ((defpackage.dma) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ")";
    }
}
