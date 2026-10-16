package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwr extends defpackage.rvj {
    private static final defpackage.yqk a = defpackage.omv.n("Lite.EP");
    private final defpackage.rvj b;
    private final defpackage.rtk c;
    private defpackage.rwe d;
    private final defpackage.mmi e;

    public rwr(defpackage.rvj rvjVar, defpackage.rtk rtkVar, defpackage.mmi mmiVar) {
        super(rvjVar.m, null, null, rvjVar.n);
        this.b = rvjVar;
        this.c = rtkVar;
        this.e = mmiVar;
    }

    @Override // defpackage.rvj
    protected final void d(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        this.o.a();
        byteBuffer.remaining();
    }

    @Override // defpackage.rtj
    public final void e(int i) {
        this.b.e(i);
    }

    @Override // defpackage.rvj, defpackage.rtj
    public final void h(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferA = defpackage.rwc.a.a(byteBuffer.capacity());
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            byteBufferA.put(byteBuffer);
            byteBufferA.order(byteBuffer.order());
            byteBufferA.position(iPosition);
            byteBufferA.limit(iLimit);
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            super.h(byteBuffer);
            this.b.h(byteBufferA);
        } catch (java.lang.Throwable th) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rwh] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.rvj
    public final void p(defpackage.rtv rtvVar) {
        this.o = rtvVar;
        int iA = rtvVar.a();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iA);
        defpackage.mmi mmiVar = this.e;
        defpackage.rwq rwqVar = new defpackage.rwq(iA, mmiVar.b, this, (android.os.Handler) mmiVar.a.get(numValueOf));
        rwqVar.b.a(rwqVar.a, rwqVar);
        this.d = rwqVar;
        defpackage.rvj rvjVar = this.b;
        rvjVar.p(rwqVar);
        rvjVar.getClass().getName();
        rtvVar.a();
    }

    @Override // defpackage.rvj, defpackage.rtk
    public final void u(int i) {
        a.f().ai(8455).w("Rcvd msg %d:channel closed", this.o.a());
        this.c.u(i);
        this.b.u(i);
    }

    @Override // defpackage.rvj, defpackage.rtk
    public final void v() {
        a.f().ai(8456).w("Rcvd msg %d:channel opened", this.o.a());
        this.c.v();
        this.b.v();
    }

    @Override // defpackage.rvj
    public final void x() {
        defpackage.rwe rweVar = this.d;
        if (rweVar != null) {
            defpackage.rvf rvfVar = (defpackage.rvf) rweVar;
            rvfVar.b.b(rvfVar.a);
            this.d = null;
        }
        super.x();
        this.b.x();
    }
}
