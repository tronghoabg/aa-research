package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqw extends java.util.AbstractSet<java.util.Map.Entry> {
    final /* synthetic */ defpackage.ahqx this$0;

    private ahqw(defpackage.ahqx ahqxVar) {
        this.this$0 = ahqxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.util.Map.Entry entry) {
        if (contains(entry)) {
            return false;
        }
        this.this$0.put((java.lang.Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.this$0.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<java.util.Map.Entry> iterator() {
        return new defpackage.ahqv(this.this$0, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.this$0.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.this$0.size();
    }

    public /* synthetic */ ahqw(defpackage.ahqx ahqxVar, defpackage.ahqq ahqqVar) {
        this(ahqxVar);
    }
}
