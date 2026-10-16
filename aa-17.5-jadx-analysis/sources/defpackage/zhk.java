package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public final class zhk extends zga implements RunnableFuture {
    private volatile zgn a;

    public zhk(zfj zfjVar) {
        this.a = new zhi(this, zfjVar);
    }

    @Override // defpackage.zeu
    protected final void b() {
        zgn zgnVar;
        if (q() && (zgnVar = this.a) != null) {
            zgnVar.h();
        }
        this.a = null;
    }

    @Override // defpackage.zeu
    protected final String fO() {
        zgn zgnVar = this.a;
        return zgnVar != null ? a.bW(zgnVar, "task=[", "]") : super.fO();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zgn zgnVar = this.a;
        if (zgnVar != null) {
            zgnVar.run();
        }
        this.a = null;
    }

    public zhk(Callable callable) {
        this.a = new zhj(this, callable);
    }
}
