package defpackage;

import android.util.Base64;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class jbj implements iyx {
    private static final ypf a = ols.R("CAR.GAL.GAL");
    private final iyw b;
    public volatile boolean t = false;
    public final int u;
    public final int v;
    public izo w;
    protected final jbn x;

    public jbj(int i, iyw iywVar, jbn jbnVar, int i2) {
        this.u = i;
        this.b = iywVar;
        this.v = i2;
        this.x = jbnVar;
    }

    private final void h(int i, boolean z, jcn jcnVar, Optional optional, OptionalInt optionalInt) {
        if (this.t) {
            return;
        }
        try {
            m(jcnVar, z, optional, optionalInt);
        } catch (IllegalStateException unused) {
            a.g().ai(1791).w("Failed to send message type = %d because channel was closed", i);
        }
    }

    @Override // defpackage.iyz
    public void Q() {
        ypf ypfVar = a;
        yop yopVarAi = ypfVar.l().ai(1787);
        iyw iywVar = this.b;
        yopVarAi.y("onChannelOpened() for service %s", iywVar);
        if (iywVar != null) {
            iywVar.r(this);
        } else {
            ypfVar.l().ai(1788).y("skipping onEndPointReady() for endpoint %s", this);
        }
    }

    @Override // defpackage.iyx
    public void S(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 2) {
            a.f().ai(1790).u("Received message without type header.");
            return;
        }
        char c = (char) byteBuffer.getShort();
        try {
            a(c, byteBuffer);
        } catch (abon | abpu e) {
            String strEncodeToString = Base64.encodeToString(byteBuffer.array(), byteBuffer.arrayOffset() + 2, byteBuffer.limit() - 2, 0);
            if (strEncodeToString.length() > 100) {
                strEncodeToString = "<encoded message too long to log>";
            }
            a.g().p(e).ai(1789).R("Received invalid protocol buffer. Message Type: %d, Service Type: %d, Message: %s", Integer.valueOf(c), Integer.valueOf(this.u), strEncodeToString);
        }
    }

    protected abstract void a(int i, ByteBuffer byteBuffer) throws abon;

    public void g() {
        this.t = true;
    }

    public jeb j() {
        int i = this.u;
        return i != 2 ? (i == 3 || i == 4) ? jeb.AUDIO_GUIDANCE : i != 5 ? jeb.DEFAULT : jeb.AUDIO_MEDIA : jeb.VIDEO;
    }

    public final void k(int i, abow abowVar) {
        o(i, abowVar, true, Optional.empty(), OptionalInt.empty());
    }

    public final void l(int i, abow abowVar, OptionalInt optionalInt) {
        o(i, abowVar, true, Optional.empty(), optionalInt);
    }

    protected final void m(jcn jcnVar, boolean z, Optional optional, OptionalInt optionalInt) {
        izo izoVar = this.w;
        izoVar.getClass();
        izoVar.d(jcnVar, new izn(z, false, optionalInt.orElse(0), optional));
    }

    public final void n(int i, byte[] bArr, boolean z, int i2, int i3) {
        jcn jcnVar = new jcn(ByteBuffer.allocate(bArr.length + 2), null, false);
        jcnVar.v((short) i);
        jcnVar.t(bArr, i2, i3);
        h(i, z, jcnVar, Optional.empty(), OptionalInt.empty());
    }

    public final void o(int i, abow abowVar, boolean z, Optional optional, OptionalInt optionalInt) {
        jcn jcnVar = new jcn(ByteBuffer.allocate(abowVar.m() + 2), null, false);
        jcnVar.v((short) i);
        abnd abndVarH = abnd.H(jcnVar.h());
        try {
            abowVar.R(abndVarH);
            abndVarH.c();
            h(i, z, jcnVar, optional, optionalInt);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + abowVar.getClass().getName() + " threw an IOException (should never happen)", e);
        }
    }

    public void p(izo izoVar) {
        this.w = izoVar;
    }

    public final void q(byte[] bArr) {
        n(1, bArr, true, 0, bArr.length);
    }

    @Override // defpackage.iyz
    public void P(int i) {
    }

    @Override // defpackage.iyx
    public void R(int i) {
    }
}
