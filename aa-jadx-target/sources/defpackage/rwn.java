package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwn implements defpackage.rti {
    defpackage.rvj a;
    private final defpackage.rti b;
    private final defpackage.rtk c;
    private final defpackage.mmi d;

    public rwn(defpackage.rti rtiVar, defpackage.rtk rtkVar, defpackage.mmi mmiVar) {
        this.b = rtiVar;
        this.c = rtkVar;
        this.d = mmiVar;
    }

    @Override // defpackage.rti
    public final defpackage.rvj b(defpackage.rvm rvmVar) {
        this.a = this.b.b(rvmVar);
        return new defpackage.rwr(this.a, this.c, this.d);
    }

    @Override // defpackage.rti
    public final void ft(java.io.PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.rti
    public final void k() {
        throw null;
    }

    @Override // defpackage.rti
    public final void l(defpackage.rvj rvjVar) {
        this.b.l(this.a);
    }
}
