package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aiul implements Executor {
    public final aitu a;

    public aiul(aitu aituVar) {
        this.a = aituVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws aiui {
        aitu aituVar = this.a;
        afcp afcpVar = afcp.a;
        if (ajcb.c(aituVar, afcpVar)) {
            ajcb.b(aituVar, afcpVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
