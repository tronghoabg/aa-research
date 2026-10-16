package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
final class adjo {
    static final adjp a;

    static {
        adjp adnxVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            adnxVar = (adjp) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(adjp.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            adnxVar = new adnx();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = adnxVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            adjq.c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
