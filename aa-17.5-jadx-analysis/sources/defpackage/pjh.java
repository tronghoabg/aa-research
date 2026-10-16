package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class pjh implements pwd {
    public zhc a;
    piz b;
    final tmb c;
    private volatile pje d;
    private volatile pww e;
    private final AtomicReference f = new AtomicReference(pjg.a);
    private final psj g;

    public pjh(tmb tmbVar, psj psjVar) {
        this.c = tmbVar;
        this.g = psjVar;
    }

    private final void f() {
        AtomicReference atomicReference = this.f;
        pjg pjgVar = pjg.a;
        pjg pjgVar2 = pjg.b;
        if (a.h(atomicReference, pjgVar, pjgVar2)) {
            psj psjVar = this.g;
            yfy yfyVar = ylx.a;
            ygs ygsVar = new ygs();
            psb psbVar = psb.DANGEROUS_PUBLISHER_THREAD;
            ygsVar.b(pja.class, new pji(0, pja.class, this, psbVar, pji.b(psbVar, yfyVar)));
            ygsVar.b(pjf.class, new pji(1, pjf.class, this, psbVar, pji.b(psbVar, yfyVar)));
            ygsVar.b(pjd.class, new pji(2, pjd.class, this, psbVar, pji.b(psbVar, yfyVar)));
            psjVar.d(this, ygsVar.a());
            if (a.h(atomicReference, pjgVar2, pjg.c)) {
                return;
            }
            woy.Z(atomicReference.get() == pjg.d);
        }
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.h;
    }

    public final pwn b() {
        piz pizVar = this.b;
        if (pizVar == null) {
            return null;
        }
        tmb tmbVar = this.c;
        Duration duration = Duration.ZERO;
        if (pizVar.b().plus(pww.a).compareTo(Duration.ofMillis(tmbVar.a()).plus(duration)) < 0) {
            return null;
        }
        return c();
    }

    @Override // defpackage.pwd
    public final pwn c() {
        piz pizVar;
        f();
        synchronized (this) {
            pizVar = this.b;
        }
        ArrayList arrayList = new ArrayList(4);
        if (pizVar != null) {
            arrayList.add(pizVar);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new pwn("X-Geo", arrayList);
    }

    @Override // defpackage.pwd
    public final zgp d() {
        f();
        synchronized (this) {
            pwn pwnVarB = b();
            if (pwnVarB != null) {
                return wub.Y(pwnVarB);
            }
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
    public final void e() {
    }
}
