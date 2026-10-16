package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dlx {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    private static volatile aau c = new aau(null);
    private static final Object[] d;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        synchronized (objArr) {
            c(c, 1.15f, new dly(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            c(c, 1.3f, new dly(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            c(c, 1.5f, new dly(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            c(c, 1.8f, new dly(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            c(c, 2.0f, new dly(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((c.b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        dln.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static final dlw a(float f) {
        dlw dlyVar;
        float f2;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        dlw dlwVar = (dlw) aav.a(c, i);
        if (dlwVar != null) {
            return dlwVar;
        }
        int iA = c.a(i);
        if (iA >= 0) {
            return (dlw) c.e(iA);
        }
        int i2 = -(iA + 1);
        int i3 = i2 - 1;
        if (i2 >= c.c()) {
            dly dlyVar2 = new dly(new float[]{1.0f}, new float[]{f});
            b(f, dlyVar2);
            return dlyVar2;
        }
        if (i3 < 0) {
            float[] fArr = b;
            dlyVar = new dly(fArr, fArr);
            f2 = 1.0f;
        } else {
            float fB = c.b(i3);
            dlyVar = (dlw) c.e(i3);
            f2 = fB / 100.0f;
        }
        float fE = dlz.e(BitmapDescriptorFactory.HUE_RED, 1.0f, f2, c.b(i2) / 100.0f, f);
        dlw dlwVar2 = (dlw) c.e(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f3 = b[i4];
            float fB2 = dlyVar.b(f3);
            fArr2[i4] = fB2 + ((dlwVar2.b(f3) - fB2) * fE);
        }
        dly dlyVar3 = new dly(b, fArr2);
        b(f, dlyVar3);
        return dlyVar3;
    }

    private static final void b(float f, dlw dlwVar) {
        synchronized (d) {
            aau aauVarClone = c.clone();
            aauVarClone.f((int) (f * 100.0f), dlwVar);
            c = aauVarClone;
        }
    }

    private static final void c(aau aauVar, float f, dlw dlwVar) {
        aauVar.f((int) (f * 100.0f), dlwVar);
    }
}
