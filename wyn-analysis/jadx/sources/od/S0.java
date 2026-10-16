package od;

import A7.C0237b0;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public final Q0 f41801a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f41802b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f41803c;

    /* renamed from: d, reason: collision with root package name */
    public final H1 f41804d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f41805e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f41806f;

    public S0(Q0 q02, HashMap map, HashMap map2, H1 h12, Object obj, Map map3) {
        this.f41801a = q02;
        this.f41802b = pd.f.n(map);
        this.f41803c = pd.f.n(map2);
        this.f41804d = h12;
        this.f41805e = obj;
        this.f41806f = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static S0 a(Map map, boolean z2, int i5, int i10, Object obj) {
        H1 h12;
        Map mapG;
        H1 h13;
        if (z2) {
            if (map == null || (mapG = AbstractC3719r0.g("retryThrottling", map)) == null) {
                h13 = null;
            } else {
                float fFloatValue = AbstractC3719r0.e("maxTokens", mapG).floatValue();
                float fFloatValue2 = AbstractC3719r0.e("tokenRatio", mapG).floatValue();
                Fe.e.w("maxToken should be greater than zero", fFloatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Fe.e.w("tokenRatio should be greater than zero", fFloatValue2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                h13 = new H1(fFloatValue, fFloatValue2);
            }
            h12 = h13;
        } else {
            h12 = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapG2 = map == null ? null : AbstractC3719r0.g("healthCheckConfig", map);
        List<Map> listC = AbstractC3719r0.c("methodConfig", map);
        if (listC == null) {
            listC = null;
        } else {
            AbstractC3719r0.a(listC);
        }
        if (listC == null) {
            return new S0(null, map2, map3, h12, obj, mapG2);
        }
        Q0 q02 = null;
        for (Map map4 : listC) {
            Q0 q03 = new Q0(map4, z2, i5, i10);
            List<Map> listC2 = AbstractC3719r0.c(MediationMetaData.KEY_NAME, map4);
            if (listC2 == null) {
                listC2 = null;
            } else {
                AbstractC3719r0.a(listC2);
            }
            if (listC2 != null && !listC2.isEmpty()) {
                for (Map map5 : listC2) {
                    String strH = AbstractC3719r0.h("service", map5);
                    String strH2 = AbstractC3719r0.h("method", map5);
                    if (Fe.c.D(strH)) {
                        Fe.e.r(Fe.c.D(strH2), "missing service name for method %s", strH2);
                        Fe.e.r(q02 == null, "Duplicate default method config in service config %s", map);
                        q02 = q03;
                    } else if (Fe.c.D(strH2)) {
                        Fe.e.r(!map3.containsKey(strH), "Duplicate service %s", strH);
                        map3.put(strH, q03);
                    } else {
                        String strA = F6.r.a(strH, strH2);
                        Fe.e.r(!map2.containsKey(strA), "Duplicate method name %s", strA);
                        map2.put(strA, q03);
                    }
                }
            }
        }
        return new S0(q02, map2, map3, h12, obj, mapG2);
    }

    public final R0 b() {
        if (this.f41803c.isEmpty() && this.f41802b.isEmpty() && this.f41801a == null) {
            return null;
        }
        return new R0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S0.class == obj.getClass()) {
            S0 s02 = (S0) obj;
            if (Fe.b.v(this.f41801a, s02.f41801a) && Fe.b.v(this.f41802b, s02.f41802b) && Fe.b.v(this.f41803c, s02.f41803c) && Fe.b.v(this.f41804d, s02.f41804d) && Fe.b.v(this.f41805e, s02.f41805e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41801a, this.f41802b, this.f41803c, this.f41804d, this.f41805e});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f41801a, "defaultMethodConfig");
        c0237b0S.f(this.f41802b, "serviceMethodMap");
        c0237b0S.f(this.f41803c, "serviceMap");
        c0237b0S.f(this.f41804d, "retryThrottling");
        c0237b0S.f(this.f41805e, "loadBalancingConfig");
        return c0237b0S.toString();
    }
}
