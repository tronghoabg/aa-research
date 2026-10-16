package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
abstract class zfo extends zgn {
    private final Executor a;
    final /* synthetic */ zfp b;

    public zfo(zfp zfpVar, Executor executor) {
        this.b = zfpVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.zgn
    public final void d(Throwable th) {
        zfp zfpVar = this.b;
        zfpVar.b = null;
        if (th instanceof ExecutionException) {
            zfpVar.p(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zfpVar.cancel(false);
        } else {
            zfpVar.p(th);
        }
    }

    @Override // defpackage.zgn
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.p(e);
        }
    }

    @Override // defpackage.zgn
    public final boolean g() {
        return this.b.isDone();
    }
}
