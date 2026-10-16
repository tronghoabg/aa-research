package defpackage;

/* loaded from: classes.dex */
public final class rxx {
    public final rrz a;
    public final rrz b;
    public final Runnable c;
    private final xyc d;

    public rxx(rrz rrzVar, rrz rrzVar2, xyc xycVar, Runnable runnable) {
        this.a = rrzVar;
        this.b = rrzVar2;
        this.d = xycVar;
        this.c = runnable;
    }

    public final long a() {
        return ((Long) this.d.gu()).longValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rxx) {
            rxx rxxVar = (rxx) obj;
            if (this.a.equals(rxxVar.a) && this.b.equals(rxxVar.b) && this.d.equals(rxxVar.d) && this.c.equals(rxxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Runnable runnable = this.c;
        xyc xycVar = this.d;
        rrz rrzVar = this.b;
        return "UsbIssueInfo{issue=" + this.a.toString() + ", falsePositive=" + rrzVar.toString() + ", timeoutSupplier=" + xycVar.toString() + ", onFailure=" + runnable.toString() + "}";
    }

    public rxx() {
        throw null;
    }
}
