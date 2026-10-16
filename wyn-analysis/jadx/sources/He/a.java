package He;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public abstract class a {
    public final Qe.e b(Le.a aVar) {
        return new Qe.e(this, Ne.b.f8674d, aVar);
    }

    public final Je.c c() {
        Je.c cVar = new Je.c(2);
        d(cVar);
        return cVar;
    }

    public final void d(b bVar) {
        try {
            e(bVar);
        } catch (NullPointerException e7) {
            throw e7;
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            S3.f.A(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void e(b bVar);

    public final g f() {
        return new Se.d(this, 1);
    }
}
