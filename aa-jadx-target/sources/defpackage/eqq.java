package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class eqq implements defpackage.eqt {
    final defpackage.eqp a;
    final defpackage.eqt b;
    int c = -1;

    public eqq(defpackage.eqp eqpVar, defpackage.eqt eqtVar) {
        this.a = eqpVar;
        this.b = eqtVar;
    }

    final void b() {
        this.a.i(this);
    }

    final void c() {
        this.a.k(this);
    }

    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.ea(obj);
        }
    }
}
