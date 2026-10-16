package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajzs extends defpackage.ajza {
    /* JADX WARN: Illegal instructions before constructor call */
    public ajzs(java.lang.String[] strArr) {
        defpackage.ajvh[] ajvhVarArr = new defpackage.ajvh[5];
        ajvhVarArr[0] = new defpackage.ajzg();
        ajvhVarArr[1] = new defpackage.ajzq();
        ajvhVarArr[2] = new defpackage.ajzh();
        ajvhVarArr[3] = new defpackage.ajzf(1);
        ajvhVarArr[4] = new defpackage.ajze(strArr != null ? (java.lang.String[]) strArr.clone() : new java.lang.String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
        super(ajvhVarArr);
    }

    @Override // defpackage.ajvo
    public final int a() {
        return 0;
    }

    @Override // defpackage.ajvo
    public final java.util.List b(java.util.List list) {
        defpackage.aguw.c(list, "List of cookies");
        defpackage.akch akchVar = new defpackage.akch(list.size() * 20);
        akchVar.f("Cookie");
        akchVar.f(": ");
        for (int i = 0; i < list.size(); i++) {
            defpackage.ajvi ajviVar = (defpackage.ajvi) list.get(i);
            if (i > 0) {
                akchVar.f("; ");
            }
            akchVar.f(ajviVar.c());
            java.lang.String strE = ajviVar.e();
            if (strE != null) {
                akchVar.f("=");
                akchVar.f(strE);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(new defpackage.akbk(akchVar));
        return arrayList;
    }

    @Override // defpackage.ajvo
    public final java.util.List c(defpackage.ajpy ajpyVar, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
        defpackage.akch akchVar;
        defpackage.akbo akboVar;
        defpackage.aguw.e(ajpyVar, "Header");
        if (!ajpyVar.b().equalsIgnoreCase("Set-Cookie")) {
            throw new defpackage.ajvt(defpackage.a.bV(ajpyVar, "Unrecognized cookie header '", "'"));
        }
        boolean z = ajpyVar instanceof defpackage.akbk;
        defpackage.ajzr ajzrVar = defpackage.ajzr.a;
        if (z) {
            defpackage.akbk akbkVar = (defpackage.akbk) ajpyVar;
            akchVar = akbkVar.a;
            akboVar = new defpackage.akbo(akbkVar.b, akchVar.b);
        } else {
            java.lang.String strC = ajpyVar.c();
            if (strC == null) {
                throw new defpackage.ajvt("Header value is null");
            }
            akchVar = new defpackage.akch(strC.length());
            akchVar.f(strC);
            akboVar = new defpackage.akbo(0, akchVar.b);
        }
        return j(new defpackage.akay[]{ajzrVar.a(akchVar, akboVar)}, ajvlVar);
    }

    @Override // defpackage.ajvo
    public final defpackage.ajpy d() {
        return null;
    }

    public final java.lang.String toString() {
        return "netscape";
    }
}
