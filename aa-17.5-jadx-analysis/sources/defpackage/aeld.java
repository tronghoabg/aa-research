package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.AbstractCollection;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public abstract class aeld extends AbstractCollection implements Collection, aepb {
    protected aeld() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract aepm m();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public /* synthetic */ boolean add(Object obj) {
        return adqq.as(this, (Long) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection<? extends Long> collection) {
        return collection instanceof aepb ? d((aepb) collection) : super.addAll(collection);
    }

    @Override // defpackage.aepb
    /* renamed from: b */
    public /* synthetic */ aeqd spliterator() {
        throw null;
    }

    @Override // defpackage.aepb
    public boolean c(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.aepb
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return e(((Long) obj).longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return collection instanceof aepb ? f((aepb) collection) : super.containsAll(collection);
    }

    public boolean d(aepb aepbVar) {
        aepm aepmVarM = aepbVar.m();
        boolean z = false;
        while (aepmVarM.hasNext()) {
            if (c(aepmVarM.nextLong())) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aepb
    public boolean e(long j) {
        throw null;
    }

    public boolean f(aepb aepbVar) {
        aepm aepmVarM = aepbVar.m();
        while (aepmVarM.hasNext()) {
            if (!e(aepmVarM.nextLong())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // defpackage.aepb
    public boolean g(long j) {
        aepm aepmVarM = m();
        while (aepmVarM.hasNext()) {
            if (j == aepmVarM.nextLong()) {
                aepmVarM.remove();
                return true;
            }
        }
        return false;
    }

    public boolean h(aepb aepbVar) {
        aepm aepmVarM = aepbVar.m();
        boolean z = false;
        while (aepmVarM.hasNext()) {
            if (g(aepmVarM.nextLong())) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aepb
    public /* synthetic */ boolean i(LongPredicate longPredicate) {
        longPredicate.getClass();
        aepm aepmVarM = m();
        boolean z = false;
        while (aepmVarM.hasNext()) {
            if (longPredicate.test(aepmVarM.nextLong())) {
                aepmVarM.remove();
                z = true;
            }
        }
        return z;
    }

    public boolean j(aepb aepbVar) {
        aepm aepmVarM = m();
        boolean z = false;
        while (aepmVarM.hasNext()) {
            if (!aepbVar.e(aepmVarM.nextLong())) {
                aepmVarM.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aepb
    public long[] k() {
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
        return g(((Long) obj).longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        return collection instanceof aepb ? h((aepb) collection) : super.removeAll(collection);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return adqq.at(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        return collection instanceof aepb ? j((aepb) collection) : super.retainAll(collection);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return spliterator();
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
        aepm aepmVarM = m();
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(String.valueOf(aepmVarM.nextLong()));
            size--;
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }
}
