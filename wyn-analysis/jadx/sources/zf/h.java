package zf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class h implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final long f48508a;

    /* renamed from: b, reason: collision with root package name */
    public final long f48509b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f48510c;

    /* renamed from: d, reason: collision with root package name */
    public long f48511d;

    public h(long j8, long j10, long j11) {
        this.f48508a = j11;
        this.f48509b = j10;
        boolean z2 = false;
        if (j11 <= 0 ? j8 >= j10 : j8 <= j10) {
            z2 = true;
        }
        this.f48510c = z2;
        this.f48511d = z2 ? j8 : j10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48510c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j8 = this.f48511d;
        if (j8 != this.f48509b) {
            this.f48511d = this.f48508a + j8;
        } else {
            if (!this.f48510c) {
                throw new NoSuchElementException();
            }
            this.f48510c = false;
        }
        return Long.valueOf(j8);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
