package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
final class gfc extends afde implements afeg {
    int a;
    final /* synthetic */ gbg b;
    final /* synthetic */ Context c;
    final /* synthetic */ dlg d;
    final /* synthetic */ float e;
    final /* synthetic */ csi f;
    final /* synthetic */ bwq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfc(gbg gbgVar, Context context, dlg dlgVar, float f, csi csiVar, bwq bwqVar, afck afckVar) {
        super(2, afckVar);
        this.b = gbgVar;
        this.c = context;
        this.d = dlgVar;
        this.e = f;
        this.f = csiVar;
        this.g = bwqVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new gfc(this.b, this.c, this.d, this.e, this.f, this.g, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            gbg gbgVar = this.b;
            Context context = this.c;
            this.a = 1;
            fsw fswVar = new fsw(context);
            fswVar.f(ftn.a);
            fswVar.d = 2;
            fswVar.e = 2;
            fswVar.a = ((gbi) gbgVar).a;
            fswVar.c = new fra(null);
            fswVar.c();
            obj = fpn.a(context).e(fswVar.a(), this);
            if (obj == afcrVar) {
                return afcrVar;
            }
        }
        Drawable drawableA = ((fsz) obj).a();
        if (drawableA != null) {
            dlg dlgVar = this.d;
            this.g.b(new dlj(fwl.m(dlgVar.ey(drawableA.getIntrinsicWidth()), dlgVar.ey(drawableA.getIntrinsicHeight()), this.e, this.f)));
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gfc) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
