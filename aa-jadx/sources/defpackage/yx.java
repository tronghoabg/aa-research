package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yx extends java.util.AbstractSet {
    final /* synthetic */ defpackage.zd a;

    public yx(defpackage.zd zdVar) {
        this.a = zdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry> iterator() {
        return new defpackage.za(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.d;
    }
}
