package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class pwk implements pwd {
    private static final pwn a = new pwn("ZwiebackCookieRequirementSatisfied", "true");
    private static final pwn b = new pwn("ZwiebackCookieRequirementSatisfied", "false");
    private final List c = new ArrayList();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicInteger e = new AtomicInteger(0);
    private final ptf f;

    public pwk(ptf ptfVar) {
        this.f = ptfVar;
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.n;
    }

    public final synchronized void b() {
        AtomicInteger atomicInteger = this.e;
        atomicInteger.decrementAndGet();
        boolean zE = this.f.e();
        List list = this.c;
        if (zE) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((zhc) it.next()).o(a);
                atomicInteger.incrementAndGet();
            }
            list.clear();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        ((zhc) list.get(0)).o(a);
        list.remove(0);
        atomicInteger.incrementAndGet();
    }

    @Override // defpackage.pwd
    public final synchronized pwn c() {
        if (!this.d.getAndSet(true)) {
            this.f.c();
        }
        if (!this.f.e() && this.e.get() != 0) {
            return b;
        }
        return a;
    }

    @Override // defpackage.pwd
    public final synchronized zgp d() {
        zhc zhcVar;
        zhcVar = new zhc();
        pwn pwnVarC = c();
        if (Boolean.parseBoolean((String) pwnVarC.b)) {
            this.e.incrementAndGet();
            zhcVar.o(pwnVarC);
        } else {
            this.c.add(zhcVar);
        }
        return zhcVar;
    }

    @Override // defpackage.pwd
    public final /* synthetic */ void e() {
    }
}
