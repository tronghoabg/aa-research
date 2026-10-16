package defpackage;

/* loaded from: classes2.dex */
public final class knz {
    private final kny a;

    static {
        yph.c("GH.WPP.TELEMETRY");
    }

    public knz(kny knyVar) {
        this.a = knyVar;
    }

    public final void a(pac pacVar, koa koaVar) {
        yxi yxiVar;
        yfy yfyVar = kob.a;
        int iOrdinal = pacVar.ordinal();
        if (iOrdinal == 0) {
            yxiVar = (yxi) kob.a.get(koaVar);
        } else {
            if (iOrdinal != 1) {
                throw new RuntimeException(null, null);
            }
            yxiVar = (yxi) kob.b.get(koaVar);
        }
        yxiVar.getClass();
        this.a.d(yxiVar);
    }
}
