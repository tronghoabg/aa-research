package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class cbo<E> extends defpackage.afbr<E> implements j$.util.List<E>, defpackage.cbl {
    @Override // defpackage.afbm, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.afbm, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cbl
    public defpackage.cbl d(java.util.Collection collection) {
        defpackage.cbr cbrVarJ = j();
        cbrVarJ.addAll(collection);
        return cbrVarJ.c();
    }

    @Override // defpackage.cbl
    public final defpackage.cbl e(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? h(iIndexOf) : this;
    }

    @Override // defpackage.cbl
    public final defpackage.cbl f(java.util.Collection collection) {
        return g(new defpackage.bjm(collection, 16));
    }

    @Override // defpackage.afbr, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // defpackage.afbr, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.afbr, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return new defpackage.cbj(this, i, i2);
    }
}
