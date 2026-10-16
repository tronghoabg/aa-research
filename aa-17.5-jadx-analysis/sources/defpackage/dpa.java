package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dpa extends dox {
    public int f;
    final doz g;
    private dpb[] h;
    private dpb[] i;

    public dpa(lah lahVar) {
        super(lahVar);
        this.h = new dpb[128];
        this.i = new dpb[128];
        this.f = 0;
        this.g = new doz(this);
    }

    @Override // defpackage.dox
    public final void d(doy doyVar, dox doxVar, boolean z) {
        dpb dpbVar = doxVar.a;
        if (dpbVar == null) {
            return;
        }
        dow dowVar = doxVar.e;
        int i = dowVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            dpb dpbVarD = dowVar.d(i2);
            float fB = dowVar.b(i2);
            doz dozVar = this.g;
            dozVar.a = dpbVarD;
            if (dozVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = dozVar.a.i;
                    float f = fArr[i3] + (dpbVar.i[i3] * fB);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        dozVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    dozVar.b.m(dozVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = dpbVar.i[i4];
                    if (f2 != BitmapDescriptorFactory.HUE_RED) {
                        float f3 = f2 * fB;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        dozVar.a.i[i4] = f3;
                    } else {
                        dozVar.a.i[i4] = 0.0f;
                    }
                }
                l(dpbVarD);
            }
            this.b += doxVar.b * fB;
        }
        m(dpbVar);
    }

    @Override // defpackage.dox
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.dox
    public final dpb k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            dpb[] dpbVarArr = this.h;
            dpb dpbVar = dpbVarArr[i2];
            if (!zArr[dpbVar.c]) {
                doz dozVar = this.g;
                dozVar.a = dpbVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = dozVar.a.i[i3];
                        if (f > BitmapDescriptorFactory.HUE_RED) {
                            break;
                        }
                        if (f < BitmapDescriptorFactory.HUE_RED) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                    i = -1;
                } else {
                    dpb dpbVar2 = dpbVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = dpbVar2.i[i3];
                            float f3 = dozVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void l(dpb dpbVar) {
        int i;
        dpb[] dpbVarArr;
        int i2 = this.f + 1;
        dpb[] dpbVarArr2 = this.h;
        int length = dpbVarArr2.length;
        if (i2 > length) {
            dpb[] dpbVarArr3 = (dpb[]) Arrays.copyOf(dpbVarArr2, length + length);
            this.h = dpbVarArr3;
            int length2 = dpbVarArr3.length;
            this.i = (dpb[]) Arrays.copyOf(dpbVarArr3, length2 + length2);
        }
        dpb[] dpbVarArr4 = this.h;
        int i3 = this.f;
        dpbVarArr4[i3] = dpbVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && dpbVarArr4[i3].c > dpbVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                dpbVarArr = this.i;
                if (i5 >= i) {
                    break;
                }
                dpbVarArr[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(dpbVarArr, 0, i, new civ(5));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        dpbVar.b = true;
        dpbVar.a(this);
    }

    public final void m(dpb dpbVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == dpbVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        dpbVar.b = false;
                        return;
                    } else {
                        dpb[] dpbVarArr = this.h;
                        int i3 = i + 1;
                        dpbVarArr[i] = dpbVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.dox
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            dpb dpbVar = this.h[i];
            doz dozVar = this.g;
            dozVar.a = dpbVar;
            str = str + String.valueOf(dozVar) + " ";
        }
        return str;
    }
}
