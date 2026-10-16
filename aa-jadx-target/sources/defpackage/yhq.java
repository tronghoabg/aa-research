package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yhq extends defpackage.ygm {
    private static final long serialVersionUID = 0;
    final defpackage.yhs a;

    public yhq(defpackage.yhs yhsVar) {
        this.a = yhsVar;
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return this.a.y(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return new defpackage.yhn(this.a);
    }

    @Override // defpackage.ygm
    public final boolean f() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
