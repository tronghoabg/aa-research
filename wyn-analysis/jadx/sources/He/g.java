package He;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public abstract class g {
    public static g a(Object obj) {
        Ne.b.a(obj, "item is null");
        return new Se.o(obj);
    }

    public final void b(h hVar) {
        Ne.b.a(hVar, "observer is null");
        try {
            c(hVar);
        } catch (NullPointerException e7) {
            throw e7;
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(h hVar);

    public final g d(g gVar) {
        Ne.b.a(gVar, "other is null");
        return new Se.g(this, gVar, 2);
    }
}
