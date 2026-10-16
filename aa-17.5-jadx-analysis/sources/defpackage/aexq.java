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
public abstract class aexq extends AbstractCollection implements Collection, aeyi {
    protected aexq() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract aeyu iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        i(((Short) obj).shortValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection<? extends Short> collection) {
        return collection instanceof aeyi ? c((aeyi) collection) : super.addAll(collection);
    }

    @Override // defpackage.aeyi
    public /* synthetic */ aeze b() {
        throw null;
    }

    public boolean c(aeyi aeyiVar) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return d(((Short) obj).shortValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        if (!(collection instanceof aeyi)) {
            return super.containsAll(collection);
        }
        aeyu it = ((aeyi) collection).iterator();
        while (it.hasNext()) {
            if (!d(it.d())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aeyi
    public boolean d(short s) {
        throw null;
    }

    @Override // defpackage.aeyi
    public boolean e(short s) {
        throw null;
    }

    public boolean f(aeyi aeyiVar) {
        aeyu it = aeyiVar.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (e(it.d())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // defpackage.aeyi
    public /* synthetic */ boolean g(aezc aezcVar) {
        aezcVar.getClass();
        aeyu it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aezcVar.d(it.d())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aeyi
    public short[] h() {
        throw null;
    }

    @Override // defpackage.aeyi
    public void i(short s) {
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
        return e(((Short) obj).shortValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return collection instanceof aeyi ? f((aeyi) collection) : super.removeAll(collection);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(final Predicate predicate) {
        return g(predicate instanceof aezc ? (aezc) predicate : new aezc() { // from class: aeyh
            @Override // defpackage.aezc
            public final /* synthetic */ aezc a(aezc aezcVar) {
                return adqs.C(this, aezcVar);
            }

            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return adqs.D(this, intPredicate);
            }

            @Override // defpackage.aezc
            public final /* synthetic */ aezc b(aezc aezcVar) {
                return adqs.E(this, aezcVar);
            }

            @Override // defpackage.aezc
            public final /* synthetic */ boolean c(Short sh) {
                return adqs.I(this, sh);
            }

            @Override // defpackage.aezc
            public final boolean d(short s) {
                adqs.n(s);
                return predicate.test(Short.valueOf(s));
            }

            public final /* synthetic */ IntPredicate negate() {
                return new aezb(this);
            }

            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return adqs.F(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final /* synthetic */ boolean test(int i) {
                return adqs.G(this, i);
            }

            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final /* bridge */ /* synthetic */ boolean test(Object obj) {
                return c((Short) obj);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo56negate() {
                return new aezb(this);
            }
        });
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        if (!(collection instanceof aeyi)) {
            return super.retainAll(collection);
        }
        aeyi aeyiVar = (aeyi) collection;
        aeyu it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!aeyiVar.d(it.d())) {
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
        aeyu it = iterator();
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(String.valueOf((int) it.d()));
            size--;
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }
}
