package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class admq {
    public final boolean a;
    public final Object b;

    public admq(boolean z, adlk adlkVar) {
        this.a = z;
        adlkVar.getClass();
        this.b = adlkVar;
    }

    public final admn a(Map map) {
        Object obj;
        adyf adyfVar;
        adwg adwgVar;
        Map mapZ;
        try {
            admn admnVarB = ((adlk) this.b).b(map);
            adwe adweVar = null;
            if (admnVarB == null) {
                obj = null;
            } else {
                adnq adnqVar = admnVarB.a;
                if (adnqVar != null) {
                    return new admn(adnqVar);
                }
                obj = admnVarB.b;
            }
            boolean z = this.a;
            if (!z || map == null || (mapZ = adqq.z(map, "retryThrottling")) == null) {
                adyfVar = null;
            } else {
                float fFloatValue = adqq.s(mapZ, "maxTokens").floatValue();
                float fFloatValue2 = adqq.s(mapZ, "tokenRatio").floatValue();
                woy.aa(fFloatValue > BitmapDescriptorFactory.HUE_RED, "maxToken should be greater than zero");
                woy.aa(fFloatValue2 > BitmapDescriptorFactory.HUE_RED, "tokenRatio should be greater than zero");
                adyfVar = new adyf(fFloatValue, fFloatValue2);
            }
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Map mapZ2 = map == null ? null : adqq.z(map, "healthCheckConfig");
            List<Map> listX = adqq.x(map, "methodConfig");
            if (listX == null) {
                adwgVar = new adwg(null, map2, map3, adyfVar, obj, mapZ2);
            } else {
                for (Map map4 : listX) {
                    adwe adweVar2 = new adwe(map4, z);
                    List<Map> listX2 = adqq.x(map4, "name");
                    if (listX2 != null && !listX2.isEmpty()) {
                        for (Map map5 : listX2) {
                            String strV = adqq.v(map5, "service");
                            String strV2 = adqq.v(map5, "method");
                            if (woy.am(strV)) {
                                woy.S(woy.am(strV2), "missing service name for method %s", strV2);
                                woy.S(adweVar == null, "Duplicate default method config in service config %s", map);
                                adweVar = adweVar2;
                            } else if (woy.am(strV2)) {
                                woy.S(!map3.containsKey(strV), "Duplicate service %s", strV);
                                map3.put(strV, adweVar2);
                            } else {
                                String strB = admf.b(strV, strV2);
                                woy.S(!map2.containsKey(strB), "Duplicate method name %s", strB);
                                map2.put(strB, adweVar2);
                            }
                        }
                    }
                }
                adwgVar = new adwg(adweVar, map2, map3, adyfVar, obj, mapZ2);
            }
            return new admn(adwgVar);
        } catch (RuntimeException e) {
            return new admn(adnq.d.e("failed to parse service config").d(e));
        } catch (Throwable th) {
            return new admn(adnq.l.e("Unexpected error parsing service config").d(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.CharSequence r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L3b
            if (r7 < 0) goto L3b
            int r0 = r6.length()
            int r0 = r0 - r7
            if (r0 < 0) goto L3b
            java.lang.Object r0 = r5.b
            if (r0 != 0) goto L10
            goto L36
        L10:
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L14:
            r4 = 1
            if (r2 >= r7) goto L32
            if (r3 != r1) goto L32
            char r3 = r6.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            if (r3 == 0) goto L2e
            if (r3 == r4) goto L2c
            if (r3 == r1) goto L2c
            switch(r3) {
                case 14: goto L2e;
                case 15: goto L2e;
                case 16: goto L2c;
                case 17: goto L2c;
                default: goto L2a;
            }
        L2a:
            r3 = r1
            goto L2f
        L2c:
            r3 = r0
            goto L2f
        L2e:
            r3 = r4
        L2f:
            int r2 = r2 + 1
            goto L14
        L32:
            if (r3 == 0) goto L3a
            if (r3 == r4) goto L39
        L36:
            boolean r5 = r5.a
            return r5
        L39:
            return r0
        L3a:
            return r4
        L3b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admq.b(java.lang.CharSequence, int):boolean");
    }

    public admq(List list, boolean z) {
        this.b = list;
        this.a = z;
    }

    public admq(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public admq(boolean z, zgp zgpVar) {
        this.a = z;
        this.b = zgpVar;
    }

    public admq(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }
}
