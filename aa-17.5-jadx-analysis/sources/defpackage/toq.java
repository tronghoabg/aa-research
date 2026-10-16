package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class toq {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/api/model/Polyline");
    public static final float[] b;
    public static final toq c;
    public final int[] d;
    public final float[] e;
    public final int f;
    public final int g;
    public final int h;
    public float i;
    private List j;
    private volatile tot k;
    private volatile float l;
    private volatile float m;
    private volatile float n;

    static {
        float[] fArr = new float[0];
        b = fArr;
        c = new toq(new int[0], fArr, 0, 0, 0);
    }

    public toq(int[] iArr, int i, int i2, int i3) {
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.d = iArr;
        this.e = b;
        this.h = i;
        this.f = i2;
        this.g = i3;
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
    }

    public static toq i(too tooVar, too tooVar2) {
        return new toq(new int[]{tooVar.a, tooVar.b, tooVar2.a, tooVar2.b}, 0, 0, 0);
    }

    public static toq j(List list) {
        int size = list.size();
        int[] iArr = new int[size + size];
        for (int i = 0; i < list.size(); i++) {
            int i2 = i + i;
            iArr[i2] = ((too) list.get(i)).a;
            iArr[i2 + 1] = ((too) list.get(i)).b;
        }
        return new toq(iArr, 0, 0, 0);
    }

    public final float a() {
        float f = this.l;
        float fB = BitmapDescriptorFactory.HUE_RED;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            int iC = c() - 1;
            for (int i = 0; i < iC; i++) {
                fB += b(i);
            }
            this.l = fB;
        }
        return this.l;
    }

    @ResultIgnorabilityUnspecified
    public final float b(int i) {
        int[] iArr = this.d;
        int i2 = i + i;
        int i3 = iArr[i2] - iArr[i2 + 2];
        int i4 = iArr[i2 + 1] - iArr[i2 + 3];
        int i5 = this.h;
        return (float) Math.hypot(a.ab(i3, i5, 0), a.ab(i4, i5, 0));
    }

    public final int c() {
        return this.d.length >> 1;
    }

    public final int d(int i) {
        return a.ab(this.d[i + i], this.h, this.f);
    }

    public final int e(int i) {
        return a.ab(this.d[i + i + 1], this.h, this.g);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof toq) {
            toq toqVar = (toq) obj;
            if (this.h == toqVar.h && this.f == toqVar.f && this.g == toqVar.g) {
                int[] iArr = this.d;
                int[] iArr2 = toqVar.d;
                if (iArr.length == iArr2.length) {
                    int i = 0;
                    while (true) {
                        if (i >= iArr.length) {
                            float[] fArr = this.e;
                            float[] fArr2 = toqVar.e;
                            if (fArr.length == fArr2.length) {
                                for (int i2 = 0; i2 < fArr.length; i2++) {
                                    if (fArr[i2] == fArr2[i2]) {
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (iArr[i] != iArr2[i]) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final int f(float f, too tooVar) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            o(0, tooVar);
            return 0;
        }
        int iC = c();
        int i = iC - 1;
        if (f >= 1.0f) {
            int i2 = iC - 2;
            o(i, tooVar);
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
                tooVar.a = ((int) ((iD2 - iD) * f2)) + iD;
                tooVar.b = ((int) (f2 * (iE2 - iE))) + iE;
                tooVar.c = 0;
                return i3;
            }
            fA -= fB;
            i3 = i4;
        }
        int i5 = iC - 2;
        o(i, tooVar);
        return i5;
    }

    @ResultIgnorabilityUnspecified
    public final int g(float f, int i, int i2, too tooVar, too tooVar2, too tooVar3, too tooVar4, boolean[] zArr) {
        int i3;
        o(i, tooVar);
        o(i2, tooVar2);
        int i4 = i + 1;
        int i5 = -1;
        float f2 = f;
        int i6 = i4;
        while (true) {
            i3 = i2 - 1;
            if (i6 > i3) {
                break;
            }
            o(i6, tooVar4);
            float fE = too.e(tooVar, tooVar2, tooVar4, tooVar3);
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
        int iG = i5 > i4 ? 1 + g(f, i, i5, tooVar, tooVar2, tooVar3, tooVar4, zArr) : 1;
        return i5 < i3 ? iG + g(f, i5, i2, tooVar, tooVar2, tooVar3, tooVar4, zArr) : iG;
    }

    public final too h(int i) {
        int[] iArr = this.d;
        int i2 = i + i;
        int i3 = iArr[i2];
        int i4 = this.h;
        return new too(a.ab(i3, i4, this.f), a.ab(iArr[i2 + 1], i4, this.g), 0);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.d) + this.h + (this.f * 31) + (this.g * 961);
        float[] fArr = this.e;
        return fArr.length != 0 ? iHashCode + Arrays.hashCode(fArr) : iHashCode;
    }

    public final tot k() {
        tot totVar;
        if (this.k == null) {
            if (c() > 0) {
                if (c() <= 0) {
                    totVar = null;
                } else {
                    too tooVarH = h(0);
                    int i = tooVarH.a;
                    int i2 = tooVarH.b;
                    int i3 = i;
                    int i4 = i2;
                    for (int i5 = 1; i5 < c(); i5++) {
                        o(i5, tooVarH);
                        int i6 = tooVarH.a;
                        if (i6 < i) {
                            i = i6;
                        }
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = tooVarH.b;
                        if (i7 < i4) {
                            i4 = i7;
                        }
                        if (i7 > i2) {
                            i2 = i7;
                        }
                    }
                    tooVarH.r(i, i4);
                    totVar = new tot(tooVarH, new too(i3, i2));
                }
                totVar.getClass();
                this.k = totVar;
            } else {
                this.k = new tot(new too(), new too());
            }
        }
        return this.k;
    }

    public final synchronized List l() {
        if (this.j == null) {
            float[] fArr = this.e;
            ArrayList arrayListS = yrm.S(fArr.length);
            for (float f : fArr) {
                arrayListS.add(Float.valueOf(f));
            }
            this.j = arrayListS;
        }
        return this.j;
    }

    public final List m(int i) {
        int i2;
        int i3;
        double dC;
        float fC;
        boolean z;
        int i4 = 1073741824;
        woy.O(i <= k().a.a && i + 1073741824 >= k().b.a, "The entire polyline's x coordinates should lie in [splitX, splitX + Model.WORLD_WIDTH]");
        if (c() < 2) {
            return yrm.R(this);
        }
        ArrayList arrayList = new ArrayList();
        top topVar = new top(c(), 0, 0, 0);
        too tooVarH = h(0);
        topVar.c(tooVarH);
        too tooVar = new too();
        topVar.d = this.i;
        double dC2 = 0.0d;
        int i5 = 1;
        while (i5 < c()) {
            o(i5, tooVar);
            int i6 = tooVar.a;
            int i7 = tooVarH.a;
            if (i6 < i7) {
                int i8 = (i6 - i7) + i4;
                if (i8 < i7 - i6) {
                    int i9 = (i + i4) - i7;
                    int i10 = tooVar.b;
                    i2 = i4;
                    int iRound = tooVarH.b + ((int) Math.round(((i10 - r3) * i9) / i8));
                    topVar.c(new too(i + 1073741823, iRound));
                    dC = dC2 + tooVarH.c(r4);
                    arrayList.add(topVar.a());
                    topVar.b();
                    topVar.d = (float) dC;
                    too tooVar2 = new too(i, iRound);
                    topVar.c(tooVar2);
                    fC = tooVar2.c(tooVar);
                    dC2 = dC + fC;
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
                    int i11 = tooVar.b;
                    int iRound2 = tooVarH.b + ((int) Math.round(((i11 - r12) * (i7 - i)) / i3));
                    topVar.c(new too(i, iRound2));
                    dC = dC2 + tooVarH.c(r3);
                    arrayList.add(topVar.a());
                    topVar.b();
                    topVar.d = (float) dC;
                    too tooVar3 = new too(i + 1073741823, iRound2);
                    topVar.c(tooVar3);
                    fC = tooVar3.c(tooVar);
                    dC2 = dC + fC;
                    z = true;
                }
            }
            if (!z) {
                dC2 += tooVarH.c(tooVar);
            }
            tooVarH.A(tooVar);
            topVar.c(tooVar);
            i5++;
            i4 = i2;
        }
        arrayList.add(topVar.a());
        return arrayList;
    }

    public final void n(float f, tpf tpfVar) {
        too tooVarM;
        float fA = a();
        float fA2 = a() / 2.0f;
        if (fA2 < f) {
            tooVarM = h(1).m(h(0));
        } else {
            float f2 = (fA2 + f) / fA;
            float f3 = (fA2 - f) / fA;
            too tooVar = new too();
            too tooVar2 = new too();
            f(f2, tooVar);
            f(f3, tooVar2);
            tooVarM = tooVar.m(tooVar2);
        }
        tpfVar.b = tooVarM.a;
        tpfVar.c = tooVarM.b;
        tpf.k(tpfVar, tpfVar);
        tpf.l(tpfVar, tpfVar);
    }

    public final void o(int i, too tooVar) {
        int[] iArr = this.d;
        int i2 = i + i;
        int i3 = iArr[i2];
        int i4 = this.h;
        tooVar.a = a.ab(i3, i4, this.f);
        tooVar.b = a.ab(iArr[i2 + 1], i4, this.g);
        tooVar.c = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Polyline{");
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

    public toq(int[] iArr, float[] fArr, int i, int i2, int i3) {
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.d = iArr;
        this.e = fArr;
        this.h = i;
        this.f = i2;
        this.g = i3;
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
    }

    public toq(int[] iArr, float[] fArr, int i, int i2, int i3, float f) {
        this(iArr, fArr, i, i2, i3);
        this.i = f;
    }
}
