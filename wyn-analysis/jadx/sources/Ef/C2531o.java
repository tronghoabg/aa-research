package ef;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ef.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2531o implements InterfaceC2525i, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f34675c = AtomicReferenceFieldUpdater.newUpdater(C2531o.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile tf.a f34676a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f34677b;

    @Override // ef.InterfaceC2525i
    public final Object getValue() {
        Object obj = this.f34677b;
        C2541y c2541y = C2541y.f34690a;
        if (obj != c2541y) {
            return obj;
        }
        tf.a aVar = this.f34676a;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34675c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2541y, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c2541y) {
                }
            }
            this.f34676a = null;
            return objInvoke;
        }
        return this.f34677b;
    }

    @Override // ef.InterfaceC2525i
    public final boolean isInitialized() {
        return this.f34677b != C2541y.f34690a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
