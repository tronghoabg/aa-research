package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tdn implements java.util.Set, defpackage.afhh, defpackage.afhc {
    final /* synthetic */ java.util.Set a;
    final /* synthetic */ java.util.Set b;
    final /* synthetic */ defpackage.tdo c;
    private final /* synthetic */ java.util.Set d;

    public tdn(java.util.Set set, java.util.Set set2, defpackage.tdo tdoVar) {
        this.a = set;
        this.b = set2;
        this.c = tdoVar;
        this.d = set;
    }

    public final void a() {
        java.util.Set set = this.a;
        java.util.Set set2 = this.b;
        set.retainAll(set2);
        set.addAll(set2);
        this.c.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        ((java.util.Map.Entry) obj).getClass();
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(java.util.Collection collection) {
        collection.getClass();
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.clear();
        a();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (!defpackage.afgz.e(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        entry.getClass();
        return this.d.contains(entry);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        return this.d.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.tdm(this, this.c, this.b.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (!defpackage.afgz.e(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        entry.getClass();
        boolean zRemove = this.b.remove(((defpackage.tdl) entry).a);
        a();
        return zRemove;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            entry.getClass();
            arrayList.add(((defpackage.tdl) entry).a);
        }
        boolean zRemoveAll = this.b.removeAll(defpackage.afga.bf(arrayList));
        a();
        return zRemoveAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            entry.getClass();
            arrayList.add(((defpackage.tdl) entry).a);
        }
        boolean zRetainAll = this.b.retainAll(defpackage.afga.bf(arrayList));
        a();
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.d.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) defpackage.afft.b(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.afft.a(this);
    }
}
