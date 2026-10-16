package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lqx {
    public final defpackage.lqo a;
    public final boolean b;

    public lqx(defpackage.lqo lqoVar, boolean z) {
        if (lqoVar == null) {
            throw new java.lang.NullPointerException("Null mediaConnectionInfo");
        }
        this.a = lqoVar;
        this.b = z;
    }

    public final boolean a() {
        return this.a.a == defpackage.lor.b && !this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lqx) {
            defpackage.lqx lqxVar = (defpackage.lqx) obj;
            if (this.a.equals(lqxVar.a) && this.b == lqxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "MediaAndCallInfo{mediaConnectionInfo=" + this.a.toString() + ", hasActiveCall=" + this.b + "}";
    }

    public lqx() {
        throw null;
    }
}
