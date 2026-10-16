package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yhr extends defpackage.ygm {
    private static final long serialVersionUID = 0;
    private final transient defpackage.yhs a;

    public yhr(defpackage.yhs yhsVar) {
        this.a = yhsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ygm
    public final int a(java.lang.Object[] objArr, int i) {
        defpackage.yot it = this.a.map.values().iterator();
        while (it.hasNext()) {
            i = ((defpackage.ygm) it.next()).a(objArr, i);
        }
        return i;
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.z(obj);
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return new defpackage.yho(this.a);
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
