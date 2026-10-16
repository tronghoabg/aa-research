package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afcx<K, V> extends defpackage.afcw<K, V> implements java.util.Iterator<V>, defpackage.afhc {
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afcx(defpackage.afcy afcyVar, int i, byte[] bArr) {
        super(afcyVar);
        this.d = i;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.d != 0) {
            a();
            int i = this.b;
            defpackage.afcy afcyVar = this.a;
            if (i >= afcyVar.e) {
                throw new java.util.NoSuchElementException();
            }
            this.b = i + 1;
            this.c = i;
            java.lang.Object obj = afcyVar.b[i];
            b();
            return obj;
        }
        a();
        int i2 = this.b;
        defpackage.afcy afcyVar2 = this.a;
        if (i2 >= afcyVar2.e) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i2 + 1;
        this.c = i2;
        java.lang.Object[] objArr = afcyVar2.c;
        objArr.getClass();
        java.lang.Object obj2 = objArr[i2];
        b();
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afcx(defpackage.afcy afcyVar, int i) {
        super(afcyVar);
        this.d = i;
    }
}
