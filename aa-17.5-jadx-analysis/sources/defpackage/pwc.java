package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class pwc implements pwd {
    public final qsb d;
    private final Executor e;
    private final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public volatile boolean c = false;
    public final zhc a = new zhc();

    public pwc(qsb qsbVar, Executor executor) {
        this.d = qsbVar;
        this.e = executor;
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.k;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uzy] */
    @Override // defpackage.pwd
    public final pwn c() {
        if (!this.f.getAndSet(true)) {
            qsb qsbVar = this.d;
            Executor executor = this.e;
            vah vahVar = new vah(qsbVar, this, 1);
            qsbVar.c.d(vahVar, executor);
            qsbVar.d.put(this, vahVar);
        }
        return new pwn("NonDefaultClientParametersReady", Boolean.toString(this.c));
    }

    @Override // defpackage.pwd
    public final zgp d() {
        zgp zgpVarZ;
        pwn pwnVarC = c();
        if (Boolean.parseBoolean((String) pwnVarC.b)) {
            return wub.Y(pwnVarC);
        }
        synchronized (this) {
            zgpVarZ = wub.Z(this.a);
        }
        return zgpVarZ;
    }

    @Override // defpackage.pwd
    public final /* synthetic */ void e() {
    }
}
