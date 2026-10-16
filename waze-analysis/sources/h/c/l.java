package h.c;

import h.g.b.x;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements e, h.c.b.a.d {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f48061a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "result");

    /* renamed from: b, reason: collision with root package name */
    private final e f48062b;
    private volatile Object result;

    public l(e eVar, Object obj) {
        x.f(eVar, "delegate");
        this.f48062b = eVar;
        this.result = obj;
    }

    @Override // h.c.b.a.d
    public final h.c.b.a.d getCallerFrame() {
        e eVar = this.f48062b;
        if (eVar instanceof h.c.b.a.d) {
            return (h.c.b.a.d) eVar;
        }
        return null;
    }

    @Override // h.c.e
    public final j getContext() {
        return this.f48062b.getContext();
    }

    @Override // h.c.b.a.d
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // h.c.e
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            h.c.a.a aVar = h.c.a.a.f48039b;
            if (obj2 != aVar) {
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (obj2 != aVar2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (a.a.d(f48061a, this, aVar2, h.c.a.a.f48040c)) {
                    this.f48062b.resumeWith(obj);
                    return;
                }
            } else if (a.a.d(f48061a, this, aVar, obj)) {
                return;
            }
        }
    }

    public final String toString() {
        e eVar = this.f48062b;
        Objects.toString(eVar);
        return "SafeContinuation for ".concat(String.valueOf(eVar));
    }
}
