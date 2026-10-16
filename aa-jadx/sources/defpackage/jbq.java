package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jbq implements defpackage.ize {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    private final defpackage.izd b;
    public volatile boolean t = false;
    public final int u;
    public final int v;
    public defpackage.izv w;
    protected final defpackage.jbu x;

    public jbq(int i, defpackage.izd izdVar, defpackage.jbu jbuVar, int i2) {
        this.u = i;
        this.b = izdVar;
        this.v = i2;
        this.x = jbuVar;
    }

    private final void h(int i, boolean z, defpackage.jcu jcuVar, j$.util.Optional optional, j$.util.OptionalInt optionalInt) {
        if (this.t) {
            return;
        }
        try {
            m(jcuVar, z, optional, optionalInt);
        } catch (java.lang.IllegalStateException unused) {
            a.g().ai(1791).w("Failed to send message type = %d because channel was closed", i);
        }
    }

    @Override // defpackage.izg
    public void Q() {
        defpackage.yqk yqkVar = a;
        defpackage.ypu ypuVarAi = yqkVar.l().ai(1787);
        defpackage.izd izdVar = this.b;
        ypuVarAi.y("onChannelOpened() for service %s", izdVar);
        if (izdVar != null) {
            izdVar.r(this);
        } else {
            yqkVar.l().ai(1788).y("skipping onEndPointReady() for endpoint %s", this);
        }
    }

    @Override // defpackage.ize
    public void S(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 2) {
            a.f().ai(1790).u("Received message without type header.");
            return;
        }
        char c = (char) byteBuffer.getShort();
        try {
            a(c, byteBuffer);
        } catch (defpackage.abpp | defpackage.abqw e) {
            java.lang.String strEncodeToString = android.util.Base64.encodeToString(byteBuffer.array(), byteBuffer.arrayOffset() + 2, byteBuffer.limit() - 2, 0);
            if (strEncodeToString.length() > 100) {
                strEncodeToString = "<encoded message too long to log>";
            }
            a.g().p(e).ai(1789).R("Received invalid protocol buffer. Message Type: %d, Service Type: %d, Message: %s", java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(this.u), strEncodeToString);
        }
    }

    protected abstract void a(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp;

    public void g() {
        this.t = true;
    }

    public defpackage.jei j() {
        int i = this.u;
        defpackage.jei jeiVar = defpackage.jei.DEFAULT;
        if (i == 2) {
            return defpackage.jei.VIDEO;
        }
        if (i == 3 || i == 4) {
            return defpackage.jei.AUDIO_GUIDANCE;
        }
        return i != 5 ? jeiVar : defpackage.jei.AUDIO_MEDIA;
    }

    public final void k(int i, defpackage.abpy abpyVar) {
        o(i, abpyVar, true, j$.util.Optional.empty(), j$.util.OptionalInt.empty());
    }

    public final void l(int i, defpackage.abpy abpyVar, j$.util.OptionalInt optionalInt) {
        o(i, abpyVar, true, j$.util.Optional.empty(), optionalInt);
    }

    protected final void m(defpackage.jcu jcuVar, boolean z, j$.util.Optional optional, j$.util.OptionalInt optionalInt) {
        defpackage.izv izvVar = this.w;
        izvVar.getClass();
        izvVar.d(jcuVar, new defpackage.izu(z, false, optionalInt.orElse(0), optional));
    }

    public final void n(int i, byte[] bArr, boolean z, int i2, int i3) {
        defpackage.jcu jcuVar = new defpackage.jcu(java.nio.ByteBuffer.allocate(bArr.length + 2), null, false);
        jcuVar.v((short) i);
        jcuVar.t(bArr, i2, i3);
        h(i, z, jcuVar, j$.util.Optional.empty(), j$.util.OptionalInt.empty());
    }

    public final void o(int i, defpackage.abpy abpyVar, boolean z, j$.util.Optional optional, j$.util.OptionalInt optionalInt) {
        defpackage.jcu jcuVar = new defpackage.jcu(java.nio.ByteBuffer.allocate(abpyVar.m() + 2), null, false);
        jcuVar.v((short) i);
        defpackage.abof abofVarH = defpackage.abof.H(jcuVar.h());
        try {
            abpyVar.R(abofVarH);
            abofVarH.c();
            h(i, z, jcuVar, optional, optionalInt);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + abpyVar.getClass().getName() + " threw an IOException (should never happen)", e);
        }
    }

    public void p(defpackage.izv izvVar) {
        this.w = izvVar;
    }

    public final void q(byte[] bArr) {
        n(1, bArr, true, 0, bArr.length);
    }

    @Override // defpackage.izg
    public void P(int i) {
    }

    @Override // defpackage.ize
    public void R(int i) {
    }
}
