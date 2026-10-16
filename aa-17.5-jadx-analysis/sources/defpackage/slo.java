package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class slo extends slk {
    private final snc a;
    private final nok b;

    public slo(int i, snc sncVar, nok nokVar) {
        super(i);
        this.b = nokVar;
        this.a = sncVar;
        if (i == 2 && sncVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.slk
    public final int a(sme smeVar) {
        return this.a.c;
    }

    @Override // defpackage.slk
    public final void b(Executor executor, Runnable runnable) {
        ((svz) this.b.a).i(executor, new ljd(runnable, 3));
    }

    @Override // defpackage.slk
    public final boolean c(sme smeVar) {
        return this.a.b;
    }

    @Override // defpackage.slk
    public final Feature[] d(sme smeVar) {
        return this.a.a;
    }

    @Override // defpackage.slq
    public final void f(Status status) {
        this.b.d(oni.k(status));
    }

    @Override // defpackage.slq
    public final void g(Exception exc) {
        this.b.d(exc);
    }

    @Override // defpackage.slq
    public final void h(sme smeVar) throws DeadObjectException {
        try {
            snc sncVar = this.a;
            sncVar.d.a.a(smeVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            f(slq.j(e2));
        } catch (RuntimeException e3) {
            g(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.slq
    public final void i(rju rjuVar, boolean z) {
        ?? r0 = rjuVar.b;
        nok nokVar = this.b;
        r0.put(nokVar, Boolean.valueOf(z));
        ((svz) nokVar.a).m(new sma(rjuVar, nokVar));
    }
}
