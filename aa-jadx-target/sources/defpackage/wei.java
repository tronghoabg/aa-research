package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wei {
    public final boolean a = true;
    public final boolean b;
    public final java.lang.String c;
    public final defpackage.abnv d;
    public final defpackage.yhe e;
    public final defpackage.weh f;

    /* JADX WARN: Code duplicated, block: B:120:0x028e  */
    /* JADX WARN: Code duplicated, block: B:145:0x034c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    public wei(defpackage.wcd wcdVar, defpackage.weh wehVar) {
        defpackage.yhe yheVarD;
        char c;
        long j;
        long j2;
        defpackage.yot yotVar;
        this.b = wcdVar.b.b.isEmpty() && defpackage.wbx.a.equals(wcdVar.c);
        this.c = wcdVar.c();
        this.d = wcdVar.c.c;
        wcdVar.b();
        wcdVar.a();
        java.util.Map mapUnmodifiableMap = wcdVar.c.f.size() == 0 ? null : j$.util.DesugarCollections.unmodifiableMap(wcdVar.c.f);
        if (mapUnmodifiableMap != null) {
            defpackage.yhx.n(mapUnmodifiableMap.keySet());
        } else {
            defpackage.ynd yndVar = defpackage.ynd.a;
        }
        defpackage.wcc wccVar = wcdVar.b;
        defpackage.wbx wbxVar = wcdVar.c;
        char c2 = 3;
        if (wbxVar.f.size() > 0) {
            java.util.Collection<defpackage.wbt> collectionValues = j$.util.DesugarCollections.unmodifiableMap(wbxVar.f).values();
            if (collectionValues == null) {
                yheVarD = defpackage.ync.a;
            } else {
                defpackage.yha yhaVar = new defpackage.yha(4);
                for (defpackage.wbt wbtVar : collectionValues) {
                    int i = wbtVar.c;
                    int iBK = defpackage.sqs.bK(i);
                    if (iBK == 0) {
                        throw null;
                    }
                    int i2 = iBK - 1;
                    if (i2 == 0) {
                        yhaVar.f(wbtVar.e, java.lang.Long.valueOf(i == 1 ? ((java.lang.Long) wbtVar.d).longValue() : 0L));
                    } else if (i2 == 1) {
                        yhaVar.f(wbtVar.e, java.lang.Boolean.valueOf(i == 2 ? ((java.lang.Boolean) wbtVar.d).booleanValue() : false));
                    } else if (i2 == 2) {
                        yhaVar.f(wbtVar.e, java.lang.Double.valueOf(i == 3 ? ((java.lang.Double) wbtVar.d).doubleValue() : 0.0d));
                    } else if (i2 == 3) {
                        yhaVar.f(wbtVar.e, i == 4 ? (java.lang.String) wbtVar.d : "");
                    } else {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("Could not serialize Flag for override: ".concat(java.lang.String.valueOf(wbtVar.e)));
                        }
                        yhaVar.f(wbtVar.e, (i == 5 ? (defpackage.abnv) wbtVar.d : defpackage.abnv.d).D());
                    }
                }
                yheVarD = yhaVar.d(false);
            }
            if (!yheVarD.isEmpty()) {
                java.util.HashMap map = new java.util.HashMap(yheVarD);
                defpackage.yig yigVar = new defpackage.yig(defpackage.ymn.a);
                defpackage.yot it = wccVar.b.iterator();
                while (it.hasNext()) {
                    defpackage.wcb wcbVar = (defpackage.wcb) it.next();
                    java.lang.Object objRemove = map.remove(wcbVar.b());
                    if (objRemove == null) {
                        yigVar.n(wcbVar);
                    } else {
                        if (objRemove instanceof java.lang.String) {
                            yotVar = it;
                            yigVar.n(new defpackage.wcb(wcbVar.a, wcbVar.b, 4, 0L, objRemove));
                        } else {
                            yotVar = it;
                            if (objRemove instanceof byte[]) {
                                yigVar.n(new defpackage.wcb(wcbVar.a, wcbVar.b, 5, 0L, objRemove));
                            } else if (objRemove instanceof java.lang.Boolean) {
                                yigVar.n(new defpackage.wcb(wcbVar.a, wcbVar.b, ((java.lang.Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                            } else if (objRemove instanceof java.lang.Long) {
                                yigVar.n(new defpackage.wcb(wcbVar.a, wcbVar.b, 2, ((java.lang.Long) objRemove).longValue(), null));
                            } else {
                                if (!(objRemove instanceof java.lang.Double)) {
                                    throw new java.lang.IllegalStateException("Cannot serialize override for existing flag " + wcbVar.b() + ": " + objRemove.toString());
                                }
                                yigVar.n(new defpackage.wcb(wcbVar.a, wcbVar.b, 3, java.lang.Double.doubleToRawLongBits(((java.lang.Double) objRemove).doubleValue()), null));
                            }
                        }
                        it = yotVar;
                    }
                }
                for (java.lang.String str : map.keySet()) {
                    java.lang.Object obj = map.get(str);
                    int length = str.length();
                    if (length > 19) {
                        c = c2;
                        j = 0;
                        j2 = j;
                        break;
                    }
                    if (length != 0) {
                        long jCharAt = str.charAt(0) - '0';
                        if (jCharAt < 1) {
                            c = c2;
                            j = 0;
                        } else if (jCharAt <= 9) {
                            int i3 = 1;
                            while (true) {
                                if (i3 >= length) {
                                    c = c2;
                                    j = 0;
                                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                        j2 = jCharAt;
                                        break;
                                    }
                                    break;
                                }
                                c = c2;
                                int iCharAt = str.charAt(i3) - '0';
                                j = 0;
                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                    i3++;
                                    c2 = c;
                                }
                            }
                        } else {
                            c = c2;
                            j = 0;
                            j2 = 0;
                        }
                        j2 = j;
                        break;
                    } else {
                        c = c2;
                        j = 0;
                        j2 = 0;
                    }
                    java.lang.String str2 = j2 == j ? str : null;
                    if (obj instanceof java.lang.String) {
                        yigVar.n(new defpackage.wcb(j2, str2, 4, 0L, obj));
                    } else if (obj instanceof byte[]) {
                        yigVar.n(new defpackage.wcb(j2, str2, 5, 0L, obj));
                    } else if (obj instanceof java.lang.Boolean) {
                        yigVar.n(new defpackage.wcb(j2, str2, ((java.lang.Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                    } else if (obj instanceof java.lang.Long) {
                        yigVar.n(new defpackage.wcb(j2, str2, 2, ((java.lang.Long) obj).longValue(), null));
                    } else {
                        if (!(obj instanceof java.lang.Double)) {
                            throw new java.lang.IllegalStateException("Cannot serialize override " + str + ": " + java.lang.String.valueOf(obj));
                        }
                        yigVar.n(new defpackage.wcb(j2, str2, 3, java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()), null));
                    }
                    c2 = c;
                }
                wccVar = new defpackage.wcc(yigVar.g());
            }
        }
        defpackage.yii yiiVar = wccVar.b;
        int size = yiiVar.size() + 3;
        defpackage.ysr.aL(size, "expectedSize");
        defpackage.yha yhaVar2 = new defpackage.yha(size);
        defpackage.yot it2 = yiiVar.iterator();
        while (it2.hasNext()) {
            defpackage.wcb wcbVar2 = (defpackage.wcb) it2.next();
            yhaVar2.f(wcbVar2.b(), wcbVar2.a());
        }
        yhaVar2.f("__phenotype_server_token", wcdVar.b());
        yhaVar2.f("__phenotype_snapshot_token", wcdVar.c());
        yhaVar2.f("__phenotype_configuration_version", java.lang.Long.valueOf(wcdVar.a()));
        this.e = yhaVar2.d(false);
        this.f = wehVar;
    }

    public final boolean a() {
        return this.f.b == 3;
    }

    public final boolean b() {
        return this.f.a;
    }

    public wei(wek wekVar, defpackage.weh wehVar) {
        defpackage.abnv abnvVar;
        java.lang.String str;
        this.b = wek.a.equals(wekVar);
        this.c = wekVar.c;
        this.d = wekVar.d;
        java.lang.String str2 = wekVar.e;
        long j = wekVar.f;
        defpackage.ynd yndVar = defpackage.ynd.a;
        defpackage.yha yhaVarH = defpackage.yhe.h(wekVar.g.size() + 3);
        for (wel welVar : wekVar.g) {
            int i = welVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                yhaVarH.f(welVar.e, java.lang.Long.valueOf(i == 2 ? ((java.lang.Long) welVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                yhaVarH.f(welVar.e, java.lang.Boolean.valueOf(i == 3 ? ((java.lang.Boolean) welVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                yhaVarH.f(welVar.e, java.lang.Double.valueOf(i == 4 ? ((java.lang.Double) welVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                java.lang.String str3 = welVar.e;
                if (i == 5) {
                    str = (java.lang.String) welVar.d;
                } else {
                    str = "";
                }
                yhaVarH.f(str3, str);
            } else if (i3 == 4) {
                java.lang.String str4 = welVar.e;
                if (i == 6) {
                    abnvVar = (defpackage.abnv) welVar.d;
                } else {
                    abnvVar = defpackage.abnv.d;
                }
                yhaVarH.f(str4, abnvVar.D());
            }
        }
        yhaVarH.f("__phenotype_server_token", wekVar.e);
        yhaVarH.f("__phenotype_snapshot_token", wekVar.c);
        yhaVarH.f("__phenotype_configuration_version", java.lang.Long.valueOf(wekVar.f));
        this.e = yhaVarH.d(false);
        this.f = wehVar;
    }
}
