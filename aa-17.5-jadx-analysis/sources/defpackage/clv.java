package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class clv extends clh {
    private static final clo q = new cli(6);
    public final clx d;
    public final float e;
    public final float f;
    public final clw g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final clo k;
    public final afec l;
    public final clo m;
    public final clo n;
    public final afec o;
    public final clo p;
    private final boolean r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015b  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public clv(java.lang.String r33, float[] r34, defpackage.clx r35, float[] r36, defpackage.clo r37, defpackage.clo r38, float r39, float r40, defpackage.clw r41, int r42) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clv.<init>(java.lang.String, float[], clx, float[], clo, clo, float, float, clw, int):void");
    }

    @Override // defpackage.clh
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.clh
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.clh
    public final float c(float f, float f2, float f3) {
        clo cloVar = this.p;
        float fA = (float) cloVar.a(f);
        float fA2 = (float) cloVar.a(f2);
        float fA3 = (float) cloVar.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // defpackage.clh
    public final long d(float f, float f2, float f3) {
        clo cloVar = this.p;
        float fA = (float) cloVar.a(f);
        float fA2 = (float) cloVar.a(f2);
        float fA3 = (float) cloVar.a(f3);
        float[] fArr = this.i;
        int length = fArr.length;
        float f4 = fArr[0] * fA;
        float f5 = fArr[3] * fA2;
        float f6 = fArr[6] * fA3;
        float f7 = fArr[1] * fA;
        float f8 = fArr[4] * fA2;
        float f9 = fArr[7] * fA3;
        return (Float.floatToRawIntBits(f7 + f8 + f9) & 4294967295L) | (Float.floatToRawIntBits((f4 + f5) + f6) << 32);
    }

    @Override // defpackage.clh
    public final long e(float f, float f2, float f3, float f4, clh clhVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        float f13 = fArr[8] * f3;
        clo cloVar = this.m;
        return cjn.j((float) cloVar.a(f5 + f6 + f7), (float) cloVar.a(f8 + f9 + f10), (float) cloVar.a(f11 + f12 + f13), f4, clhVar);
    }

    @Override // defpackage.clh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        clv clvVar = (clv) obj;
        if (Float.compare(clvVar.e, this.e) != 0 || Float.compare(clvVar.f, this.f) != 0 || !affa.f(this.d, clvVar.d) || !Arrays.equals(this.h, clvVar.h)) {
            return false;
        }
        clw clwVar = this.g;
        if (clwVar != null) {
            return affa.f(clwVar, clvVar.g);
        }
        if (clvVar.g == null) {
            return true;
        }
        if (affa.f(this.k, clvVar.k)) {
            return affa.f(this.n, clvVar.n);
        }
        return false;
    }

    @Override // defpackage.clh
    public final boolean f() {
        return this.r;
    }

    @Override // defpackage.clh
    public final int hashCode() {
        int iHashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.h);
        float f = this.e;
        int iFloatToIntBits = ((iHashCode * 31) + (f == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f2))) * 31;
        clw clwVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (clwVar != null ? clwVar.hashCode() : 0);
        return clwVar == null ? (((iHashCode2 * 31) + this.k.hashCode()) * 31) + this.n.hashCode() : iHashCode2;
    }

    public clv(String str, float[] fArr, clx clxVar, final clw clwVar, int i) {
        clo cloVar;
        clo cloVar2;
        final int i2 = 3;
        if (clwVar.a()) {
            cloVar = new clo() { // from class: clu
                @Override // defpackage.clo
                public final double a(double d) {
                    int i3 = i2;
                    if (i3 == 0) {
                        float[] fArr2 = clj.a;
                        return clj.c(clwVar, d);
                    }
                    if (i3 == 1) {
                        float[] fArr3 = clj.a;
                        return clj.a(clwVar, d);
                    }
                    if (i3 == 2) {
                        clw clwVar2 = clwVar;
                        if (d < clwVar2.e) {
                            return (clwVar2.d * d) + clwVar2.g;
                        }
                        double d2 = clwVar2.a;
                        return Math.pow((clwVar2.b * d) + clwVar2.c, d2) + clwVar2.f;
                    }
                    if (i3 == 3) {
                        float[] fArr4 = clj.a;
                        return clj.b(clwVar, d);
                    }
                    if (i3 == 4) {
                        float[] fArr5 = clj.a;
                        return clj.d(clwVar, d);
                    }
                    clw clwVar3 = clwVar;
                    double d3 = clwVar3.e;
                    double d4 = clwVar3.d;
                    if (d < d3 * d4) {
                        return (d - clwVar3.g) / d4;
                    }
                    double d5 = clwVar3.a;
                    double d6 = clwVar3.f;
                    double d7 = clwVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / clwVar3.b;
                }
            };
        } else if (clwVar.b()) {
            final int i3 = 4;
            cloVar = new clo() { // from class: clu
                @Override // defpackage.clo
                public final double a(double d) {
                    int i32 = i3;
                    if (i32 == 0) {
                        float[] fArr2 = clj.a;
                        return clj.c(clwVar, d);
                    }
                    if (i32 == 1) {
                        float[] fArr3 = clj.a;
                        return clj.a(clwVar, d);
                    }
                    if (i32 == 2) {
                        clw clwVar2 = clwVar;
                        if (d < clwVar2.e) {
                            return (clwVar2.d * d) + clwVar2.g;
                        }
                        double d2 = clwVar2.a;
                        return Math.pow((clwVar2.b * d) + clwVar2.c, d2) + clwVar2.f;
                    }
                    if (i32 == 3) {
                        float[] fArr4 = clj.a;
                        return clj.b(clwVar, d);
                    }
                    if (i32 == 4) {
                        float[] fArr5 = clj.a;
                        return clj.d(clwVar, d);
                    }
                    clw clwVar3 = clwVar;
                    double d3 = clwVar3.e;
                    double d4 = clwVar3.d;
                    if (d < d3 * d4) {
                        return (d - clwVar3.g) / d4;
                    }
                    double d5 = clwVar3.a;
                    double d6 = clwVar3.f;
                    double d7 = clwVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / clwVar3.b;
                }
            };
        } else if (clwVar.f == 0.0d && clwVar.g == 0.0d) {
            cloVar = new clo() { // from class: cls
                @Override // defpackage.clo
                public final double a(double d) {
                    int i4 = i2;
                    if (i4 == 0) {
                        return ((clv) clwVar).n.a(afpt.a(d, r12.e, r12.f));
                    }
                    if (i4 == 1) {
                        clv clvVar = (clv) clwVar;
                        return afpt.a(clvVar.k.a(d), clvVar.e, clvVar.f);
                    }
                    Object obj = clwVar;
                    if (i4 != 2) {
                        clw clwVar2 = (clw) obj;
                        double d2 = clwVar2.a;
                        double d3 = clwVar2.e;
                        return czz.N(d, clwVar2.b, clwVar2.c, clwVar2.d, d3, d2);
                    }
                    clw clwVar3 = (clw) obj;
                    double d4 = clwVar3.a;
                    double d5 = clwVar3.e;
                    return czz.O(d, clwVar3.b, clwVar3.c, clwVar3.d, d5, d4);
                }
            };
        } else {
            final int i4 = 5;
            cloVar = new clo() { // from class: clu
                @Override // defpackage.clo
                public final double a(double d) {
                    int i32 = i4;
                    if (i32 == 0) {
                        float[] fArr2 = clj.a;
                        return clj.c(clwVar, d);
                    }
                    if (i32 == 1) {
                        float[] fArr3 = clj.a;
                        return clj.a(clwVar, d);
                    }
                    if (i32 == 2) {
                        clw clwVar2 = clwVar;
                        if (d < clwVar2.e) {
                            return (clwVar2.d * d) + clwVar2.g;
                        }
                        double d2 = clwVar2.a;
                        return Math.pow((clwVar2.b * d) + clwVar2.c, d2) + clwVar2.f;
                    }
                    if (i32 == 3) {
                        float[] fArr4 = clj.a;
                        return clj.b(clwVar, d);
                    }
                    if (i32 == 4) {
                        float[] fArr5 = clj.a;
                        return clj.d(clwVar, d);
                    }
                    clw clwVar3 = clwVar;
                    double d3 = clwVar3.e;
                    double d4 = clwVar3.d;
                    if (d < d3 * d4) {
                        return (d - clwVar3.g) / d4;
                    }
                    double d5 = clwVar3.a;
                    double d6 = clwVar3.f;
                    double d7 = clwVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / clwVar3.b;
                }
            };
        }
        clo cloVar3 = cloVar;
        if (clwVar.a()) {
            final int i5 = 1;
            cloVar2 = new clo() { // from class: clu
                @Override // defpackage.clo
                public final double a(double d) {
                    int i32 = i5;
                    if (i32 == 0) {
                        float[] fArr2 = clj.a;
                        return clj.c(clwVar, d);
                    }
                    if (i32 == 1) {
                        float[] fArr3 = clj.a;
                        return clj.a(clwVar, d);
                    }
                    if (i32 == 2) {
                        clw clwVar2 = clwVar;
                        if (d < clwVar2.e) {
                            return (clwVar2.d * d) + clwVar2.g;
                        }
                        double d2 = clwVar2.a;
                        return Math.pow((clwVar2.b * d) + clwVar2.c, d2) + clwVar2.f;
                    }
                    if (i32 == 3) {
                        float[] fArr4 = clj.a;
                        return clj.b(clwVar, d);
                    }
                    if (i32 == 4) {
                        float[] fArr5 = clj.a;
                        return clj.d(clwVar, d);
                    }
                    clw clwVar3 = clwVar;
                    double d3 = clwVar3.e;
                    double d4 = clwVar3.d;
                    if (d < d3 * d4) {
                        return (d - clwVar3.g) / d4;
                    }
                    double d5 = clwVar3.a;
                    double d6 = clwVar3.f;
                    double d7 = clwVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / clwVar3.b;
                }
            };
        } else if (clwVar.b()) {
            final int i6 = 0;
            cloVar2 = new clo() { // from class: clu
                @Override // defpackage.clo
                public final double a(double d) {
                    int i32 = i6;
                    if (i32 == 0) {
                        float[] fArr2 = clj.a;
                        return clj.c(clwVar, d);
                    }
                    if (i32 == 1) {
                        float[] fArr3 = clj.a;
                        return clj.a(clwVar, d);
                    }
                    if (i32 == 2) {
                        clw clwVar2 = clwVar;
                        if (d < clwVar2.e) {
                            return (clwVar2.d * d) + clwVar2.g;
                        }
                        double d2 = clwVar2.a;
                        return Math.pow((clwVar2.b * d) + clwVar2.c, d2) + clwVar2.f;
                    }
                    if (i32 == 3) {
                        float[] fArr4 = clj.a;
                        return clj.b(clwVar, d);
                    }
                    if (i32 == 4) {
                        float[] fArr5 = clj.a;
                        return clj.d(clwVar, d);
                    }
                    clw clwVar3 = clwVar;
                    double d3 = clwVar3.e;
                    double d4 = clwVar3.d;
                    if (d < d3 * d4) {
                        return (d - clwVar3.g) / d4;
                    }
                    double d5 = clwVar3.a;
                    double d6 = clwVar3.f;
                    double d7 = clwVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / clwVar3.b;
                }
            };
        } else {
            final int i7 = 2;
            if (clwVar.f == 0.0d && clwVar.g == 0.0d) {
                cloVar2 = new clo() { // from class: cls
                    @Override // defpackage.clo
                    public final double a(double d) {
                        int i42 = i7;
                        if (i42 == 0) {
                            return ((clv) clwVar).n.a(afpt.a(d, r12.e, r12.f));
                        }
                        if (i42 == 1) {
                            clv clvVar = (clv) clwVar;
                            return afpt.a(clvVar.k.a(d), clvVar.e, clvVar.f);
                        }
                        Object obj = clwVar;
                        if (i42 != 2) {
                            clw clwVar2 = (clw) obj;
                            double d2 = clwVar2.a;
                            double d3 = clwVar2.e;
                            return czz.N(d, clwVar2.b, clwVar2.c, clwVar2.d, d3, d2);
                        }
                        clw clwVar3 = (clw) obj;
                        double d4 = clwVar3.a;
                        double d5 = clwVar3.e;
                        return czz.O(d, clwVar3.b, clwVar3.c, clwVar3.d, d5, d4);
                    }
                };
            } else {
                cloVar2 = new clo() { // from class: clu
                    @Override // defpackage.clo
                    public final double a(double d) {
                        int i32 = i7;
                        if (i32 == 0) {
                            float[] fArr2 = clj.a;
                            return clj.c(clwVar, d);
                        }
                        if (i32 == 1) {
                            float[] fArr3 = clj.a;
                            return clj.a(clwVar, d);
                        }
                        if (i32 == 2) {
                            clw clwVar2 = clwVar;
                            if (d < clwVar2.e) {
                                return (clwVar2.d * d) + clwVar2.g;
                            }
                            double d2 = clwVar2.a;
                            return Math.pow((clwVar2.b * d) + clwVar2.c, d2) + clwVar2.f;
                        }
                        if (i32 == 3) {
                            float[] fArr4 = clj.a;
                            return clj.b(clwVar, d);
                        }
                        if (i32 == 4) {
                            float[] fArr5 = clj.a;
                            return clj.d(clwVar, d);
                        }
                        clw clwVar3 = clwVar;
                        double d3 = clwVar3.e;
                        double d4 = clwVar3.d;
                        if (d < d3 * d4) {
                            return (d - clwVar3.g) / d4;
                        }
                        double d5 = clwVar3.a;
                        double d6 = clwVar3.f;
                        double d7 = clwVar3.c;
                        return (Math.pow(d - d6, 1.0d / d5) - d7) / clwVar3.b;
                    }
                };
            }
        }
        this(str, fArr, clxVar, null, cloVar3, cloVar2, BitmapDescriptorFactory.HUE_RED, 1.0f, clwVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public clv(String str, float[] fArr, clx clxVar, final double d, float f, float f2, int i) {
        clo cloVar;
        clo cloVar2;
        if (d == 1.0d) {
            cloVar = q;
        } else {
            final int i2 = 1;
            cloVar = new clo() { // from class: clt
                @Override // defpackage.clo
                public final double a(double d2) {
                    if (i2 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Math.pow(d2, d3);
                }
            };
        }
        clo cloVar3 = cloVar;
        if (d == 1.0d) {
            cloVar2 = q;
        } else {
            final int i3 = 0;
            cloVar2 = new clo() { // from class: clt
                @Override // defpackage.clo
                public final double a(double d2) {
                    if (i3 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Math.pow(d2, d3);
                }
            };
        }
        this(str, fArr, clxVar, null, cloVar3, cloVar2, f, f2, new clw(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
