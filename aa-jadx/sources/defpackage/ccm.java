package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ccm extends defpackage.ccl {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 2;
        java.lang.Object[] objArr = this.a;
        return new defpackage.cby(objArr[i], objArr[i + 1]);
    }
}
