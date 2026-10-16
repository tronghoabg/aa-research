package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rvj implements defpackage.rtj {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    private final defpackage.rti b;
    public volatile boolean l = false;
    public final int m;
    public final int n;
    public defpackage.rtv o;
    protected final defpackage.rvm p;

    public rvj(int i, defpackage.rti rtiVar, defpackage.rvm rvmVar, int i2) {
        this.m = i;
        this.b = rtiVar;
        this.n = i2;
        this.p = rvmVar;
    }

    private final void i(int i, boolean z, java.nio.ByteBuffer byteBuffer) {
        if (this.l) {
            return;
        }
        try {
            m(byteBuffer, z);
        } catch (java.lang.IllegalStateException unused) {
            a.g().ai(8367).w("Failed to send message type = %d because channel was closed", i);
        }
    }

    protected abstract void d(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp;

    @Override // defpackage.rtj
    public void h(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 2) {
            a.f().ai(8366).u("Received message without type header.");
            return;
        }
        char c = (char) byteBuffer.getShort();
        try {
            d(c, byteBuffer);
        } catch (defpackage.abpp | defpackage.abqw e) {
            java.lang.String strEncodeToString = android.util.Base64.encodeToString(byteBuffer.array(), byteBuffer.arrayOffset() + 2, byteBuffer.limit() - 2, 0);
            if (strEncodeToString.length() > 100) {
                strEncodeToString = "<encoded message too long to log>";
            }
            a.g().p(e).ai(8365).R("Received invalid protocol buffer. Message Type: %d, Service Type: %d, Message: %s", java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(this.m), strEncodeToString);
        }
        defpackage.rwc.a.b(byteBuffer);
    }

    protected final void m(java.nio.ByteBuffer byteBuffer, boolean z) {
        defpackage.rtv rtvVar = this.o;
        rtvVar.getClass();
        rtvVar.e(byteBuffer, new defpackage.rtu(z, false, 0));
    }

    public final void n(int i, byte[] bArr, boolean z, int i2, int i3) {
        java.nio.ByteBuffer byteBufferA = defpackage.rwc.a.a(bArr.length + 2);
        byteBufferA.putShort((short) i);
        byteBufferA.put(bArr, i2, i3);
        i(i, z, byteBufferA);
    }

    public final void o(int i, defpackage.abpy abpyVar, boolean z) {
        java.nio.ByteBuffer byteBufferA = defpackage.rwc.a.a(abpyVar.m() + 2);
        byteBufferA.putShort((short) i);
        defpackage.abof abofVarH = defpackage.abof.H(byteBufferA);
        try {
            abpyVar.R(abofVarH);
            abofVarH.c();
            i(i, z, byteBufferA);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + abpyVar.getClass().getName() + " threw an IOException (should never happen)", e);
        }
    }

    public void p(defpackage.rtv rtvVar) {
        this.o = rtvVar;
    }

    @Override // defpackage.rtk
    public void v() {
        defpackage.yqk yqkVar = a;
        defpackage.ypu ypuVarAi = yqkVar.l().ai(8363);
        defpackage.rti rtiVar = this.b;
        ypuVarAi.y("onChannelOpened() for service %s", rtiVar);
        if (rtiVar != null) {
            rtiVar.l(this);
        } else {
            yqkVar.l().ai(8364).y("skipping onEndPointReady() for endpoint %s", this);
        }
    }

    public void w(android.os.Bundle bundle) {
        throw new java.lang.UnsupportedOperationException("Cannot suspend endpoint");
    }

    public void x() {
        this.l = true;
    }

    public defpackage.rws y() {
        int i = this.m;
        defpackage.rws rwsVar = defpackage.rws.DEFAULT;
        if (i != 2) {
            return (i == 3 || i == 4 || i == 5) ? defpackage.rws.AUDIO : rwsVar;
        }
        return defpackage.rws.VIDEO;
    }

    @Override // defpackage.rtk
    public void u(int i) {
    }
}
