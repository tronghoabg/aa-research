package defpackage;

import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class rox {
    private final Consumer a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public rox(Consumer consumer) {
        this.a = consumer;
    }

    public static Object f(rzd rzdVar) throws RemoteException {
        try {
            return rzdVar.call();
        } catch (IllegalStateException e) {
            if ("CarNotSupported".equals(e.getMessage())) {
                return null;
            }
            throw e;
        }
    }

    public static void l(rze rzeVar) {
        try {
            rzeVar.a();
        } catch (RemoteException unused) {
        } catch (IllegalStateException e) {
            if (!"CarNotSupported".equals(e.getMessage()) && !"CarNotConnected".equals(e.getMessage())) {
                throw e;
            }
        }
    }

    public final Object a(rzd rzdVar) throws qrz, qsa {
        try {
            return rzdVar.call();
        } catch (RemoteException | IllegalStateException e) {
            if (e instanceof RemoteException) {
                this.j((RemoteException) e);
            }
            if (e instanceof IllegalStateException) {
                olm.g((IllegalStateException) e);
            }
            throw new RuntimeException("Unexpected exception", e);
        }
    }

    public final Object b(rzd rzdVar) throws qrz {
        try {
            return rzdVar.call();
        } catch (RemoteException | IllegalStateException e) {
            this.h(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    @ResultIgnorabilityUnspecified
    public final Object c(rzd rzdVar) {
        try {
            return rzdVar.call();
        } catch (RemoteException e) {
            this.i(e);
            return null;
        }
    }

    public final Object d(rzd rzdVar, Object obj) {
        try {
            return rzdVar.call();
        } catch (RemoteException e) {
            this.i(e);
            return obj;
        }
    }

    public final Object e(rzd rzdVar) throws qrz {
        try {
            return rzdVar.call();
        } catch (RemoteException e) {
            this.j(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    public final void g(rze rzeVar) throws qrz {
        try {
            rzeVar.a();
        } catch (RemoteException | IllegalStateException e) {
            h(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    public final void h(Exception exc) throws qrz {
        if (exc instanceof RemoteException) {
            j((RemoteException) exc);
        }
        if (exc instanceof IllegalStateException) {
            olm.f((IllegalStateException) exc);
        }
        throw new RuntimeException("Unexpected exception", exc);
    }

    public final void i(RemoteException remoteException) {
        if (omc.c("CAR.CLIENT", 4)) {
            rrd.d(4, "CAR.CLIENT", null, "Remote exception from car service: %s", remoteException.getMessage());
        }
        if (!this.b.getAndSet(true)) {
            this.a.accept(remoteException);
        } else if (omc.c("CAR.CLIENT", 3)) {
            rrd.a("CAR.CLIENT", null, "Already handling a remote exception, ignoring");
        }
    }

    public final void j(RemoteException remoteException) throws qrz {
        i(remoteException);
        olm.h(remoteException);
    }

    public final void k(rze rzeVar) throws qrz {
        try {
            rzeVar.a();
        } catch (RemoteException e) {
            j(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }
}
