package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajxv extends java.util.AbstractList {
    private final java.util.Set a = new java.util.HashSet();
    private final java.util.List b = new java.util.ArrayList();

    public final void a(java.net.URI uri) {
        this.a.add(uri);
        this.b.add(uri);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        java.net.URI uri = (java.net.URI) obj;
        this.b.add(i, uri);
        this.a.add(uri);
    }

    public final boolean b(java.net.URI uri) {
        return this.a.contains(uri);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return (java.net.URI) this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        java.util.List list = this.b;
        java.net.URI uri = (java.net.URI) list.remove(i);
        java.util.Set set = this.a;
        set.remove(uri);
        if (list.size() != set.size()) {
            set.addAll(list);
        }
        return uri;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        java.net.URI uri = (java.net.URI) obj;
        java.util.List list = this.b;
        java.net.URI uri2 = (java.net.URI) list.set(i, uri);
        java.util.Set set = this.a;
        set.remove(uri2);
        set.add(uri);
        if (list.size() != set.size()) {
            set.addAll(list);
        }
        return uri2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
