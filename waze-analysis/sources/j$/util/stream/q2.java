package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q2 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f50581a;

    public q2(Collection collection) {
        this.f50581a = collection;
    }

    @Override // j$.util.stream.m2
    public final m2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.m2
    public final long count() {
        return this.f50581a.size();
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ m2 f(long j2, long j3, IntFunction intFunction) {
        return d4.w(this, j2, j3, intFunction);
    }

    @Override // j$.util.stream.m2
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.f50581a, consumer);
    }

    @Override // j$.util.stream.m2
    public final void h(Object[] objArr, int i2) {
        Iterator it = this.f50581a.iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
    }

    @Override // j$.util.stream.m2
    public final Object[] k(IntFunction intFunction) {
        java.util.Collection collection = this.f50581a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.m2
    public final int s() {
        return 0;
    }

    @Override // j$.util.stream.m2
    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f50581a).spliterator();
    }

    public final String toString() {
        java.util.Collection collection = this.f50581a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
