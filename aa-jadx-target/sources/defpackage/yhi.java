package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yhi extends defpackage.yim {
    private final defpackage.yhe a;

    public yhi(defpackage.yhe yheVar) {
        this.a = yheVar;
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.yim, defpackage.yhx, defpackage.ygm
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return this.a.gd();
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return true;
    }

    @Override // defpackage.yim
    public final java.lang.Object h(int i) {
        return ((java.util.Map.Entry) this.a.entrySet().d().get(i)).getKey();
    }

    @Override // defpackage.yim, defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.yim, defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return new yhh(this.a);
    }
}
