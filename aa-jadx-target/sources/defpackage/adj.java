package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adj {
    private static final defpackage.aga a = new defpackage.aga(1.0f, 1500.0f, null);

    public static final defpackage.bys a(long j, defpackage.aej aejVar, defpackage.bve bveVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            aejVar = a;
        }
        defpackage.aej aejVar2 = aejVar;
        float[] fArr = defpackage.clr.a;
        defpackage.clp[] clpVarArr = defpackage.clr.y;
        int i3 = (int) (63 & j);
        boolean zC = bveVar.C(clpVarArr[i3]);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = defpackage.ace.a.invoke(clpVarArr[i3]);
            bveVar.x(objG);
        }
        return defpackage.aef.c(new defpackage.ckd(j), (defpackage.bil) objG, aejVar2, null, "ColorAnimation", null, bveVar, (i & 14) | ((i << 3) & 896), 8);
    }
}
