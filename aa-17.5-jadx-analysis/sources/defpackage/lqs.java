package defpackage;

/* loaded from: classes2.dex */
public final class lqs {
    public final lqi a;
    public final boolean b;

    public lqs(lqi lqiVar, boolean z) {
        if (lqiVar == null) {
            throw new NullPointerException("Null mediaConnectionInfo");
        }
        this.a = lqiVar;
        this.b = z;
    }

    public final boolean a() {
        return this.a.a == lok.b && !this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqs) {
            lqs lqsVar = (lqs) obj;
            if (this.a.equals(lqsVar.a) && this.b == lqsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "MediaAndCallInfo{mediaConnectionInfo=" + this.a.toString() + ", hasActiveCall=" + this.b + "}";
    }

    public lqs() {
        throw null;
    }
}
