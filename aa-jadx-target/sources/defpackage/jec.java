package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jec extends defpackage.jbe {
    public static final defpackage.yqk d = defpackage.omv.n("XFER.Proxy");
    public final defpackage.izv e;

    public jec(defpackage.jdg jdgVar, defpackage.izv izvVar, android.os.Handler handler) {
        super(izvVar.a(), jdgVar, handler);
        this.e = izvVar;
    }

    @Override // defpackage.jdd
    public final void b(defpackage.qug qugVar, java.nio.ByteBuffer byteBuffer) {
        this.c.post(new defpackage.jdh((java.lang.Object) this, (java.lang.Object) byteBuffer, (java.lang.Object) qugVar, 2, (byte[]) null));
    }

    @Override // defpackage.jdd
    public final void c() {
        throw new java.lang.UnsupportedOperationException("Cannot receive channel open from transfer channel");
    }

    @Override // defpackage.izv
    public final void d(defpackage.jcu jcuVar, defpackage.izu izuVar) {
        throw null;
    }

    @Override // defpackage.jdd
    public final void e() {
        throw new java.lang.UnsupportedOperationException("Cannot receive channel close from transfer channel");
    }

    @Override // defpackage.jdd
    public final void f() {
        throw new java.lang.UnsupportedOperationException("Cannot receive message sent from transfer channel");
    }
}
