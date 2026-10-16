package com.waze.car_lib.r;

import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.car_lib.login.LoginController$LoginState;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class am implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f20952a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20953b;

    am(Object obj, int i2) {
        this.f20953b = i2;
        this.f20952a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v47, types: [java.lang.Object, kotlinx.coroutines.a.ad] */
    /* JADX WARN: Type inference failed for: r12v50, types: [com.waze.t.b.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v53, types: [com.waze.t.b.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        ?? r13;
        Object objD;
        ?? r14;
        Object objD2;
        boolean z = false;
        switch (this.f20953b) {
            case 0:
                ((an) this.f20952a).d((String) obj, true);
                return h.ab.f48028a;
            case 1:
                List list = (List) obj;
                e eVar2 = (e) this.f20952a;
                eVar2.f(list);
                MutableLiveData mutableLiveData = eVar2.f21477d;
                String strC = eVar2.f21474a.c(R.string.CATEGORIES, new Object[0]);
                List<com.waze.car_lib.n.d> list2 = list;
                ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
                for (com.waze.car_lib.n.d dVar : list2) {
                    arrayList.add(new com.waze.car_lib.p.t(dVar.c(), dVar.a(), (String) null, 12));
                }
                mutableLiveData.setValue(new com.waze.car_lib.p.cy(strC, z, arrayList));
                return h.ab.f48028a;
            case 2:
                ((bc) this.f20952a).f21026j.setValue((com.waze.car_lib.p.am) obj);
                return h.ab.f48028a;
            case 3:
                com.waze.bw.a.b.c cVar = (com.waze.bw.a.b.c) obj;
                if (!(cVar instanceof com.waze.bw.a.b.c)) {
                    throw new h.i();
                }
                ((bc) this.f20952a).f21017a.B(new com.waze.modules.navigation.br(new com.waze.modules.navigation.ao(cVar.b(), new com.waze.modules.navigation.ai(cVar.a()), null, true, com.waze.modules.navigation.at.f30321a, null, false, null, 224)));
                return h.ab.f48028a;
            case 4:
                ((bk) this.f20952a).f21056k.b((com.waze.car_lib.c.h) obj);
                return h.ab.f48028a;
            case 5:
                com.waze.car_lib.p.ao aoVar = (com.waze.car_lib.p.ao) obj;
                com.waze.bw.a.c.r rVarB = aoVar.b();
                if (rVarB == null || (!rVarB.h() && !rVarB.e() && (!rVarB.b().isEmpty() || !rVarB.a().isEmpty()))) {
                    z = true;
                }
                bk bkVar = (bk) this.f20952a;
                bkVar.f21046a.y(z ? com.waze.car_lib.f.av.f19392a : com.waze.car_lib.f.av.f19393b);
                if (z) {
                    bkVar.n.e(aoVar);
                }
                return h.ab.f48028a;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bk bkVar2 = (bk) this.f20952a;
                bkVar2.n.e(com.waze.car_lib.p.ao.e((com.waze.car_lib.p.ao) bkVar2.n.d(), null, !zBooleanValue, null, false, false, false, DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_REPORT_LABEL));
                return h.ab.f48028a;
            case 7:
                bk.m((bk) this.f20952a, (com.waze.bw.a.b.c) obj);
                return h.ab.f48028a;
            case 8:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                do {
                    r13 = this.f20952a;
                    objD = r13.d();
                } while (!r13.f(objD, br.c((br) objD, zBooleanValue2)));
                return h.ab.f48028a;
            case 9:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ((by) this.f20952a).p.b(new com.waze.car_lib.c.h(false, false, false, true, false, zBooleanValue3, true, true, !zBooleanValue3, true, 55));
                return h.ab.f48028a;
            case 10:
                ((ck) this.f20952a).f21220f.e((cg) obj);
                return h.ab.f48028a;
            case 11:
                if (((LoginController$LoginState) obj).getState() instanceof com.waze.car_lib.login.f) {
                    ae.e((ae) this.f20952a);
                }
                return h.ab.f48028a;
            case 12:
                Object objG = this.f20952a.g((cv) obj, eVar);
                return objG == h.c.a.a.f48038a ? objG : h.ab.f48028a;
            case 13:
                cu cuVar = cu.f21232a;
                int iOrdinal = ((cu) obj).ordinal();
                if (iOrdinal == 0) {
                    this.f20952a.c();
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    this.f20952a.close();
                }
                return h.ab.f48028a;
            case 14:
                Object objX = ((ey) this.f20952a).x((cr) obj, eVar);
                return objX == h.c.a.a.f48038a ? objX : h.ab.f48028a;
            default:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                do {
                    r14 = this.f20952a;
                    objD2 = r14.d();
                } while (!r14.f(objD2, fh.c((fh) objD2, zBooleanValue4)));
                return h.ab.f48028a;
        }
    }
}
