package defpackage;

/* loaded from: classes.dex */
public final class vqt {
    public final boolean a;
    private final yfq b;

    public vqt(boolean z, yfq yfqVar) {
        this.a = z;
        if (yfqVar == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = yfqVar;
    }

    public final yfq a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vqt) {
            vqt vqtVar = (vqt) obj;
            if (this.a == vqtVar.a && yrm.W(this.b, vqtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }

    public vqt() {
        throw null;
    }
}
