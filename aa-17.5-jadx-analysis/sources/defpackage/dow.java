package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dow {
    protected final lah f;
    private final dox g;
    int a = 0;
    private int h = 8;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    private int i = -1;
    private boolean j = false;

    public dow(dox doxVar, lah lahVar) {
        this.g = doxVar;
        this.f = lahVar;
    }

    public final float a(dpb dpbVar) {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.b[i] == dpbVar.c) {
                return this.d[i];
            }
            i = this.c[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final float b(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.d[i2];
            }
            i2 = this.c[i2];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final float c(dpb dpbVar, boolean z) {
        int i = this.e;
        if (i == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.b[i] == dpbVar.c) {
                int i4 = this.e;
                int[] iArr = this.c;
                if (i == i4) {
                    this.e = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    dpbVar.b(this.g);
                }
                dpbVar.l--;
                this.a--;
                this.b[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.d[i];
            }
            i2++;
            i3 = i;
            i = this.c[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final dpb d(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((dpb[]) this.f.b)[this.b[i2]];
            }
            i2 = this.c[i2];
        }
        return null;
    }

    public final void e(dpb dpbVar, float f, boolean z) {
        int[] iArr;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.e;
            if (i == -1) {
                this.e = 0;
                this.d[0] = f;
                this.b[0] = dpbVar.c;
                this.c[0] = -1;
                dpbVar.l++;
                dpbVar.a(this.g);
                this.a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int length = this.b.length;
                if (i2 >= length) {
                    this.j = true;
                    this.i = length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.b[i];
                int i6 = dpbVar.c;
                if (i5 == i6) {
                    float[] fArr = this.d;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == BitmapDescriptorFactory.HUE_RED) {
                        int i7 = this.e;
                        int[] iArr2 = this.c;
                        if (i == i7) {
                            this.e = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            dpbVar.b(this.g);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        dpbVar.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.c[i];
            }
            int length2 = this.i;
            int i8 = length2 + 1;
            if (this.j) {
                int[] iArr3 = this.b;
                if (iArr3[length2] != -1) {
                    length2 = iArr3.length;
                }
            } else {
                length2 = i8;
            }
            int[] iArr4 = this.b;
            int length3 = iArr4.length;
            if (length2 >= length3 && this.a < length3) {
                int i9 = 0;
                while (true) {
                    iArr = this.b;
                    if (i9 >= iArr.length) {
                        iArr4 = iArr;
                        break;
                    } else {
                        if (iArr[i9] == -1) {
                            length2 = i9;
                            break;
                        }
                        i9++;
                    }
                }
            } else {
                iArr = iArr4;
            }
            int length4 = iArr.length;
            if (length2 >= length4) {
                int i10 = this.h;
                int i11 = i10 + i10;
                this.h = i11;
                this.j = false;
                this.i = length4 - 1;
                this.d = Arrays.copyOf(this.d, i11);
                this.b = Arrays.copyOf(this.b, this.h);
                this.c = Arrays.copyOf(this.c, this.h);
                length2 = length4;
            }
            this.b[length2] = dpbVar.c;
            this.d[length2] = f;
            int[] iArr5 = this.c;
            if (i3 != -1) {
                iArr5[length2] = iArr5[i3];
                iArr5[i3] = length2;
            } else {
                iArr5[length2] = this.e;
                this.e = length2;
            }
            dpbVar.l++;
            dpbVar.a(this.g);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i12 = this.i;
            int length5 = this.b.length;
            if (i12 >= length5) {
                this.j = true;
                this.i = length5 - 1;
            }
        }
    }

    public final void f() {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            dpb dpbVar = ((dpb[]) this.f.b)[this.b[i]];
            if (dpbVar != null) {
                dpbVar.b(this.g);
            }
            i = this.c[i];
        }
        this.e = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final void g(dpb dpbVar, float f) {
        int[] iArr;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            c(dpbVar, true);
            return;
        }
        int i = this.e;
        if (i == -1) {
            this.e = 0;
            this.d[0] = f;
            this.b[0] = dpbVar.c;
            this.c[0] = -1;
            dpbVar.l++;
            dpbVar.a(this.g);
            this.a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int length = this.b.length;
            if (i2 >= length) {
                this.j = true;
                this.i = length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.b[i];
            int i6 = dpbVar.c;
            if (i5 == i6) {
                this.d[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.c[i];
        }
        int length2 = this.i;
        int i7 = length2 + 1;
        if (this.j) {
            int[] iArr2 = this.b;
            if (iArr2[length2] != -1) {
                length2 = iArr2.length;
            }
        } else {
            length2 = i7;
        }
        int[] iArr3 = this.b;
        int length3 = iArr3.length;
        if (length2 >= length3 && this.a < length3) {
            int i8 = 0;
            while (true) {
                iArr = this.b;
                if (i8 >= iArr.length) {
                    iArr3 = iArr;
                    break;
                } else {
                    if (iArr[i8] == -1) {
                        length2 = i8;
                        break;
                    }
                    i8++;
                }
            }
        } else {
            iArr = iArr3;
        }
        int length4 = iArr.length;
        if (length2 >= length4) {
            int i9 = this.h;
            int i10 = i9 + i9;
            this.h = i10;
            this.j = false;
            this.i = length4 - 1;
            this.d = Arrays.copyOf(this.d, i10);
            this.b = Arrays.copyOf(this.b, this.h);
            this.c = Arrays.copyOf(this.c, this.h);
            length2 = length4;
        }
        this.b[length2] = dpbVar.c;
        this.d[length2] = f;
        int[] iArr4 = this.c;
        if (i3 != -1) {
            iArr4[length2] = iArr4[i3];
            iArr4[i3] = length2;
        } else {
            iArr4[length2] = this.e;
            this.e = length2;
        }
        dpbVar.l++;
        dpbVar.a(this.g);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.j) {
            this.i++;
        }
        int length5 = this.b.length;
        if (i11 >= length5) {
            this.j = true;
        }
        if (this.i >= length5) {
            this.j = true;
            this.i = length5 - 1;
        }
    }

    public final String toString() {
        int i = this.e;
        String strConcat = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            strConcat = (strConcat.concat(" -> ") + this.d[i] + " : ").concat(String.valueOf(String.valueOf(((dpb[]) this.f.b)[this.b[i]])));
            i = this.c[i];
        }
        return strConcat;
    }
}
