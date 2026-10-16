package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zjf {
    public final java.lang.String a;
    public final int b;
    public final int c;

    public zjf(java.lang.String str, int i, int i2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null host");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zjf) {
            defpackage.zjf zjfVar = (defpackage.zjf) obj;
            if (this.a.equals(zjfVar.a) && this.b == zjfVar.b && this.c == zjfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final java.lang.String toString() {
        return "QuicHint{host=" + this.a + ", port=" + this.b + ", alternatePort=" + this.c + "}";
    }

    public zjf() {
        throw null;
    }
}
