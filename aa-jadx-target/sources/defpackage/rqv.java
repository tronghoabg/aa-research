package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqv {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.ANALYTICS.CBX");
    private static final java.lang.Object c = new java.lang.Object();
    private static volatile defpackage.rqv d;
    public final java.util.concurrent.atomic.AtomicReference b;
    private defpackage.zhs e;
    private boolean f;
    private final defpackage.sxm g;

    private rqv(android.content.Context context) {
        defpackage.sxm sxmVar = new defpackage.sxm(context, new defpackage.sxp());
        this.b = new java.util.concurrent.atomic.AtomicReference(defpackage.rqu.a);
        this.f = false;
        this.g = sxmVar;
    }

    public static defpackage.rqv a(android.content.Context context) {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new defpackage.rqv(context);
                }
            }
        }
        return d;
    }

    private final synchronized defpackage.sxm d() {
        return this.g;
    }

    public final synchronized defpackage.zhs b() {
        defpackage.zhs zhsVar;
        if (this.f && (zhsVar = this.e) != null) {
            return zhsVar;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        boolean z = true;
        if (atomicReference.get() != defpackage.rqu.a) {
            if (atomicReference.get() != defpackage.rqu.b) {
                z = false;
            }
            return new defpackage.zho(java.lang.Boolean.valueOf(z));
        }
        this.f = true;
        defpackage.zhs zhsVarBQ = defpackage.sqs.bQ(d().a());
        defpackage.kpl kplVar = new defpackage.kpl(this, 4);
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        int i = defpackage.zgh.c;
        defpackage.zgg zggVar = new defpackage.zgg(zhsVarBQ, kplVar);
        zhsVarBQ.c(zggVar, defpackage.ysr.ch(zgtVar, zggVar));
        this.e = zggVar;
        zggVar.c(new defpackage.qtk(this, 12), zgtVar);
        return this.e;
    }

    public final synchronized void c() {
        this.f = false;
    }
}
