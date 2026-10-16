package defpackage;

/* loaded from: classes2.dex */
final class hde {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public /* synthetic */ hde(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.a = 1 == (i & 1) ? 0.0f : f;
        this.b = (i & 2) != 0 ? 0.0f : f2;
        this.c = (i & 4) != 0 ? 0.0f : f3;
        this.d = (i & 8) != 0 ? 0.0f : f4;
        this.e = (i & 16) != 0 ? 0.0f : f5;
        this.f = (i & 32) != 0 ? 0.0f : f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hde)) {
            return false;
        }
        hde hdeVar = (hde) obj;
        return dlj.c(this.a, hdeVar.a) && dlj.c(this.b, hdeVar.b) && dlj.c(this.c, hdeVar.c) && dlj.c(this.d, hdeVar.d) && dlj.c(this.e, hdeVar.e) && dlj.c(this.f, hdeVar.f);
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        float f5 = this.b;
        return "RowLayoutPadding(columnHorizontalPadding=" + dlj.b(this.a) + ", columnPaddingTop=" + dlj.b(f5) + ", columnPaddingBottom=" + dlj.b(f4) + ", upperRowPaddingEnd=" + dlj.b(f3) + ", rowBelowHorizontalPadding=" + dlj.b(f2) + ", trailingItemVerticalPadding=" + dlj.b(f) + ")";
    }
}
