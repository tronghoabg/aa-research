package defpackage;

/* loaded from: classes3.dex */
public final class usk {
    private static final ThreadLocal a = new usi();

    public static void a(usy usyVar, too tooVar, too tooVar2, float f, boolean z, boolean z2, float[] fArr) {
        ajdr ajdrVar = (ajdr) a.get();
        Object obj = ajdrVar.a;
        Object obj2 = ajdrVar.c;
        Object obj3 = ajdrVar.d;
        Object obj4 = ajdrVar.b;
        too tooVar3 = (too) obj3;
        boolean zO = tsw.o(usyVar, usyVar.k() / 2.0f, usyVar.j() / 2.0f, tooVar3, (float[]) ajdrVar.e);
        too tooVar4 = (too) obj;
        usyVar.s(tooVar4);
        if (!zO) {
            tooVar3.A(tooVar4);
        }
        too tooVar5 = (too) obj2;
        too.v(tooVar, tooVar3, tooVar5);
        too tooVar6 = (too) obj4;
        too.v(tooVar3, tooVar4, tooVar6);
        if (z2) {
            int i = -1073741824;
            if (tooVar4.a > 0 && tooVar5.a < 268435456) {
                i = 1073741824;
            }
            too.n(tooVar5, new too(i, 0), tooVar5);
        }
        if (z) {
            tooVar5.w(tooVar5);
        }
        tooVar5.y(tooVar6);
        if (tooVar2 != null) {
            too.n(tooVar5, tooVar2, tooVar5);
        }
        float fD = usyVar.d();
        fArr[0] = tooVar5.a * fD;
        fArr[1] = tooVar5.b * fD;
        fArr[2] = tooVar5.c * fD;
        fArr[3] = fD * f;
    }
}
