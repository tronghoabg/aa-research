package defpackage;

/* loaded from: classes2.dex */
final class kgz {
    private final long a;
    private final long b;
    private final long c;

    public kgz(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kgz) {
            kgz kgzVar = (kgz) obj;
            if (this.a == kgzVar.a && this.b == kgzVar.b && this.c == kgzVar.c) {
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

    public final String toString() {
        return "CalendarReminderId{calendarId=" + this.a + ", eventId=" + this.b + ", alarmTime=" + this.c + "}";
    }

    public kgz() {
        throw null;
    }
}
