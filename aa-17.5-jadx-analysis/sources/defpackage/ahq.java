package defpackage;

import android.app.PendingIntent;
import java.util.List;

/* loaded from: classes2.dex */
public final class ahq implements afdr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ahq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v34, types: [aezr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37, types: [aezr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v56, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v58, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v63, types: [afdr, java.lang.Object] */
    @Override // defpackage.afdr
    public final /* synthetic */ Object invoke() throws PendingIntent.CanceledException {
        switch (this.b) {
            case 0:
                return ((agg) this.a).d();
            case 1:
                return ((agg) this.a).d();
            case 2:
                return ((agg) this.a).d();
            case 3:
                return ((agg) this.a).d();
            case 4:
                return ((agg) this.a).d();
            case 5:
                return ((agg) this.a).d();
            case 6:
                return new flq[((aiyk[]) this.a).length];
            case 7:
                ((hga) this.a).g.invoke();
                return afak.a;
            case 8:
                sx sxVar = (sx) this.a;
                return new aezu(Float.valueOf(sxVar.f()), sxVar.i());
            case 9:
                return this.a;
            case 10:
                return ((ahq) this.a).a;
            case 11:
                return ebi.h(this.a).getViewModelStore();
            case 12:
                eru eruVarH = ebi.h(this.a);
                epo epoVar = eruVarH instanceof epo ? (epo) eruVarH : null;
                return epoVar != null ? epoVar.getDefaultViewModelCreationExtras() : esa.a;
            case 13:
                sx sxVar2 = (sx) this.a;
                return new aezu(Float.valueOf(sxVar2.f()), sxVar2.i());
            case 14:
                mwc.a(yzy.FE, null);
                ncp ncpVarA = ncj.a.a().a();
                if (ncpVarA.a() instanceof ncv) {
                    ncpVarA.c(ncn.a, "clicked by user");
                }
                ((ncd) this.a).e.send();
                return afak.a;
            case 15:
                ?? r3 = this.a;
                int i = nca.a;
                List listAg = roc.ag(r3);
                if (listAg != null) {
                    return (ncd) woy.bH(listAg);
                }
                return null;
            case 16:
                ?? r32 = this.a;
                int i2 = nca.a;
                List listAg2 = roc.ag(r32);
                if (listAg2 != null) {
                    return (ncd) woy.bI(listAg2, 1);
                }
                return null;
            case 17:
                ?? r33 = this.a;
                aezr aezrVar = ndj.a;
                return roc.aq(r33);
            case 18:
                ?? r34 = this.a;
                aezr aezrVar2 = ndj.a;
                return roc.aq(r34);
            case 19:
                sx sxVar3 = (sx) this.a;
                return new aezu(Float.valueOf(sxVar3.f()), sxVar3.i());
            default:
                ?? r35 = this.a;
                if (r35 != 0) {
                    r35.invoke();
                }
                return afak.a;
        }
    }
}
