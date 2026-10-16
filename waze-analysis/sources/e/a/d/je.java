package e.a.d;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class je extends e.a.dc {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f47219a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47220b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a.bv f47221c;

    public je(boolean z, int i2, e.a.bv bvVar) {
        this.f47219a = z;
        this.f47220b = i2;
        com.google.d.b.an.C(bvVar, "parser");
        this.f47221c = bvVar;
    }

    @Override // e.a.dc
    public final e.a.cy a(Map map) {
        Object objD;
        ix ixVar;
        gc gcVar;
        Map mapM;
        try {
            e.a.cy cyVarB = this.f47221c.b(map);
            ga gaVar = null;
            if (cyVarB == null) {
                objD = null;
            } else {
                if (cyVarB.c() != null) {
                    return e.a.cy.b(cyVarB.c());
                }
                objD = cyVarB.d();
            }
            boolean z = this.f47219a;
            int i2 = this.f47220b;
            if (!z || map == null || (mapM = jm.m(map, "retryThrottling")) == null) {
                ixVar = null;
            } else {
                float fFloatValue = jm.f(mapM, "maxTokens").floatValue();
                float fFloatValue2 = jm.f(mapM, "tokenRatio").floatValue();
                com.google.d.b.an.v(fFloatValue > 0.0f, "maxToken should be greater than zero");
                com.google.d.b.an.v(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                ixVar = new ix(fFloatValue, fFloatValue2);
            }
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Map mapM2 = map == null ? null : jm.m(map, "healthCheckConfig");
            List<Map> listK = jm.k(map, "methodConfig");
            if (listK == null) {
                gcVar = new gc(null, map2, map3, ixVar, objD, mapM2);
            } else {
                for (Map map4 : listK) {
                    ga gaVar2 = new ga(map4, z, i2);
                    List<Map> listK2 = jm.k(map4, HintConstants.AUTOFILL_HINT_NAME);
                    if (listK2 != null && !listK2.isEmpty()) {
                        for (Map map5 : listK2) {
                            String strI = jm.i(map5, NotificationCompat.CATEGORY_SERVICE);
                            String strI2 = jm.i(map5, "method");
                            if (com.google.d.b.an.f(strI)) {
                                com.google.d.b.an.q(com.google.d.b.an.f(strI2), "missing service name for method %s", strI2);
                                com.google.d.b.an.q(gaVar == null, "Duplicate default method config in service config %s", map);
                                gaVar = gaVar2;
                            } else if (com.google.d.b.an.f(strI2)) {
                                com.google.d.b.an.q(!map3.containsKey(strI), "Duplicate service %s", strI);
                                map3.put(strI, gaVar2);
                            } else {
                                String strE = e.a.cq.e(strI, strI2);
                                com.google.d.b.an.q(!map2.containsKey(strE), "Duplicate method name %s", strE);
                                map2.put(strE, gaVar2);
                            }
                        }
                    }
                }
                gcVar = new gc(gaVar, map2, map3, ixVar, objD, mapM2);
            }
            return e.a.cy.a(gcVar);
        } catch (RuntimeException e2) {
            return e.a.cy.b(e.a.ee.f47403c.g("failed to parse service config").f(e2));
        } catch (Throwable th) {
            return e.a.cy.b(e.a.ee.f47410j.g("Unexpected error parsing service config").f(th));
        }
    }
}
