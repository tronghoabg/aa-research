package A5;

import t5.C4113h;
import t5.C4114i;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f350a;

    /* renamed from: b, reason: collision with root package name */
    public final C4114i f351b;

    /* renamed from: c, reason: collision with root package name */
    public final C4113h f352c;

    public b(long j8, C4114i c4114i, C4113h c4113h) {
        this.f350a = j8;
        this.f351b = c4114i;
        this.f352c = c4113h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f350a == bVar.f350a && this.f351b.equals(bVar.f351b) && this.f352c.equals(bVar.f352c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f350a;
        return ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f351b.hashCode()) * 1000003) ^ this.f352c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f350a + ", transportContext=" + this.f351b + ", event=" + this.f352c + "}";
    }
}
