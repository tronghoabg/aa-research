package defpackage;

import android.accounts.Account;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pvu implements pwd {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/network/requirements/AuthRequirement");
    public final Executor b;
    public volatile xxh c;
    private zhc e;
    private final Executor f;
    private final ackk g;
    private final psj j;
    private final sm k;
    private int i = 1;
    private final vae h = new pqf(this, 2);
    public volatile Map d = new HashMap();

    public pvu(psj psjVar, sm smVar, Executor executor, Executor executor2, xxh xxhVar, Account account) {
        this.j = psjVar;
        this.k = smVar;
        this.b = executor;
        this.f = executor2;
        this.g = (ackk) xxhVar.e();
        this.c = xxh.g(account);
    }

    private final synchronized void k() {
        if (this.i == 1) {
            psj psjVar = this.j;
            yfy yfyVar = ylx.a;
            ygs ygsVar = new ygs();
            psb psbVar = psb.DANGEROUS_PUBLISHER_THREAD;
            ygsVar.b(ptd.class, new pvw(ptd.class, this, psbVar, pvw.b(psbVar, yfyVar)));
            psjVar.d(this, ygsVar.a());
            sm smVar = this.k;
            smVar.y().d(this.h, this.b);
            this.i = 2;
        }
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.e;
    }

    final synchronized Account b() {
        if (!this.c.f()) {
            return null;
        }
        return (Account) this.c.b();
    }

    @Override // defpackage.pwd
    @ResultIgnorabilityUnspecified
    public final pwn c() {
        pte pteVar;
        String strD;
        k();
        synchronized (this) {
            if (!this.c.f() || (pteVar = (pte) this.d.get(this.c.b())) == null || (strD = pteVar.d()) == null) {
                return null;
            }
            return new pwn("Authorization", strD);
        }
    }

    @Override // defpackage.pwd
    public final synchronized zgp d() {
        zgp zgpVarZ;
        pte pteVar;
        pwn pwnVarC = c();
        if (pwnVarC != null) {
            return wub.Y(pwnVarC);
        }
        if (this.c.f() && (pteVar = (pte) this.d.get(this.c.b())) != null) {
            pteVar.e();
        }
        synchronized (this) {
            zhc zhcVar = this.e;
            if (zhcVar == null) {
                zhcVar = new zhc();
                this.e = zhcVar;
            }
            zgpVarZ = wub.Z(zhcVar);
        }
        return zgpVarZ;
    }

    public final synchronized void f(pte pteVar) {
        if (pteVar != null) {
            if (this.c.f()) {
                ackk ackkVar = this.g;
                boolean z = false;
                if (ackkVar != null && ((aaoj) ((pnj) ackkVar.a()).a()).r) {
                    z = true;
                }
                if (pteVar.f()) {
                    wub.ah(pteVar.b(), new pvt(this, z), this.b);
                    return;
                }
                String strD = pteVar.d();
                if (strD != null) {
                    h(strD);
                } else {
                    this.f.execute(new lvn(this, pteVar, z, 3));
                }
            }
        }
    }

    public final void g(Throwable th) {
        zhc zhcVar;
        synchronized (this) {
            zhcVar = this.e;
            if (zhcVar != null) {
                this.e = null;
            } else {
                zhcVar = null;
            }
        }
        if (zhcVar != null) {
            zhcVar.p(th);
        }
    }

    public final void h(String str) {
        zhc zhcVar;
        synchronized (this) {
            zhcVar = this.e;
            if (zhcVar != null) {
                this.e = null;
            } else {
                zhcVar = null;
            }
        }
        if (zhcVar != null) {
            zhcVar.o(new pwn("Authorization", str));
        }
    }

    public final synchronized void i() {
        if (this.i == 2) {
            this.j.e(this);
            sm smVar = this.k;
            smVar.y().f(this.h);
            this.i = 3;
        }
    }

    public final synchronized void j() {
        pte pteVar;
        String strD;
        if (!this.c.f() || (pteVar = (pte) this.d.get(this.c.b())) == null || (strD = pteVar.d()) == null) {
            return;
        }
        h(strD);
    }

    @Override // defpackage.pwd
    public final /* synthetic */ void e() {
    }
}
