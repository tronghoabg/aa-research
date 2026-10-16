package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class ngz implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ngz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v46, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v97, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.afdr
    public final Object invoke() {
        List listE;
        ComponentName componentNameA;
        Object next;
        int i = 3;
        int i2 = 2;
        char c = 1;
        char c2 = 1;
        mqc mqcVar = 0;
        mqcVar = 0;
        mqcVar = 0;
        int i3 = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                yph yphVar = nhm.a;
                return mva.p((byd) obj);
            case 1:
                yph yphVar2 = nhm.a;
                return Boolean.valueOf(((Number) this.a.a()).intValue() == 2);
            case 2:
                yph yphVar3 = nhm.a;
                nxs nxsVar = (nxs) this.a.a();
                return Integer.valueOf(nxsVar != null ? nxsVar.b : 0);
            case 3:
                yph yphVar4 = nhm.a;
                nxs nxsVar2 = (nxs) this.a.a();
                return Boolean.valueOf(nxsVar2 != null ? nxsVar2.a : false);
            case 4:
                afco afcoVar = tby.a;
                njp njpVar = (njp) this.a;
                eqj eqjVar = njpVar.g;
                eqjVar.getClass();
                return tby.v(njpVar.a(eqjVar, njk.d, null, false), new nji(12));
            case 5:
                oga ogaVar = ogb.a;
                boolean zC = ogaVar.c();
                Object obj2 = this.a;
                if (zC) {
                    eqj eqjVar2 = ofs.a.a().e;
                    njp njpVar2 = (njp) obj2;
                    eqj eqjVar3 = njpVar2.h;
                    eqjVar3.getClass();
                    return njpVar2.a(tby.d(eqjVar2, eqjVar3, new niz(c == true ? 1 : 0)), njk.a, mkn.b, false);
                }
                afco afcoVar2 = tby.a;
                njp njpVar3 = (njp) obj2;
                eqj eqjVar4 = njpVar3.o;
                nmk nmkVar = njpVar3.e;
                return tby.v(tby.u(tby.t(tby.E(new njn(spu.aX(new nje(tby.o(nmkVar), tby.y(tby.a(tby.x(njpVar3.k), tby.x(tby.G(eqjVar4, nmkVar, new niz(i2)))), new eqm(Boolean.valueOf(ogaVar.c()))), i2)), tby.G(tby.t(new njo(njpVar3)), eqjVar4, new njg(obj2, i3)), tby.G(eqy.a(tby.v(nmkVar, new ndo(20))), eqjVar4, new njg(obj2, i2)), njpVar3, new mll("key_settings_show_rail_widget", new ngv(6))))), kgq.l()), new nji(11));
            case 6:
                boolean zC2 = ogb.a.c();
                Object obj3 = this.a;
                if (zC2) {
                    eqj eqjVar5 = ofs.a.a().e;
                    njp njpVar4 = (njp) obj3;
                    eqj eqjVar6 = njpVar4.g;
                    eqjVar6.getClass();
                    return tby.v(njpVar4.a(tby.d(eqjVar5, eqjVar6, new niz(i3)), njk.d, mkn.b, true), new nji(i));
                }
                njp njpVar5 = (njp) obj3;
                eqj eqjVarE = tby.E(tby.e(njpVar5.e, njpVar5.o, njpVar5.k, new njt(obj3, c2 == true ? 1 : 0)));
                eqj eqjVar7 = njpVar5.g;
                eqjVar7.getClass();
                return tby.v(tby.G(njpVar5.a(eqjVar7, njk.d, mkn.b, true), eqjVarE, new niz(i)), new nji(10));
            case 7:
                ComponentName componentNameS = njp.s();
                afco afcoVar3 = tby.a;
                Object obj4 = this.a;
                return tby.v(tby.u(tby.E(eqy.c(tby.v(spu.aX(new niw(obj4, 15)), new nji(4)), new nje(obj4, componentNameS, i, mqcVar))), componentNameS == null ? kgq.l() : ((njp) obj4).k(componentNameS, njk.e, false, false, false)), new nji(5));
            case 8:
                Object objT = khc.t(new wci("GH.RailViewModel", yzz.RAIL, yzy.Ma, "Failed to get CarWindowManager", new Object[0]), new njb(this.a, i2));
                objT.getClass();
                return (sab) objT;
            case 9:
                this.a.b(Boolean.valueOf(false));
                return afak.a;
            case 10:
                int i4 = nni.a;
                ((nnl) this.a).b.b.invoke();
                return afak.a;
            case 11:
                int i5 = nni.a;
                ((nnl) this.a).n.invoke();
                return afak.a;
            case 12:
                Object obj5 = this.a;
                return tby.c(tby.w(((nnu) obj5).g, new njm(obj5, 7)), nnl.a);
            case 13:
                nqk nqkVar = new nqk(8);
                oal oalVar = (oal) this.a;
                return tby.e(oalVar.g, oalVar.k, oalVar.j, nqkVar);
            case 14:
                if (acqd.p()) {
                    Object obj6 = this.a;
                    qrn qrnVarE = kio.b().e();
                    qrnVarE.getClass();
                    listE = ((ogb) obj6).e(qrnVarE);
                } else {
                    ((ynz) ogb.c.f().ai(5868)).u("External dialer feature not enabled so no external dialer found");
                    listE = afbe.a;
                }
                Context context = mki.a.c;
                context.getClass();
                String strO = odn.a().o(context);
                if (strO == null) {
                    ((ynz) ogb.c.h().ai(5877)).u("No system default dialer package");
                    return null;
                }
                if (acqd.p() && ogb.p(context, strO)) {
                    Iterator it = listE.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (affa.f(((mqc) next).a().getPackageName(), strO)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    mqc mqcVar2 = (mqc) next;
                    if (mqcVar2 != null) {
                        ((ynz) ogb.c.f().ai(5870)).y("Found templated app for phone dialer %s", strO);
                        mqcVar = mqcVar2;
                    } else {
                        ((ynz) ogb.c.f().ai(5869)).y("No templated app found for allowed phone dialer %s", strO);
                        ogb.o(yzy.MG, strO);
                    }
                }
                if (mqcVar != 0) {
                    componentNameA = mqcVar.a();
                } else {
                    componentNameA = mkn.c;
                    componentNameA.getClass();
                }
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.DIALER, yzy.MH);
                rrbVarH.p(componentNameA);
                ebf.j().F(rrbVarH.l());
                return mqcVar;
            case 15:
                oif oifVar = oig.a;
                mki.a.g();
                return ((qrn) this.a).a().g();
            case 16:
                yph yphVar5 = szh.a;
                return this.a.gu();
            case 17:
                return new aecv((adix) ((szh) this.a).d.a(), adiw.a.f(aedi.b, aedf.c));
            default:
                szo szoVar = (szo) szo.b(new zkr(1), (adix) ((szh) this.a).d.a());
                return new szo(szoVar.a, szoVar.b.b(adjr.c(4L, TimeUnit.SECONDS)));
        }
    }
}
