package O0;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f8750b;

    /* renamed from: c, reason: collision with root package name */
    public final G9.e f8751c;

    /* renamed from: a, reason: collision with root package name */
    public int f8749a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8752d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f8753e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f8754f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f8755g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f8756h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f8757i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8758j = false;

    public a(b bVar, G9.e eVar) {
        this.f8750b = bVar;
        this.f8751c = eVar;
    }

    public final void a(f fVar, float f10, boolean z2) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i5 = this.f8756h;
            b bVar = this.f8750b;
            if (i5 == -1) {
                this.f8756h = 0;
                this.f8755g[0] = f10;
                this.f8753e[0] = fVar.f8787b;
                this.f8754f[0] = -1;
                fVar.k++;
                fVar.a(bVar);
                this.f8749a++;
                if (this.f8758j) {
                    return;
                }
                int i10 = this.f8757i + 1;
                this.f8757i = i10;
                int[] iArr = this.f8753e;
                if (i10 >= iArr.length) {
                    this.f8758j = true;
                    this.f8757i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i5 != -1 && i12 < this.f8749a; i12++) {
                int i13 = this.f8753e[i5];
                int i14 = fVar.f8787b;
                if (i13 == i14) {
                    float[] fArr = this.f8755g;
                    float f11 = fArr[i5] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i5] = f11;
                    if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (i5 == this.f8756h) {
                            this.f8756h = this.f8754f[i5];
                        } else {
                            int[] iArr2 = this.f8754f;
                            iArr2[i11] = iArr2[i5];
                        }
                        if (z2) {
                            fVar.b(bVar);
                        }
                        if (this.f8758j) {
                            this.f8757i = i5;
                        }
                        fVar.k--;
                        this.f8749a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i5;
                }
                i5 = this.f8754f[i5];
            }
            int length = this.f8757i;
            int i15 = length + 1;
            if (this.f8758j) {
                int[] iArr3 = this.f8753e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.f8753e;
            if (length >= iArr4.length && this.f8749a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f8753e;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        length = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.f8753e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.f8752d * 2;
                this.f8752d = i17;
                this.f8758j = false;
                this.f8757i = length - 1;
                this.f8755g = Arrays.copyOf(this.f8755g, i17);
                this.f8753e = Arrays.copyOf(this.f8753e, this.f8752d);
                this.f8754f = Arrays.copyOf(this.f8754f, this.f8752d);
            }
            this.f8753e[length] = fVar.f8787b;
            this.f8755g[length] = f10;
            if (i11 != -1) {
                int[] iArr7 = this.f8754f;
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                this.f8754f[length] = this.f8756h;
                this.f8756h = length;
            }
            fVar.k++;
            fVar.a(bVar);
            this.f8749a++;
            if (!this.f8758j) {
                this.f8757i++;
            }
            int i18 = this.f8757i;
            int[] iArr8 = this.f8753e;
            if (i18 >= iArr8.length) {
                this.f8758j = true;
                this.f8757i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i5 = this.f8756h;
        for (int i10 = 0; i5 != -1 && i10 < this.f8749a; i10++) {
            f fVar = ((f[]) this.f8751c.f4687d)[this.f8753e[i5]];
            if (fVar != null) {
                fVar.b(this.f8750b);
            }
            i5 = this.f8754f[i5];
        }
        this.f8756h = -1;
        this.f8757i = -1;
        this.f8758j = false;
        this.f8749a = 0;
    }

    public final float c(f fVar) {
        int i5 = this.f8756h;
        for (int i10 = 0; i5 != -1 && i10 < this.f8749a; i10++) {
            if (this.f8753e[i5] == fVar.f8787b) {
                return this.f8755g[i5];
            }
            i5 = this.f8754f[i5];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int d() {
        return this.f8749a;
    }

    public final f e(int i5) {
        int i10 = this.f8756h;
        for (int i11 = 0; i10 != -1 && i11 < this.f8749a; i11++) {
            if (i11 == i5) {
                return ((f[]) this.f8751c.f4687d)[this.f8753e[i10]];
            }
            i10 = this.f8754f[i10];
        }
        return null;
    }

    public final float f(int i5) {
        int i10 = this.f8756h;
        for (int i11 = 0; i10 != -1 && i11 < this.f8749a; i11++) {
            if (i11 == i5) {
                return this.f8755g[i10];
            }
            i10 = this.f8754f[i10];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void g(f fVar, float f10) {
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            h(fVar, true);
            return;
        }
        int i5 = this.f8756h;
        b bVar = this.f8750b;
        if (i5 == -1) {
            this.f8756h = 0;
            this.f8755g[0] = f10;
            this.f8753e[0] = fVar.f8787b;
            this.f8754f[0] = -1;
            fVar.k++;
            fVar.a(bVar);
            this.f8749a++;
            if (this.f8758j) {
                return;
            }
            int i10 = this.f8757i + 1;
            this.f8757i = i10;
            int[] iArr = this.f8753e;
            if (i10 >= iArr.length) {
                this.f8758j = true;
                this.f8757i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i5 != -1 && i12 < this.f8749a; i12++) {
            int i13 = this.f8753e[i5];
            int i14 = fVar.f8787b;
            if (i13 == i14) {
                this.f8755g[i5] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i5;
            }
            i5 = this.f8754f[i5];
        }
        int length = this.f8757i;
        int i15 = length + 1;
        if (this.f8758j) {
            int[] iArr2 = this.f8753e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.f8753e;
        if (length >= iArr3.length && this.f8749a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f8753e;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    length = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.f8753e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.f8752d * 2;
            this.f8752d = i17;
            this.f8758j = false;
            this.f8757i = length - 1;
            this.f8755g = Arrays.copyOf(this.f8755g, i17);
            this.f8753e = Arrays.copyOf(this.f8753e, this.f8752d);
            this.f8754f = Arrays.copyOf(this.f8754f, this.f8752d);
        }
        this.f8753e[length] = fVar.f8787b;
        this.f8755g[length] = f10;
        if (i11 != -1) {
            int[] iArr6 = this.f8754f;
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            this.f8754f[length] = this.f8756h;
            this.f8756h = length;
        }
        fVar.k++;
        fVar.a(bVar);
        int i18 = this.f8749a + 1;
        this.f8749a = i18;
        if (!this.f8758j) {
            this.f8757i++;
        }
        int[] iArr7 = this.f8753e;
        if (i18 >= iArr7.length) {
            this.f8758j = true;
        }
        if (this.f8757i >= iArr7.length) {
            this.f8758j = true;
            this.f8757i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z2) {
        int i5 = this.f8756h;
        if (i5 == -1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i10 = 0;
        int i11 = -1;
        while (i5 != -1 && i10 < this.f8749a) {
            if (this.f8753e[i5] == fVar.f8787b) {
                if (i5 == this.f8756h) {
                    this.f8756h = this.f8754f[i5];
                } else {
                    int[] iArr = this.f8754f;
                    iArr[i11] = iArr[i5];
                }
                if (z2) {
                    fVar.b(this.f8750b);
                }
                fVar.k--;
                this.f8749a--;
                this.f8753e[i5] = -1;
                if (this.f8758j) {
                    this.f8757i = i5;
                }
                return this.f8755g[i5];
            }
            i10++;
            i11 = i5;
            i5 = this.f8754f[i5];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final String toString() {
        int i5 = this.f8756h;
        String string = "";
        for (int i10 = 0; i5 != -1 && i10 < this.f8749a; i10++) {
            StringBuilder sbJ = N0.a.j(N0.a.f(string, " -> "));
            sbJ.append(this.f8755g[i5]);
            sbJ.append(" : ");
            StringBuilder sbJ2 = N0.a.j(sbJ.toString());
            sbJ2.append(((f[]) this.f8751c.f4687d)[this.f8753e[i5]]);
            string = sbJ2.toString();
            i5 = this.f8754f[i5];
        }
        return string;
    }
}
