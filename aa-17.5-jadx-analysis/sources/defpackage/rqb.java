package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rqb {
    public static final ypf a = ols.R("CAR.ANALYTICS.CBX");
    private static final Object c = new Object();
    private static volatile rqb d;
    public final AtomicReference b;
    private zgp e;
    private boolean f;
    private final swo g;

    private rqb(Context context) {
        swo swoVar = new swo(context, new swr());
        this.b = new AtomicReference(rqa.a);
        this.f = false;
        this.g = swoVar;
    }

    public static rqb a(Context context) {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new rqb(context);
                }
            }
        }
        return d;
    }

    private final synchronized swo d() {
        return this.g;
    }

    public final synchronized zgp b() {
        zgp zgpVar;
        if (this.f && (zgpVar = this.e) != null) {
            return zgpVar;
        }
        AtomicReference atomicReference = this.b;
        boolean z = true;
        char c2 = 1;
        if (atomicReference.get() != rqa.a) {
            if (atomicReference.get() != rqa.b) {
                z = false;
            }
            return new zgl(Boolean.valueOf(z));
        }
        this.f = true;
        zgp zgpVarAK = spu.aK(d().a());
        kpf kpfVar = new kpf(this, 4);
        zfq zfqVar = zfq.a;
        int i = zfb.c;
        zfa zfaVar = new zfa(zgpVarAK, kpfVar);
        zgpVarAK.c(zfaVar, yrm.aK(zfqVar, zfaVar));
        this.e = zfaVar;
        zfaVar.c(new rsv(this, c2 == true ? 1 : 0), zfqVar);
        return this.e;
    }

    public final synchronized void c() {
        this.f = false;
    }
}
