package He;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public abstract class n {
    public final void b(o oVar) {
        try {
            c(oVar);
        } catch (NullPointerException e7) {
            throw e7;
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(o oVar);
}
