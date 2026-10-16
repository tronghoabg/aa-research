package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cco extends defpackage.ccl {
    private final defpackage.cce c;

    public cco(defpackage.cce cceVar) {
        this.c = cceVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 2;
        java.lang.Object[] objArr = this.a;
        return new defpackage.cbz(this.c, objArr[i], objArr[i + 1]);
    }
}
