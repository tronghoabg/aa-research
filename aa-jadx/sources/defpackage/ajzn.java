package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajzn implements defpackage.ajvo {
    private final defpackage.akaa a;
    private final defpackage.ajzv b;
    private final defpackage.ajzs c;

    public ajzn(java.lang.String[] strArr, boolean z) {
        this.a = new defpackage.akaa(z, new defpackage.ajzy(5), new defpackage.ajzg(), new defpackage.ajzy(3), new defpackage.ajzy(4), new defpackage.ajzf(0), new defpackage.ajzh(), new defpackage.ajzf(1), new defpackage.ajzy(0), new defpackage.ajzy(2));
        this.b = new defpackage.ajzv(z, new defpackage.ajzx(), new defpackage.ajzg(), new defpackage.ajzy(1), new defpackage.ajzf(0), new defpackage.ajzh(), new defpackage.ajzf(1));
        defpackage.ajvh[] ajvhVarArr = new defpackage.ajvh[5];
        ajvhVarArr[0] = new defpackage.ajzd();
        ajvhVarArr[1] = new defpackage.ajzg();
        ajvhVarArr[2] = new defpackage.ajzh();
        ajvhVarArr[3] = new defpackage.ajzf(1);
        ajvhVarArr[4] = new defpackage.ajze(strArr != null ? (java.lang.String[]) strArr.clone() : new java.lang.String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
        this.c = new defpackage.ajzs(ajvhVarArr);
    }

    @Override // defpackage.ajvo
    public final int a() {
        return 1;
    }

    @Override // defpackage.ajvo
    public final java.util.List b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        boolean z = true;
        int iA = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        while (it.hasNext()) {
            defpackage.ajvi ajviVar = (defpackage.ajvi) it.next();
            z &= ajviVar instanceof defpackage.ajzb;
            if (ajviVar.a() < iA) {
                iA = ajviVar.a();
            }
        }
        if (iA > 0) {
            return z ? this.a.b(list) : this.b.b(list);
        }
        return this.c.b(list);
    }

    @Override // defpackage.ajvo
    public final java.util.List c(defpackage.ajpy ajpyVar, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
        defpackage.akch akchVar;
        defpackage.akbo akboVar;
        defpackage.aguw.e(ajpyVar, "Header");
        defpackage.akay[] akayVarArrA = ajpyVar.a();
        boolean z = false;
        boolean z2 = false;
        for (defpackage.akay akayVar : akayVarArrA) {
            z2 |= !(akayVar.c("version") == null);
            z |= true ^ (akayVar.c("expires") == null);
        }
        if (!z && z2) {
            return "Set-Cookie2".equals(ajpyVar.b()) ? this.a.j(akayVarArrA, ajvlVar) : this.b.j(akayVarArrA, ajvlVar);
        }
        boolean z3 = ajpyVar instanceof defpackage.akbk;
        defpackage.ajzr ajzrVar = defpackage.ajzr.a;
        if (z3) {
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
        return this.c.j(new defpackage.akay[]{ajzrVar.a(akchVar, akboVar)}, ajvlVar);
    }

    @Override // defpackage.ajvo
    public final defpackage.ajpy d() {
        return null;
    }

    @Override // defpackage.ajvo
    public final void e(defpackage.ajvi ajviVar, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
        defpackage.aguw.e(ajviVar, "Cookie");
        if (ajviVar.a() <= 0) {
            this.c.e(ajviVar, ajvlVar);
        } else if (ajviVar instanceof defpackage.ajzb) {
            this.a.e(ajviVar, ajvlVar);
        } else {
            this.b.e(ajviVar, ajvlVar);
        }
    }

    @Override // defpackage.ajvo
    public final boolean f(defpackage.ajvi ajviVar, defpackage.ajvl ajvlVar) {
        defpackage.aguw.e(ajviVar, "Cookie");
        if (ajviVar.a() > 0) {
            return ajviVar instanceof defpackage.ajzb ? this.a.f(ajviVar, ajvlVar) : this.b.f(ajviVar, ajvlVar);
        }
        return this.c.f(ajviVar, ajvlVar);
    }

    public java.lang.String toString() {
        return "default";
    }
}
