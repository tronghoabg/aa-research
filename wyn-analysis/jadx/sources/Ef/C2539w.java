package ef;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2539w implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f34688a;

    public /* synthetic */ C2539w(long j8) {
        this.f34688a = j8;
    }

    public static int a(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j8 = ((C2539w) obj).f34688a;
        long j10 = this.f34688a ^ Long.MIN_VALUE;
        long j11 = j8 ^ Long.MIN_VALUE;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2539w) {
            return this.f34688a == ((C2539w) obj).f34688a;
        }
        return false;
    }

    public final int hashCode() {
        return a(this.f34688a);
    }

    public final String toString() {
        long j8 = this.f34688a;
        if (j8 >= 0) {
            tg.b.t(10);
            String string = Long.toString(j8, 10);
            AbstractC3340k.d(string, "toString(...)");
            return string;
        }
        long j10 = 10;
        long j11 = ((j8 >>> 1) / j10) << 1;
        long j12 = j8 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        tg.b.t(10);
        String string2 = Long.toString(j11, 10);
        AbstractC3340k.d(string2, "toString(...)");
        tg.b.t(10);
        String string3 = Long.toString(j12, 10);
        AbstractC3340k.d(string3, "toString(...)");
        return string2.concat(string3);
    }
}
