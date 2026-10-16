package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zgf implements Runnable {
    final zgp a;
    final zge b;

    public zgf(zgp zgpVar, zge zgeVar) {
        this.a = zgpVar;
        this.b = zgeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thJ;
        zgp zgpVar = this.a;
        if ((zgpVar instanceof zhm) && (thJ = ((zhm) zgpVar).j()) != null) {
            this.b.a(thJ);
            return;
        }
        try {
            woy.ad(zgpVar.isDone(), "Future was expected to be done: %s", zgpVar);
            this.b.b(a.L(zgpVar));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.a(this.b);
        return xxgVarAo.toString();
    }
}
