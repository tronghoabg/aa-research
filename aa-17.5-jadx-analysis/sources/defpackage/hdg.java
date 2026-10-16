package defpackage;

import android.os.Bundle;
import android.service.personalcontext.insight.BundleInsight;
import android.service.personalcontext.insight.ContextInsight;
import android.service.personalcontext.insight.InsightCollection;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class hdg {
    public static void a(hdj hdjVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1720601978);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hdjVar) : buxVarC.E(hdjVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            hdi hdiVar = hdjVar.b;
            hec hecVar = (hec) hdiVar.g.invoke(buxVarC, 0);
            gab gabVar = hdjVar.a;
            float f = hecVar.a;
            cfy cfyVarI = awd.i(cfyVar, f);
            ckv ckvVar = hecVar.b;
            if (ckvVar != null) {
                cfyVarI = cjn.g(cfyVarI, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ckvVar, true, 0, 1042431);
            }
            csi csiVar = csh.b;
            cjv cjvVar = new cjv(gux.c(buxVarC).T());
            int iOrdinal = hdiVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                z = false;
            } else {
                if (iOrdinal != 5) {
                    throw new aezs();
                }
                z = true;
            }
            fxp.c(gabVar, f, cfyVarI, null, csiVar, cjvVar, false, z, bxc.i(-1116122304, true, new gsl(hecVar, 11), buxVarC), buxVarC, 805330952, 328);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hdjVar, cfyVar, i, 9);
        }
    }

    public static hcw b(hab habVar, geu geuVar) {
        if (habVar instanceof gzx) {
            return new hcs(fxa.e(((gzx) habVar).a, geuVar, null, 6));
        }
        if (habVar instanceof gzy) {
            return new hct(fxy.d(((gzy) habVar).a));
        }
        if (habVar instanceof gzz) {
            return new hcu(fxy.d(((gzz) habVar).a));
        }
        if (habVar instanceof haa) {
            return new hcv(fxy.d(((haa) habVar).a));
        }
        throw new aezs();
    }

    public static hnj c(ContextInsight contextInsight) {
        Object next;
        hni hniVar;
        contextInsight.getClass();
        if (contextInsight instanceof InsightCollection) {
            InsightCollection insightCollection = (InsightCollection) contextInsight;
            List insights = insightCollection.getInsights();
            insights.getClass();
            BundleInsight bundleInsight = (ContextInsight) woy.bH(insights);
            if ((bundleInsight instanceof BundleInsight) && bundleInsight.getDataBundle().getInt("prototype_insight_id_key") > 0) {
                List insights2 = insightCollection.getInsights();
                insights2.getClass();
                Object objBF = woy.bF(insights2);
                objBF.getClass();
                BundleInsight bundleInsight2 = (BundleInsight) objBF;
                List insights3 = insightCollection.getInsights();
                insights3.getClass();
                List<ContextInsight> listBR = woy.bR(insights3, 1);
                ArrayList arrayList = new ArrayList(woy.bp(listBR, 10));
                for (ContextInsight contextInsight2 : listBR) {
                    contextInsight2.getClass();
                    if (true == (c(contextInsight2) instanceof hos)) {
                        contextInsight2 = null;
                    }
                    arrayList.add(contextInsight2);
                }
                int i = bundleInsight2.getDataBundle().getInt("prototype_insight_id_key");
                afao afaoVar = new afao((afar) hnm.l);
                while (true) {
                    if (!afaoVar.hasNext()) {
                        next = null;
                        break;
                    }
                    next = afaoVar.next();
                    if (((hnm) next).m == i) {
                        break;
                    }
                }
                hnm hnmVar = (hnm) next;
                if (hnmVar != null) {
                    switch (hnmVar.ordinal()) {
                        case 0:
                            hniVar = hox.b;
                            break;
                        case 1:
                            hniVar = hoq.b;
                            break;
                        case 2:
                            hniVar = hnu.b;
                            break;
                        case 3:
                            hniVar = hqa.b;
                            break;
                        case 4:
                            hniVar = hos.b;
                            break;
                        case 5:
                            hniVar = hns.b;
                            break;
                        case 6:
                            hniVar = hpc.b;
                            break;
                        case 7:
                            hniVar = hps.b;
                            break;
                        case 8:
                            hniVar = hpm.b;
                            break;
                        case 9:
                            hniVar = hoj.b;
                            break;
                        case 10:
                            hniVar = hpe.b;
                            break;
                        default:
                            throw new aezs();
                    }
                    Bundle dataBundle = bundleInsight2.getDataBundle();
                    dataBundle.getClass();
                    Set originHints = insightCollection.getOriginHints();
                    if (originHints == null) {
                        originHints = afbg.a;
                    }
                    return hniVar.b(dataBundle, arrayList, originHints);
                }
            }
        }
        return null;
    }
}
