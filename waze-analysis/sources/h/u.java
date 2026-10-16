package h;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class u implements Collection, j$.util.Collection, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f48300a;

    private /* synthetic */ u(int[] iArr) {
        this.f48300a = iArr;
    }

    public static final /* synthetic */ u a(int[] iArr) {
        return new u(iArr);
    }

    public static void c(int[] iArr) {
        h.g.b.x.f(iArr, "storage");
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends s> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ int[] b() {
        return this.f48300a;
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return h.a.c.ah(this.f48300a, ((s) obj).a());
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        h.g.b.x.f(collection, "elements");
        h.g.b.x.f(collection, "elements");
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof s) || !h.a.c.ah(this.f48300a, ((s) obj).a())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof u) && h.g.b.x.n(this.f48300a, ((u) obj).f48300a);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f48300a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f48300a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<s> iterator() {
        return new t(this.f48300a, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate<? super s> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ int size() {
        return this.f48300a.length;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        h.g.b.x.f(tArr, "array");
        return (T[]) h.g.b.n.b(this, tArr);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f48300a) + ")";
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return h.g.b.n.a(this);
    }
}
