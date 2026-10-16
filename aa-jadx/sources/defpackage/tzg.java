package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class tzg {
    public final android.graphics.Bitmap a;
    public final defpackage.utc b;

    public tzg(android.graphics.Bitmap bitmap, defpackage.utc utcVar) {
        bitmap.getClass();
        this.a = bitmap;
        this.b = utcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tzg) {
            defpackage.tzg tzgVar = (defpackage.tzg) obj;
            if (this.a.equals(tzgVar.a) && this.b.equals(tzgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.utc utcVar = this.b;
        return "{" + this.a.toString() + ", " + utcVar.toString() + "}";
    }

    public tzg() {
        throw null;
    }
}
