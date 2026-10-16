package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aaj implements java.util.Iterator, defpackage.afhc {
    public int a = -1;
    final /* synthetic */ java.lang.Object b;
    private final java.util.Iterator c;
    private final /* synthetic */ int d;

    public aaj(defpackage.aah aahVar, int i) {
        this.d = i;
        this.b = aahVar;
        this.c = afsg.a(new defpackage.aag(aahVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        java.util.Iterator it = this.c;
        return i != 0 ? it.hasNext() : it.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.d;
        java.util.Iterator it = this.c;
        return i != 0 ? it.next() : it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.d;
        int i2 = this.a;
        if (i != 0) {
            if (i2 != -1) {
                ((defpackage.aah) this.b).a.e(i2);
                this.a = -1;
                return;
            }
            return;
        }
        if (i2 != -1) {
            ((defpackage.aak) this.b).a.i(i2);
            this.a = -1;
        }
    }

    public aaj(defpackage.aak aakVar, int i) {
        this.d = i;
        this.b = aakVar;
        this.c = afsg.a(new defpackage.aai(aakVar, this, null));
    }
}
