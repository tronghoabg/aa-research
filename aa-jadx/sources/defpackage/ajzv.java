package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajzv extends defpackage.ajza {
    static final java.lang.String[] a = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ajzv(java.lang.String[] strArr, boolean z) {
        defpackage.ajvh[] ajvhVarArr = new defpackage.ajvh[7];
        ajvhVarArr[0] = new defpackage.ajzx();
        ajvhVarArr[1] = new defpackage.ajzu();
        ajvhVarArr[2] = new defpackage.ajzy(1);
        ajvhVarArr[3] = new defpackage.ajzf(0);
        ajvhVarArr[4] = new defpackage.ajzh();
        ajvhVarArr[5] = new defpackage.ajzf(1);
        ajvhVarArr[6] = new defpackage.ajze(strArr != null ? (java.lang.String[]) strArr.clone() : a);
        super(ajvhVarArr);
        this.b = z;
    }

    protected static final void l(defpackage.akch akchVar, java.lang.String str, java.lang.String str2, int i) {
        akchVar.f(str);
        akchVar.f("=");
        if (str2 != null) {
            if (i <= 0) {
                akchVar.f(str2);
                return;
            }
            akchVar.e('\"');
            akchVar.f(str2);
            akchVar.e('\"');
        }
    }

    @Override // defpackage.ajvo
    public int a() {
        return 1;
    }

    @Override // defpackage.ajvo
    public final java.util.List b(java.util.List list) {
        defpackage.aguw.c(list, "List of cookies");
        if (list.size() > 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            java.util.Collections.sort(arrayList, defpackage.ajvm.a);
            list = arrayList;
        }
        if (!this.b) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            for (defpackage.ajvi ajviVar : list) {
                int iA = ajviVar.a();
                defpackage.akch akchVar = new defpackage.akch(40);
                akchVar.f("Cookie: ");
                akchVar.f("$Version=");
                akchVar.f(java.lang.Integer.toString(iA));
                akchVar.f("; ");
                k(akchVar, ajviVar, iA);
                arrayList2.add(new defpackage.akbk(akchVar));
            }
            return arrayList2;
        }
        int iA2 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        for (defpackage.ajvi ajviVar2 : list) {
            if (ajviVar2.a() < iA2) {
                iA2 = ajviVar2.a();
            }
        }
        defpackage.akch akchVar2 = new defpackage.akch(list.size() * 40);
        akchVar2.f("Cookie");
        akchVar2.f(": ");
        akchVar2.f("$Version=");
        akchVar2.f(java.lang.Integer.toString(iA2));
        for (defpackage.ajvi ajviVar3 : list) {
            akchVar2.f("; ");
            k(akchVar2, ajviVar3, iA2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(1);
        arrayList3.add(new defpackage.akbk(akchVar2));
        return arrayList3;
    }

    @Override // defpackage.ajvo
    public java.util.List c(defpackage.ajpy ajpyVar, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
        defpackage.aguw.e(ajpyVar, "Header");
        if (ajpyVar.b().equalsIgnoreCase("Set-Cookie")) {
            return j(ajpyVar.a(), ajvlVar);
        }
        throw new defpackage.ajvt(defpackage.a.bV(ajpyVar, "Unrecognized cookie header '", "'"));
    }

    @Override // defpackage.ajvo
    public defpackage.ajpy d() {
        return null;
    }

    @Override // defpackage.ajza, defpackage.ajvo
    public void e(defpackage.ajvi ajviVar, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
        defpackage.aguw.e(ajviVar, "Cookie");
        java.lang.String strC = ajviVar.c();
        if (strC.indexOf(32) != -1) {
            throw new defpackage.ajvn("Cookie name may not contain blanks");
        }
        if (strC.startsWith("$")) {
            throw new defpackage.ajvn("Cookie name may not start with $");
        }
        super.e(ajviVar, ajvlVar);
    }

    protected void k(defpackage.akch akchVar, defpackage.ajvi ajviVar, int i) {
        l(akchVar, ajviVar.c(), ajviVar.e(), i);
        if (ajviVar.d() != null && (ajviVar instanceof defpackage.ajzc) && ((defpackage.ajzc) ajviVar).p("path")) {
            akchVar.f("; ");
            l(akchVar, "$Path", ajviVar.d(), i);
        }
        if (ajviVar.b() != null && (ajviVar instanceof defpackage.ajzc) && ((defpackage.ajzc) ajviVar).p("domain")) {
            akchVar.f("; ");
            l(akchVar, "$Domain", ajviVar.b(), i);
        }
    }

    public java.lang.String toString() {
        return "rfc2109";
    }

    protected ajzv(boolean z, defpackage.ajvh... ajvhVarArr) {
        super(ajvhVarArr);
        this.b = z;
    }
}
