package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class xyi extends java.util.AbstractList {
    final /* synthetic */ java.lang.Object[] a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public xyi(java.lang.Object[] objArr, java.lang.Object obj, java.lang.Object obj2) {
        this.a = objArr;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        if (i != 0) {
            return i != 1 ? this.a[i - 2] : this.c;
        }
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.length + 2;
    }
}
