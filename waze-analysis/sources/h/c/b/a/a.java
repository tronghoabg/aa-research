package h.c.b.a;

import h.ab;
import h.g.b.x;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class a implements Serializable, h.c.e, d {
    private final h.c.e<Object> completion;

    public a(h.c.e<Object> eVar) {
        this.completion = eVar;
    }

    public h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        x.f(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // h.c.b.a.d
    public d getCallerFrame() {
        h.c.e<Object> eVar = this.completion;
        if (eVar instanceof d) {
            return (d) eVar;
        }
        return null;
    }

    public final h.c.e<Object> getCompletion() {
        return this.completion;
    }

    @Override // h.c.b.a.d
    public StackTraceElement getStackTraceElement() {
        x.f(this, "<this>");
        return null;
    }

    protected abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.c.e, h.c.e<java.lang.Object>, java.lang.Object] */
    @Override // h.c.e
    public final void resumeWith(Object obj) {
        while (true) {
            h.d.b.b(this);
            a aVar = this;
            ?? r0 = aVar.completion;
            x.c(r0);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == h.c.a.a.f48038a) {
                    return;
                }
            } catch (Throwable th) {
                obj = e.b.c.a(th);
            }
            aVar.releaseIntercepted();
            if (!(r0 instanceof a)) {
                r0.resumeWith(obj);
                return;
            }
            this = r0;
        }
    }

    public String toString() {
        StackTraceElement stackTraceElement = getStackTraceElement();
        String name = stackTraceElement != null ? stackTraceElement : getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    public h.c.e<ab> create(h.c.e<?> eVar) {
        x.f(eVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
