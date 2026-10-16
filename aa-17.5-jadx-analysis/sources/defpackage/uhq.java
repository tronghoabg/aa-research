package defpackage;

/* loaded from: classes3.dex */
public final class uhq {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/legacy/vector/gl/drawable/GLRoadGroup");
    public static final int[] b = new int[0];
    public static final float[] c = new float[0];

    public static uhn a(ugl uglVar, ukf ukfVar, float f, int i, int i2) {
        ujf ujfVarF = ukfVar.f(f);
        uhn uhnVar = new uhn(i, i2);
        if (uglVar.d(ujfVarF) > 0) {
            uke ukeVarF = uglVar.f(ujfVarF, 0);
            if (uhnVar.a == 4 && ukeVarF.j.a()) {
                uhnVar.a = 0;
            }
            if (uhnVar.b == 4 && ukeVarF.k.a()) {
                uhnVar.b = 0;
            }
        }
        return uhnVar;
    }

    public static uws b(usm usmVar, boolean z) {
        if (usmVar.f <= 0) {
            return null;
        }
        uws uwsVarB = usmVar.b(true != z ? 5 : 4);
        uwsVarB.c(false);
        return uwsVarB;
    }

    public static void c(ukf ukfVar, int i, int i2, float[] fArr) {
        int iMin = Math.min(4, ukfVar.c(i));
        for (int i3 = 0; i3 < iMin; i3++) {
            uke[] ukeVarArr = ukfVar.g(i3 + i).o;
            if (ukeVarArr.length > i2) {
                fArr[i3] = ukeVarArr[i2].d;
            } else {
                ((ynz) ((ynz) a.g()).ai((char) 9360)).u("updateRoadStrokeWidths style has insufficient line strokes");
            }
        }
    }

    public static float[] d(int[] iArr, ukf[] ukfVarArr, float f, boolean z) {
        float[] fArr = new float[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            ujf ujfVarG = ukfVarArr[i].g((int) f);
            uke[] ukeVarArr = z ? ujfVarG.n : ujfVarG.o;
            if (ukeVarArr.length > 0) {
                fArr[i] = ukeVarArr[0].h;
            }
        }
        return fArr;
    }
}
