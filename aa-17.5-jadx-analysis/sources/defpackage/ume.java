package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ume implements umg {
    private static final too j = new too();
    private static final too k = new too();
    private static final too l = new too();
    private static final float[] m = new float[6];
    public final uip[] a;
    public boolean c;
    public float d;
    public float e;
    public boolean g = false;
    public float h = 1.0f;
    public float i = 1.0f;
    public final uww b = new uww();
    public final uww f = new uww();

    public ume(List list) {
        this.a = (uip[]) list.toArray(new uip[0]);
    }

    @Override // defpackage.umg
    public final boolean a(umk umkVar, float f) {
        synchronized (this) {
            this.b.d(this.f);
            this.d = this.h;
            this.e = this.i;
            this.c = this.g;
        }
        for (uip uipVar : this.a) {
            if (d(uipVar, umkVar)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void b(uww uwwVar, float f, float f2) {
        this.f.d(uwwVar);
        this.h = f;
        this.i = f2;
        this.g = false;
    }

    public final synchronized void c(uww uwwVar, float f) {
        this.f.d(uwwVar);
        this.h = f;
        this.i = f;
        this.g = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    public final boolean d(uip uipVar, umk umkVar) {
        char c;
        char c2;
        boolean zC;
        umk umkVar2 = umkVar;
        boolean z = 0;
        int i = 0;
        while (true) {
            uks uksVar = uipVar.g;
            if (i >= uksVar.d()) {
                return z;
            }
            if (uksVar.c.length > 0) {
                too tooVar = j;
                too tooVar2 = k;
                too tooVar3 = l;
                uksVar.f(i, tooVar, tooVar2, tooVar3);
                uww uwwVar = this.b;
                float f = this.d;
                usy usyVar = umkVar2.i;
                float[] fArr = umkVar2.f;
                if (tsw.l(usyVar, tooVar, fArr, z)) {
                    float[] fArr2 = umkVar2.g;
                    fArr2[z] = fArr[z];
                    fArr2[1] = fArr[1];
                    if (tsw.l(usyVar, tooVar2, fArr, z)) {
                        fArr2[2] = fArr[z];
                        fArr2[3] = fArr[1];
                        if (tsw.l(usyVar, tooVar3, fArr, z)) {
                            fArr2[4] = fArr[z];
                            fArr2[5] = fArr[1];
                            zC = umkVar2.c(fArr2, false, 1.0f / f, uwwVar, umkVar2.e / f);
                        } else {
                            zC = umkVar2.d(tooVar, tooVar2, tooVar3, uwwVar);
                        }
                    } else {
                        zC = umkVar2.d(tooVar, tooVar2, tooVar3, uwwVar);
                    }
                } else {
                    zC = umkVar2.d(tooVar, tooVar2, tooVar3, uwwVar);
                }
                if (zC) {
                    return true;
                }
                c2 = z;
            } else {
                float[] fArr3 = m;
                int iC = uksVar.c(i, z);
                int iC2 = uksVar.c(i, 1);
                int iC3 = uksVar.c(i, 2);
                float[] fArr4 = uksVar.d;
                if (fArr4.length > 0) {
                    fArr3[z] = fArr4[iC];
                    fArr3[1] = fArr4[iC + 1];
                    fArr3[2] = fArr4[iC2];
                    fArr3[3] = fArr4[iC2 + 1];
                    fArr3[4] = fArr4[iC3];
                    fArr3[5] = fArr4[iC3 + 1];
                }
                uww uwwVar2 = this.b;
                float f2 = this.d;
                float f3 = this.e;
                if (this.c) {
                    c = 3;
                    c2 = z;
                    float fPow = 2.0f / ((float) Math.pow(2.0d, 22.0f - umkVar2.i.o().l));
                    f2 *= fPow;
                    f3 *= fPow;
                } else {
                    c = 3;
                    c2 = z;
                }
                float[] fArr5 = umkVar2.g;
                fArr5[c2] = fArr3[c2] * f2;
                fArr5[1] = fArr3[1] * f3;
                fArr5[2] = fArr3[2] * f2;
                fArr5[c] = fArr3[c] * f3;
                fArr5[4] = fArr3[4] * f2;
                fArr5[5] = fArr3[5] * f3;
                if (umkVar2.c(fArr5, true, 1.0f, uwwVar2, umkVar2.e)) {
                    return true;
                }
            }
            i++;
            umkVar2 = umkVar;
            z = c2;
        }
    }
}
