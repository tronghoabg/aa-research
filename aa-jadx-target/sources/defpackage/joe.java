package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class joe {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DelegateICarSupplier");
    public static final defpackage.xzi b = defpackage.ysr.aQ(new defpackage.imy(8));
    public final android.content.Context c;
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger(0);

    public joe(android.content.Context context) {
        this.c = context;
    }

    public final defpackage.jnz a(android.os.Handler handler, long j) {
        int iB = b() - 1;
        if (iB == 0) {
            throw new java.lang.IllegalStateException("Factory not configured to create suppliers!");
        }
        android.content.Context context = this.c;
        if (iB == 1) {
            return new defpackage.jod(context, (defpackage.yys) b.fF(), handler, j, this.e.incrementAndGet());
        }
        int iIncrementAndGet = this.e.incrementAndGet();
        defpackage.yys yysVar = defpackage.yys.GMS_CAR_CONNECTIONLESS;
        rmt rmtVar = new rmt(context);
        return new defpackage.jod(context, yysVar, new defpackage.jog(new inr(rmtVar, 4), new inr(rmtVar, 5), j), j, iIncrementAndGet);
    }

    public final int b() {
        defpackage.yys yysVar = (defpackage.yys) b.fF();
        int iOrdinal = yysVar.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalStateException("Unexpected delegate selection: " + yysVar.f);
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 3;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    throw new java.lang.IllegalStateException("ESCAPE_POD_Q is deprecated.");
                }
                if (iOrdinal == 4) {
                    return 2;
                }
                throw new java.lang.RuntimeException(null, null);
            }
        }
        return i;
    }
}
