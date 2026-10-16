package Ze;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f17085a = new c("No further exceptions");

    public static boolean a(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == f17085a) {
                return false;
            }
            Throwable bVar = th2 == null ? th : new Ke.b(th2, th);
            while (!atomicReference.compareAndSet(th2, bVar)) {
                if (atomicReference.get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        c cVar = f17085a;
        return th != cVar ? (Throwable) atomicReference.getAndSet(cVar) : th;
    }

    public static RuntimeException c(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
