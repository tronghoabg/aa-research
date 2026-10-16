package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class umr {
    private final tot e;
    private final too f;
    private final too g;
    public final float[] a = {1.0f, 1.0f, 1.0f};
    private final float[] h = new float[4];
    private usz i = null;
    public usz b = null;
    public final uww c = new uww();
    public final uww d = new uww();

    public umr(ukp ukpVar) {
        this.e = ukpVar.e();
        this.f = ukpVar.b();
        this.g = ukpVar.c();
    }

    public static void b(ukp ukpVar, float f) {
        umr umrVar = new umr(ukpVar);
        int iA = ukpVar.a();
        int i = ukpVar.g;
        if (i > 0) {
            iA >>= i;
        }
        float[] fArr = umrVar.a;
        float f2 = iA / f;
        fArr[0] = f2;
        fArr[1] = f2;
        fArr[2] = f2;
    }

    @ResultIgnorabilityUnspecified
    public final uww a(usy usyVar) {
        if (usyVar.p() != this.i) {
            uww uwwVar = this.c;
            too tooVar = this.f;
            too tooVar2 = this.g;
            float fC = this.e.c();
            float[] fArr = this.h;
            usk.a(usyVar, tooVar, tooVar2, fC, true, false, fArr);
            uwwVar.e();
            uwwVar.f(fArr[0], fArr[1], fArr[2]);
            float[] fArr2 = this.a;
            float f = fArr[3];
            uwwVar.c(f / fArr2[0], f / fArr2[1], f / fArr2[2]);
            this.i = usyVar.p();
        }
        return this.c;
    }
}
