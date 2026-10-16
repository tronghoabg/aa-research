package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adnr {
    public final boolean a;
    public final java.lang.Object b;

    public adnr(boolean z, defpackage.adml admlVar) {
        this.a = z;
        admlVar.getClass();
        this.b = admlVar;
    }

    public final defpackage.adno a(java.util.Map map) {
        java.lang.Object obj;
        adzh adzhVar;
        defpackage.adxh adxhVar;
        java.util.Map mapT;
        try {
            defpackage.adno adnoVarB = ((defpackage.adml) this.b).b(map);
            defpackage.adxf adxfVar = null;
            if (adnoVarB == null) {
                obj = null;
            } else {
                defpackage.ador adorVar = adnoVarB.a;
                if (adorVar != null) {
                    return new defpackage.adno(adorVar);
                }
                obj = adnoVarB.b;
            }
            boolean z = this.a;
            if (!z || map == null || (mapT = defpackage.adrs.t(map, "retryThrottling")) == null) {
                adzhVar = null;
            } else {
                float fFloatValue = defpackage.adrs.m(mapT, "maxTokens").floatValue();
                float fFloatValue2 = defpackage.adrs.m(mapT, "tokenRatio").floatValue();
                defpackage.ysr.bk(fFloatValue > 0.0f, "maxToken should be greater than zero");
                defpackage.ysr.bk(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                adzhVar = new adzh(fFloatValue, fFloatValue2);
            }
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.HashMap map3 = new java.util.HashMap();
            java.util.Map mapT2 = map == null ? null : defpackage.adrs.t(map, "healthCheckConfig");
            java.util.List<java.util.Map> listR = defpackage.adrs.r(map, "methodConfig");
            if (listR == null) {
                adxhVar = new defpackage.adxh(null, map2, map3, adzhVar, obj, mapT2);
            } else {
                for (java.util.Map map4 : listR) {
                    defpackage.adxf adxfVar2 = new defpackage.adxf(map4, z);
                    java.util.List<java.util.Map> listR2 = defpackage.adrs.r(map4, "name");
                    if (listR2 != null && !listR2.isEmpty()) {
                        for (java.util.Map map5 : listR2) {
                            java.lang.String strP = defpackage.adrs.p(map5, "service");
                            java.lang.String strP2 = defpackage.adrs.p(map5, "method");
                            if (defpackage.ysr.bw(strP)) {
                                defpackage.ysr.bc(defpackage.ysr.bw(strP2), "missing service name for method %s", strP2);
                                defpackage.ysr.bc(adxfVar == null, "Duplicate default method config in service config %s", map);
                                adxfVar = adxfVar2;
                            } else if (defpackage.ysr.bw(strP2)) {
                                defpackage.ysr.bc(!map3.containsKey(strP), "Duplicate service %s", strP);
                                map3.put(strP, adxfVar2);
                            } else {
                                java.lang.String strB = defpackage.adng.b(strP, strP2);
                                defpackage.ysr.bc(!map2.containsKey(strB), "Duplicate method name %s", strB);
                                map2.put(strB, adxfVar2);
                            }
                        }
                    }
                }
                adxhVar = new defpackage.adxh(adxfVar, map2, map3, adzhVar, obj, mapT2);
            }
            return new defpackage.adno(adxhVar);
        } catch (java.lang.RuntimeException e) {
            return new defpackage.adno(defpackage.ador.d.e("failed to parse service config").d(e));
        } catch (java.lang.Throwable th) {
            return new defpackage.adno(defpackage.ador.l.e("Unexpected error parsing service config").d(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    public final boolean b(java.lang.CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (this.b != null) {
            char c = 0;
            c = 2;
            for (int i2 = 0; i2 < i && c == 2; i2++) {
                byte directionality = java.lang.Character.getDirectionality(charSequence.charAt(i2));
                if (directionality == 0) {
                    c = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            c = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            continue;
                    }
                }
            }
            if (c == 0) {
                return true;
            }
            if (c == 1) {
                return false;
            }
        }
        return this.a;
    }

    public adnr(java.util.List list, boolean z) {
        this.b = list;
        this.a = z;
    }

    public adnr(boolean z, java.lang.String str) {
        this.a = z;
        this.b = str;
    }

    public adnr(boolean z, defpackage.zhs zhsVar) {
        this.a = z;
        this.b = zhsVar;
    }

    public adnr(java.lang.Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }
}
