package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ukc extends java.util.AbstractList implements java.util.RandomAccess {
    private final /* synthetic */ int a;
    private final defpackage.abgs b;

    public ukc(defpackage.abgn abgnVar, int i, byte[] bArr) {
        this.a = i;
        this.b = abgnVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            try {
                return java.lang.Integer.valueOf(((defpackage.abgn) this.b).e(i).b);
            } catch (defpackage.abpp unused) {
                return -1;
            }
        }
        if (i2 == 1) {
            return java.lang.Long.valueOf(((defpackage.abgn) this.b).d(i));
        }
        defpackage.abgs abgsVar = this.b;
        if (i2 == 2) {
            return java.lang.Long.valueOf(((defpackage.abgo) abgsVar).d(i));
        }
        try {
            return java.lang.Integer.valueOf(((defpackage.abgo) abgsVar).e(i).b);
        } catch (defpackage.abpp unused2) {
            return -1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.a;
        if (i == 0) {
            return ((defpackage.abgn) this.b).a();
        }
        if (i == 1) {
            return ((defpackage.abgn) this.b).c.b;
        }
        defpackage.abgs abgsVar = this.b;
        return i != 2 ? ((defpackage.abgo) abgsVar).a() : ((defpackage.abgo) abgsVar).c.b;
    }

    public ukc(defpackage.abgn abgnVar, int i) {
        this.a = i;
        this.b = abgnVar;
    }

    public ukc(defpackage.abgo abgoVar, int i) {
        this.a = i;
        this.b = abgoVar;
    }

    public ukc(defpackage.abgo abgoVar, int i, byte[] bArr) {
        this.a = i;
        this.b = abgoVar;
    }
}
