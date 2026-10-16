package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public abstract class cmw {
    private boolean a;
    private cjw b;
    private float c = 1.0f;
    private dlr d = dlr.a;
    private cjk e;

    private final cjk g() {
        cjk cjkVar = this.e;
        if (cjkVar != null) {
            return cjkVar;
        }
        cjk cjkVar2 = new cjk();
        this.e = cjkVar2;
        return cjkVar2;
    }

    public abstract long a();

    protected abstract void b(cmd cmdVar);

    protected boolean c(float f) {
        return false;
    }

    protected boolean d(cjw cjwVar) {
        return false;
    }

    public final void e(cmd cmdVar, long j, float f, cjw cjwVar) {
        if (this.c != f) {
            if (!c(f)) {
                if (f == 1.0f) {
                    cjk cjkVar = this.e;
                    if (cjkVar != null) {
                        cjkVar.h(f);
                    }
                    this.a = false;
                } else {
                    g().h(f);
                    this.a = true;
                }
            }
            this.c = f;
        }
        if (!affa.f(this.b, cjwVar)) {
            if (!d(cjwVar)) {
                if (cjwVar == null) {
                    cjk cjkVar2 = this.e;
                    if (cjkVar2 != null) {
                        cjkVar2.k(null);
                    }
                    this.a = false;
                } else {
                    g().k(cjwVar);
                    this.a = true;
                }
            }
            this.b = cjwVar;
        }
        dlr dlrVarP = cmdVar.p();
        if (this.d != dlrVarP) {
            f(dlrVarP);
            this.d = dlrVarP;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cmdVar.o() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L)) - Float.intBitsToFloat(i2);
        cmdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat, fIntBitsToFloat2);
        float f2 = -fIntBitsToFloat;
        float f3 = -fIntBitsToFloat2;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            try {
                if (Float.intBitsToFloat(i) > BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat(i2) > BitmapDescriptorFactory.HUE_RED) {
                    if (this.a) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                        cjb cjbVarE = byx.E(0L, (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L));
                        cju cjuVarB = cmdVar.r().b();
                        try {
                            cjuVarB.n(cjbVarE, g());
                            b(cmdVar);
                            cjuVarB.e();
                        } catch (Throwable th) {
                            cjuVarB.e();
                            throw th;
                        }
                    } else {
                        b(cmdVar);
                    }
                }
            } finally {
                cmdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, f3);
            }
        }
    }

    protected void f(dlr dlrVar) {
    }
}
