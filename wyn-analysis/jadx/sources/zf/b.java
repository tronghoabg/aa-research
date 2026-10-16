package zf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class b implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final int f48496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48497b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f48498c;

    /* renamed from: d, reason: collision with root package name */
    public int f48499d;

    public b(char c10, char c11, int i5) {
        this.f48496a = i5;
        this.f48497b = c11;
        boolean z2 = false;
        if (i5 <= 0 ? AbstractC3340k.g(c10, c11) >= 0 : AbstractC3340k.g(c10, c11) <= 0) {
            z2 = true;
        }
        this.f48498c = z2;
        this.f48499d = z2 ? c10 : c11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48498c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f48499d;
        if (i5 != this.f48497b) {
            this.f48499d = this.f48496a + i5;
        } else {
            if (!this.f48498c) {
                throw new NoSuchElementException();
            }
            this.f48498c = false;
        }
        return Character.valueOf((char) i5);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
