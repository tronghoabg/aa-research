package defpackage;

/* loaded from: classes.dex */
public final class adc {
    private static final aft a = new aft(1.0f, 1500.0f, null);

    public static final bym a(long j, aec aecVar, bux buxVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            aecVar = a;
        }
        aec aecVar2 = aecVar;
        float[] fArr = clj.a;
        clh[] clhVarArr = clj.y;
        int i3 = (int) (63 & j);
        boolean zC = buxVar.C(clhVarArr[i3]);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = abx.a.invoke(clhVarArr[i3]);
            buxVar.x(objG);
        }
        return ady.c(new cjv(j), (bii) objG, aecVar2, null, "ColorAnimation", null, buxVar, (i & 14) | ((i << 3) & 896), 8);
    }
}
