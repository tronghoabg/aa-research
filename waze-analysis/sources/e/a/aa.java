package e.a;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    static final ab f46233a;

    static {
        ab emVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            emVar = (ab) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(ab.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e2) {
            atomicReference.set(e2);
            emVar = new em();
        } catch (Exception e3) {
            throw new RuntimeException("Storage override failed to initialize", e3);
        }
        f46233a = emVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            ac.f46234b.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
