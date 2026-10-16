package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ynd extends defpackage.yhx {
    public static final defpackage.ynd a;
    private static final java.lang.Object[] e;
    final transient java.lang.Object[] b;
    public final transient int c;
    final transient java.lang.Object[] d;
    private final transient int f;
    private final transient int g;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        e = objArr;
        a = new defpackage.ynd(objArr, 0, objArr, 0, 0);
    }

    public ynd(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.ygm
    public final int a(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.b;
        int i2 = this.g;
        java.lang.System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ygm
    public final int b() {
        return this.g;
    }

    @Override // defpackage.ygm
    public final int c() {
        return 0;
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.d;
            if (objArr.length != 0) {
                int iAA = defpackage.ysr.aA(obj);
                while (true) {
                    int i = iAA & this.f;
                    java.lang.Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iAA = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return d().listIterator(0);
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ygm
    public final java.lang.Object[] g() {
        return this.b;
    }

    @Override // defpackage.yhx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.yhx
    public final boolean i() {
        return true;
    }

    @Override // defpackage.yhx
    public final defpackage.ygw k() {
        return defpackage.ygw.l(this.b, this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
