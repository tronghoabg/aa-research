package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gnt {
    public final int a;
    public final int b;

    public gnt(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.gnt) {
            defpackage.gnt gntVar = (defpackage.gnt) obj;
            if (this.a == gntVar.a && this.b == gntVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "ContentLimitQuery{contentLimitType=" + this.a + ", contentLimitValue=" + this.b + "}";
    }

    public gnt() {
        throw null;
    }
}
