package defpackage;

/* loaded from: classes2.dex */
public final class hfi {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public hfi(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfi)) {
            return false;
        }
        hfi hfiVar = (hfi) obj;
        return this.a == hfiVar.a && this.b == hfiVar.b && this.c == hfiVar.c && this.d == hfiVar.d;
    }

    public final int hashCode() {
        int iF = a.f(this.a);
        boolean z = this.d;
        return (((((iF * 31) + a.f(this.b)) * 31) + a.f(this.c)) * 31) + a.f(z);
    }

    public final String toString() {
        return "ContentPresence(hasPrimary=" + this.a + ", hasTopStart=" + this.b + ", hasTopEnd=" + this.c + ", hasBottomStart=" + this.d + ")";
    }
}
