package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class jnw {
    public static final yph a = yph.c("GH.DelegateICarSupplier");
    public static final xyc b = wub.L(new imq(9));
    public final Context c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicInteger e = new AtomicInteger(0);

    public jnw(Context context) {
        this.c = context;
    }

    public final jnr a(Handler handler, long j) {
        int iB = b() - 1;
        if (iB == 0) {
            throw new IllegalStateException("Factory not configured to create suppliers!");
        }
        Context context = this.c;
        if (iB == 1) {
            return new jnv(context, (yxn) b.gu(), handler, j, this.e.incrementAndGet());
        }
        int iIncrementAndGet = this.e.incrementAndGet();
        yxn yxnVar = yxn.GMS_CAR_CONNECTIONLESS;
        rlx rlxVar = new rlx(context);
        return new jnv(context, yxnVar, new jny(new inl(rlxVar, 4), new inl(rlxVar, 5), j), j, iIncrementAndGet);
    }

    public final int b() {
        yxn yxnVar = (yxn) b.gu();
        int iOrdinal = yxnVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Unexpected delegate selection: " + yxnVar.f);
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 3;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    throw new IllegalStateException("ESCAPE_POD_Q is deprecated.");
                }
                if (iOrdinal == 4) {
                    return 2;
                }
                throw new RuntimeException(null, null);
            }
        }
        return i;
    }
}
