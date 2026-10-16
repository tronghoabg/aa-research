package h.e.a;

import h.a.c;
import h.g.b.x;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class b extends h.e.b {
    private static final boolean k() {
        Integer num = a.f48068a;
        return num == null || num.intValue() >= 19;
    }

    @Override // h.e.b
    public final List a(Throwable th) {
        x.f(th, "exception");
        if (!k()) {
            return super.a(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        x.e(suppressed, "getSuppressed(...)");
        return c.i(suppressed);
    }

    @Override // h.e.b
    public final void c(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(th, "cause");
        x.f(th2, "exception");
        if (k()) {
            th.addSuppressed(th2);
        } else {
            super.c(th, th2);
        }
    }
}
