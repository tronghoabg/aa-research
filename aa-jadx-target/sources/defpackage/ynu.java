package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ynu extends defpackage.yhx {
    final transient java.lang.Object a;

    public ynu(java.lang.Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.ygm
    public final int a(java.lang.Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.yhx, defpackage.ygm
    public final defpackage.ygw d() {
        return defpackage.ygw.q(this.a);
    }

    @Override // defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return new defpackage.yja(this.a);
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return false;
    }

    @Override // defpackage.yhx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
