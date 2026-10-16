package z5;

import java.util.HashMap;
import q5.EnumC3870e;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4616a {

    /* renamed from: a, reason: collision with root package name */
    public final C5.a f48368a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f48369b;

    public C4616a(C5.a aVar, HashMap map) {
        this.f48368a = aVar;
        this.f48369b = map;
    }

    public final long a(EnumC3870e enumC3870e, long j8, int i5) {
        long jC = j8 - this.f48368a.c();
        C4617b c4617b = (C4617b) this.f48369b.get(enumC3870e);
        long j10 = c4617b.f48370a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i5 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r12))), jC), c4617b.f48371b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4616a)) {
            return false;
        }
        C4616a c4616a = (C4616a) obj;
        return this.f48368a.equals(c4616a.f48368a) && this.f48369b.equals(c4616a.f48369b);
    }

    public final int hashCode() {
        return ((this.f48368a.hashCode() ^ 1000003) * 1000003) ^ this.f48369b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f48368a + ", values=" + this.f48369b + "}";
    }
}
