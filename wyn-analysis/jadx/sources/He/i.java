package He;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public abstract class i {
    public final void c(j jVar) {
        try {
            d(jVar);
        } catch (NullPointerException e7) {
            throw e7;
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            S3.f.A(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void d(j jVar);
}
