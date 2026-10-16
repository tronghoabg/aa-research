package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ynb extends defpackage.ygw {
    private final transient java.lang.Object[] a;
    private final transient int b;
    private final transient int c;

    public ynb(java.lang.Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.ysr.bs(i, this.c);
        java.lang.Object obj = this.a[i + i + this.b];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.ygw, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
