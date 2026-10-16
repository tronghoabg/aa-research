package defpackage;

/* JADX INFO: loaded from: classes.dex */
class ycm extends java.util.AbstractCollection {
    final java.lang.Object a;
    java.util.Collection b;
    final defpackage.ycm c;
    final java.util.Collection d;
    final /* synthetic */ defpackage.ycs e;

    public ycm(defpackage.ycs ycsVar, java.lang.Object obj, java.util.Collection collection, defpackage.ycm ycmVar) {
        this.e = ycsVar;
        this.a = obj;
        this.b = collection;
        this.c = ycmVar;
        this.d = ycmVar == null ? null : ycmVar.b;
    }

    final void a() {
        defpackage.ycm ycmVar = this.c;
        if (ycmVar != null) {
            ycmVar.a();
            return;
        }
        defpackage.ycs ycsVar = this.e;
        ycsVar.a.put(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        boolean zAdd = this.b.add(obj);
        if (zAdd) {
            this.e.b++;
            if (zIsEmpty) {
                a();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.b.addAll(collection);
        if (zAddAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    final void b() {
        defpackage.ycm ycmVar = this.c;
        if (ycmVar != null) {
            ycmVar.b();
            if (ycmVar.b != this.d) {
                throw new java.util.ConcurrentModificationException();
            }
            return;
        }
        if (this.b.isEmpty()) {
            defpackage.ycs ycsVar = this.e;
            java.util.Collection collection = (java.util.Collection) ycsVar.a.get(this.a);
            if (collection != null) {
                this.b = collection;
            }
        }
    }

    final void c() {
        defpackage.ycm ycmVar = this.c;
        if (ycmVar != null) {
            ycmVar.c();
        } else if (this.b.isEmpty()) {
            defpackage.ycs ycsVar = this.e;
            ycsVar.a.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.b -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        b();
        return new defpackage.ycl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        b();
        boolean zRemove = this.b.remove(obj);
        if (zRemove) {
            this.e.b--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.b.size();
            this.e.b += size2 - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        b();
        return this.b.toString();
    }
}
