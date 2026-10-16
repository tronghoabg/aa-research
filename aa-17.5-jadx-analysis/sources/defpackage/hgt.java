package defpackage;

import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hgt extends afde implements afeh {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ hgw c;
    final /* synthetic */ hgu d;
    final /* synthetic */ ggk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgt(hgw hgwVar, hgu hguVar, ggk ggkVar, afck afckVar) {
        super(3, afckVar);
        this.c = hgwVar;
        this.d = hguVar;
        this.e = ggkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [hju, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        ?? r2 = this.a;
        if (this.b) {
            return r2;
        }
        hgw hgwVar = this.c;
        hgu hguVar = this.d;
        List list = hgwVar.b;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (true) {
            Object[] objArr = 0;
            if (!it.hasNext()) {
                break;
            }
            hgv hgvVar = (hgv) it.next();
            CarText carText = hgvVar.a;
            gfa gfaVarJ = carText != null ? fzc.j(carText, hguVar.a, gcp.a) : null;
            gac gacVar = hgvVar.b;
            arrayList.add(new hhd(gfaVarJ, gacVar != null ? fzo.a(gacVar, hguVar.a) : null, hgvVar.c, new hgl(hgvVar, hguVar, 5, objArr == true ? 1 : 0)));
        }
        fvz fvzVar = hgwVar.a;
        hha hhaVar = new hha(arrayList, fvzVar != null ? new fxb(fxy.d(fvzVar.a), null) : null);
        String str = hguVar.d;
        long jC = this.e.c();
        int i = 1;
        if (jC != 0) {
            if (jC == 1) {
                i = 2;
            } else if (jC == 2) {
                i = 0;
            }
        }
        return new hhg(hhaVar, r2, str, i, r2 instanceof hjt ? ((hjt) r2).k : false);
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        hgt hgtVar = new hgt(this.c, this.d, this.e, (afck) obj3);
        hgtVar.a = (hju) obj;
        hgtVar.b = zBooleanValue;
        return hgtVar.hT(afak.a);
    }
}
