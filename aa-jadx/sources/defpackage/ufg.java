package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class ufg {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;

    public ufg(int i, int i2, int i3, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ufg) {
            defpackage.ufg ufgVar = (defpackage.ufg) obj;
            if (this.a == ufgVar.a && this.b == ufgVar.b && this.c == ufgVar.c && this.d == ufgVar.d && this.e == ufgVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.e;
        int i = this.a;
        long j2 = j ^ (j >>> 32);
        long j3 = this.d;
        long j4 = j3 ^ (j3 >>> 32);
        return ((((this.c ^ ((((i ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ ((int) j4)) * 1000003) ^ ((int) j2);
    }

    public final java.lang.String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }

    public ufg() {
        throw null;
    }
}
