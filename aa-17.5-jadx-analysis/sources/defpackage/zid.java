package defpackage;

/* loaded from: classes3.dex */
public final class zid {
    public final String a;
    public final int b;
    public final int c;

    public zid(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("Null host");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zid) {
            zid zidVar = (zid) obj;
            if (this.a.equals(zidVar.a) && this.b == zidVar.b && this.c == zidVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "QuicHint{host=" + this.a + ", port=" + this.b + ", alternatePort=" + this.c + "}";
    }

    public zid() {
        throw null;
    }
}
