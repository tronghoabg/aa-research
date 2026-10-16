package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rrq {
    public final defpackage.zaj a;
    public final defpackage.zak b;
    public final defpackage.xyn c;
    private final defpackage.xyn d;

    public rrq(defpackage.zaj zajVar, defpackage.zak zakVar, defpackage.xyn xynVar, defpackage.xyn xynVar2) {
        this.a = zajVar;
        this.b = zakVar;
        this.c = xynVar;
        this.d = xynVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rrq) {
            defpackage.rrq rrqVar = (defpackage.rrq) obj;
            if (this.a.equals(rrqVar.a) && this.b.equals(rrqVar.b) && this.c.equals(rrqVar.c) && this.d.equals(rrqVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return ((this.c.hashCode() ^ (iHashCode * 1000003)) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        defpackage.xyn xynVar = this.d;
        defpackage.xyn xynVar2 = this.c;
        defpackage.zak zakVar = this.b;
        return "ProjectionErrorLogEvent{errorCode=" + java.lang.String.valueOf(this.a) + ", errorDetail=" + java.lang.String.valueOf(zakVar) + ", timeElapsedSinceLastConnectMillis=" + java.lang.String.valueOf(xynVar2) + ", timeElapsedSinceLastDisconnectMillis=" + java.lang.String.valueOf(xynVar) + "}";
    }

    protected rrq() {
        throw null;
    }
}
