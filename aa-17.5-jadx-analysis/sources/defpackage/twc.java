package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class twc implements tyf {
    int a = Alert.DURATION_SHOW_INDEFINITELY;
    int b = Alert.DURATION_SHOW_INDEFINITELY;
    int c = Integer.MIN_VALUE;
    int d = 0;
    final /* synthetic */ twf e;

    public twc(twf twfVar) {
        this.e = twfVar;
    }

    @Override // defpackage.tyf
    public final float a() {
        return this.d;
    }

    @Override // defpackage.tyf
    public final too b() {
        return new too(this.a, this.b);
    }

    @Override // defpackage.tyf
    public final uws c(List list, boolean z, float[] fArr, float[] fArr2, float[] fArr3, float f, urw urwVar, ugl uglVar, usm usmVar) {
        int i = this.a;
        int i2 = this.b;
        twf twfVar = this.e;
        float f2 = twfVar.r;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uho uhoVar = (uho) it.next();
            List<uhp> list2 = uhoVar.b;
            boolean z2 = false;
            uhn uhnVarA = uhq.a(uglVar, ((uhp) list2.get(0)).j[0], f2, uhoVar.c, uhoVar.d);
            abdd abddVar = uhoVar.a;
            abnh abnhVar = abhx.h;
            abddVar.j(abnhVar);
            Object objJ = abddVar.w.j(abnhVar.d);
            float fFloatValue = ((Float) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).floatValue();
            for (uhp uhpVar : list2) {
                int[] iArr = uhpVar.b;
                int[] iArr2 = uhpVar.a;
                int[] iArr3 = uhpVar.i;
                ukf[] ukfVarArr = uhpVar.j;
                int i3 = uhnVarA.a;
                boolean z3 = z2;
                int i4 = uhnVarA.b;
                Iterator it2 = it;
                int i5 = uhoVar.e;
                int[] iArr4 = uhpVar.d;
                int[] iArr5 = uhpVar.e;
                if (iArr.length != 0 && ukfVarArr[z3 ? 1 : 0] != null) {
                    urwVar.c(iArr, iArr2, new too(i, i2), uhq.d(iArr3, ukfVarArr, f2, twfVar.k), usmVar, i3, i4, i5, iArr3, z, fArr, fArr2, fArr3, true, f, fFloatValue, iArr4, iArr5);
                }
                z2 = z3 ? 1 : 0;
                it = it2;
            }
        }
        return uhq.b(usmVar, z);
    }

    @Override // defpackage.tyf
    public final void d(uho uhoVar) {
        int[] iArr;
        int iMax;
        int i;
        int iMin;
        int iMax2;
        Iterator it = uhoVar.b.iterator();
        while (it.hasNext()) {
            int[] iArr2 = ((uhp) it.next()).b;
            int length = iArr2.length;
            if (length == 0 || (length & 1) != 0) {
                iArr = new int[]{0, 0, 0, 0};
            } else {
                int i2 = iArr2[0];
                int i3 = i2;
                int i4 = 0;
                for (int i5 = 0; i5 < iArr2.length; i5 += 2) {
                    int iAbs = Math.abs(iArr2[0] - iArr2[i5]);
                    if (iAbs > 536870912) {
                        iAbs = 1073741824 - iAbs;
                    }
                    if (iAbs > i4) {
                        i3 = iArr2[i5];
                        i4 = iAbs;
                    }
                }
                boolean z = false;
                for (int i6 = 0; i6 < iArr2.length; i6 += 2) {
                    int iAbs2 = Math.abs(iArr2[i6] - i3);
                    if (iAbs2 > 536870912) {
                        iAbs2 = 1073741824 - iAbs2;
                        z = true;
                    }
                    if (iAbs2 > i4) {
                        i2 = iArr2[i6];
                        i4 = iAbs2;
                    }
                }
                if (z) {
                    iMin = Math.max(i3, i2);
                    iMax2 = Math.min(i3, i2);
                } else {
                    iMin = Math.min(i3, i2);
                    iMax2 = Math.max(i3, i2);
                }
                int i7 = iArr2[1];
                for (int i8 = 1; i8 < iArr2.length; i8 += 2) {
                    int i9 = iArr2[i8];
                    if (i9 < i7) {
                        i7 = i9;
                    }
                }
                iArr = new int[]{iMin, iMax2, i7, i4};
            }
            int i10 = this.c;
            if (i10 == Integer.MIN_VALUE) {
                this.a = iArr[0];
                this.c = iArr[1];
                this.b = iArr[2];
                this.d = iArr[3];
            } else {
                int i11 = this.a;
                if (i11 > i10 || (i = iArr[0]) > iArr[1]) {
                    if (i11 < 0) {
                        this.a = iArr[0];
                    } else {
                        int i12 = iArr[0];
                        if (i12 >= 0) {
                            this.a = Math.min(i12, i11);
                        }
                    }
                    iMax = this.c;
                    if (iMax >= 0) {
                        iMax = iArr[1];
                        this.c = iMax;
                    } else {
                        int i13 = iArr[1];
                        if (i13 < 0) {
                            iMax = Math.max(i13, iMax);
                            this.c = iMax;
                        }
                    }
                } else {
                    this.a = Math.min(i, i11);
                    iMax = Math.max(iArr[1], this.c);
                    this.c = iMax;
                }
                int iAbs3 = Math.abs(this.a - iMax);
                this.d = iAbs3;
                if (iAbs3 > 536870912) {
                    this.d = 1073741824 - iAbs3;
                }
                this.b = Math.min(this.b, iArr[2]);
            }
        }
    }
}
