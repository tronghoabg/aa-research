package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cce implements java.util.Iterator, defpackage.afhc {
    public final defpackage.ccd a;

    public cce(defpackage.ccc cccVar) {
        defpackage.ccl[] cclVarArr = new defpackage.ccl[8];
        for (int i = 0; i < 8; i++) {
            cclVarArr[i] = new defpackage.cco(this);
        }
        this.a = new defpackage.ccd(cccVar, cclVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return (java.util.Map.Entry) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
