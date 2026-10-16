package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kni {
    public final java.util.UUID a;
    public final java.util.concurrent.atomic.AtomicInteger b;
    public final long c;

    public kni(java.util.UUID uuid, java.util.concurrent.atomic.AtomicInteger atomicInteger, long j) {
        if (uuid == null) {
            throw new java.lang.NullPointerException("Null driveId");
        }
        this.a = uuid;
        this.b = atomicInteger;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kni) {
            defpackage.kni kniVar = (defpackage.kni) obj;
            if (this.a.equals(kniVar.a) && this.b.equals(kniVar.b) && this.c == kniVar.c) {
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

    public final java.lang.String toString() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.b;
        return "SessionInfo{driveId=" + this.a.toString() + ", eventIndex=" + atomicInteger.toString() + ", startTimeMillis=" + this.c + "}";
    }

    public kni() {
        throw null;
    }
}
