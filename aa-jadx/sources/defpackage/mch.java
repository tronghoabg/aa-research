package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mch {
    public final java.lang.String a;
    public final long b;
    public final defpackage.nvh c;

    public mch(java.lang.String str, long j, defpackage.nvh nvhVar) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null tag");
        }
        this.a = str;
        this.b = j;
        this.c = nvhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mch) {
            defpackage.mch mchVar = (defpackage.mch) obj;
            if (this.a.equals(mchVar.a) && this.b == mchVar.b && this.c.equals(mchVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return this.c.hashCode() ^ (((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final java.lang.String toString() {
        return "NotificationInformation{tag=" + this.a + ", notificationId=" + this.b + ", projectionNotification=" + this.c.toString() + "}";
    }

    public mch() {
        throw null;
    }
}
