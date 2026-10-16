package defpackage;

/* loaded from: classes3.dex */
public final class tnv {
    public final xyc a;
    public final boolean b;
    public final boolean c;
    public final vky d;
    public final int e;
    public final tmo f;
    private final boolean g;
    private final int h;

    public tnv(xyc xycVar, int i, tmo tmoVar, boolean z, boolean z2, boolean z3, vky vkyVar) {
        this.a = xycVar;
        this.h = 1;
        this.e = i;
        this.f = tmoVar;
        this.b = z;
        this.g = z2;
        this.c = z3;
        this.d = vkyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tnv) {
            tnv tnvVar = (tnv) obj;
            if (this.a.equals(tnvVar.a)) {
                int i = this.h;
                int i2 = tnvVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    int i3 = this.e;
                    int i4 = tnvVar.e;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.f.equals(tnvVar.f) && this.b == tnvVar.b && this.g == tnvVar.g && this.c == tnvVar.c && this.d.equals(tnvVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        a.aJ(this.h);
        int i = this.e;
        a.aW(i);
        return (((((((((((((((iHashCode * 1000003) ^ 1) * 1000003) ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.h;
        String strValueOf = String.valueOf(this.a);
        String str = i != 1 ? "null" : "DEFAULT";
        int i2 = this.e;
        tmo tmoVar = this.f;
        boolean z = this.b;
        boolean z2 = this.g;
        boolean z3 = this.c;
        vky vkyVar = this.d;
        return "{" + strValueOf + ", " + str + ", " + tmo.r(i2) + ", " + String.valueOf(tmoVar) + ", " + z + ", " + z2 + ", false, " + z3 + ", " + String.valueOf(vkyVar) + "}";
    }

    public tnv() {
        throw null;
    }
}
