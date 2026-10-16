package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class abqr extends java.util.AbstractSet {
    final /* synthetic */ defpackage.abqs a;

    public abqr(defpackage.abqs abqsVar) {
        this.a = abqsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.a.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry> iterator() {
        defpackage.abqs abqsVar = this.a;
        abqsVar.c();
        return new defpackage.abqq(abqsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
