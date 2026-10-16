package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ebm {
    public static defpackage.edf a(android.view.View view) {
        android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        defpackage.edf edfVar = new defpackage.edf(rootWindowInsets);
        edfVar.u(edfVar);
        edfVar.r(view.getRootView());
        return edfVar;
    }

    public static defpackage.aisp b(android.view.ViewGroup viewGroup) {
        viewGroup.getClass();
        return new defpackage.ebw(viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object c(java.io.File file, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.egt egtVar;
        if (afdkVar instanceof defpackage.egt) {
            egtVar = (defpackage.egt) afdkVar;
            int i = egtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                egtVar.c = i - Integer.MIN_VALUE;
            } else {
                egtVar = new defpackage.egt(afdkVar);
            }
        } else {
            egtVar = new defpackage.egt(afdkVar);
        }
        java.lang.Object obj = egtVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = egtVar.c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = egtVar.a;
                defpackage.afga.cz(obj);
                return obj;
            }
            defpackage.afga.cz(obj);
            egtVar.a = file;
            egtVar.c = 1;
            java.lang.Object objInvoke = affcVar.invoke(egtVar);
            return objInvoke == afdrVar ? afdrVar : objInvoke;
        } catch (java.io.IOException e) {
            if (e instanceof defpackage.eex) {
                throw e;
            }
            file.getClass();
            java.io.File file2 = file;
            if (!file2.exists()) {
                throw defpackage.dti.c(file2, e);
            }
            if (file2.isFile()) {
                if (file2.canRead()) {
                    if (file2.canWrite()) {
                        throw defpackage.dti.c(file2, e);
                    }
                    throw defpackage.dti.c(file2, e);
                }
                if (file2.canWrite()) {
                    throw defpackage.dti.c(file2, e);
                }
                throw defpackage.dti.c(file2, e);
            }
            if (file2.canRead()) {
                if (file2.canWrite()) {
                    throw defpackage.dti.c(file2, e);
                }
                throw defpackage.dti.c(file2, e);
            }
            if (file2.canWrite()) {
                throw defpackage.dti.c(file2, e);
            }
            throw defpackage.dti.c(file2, e);
        }
    }

    public static defpackage.evs d(android.util.TypedValue typedValue, defpackage.evs evsVar, defpackage.evs evsVar2, java.lang.String str, java.lang.String str2) throws org.xmlpull.v1.XmlPullParserException {
        if (evsVar == null || evsVar == evsVar2) {
            return evsVar == null ? evsVar2 : evsVar;
        }
        throw new org.xmlpull.v1.XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public static defpackage.aisp e(defpackage.evg evgVar) {
        return defpackage.afsg.f(evgVar, new defpackage.dne(16));
    }

    public static defpackage.aisp f(defpackage.evf evfVar) {
        evfVar.getClass();
        return defpackage.afsg.f(evfVar, new defpackage.dne(15));
    }

    public static java.lang.String g(defpackage.erh erhVar, int i) {
        erhVar.getClass();
        return i <= 16777215 ? java.lang.String.valueOf(i) : erhVar.i(i);
    }

    public static defpackage.euw h(defpackage.erh erhVar, defpackage.evf evfVar, android.os.Bundle bundle, defpackage.epx epxVar, defpackage.evt evtVar, java.lang.String str, android.os.Bundle bundle2) {
        epxVar.getClass();
        return new defpackage.euw(erhVar, evfVar, bundle, epxVar, evtVar, str, bundle2);
    }

    public static /* synthetic */ defpackage.euw i(defpackage.erh erhVar, defpackage.evf evfVar, android.os.Bundle bundle, defpackage.epx epxVar, defpackage.evt evtVar) {
        java.lang.String string = java.util.UUID.randomUUID().toString();
        string.getClass();
        return h(erhVar, evfVar, bundle, epxVar, evtVar, string, null);
    }

    public static int j(int i) {
        if (i == 260) {
            return 1;
        }
        if (i == 261) {
            return 2;
        }
        switch (i) {
            case 19:
                return 33;
            case 20:
                return 130;
            case 21:
                return 17;
            case 22:
                return 66;
            default:
                return -1;
        }
    }

    public static boolean k(int i) {
        return i == 20 || i == 19 || i == 22 || i == 21;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0181 A[SYNTHETIC] */
    public static void l(defpackage.jhl jhlVar, android.util.SparseArray sparseArray, java.util.UUID uuid, boolean z, defpackage.jhm jhmVar, int i) {
        defpackage.ygw ygwVarE;
        int i2;
        jhlVar.getClass();
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i3 = i; i3 < size; i3++) {
            java.util.List list = (java.util.List) sparseArray.valueAt(i3);
            if (list != null) {
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    defpackage.jhl jhlVar2 = (defpackage.jhl) list.get(i4);
                    if (i3 != i) {
                        if (defpackage.afga.f(jhlVar2.G(), uuid)) {
                            ygwVarE = jhlVar.E();
                            ygwVarE.getClass();
                            if (defpackage.afga.bh(ygwVarE, jhlVar2.D()) && ((jhlVar2.aE() || jhlVar2.aZ()) && jhlVar2.e() == 0)) {
                                defpackage.jhm jhmVarAM = jhlVar2.aM();
                                int iF = z ? jhmVarAM.e.f() : 1;
                                if (defpackage.tis.h(jhmVarAM.a, jhmVar.a) && defpackage.tis.g(jhmVarAM.c, jhmVar.c)) {
                                    if (defpackage.tis.h(jhmVarAM.b, jhmVar.b)) {
                                        iF = 16;
                                    } else if (defpackage.tis.g(jhmVarAM.d, jhmVar.d)) {
                                        iF = 8;
                                    }
                                } else if (defpackage.tis.h(jhmVarAM.b, jhmVar.b) && defpackage.tis.g(jhmVarAM.d, jhmVar.d)) {
                                    if (defpackage.tis.h(jhmVarAM.a, jhmVar.a)) {
                                        iF = 2;
                                    } else if (defpackage.tis.g(jhmVarAM.c, jhmVar.c)) {
                                        iF = 4;
                                    }
                                }
                                if (iF != 1) {
                                    jhmVar.a(iF, jhmVarAM);
                                } else {
                                    defpackage.jhl jhlVar3 = jhmVar.e;
                                    if (!jhlVar3.aZ() && !jhmVarAM.e.aZ()) {
                                        throw new java.lang.IllegalStateException("Window " + jhmVarAM.toString() + " does not fully cover or provide a hint for one side of " + jhmVar.toString());
                                    }
                                    if (jhmVar.a == jhlVar3.b() && jhmVar.c == jhlVar3.b() + jhlVar3.k()) {
                                        if (defpackage.tis.h(jhmVarAM.a, jhmVar.a)) {
                                            i2 = 2;
                                        } else if (defpackage.tis.g(jhmVarAM.c, jhmVar.c)) {
                                            i2 = 4;
                                        } else {
                                            i2 = iF;
                                        }
                                    } else if (jhmVar.b != jhlVar3.c() || jhmVar.d != jhlVar3.c() + jhlVar3.d()) {
                                        i2 = iF;
                                    } else if (defpackage.tis.h(jhmVarAM.b, jhmVar.b)) {
                                        i2 = 16;
                                    } else if (defpackage.tis.g(jhmVarAM.d, jhmVar.d)) {
                                        i2 = 8;
                                    } else {
                                        i2 = iF;
                                    }
                                    jhmVar.a(i2, jhmVarAM);
                                }
                            }
                        } else {
                            continue;
                        }
                    } else if (jhlVar2 == jhlVar) {
                        z2 = true;
                    } else if (z2) {
                        if (defpackage.afga.f(jhlVar2.G(), uuid)) {
                            ygwVarE = jhlVar.E();
                            ygwVarE.getClass();
                            if (defpackage.afga.bh(ygwVarE, jhlVar2.D())) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    public static android.graphics.Bitmap m(java.nio.IntBuffer intBuffer, int i, int i2) {
        int[] iArrArray = intBuffer.array();
        iArrArray.getClass();
        for (int i3 = 0; i3 < iArrArray.length; i3++) {
            int i4 = iArrArray[i3];
            iArrArray[i3] = (i4 & (-16711936)) | ((i4 >> 16) & 255) | ((i4 & 255) << 16);
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iArrArray, (i2 - 1) * i, -i, i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    public static java.lang.String n() {
        return android.os.Build.VERSION.SDK_INT >= 34 ? "Android Auto" : "AA-GAL";
    }

    public static float o(int i, int i2) {
        return i * (i2 / 160.0f);
    }

    public static float p(int i, int i2) {
        return (i * 160) / i2;
    }

    public static int q(java.lang.Integer num) {
        return ((java.lang.Integer) new defpackage.nub(num).i(0)).intValue();
    }

    public static long r(java.lang.Long l) {
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d A[RETURN] */
    public static boolean s(defpackage.xpa xpaVar, boolean z) {
        if (z) {
            return (xpaVar.b & 32) != 0;
        }
        defpackage.xlp xlpVar = xpaVar.e;
        if (xlpVar == null) {
            xlpVar = defpackage.xlp.a;
        }
        if ((xlpVar.b & 2) != 0) {
            defpackage.xlp xlpVar2 = xpaVar.e;
            if (xlpVar2 == null) {
                xlpVar2 = defpackage.xlp.a;
            }
            if (xlpVar2.f.size() != 0) {
                if ((xpaVar.b & 32) != 0) {
                    return false;
                }
            }
        } else if ((xpaVar.b & 32) != 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ java.lang.String t(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "CAR_SERVICE_PROXY";
        }
        return "CAR_SERVICE_DEFAULT";
    }
}
