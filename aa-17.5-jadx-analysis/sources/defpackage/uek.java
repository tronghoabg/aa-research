package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class uek {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;

    public uek(int i, int i2, int i3, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uek) {
            uek uekVar = (uek) obj;
            if (this.a == uekVar.a && this.b == uekVar.b && this.c == uekVar.c && this.d == uekVar.d && this.e == uekVar.e) {
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

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }

    public uek() {
        throw null;
    }
}
