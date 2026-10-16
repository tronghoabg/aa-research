package He;

import Re.B;
import Re.N;
import Re.Q;
import java.util.concurrent.atomic.AtomicReference;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public abstract class c implements ug.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5007a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // ug.a
    public final void a(f fVar) {
        if (fVar instanceof f) {
            d(fVar);
        } else {
            Ne.b.a(fVar, "s is null");
            d(new Xe.d(fVar));
        }
    }

    public final B b(Le.c cVar) {
        Ne.b.a(cVar, "mapper is null");
        Ne.b.b(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, "maxConcurrency");
        return new B(this, cVar);
    }

    public final Q c() {
        int i5 = f5007a;
        Ne.b.b(i5, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        return new Q(new N(atomicReference, i5), this, atomicReference, i5);
    }

    public final void d(f fVar) {
        Ne.b.a(fVar, "s is null");
        try {
            e(fVar);
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

    public abstract void e(f fVar);
}
