package P;

import java.util.List;
import java.util.ListIterator;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class c implements ListIterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8968a;

    /* renamed from: b, reason: collision with root package name */
    public int f8969b;

    public c(int i5, List list) {
        this.f8968a = list;
        this.f8969b = i5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f8968a.add(this.f8969b, obj);
        this.f8969b++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8969b < this.f8968a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8969b > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i5 = this.f8969b;
        this.f8969b = i5 + 1;
        return this.f8968a.get(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8969b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i5 = this.f8969b - 1;
        this.f8969b = i5;
        return this.f8968a.get(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8969b - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i5 = this.f8969b - 1;
        this.f8969b = i5;
        this.f8968a.remove(i5);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f8968a.set(this.f8969b, obj);
    }
}
