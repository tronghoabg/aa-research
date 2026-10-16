package zf;

import java.util.Iterator;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class i implements Iterable, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final long f48512a;

    /* renamed from: b, reason: collision with root package name */
    public final long f48513b;

    /* renamed from: c, reason: collision with root package name */
    public final long f48514c;

    public i(long j8, long j10) {
        this.f48512a = j8;
        if (j8 < j10) {
            long j11 = j10 % 1;
            long j12 = j8 % 1;
            long j13 = ((j11 < 0 ? j11 + 1 : j11) - (j12 < 0 ? j12 + 1 : j12)) % 1;
            j10 -= j13 < 0 ? j13 + 1 : j13;
        }
        this.f48513b = j10;
        this.f48514c = 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (isEmpty() && ((i) obj).isEmpty()) {
            return true;
        }
        i iVar = (i) obj;
        if (this.f48512a == iVar.f48512a) {
            return this.f48513b == iVar.f48513b;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j8 = this.f48512a;
        long j10 = 31 * (j8 ^ (j8 >>> 32));
        long j11 = this.f48513b;
        return (int) (j10 + (j11 ^ (j11 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.f48512a > this.f48513b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this.f48512a, this.f48513b, this.f48514c);
    }

    public final String toString() {
        return this.f48512a + ".." + this.f48513b;
    }
}
