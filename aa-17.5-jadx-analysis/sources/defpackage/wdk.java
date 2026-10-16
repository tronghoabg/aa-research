package defpackage;

/* loaded from: classes.dex */
final class wdk {
    public final wbh a;
    public final wdl b;

    public wdk(wbh wbhVar, wdl wdlVar) {
        this.a = wbhVar;
        this.b = wdlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wdk) {
            wdk wdkVar = (wdk) obj;
            wbh wbhVar = this.a;
            if (wbhVar != null ? wbhVar.equals(wdkVar.a) : wdkVar.a == null) {
                if (this.b.equals(wdkVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        wbh wbhVar = this.a;
        return this.b.hashCode() ^ (((wbhVar == null ? 0 : wbhVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        wdl wdlVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + wdlVar.toString() + "}";
    }

    public wdk() {
        throw null;
    }
}
