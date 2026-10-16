package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class whw {
    public final java.lang.String a;
    public final defpackage.whx b;
    public final defpackage.xuo c;
    public final java.lang.Object d;
    public java.util.List e;
    private final defpackage.zhs f;
    private final defpackage.zhc g;
    private final defpackage.xuo h;

    public whw(defpackage.whx whxVar, defpackage.zhs zhsVar) {
        defpackage.whv whvVar = new defpackage.whv(this);
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        this.h = new defpackage.xuo(whvVar, zgtVar);
        this.d = new java.lang.Object();
        this.e = new java.util.ArrayList();
        this.b = whxVar;
        this.f = zhsVar;
        this.a = whxVar.e();
        this.c = new defpackage.xuo(whxVar.a(), zgtVar);
        this.g = new defpackage.zhc();
        b(new defpackage.whl(this, 2));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.zhs a(defpackage.xyd xydVar, java.util.concurrent.Executor executor) {
        defpackage.zgn zgnVarB = defpackage.xvx.b(new defpackage.key(xydVar, 16));
        defpackage.xzg.b(defpackage.xxd.a);
        defpackage.xvg xvgVarAY = defpackage.sqs.aY("Update ".concat(java.lang.String.valueOf(this.a)));
        try {
            defpackage.zhs zhsVarA = this.h.a();
            defpackage.zhc zhcVar = this.g;
            defpackage.vws vwsVar = new defpackage.vws(zhsVarA, 4);
            defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
            zhcVar.a(vwsVar, zgtVar);
            defpackage.zhs zhsVarA2 = zhcVar.a(defpackage.xvx.a(new whu(this, zhsVarA, zgnVarB, executor, 0)), zgtVar);
            zhsVarA2.getClass();
            if (!zhsVarA.isDone()) {
                if (zhsVarA2.isDone()) {
                    defpackage.ysr.cz(zhsVarA2, zhsVarA);
                } else {
                    zhj zhjVar = new zhj(zhsVarA2, zhsVarA);
                    zhsVarA2.c(zhjVar, zgtVar);
                    zhsVarA.c(zhjVar, zgtVar);
                }
            }
            defpackage.ysr.cq(this.f);
            defpackage.zhs zhsVarBE = defpackage.sqs.bE(zhsVarA2);
            xvgVarAY.a(zhsVarBE);
            xvgVarAY.close();
            return zhsVarBE;
        } catch (java.lang.Throwable th) {
            try {
                xvgVarAY.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(defpackage.zgn zgnVar) {
        synchronized (this.d) {
            this.e.add(zgnVar);
        }
    }

    public final defpackage.zhs c() {
        defpackage.zhs zhsVarH;
        new defpackage.xzg(defpackage.xxd.a).e();
        defpackage.xuo xuoVar = this.h;
        if (xuoVar.d.isDone()) {
            zhsVarH = this.b.h();
        } else {
            defpackage.xvg xvgVarBG = defpackage.ysr.bG("Get ".concat(java.lang.String.valueOf(this.a)), defpackage.xvj.a, false);
            try {
                defpackage.zhs zhsVarA = xuoVar.a();
                defpackage.whl whlVar = new defpackage.whl(this, 3);
                int i = defpackage.xvx.a;
                defpackage.xvv xvvVar = new defpackage.xvv(defpackage.xuy.e(), whlVar);
                defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
                int i2 = defpackage.zgh.c;
                defpackage.zgf zgfVar = new defpackage.zgf(zhsVarA, xvvVar);
                zhsVarA.c(zgfVar, defpackage.ysr.ch(zgtVar, zgfVar));
                xvgVarBG.a(zgfVar);
                xvgVarBG.close();
                zhsVarH = zgfVar;
            } catch (java.lang.Throwable th) {
                try {
                    xvgVarBG.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        defpackage.ysr.cq(this.f);
        return defpackage.ysr.cq(zhsVarH);
    }
}
