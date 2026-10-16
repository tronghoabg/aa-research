package defpackage;

/* loaded from: classes3.dex */
public final class tqz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final xxh h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    private final boolean n;

    public tqz(xxh xxhVar) {
        this.n = true;
        this.a = true;
        this.m = 3;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = -1L;
        this.g = 131072L;
        this.h = xxhVar;
        this.i = true;
        this.j = 64;
        this.k = 60;
        this.l = 15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqz) {
            tqz tqzVar = (tqz) obj;
            if (this.n == tqzVar.n && this.a == tqzVar.a) {
                int i = this.m;
                int i2 = tqzVar.m;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b == tqzVar.b && this.c == tqzVar.c && this.d == tqzVar.d && this.e == tqzVar.e && this.f == tqzVar.f && this.g == tqzVar.g && this.h.equals(tqzVar.h) && this.i == tqzVar.i && this.j == tqzVar.j && this.k == tqzVar.k && this.l == tqzVar.l) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.m;
        a.aW(i);
        int i2 = ((((((((((((((((i ^ (((((((((((((((((((((((((((((((true != this.n ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237;
        int i3 = true != this.c ? 1237 : 1231;
        int i4 = i2 * 1000003;
        int i5 = true != this.d ? 1237 : 1231;
        int i6 = (i4 ^ i3) * 1000003;
        int i7 = true != this.e ? 1237 : 1231;
        long j = this.f;
        return ((((((((((((((((((((((((((((((((((((this.l ^ ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i6 ^ i5) * 1000003) ^ i7) * 1000003) ^ 1237) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ ((int) this.g)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.j) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.k) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        int i = this.m;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        String strValueOf = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.a);
        sb.append(", false, false, false, false, false, false, false, false, false, false, false, false, false, ");
        sb.append(string);
        sb.append(", false, false, ");
        sb.append(this.b);
        sb.append(", false, false, false, false, false, ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        boolean z = this.i;
        long j = this.g;
        long j2 = this.f;
        sb.append(", false, ");
        sb.append(j2);
        sb.append(", false, false, ");
        sb.append(j);
        sb.append(", false, false, false, false, ");
        sb.append(strValueOf);
        sb.append(", false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, ");
        sb.append(z);
        int i2 = this.l;
        int i3 = this.k;
        int i4 = this.j;
        sb.append(", false, false, false, false, false, false, false, ");
        sb.append(i4);
        sb.append(", false, false, false, ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}");
        return sb.toString();
    }

    public tqz() {
        throw null;
    }
}
