package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hdp {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public /* synthetic */ hdp(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.a = 1 == (i & 1) ? 0.0f : f;
        this.b = (i & 2) != 0 ? 0.0f : f2;
        this.c = (i & 4) != 0 ? 0.0f : f3;
        this.d = (i & 8) != 0 ? 0.0f : f4;
        this.e = (i & 16) != 0 ? 0.0f : f5;
        this.f = (i & 32) != 0 ? 0.0f : f6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hdp)) {
            return false;
        }
        defpackage.hdp hdpVar = (defpackage.hdp) obj;
        return defpackage.dlr.c(this.a, hdpVar.a) && defpackage.dlr.c(this.b, hdpVar.b) && defpackage.dlr.c(this.c, hdpVar.c) && defpackage.dlr.c(this.d, hdpVar.d) && defpackage.dlr.c(this.e, hdpVar.e) && defpackage.dlr.c(this.f, hdpVar.f);
    }

    public final int hashCode() {
        return (((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final java.lang.String toString() {
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        float f5 = this.b;
        return "RowLayoutPadding(columnHorizontalPadding=" + defpackage.dlr.b(this.a) + ", columnPaddingTop=" + defpackage.dlr.b(f5) + ", columnPaddingBottom=" + defpackage.dlr.b(f4) + ", upperRowPaddingEnd=" + defpackage.dlr.b(f3) + ", rowBelowHorizontalPadding=" + defpackage.dlr.b(f2) + ", trailingItemVerticalPadding=" + defpackage.dlr.b(f) + ")";
    }
}
