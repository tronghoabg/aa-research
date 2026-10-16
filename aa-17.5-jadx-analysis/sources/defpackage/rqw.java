package defpackage;

/* loaded from: classes2.dex */
public final class rqw {
    public final yze a;
    public final yzf b;
    public final xxh c;
    private final xxh d;

    public rqw(yze yzeVar, yzf yzfVar, xxh xxhVar, xxh xxhVar2) {
        this.a = yzeVar;
        this.b = yzfVar;
        this.c = xxhVar;
        this.d = xxhVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqw) {
            rqw rqwVar = (rqw) obj;
            if (this.a.equals(rqwVar.a) && this.b.equals(rqwVar.b) && this.c.equals(rqwVar.c) && this.d.equals(rqwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return ((this.c.hashCode() ^ (iHashCode * 1000003)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        xxh xxhVar = this.d;
        xxh xxhVar2 = this.c;
        yzf yzfVar = this.b;
        return "ProjectionErrorLogEvent{errorCode=" + String.valueOf(this.a) + ", errorDetail=" + String.valueOf(yzfVar) + ", timeElapsedSinceLastConnectMillis=" + String.valueOf(xxhVar2) + ", timeElapsedSinceLastDisconnectMillis=" + String.valueOf(xxhVar) + "}";
    }

    protected rqw() {
        throw null;
    }
}
