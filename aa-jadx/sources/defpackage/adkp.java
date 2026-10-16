package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class adkp {
    static final defpackage.adkq a;

    static {
        defpackage.adkq adoyVar;
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        try {
            adoyVar = (defpackage.adkq) java.lang.Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(defpackage.adkq.class).getConstructor(null).newInstance(null);
        } catch (java.lang.ClassNotFoundException e) {
            atomicReference.set(e);
            adoyVar = new defpackage.adoy();
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException("Storage override failed to initialize", e2);
        }
        a = adoyVar;
        java.lang.Throwable th = (java.lang.Throwable) atomicReference.get();
        if (th != null) {
            defpackage.adkr.c.logp(java.util.logging.Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
