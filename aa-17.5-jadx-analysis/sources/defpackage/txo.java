package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.geo.mapcore.internal.label.jni.SharedLabelerJni;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class txo implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ txo(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vae] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, vae] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, uda] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, uda] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, uda] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, uzy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, uzy] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, tqu] */
    /* JADX WARN: Type inference failed for: r8v82, types: [java.lang.Object, ucf] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        List list;
        switch (this.c) {
            case 0:
                yob yobVar = txu.a;
                this.a.f(this.b);
                return;
            case 1:
                yob yobVar2 = txu.a;
                this.a.f(this.b);
                return;
            case 2:
                Object obj = this.a;
                Object obj2 = ((typ) obj).f;
                txk txkVar = (txk) this.b;
                ygr ygrVarF = txkVar.f();
                synchronized (obj2) {
                    yno it = ygrVarF.iterator();
                    while (it.hasNext()) {
                        if (((typ) obj).e.c((usf) it.next()) == null) {
                            return;
                        }
                    }
                    txkVar.h(true);
                    return;
                }
            case 3:
                ((typ) this.a).g(((gjv) this.b).a);
                return;
            case 4:
                Object obj3 = this.b;
                Object obj4 = this.a;
                synchronized (obj4) {
                    ((tys) obj4).f(new usr((Bitmap) obj3));
                    List list2 = ((tys) obj4).b;
                    arrayList = new ArrayList(list2.size());
                    arrayList.addAll(list2);
                    list2.clear();
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((tyr) arrayList.get(i)).a();
                }
                return;
            case 5:
                Object obj5 = this.b;
                qrx qrxVar = (qrx) obj5;
                Object obj6 = qrxVar.c;
                Object obj7 = this.a;
                Collection collection = (Collection) ((plb) obj6).h(obj7);
                if (collection != null) {
                    synchronized (obj5) {
                        list = (List) ((qrx) obj5).f.remove(obj7);
                    }
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((tzg) it2.next()).a((ukp) obj7, 0, collection);
                        }
                    }
                    qrxVar.b(collection);
                    return;
                }
                uod uodVar = (uod) qrxVar.a;
                uor uorVarA = uodVar.a(uodVar.m.s(abgl.GMM_VECTOR_BASE), ukr.a, false);
                boolean z = (uorVarA instanceof unb) && ((unb) uorVarA).r();
                tzh tzhVar = new tzh(new tze(qrxVar, z));
                if (!z) {
                    uorVarA.g((ukp) obj7, tzhVar, false);
                    return;
                } else {
                    uqw.d();
                    uorVarA.i((ukp) obj7, tzhVar);
                    return;
                }
            case 6:
                ((uec) this.b).I((usy) this.a);
                return;
            case 7:
                yob yobVar3 = uel.a;
                yop yopVarE = yobVar3.e();
                ?? r2 = this.b;
                ((ynz) ((ynz) yopVarE).ai((char) 9276)).y("[Labeler thread] executing removeLabelSource[%s] from pending work queue", uel.p(r2));
                Object obj8 = this.a;
                if (uel.n(r2)) {
                    vat vatVar = uqb.c;
                    uel uelVar = (uel) obj8;
                    Map map = (Map) uelVar.j.remove(r2);
                    if (map == null) {
                        ((ynz) ((ynz) yobVar3.e()).ai((char) 9286)).y("[Labeler thread] failed to remove label source[%s] as it does not exist", uel.p(r2));
                    } else {
                        for (Long l : map.values()) {
                            SharedLabelerJni sharedLabelerJni = uelVar.i;
                            sharedLabelerJni.getClass();
                            sharedLabelerJni.c(l.longValue());
                        }
                        ((ynz) ((ynz) yobVar3.e()).ai((char) 9285)).y("[Labeler thread] successfully removed label source[%s]", uel.p(r2));
                    }
                } else {
                    uel uelVar2 = (uel) obj8;
                    if (uelVar2.o(r2)) {
                        uelVar2.d();
                    }
                }
                synchronized (obj8) {
                    ((uel) obj8).u--;
                }
                return;
            case 8:
                Object obj9 = this.b;
                SharedLabelerJni sharedLabelerJni2 = ((uel) obj9).i;
                sharedLabelerJni2.getClass();
                sharedLabelerJni2.nativeUpdateViewport(sharedLabelerJni2.b, ((abmd) this.a).h());
                synchronized (obj9) {
                    ((uel) obj9).u--;
                }
                return;
            case 9:
                SharedLabelerJni sharedLabelerJni3 = ((uel) this.b).i;
                sharedLabelerJni3.getClass();
                sharedLabelerJni3.d((abis) this.a);
                return;
            case 10:
                Object obj10 = this.b;
                ueh uehVar = new ueh(obj10, 2);
                uel uelVar3 = (uel) obj10;
                uelVar3.i(uehVar);
                SharedLabelerJni sharedLabelerJni4 = uelVar3.i;
                sharedLabelerJni4.getClass();
                sharedLabelerJni4.nativeUpdateRestrictions(sharedLabelerJni4.b, ((abmd) this.a).h());
                return;
            case 11:
                Object obj11 = this.a;
                uel uelVar4 = (uel) obj11;
                Map map2 = uelVar4.m;
                Object obj12 = this.b;
                Long l2 = (Long) map2.remove(obj12);
                if (l2 != null) {
                    ((ynz) ((ynz) uel.a.e()).ai(9278)).x("[Labeler thread] executing removeLabelingHint[%d] from pending work queue", ((trt) obj12).a);
                    SharedLabelerJni sharedLabelerJni5 = uelVar4.i;
                    sharedLabelerJni5.getClass();
                    sharedLabelerJni5.nativeRemoveLabelingHint(sharedLabelerJni5.b, l2.longValue());
                    map2.remove(obj12);
                } else {
                    ((ynz) ((ynz) uel.a.g()).ai(9277)).x("[Labeler thread] The labeling hint id %d is already removed.", ((trt) obj12).a);
                }
                synchronized (obj11) {
                    ((uel) obj11).u--;
                }
                return;
            case 12:
                Object obj13 = this.b;
                SharedLabelerJni sharedLabelerJni6 = ((uel) obj13).i;
                sharedLabelerJni6.getClass();
                sharedLabelerJni6.e((abjs) this.a);
                synchronized (obj13) {
                    ((uel) obj13).u--;
                }
                return;
            case 13:
                rfe rfeVar = new rfe(null, null);
                ?? r1 = this.b;
                r1.e(rfeVar);
                Object obj14 = this.a;
                if (uel.n(r1)) {
                    ((uel) obj14).r(r1, rfeVar);
                } else {
                    ((uel) obj14).q(r1, rfeVar);
                }
                synchronized (obj14) {
                    ((uel) obj14).u--;
                }
                return;
            case 14:
                ueg uegVar = ((uel) this.b).p;
                uegVar.getClass();
                uegVar.m = (ujk) this.a;
                return;
            case 15:
                SharedLabelerJni sharedLabelerJni7 = ((uel) this.b).i;
                sharedLabelerJni7.getClass();
                sharedLabelerJni7.nativeUpdateEpoch(sharedLabelerJni7.b, ((abmd) this.a).h());
                return;
            case 16:
                SharedLabelerJni sharedLabelerJni8 = ((uel) this.b).i;
                sharedLabelerJni8.getClass();
                sharedLabelerJni8.nativeReportEpochResources(sharedLabelerJni8.b, ((abmd) this.a).h());
                return;
            case 17:
                this.a.run();
                synchronized (this.b) {
                    ((uel) r0).u--;
                }
                return;
            case 18:
                rfe rfeVar2 = new rfe(null, null);
                ?? r12 = this.a;
                ((ufj) r12).e(rfeVar2);
                zdh zdhVarG = this.b.G(r12, rfeVar2);
                ufs ufsVar = (ufs) r12;
                ufsVar.i = zdhVarG;
                ufsVar.E();
                synchronized (ufsVar.g) {
                    ((ufs) r12).k = false;
                }
                return;
            case 19:
                ((ulo) this.b).c((ulq) this.a);
                return;
            default:
                ?? r0 = this.a;
                Object obj15 = this.b;
                synchronized (obj15) {
                    if (!r0.isEmpty()) {
                        ((ulo) obj15).e(r0);
                        r0.clear();
                    }
                }
                return;
        }
    }

    public /* synthetic */ txo(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
