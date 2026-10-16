package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
abstract class sll extends slk {
    protected final nok a;

    public sll(int i, nok nokVar) {
        super(i);
        this.a = nokVar;
    }

    @Override // defpackage.slk
    public final void b(Executor executor, Runnable runnable) {
        ((svz) this.a.a).i(executor, new ljd(runnable, 2));
    }

    protected abstract void e(sme smeVar) throws RemoteException;

    @Override // defpackage.slq
    public final void f(Status status) {
        this.a.d(new skw(status));
    }

    @Override // defpackage.slq
    public final void g(Exception exc) {
        this.a.d(exc);
    }

    @Override // defpackage.slq
    public final void h(sme smeVar) throws DeadObjectException {
        try {
            e(smeVar);
        } catch (DeadObjectException e) {
            f(slq.j(e));
            throw e;
        } catch (RemoteException e2) {
            f(slq.j(e2));
        } catch (RuntimeException e3) {
            g(e3);
        }
    }

    @Override // defpackage.slq
    public void i(rju rjuVar, boolean z) {
    }
}
