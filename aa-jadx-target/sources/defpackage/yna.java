package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yna extends defpackage.yhx {
    public final transient defpackage.ygw a;
    private final transient defpackage.yhe b;

    public yna(defpackage.yhe yheVar, defpackage.ygw ygwVar) {
        this.b = yheVar;
        this.a = ygwVar;
    }

    @Override // defpackage.ygm
    public final int a(java.lang.Object[] objArr, int i) {
        return this.a.a(objArr, i);
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.b.get(obj) != null;
    }

    @Override // defpackage.yhx, defpackage.ygm
    public final defpackage.ygw d() {
        return this.a;
    }

    @Override // defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return this.a.listIterator(0);
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
