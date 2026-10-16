package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aimp extends java.util.ArrayList implements defpackage.aimz {
    public aimp(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof defpackage.aina) {
            return contains((defpackage.aina) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.aina) {
            return indexOf((defpackage.aina) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.aina) {
            return lastIndexOf((defpackage.aina) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof defpackage.aina) {
            return remove((defpackage.aina) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(defpackage.aina ainaVar) {
        return super.contains((java.lang.Object) ainaVar);
    }

    public /* bridge */ int indexOf(defpackage.aina ainaVar) {
        return super.indexOf((java.lang.Object) ainaVar);
    }

    public /* bridge */ int lastIndexOf(defpackage.aina ainaVar) {
        return super.lastIndexOf((java.lang.Object) ainaVar);
    }

    public /* bridge */ boolean remove(defpackage.aina ainaVar) {
        return super.remove((java.lang.Object) ainaVar);
    }
}
