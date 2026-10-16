package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class umb extends uma {
    private static final uwx a = new uwx(null);
    private float A;
    private final float[] b;
    private float c;
    public final too e;
    public final float[] f;
    public usj g;
    protected final boolean h;
    private final float[] y;
    private boolean z;

    public umb(utf utfVar, ute uteVar) {
        super(utfVar, uteVar, 0);
        this.b = new float[4];
        this.e = new too();
        this.y = new float[]{1.0f, 1.0f, 1.0f};
        this.f = new float[3];
        this.z = true;
        this.h = true;
        this.g = new tvp(2);
    }

    @Override // defpackage.utj, defpackage.uth
    public void H(uth uthVar, uth uthVar2, usy usyVar) {
        if (this.o || usyVar.p() != this.q) {
            if (this.z) {
                this.c = tsw.p(usyVar, usyVar.e(this.e, this.h));
            } else {
                float[] fArr = this.y;
                fArr[2] = 1.0f;
                fArr[1] = 1.0f;
                fArr[0] = 1.0f;
            }
            usj usjVar = this.g;
            too tooVar = this.e;
            float f = this.c;
            float[] fArr2 = this.b;
            usjVar.a(usyVar, tooVar, f, fArr2);
            uww uwwVar = this.n;
            uwwVar.e();
            uwwVar.f(fArr2[0], fArr2[1], fArr2[2]);
            float f2 = this.A;
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                uwwVar.b(a, f2);
            }
            float f3 = fArr2[3];
            float[] fArr3 = this.y;
            uwwVar.c(fArr3[0] * f3, fArr3[1] * f3, fArr3[2] * f3);
            float[] fArr4 = this.f;
            uwwVar.g(fArr4[0], fArr4[1], fArr4[2]);
        }
        super.H(uthVar, uthVar2, usyVar);
    }

    public final void k(float f) {
        if (this.r) {
            uvr uvrVar = uvr.a;
        }
        this.A = f;
        this.o = true;
    }

    public final void l(too tooVar) {
        if (this.r) {
            uvr uvrVar = uvr.a;
        }
        this.e.A(tooVar);
        this.o = true;
    }

    public final void m(float f) {
        if (this.r) {
            uvr uvrVar = uvr.a;
        }
        this.c = f;
        this.z = false;
        this.o = true;
    }

    public final void n(float f, float f2) {
        if (this.r) {
            uvr uvrVar = uvr.a;
        }
        float[] fArr = this.y;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = 1.0f;
        this.z = true;
        this.o = true;
    }

    public umb(utf utfVar) {
        this(utfVar, new ute(utfVar.a(), 0L, 0L, 0L));
    }
}
