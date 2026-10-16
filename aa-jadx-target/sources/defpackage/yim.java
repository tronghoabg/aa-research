package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class yim extends defpackage.yhx {
    @Override // defpackage.ygm
    public final int a(java.lang.Object[] objArr, int i) {
        return d().a(objArr, i);
    }

    @Override // defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public defpackage.yot iterator() {
        return d().listIterator(0);
    }

    public abstract java.lang.Object h(int i);

    @Override // defpackage.yhx
    public final defpackage.ygw k() {
        return new yil(this);
    }

    @Override // defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
