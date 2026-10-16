package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aerx<K> extends defpackage.aerw<K> implements j$.util.SortedSet<K>, defpackage.aevr {
    protected aerx() {
    }

    @Override // defpackage.aerw, defpackage.aerq, defpackage.aeuv
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ defpackage.aeuy iterator() {
        throw null;
    }

    @Override // defpackage.aerw, defpackage.aerq, defpackage.aeuv
    public /* synthetic */ defpackage.aevs b() {
        throw null;
    }

    @Override // defpackage.aerw, defpackage.aerq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: c */
    public abstract defpackage.aeuu iterator();

    public /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj);
    }

    @Override // defpackage.aerw, defpackage.aerq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return b();
    }

    public /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, obj2);
    }

    public /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj);
    }
}
