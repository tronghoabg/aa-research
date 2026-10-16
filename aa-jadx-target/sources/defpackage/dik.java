package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dik {
    public static final /* synthetic */ int a = 0;

    static {
        new defpackage.dij(defpackage.afce.a);
    }

    public static final defpackage.dig a(int i) {
        if (i <= 0 || i >= 1001) {
            defpackage.dki.c(defpackage.a.bo(i, "'wght' value must be in [1, 1000]. Actual: "));
        }
        return new defpackage.dii(i);
    }

    public static final defpackage.dig b(float f) {
        if (f <= 0.0f) {
            defpackage.dki.c(defpackage.a.bF(f, "'wdth' must be strictly > 0.0f. Actual: "));
        }
        return new defpackage.dih("wdth", f);
    }

    public static final defpackage.dij c(defpackage.dil dilVar, int i, defpackage.dig... digVarArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(a(dilVar.o));
        float f = i;
        if (f < 0.0f || f > 1.0f) {
            defpackage.dki.c(defpackage.a.bF(f, "'ital' must be in 0.0f..1.0f. Actual: "));
        }
        arrayList.add(new defpackage.dih("ital", f));
        defpackage.afgx.a(digVarArr, arrayList);
        return new defpackage.dij((defpackage.dig[]) arrayList.toArray(new defpackage.dig[arrayList.size()]));
    }
}
