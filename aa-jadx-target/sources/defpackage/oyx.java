package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class oyx implements defpackage.afak {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oyx(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, pmv] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r5v4, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v68, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r5v7, types: [eqg, java.lang.Object] */
    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.oyw.a;
                return this.a;
            case 1:
                defpackage.yqm yqmVar = defpackage.oor.a;
                return new oon((android.content.Context) this.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.concurrent.atomic.AtomicReference atomicReference2 = defpackage.oyw.a;
                return new defpackage.oyv(this.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.concurrent.atomic.AtomicReference atomicReference3 = defpackage.oyw.a;
                return new defpackage.oyt(this.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.concurrent.atomic.AtomicReference atomicReference4 = defpackage.oyw.a;
                return new defpackage.oyu(this.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.util.concurrent.atomic.AtomicReference atomicReference5 = defpackage.oyw.a;
                defpackage.oyp oypVar = new defpackage.oyp();
                ?? r5 = this.a;
                oypVar.b = r5;
                r5.getLifecycle().c(oypVar);
                int i = 15;
                ((defpackage.eqp) defpackage.ngb.a().a).eM(oypVar.b, new defpackage.nuk(oypVar, i));
                defpackage.ebo.e(defpackage.nye.b().b).eM(oypVar.b, new defpackage.nuk(oypVar, 16));
                defpackage.mpj.b().h.eM(oypVar.b, new defpackage.lkt(12));
                if (defpackage.acyc.aN()) {
                    defpackage.ebo.e(defpackage.mps.e()).eM(oypVar.b, new defpackage.lkt(13));
                    defpackage.ebo.e(defpackage.kpu.c().i()).eM(oypVar.b, new defpackage.lkt(14));
                }
                if (defpackage.laq.a().b()) {
                    defpackage.tcu.n(defpackage.tcu.d(defpackage.ebo.e(defpackage.kpu.c().i()), defpackage.mpj.b().h, new defpackage.ooy(9))).eM(oypVar.b, new defpackage.lkt(i));
                }
                return oypVar;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return (oyj) ((defpackage.tho) this.a).i(defpackage.oyn.class);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.lnt.N(this.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i2 = defpackage.qfn.g;
                return (lwr) this.a.fF();
            case 9:
                int i3 = qfo.g;
                return new defpackage.khs((android.content.Context) this.a);
            case 10:
                int i4 = qfo.g;
                return new defpackage.kwu((android.content.Context) this.a);
            case 11:
                int i5 = qfo.g;
                return this.a;
            case 12:
                int i6 = qfo.g;
                return this.a;
            case 13:
                return defpackage.laz.a().a((android.content.Context) this.a, "connectivity_logger_state");
            case 14:
                return ((zxp) this.a).b();
            case 15:
                return ((zxp) this.a).a();
            case 16:
                return ((ttk) this.a).a();
            case 17:
                return ((zxp) this.a).h();
            case 18:
                java.lang.Object obj = this.a;
                return ((tyy) obj).f.k(pzf.X, "");
            case 19:
                java.lang.Object obj2 = this.a;
                return ((tyy) obj2).f.k(pzf.X, "");
            default:
                return this.a.k(pzf.X, "");
        }
    }
}
