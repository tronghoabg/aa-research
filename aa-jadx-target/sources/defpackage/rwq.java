package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwq extends defpackage.rvf {
    private static final defpackage.yqk e = defpackage.omv.n("XFER.Lite");
    public final defpackage.rtj d;

    public rwq(int i, defpackage.rwh rwhVar, defpackage.rtj rtjVar, android.os.Handler handler) {
        super(i, rwhVar, handler);
        this.d = rtjVar;
    }

    @Override // defpackage.rwf
    public final void b(defpackage.qug qugVar, java.nio.ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int i = qugVar.d;
        int i2 = qugVar.c;
        this.c.post(new defpackage.ron(this, byteBuffer, 6, null));
    }

    @Override // defpackage.rwf
    public final void c(int i) {
        this.c.post(new defpackage.rhh(this, i, 6, null));
    }

    @Override // defpackage.rwf
    public final void d() {
        this.c.post(new defpackage.qtk(this, 15));
    }

    @Override // defpackage.rtv
    public final void e(java.nio.ByteBuffer byteBuffer, defpackage.rtu rtuVar) {
        byteBuffer.flip();
        char c = (char) byteBuffer.getShort();
        byteBuffer.remaining();
        if (this.b.e(this.a, rtuVar, c, byteBuffer)) {
            return;
        }
        e.h().ai(8454).u("Forward throttled, dropping packet");
    }

    @Override // defpackage.rwf
    public final void f(int i) {
        this.c.post(new defpackage.rhh(this, i, 5, null));
    }
}
