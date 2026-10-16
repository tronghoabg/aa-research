package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m implements ListIterator, w {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f50274a;

    public m(n nVar, int i2) {
        this.f50274a = nVar.f50276b.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.w
    public final void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.B(this.f50274a, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f50274a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f50274a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f50274a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f50274a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f50274a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f50274a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
