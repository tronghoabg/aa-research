package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class pjk implements ackr {
    private final acku a;
    private final acku b;
    private final /* synthetic */ int c;

    public pjk(acku ackuVar, acku ackuVar2, int i) {
        this.c = i;
        this.a = ackuVar;
        this.b = ackuVar2;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                return new pjj((psj) this.b.a());
            case 1:
                return new pjh((tmb) this.a.a(), (psj) this.b.a());
            case 2:
                return new plk((Context) this.a.a(), (lws) this.b.a());
            case 3:
                return new plo(ackq.b(this.b), ((uxv) this.a).b());
            case 4:
                return new prx((Context) this.a.a(), (tmb) this.b.a());
            case 5:
                zgt zgtVarC = ((tmf) this.a).a().c((zgt) ((prw) this.b.a()).a(psb.BACKGROUND_THREADPOOL));
                zgtVarC.getClass();
                return zgtVarC;
            case 6:
                zgt zgtVarC2 = ((tmf) this.a).a().c((zgt) ((prw) this.b.a()).a(psb.BLOCKING_THREADPOOL));
                zgtVarC2.getClass();
                return zgtVarC2;
            case 7:
                zgt zgtVarC3 = ((tmf) this.a).a().c((zgt) ((prw) this.b.a()).a(psb.LIGHTWEIGHT_THREADPOOL));
                zgtVarC3.getClass();
                return zgtVarC3;
            case 8:
                return new pti(((uxv) this.a).b(), ackq.b(this.b));
            case 9:
                return new ptj(((uxv) this.a).b(), ackq.b(this.b));
            case 10:
                return new pub((erb) this.b.a(), ((uxv) this.a).b());
            case 11:
                return new puu(this.a, this.b);
            case 12:
                return new pvf(ackq.b(this.a), ((psd) this.b).a());
            case 13:
                return new pvx((tmb) this.a.a(), (pyh) this.b.a());
            case 14:
                return new pvz((Context) this.a.a(), (pli) this.b.a());
            case 15:
                return new pwc(((pne) this.a).a(), ((uxv) this.b).b());
            case 16:
                Context context = (Context) this.a.a();
                pzl pzlVar = (pzl) this.b.a();
                String strK = lxr.K(pzlVar);
                String str = context.getPackageName() + ',' + lxr.L(context) + ',' + pzlVar.b().toString() + ',' + strK + ',' + pzf.a();
                ((ynz) ((ynz) pze.a.d()).ai((char) 6955)).y("API Header: %s", str);
                return xxh.g(str);
            case 17:
                Long l = pzg.a;
                return new pzg(xxh.h(pzi.a("3.4.0").a), pzi.a("26.32.00.").a, l.equals(pzg.a) ? pzg.b : 959816797L);
            case 18:
                return new qap(((uxv) this.a).b(), ackq.b(this.b));
            case 19:
                return new qaz((tmb) this.b.a(), (erb) this.a.a());
            default:
                acku ackuVar = this.b;
                Object objA = this.a.a();
                ((uxv) ackuVar).b();
                return new sm((nzj) objA);
        }
    }

    public pjk(acku ackuVar, acku ackuVar2, int i, float[] fArr) {
        this.c = i;
        this.b = ackuVar;
        this.a = ackuVar2;
    }
}
