package defpackage;

/* loaded from: classes2.dex */
public final class mbz {
    public final String a;
    public final long b;
    public final nur c;

    public mbz(String str, long j, nur nurVar) {
        if (str == null) {
            throw new NullPointerException("Null tag");
        }
        this.a = str;
        this.b = j;
        this.c = nurVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mbz) {
            mbz mbzVar = (mbz) obj;
            if (this.a.equals(mbzVar.a) && this.b == mbzVar.b && this.c.equals(mbzVar.c)) {
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

    public final String toString() {
        return "NotificationInformation{tag=" + this.a + ", notificationId=" + this.b + ", projectionNotification=" + this.c.toString() + "}";
    }

    public mbz() {
        throw null;
    }
}
