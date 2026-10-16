package defpackage;

/* loaded from: classes3.dex */
public final class vpm {
    public final ajgi a;
    public final yfq b;

    public vpm(ajgi ajgiVar, yfq yfqVar) {
        if (ajgiVar == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = ajgiVar;
        if (yfqVar == null) {
            throw new NullPointerException("Null nativeDebugLogs");
        }
        this.b = yfqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vpm) {
            vpm vpmVar = (vpm) obj;
            if (this.a.equals(vpmVar.a) && yrm.W(this.b, vpmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        yfq yfqVar = this.b;
        return "Snapshot{debugLogs=" + this.a.toString() + ", nativeDebugLogs=" + yfqVar.toString() + "}";
    }

    public vpm() {
        throw null;
    }
}
