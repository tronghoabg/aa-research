package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aesf<K> extends java.util.AbstractCollection<K> implements j$.util.Collection<K>, defpackage.aeyk {
    protected aesf() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: a */
    public abstract defpackage.aeuy iterator();

    public /* synthetic */ defpackage.aevs b() {
        throw null;
    }

    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return b();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        defpackage.aeuy it = iterator();
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            size--;
            K next = it.next();
            if (this == next) {
                sb.append("(this collection)");
            } else {
                sb.append(java.lang.String.valueOf(next));
            }
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }
}
