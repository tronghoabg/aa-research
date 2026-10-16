package defpackage;

/* loaded from: classes.dex */
public final class ahnc {
    private ahnc() {
    }

    public static final Object a(afco afcoVar, afeg afegVar, afck afckVar) {
        Object objB;
        afco afcoVarHH = afckVar.hH();
        afco afcoVarA = aits.a(afcoVarHH, afcoVar);
        affx.f(afcoVarA);
        if (afcoVarA == afcoVarHH) {
            ajcw ajcwVar = new ajcw(afcoVarA, afckVar);
            objB = afus.b(ajcwVar, true, ajcwVar, afegVar);
        } else {
            bwi bwiVar = afcl.k;
            if (affa.f(afcoVarA.get(bwiVar), afcoVarHH.get(bwiVar))) {
                aiwp aiwpVar = new aiwp(afcoVarA, afckVar);
                afco afcoVar2 = ((aisz) aiwpVar).a;
                Object objB2 = ajdb.b(afcoVar2, null);
                try {
                    Object objB3 = afus.b(aiwpVar, true, aiwpVar, afegVar);
                    ajdb.c(afcoVar2, objB2);
                    objB = objB3;
                } catch (Throwable th) {
                    ajdb.c(afcoVar2, objB2);
                    throw th;
                }
            } else {
                aiuj aiujVar = new aiuj(afcoVarA, afckVar);
                afus.d(afegVar, aiujVar, aiujVar);
                aisv aisvVar = aiujVar.b;
                while (true) {
                    int i = aisvVar.b;
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objB = aivp.b(aiujVar.hN());
                        if (objB instanceof aito) {
                            throw ((aito) objB).b;
                        }
                    } else if (aisvVar.b(0, 1)) {
                        objB = afcr.a;
                        break;
                    }
                }
            }
        }
        if (objB == afcr.a) {
            afckVar.getClass();
        }
        return objB;
    }

    public static /* synthetic */ aiud b(aitx aitxVar, afco afcoVar, afeg afegVar, int i) {
        if ((i & 1) != 0) {
            afcoVar = afcp.a;
        }
        return e(aitxVar, afcoVar, afegVar);
    }

    public static final aivh c(aitx aitxVar, afco afcoVar, int i, afeg afegVar) {
        afco afcoVarB = aits.b(aitxVar, afcoVar);
        aisz aivqVar = i == 2 ? new aivq(afcoVarB, afegVar) : new aiwf(afcoVarB, true);
        ahno.a(i, afegVar, aivqVar, aivqVar);
        return aivqVar;
    }

    public static /* synthetic */ aivh d(aitx aitxVar, afco afcoVar, int i, afeg afegVar, int i2) {
        if ((i2 & 1) != 0) {
            afcoVar = afcp.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return c(aitxVar, afcoVar, i, afegVar);
    }

    public static final aiud e(aitx aitxVar, afco afcoVar, afeg afegVar) {
        aiue aiueVar = new aiue(aits.b(aitxVar, afcoVar), true);
        ahno.a(1, afegVar, aiueVar, aiueVar);
        return aiueVar;
    }

    public final ahnd fromString(String str, boolean z) {
        String strJ;
        str.getClass();
        int iD = afyh.D(str, '`', 0);
        if (iD == -1) {
            iD = str.length();
        }
        int iF = afyh.F(str, "/", iD, 4);
        String str2 = "";
        if (iF == -1) {
            strJ = afyh.J(str, "`", "");
        } else {
            String strSubstring = str.substring(0, iF);
            strSubstring.getClass();
            String strI = afyh.I(strSubstring, '/', '.');
            String strSubstring2 = str.substring(iF + 1);
            strSubstring2.getClass();
            strJ = afyh.J(strSubstring2, "`", "");
            str2 = strI;
        }
        return new ahnd(new ahnf(str2), new ahnf(strJ), z);
    }

    public final ahnd topLevel(ahnf ahnfVar) {
        ahnfVar.getClass();
        return new ahnd(ahnfVar.parent(), ahnfVar.shortName());
    }

    public /* synthetic */ ahnc(afeu afeuVar) {
        this();
    }
}
