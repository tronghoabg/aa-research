package Af;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class b implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1288a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1289b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f1290c;

    public b(Iterator iterator) {
        AbstractC3340k.e(iterator, "iterator");
        this.f1290c = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f1288a) {
            case 0:
                break;
            case 1:
                return this.f1289b > 0 && this.f1290c.hasNext();
            default:
                return this.f1290c.hasNext();
        }
        while (true) {
            int i5 = this.f1289b;
            it = this.f1290c;
            if (i5 > 0 && it.hasNext()) {
                it.next();
                this.f1289b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f1288a) {
            case 0:
                break;
            case 1:
                int i5 = this.f1289b;
                if (i5 == 0) {
                    throw new NoSuchElementException();
                }
                this.f1289b = i5 - 1;
                return this.f1290c.next();
            default:
                int i10 = this.f1289b;
                this.f1289b = i10 + 1;
                if (i10 >= 0) {
                    return new ff.y(i10, this.f1290c.next());
                }
                AbstractC3935e.P();
                throw null;
        }
        while (true) {
            int i11 = this.f1289b;
            it = this.f1290c;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f1289b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1288a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar, byte b5) {
        this.f1289b = cVar.f1293c;
        this.f1290c = cVar.f1292b.iterator();
    }

    public b(c cVar) {
        this.f1290c = cVar.f1292b.iterator();
        this.f1289b = cVar.f1293c;
    }
}
