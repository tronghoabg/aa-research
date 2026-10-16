package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afcu extends defpackage.afcw implements java.util.Iterator, defpackage.afhc {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        a();
        defpackage.afcy afcyVar = this.a;
        int i = this.b;
        if (i >= afcyVar.e) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        defpackage.afcv afcvVar = new defpackage.afcv(afcyVar, i);
        b();
        return afcvVar;
    }
}
