package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class kmj extends kmf {
    private int e;
    private final aezr f;
    private kmf g;

    public kmj(Context context) {
        super(context);
        this.f = woy.dG(new kbh(9));
    }

    public static final void p(kmj kmjVar, bux buxVar) {
        cic cicVar = (cic) buxVar.f(dbc.e);
        boolean zE = buxVar.E(kmjVar) | buxVar.E(cicVar);
        Object objG = buxVar.g();
        if (zE || objG == buw.a) {
            objG = new kku(kmjVar, cicVar, 4);
            buxVar.x(objG);
        }
        buxVar.r((afdr) objG);
        cfv cfvVar = cfy.e;
        Object objG2 = buxVar.g();
        Object obj = buw.a;
        if (objG2 == obj) {
            objG2 = new kki(7);
            buxVar.x(objG2);
        }
        cfy cfyVarK = bxc.k(cfvVar, (afec) objG2);
        boolean zE2 = buxVar.E(kmjVar);
        Object objG3 = buxVar.g();
        if (zE2 || objG3 == obj) {
            objG3 = new kaa(kmjVar, 17);
            buxVar.x(objG3);
        }
        cfy cfyVarBe = ca.be(tt.e(cfyVarK, (afec) objG3));
        ctp ctpVarB = atk.b(cfl.a, false);
        int iG = a.g(buxVar.b());
        ccx ccxVarN = buxVar.N();
        cfy cfyVarJ = bzi.j(buxVar, cfyVarBe);
        afdr afdrVar = cwb.a;
        buxVar.M();
        buxVar.w();
        if (buxVar.G()) {
            buxVar.j(afdrVar);
        } else {
            buxVar.y();
        }
        byq.c(buxVar, ctpVarB, cwb.e);
        byq.c(buxVar, ccxVarN, cwb.d);
        byq.c(buxVar, Integer.valueOf(iG), cwb.f);
        byq.b(buxVar, cwb.g);
        byq.c(buxVar, cfyVarJ, cwb.c);
        afeg afegVar = (afeg) ((kmf) kmjVar).b.a();
        if (afegVar == null) {
            buxVar.v(-796752641);
        } else {
            buxVar.v(112845634);
            afegVar.invoke(buxVar, 0);
        }
        buxVar.o();
        buxVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    public final kmf o() {
        kmf next;
        kmf kmfVar = this.g;
        if (kmfVar != null) {
            return kmfVar;
        }
        Iterator itA = ebg.b(this).a();
        while (true) {
            if (!itA.hasNext()) {
                next = 0;
                break;
            }
            next = itA.next();
            if (((ViewParent) next) instanceof kmf) {
                break;
            }
        }
        kmf kmfVar2 = next instanceof kmf ? next : null;
        this.g = kmfVar2;
        return kmfVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kmf kmfVarO = o();
        if (kmfVarO != null) {
            kmfVarO.post(new kea(this, 15));
        }
    }

    @Override // defpackage.kmf, defpackage.kmb
    public final void q(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(597152481);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 6;
        if (!buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            buxVarC.s();
        } else if (lec.a.a().f()) {
            buxVarC.v(15638930);
            jur.b(bxc.i(1503946308, true, new juy(this, 9), buxVarC), buxVarC, 6);
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.v(15690762);
            p(this, buxVarC);
            ((bvv) buxVarC).Y(false);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(this, i, i4);
        }
    }

    @Override // defpackage.kmf, defpackage.kmb, defpackage.rae
    public final boolean v(View view, int i, boolean z) {
        view.getClass();
        int iE = jur.e(i);
        kmf kmfVarO = o();
        if (kmfVarO != null) {
            if (((Boolean) this.f.a()).booleanValue() && kmfVarO.v(view, i, z)) {
                return true;
            }
            if (k()) {
                if (this.e == 0 && a.Y(iE, 2)) {
                    if (!kmfVarO.v(view, i, z)) {
                        post(new kea(this, 14));
                    }
                    return true;
                }
                boolean zI = l().i(iE, true);
                if (zI) {
                    if (a.Y(iE, 1)) {
                        this.e++;
                        return zI;
                    }
                    if (a.Y(iE, 2)) {
                        this.e--;
                        return true;
                    }
                }
                return zI;
            }
        }
        return super.v(view, i, z);
    }
}
