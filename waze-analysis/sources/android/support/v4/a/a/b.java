package android.support.v4.a.a;

import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f76a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f77b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f78c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f79d;

    public /* synthetic */ b(long j2, Integer num, h.g.a.a aVar, int i2) {
        this(j2, num, (i2 & 4) != 0 ? e.c.d.a.p() : null, (i2 & 8) != 0 ? new c(1) : aVar);
    }

    public final Integer a() {
        return this.f77b;
    }

    public final Set b() {
        return this.f78c;
    }

    public final h.g.a.a c() {
        return this.f79d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && this.f76a == ((b) obj).f76a;
    }

    public final int hashCode() {
        return (int) this.f76a;
    }

    public final String toString() {
        return this.f76a + " with alias " + this.f77b;
    }

    public b(long j2, Integer num, Set set, h.g.a.a aVar) {
        x.f(set, "manuallyTestedFingerprints");
        x.f(aVar, "precondition");
        this.f76a = j2;
        this.f77b = num;
        this.f78c = set;
        this.f79d = aVar;
    }
}
