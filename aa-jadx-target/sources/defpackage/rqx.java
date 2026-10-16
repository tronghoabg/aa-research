package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqx {
    private static volatile defpackage.rqx c;
    public final defpackage.xzo a;
    public final long b;
    private final defpackage.yhe d;

    private rqx() {
        defpackage.xzo xzoVar = defpackage.xxd.a;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        this.b = 600000000000L;
        xzoVar.getClass();
        this.a = xzoVar;
        defpackage.yha yhaVar = new defpackage.yha(4);
        for (defpackage.yzd yzdVar : defpackage.yzd.values()) {
            yhaVar.f(yzdVar, new defpackage.rqw(this, yzdVar));
        }
        this.d = defpackage.ysr.F(yhaVar.d(true));
    }

    public static defpackage.rqx a() {
        if (c == null) {
            synchronized (defpackage.rqx.class) {
                if (c == null) {
                    c = new defpackage.rqx();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.ygw b() {
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        defpackage.yot it = this.d.values().iterator();
        while (it.hasNext()) {
            defpackage.rqw rqwVar = (defpackage.rqw) it.next();
            if (rqwVar.b()) {
                ygrVar.i(rqwVar.a);
            }
        }
        return ygrVar.g();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.yzc c(defpackage.yzd yzdVar) {
        defpackage.rqw rqwVar = (defpackage.rqw) this.d.get(yzdVar);
        rqwVar.getClass();
        rqwVar.a();
        return rqwVar.a;
    }
}
