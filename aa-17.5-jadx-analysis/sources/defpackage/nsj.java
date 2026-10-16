package defpackage;

/* loaded from: classes.dex */
final class nsj {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final lds j;

    public nsj(int i, int i2, int i3, int i4, boolean z, boolean z2, lds ldsVar, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.i = i4;
        this.d = z;
        this.e = z2;
        if (ldsVar == null) {
            throw new NullPointerException("Null carDisplayUiInfo");
        }
        this.j = ldsVar;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nsj) {
            nsj nsjVar = (nsj) obj;
            if (this.a == nsjVar.a && this.b == nsjVar.b && this.c == nsjVar.c && this.i == nsjVar.i && this.d == nsjVar.d && this.e == nsjVar.e && this.j.equals(nsjVar.j) && this.f == nsjVar.f && this.g == nsjVar.g && this.h == nsjVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((true != this.e ? 1237 : 1231) ^ (((true != this.d ? 1237 : 1231) ^ ((this.i ^ ((this.c ^ ((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003)) * 1000003)) * 1000003)) * 1000003)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.i;
        lds ldsVar = this.j;
        return "LayoutInfo{layoutResourceId=" + this.a + ", displayWidthDp=" + this.b + ", displayHeightDp=" + this.c + ", layoutType=" + Integer.toString(i - 1) + ", isRightHandDrive=" + this.d + ", hasVerticalRail=" + this.e + ", carDisplayUiInfo=" + String.valueOf(ldsVar) + ", isDriverAlignedDashboard=" + this.f + ", isHeroLayout=" + this.g + ", isIrregularDisplay=" + this.h + "}";
    }

    public nsj() {
        throw null;
    }
}
