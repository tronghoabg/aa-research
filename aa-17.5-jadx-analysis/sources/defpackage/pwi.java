package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class pwi implements pwd {
    public zhc a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final ptf c;

    public pwi(ptf ptfVar) {
        this.c = ptfVar;
    }

    private final synchronized void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.c.c();
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.m;
    }

    @Override // defpackage.pwd
    public final synchronized pwn c() {
        b();
        ptf ptfVar = this.c;
        if (!ptfVar.e()) {
            return null;
        }
        return new pwn("ZwiebackCookie", ptfVar.a());
    }

    @Override // defpackage.pwd
    public final synchronized zgp d() {
        pwn pwnVarC = c();
        if (pwnVarC != null) {
            return wub.Y(pwnVarC);
        }
        zhc zhcVar = this.a;
        if (zhcVar == null) {
            zhcVar = new zhc();
            this.a = zhcVar;
        }
        return wub.Z(zhcVar);
    }

    @Override // defpackage.pwd
    public final /* synthetic */ void e() {
    }
}
