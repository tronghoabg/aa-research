package defpackage;

import android.accounts.Account;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class pwh {
    public final xyc a;
    public final pvu b;
    public final xyc c;
    public final pwk d;
    public final pwi e;
    public final pwa g;
    public final tmb h;
    public final Executor i;
    public final ackk j;
    public Account l;
    private final pwc n;
    private final pvx o;
    private final ackk p;
    private final pwp q;
    public int k = 0;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final xyc f = wub.L(new ojk(this, 19));

    /* JADX WARN: Type inference failed for: r8v6, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [aezk, java.lang.Object] */
    public pwh(ackk ackkVar, pwc pwcVar, ajdr ajdrVar, pwk pwkVar, pwi pwiVar, pvx pvxVar, pwa pwaVar, tmb tmbVar, Executor executor, ackk ackkVar2, ackk ackkVar3, pwp pwpVar) {
        this.a = wub.L(new ojk(ackkVar, 18));
        this.n = pwcVar;
        this.d = pwkVar;
        this.e = pwiVar;
        this.o = pvxVar;
        this.q = pwpVar;
        Account account = pwpVar.f;
        Account account2 = true != lvl.ac(account) ? null : account;
        psj psjVar = (psj) ajdrVar.d.a();
        psjVar.getClass();
        sm smVar = (sm) ajdrVar.b.a();
        smVar.getClass();
        zgt zgtVarB = ((uxv) ajdrVar.a).b();
        zgt zgtVarB2 = ((uxv) ajdrVar.c).b();
        xxh xxhVar = (xxh) ((acks) ajdrVar.e).b;
        xxhVar.getClass();
        this.b = new pvu(psjVar, smVar, zgtVarB, zgtVarB2, xxhVar, account2);
        this.c = wub.L(new ojk(this, 17));
        this.i = executor;
        this.g = pwaVar;
        this.h = tmbVar;
        this.j = ackkVar2;
        this.p = ackkVar3;
    }

    public final pwd a(pwe pweVar) {
        pwd pwdVar = (pwd) ((Map) this.a.gu()).get(pweVar);
        pwdVar.getClass();
        return pwdVar;
    }

    public final Duration b() {
        return Duration.ofMillis(this.h.a());
    }

    public final void c() {
        if (this.m.get()) {
            this.d.b();
            pwi pwiVar = this.e;
            synchronized (pwiVar) {
                if (pwiVar.a != null) {
                    pwn pwnVarC = pwiVar.c();
                    zhc zhcVar = null;
                    if (pwnVarC != null) {
                        zhc zhcVar2 = pwiVar.a;
                        pwiVar.a = null;
                        zhcVar = zhcVar2;
                    }
                    if (zhcVar != null) {
                        zhcVar.o(pwnVarC);
                    }
                }
            }
            this.b.i();
            Iterator it = ((Map) this.a.gu()).values().iterator();
            while (it.hasNext()) {
                ((pwd) it.next()).e();
            }
            ((pwd) this.c.gu()).e();
            ((pwd) this.f.gu()).e();
            this.m.set(false);
        }
    }

    public final boolean d() {
        return ((aaoj) this.p.a()).n;
    }

    public final zgp e() {
        return this.n.d();
    }

    public final zgp f(pwe pweVar) {
        return a(pweVar).d();
    }

    public final void g(udp udpVar) {
        pwn pwnVarC;
        pwp pwpVar = this.q;
        Object obj = udpVar.b;
        if (pwpVar == null || !pwpVar.b.f) {
            pwnVarC = (pwpVar == null || !pwpVar.b.e) ? ((pwd) this.c.gu()).c() : ((pwd) this.f.gu()).c();
        } else {
            ArrayList arrayList = new ArrayList();
            pwn pwnVarC2 = ((pwd) this.c.gu()).c();
            if (pwnVarC2 != null) {
                arrayList.addAll((Collection) pwnVarC2.b);
            }
            pwn pwnVarC3 = ((pwd) this.f.gu()).c();
            if (pwnVarC3 == null) {
                pwnVarC3 = this.o.c();
            }
            if (pwnVarC3 != null) {
                arrayList.addAll((Collection) pwnVarC3.b);
            }
            pwnVarC = !arrayList.isEmpty() ? new pwn("X-Geo", arrayList) : null;
        }
        if (pwnVarC != null || obj != null) {
            udpVar.b = (pwn) woy.ap(pwnVarC, obj);
        }
        pwn pwnVarC4 = ((pwd) this.c.gu()).c();
        if (pwnVarC4 != null) {
        }
        pwn pwnVarB = udpVar.b("Authorization");
        pvu pvuVar = this.b;
        pwn pwnVarC5 = pvuVar.c();
        if (pwnVarC5 == null && pwnVarB == null) {
            return;
        }
        pwn pwnVar = (pwn) woy.ap(pwnVarC5, pwnVarB);
        udpVar.c(pwnVar);
        this.l = pvuVar.b();
    }
}
