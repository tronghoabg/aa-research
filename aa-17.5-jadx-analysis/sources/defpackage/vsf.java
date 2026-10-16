package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class vsf {
    public final long a;
    public final long b;

    public vsf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static vsf a(tmb tmbVar) {
        return new vsf(SystemClock.elapsedRealtime(), tmbVar.e().toMillis());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsf) {
            vsf vsfVar = (vsf) obj;
            if (this.a == vsfVar.a && this.b == vsfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + "}";
    }

    public vsf() {
        throw null;
    }
}
