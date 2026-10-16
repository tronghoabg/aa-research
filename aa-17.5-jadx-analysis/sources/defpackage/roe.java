package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class roe {
    public final qxa a;
    public volatile qry b;
    public final Handler c;
    public final qxc d;
    private final Handler.Callback e;

    public roe(qxa qxaVar, Looper looper) {
        gly glyVar = new gly(this, 11);
        this.e = glyVar;
        this.c = new sss(looper, glyVar);
        this.a = qxaVar;
        this.d = new qxc(this);
    }

    public final void a() {
        this.b = null;
    }

    @ResultIgnorabilityUnspecified
    public final boolean b(int i) throws IllegalStateException, qrz, IllegalArgumentException {
        try {
            return this.a.k(this.d, i);
        } catch (RemoteException e) {
            olm.h(e);
            return false;
        } catch (IllegalStateException e2) {
            olm.f(e2);
            return false;
        }
    }

    public final void c(int i, int i2) throws qrz, SecurityException, IllegalArgumentException {
        try {
            this.a.i(this.d, i, 0, i2);
        } catch (RemoteException e) {
            olm.h(e);
        } catch (IllegalStateException e2) {
            olm.f(e2);
        }
    }
}
