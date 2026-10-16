package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.AbstractCollection;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public abstract class aeeg extends AbstractCollection implements Collection, aeez {
    protected aeeg() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract aefl iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public /* synthetic */ boolean add(Object obj) {
        return adzo.j(this, (Byte) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection<? extends Byte> collection) {
        return collection instanceof aeez ? d((aeez) collection) : super.addAll(collection);
    }

    @Override // defpackage.aeez
    public /* synthetic */ aefz b() {
        throw null;
    }

    @Override // defpackage.aeez
    public boolean c(byte b) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return e(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return collection instanceof aeez ? f((aeez) collection) : super.containsAll(collection);
    }

    public boolean d(aeez aeezVar) {
        throw null;
    }

    @Override // defpackage.aeez
    public boolean e(byte b) {
        throw null;
    }

    public final boolean f(aeez aeezVar) {
        aefl it = aeezVar.iterator();
        while (it.hasNext()) {
            if (!e(it.c())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // defpackage.aeez
    public boolean g(byte b) {
        throw null;
    }

    public boolean h(aeez aeezVar) {
        aefl it = aeezVar.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (g(it.c())) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aeez
    public /* synthetic */ boolean i(aefw aefwVar) {
        aefwVar.getClass();
        aefl it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aefwVar.c(it.c())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aeez
    public byte[] j() {
        throw null;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return g(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return collection instanceof aeez ? h((aeez) collection) : super.removeAll(collection);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(final Predicate predicate) {
        return i(predicate instanceof aefw ? (aefw) predicate : new aefw() { // from class: aeey
            @Override // defpackage.aefw
            public final /* synthetic */ aefw a(aefw aefwVar) {
                return aeec.b(this, aefwVar);
            }

            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return aeec.c(this, intPredicate);
            }

            @Override // defpackage.aefw
            public final /* synthetic */ aefw b(aefw aefwVar) {
                return aeec.d(this, aefwVar);
            }

            @Override // defpackage.aefw
            public final boolean c(byte b) {
                adqs.m(b);
                return predicate.test(Byte.valueOf(b));
            }

            @Override // defpackage.aefw
            public final /* synthetic */ boolean d(Byte b) {
                return aeec.g(this, b);
            }

            public final /* synthetic */ IntPredicate negate() {
                return new aeft(this);
            }

            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return aeec.e(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final /* synthetic */ boolean test(int i) {
                return aeec.f(this, i);
            }

            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final /* bridge */ /* synthetic */ boolean test(Object obj) {
                return d((Byte) obj);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate, reason: collision with other method in class */
            public final /* synthetic */ Predicate mo56negate() {
                return new aeft(this);
            }
        });
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        if (!(collection instanceof aeez)) {
            return super.retainAll(collection);
        }
        aeez aeezVar = (aeez) collection;
        aefl it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!aeezVar.e(it.c())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return b();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        aefl it = iterator();
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(String.valueOf((int) it.c()));
            size--;
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }
}
