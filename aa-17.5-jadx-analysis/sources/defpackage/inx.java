package defpackage;

/* loaded from: classes2.dex */
public final class inx {
    public final long a;
    public final xke b;
    public final int c;
    public final int d;

    public inx(long j, xke xkeVar, int i, int i2) {
        this.a = j;
        if (xkeVar == null) {
            throw new NullPointerException("Null key");
        }
        this.b = xkeVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof inx) {
            inx inxVar = (inx) obj;
            if (this.a == inxVar.a && this.b.equals(inxVar.b) && this.c == inxVar.c && this.d == inxVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.d ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "SearchKeyCodeArgs{timestamp=" + this.a + ", key=" + this.b.toString() + ", flags=" + this.c + ", repeatCount=" + this.d + "}";
    }

    protected inx() {
        throw null;
    }
}
