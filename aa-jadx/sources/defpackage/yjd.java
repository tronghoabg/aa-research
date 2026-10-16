package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yjd extends defpackage.ynr {
    final /* synthetic */ defpackage.yjl a;

    public yjd(defpackage.yjl yjlVar) {
        this.a = yjlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.s(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.yjg(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        return !this.a.g(obj).isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c.size();
    }
}
