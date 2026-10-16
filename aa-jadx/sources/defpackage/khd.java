package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class khd {
    private final long a;
    private final long b;
    private final long c;

    public khd(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.khd) {
            defpackage.khd khdVar = (defpackage.khd) obj;
            if (this.a == khdVar.a && this.b == khdVar.b && this.c == khdVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((i ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final java.lang.String toString() {
        return "CalendarReminderId{calendarId=" + this.a + ", eventId=" + this.b + ", alarmTime=" + this.c + "}";
    }

    public khd() {
        throw null;
    }
}
