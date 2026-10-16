package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ryr {
    public final defpackage.rst a;
    public final defpackage.rst b;
    public final java.lang.Runnable c;
    private final defpackage.xzi d;

    public ryr(defpackage.rst rstVar, defpackage.rst rstVar2, defpackage.xzi xziVar, java.lang.Runnable runnable) {
        this.a = rstVar;
        this.b = rstVar2;
        this.d = xziVar;
        this.c = runnable;
    }

    public final long a() {
        return ((java.lang.Long) this.d.fF()).longValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ryr) {
            defpackage.ryr ryrVar = (defpackage.ryr) obj;
            if (this.a.equals(ryrVar.a) && this.b.equals(ryrVar.b) && this.d.equals(ryrVar.d) && this.c.equals(ryrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        java.lang.Runnable runnable = this.c;
        defpackage.xzi xziVar = this.d;
        defpackage.rst rstVar = this.b;
        return "UsbIssueInfo{issue=" + this.a.toString() + ", falsePositive=" + rstVar.toString() + ", timeoutSupplier=" + xziVar.toString() + ", onFailure=" + runnable.toString() + "}";
    }

    public ryr() {
        throw null;
    }
}
