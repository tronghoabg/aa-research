package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adv implements defpackage.affc {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public adv(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [ctc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [buv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [affc, java.lang.Object] */
    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        defpackage.adw adwVar;
        long j;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                int iOrdinal = ((defpackage.acj) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        adwVar = (defpackage.adw) this.a;
                        defpackage.ack ackVar = adwVar.b.b;
                    } else {
                        if (iOrdinal != 2) {
                            throw new defpackage.afas();
                        }
                        adwVar = (defpackage.adw) this.a;
                    }
                    defpackage.adt adtVar = adwVar.c.b.e;
                } else {
                    defpackage.ack ackVar2 = ((defpackage.adw) this.a).b.b;
                }
                return new defpackage.ckd(defpackage.cjv.j(0));
            case 1:
                defpackage.aeo aeoVar = (defpackage.aeo) obj;
                float f = aeoVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                float f2 = aeoVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                float f3 = aeoVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = aeoVar.a;
                float f6 = f5 >= 0.0f ? f5 : 0.0f;
                float[] fArr = defpackage.clr.a;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                return new defpackage.ckd(defpackage.ckd.e(defpackage.cjv.k(f, f2, f4, f6, defpackage.clr.x), (defpackage.clp) this.a));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                float[] fArr2 = ((defpackage.ckq) obj).a;
                ?? r10 = this.a;
                if (r10.t()) {
                    defpackage.csc.g(r10).dL(r10, fArr2);
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                this.a.a();
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return this.a.invoke(java.lang.Long.valueOf(((java.lang.Number) obj).longValue() / 1000000));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.ceq ceqVar = (defpackage.ceq) obj;
                synchronized (defpackage.cer.b) {
                    j = defpackage.cer.d;
                    defpackage.cer.d = 1 + j;
                }
                return new defpackage.ceh(j, ceqVar, this.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.eqp) this.a).m(obj);
                return defpackage.afbk.a;
            default:
                j$.time.Duration duration = defpackage.ltu.a;
                int iQ = ((com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj).Q();
                return defpackage.duu.b((1 & 1) != 0 ? defpackage.afdp.a : null, (1 & 2) != 0 ? 5000L : 0L, new oqs(obj, iQ == 3 || iQ == 4 || iQ == 5, (j$.time.Duration) this.a, (defpackage.afdk) null, 1));
        }
    }
}
