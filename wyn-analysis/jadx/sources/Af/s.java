package Af;

import java.util.Iterator;
import java.util.NoSuchElementException;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class s implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1322a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1323b;

    public s(Object obj) {
        this.f1323b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1322a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f1322a) {
            throw new NoSuchElementException();
        }
        this.f1322a = false;
        return this.f1323b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
