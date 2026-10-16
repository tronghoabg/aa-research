package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdp {
    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void b(defpackage.czh czhVar, defpackage.affc affcVar) {
        if (affcVar.invoke(czhVar) != defpackage.czg.a) {
            return;
        }
        defpackage.dai.p(czhVar, affcVar);
    }

    public static final boolean c(defpackage.chb chbVar, long j) {
        if (!chbVar.q.A) {
            return false;
        }
        defpackage.cyl cylVarP = defpackage.cjv.r(chbVar).p();
        if (cylVarP.t()) {
            long j2 = cylVarP.j(0L);
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
            long j3 = chbVar.c;
            float f = ((int) (j3 >> 32)) + fIntBitsToFloat;
            float f2 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
            float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j >> 32));
            if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= f) {
                float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
                if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void d(int i, java.lang.Object obj, defpackage.bzd bzdVar, java.lang.Object obj2, java.util.List list) {
        if (bzdVar != null || defpackage.afga.f(obj, defpackage.bvd.a)) {
            if ((obj2 != null && bzdVar != null) || bzdVar != null) {
                throw null;
            }
            list.add(new defpackage.cfj(i));
        }
    }

    public static final int e(fbr fbrVar, java.lang.String str) {
        int iF = f(fbrVar, str);
        if (iF >= 0) {
            return iF;
        }
        int iF2 = f(fbrVar, "`" + str + '`');
        if (iF2 >= 0) {
            return iF2;
        }
        return -1;
    }

    public static final int f(fbr fbrVar, java.lang.String str) {
        int iA = fbrVar.a();
        for (int i = 0; i < iA; i++) {
            if (defpackage.afga.f(str, fbrVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int g(fbr fbrVar, java.lang.String str) throws java.io.IOException {
        int iE = e(fbrVar, str);
        if (iE >= 0) {
            return iE;
        }
        int iA = fbrVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            arrayList.add(fbrVar.c(i));
        }
        throw new java.lang.IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + defpackage.afga.bo(arrayList, null, null, null, null, 63) + ']');
    }

    public static final int h(fch fchVar) throws java.lang.Exception {
        fbr fbrVarA = fchVar.a("SELECT changes()");
        try {
            fbrVarA.k();
            int iB = (int) fbrVarA.b(0);
            defpackage.afga.m(fbrVarA, null);
            return iB;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.afga.m(fbrVarA, th);
                throw th2;
            }
        }
    }

    public static final java.lang.Object i(java.lang.Class cls) {
        java.lang.String name;
        java.lang.String str;
        java.lang.Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        java.lang.String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            canonicalName.getClass();
        }
        java.lang.String strConcat = afzh.I(canonicalName, '.', '_').concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            java.lang.Class<?> cls2 = java.lang.Class.forName(str, true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("Cannot access the constructor ".concat(java.lang.String.valueOf(cls.getCanonicalName())), e2);
        } catch (java.lang.InstantiationException e3) {
            throw new java.lang.RuntimeException("Failed to create an instance of ".concat(java.lang.String.valueOf(cls.getCanonicalName())), e3);
        }
    }

    public static final long j(defpackage.sr srVar) {
        android.view.DragEvent dragEvent = (android.view.DragEvent) srVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) java.lang.Float.floatToRawIntBits(x)) << 32) | (((long) java.lang.Float.floatToRawIntBits(y)) & 4294967295L);
    }
}
