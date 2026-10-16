package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class pjj implements pwd {
    private zhc a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final psj c;

    public pjj(psj psjVar) {
        this.c = psjVar;
    }

    private final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        psj psjVar = this.c;
        yfy yfyVar = ylx.a;
        ygs ygsVar = new ygs();
        psb psbVar = psb.DANGEROUS_PUBLISHER_THREAD;
        ygsVar.b(pja.class, new pjl(0, pja.class, this, psbVar, pjl.b(psbVar, yfyVar)));
        ygsVar.b(pjc.class, new pjl(1, pjc.class, this, psbVar, pjl.b(psbVar, yfyVar)));
        psjVar.d(this, ygsVar.a());
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.l;
    }

    @Override // defpackage.pwd
    public final pwn c() {
        b();
        synchronized (this) {
        }
        return null;
    }

    @Override // defpackage.pwd
    public final zgp d() {
        b();
        synchronized (this) {
            zhc zhcVar = this.a;
            if (zhcVar != null) {
                return wub.Z(zhcVar);
            }
            zhc zhcVar2 = new zhc();
            this.a = zhcVar2;
            return wub.Z(zhcVar2);
        }
    }

    @Override // defpackage.pwd
    public final /* synthetic */ void e() {
    }
}
