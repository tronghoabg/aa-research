package defpackage;

import android.os.Bundle;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class ruq implements rsp {
    private static final ypf a = ols.R("CAR.GAL.GAL");
    private final rso b;
    public volatile boolean l = false;
    public final int m;
    public final int n;
    public rtc o;
    protected final rut p;

    public ruq(int i, rso rsoVar, rut rutVar, int i2) {
        this.m = i;
        this.b = rsoVar;
        this.n = i2;
        this.p = rutVar;
    }

    private final void i(int i, boolean z, ByteBuffer byteBuffer) {
        if (this.l) {
            return;
        }
        try {
            m(byteBuffer, z);
        } catch (IllegalStateException unused) {
            a.g().ai(8342).w("Failed to send message type = %d because channel was closed", i);
        }
    }

    protected abstract void d(int i, ByteBuffer byteBuffer) throws abon;

    @Override // defpackage.rsp
    public void h(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 2) {
            a.f().ai(8341).u("Received message without type header.");
            return;
        }
        char c = (char) byteBuffer.getShort();
        try {
            d(c, byteBuffer);
        } catch (abon | abpu e) {
            String strEncodeToString = Base64.encodeToString(byteBuffer.array(), byteBuffer.arrayOffset() + 2, byteBuffer.limit() - 2, 0);
            if (strEncodeToString.length() > 100) {
                strEncodeToString = "<encoded message too long to log>";
            }
            a.g().p(e).ai(8340).R("Received invalid protocol buffer. Message Type: %d, Service Type: %d, Message: %s", Integer.valueOf(c), Integer.valueOf(this.m), strEncodeToString);
        }
        rvj.a.b(byteBuffer);
    }

    protected final void m(ByteBuffer byteBuffer, boolean z) {
        rtc rtcVar = this.o;
        rtcVar.getClass();
        rtcVar.e(byteBuffer, new rtb(z, false, 0));
    }

    public final void n(int i, byte[] bArr, boolean z, int i2, int i3) {
        ByteBuffer byteBufferA = rvj.a.a(bArr.length + 2);
        byteBufferA.putShort((short) i);
        byteBufferA.put(bArr, i2, i3);
        i(i, z, byteBufferA);
    }

    public final void o(int i, abow abowVar, boolean z) {
        ByteBuffer byteBufferA = rvj.a.a(abowVar.m() + 2);
        byteBufferA.putShort((short) i);
        abnd abndVarH = abnd.H(byteBufferA);
        try {
            abowVar.R(abndVarH);
            abndVarH.c();
            i(i, z, byteBufferA);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + abowVar.getClass().getName() + " threw an IOException (should never happen)", e);
        }
    }

    public void p(rtc rtcVar) {
        this.o = rtcVar;
    }

    @Override // defpackage.rsq
    public void v() {
        ypf ypfVar = a;
        yop yopVarAi = ypfVar.l().ai(8338);
        rso rsoVar = this.b;
        yopVarAi.y("onChannelOpened() for service %s", rsoVar);
        if (rsoVar != null) {
            rsoVar.l(this);
        } else {
            ypfVar.l().ai(8339).y("skipping onEndPointReady() for endpoint %s", this);
        }
    }

    public void w(Bundle bundle) {
        throw new UnsupportedOperationException("Cannot suspend endpoint");
    }

    public void x() {
        this.l = true;
    }

    public rvz y() {
        int i = this.m;
        return i != 2 ? (i == 3 || i == 4 || i == 5) ? rvz.AUDIO : rvz.DEFAULT : rvz.VIDEO;
    }

    @Override // defpackage.rsq
    public void u(int i) {
    }
}
