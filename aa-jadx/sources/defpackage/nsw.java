package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nsw {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final defpackage.row j;

    public nsw(int i, int i2, int i3, int i4, boolean z, boolean z2, defpackage.row rowVar, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.i = i4;
        this.d = z;
        this.e = z2;
        if (rowVar == null) {
            throw new java.lang.NullPointerException("Null carDisplayUiInfo");
        }
        this.j = rowVar;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.nsw) {
            defpackage.nsw nswVar = (defpackage.nsw) obj;
            if (this.a == nswVar.a && this.b == nswVar.b && this.c == nswVar.c && this.i == nswVar.i && this.d == nswVar.d && this.e == nswVar.e && this.j.equals(nswVar.j) && this.f == nswVar.f && this.g == nswVar.g && this.h == nswVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((true != this.e ? 1237 : 1231) ^ (((true != this.d ? 1237 : 1231) ^ ((this.i ^ ((this.c ^ ((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003)) * 1000003)) * 1000003)) * 1000003)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        int i = this.i;
        defpackage.row rowVar = this.j;
        return "LayoutInfo{layoutResourceId=" + this.a + ", displayWidthDp=" + this.b + ", displayHeightDp=" + this.c + ", layoutType=" + java.lang.Integer.toString(i - 1) + ", isRightHandDrive=" + this.d + ", hasVerticalRail=" + this.e + ", carDisplayUiInfo=" + java.lang.String.valueOf(rowVar) + ", isDriverAlignedDashboard=" + this.f + ", isHeroLayout=" + this.g + ", isIrregularDisplay=" + this.h + "}";
    }

    public nsw() {
        throw null;
    }
}
