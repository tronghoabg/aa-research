package md;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: md.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3547o {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3548p f40706a;

    static {
        AbstractC3548p o0Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            o0Var = (AbstractC3548p) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(AbstractC3548p.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e7) {
            atomicReference.set(e7);
            o0Var = new o0();
        } catch (Exception e10) {
            throw new RuntimeException("Storage override failed to initialize", e10);
        }
        f40706a = o0Var;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            C3549q.f40712a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
