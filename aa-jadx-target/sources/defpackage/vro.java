package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vro {
    public final boolean a;
    private final defpackage.ygw b;

    public vro(boolean z, defpackage.ygw ygwVar) {
        this.a = z;
        if (ygwVar == null) {
            throw new java.lang.NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = ygwVar;
    }

    public final defpackage.ygw a() {
        if (this.a) {
            return this.b;
        }
        throw new java.lang.IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vro) {
            defpackage.vro vroVar = (defpackage.vro) obj;
            if (this.a == vroVar.a && defpackage.ysr.W(this.b, vroVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }

    public vro() {
        throw null;
    }
}
