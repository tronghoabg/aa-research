package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {
    public final j d;
    public n a = null;
    public float b = BitmapDescriptorFactory.HUE_RED;
    boolean c = false;
    boolean e = false;

    public k(lah lahVar) {
        this.d = new j(this, lahVar);
    }

    public final void a(n nVar) {
        n nVar2 = this.a;
        if (nVar2 != null) {
            this.d.f(nVar2, -1.0f);
            this.a = null;
        }
        j jVar = this.d;
        float f = -jVar.c(nVar);
        this.a = nVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        int i = jVar.e;
        for (int i2 = 0; i != -1 && i2 < jVar.a; i2++) {
            float[] fArr = jVar.d;
            fArr[i] = fArr[i] / f;
            i = jVar.c[i];
        }
    }

    final void b() {
        j jVar = this.d;
        int i = jVar.e;
        for (int i2 = 0; i != -1 && i2 < jVar.a; i2++) {
            n nVar = ((n[]) jVar.h.b)[jVar.b[i]];
            int i3 = 0;
            while (true) {
                int i4 = nVar.g;
                if (i3 >= i4) {
                    k[] kVarArr = nVar.f;
                    int length = kVarArr.length;
                    if (i4 >= length) {
                        nVar.f = (k[]) Arrays.copyOf(kVarArr, length + length);
                    }
                    k[] kVarArr2 = nVar.f;
                    int i5 = nVar.g;
                    kVarArr2[i5] = this;
                    nVar.g = i5 + 1;
                } else if (nVar.f[i3] == this) {
                    break;
                } else {
                    i3++;
                }
            }
            i = jVar.c[i];
        }
    }

    public final void c(n nVar, n nVar2) {
        j jVar = this.d;
        jVar.f(nVar, 1.0f);
        jVar.f(nVar2, -1.0f);
    }

    public final void d(n nVar, n nVar2, int i, float f, n nVar3, n nVar4, int i2) {
        if (nVar2 == nVar3) {
            j jVar = this.d;
            jVar.f(nVar, 1.0f);
            jVar.f(nVar4, 1.0f);
            jVar.f(nVar2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            j jVar2 = this.d;
            jVar2.f(nVar, 1.0f);
            jVar2.f(nVar2, -1.0f);
            jVar2.f(nVar3, -1.0f);
            jVar2.f(nVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            j jVar3 = this.d;
            jVar3.f(nVar, -1.0f);
            jVar3.f(nVar2, 1.0f);
            this.b = i;
            return;
        }
        j jVar4 = this.d;
        if (f >= 1.0f) {
            jVar4.f(nVar3, -1.0f);
            jVar4.f(nVar4, 1.0f);
            this.b = i2;
            return;
        }
        float f2 = 1.0f - f;
        jVar4.f(nVar, f2);
        jVar4.f(nVar2, -f2);
        jVar4.f(nVar3, -f);
        jVar4.f(nVar4, f);
        if (i > 0 || i2 > 0) {
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void e(n nVar, n nVar2, n nVar3, n nVar4, float f) {
        j jVar = this.d;
        jVar.f(nVar, -1.0f);
        jVar.f(nVar2, 1.0f);
        jVar.f(nVar3, f);
        jVar.f(nVar4, -f);
    }

    public final void f(float f, float f2, float f3, n nVar, int i, n nVar2, int i2, n nVar3, int i3, n nVar4, int i4) {
        int i5 = (-i) - i2;
        if (f2 == BitmapDescriptorFactory.HUE_RED || f == f3) {
            this.b = i5 + i3 + i4;
            j jVar = this.d;
            jVar.f(nVar, 1.0f);
            jVar.f(nVar2, -1.0f);
            jVar.f(nVar4, 1.0f);
            jVar.f(nVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = i5 + (i3 * f4) + (i4 * f4);
        j jVar2 = this.d;
        jVar2.f(nVar, 1.0f);
        jVar2.f(nVar2, -1.0f);
        jVar2.f(nVar4, f4);
        jVar2.f(nVar3, -f4);
    }

    public final void g(n nVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(nVar, 1.0f);
        } else {
            this.b = i;
            this.d.f(nVar, -1.0f);
        }
    }

    public final void h(n nVar, n nVar2, int i) {
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
                j jVar = this.d;
                jVar.f(nVar, 1.0f);
                jVar.f(nVar2, -1.0f);
                return;
            }
        }
        j jVar2 = this.d;
        jVar2.f(nVar, -1.0f);
        jVar2.f(nVar2, 1.0f);
    }

    public final void i(n nVar, n nVar2, n nVar3, int i) {
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
                j jVar = this.d;
                jVar.f(nVar, 1.0f);
                jVar.f(nVar2, -1.0f);
                jVar.f(nVar3, -1.0f);
                return;
            }
        }
        j jVar2 = this.d;
        jVar2.f(nVar, -1.0f);
        jVar2.f(nVar2, 1.0f);
        jVar2.f(nVar3, 1.0f);
    }

    public final void j(n nVar, n nVar2, n nVar3, int i) {
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
                j jVar = this.d;
                jVar.f(nVar, 1.0f);
                jVar.f(nVar2, -1.0f);
                jVar.f(nVar3, 1.0f);
                return;
            }
        }
        j jVar2 = this.d;
        jVar2.f(nVar, -1.0f);
        jVar2.f(nVar2, 1.0f);
        jVar2.f(nVar3, -1.0f);
    }

    public final void k(k kVar) {
        this.d.g(this, kVar);
    }

    public final String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.a == null) {
            strConcat = CloudRecognizerProtocolStrings.DBG_VALUE;
        } else {
            n nVar = this.a;
            Objects.toString(nVar);
            strConcat = "".concat(String.valueOf(nVar));
        }
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != BitmapDescriptorFactory.HUE_RED) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        j jVar = this.d;
        int i = jVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (jVar.d(i2) != null) {
                float fB = jVar.b(i2);
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
                strConcat2 = fB == 1.0f ? strConcat2.concat("null") : strConcat2 + fB + " null";
                z = true;
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }
}
