package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class knb {
    public final UUID a;
    public final AtomicInteger b;
    public final long c;

    public knb(UUID uuid, AtomicInteger atomicInteger, long j) {
        if (uuid == null) {
            throw new NullPointerException("Null driveId");
        }
        this.a = uuid;
        this.b = atomicInteger;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof knb) {
            knb knbVar = (knb) obj;
            if (this.a.equals(knbVar.a) && this.b.equals(knbVar.b) && this.c == knbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        AtomicInteger atomicInteger = this.b;
        return "SessionInfo{driveId=" + this.a.toString() + ", eventIndex=" + atomicInteger.toString() + ", startTimeMillis=" + this.c + "}";
    }

    public knb() {
        throw null;
    }
}
