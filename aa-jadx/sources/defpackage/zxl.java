package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zxl {
    public final boolean a;

    public zxl(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof defpackage.zxl) && this.a == ((defpackage.zxl) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "UpdateTracker{backgroundColorUpdated=" + this.a + "}";
    }

    public zxl() {
        throw null;
    }
}
