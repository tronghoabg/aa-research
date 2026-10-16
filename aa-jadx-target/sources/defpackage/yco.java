package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class yco extends defpackage.ycm implements java.util.List {
    final /* synthetic */ defpackage.ycs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yco(defpackage.ycs ycsVar, java.lang.Object obj, java.util.List list, defpackage.ycm ycmVar) {
        super(ycsVar, obj, list, ycmVar);
        this.f = ycsVar;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        d().add(i, obj);
        this.f.b++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = d().addAll(i, collection);
        if (zAddAll) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    final java.util.List d() {
        return (java.util.List) this.b;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        b();
        return d().get(i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        b();
        return new ycn(this);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        b();
        java.lang.Object objRemove = d().remove(i);
        this.f.b--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        b();
        return d().set(i, obj);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        b();
        java.util.List listSubList = d().subList(i, i2);
        defpackage.ycm ycmVar = this.c;
        if (ycmVar == null) {
            ycmVar = this;
        }
        return this.f.n(this.a, listSubList, ycmVar);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        b();
        return new ycn(this, i);
    }
}
