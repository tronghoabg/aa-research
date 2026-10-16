package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class dox {
    dpb a = null;
    public float b = BitmapDescriptorFactory.HUE_RED;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public dow e;

    public dox(lah lahVar) {
        this.e = new dow(this, lahVar);
    }

    public final dpb a(boolean[] zArr, dpb dpbVar) {
        int i;
        int i2 = this.e.a;
        dpb dpbVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fB = this.e.b(i3);
            if (fB < BitmapDescriptorFactory.HUE_RED) {
                dpb dpbVarD = this.e.d(i3);
                if ((zArr == null || !zArr[dpbVarD.c]) && dpbVarD != dpbVar && (((i = dpbVarD.n) == 3 || i == 4) && fB < f)) {
                    f = fB;
                    dpbVar2 = dpbVarD;
                }
            }
        }
        return dpbVar2;
    }

    final void b(dpb dpbVar) {
        dpb dpbVar2 = this.a;
        if (dpbVar2 != null) {
            this.e.g(dpbVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(dpbVar, true);
        this.a = dpbVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        dow dowVar = this.e;
        int i = dowVar.e;
        for (int i2 = 0; i != -1 && i2 < dowVar.a; i2++) {
            float[] fArr = dowVar.d;
            fArr[i] = fArr[i] / f;
            i = dowVar.c[i];
        }
    }

    public final void c(doy doyVar, dpb dpbVar, boolean z) {
        if (dpbVar == null || !dpbVar.g) {
            return;
        }
        this.b += dpbVar.f * this.e.a(dpbVar);
        this.e.c(dpbVar, z);
        if (z) {
            dpbVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            doyVar.c = true;
        }
    }

    public void d(doy doyVar, dox doxVar, boolean z) {
        dow dowVar = this.e;
        float fA = dowVar.a(doxVar.a);
        dowVar.c(doxVar.a, z);
        dow dowVar2 = doxVar.e;
        int i = dowVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            dpb dpbVarD = dowVar2.d(i2);
            dowVar.e(dpbVarD, dowVar2.a(dpbVarD) * fA, z);
        }
        this.b += doxVar.b * fA;
        if (z) {
            doxVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        doyVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == BitmapDescriptorFactory.HUE_RED && this.e.a == 0;
    }

    public final void f(doy doyVar, int i) {
        this.e.g(doyVar.p(i), 1.0f);
        this.e.g(doyVar.p(i), -1.0f);
    }

    public final void g(dpb dpbVar, dpb dpbVar2, dpb dpbVar3, dpb dpbVar4, float f) {
        this.e.g(dpbVar, -1.0f);
        this.e.g(dpbVar2, 1.0f);
        this.e.g(dpbVar3, f);
        this.e.g(dpbVar4, -f);
    }

    public final void h(dpb dpbVar, dpb dpbVar2, dpb dpbVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(dpbVar, 1.0f);
                this.e.g(dpbVar2, -1.0f);
                this.e.g(dpbVar3, -1.0f);
                return;
            }
        }
        this.e.g(dpbVar, -1.0f);
        this.e.g(dpbVar2, 1.0f);
        this.e.g(dpbVar3, 1.0f);
    }

    public final void i(dpb dpbVar, dpb dpbVar2, dpb dpbVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(dpbVar, 1.0f);
                this.e.g(dpbVar2, -1.0f);
                this.e.g(dpbVar3, 1.0f);
                return;
            }
        }
        this.e.g(dpbVar, -1.0f);
        this.e.g(dpbVar2, 1.0f);
        this.e.g(dpbVar3, -1.0f);
    }

    public final void j(dpb dpbVar, dpb dpbVar2, dpb dpbVar3, dpb dpbVar4, float f) {
        this.e.g(dpbVar3, 0.5f);
        this.e.g(dpbVar4, 0.5f);
        this.e.g(dpbVar, -0.5f);
        this.e.g(dpbVar2, -0.5f);
        this.b = -f;
    }

    public dpb k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        boolean z;
        String str;
        dpb dpbVar = this.a;
        String strConcat = dpbVar == null ? CloudRecognizerProtocolStrings.DBG_VALUE : "".concat(dpbVar.toString());
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != BitmapDescriptorFactory.HUE_RED) {
            strConcat2 = strConcat2 + f;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            dpb dpbVarD = this.e.d(i2);
            if (dpbVarD != null) {
                float fB = this.e.b(i2);
                if (fB != BitmapDescriptorFactory.HUE_RED) {
                    String string = dpbVarD.toString();
                    if (z) {
                        if (fB > BitmapDescriptorFactory.HUE_RED) {
                            str = " + ";
                        } else {
                            fB = -fB;
                            str = " - ";
                        }
                        strConcat2 = strConcat2.concat(str);
                    } else if (fB < BitmapDescriptorFactory.HUE_RED) {
                        fB = -fB;
                        strConcat2 = strConcat2.concat("- ");
                    }
                    strConcat2 = fB == 1.0f ? strConcat2.concat(string) : strConcat2 + fB + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }

    public dox() {
    }
}
