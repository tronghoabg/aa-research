package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cne {
    private boolean a;
    private defpackage.cke b;
    private float c = 1.0f;
    private defpackage.dlz d = defpackage.dlz.a;
    private defpackage.cjs e;

    private final defpackage.cjs g() {
        defpackage.cjs cjsVar = this.e;
        if (cjsVar != null) {
            return cjsVar;
        }
        defpackage.cjs cjsVar2 = new defpackage.cjs();
        this.e = cjsVar2;
        return cjsVar2;
    }

    public abstract long a();

    protected abstract void b(defpackage.cml cmlVar);

    protected boolean c(float f) {
        return false;
    }

    protected boolean d(defpackage.cke ckeVar) {
        return false;
    }

    public final void e(defpackage.cml cmlVar, long j, float f, defpackage.cke ckeVar) {
        if (this.c != f) {
            if (!c(f)) {
                if (f == 1.0f) {
                    defpackage.cjs cjsVar = this.e;
                    if (cjsVar != null) {
                        cjsVar.h(f);
                    }
                    this.a = false;
                } else {
                    g().h(f);
                    this.a = true;
                }
            }
            this.c = f;
        }
        if (!defpackage.afga.f(this.b, ckeVar)) {
            if (!d(ckeVar)) {
                if (ckeVar == null) {
                    defpackage.cjs cjsVar2 = this.e;
                    if (cjsVar2 != null) {
                        cjsVar2.k(null);
                    }
                    this.a = false;
                } else {
                    g().k(ckeVar);
                    this.a = true;
                }
            }
            this.b = ckeVar;
        }
        defpackage.dlz dlzVarP = cmlVar.p();
        if (this.d != dlzVarP) {
            f(dlzVarP);
            this.d = dlzVarP;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32)) - java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L)) - java.lang.Float.intBitsToFloat(i2);
        cmlVar.r().c.i(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat, fIntBitsToFloat2);
        float f2 = -fIntBitsToFloat;
        float f3 = -fIntBitsToFloat2;
        if (f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            try {
                if (java.lang.Float.intBitsToFloat(i) > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && java.lang.Float.intBitsToFloat(i2) > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    if (this.a) {
                        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
                        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat(i2);
                        defpackage.cjj cjjVarC = defpackage.bzo.C(0L, (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L));
                        defpackage.ckc ckcVarB = cmlVar.r().b();
                        try {
                            ckcVarB.n(cjjVarC, g());
                            b(cmlVar);
                            ckcVarB.e();
                        } catch (java.lang.Throwable th) {
                            ckcVarB.e();
                            throw th;
                        }
                    } else {
                        b(cmlVar);
                    }
                }
            } catch (java.lang.Throwable th2) {
                cmlVar.r().c.i(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f2, f3);
                throw th2;
            }
        }
        cmlVar.r().c.i(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f2, f3);
    }

    protected void f(defpackage.dlz dlzVar) {
    }
}
