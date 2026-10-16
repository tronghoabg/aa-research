package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rps {
    private final java.util.function.Consumer a;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);

    public rps(java.util.function.Consumer consumer) {
        this.a = consumer;
    }

    public static java.lang.Object f(defpackage.rzz rzzVar) throws android.os.RemoteException {
        try {
            return rzzVar.call();
        } catch (java.lang.IllegalStateException e) {
            if ("CarNotSupported".equals(e.getMessage())) {
                return null;
            }
            throw e;
        }
    }

    public static void l(defpackage.saa saaVar) {
        try {
            saaVar.a();
        } catch (android.os.RemoteException unused) {
        } catch (java.lang.IllegalStateException e) {
            if (!"CarNotSupported".equals(e.getMessage()) && !"CarNotConnected".equals(e.getMessage())) {
                throw e;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final java.lang.Object a(defpackage.rzz rzzVar) throws defpackage.qsu, defpackage.qst, rlo {
        try {
            return rzzVar.call();
        } catch (android.os.RemoteException | java.lang.IllegalStateException e) {
            if (e instanceof android.os.RemoteException) {
                j((android.os.RemoteException) e);
            }
            if (e instanceof java.lang.IllegalStateException) {
                defpackage.oml.H((java.lang.IllegalStateException) e);
            }
            throw new java.lang.RuntimeException("Unexpected exception", e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final java.lang.Object b(defpackage.rzz rzzVar) throws defpackage.qst, rlo {
        try {
            return rzzVar.call();
        } catch (android.os.RemoteException | java.lang.IllegalStateException e) {
            h(e);
            throw new java.lang.RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.lang.Object c(defpackage.rzz rzzVar) {
        try {
            return rzzVar.call();
        } catch (android.os.RemoteException e) {
            i(e);
            return null;
        }
    }

    public final java.lang.Object d(defpackage.rzz rzzVar, java.lang.Object obj) {
        try {
            return rzzVar.call();
        } catch (android.os.RemoteException e) {
            i(e);
            return obj;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final java.lang.Object e(defpackage.rzz rzzVar) throws defpackage.qst, rlo {
        try {
            return rzzVar.call();
        } catch (android.os.RemoteException e) {
            j(e);
            throw new java.lang.RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    public final void g(defpackage.saa saaVar) throws defpackage.qst {
        try {
            saaVar.a();
        } catch (android.os.RemoteException | java.lang.IllegalStateException e) {
            h(e);
            throw new java.lang.RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final void h(java.lang.Exception exc) throws defpackage.qst, rlo {
        if (exc instanceof android.os.RemoteException) {
            j((android.os.RemoteException) exc);
        }
        if (exc instanceof java.lang.IllegalStateException) {
            defpackage.oml.G((java.lang.IllegalStateException) exc);
        }
        throw new java.lang.RuntimeException("Unexpected exception", exc);
    }

    public final void i(android.os.RemoteException remoteException) {
        if (defpackage.omv.c("CAR.CLIENT", 4)) {
            defpackage.rrx.d(4, "CAR.CLIENT", null, "Remote exception from car service: %s", remoteException.getMessage());
        }
        if (!this.b.getAndSet(true)) {
            a$.ExternalSyntheticApiModelOutline2.m(this.a, remoteException);
        } else if (defpackage.omv.c("CAR.CLIENT", 3)) {
            defpackage.rrx.a("CAR.CLIENT", null, "Already handling a remote exception, ignoring");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final void j(android.os.RemoteException remoteException) throws defpackage.qst, rlo {
        i(remoteException);
        defpackage.oml.I(remoteException);
    }

    public final void k(defpackage.saa saaVar) throws defpackage.qst {
        try {
            saaVar.a();
        } catch (android.os.RemoteException e) {
            j(e);
            throw new java.lang.RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }
}
