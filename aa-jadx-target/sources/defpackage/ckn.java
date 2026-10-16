package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ckn {
    private static java.lang.reflect.Method a;
    private static java.lang.reflect.Method b;
    private static boolean c;

    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final android.graphics.Rect b(defpackage.dlx dlxVar) {
        return new android.graphics.Rect(dlxVar.b, dlxVar.c, dlxVar.d, dlxVar.e);
    }

    public static final android.graphics.RectF c(defpackage.cjj cjjVar) {
        return new android.graphics.RectF(cjjVar.b, cjjVar.c, cjjVar.d, cjjVar.e);
    }

    public static final defpackage.cjj d(android.graphics.Rect rect) {
        return new defpackage.cjj(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final defpackage.cjj e(android.graphics.RectF rectF) {
        return new defpackage.cjj(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final defpackage.dlx f(android.graphics.Rect rect) {
        return new defpackage.dlx(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final void g(android.graphics.Canvas canvas, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (z) {
                alh$.ExternalSyntheticApiModelOutline0.m(canvas);
                return;
            } else {
                alh$.ExternalSyntheticApiModelOutline0.m$1(canvas);
                return;
            }
        }
        if (!c) {
            try {
                if (android.os.Build.VERSION.SDK_INT == 28) {
                    java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass());
                    a = (java.lang.reflect.Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new java.lang.Class[0]);
                    b = (java.lang.reflect.Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new java.lang.Class[0]);
                } else {
                    a = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    b = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                java.lang.reflect.Method method = a;
                if (method != null) {
                    method.setAccessible(true);
                }
                java.lang.reflect.Method method2 = b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
            c = true;
        }
        try {
            if (z) {
                java.lang.reflect.Method method3 = a;
                if (method3 != null) {
                    method3.invoke(canvas, null);
                }
            } else {
                java.lang.reflect.Method method4 = b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            }
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
        }
    }

    public static void h(defpackage.ckc ckcVar, defpackage.cjj cjjVar) {
        ckcVar.a(cjjVar.b, cjjVar.c, cjjVar.d, cjjVar.e, 1);
    }

    public static final int i(android.os.Bundle bundle) {
        int iHashCode;
        java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            java.lang.Object obj = bundle.get(it.next());
            if (obj instanceof android.os.Bundle) {
                iHashCode = i((android.os.Bundle) obj);
            } else if (obj instanceof java.lang.Object[]) {
                iHashCode = java.util.Arrays.deepHashCode((java.lang.Object[]) obj);
            } else if (obj instanceof byte[]) {
                iHashCode = java.util.Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                iHashCode = java.util.Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                iHashCode = java.util.Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                iHashCode = java.util.Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                iHashCode = java.util.Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                iHashCode = java.util.Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                iHashCode = java.util.Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                iHashCode = java.util.Arrays.hashCode((boolean[]) obj);
            } else {
                iHashCode = obj != null ? obj.hashCode() : 0;
            }
            i = (i * 31) + iHashCode;
        }
        return i;
    }

    public static final boolean j(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            java.lang.Object obj2 = bundle2.get(str);
            if (obj != obj2 && !defpackage.afga.f(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof android.os.Bundle) && (obj2 instanceof android.os.Bundle)) {
                        if (!j((android.os.Bundle) obj, (android.os.Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
                        if (!defpackage.afga.bw((java.lang.Object[]) obj, (java.lang.Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!java.util.Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!java.util.Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!java.util.Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!java.util.Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!java.util.Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!java.util.Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!java.util.Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!defpackage.afga.f(obj, obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final void k(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "No valid saved state was found for the key '", "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final java.lang.String l(java.util.Collection collection) {
        return !collection.isEmpty() ? afzh.H(defpackage.afga.bo(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final java.lang.String m(java.util.Collection collection) {
        return afzh.H(defpackage.afga.bo(collection, ",", null, null, null, 62)).concat(afzh.H(" }"));
    }

    public static final java.lang.String n(java.util.Collection collection) {
        return afzh.H(defpackage.afga.bo(collection, ",", null, null, null, 62)).concat(afzh.H("},"));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    public static final boolean o(java.lang.String str, java.lang.String str2) {
        if (defpackage.afga.f(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0) {
                    if (cCharAt != '(') {
                        i2++;
                    } else if (cCharAt != ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                } else if (cCharAt == '(') {
                    i3 = 0;
                    cCharAt = '(';
                    if (cCharAt != '(') {
                        i2++;
                    } else if (cCharAt != ')') {
                        continue;
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                java.lang.String strSubstring = str.substring(1, str.length() - 1);
                strSubstring.getClass();
                return defpackage.afga.f(afzh.k(strSubstring).toString(), str2);
            }
        }
        return false;
    }

    public static final boolean p(fbe fbeVar, java.lang.Object obj) {
        java.util.Set set;
        if (fbeVar == obj) {
            return true;
        }
        if (!(obj instanceof fbe)) {
            return false;
        }
        fbe fbeVar2 = (fbe) obj;
        if (!defpackage.afga.f(fbeVar.a, fbeVar2.a) || !defpackage.afga.f(fbeVar.b, fbeVar2.b) || !defpackage.afga.f(fbeVar.c, fbeVar2.c)) {
            return false;
        }
        java.util.Set set2 = fbeVar.d;
        if (set2 == null || (set = fbeVar2.d) == null) {
            return true;
        }
        return defpackage.afga.f(set2, set);
    }

    public static final fbe q(fch fchVar, java.lang.String str) throws java.lang.Exception {
        long j;
        java.util.Map mapE;
        java.util.Set set;
        java.lang.Throwable th;
        java.lang.Throwable fbdVar;
        fch fchVar2 = fchVar;
        fbr fbrVarA = fchVar2.a(defpackage.a.bp(str, "PRAGMA table_info(`", "`)"));
        try {
            java.lang.String str2 = "name";
            if (fbrVarA.k()) {
                int iE = defpackage.cdp.e(fbrVarA, "name");
                int iE2 = defpackage.cdp.e(fbrVarA, "type");
                int iE3 = defpackage.cdp.e(fbrVarA, "notnull");
                int iE4 = defpackage.cdp.e(fbrVarA, "pk");
                int iE5 = defpackage.cdp.e(fbrVarA, "dflt_value");
                j = 0;
                defpackage.afcy afcyVar = new defpackage.afcy(8);
                while (true) {
                    java.lang.String strD = fbrVarA.d(iE);
                    afcyVar.put(strD, new fbb(strD, fbrVarA.d(iE2), fbrVarA.b(iE3) != 0, (int) fbrVarA.b(iE4), fbrVarA.j(iE5) ? null : fbrVarA.d(iE5), 2));
                    if (!fbrVarA.k()) {
                        break;
                    }
                    fchVar2 = fchVar;
                }
                mapE = afcyVar.e();
                defpackage.afga.m(fbrVarA, null);
            } else {
                mapE = defpackage.afcf.a;
                defpackage.afga.m(fbrVarA, null);
                j = 0;
            }
            fbr fbrVarA2 = fchVar2.a(defpackage.a.bp(str, "PRAGMA foreign_key_list(`", "`)"));
            try {
                int iE6 = defpackage.cdp.e(fbrVarA2, "id");
                int iE7 = defpackage.cdp.e(fbrVarA2, "seq");
                int iE8 = defpackage.cdp.e(fbrVarA2, "table");
                int iE9 = defpackage.cdp.e(fbrVarA2, "on_delete");
                int iE10 = defpackage.cdp.e(fbrVarA2, "on_update");
                int iE11 = defpackage.cdp.e(fbrVarA2, "id");
                int iE12 = defpackage.cdp.e(fbrVarA2, "seq");
                int iE13 = defpackage.cdp.e(fbrVarA2, "from");
                int iE14 = defpackage.cdp.e(fbrVarA2, "to");
                java.util.Map map = mapE;
                defpackage.afct afctVar = new defpackage.afct(10);
                while (fbrVarA2.k()) {
                    afctVar.add(new fba((int) fbrVarA2.b(iE11), (int) fbrVarA2.b(iE12), fbrVarA2.d(iE13), fbrVarA2.d(iE14)));
                    iE9 = iE9;
                    str2 = str2;
                }
                int i = iE9;
                java.lang.String str3 = str2;
                java.util.List listAV = defpackage.afga.aV(afctVar.f());
                fbrVarA2.i();
                defpackage.afde afdeVar = new defpackage.afde();
                while (fbrVarA2.k()) {
                    if (fbrVarA2.b(iE7) == j) {
                        int iB = (int) fbrVarA2.b(iE6);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList<fba> arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj : listAV) {
                            if (((fba) obj).a == iB) {
                                arrayList3.add(obj);
                            }
                        }
                        for (fba fbaVar : arrayList3) {
                            arrayList.add(fbaVar.b);
                            arrayList2.add(fbaVar.c);
                        }
                        int i2 = i;
                        afdeVar.add(new fbc(fbrVarA2.d(iE8), fbrVarA2.d(i2), fbrVarA2.d(iE10), arrayList, arrayList2));
                        i = i2;
                    }
                }
                java.util.Set setH = defpackage.afga.H(afdeVar);
                defpackage.afga.m(fbrVarA2, null);
                fchVar = fchVar;
                fbr fbrVarA3 = fchVar.a(defpackage.a.bp(str, "PRAGMA index_list(`", "`)"));
                java.lang.String str4 = str3;
                try {
                    int iE15 = defpackage.cdp.e(fbrVarA3, str4);
                    int iE16 = defpackage.cdp.e(fbrVarA3, "origin");
                    int iE17 = defpackage.cdp.e(fbrVarA3, "unique");
                    if (iE15 == -1 || iE16 == -1 || iE17 == -1) {
                        defpackage.afga.m(fbrVarA3, null);
                        set = null;
                    } else {
                        defpackage.afde afdeVar2 = new defpackage.afde();
                        while (fbrVarA3.k()) {
                            if (defpackage.afga.f("c", fbrVarA3.d(iE16))) {
                                java.lang.String strD2 = fbrVarA3.d(iE15);
                                boolean z = fbrVarA3.b(iE17) == 1;
                                fbr fbrVarA4 = fchVar.a(defpackage.a.bp(strD2, "PRAGMA index_xinfo(`", "`)"));
                                try {
                                    int iE18 = defpackage.cdp.e(fbrVarA4, "seqno");
                                    int iE19 = defpackage.cdp.e(fbrVarA4, "cid");
                                    int iE20 = defpackage.cdp.e(fbrVarA4, str4);
                                    int i3 = iE15;
                                    int iE21 = defpackage.cdp.e(fbrVarA4, "desc");
                                    int i4 = iE16;
                                    if (iE18 == -1 || iE19 == -1 || iE20 == -1 || iE21 == -1) {
                                        th = null;
                                        defpackage.afga.m(fbrVarA4, th);
                                        fbdVar = th;
                                    } else {
                                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                        iE17 = iE17;
                                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                        while (fbrVarA4.k()) {
                                            str4 = str4;
                                            if (((int) fbrVarA4.b(iE19)) >= 0) {
                                                int iB2 = (int) fbrVarA4.b(iE18);
                                                java.lang.String strD3 = fbrVarA4.d(iE20);
                                                java.lang.String str5 = fbrVarA4.b(iE21) > j ? "DESC" : "ASC";
                                                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iB2);
                                                linkedHashMap.put(numValueOf, strD3);
                                                linkedHashMap2.put(numValueOf, str5);
                                                iE21 = iE21;
                                            }
                                        }
                                        str4 = str4;
                                        java.util.List listAW = defpackage.afga.aW(linkedHashMap.entrySet(), new aiq(4));
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.afga.aj(listAW, 10));
                                        java.util.Iterator it = listAW.iterator();
                                        while (it.hasNext()) {
                                            arrayList4.add((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
                                        }
                                        java.util.List listAZ = defpackage.afga.aZ(arrayList4);
                                        java.util.List listAW2 = defpackage.afga.aW(linkedHashMap2.entrySet(), new aiq(5));
                                        java.util.ArrayList arrayList5 = new java.util.ArrayList(defpackage.afga.aj(listAW2, 10));
                                        java.util.Iterator it2 = listAW2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList5.add((java.lang.String) ((java.util.Map.Entry) it2.next()).getValue());
                                        }
                                        fbdVar = new fbd(strD2, z, listAZ, defpackage.afga.aZ(arrayList5));
                                        defpackage.afga.m(fbrVarA4, null);
                                        th = null;
                                    }
                                    if (fbdVar == null) {
                                        defpackage.afga.m(fbrVarA3, th);
                                        set = null;
                                    } else {
                                        afdeVar2.add(fbdVar);
                                        iE15 = i3;
                                        iE16 = i4;
                                        iE17 = iE17;
                                        str4 = str4;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (java.lang.Throwable th3) {
                                        defpackage.afga.m(fbrVarA4, th2);
                                        throw th3;
                                    }
                                }
                            }
                        }
                        java.util.Set setH2 = defpackage.afga.H(afdeVar2);
                        defpackage.afga.m(fbrVarA3, null);
                        set = setH2;
                    }
                    return new fbe(str, map, setH, set);
                } catch (java.lang.Throwable th4) {
                    try {
                        throw th4;
                    } catch (java.lang.Throwable th5) {
                        defpackage.afga.m(fbrVarA3, th4);
                        throw th5;
                    }
                }
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    defpackage.afga.m(fbrVarA2, th6);
                    throw th7;
                }
            }
        } catch (java.lang.Throwable th8) {
            try {
                throw th8;
            } catch (java.lang.Throwable th9) {
                defpackage.afga.m(fbrVarA, th8);
                throw th9;
            }
        }
    }
}
