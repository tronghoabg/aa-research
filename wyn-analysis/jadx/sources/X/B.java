package X;

import ff.C2642C;
import java.util.ArrayList;
import java.util.ListIterator;
import r7.AbstractC3935e;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class B implements ListIterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15666a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15668c;

    public B(Bf.e eVar, int i5) {
        this.f15668c = eVar;
        this.f15667b = ((ArrayList) eVar.f1687b).listIterator(ff.o.i0(i5, eVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f15666a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ListIterator listIterator = (ListIterator) this.f15667b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15666a) {
            case 0:
                if (((kotlin.jvm.internal.E) this.f15667b).f39738a < ((C) this.f15668c).f15672d - 1) {
                }
                break;
        }
        return ((ListIterator) this.f15667b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f15666a) {
            case 0:
                if (((kotlin.jvm.internal.E) this.f15667b).f39738a >= 0) {
                }
                break;
        }
        return ((ListIterator) this.f15667b).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f15666a) {
            case 0:
                kotlin.jvm.internal.E e7 = (kotlin.jvm.internal.E) this.f15667b;
                int i5 = e7.f39738a + 1;
                C c10 = (C) this.f15668c;
                q.a(i5, c10.f15672d);
                e7.f39738a = i5;
                break;
        }
        return ((ListIterator) this.f15667b).previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f15666a) {
            case 0:
                return ((kotlin.jvm.internal.E) this.f15667b).f39738a + 1;
            case 1:
                return AbstractC3935e.z((C2642C) this.f15668c) - ((ListIterator) this.f15667b).previousIndex();
            default:
                return AbstractC3935e.z((Bf.e) this.f15668c) - ((ListIterator) this.f15667b).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f15666a) {
            case 0:
                kotlin.jvm.internal.E e7 = (kotlin.jvm.internal.E) this.f15667b;
                int i5 = e7.f39738a;
                C c10 = (C) this.f15668c;
                q.a(i5, c10.f15672d);
                e7.f39738a = i5 - 1;
                break;
        }
        return ((ListIterator) this.f15667b).next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f15666a) {
            case 0:
                return ((kotlin.jvm.internal.E) this.f15667b).f39738a;
            case 1:
                return AbstractC3935e.z((C2642C) this.f15668c) - ((ListIterator) this.f15667b).nextIndex();
            default:
                return AbstractC3935e.z((Bf.e) this.f15668c) - ((ListIterator) this.f15667b).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f15666a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f15667b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f15666a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f15667b).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public B(C2642C c2642c, int i5) {
        this.f15668c = c2642c;
        this.f15667b = c2642c.f35405a.listIterator(ff.o.i0(i5, c2642c));
    }

    public B(kotlin.jvm.internal.E e7, C c10) {
        this.f15667b = e7;
        this.f15668c = c10;
    }
}
