package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kmv {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ProtoFlagsUtil");

    public static defpackage.yhe a(defpackage.absk abskVar) {
        defpackage.abpj abpjVar = abskVar.d;
        defpackage.yha yhaVar = new defpackage.yha(4);
        java.util.Iterator<E> it = abpjVar.iterator();
        while (it.hasNext()) {
            java.util.List listI = defpackage.xzd.c(':').i((java.lang.String) it.next());
            if (!listI.isEmpty()) {
                java.lang.String str = (java.lang.String) listI.get(0);
                if (!android.text.TextUtils.isEmpty(str)) {
                    if (listI.size() == 1) {
                        int i = defpackage.ygw.d;
                        yhaVar.f(str, defpackage.ymx.a);
                    } else {
                        yhaVar.f(str, listI.subList(1, listI.size()));
                    }
                }
            }
        }
        return yhaVar.d(false);
    }

    public static boolean b(defpackage.absk abskVar, android.content.ComponentName componentName) {
        int iAr = defpackage.a.ar(abskVar.c);
        if (iAr == 0) {
            iAr = 1;
        }
        int i = iAr - 1;
        switch (i) {
            case 1:
                componentName.flattenToString();
                return false;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.util.Iterator<E> it = abskVar.d.iterator();
                while (it.hasNext()) {
                    if (g((java.lang.String) it.next(), componentName)) {
                        componentName.flattenToString();
                        return true;
                    }
                }
                componentName.flattenToString();
                return false;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.Iterator<E> it2 = abskVar.d.iterator();
                while (it2.hasNext()) {
                    if (g((java.lang.String) it2.next(), componentName)) {
                        componentName.flattenToString();
                        return false;
                    }
                }
                componentName.flattenToString();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                componentName.flattenToString();
                return true;
            default:
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(3225)).D("Undefined filter mode %d and componentName %s", i, componentName.flattenToString());
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[RETURN] */
    public static boolean c(defpackage.absk abskVar, java.lang.String str) {
        int iAr = defpackage.a.ar(abskVar.c);
        if (iAr == 0) {
            iAr = 1;
        }
        int i = iAr - 1;
        switch (i) {
            case 1:
                return false;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return abskVar.d.contains(str);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                if (abskVar.d.contains(str)) {
                    return false;
                }
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return true;
            default:
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(3237)).D("Undefined filter mode %d and tagName %s", i, str);
                return false;
        }
    }

    public static boolean d(defpackage.absk abskVar, java.util.List list) {
        int iAr = defpackage.a.ar(abskVar.c);
        if (iAr == 0) {
            iAr = 1;
        }
        int i = iAr - 1;
        switch (i) {
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (abskVar.d.contains(it.next().toString())) {
                        return true;
                    }
                }
            case 1:
                return false;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (abskVar.d.contains(it2.next().toString())) {
                        return false;
                    }
                }
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return true;
            default:
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(3238)).D("Undefined filter mode %d and tagNames %s", i, list);
                return false;
        }
    }

    public static boolean e(defpackage.absk abskVar, java.lang.String str) {
        defpackage.abor aborVarN = defpackage.absk.a.n();
        int iAr = defpackage.a.ar(abskVar.c);
        if (iAr == 0) {
            iAr = 1;
        }
        aborVarN.t();
        defpackage.absk abskVar2 = (defpackage.absk) aborVarN.b;
        abskVar2.c = iAr - 1;
        abskVar2.b |= 1;
        defpackage.yhx yhxVarKeySet = a(abskVar).keySet();
        aborVarN.t();
        defpackage.absk abskVar3 = (defpackage.absk) aborVarN.b;
        defpackage.abpj abpjVar = abskVar3.d;
        if (!abpjVar.c()) {
            abskVar3.d = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(yhxVarKeySet, abskVar3.d);
        return c((defpackage.absk) aborVarN.q(), str);
    }

    public static boolean f(android.content.Context context, java.util.List list, java.lang.String str) {
        return new defpackage.ths(context, list).a(str);
    }

    private static boolean g(java.lang.String str, android.content.ComponentName componentName) {
        return str.endsWith("/*") ? str.regionMatches(false, 0, componentName.getPackageName(), 0, str.length() - 2) : str.equals(componentName.flattenToString());
    }
}
