package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agwk {
    public static org.json.JSONObject a(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (org.json.JSONException e) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "Failed adding a default object for key [", "]"), e);
        }
    }

    public static java.lang.String b(java.lang.String str) {
        return "cn_".concat(java.lang.String.valueOf(str));
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (i(str, 3)) {
            java.lang.Throwable thK = k(objArr);
            java.lang.String strJ = j(str2, thK, objArr);
            java.lang.String strB = b(str);
            if (thK != null) {
                android.util.Log.d(strB, strJ, thK);
            } else {
                android.util.Log.d(strB, strJ);
            }
        }
    }

    private static final defpackage.agwu child(defpackage.agwu agwuVar, defpackage.agci agciVar, defpackage.ahay ahayVar, int i, defpackage.afar<defpackage.ague> afarVar) {
        return new defpackage.agwu(agwuVar.getComponents(), ahayVar != null ? new defpackage.agww(agwuVar, agciVar, ahayVar, i) : agwuVar.getTypeParameterResolver(), afarVar);
    }

    public static final defpackage.agwu childForClassOrPackage(defpackage.agwu agwuVar, defpackage.agcc agccVar, defpackage.ahay ahayVar, int i) {
        agwuVar.getClass();
        agccVar.getClass();
        return child(agwuVar, agccVar, ahayVar, i, defpackage.afga.cB(3, new defpackage.agwi(agwuVar, agccVar)));
    }

    public static /* synthetic */ defpackage.agwu childForClassOrPackage$default(defpackage.agwu agwuVar, defpackage.agcc agccVar, defpackage.ahay ahayVar, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            ahayVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForClassOrPackage(agwuVar, agccVar, ahayVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ague childForClassOrPackage$lambda$0(defpackage.agwu agwuVar, defpackage.agcc agccVar) {
        return computeNewDefaultTypeQualifiers(agwuVar, agccVar.getAnnotations());
    }

    public static final defpackage.agwu childForMethod(defpackage.agwu agwuVar, defpackage.agci agciVar, defpackage.ahay ahayVar, int i) {
        agwuVar.getClass();
        agciVar.getClass();
        ahayVar.getClass();
        return child(agwuVar, agciVar, ahayVar, i, agwuVar.getDelegateForDefaultTypeQualifiers$org_jetbrains_kotlin_descriptors_jvm());
    }

    public static /* synthetic */ defpackage.agwu childForMethod$default(defpackage.agwu agwuVar, defpackage.agci agciVar, defpackage.ahay ahayVar, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForMethod(agwuVar, agciVar, ahayVar, i);
    }

    public static final defpackage.ague computeNewDefaultTypeQualifiers(defpackage.agwu agwuVar, defpackage.aggk aggkVar) {
        agwuVar.getClass();
        aggkVar.getClass();
        return defpackage.agsu.extractAndMergeDefaultQualifiers$default(agwuVar.getComponents().getAnnotationTypeQualifierResolver(), agwuVar.getDefaultTypeQualifiers(), aggkVar, false, 4, null);
    }

    public static final defpackage.agwu copyWithNewDefaultTypeQualifiers(defpackage.agwu agwuVar, defpackage.aggk aggkVar) {
        agwuVar.getClass();
        aggkVar.getClass();
        return aggkVar.isEmpty() ? agwuVar : new defpackage.agwu(agwuVar.getComponents(), agwuVar.getTypeParameterResolver(), defpackage.afga.cB(3, new defpackage.agwj(agwuVar, aggkVar)));
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.e(b(str), str2, th);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        android.util.Log.i(b(str), str2);
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.i(b(str), str2, th);
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (i(str, 2)) {
            java.lang.Throwable thK = k(objArr);
            java.lang.String strJ = j(str2, thK, objArr);
            java.lang.String strB = b(str);
            if (thK != null) {
                android.util.Log.v(strB, strJ, thK);
            } else {
                android.util.Log.v(strB, strJ);
            }
        }
    }

    public static void h(java.lang.String str, java.lang.String str2) {
        android.util.Log.w(b(str), str2);
    }

    public static boolean i(java.lang.String str, int i) {
        return android.util.Log.isLoggable(str, i);
    }

    private static java.lang.String j(java.lang.String str, java.lang.Throwable th, java.lang.Object[] objArr) {
        return (th != null || objArr.length <= 0) ? str : java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    private static java.lang.Throwable k(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        java.lang.Object obj = objArr[0];
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        return null;
    }

    public static final defpackage.agwu replaceComponents(defpackage.agwu agwuVar, defpackage.agwl agwlVar) {
        agwuVar.getClass();
        agwlVar.getClass();
        return new defpackage.agwu(agwlVar, agwuVar.getTypeParameterResolver(), agwuVar.getDelegateForDefaultTypeQualifiers$org_jetbrains_kotlin_descriptors_jvm());
    }

    public static final defpackage.agwu child(defpackage.agwu agwuVar, defpackage.agxa agxaVar) {
        agwuVar.getClass();
        agxaVar.getClass();
        return new defpackage.agwu(agwuVar.getComponents(), agxaVar, agwuVar.getDelegateForDefaultTypeQualifiers$org_jetbrains_kotlin_descriptors_jvm());
    }
}
