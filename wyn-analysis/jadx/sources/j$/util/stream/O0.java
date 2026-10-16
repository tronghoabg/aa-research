package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class O0 implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f38051a;

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j10, IntFunction intFunction) {
        return AbstractC3044y0.w(this, j8, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i5) {
        throw new IndexOutOfBoundsException();
    }

    O0(Collection collection) {
        this.f38051a = collection;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f38051a).spliterator();
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i5) {
        Iterator it = this.f38051a.iterator();
        while (it.hasNext()) {
            objArr[i5] = it.next();
            i5++;
        }
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        java.util.Collection collection = this.f38051a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f38051a.size();
    }

    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.f38051a, consumer);
    }

    public final String toString() {
        java.util.Collection collection = this.f38051a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
