package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class mri extends lhk {
    final /* synthetic */ mrj a;

    public mri(mrj mrjVar) {
        this.a = mrjVar;
    }

    @Override // defpackage.lhk, defpackage.lhl
    public final void c() {
        yfq yfqVarO;
        mrj mrjVar = this.a;
        Iterator it = mrjVar.b.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iOrdinal = mrf.a(((mrg) it.next()).c).ordinal();
            if (iOrdinal == 0) {
                i++;
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalArgumentException("unknown shortcut type");
                }
                i2++;
            }
        }
        ohs ohsVarJ = ebf.j();
        yxy yxyVar = yxy.GEARHEAD;
        yzz yzzVar = yzz.LAUNCHER_SHORTCUT;
        rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzy.uS);
        rrbVarH.z(i);
        ohsVarJ.F(rrbVarH.l());
        ohs ohsVarJ2 = ebf.j();
        rrb rrbVarH2 = rrc.h(yxyVar, yzzVar, yzy.uZ);
        rrbVarH2.z(i2);
        ohsVarJ2.F(rrbVarH2.l());
        if (!acsi.e()) {
            eqm eqmVar = mrjVar.d;
            int i3 = yfq.d;
            yfq yfqVar = yls.a;
            eqmVar.m(yfqVar);
            mrjVar.c.m(yfqVar);
            return;
        }
        List list = (List) mrjVar.c.e();
        eqm eqmVar2 = mrjVar.d;
        if (list == null) {
            int i4 = yfq.d;
            yfqVarO = yls.a;
        } else {
            yfqVarO = yfq.o(list);
        }
        eqmVar2.m(yfqVarO);
    }
}
