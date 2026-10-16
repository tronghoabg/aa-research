package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class lzc implements epf {
    private static final yph e = yph.c("GH.InteractionModerator");
    public ohs a;
    public boolean b;
    private final List f = new ArrayList();
    public lzb c = lzb.c;
    gsn d = gsn.l;

    private final void p() {
        if (this.b) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((lza) it.next()).a(this.c);
            }
        }
    }

    @Override // defpackage.epf
    public final void fM() {
        m();
    }

    @Override // defpackage.epf
    public final void fx(eqa eqaVar) {
        l();
    }

    public final void g(lza lzaVar) {
        this.f.add(lzaVar);
    }

    protected abstract void h(gsn gsnVar, yzz yzzVar);

    protected final void i(yzz yzzVar, yzy yzyVar) {
        ohs ohsVar = this.a;
        if (ohsVar != null) {
            ohsVar.F(rrc.h(yxy.GEARHEAD, yzzVar, yzyVar).l());
        }
    }

    public final void j(lzb lzbVar) {
        this.c = lzbVar;
        p();
    }

    public final void k(gsn gsnVar, yzz yzzVar) {
        if (gsnVar == gsn.j || gsnVar == gsn.k || gsnVar == gsn.l) {
            ((ype) e.l().ai((char) 4473)).y("storing vehicle action %s", gsnVar);
            this.d = gsnVar;
        }
        if (this.b) {
            switch (gsnVar.ordinal()) {
                case 2:
                    i(yzzVar, yzy.bm);
                    break;
                case 4:
                    i(yzzVar, yzy.bp);
                    break;
                case 5:
                    i(yzzVar, yzy.bo);
                    break;
                case 6:
                    i(yzzVar, yzy.bn);
                    break;
                case 7:
                    i(yzzVar, yzy.bl);
                    break;
                case 8:
                    i(yzzVar, yzy.bw);
                    break;
            }
            h(gsnVar, yzzVar);
        }
    }

    public void l() {
        if (this.b) {
            return;
        }
        this.b = true;
        k(this.d, yzz.UNKNOWN_CONTEXT);
        p();
    }

    public void m() {
        if (this.b) {
            j(lzb.c);
            this.b = false;
        }
    }

    public void o() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fL(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }

    public void n(Bundle bundle) {
    }
}
