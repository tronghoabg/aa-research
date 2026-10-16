package defpackage;

import android.os.Handler;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rvy extends ruq {
    private static final ypf a = ols.R("Lite.EP");
    private final ruq b;
    private final rsq c;
    private rvl d;
    private final mmc e;

    public rvy(ruq ruqVar, rsq rsqVar, mmc mmcVar) {
        super(ruqVar.m, null, null, ruqVar.n);
        this.b = ruqVar;
        this.c = rsqVar;
        this.e = mmcVar;
    }

    @Override // defpackage.ruq
    protected final void d(int i, ByteBuffer byteBuffer) throws abon {
        this.o.a();
        byteBuffer.remaining();
    }

    @Override // defpackage.rsp
    public final void e(int i) {
        this.b.e(i);
    }

    @Override // defpackage.ruq, defpackage.rsp
    public final void h(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA = rvj.a.a(byteBuffer.capacity());
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
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rvo] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ruq
    public final void p(rtc rtcVar) {
        this.o = rtcVar;
        int iA = rtcVar.a();
        Integer numValueOf = Integer.valueOf(iA);
        mmc mmcVar = this.e;
        rvx rvxVar = new rvx(iA, mmcVar.b, this, (Handler) mmcVar.a.get(numValueOf));
        rvxVar.b.a(rvxVar.a, rvxVar);
        this.d = rvxVar;
        ruq ruqVar = this.b;
        ruqVar.p(rvxVar);
        ruqVar.getClass().getName();
        rtcVar.a();
    }

    @Override // defpackage.ruq, defpackage.rsq
    public final void u(int i) {
        a.f().ai(8430).w("Rcvd msg %d:channel closed", this.o.a());
        this.c.u(i);
        this.b.u(i);
    }

    @Override // defpackage.ruq, defpackage.rsq
    public final void v() {
        a.f().ai(8431).w("Rcvd msg %d:channel opened", this.o.a());
        this.c.v();
        this.b.v();
    }

    @Override // defpackage.ruq
    public final void x() {
        rvl rvlVar = this.d;
        if (rvlVar != null) {
            rum rumVar = (rum) rvlVar;
            rumVar.b.b(rumVar.a);
            this.d = null;
        }
        super.x();
        this.b.x();
    }
}
