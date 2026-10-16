package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.AbstractCollection;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public abstract class aegj extends AbstractCollection implements Collection, aejf {
    protected aegj() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract aejr m();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public /* synthetic */ boolean add(Object obj) {
        return adzo.q(this, (Integer) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection<? extends Integer> collection) {
        return collection instanceof aejf ? d((aejf) collection) : super.addAll(collection);
    }

    @Override // defpackage.aejf
    public /* synthetic */ aekm b() {
        throw null;
    }

    @Override // defpackage.aejf
    public boolean c(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.aejf
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return e(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return collection instanceof aejf ? f((aejf) collection) : super.containsAll(collection);
    }

    @Override // defpackage.aejf
    public boolean d(aejf aejfVar) {
        aejr aejrVarM = aejfVar.m();
        boolean z = false;
        while (aejrVarM.hasNext()) {
            if (c(aejrVarM.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aejf
    public boolean e(int i) {
        throw null;
    }

    public boolean f(aejf aejfVar) {
        aejr aejrVarM = aejfVar.m();
        while (aejrVarM.hasNext()) {
            if (!e(aejrVarM.nextInt())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // defpackage.aejf
    public boolean g(int i) {
        aejr aejrVarM = m();
        while (aejrVarM.hasNext()) {
            if (i == aejrVarM.nextInt()) {
                aejrVarM.remove();
                return true;
            }
        }
        return false;
    }

    public boolean h(aejf aejfVar) {
        aejr aejrVarM = aejfVar.m();
        boolean z = false;
        while (aejrVarM.hasNext()) {
            if (g(aejrVarM.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aejf
    public /* synthetic */ boolean i(IntPredicate intPredicate) {
        intPredicate.getClass();
        aejr aejrVarM = m();
        boolean z = false;
        while (aejrVarM.hasNext()) {
            if (intPredicate.test(aejrVarM.nextInt())) {
                aejrVarM.remove();
                z = true;
            }
        }
        return z;
    }

    public boolean j(aejf aejfVar) {
        aejr aejrVarM = m();
        boolean z = false;
        while (aejrVarM.hasNext()) {
            if (!aejfVar.e(aejrVarM.nextInt())) {
                aejrVarM.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aejf
    public int[] k() {
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
        return g(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        return collection instanceof aejf ? h((aejf) collection) : super.removeAll(collection);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return adzo.r(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        return collection instanceof aejf ? j((aejf) collection) : super.retainAll(collection);
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
        aejr aejrVarM = m();
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(String.valueOf(aejrVarM.nextInt()));
            size--;
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }
}
