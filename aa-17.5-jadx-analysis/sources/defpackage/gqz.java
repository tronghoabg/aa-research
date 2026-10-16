package defpackage;

import j$.time.Duration;

/* loaded from: classes2.dex */
public final class gqz extends afde implements afeg {
    int a;
    /* synthetic */ float b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqz(bym bymVar, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = bymVar;
        this.d = bwqVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.e != 0) {
            gqz gqzVar = new gqz((bym) this.c, (bwq) this.d, afckVar, 1);
            gqzVar.b = ((Number) obj).floatValue();
            return gqzVar;
        }
        gqz gqzVar2 = new gqz((Duration) this.c, (grb) this.d, afckVar, 0);
        gqzVar2.b = ((Number) obj).floatValue();
        return gqzVar2;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, lth] */
    /* JADX WARN: Type inference failed for: r2v22, types: [bym, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.e != 0) {
            afcr afcrVar = afcr.a;
            int i = this.a;
            woy.dF(obj);
            if (i == 0) {
                float f = this.b;
                afeg afegVar = (afeg) this.c.a();
                Float f2 = new Float(f);
                this.a = 1;
                if (afegVar.invoke(f2, this) == afcrVar) {
                    return afcrVar;
                }
            }
            this.d.b(Boolean.valueOf(false));
            return afak.a;
        }
        afcr afcrVar2 = afcr.a;
        try {
        } catch (aiwl unused) {
            ((ynz) grb.a.h().o(ypi.a, "CarApp.H.Media.Emitter").ai(80)).u("Seek action timed out");
        }
        if (this.a == 0) {
            woy.dF(obj);
            float f3 = this.b;
            Duration duration = (Duration) this.c;
            if (!duration.isNegative() && !duration.isZero()) {
                long millis = (long) (f3 * duration.toMillis());
                ((ynz) grb.a.e().o(ypi.a, "CarApp.H.Media.Emitter").ai(79)).x("Seeking to %d ms", millis);
                Object obj2 = this.d;
                lkc lkcVarB = ((grb) obj2).m.g.b();
                AbstractC0001do abstractC0001doB = lkcVarB != null ? ((dq) ((lpa) lkcVarB).b.b).b() : null;
                if (abstractC0001doB != null) {
                    abstractC0001doB.e(millis);
                }
                dmd dmdVar = new dmd((grb) obj2, millis, (afck) null, 2);
                this.a = 1;
                if (aikc.a(1000L, dmdVar, this) == afcrVar2) {
                    return afcrVar2;
                }
            }
            return afak.a;
        }
        woy.dF(obj);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((gqz) b(Float.valueOf(((Number) obj).floatValue()), (afck) obj2)).hT(afak.a);
        }
        return ((gqz) b(Float.valueOf(((Number) obj).floatValue()), (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqz(Duration duration, grb grbVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = duration;
        this.d = grbVar;
    }
}
