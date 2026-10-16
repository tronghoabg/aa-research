package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfu extends defpackage.yft implements java.util.SortedSet {
    protected yfu() {
    }

    @Override // defpackage.yft
    protected /* bridge */ /* synthetic */ java.util.Set c() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return g().comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return g().first();
    }

    protected abstract java.util.SortedSet g();

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return g().headSet(obj);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        return g().last();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return g().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return g().tailSet(obj);
    }
}
