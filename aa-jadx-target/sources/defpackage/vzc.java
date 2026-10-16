package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vzc implements defpackage.vyz {
    private final defpackage.afak b;
    private final defpackage.tmy c;
    private final java.lang.Object a = new java.lang.Object();
    private int d = 0;
    private long e = 0;

    public vzc(defpackage.afak afakVar, defpackage.tmy tmyVar) {
        this.b = afakVar;
        this.c = tmyVar;
    }

    @Override // defpackage.vyz
    public final void a() {
        java.lang.Object obj = this.a;
        long jA = this.c.a();
        synchronized (obj) {
            this.d++;
            if (jA - this.e > 1000) {
                this.d = 0;
                this.e = jA;
            }
        }
    }

    @Override // defpackage.vyz
    public final boolean b() {
        int iIntValue = ((java.lang.Integer) this.b.a()).intValue();
        if (iIntValue == 0) {
            return true;
        }
        if (iIntValue == Integer.MAX_VALUE) {
            return false;
        }
        synchronized (this.a) {
            if (this.d < iIntValue) {
                return false;
            }
            return this.c.a() - this.e <= 1000;
        }
    }
}
