package zf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class f implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final int f48503a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48504b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f48505c;

    /* renamed from: d, reason: collision with root package name */
    public int f48506d;

    public f(int i5, int i10, int i11) {
        this.f48503a = i11;
        this.f48504b = i10;
        boolean z2 = false;
        if (i11 <= 0 ? i5 >= i10 : i5 <= i10) {
            z2 = true;
        }
        this.f48505c = z2;
        this.f48506d = z2 ? i5 : i10;
    }

    public final int a() {
        int i5 = this.f48506d;
        if (i5 != this.f48504b) {
            this.f48506d = this.f48503a + i5;
            return i5;
        }
        if (!this.f48505c) {
            throw new NoSuchElementException();
        }
        this.f48505c = false;
        return i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48505c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
