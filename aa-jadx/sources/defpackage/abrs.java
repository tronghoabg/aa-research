package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abrs<K, V> extends defpackage.abro<java.util.Map.Entry<? extends K, ? extends V>> implements java.util.Set<java.util.Map.Entry<? extends K, ? extends V>>, j$.util.Set<java.util.Map.Entry<? extends K, ? extends V>>, defpackage.afhc {
    private final java.util.Set a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abrs(java.util.Set set) {
        super(set);
        set.getClass();
        this.a = set;
    }

    @Override // defpackage.abro, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return super.contains((java.util.Map.Entry) obj);
        }
        return false;
    }

    @Override // defpackage.abro, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new defpackage.abrr(this.a.iterator());
    }

    @Override // defpackage.abro, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.spliterator(this, 1);
    }
}
