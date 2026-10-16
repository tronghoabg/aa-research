package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class tny {
    private tou b;
    private boolean f;
    private int i;
    public boolean a = false;
    private final List g = new ArrayList();
    private final List h = new ArrayList();
    private int c = 4;
    private too[] d = new too[4];
    private Float[] e = new Float[4];

    public tny(tou touVar) {
        int i = 0;
        this.b = touVar;
        while (true) {
            too[] tooVarArr = this.d;
            int length = tooVarArr.length;
            if (i >= 4) {
                return;
            }
            tooVarArr[i] = new too();
            this.e[i] = null;
            i++;
        }
    }

    private final void b(int i, too tooVar, Float f, long j, boolean z, float f2) {
        too tooVarE;
        too tooVarE2;
        Float f3;
        tny tnyVar;
        Float f4;
        boolean z2;
        int i2;
        float f5;
        too tooVar2;
        long j2;
        Float f6;
        Float fValueOf = null;
        if (i == this.c) {
            if (z) {
                int i3 = this.i;
                List list = this.g;
                if (i3 == list.size()) {
                    list.add(new top(16, 0, 0, 0));
                    this.h.add(new ajnt(null, null, null));
                }
                this.i++;
            }
            top topVar = (top) this.g.get(this.i - 1);
            if (topVar.c(tooVar)) {
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    int i4 = topVar.c;
                    float[] fArr = topVar.a;
                    int length = fArr.length;
                    if (i4 == length) {
                        float[] fArr2 = new float[length + length];
                        System.arraycopy(fArr, 0, fArr2, 0, i4);
                        topVar.a = fArr2;
                    }
                    float[] fArr3 = topVar.a;
                    int i5 = topVar.c;
                    topVar.c = i5 + 1;
                    fArr3[i5] = fFloatValue;
                }
                if (this.f) {
                    ajnt ajntVar = (ajnt) this.h.get(this.i - 1);
                    int i6 = ajntVar.a;
                    long[] jArr = (long[]) ajntVar.b;
                    int length2 = jArr.length;
                    if (i6 == length2) {
                        ajntVar.b = Arrays.copyOf(jArr, length2 + length2);
                    }
                    Object obj = ajntVar.b;
                    int i7 = ajntVar.a;
                    ajntVar.a = i7 + 1;
                    ((long[]) obj)[i7] = j;
                }
            }
            if (z) {
                topVar.d = f2;
                return;
            }
            return;
        }
        tou touVar = this.b;
        if (i == 0) {
            tooVarE = ((tot) touVar).a;
            tooVarE2 = touVar.e(0);
        } else {
            tooVarE = touVar.e(i - 1);
            tooVarE2 = this.b.e(i);
        }
        if (tss.j(tooVarE, tooVarE2, tooVar) >= 0) {
            int i8 = i + 1;
            if (z) {
                tnyVar = this;
                f4 = f;
                z2 = true;
                i2 = i8;
                f5 = f2;
                tooVar2 = tooVar;
            } else if (tss.j(tooVarE, tooVarE2, this.d[i]) < 0) {
                too tooVar3 = new too();
                tss.m(tooVarE, tooVarE2, tooVar, this.d[i], tooVar3);
                if (f != null) {
                    if (this.e[i] != null) {
                        fValueOf = Float.valueOf(this.e[i].floatValue() + ((this.d[i].c(tooVar3) / this.d[i].c(tooVar)) * (f.floatValue() - this.e[i].floatValue())));
                    }
                    f6 = f;
                } else {
                    f6 = null;
                }
                tnyVar = this;
                i2 = i8;
                j2 = j;
                tnyVar.b(i2, tooVar3, fValueOf, j2, true, f2 - tooVar.c(tooVar3));
                tooVar2 = tooVar;
                f5 = f2;
                z2 = false;
                f4 = f6;
                tnyVar.b(i2, tooVar2, f4, j2, z2, f5);
                f3 = f4;
            } else {
                tnyVar = this;
                tooVar2 = tooVar;
                f4 = f;
                i2 = i8;
                f5 = f2;
                z2 = false;
            }
            j2 = j;
            tnyVar.b(i2, tooVar2, f4, j2, z2, f5);
            f3 = f4;
        } else if (z || tss.j(tooVarE, tooVarE2, this.d[i]) < 0) {
            f3 = f;
        } else {
            int i9 = i + 1;
            too tooVar4 = new too();
            tss.m(tooVarE, tooVarE2, this.d[i], tooVar, tooVar4);
            if (f != null) {
                if (this.e[i] != null) {
                    fValueOf = Float.valueOf(this.e[i].floatValue() + ((this.d[i].c(tooVar4) / this.d[i].c(tooVar)) * (f.floatValue() - this.e[i].floatValue())));
                }
                f3 = f;
            } else {
                f3 = null;
            }
            b(i9, tooVar4, fValueOf, j, false, f2 - tooVar.c(tooVar4));
        }
        this.d[i].A(tooVar);
        this.e[i] = f3;
    }

    public final void a(toq toqVar, long[] jArr, List list, List list2) {
        too tooVar;
        long j;
        this.i = 0;
        this.f = (jArr == null || list2 == null) ? false : true;
        boolean z = (toqVar.l() == null || toqVar.l().isEmpty()) ? false : true;
        tot totVarK = toqVar.k();
        if (this.b.b(totVarK)) {
            if (this.b.j(totVarK)) {
                if (this.a) {
                    int iC = toqVar.c();
                    int i = iC + iC;
                    int[] iArr = new int[i];
                    System.arraycopy(toqVar.d, 0, iArr, 0, i);
                    float[] fArr = toq.b;
                    float[] fArr2 = toqVar.e;
                    int length = fArr2.length;
                    if (length > 0) {
                        fArr = new float[iC];
                        int iMin = Math.min(Math.max(0, length), iC);
                        if (iMin > 0) {
                            System.arraycopy(fArr2, 0, fArr, 0, iMin);
                            while (iMin < iC) {
                                fArr[iMin] = fArr[iMin - 1];
                                iMin++;
                            }
                        }
                    }
                    toq toqVar2 = new toq(iArr, fArr, toqVar.h, toqVar.f, toqVar.g, toqVar.i);
                    toqVar2.i = BitmapDescriptorFactory.HUE_RED;
                    list.add(toqVar2);
                } else {
                    list.add(toqVar);
                }
                if (jArr == null || list2 == null) {
                    return;
                }
                list2.add(jArr);
                return;
            }
            too tooVar2 = new too();
            too tooVar3 = new too();
            Float f = z ? (Float) toqVar.l().get(0) : null;
            toqVar.o(0, tooVar2);
            toqVar.o(0, tooVar3);
            float fC = !this.a ? toqVar.i : 0.0f;
            if (jArr == null || list2 == null) {
                tooVar = tooVar3;
                j = 0;
            } else {
                j = jArr[0];
                tooVar = tooVar3;
            }
            too tooVar4 = tooVar;
            b(0, tooVar2, f, j, true, fC);
            for (int i2 = 1; i2 < toqVar.c(); i2++) {
                toqVar.o(i2, tooVar2);
                fC += tooVar2.c(tooVar4);
                toqVar.o(i2, tooVar4);
                b(0, tooVar2, z ? (Float) toqVar.l().get(i2) : null, (jArr == null || list2 == null) ? 0L : jArr[i2], false, fC);
            }
            for (int i3 = 0; i3 < this.i; i3++) {
                top topVar = (top) this.g.get(i3);
                if (topVar.b > 1) {
                    toq toqVarA = topVar.a();
                    if (this.a) {
                        toqVarA.i = BitmapDescriptorFactory.HUE_RED;
                    }
                    list.add(toqVarA);
                }
                topVar.b();
                if (jArr != null && list2 != null) {
                    ajnt ajntVar = (ajnt) this.h.get(i3);
                    int i4 = ajntVar.a;
                    if (i4 > 1) {
                        list2.add(Arrays.copyOf((long[]) ajntVar.b, i4));
                    }
                    ajntVar.a = 0;
                }
            }
        }
    }
}
