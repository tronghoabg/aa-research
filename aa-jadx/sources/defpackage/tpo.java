package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpo {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/api/model/Polyline");
    public static final float[] b;
    public static final defpackage.tpo c;
    public final int[] d;
    public final float[] e;
    public final int f;
    public final int g;
    public final int h;
    public float i;
    private java.util.List j;
    private volatile defpackage.tpr k;
    private volatile float l;
    private volatile float m;
    private volatile float n;

    static {
        float[] fArr = new float[0];
        b = fArr;
        c = new defpackage.tpo(new int[0], fArr, 0, 0, 0);
    }

    public tpo(int[] iArr, int i, int i2, int i3) {
        this.i = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.d = iArr;
        this.e = b;
        this.h = i;
        this.f = i2;
        this.g = i3;
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
    }

    public static defpackage.tpo i(defpackage.tpm tpmVar, defpackage.tpm tpmVar2) {
        return new defpackage.tpo(new int[]{tpmVar.a, tpmVar.b, tpmVar2.a, tpmVar2.b}, 0, 0, 0);
    }

    public static defpackage.tpo j(java.util.List list) {
        int size = list.size();
        int[] iArr = new int[size + size];
        for (int i = 0; i < list.size(); i++) {
            int i2 = i + i;
            iArr[i2] = ((defpackage.tpm) list.get(i)).a;
            iArr[i2 + 1] = ((defpackage.tpm) list.get(i)).b;
        }
        return new defpackage.tpo(iArr, 0, 0, 0);
    }

    public final float a() {
        float f = this.l;
        float fB = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            int iC = c() - 1;
            for (int i = 0; i < iC; i++) {
                fB += b(i);
            }
            this.l = fB;
        }
        return this.l;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final float b(int i) {
        int[] iArr = this.d;
        int i2 = i + i;
        int i3 = iArr[i2] - iArr[i2 + 2];
        int i4 = iArr[i2 + 1] - iArr[i2 + 3];
        int i5 = this.h;
        return (float) java.lang.Math.hypot(defpackage.a.aa(i3, i5, 0), defpackage.a.aa(i4, i5, 0));
    }

    public final int c() {
        return this.d.length >> 1;
    }

    public final int d(int i) {
        return defpackage.a.aa(this.d[i + i], this.h, this.f);
    }

    public final int e(int i) {
        return defpackage.a.aa(this.d[i + i + 1], this.h, this.g);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tpo) {
            defpackage.tpo tpoVar = (defpackage.tpo) obj;
            if (this.h == tpoVar.h && this.f == tpoVar.f && this.g == tpoVar.g) {
                int[] iArr = this.d;
                int[] iArr2 = tpoVar.d;
                if (iArr.length == iArr2.length) {
                    for (int i = 0; i < iArr.length; i++) {
                        if (iArr[i] == iArr2[i]) {
                        }
                    }
                    float[] fArr = this.e;
                    float[] fArr2 = tpoVar.e;
                    if (fArr.length == fArr2.length) {
                        for (int i2 = 0; i2 < fArr.length; i2++) {
                            if (fArr[i2] == fArr2[i2]) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int f(float f, defpackage.tpm tpmVar) {
        if (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            o(0, tpmVar);
            return 0;
        }
        int iC = c();
        int i = iC - 1;
        if (f >= 1.0f) {
            int i2 = iC - 2;
            o(i, tpmVar);
            return i2;
        }
        float fA = a() * f;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            float fB = b(i3);
            if (fB >= fA) {
                float f2 = fA / fB;
                int iD = d(i3);
                int iE = e(i3);
                int iD2 = d(i4);
                int iE2 = e(i4);
                tpmVar.a = ((int) ((iD2 - iD) * f2)) + iD;
                tpmVar.b = ((int) (f2 * (iE2 - iE))) + iE;
                tpmVar.c = 0;
                return i3;
            }
            fA -= fB;
            i3 = i4;
        }
        int i5 = iC - 2;
        o(i, tpmVar);
        return i5;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int g(float f, int i, int i2, defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpm tpmVar3, defpackage.tpm tpmVar4, boolean[] zArr) {
        int i3;
        o(i, tpmVar);
        o(i2, tpmVar2);
        int i4 = i + 1;
        int i5 = -1;
        float f2 = f;
        int i6 = i4;
        while (true) {
            i3 = i2 - 1;
            if (i6 > i3) {
                break;
            }
            o(i6, tpmVar4);
            float fE = defpackage.tpm.e(tpmVar, tpmVar2, tpmVar4, tpmVar3);
            if (fE > f2) {
                f2 = fE;
            }
            if (fE > f2) {
                i5 = i6;
            }
            i6++;
        }
        if (i5 < 0) {
            return 0;
        }
        zArr[i5] = true;
        int iG = i5 > i4 ? 1 + g(f, i, i5, tpmVar, tpmVar2, tpmVar3, tpmVar4, zArr) : 1;
        return i5 < i3 ? iG + g(f, i5, i2, tpmVar, tpmVar2, tpmVar3, tpmVar4, zArr) : iG;
    }

    public final defpackage.tpm h(int i) {
        int[] iArr = this.d;
        int i2 = i + i;
        int i3 = iArr[i2];
        int i4 = this.h;
        return new defpackage.tpm(defpackage.a.aa(i3, i4, this.f), defpackage.a.aa(iArr[i2 + 1], i4, this.g), 0);
    }

    public final int hashCode() {
        int iHashCode = java.util.Arrays.hashCode(this.d) + this.h + (this.f * 31) + (this.g * 961);
        float[] fArr = this.e;
        return fArr.length != 0 ? iHashCode + java.util.Arrays.hashCode(fArr) : iHashCode;
    }

    public final defpackage.tpr k() {
        defpackage.tpr tprVar;
        if (this.k == null) {
            if (c() > 0) {
                if (c() <= 0) {
                    tprVar = null;
                } else {
                    defpackage.tpm tpmVarH = h(0);
                    int i = tpmVarH.a;
                    int i2 = tpmVarH.b;
                    int i3 = i;
                    int i4 = i2;
                    for (int i5 = 1; i5 < c(); i5++) {
                        o(i5, tpmVarH);
                        int i6 = tpmVarH.a;
                        if (i6 < i) {
                            i = i6;
                        }
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = tpmVarH.b;
                        if (i7 < i4) {
                            i4 = i7;
                        }
                        if (i7 > i2) {
                            i2 = i7;
                        }
                    }
                    tpmVarH.r(i, i4);
                    tprVar = new defpackage.tpr(tpmVarH, new defpackage.tpm(i3, i2));
                }
                tprVar.getClass();
                this.k = tprVar;
            } else {
                this.k = new defpackage.tpr(new defpackage.tpm(), new defpackage.tpm());
            }
        }
        return this.k;
    }

    public final synchronized java.util.List l() {
        if (this.j == null) {
            float[] fArr = this.e;
            java.util.ArrayList arrayListS = defpackage.ysr.S(fArr.length);
            for (float f : fArr) {
                arrayListS.add(java.lang.Float.valueOf(f));
            }
            this.j = arrayListS;
        }
        return this.j;
    }

    public final java.util.List m(int i) {
        int i2;
        int i3;
        double dC;
        float fC;
        boolean z;
        int i4 = 1073741824;
        defpackage.ysr.aY(i <= k().a.a && i + 1073741824 >= k().b.a, "The entire polyline's x coordinates should lie in [splitX, splitX + Model.WORLD_WIDTH]");
        if (c() < 2) {
            return defpackage.ysr.R(this);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.tpn tpnVar = new defpackage.tpn(c(), 0, 0, 0);
        defpackage.tpm tpmVarH = h(0);
        tpnVar.c(tpmVarH);
        defpackage.tpm tpmVar = new defpackage.tpm();
        tpnVar.d = this.i;
        double dC2 = 0.0d;
        int i5 = 1;
        while (i5 < c()) {
            o(i5, tpmVar);
            int i6 = tpmVar.a;
            int i7 = tpmVarH.a;
            if (i6 < i7) {
                int i8 = (i6 - i7) + i4;
                if (i8 < i7 - i6) {
                    int i9 = (i + i4) - i7;
                    int i10 = tpmVar.b;
                    i2 = i4;
                    int i11 = tpmVarH.b;
                    int iRound = i11 + ((int) java.lang.Math.round((((double) (i10 - i11)) * ((double) i9)) / ((double) i8)));
                    defpackage.tpm tpmVar2 = new defpackage.tpm(i + 1073741823, iRound);
                    tpnVar.c(tpmVar2);
                    dC = dC2 + ((double) tpmVarH.c(tpmVar2));
                    arrayList.add(tpnVar.a());
                    tpnVar.b();
                    tpnVar.d = (float) dC;
                    defpackage.tpm tpmVar3 = new defpackage.tpm(i, iRound);
                    tpnVar.c(tpmVar3);
                    fC = tpmVar3.c(tpmVar);
                    dC2 = dC + ((double) fC);
                    z = true;
                } else {
                    i2 = i4;
                    z = false;
                }
            } else {
                i2 = i4;
                if (i6 <= i7 || (i3 = (i7 - i6) + i2) >= i6 - i7) {
                    z = false;
                } else {
                    int i12 = tpmVar.b;
                    int i13 = tpmVarH.b;
                    int iRound2 = i13 + ((int) java.lang.Math.round((((double) (i12 - i13)) * ((double) (i7 - i))) / ((double) i3)));
                    defpackage.tpm tpmVar4 = new defpackage.tpm(i, iRound2);
                    tpnVar.c(tpmVar4);
                    dC = dC2 + ((double) tpmVarH.c(tpmVar4));
                    arrayList.add(tpnVar.a());
                    tpnVar.b();
                    tpnVar.d = (float) dC;
                    defpackage.tpm tpmVar5 = new defpackage.tpm(i + 1073741823, iRound2);
                    tpnVar.c(tpmVar5);
                    fC = tpmVar5.c(tpmVar);
                    dC2 = dC + ((double) fC);
                    z = true;
                }
            }
            if (!z) {
                dC2 += (double) tpmVarH.c(tpmVar);
            }
            tpmVarH.A(tpmVar);
            tpnVar.c(tpmVar);
            i5++;
            i4 = i2;
        }
        arrayList.add(tpnVar.a());
        return arrayList;
    }

    public final void n(float f, defpackage.tqd tqdVar) {
        defpackage.tpm tpmVarM;
        float fA = a();
        float fA2 = a() / 2.0f;
        if (fA2 < f) {
            tpmVarM = h(1).m(h(0));
        } else {
            float f2 = (fA2 + f) / fA;
            float f3 = (fA2 - f) / fA;
            defpackage.tpm tpmVar = new defpackage.tpm();
            defpackage.tpm tpmVar2 = new defpackage.tpm();
            f(f2, tpmVar);
            f(f3, tpmVar2);
            tpmVarM = tpmVar.m(tpmVar2);
        }
        tqdVar.b = tpmVarM.a;
        tqdVar.c = tpmVarM.b;
        defpackage.tqd.k(tqdVar, tqdVar);
        defpackage.tqd.l(tqdVar, tqdVar);
    }

    public final void o(int i, defpackage.tpm tpmVar) {
        int[] iArr = this.d;
        int i2 = i + i;
        int i3 = iArr[i2];
        int i4 = this.h;
        tpmVar.a = defpackage.a.aa(i3, i4, this.f);
        tpmVar.b = defpackage.a.aa(iArr[i2 + 1], i4, this.g);
        tpmVar.c = 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Polyline{");
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.d;
            if (i >= iArr.length) {
                sb.append('}');
                return sb.toString();
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(iArr[i]);
            sb.append(", ");
            sb.append(iArr[i + 1]);
            sb.append(")");
            float[] fArr = this.e;
            if (fArr.length > 0) {
                sb.append(" alt: ");
                sb.append(fArr[i2]);
                i2++;
            }
            i += 2;
        }
    }

    public tpo(int[] iArr, float[] fArr, int i, int i2, int i3) {
        this.i = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.d = iArr;
        this.e = fArr;
        this.h = i;
        this.f = i2;
        this.g = i3;
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
    }

    public tpo(int[] iArr, float[] fArr, int i, int i2, int i3, float f) {
        this(iArr, fArr, i, i2, i3);
        this.i = f;
    }
}
