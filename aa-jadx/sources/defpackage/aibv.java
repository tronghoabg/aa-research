package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aibv {
    public static final java.lang.Object a(long j, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        return d(new defpackage.aixl(j, afdkVar), affgVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object b(long j, defpackage.affg affgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aixm aixmVar;
        defpackage.aixk e;
        defpackage.afgv afgvVar;
        if (afdkVar instanceof defpackage.aixm) {
            aixmVar = (defpackage.aixm) afdkVar;
            int i = aixmVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aixmVar.b = i - Integer.MIN_VALUE;
            } else {
                aixmVar = new defpackage.aixm(afdkVar);
            }
        } else {
            aixmVar = new defpackage.aixm(afdkVar);
        }
        java.lang.Object obj = aixmVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aixmVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            if (j <= 0) {
                return null;
            }
            defpackage.afgv afgvVar2 = new defpackage.afgv();
            try {
                aixmVar.c = afgvVar2;
                aixmVar.b = 1;
                defpackage.aixl aixlVar = new defpackage.aixl(j, aixmVar);
                afgvVar2.a = aixlVar;
                java.lang.Object objD = d(aixlVar, affgVar);
                return objD == afdrVar ? afdrVar : objD;
            } catch (defpackage.aixk e2) {
                e = e2;
                afgvVar = afgvVar2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afgvVar = aixmVar.c;
            try {
                defpackage.afga.cz(obj);
                return obj;
            } catch (defpackage.aixk e3) {
                e = e3;
            }
        }
        if (e.a == afgvVar.a) {
            return null;
        }
        throw e;
    }

    public static final java.lang.Object c(long j, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        return b(defpackage.aipw.a(j), affgVar, afdkVar);
    }

    private static final java.lang.Object d(defpackage.aixl aixlVar, defpackage.affg affgVar) {
        defpackage.afgz.p(aixlVar, true, new defpackage.aivp(defpackage.aipw.e(aixlVar.c.gT()).h(aixlVar.b, aixlVar, ((defpackage.aitz) aixlVar).a)));
        return defpackage.afzh.T(aixlVar, false, aixlVar, affgVar);
    }

    public final java.io.InputStream loadResource(java.lang.String str) throws java.io.IOException {
        str.getClass();
        java.lang.ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            return java.lang.ClassLoader.getSystemResourceAsStream(str);
        }
        java.net.URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        java.net.URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
