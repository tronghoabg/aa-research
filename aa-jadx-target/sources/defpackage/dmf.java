package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dmf {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    private static volatile defpackage.abb c = new defpackage.abb(null);
    private static final java.lang.Object[] d;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        d = objArr;
        synchronized (objArr) {
            c(c, 1.15f, new defpackage.dmg(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            c(c, 1.3f, new defpackage.dmg(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            c(c, 1.5f, new defpackage.dmg(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            c(c, 1.8f, new defpackage.dmg(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            c(c, 2.0f, new defpackage.dmg(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((c.b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        defpackage.dlv.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static final defpackage.dme a(float f) {
        defpackage.dme dmgVar;
        float f2;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        defpackage.dme dmeVar = (defpackage.dme) defpackage.abc.a(c, i);
        if (dmeVar != null) {
            return dmeVar;
        }
        int iA = c.a(i);
        if (iA >= 0) {
            return (defpackage.dme) c.e(iA);
        }
        int i2 = -(iA + 1);
        int i3 = i2 - 1;
        if (i2 >= c.c()) {
            defpackage.dmg dmgVar2 = new defpackage.dmg(new float[]{1.0f}, new float[]{f});
            b(f, dmgVar2);
            return dmgVar2;
        }
        if (i3 < 0) {
            float[] fArr = b;
            dmgVar = new defpackage.dmg(fArr, fArr);
            f2 = 1.0f;
        } else {
            float fB = c.b(i3);
            dmgVar = (defpackage.dme) c.e(i3);
            f2 = fB / 100.0f;
        }
        float fD = defpackage.dmh.d(0.0f, 1.0f, f2, c.b(i2) / 100.0f, f);
        defpackage.dme dmeVar2 = (defpackage.dme) c.e(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f3 = b[i4];
            float fB2 = dmgVar.b(f3);
            fArr2[i4] = fB2 + ((dmeVar2.b(f3) - fB2) * fD);
        }
        defpackage.dmg dmgVar3 = new defpackage.dmg(b, fArr2);
        b(f, dmgVar3);
        return dmgVar3;
    }

    private static final void b(float f, defpackage.dme dmeVar) {
        synchronized (d) {
            defpackage.abb abbVarClone = c.clone();
            abbVarClone.f((int) (f * 100.0f), dmeVar);
            c = abbVarClone;
        }
    }

    private static final void c(defpackage.abb abbVar, float f, defpackage.dme dmeVar) {
        abbVar.f((int) (f * 100.0f), dmeVar);
    }
}
