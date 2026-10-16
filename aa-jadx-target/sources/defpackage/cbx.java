package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cbx extends defpackage.afbw {
    private final defpackage.ccc a;

    public cbx(defpackage.ccc cccVar) {
        this.a = cccVar;
    }

    @Override // defpackage.afbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if ((true != (entry instanceof java.lang.Object) ? null : entry) instanceof java.util.Map.Entry) {
                defpackage.ccc cccVar = this.a;
                java.lang.Object obj2 = cccVar.get(entry.getKey());
                if (obj2 != null) {
                    return defpackage.afga.f(obj2, entry.getValue());
                }
                return entry.getValue() == null && cccVar.containsKey(entry.getKey());
            }
        }
        return false;
    }

    @Override // defpackage.afbw
    public final int getSize() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.cce(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if ((true != (entry instanceof java.lang.Object) ? null : entry) instanceof java.util.Map.Entry) {
            return this.a.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }
}
