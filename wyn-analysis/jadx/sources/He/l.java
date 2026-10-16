package He;

import Re.I;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class l implements Je.b {
    public abstract Je.b a(Runnable runnable, TimeUnit timeUnit);

    public void b(I i5) {
        a(i5, TimeUnit.NANOSECONDS);
    }
}
