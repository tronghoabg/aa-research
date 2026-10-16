package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class weg {
    public final defpackage.wcd a;
    public final defpackage.weh b;

    public weg(defpackage.wcd wcdVar, defpackage.weh wehVar) {
        this.a = wcdVar;
        this.b = wehVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.weg) {
            defpackage.weg wegVar = (defpackage.weg) obj;
            defpackage.wcd wcdVar = this.a;
            if (wcdVar != null ? wcdVar.equals(wegVar.a) : wegVar.a == null) {
                if (this.b.equals(wegVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.wcd wcdVar = this.a;
        return this.b.hashCode() ^ (((wcdVar == null ? 0 : wcdVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.weh wehVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + java.lang.String.valueOf(this.a) + ", snapshotResult=" + wehVar.toString() + "}";
    }

    public weg() {
        throw null;
    }
}
