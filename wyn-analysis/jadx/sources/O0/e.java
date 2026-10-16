package O0;

import A7.R0;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f8782f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f8783g;

    /* renamed from: h, reason: collision with root package name */
    public int f8784h;

    /* renamed from: i, reason: collision with root package name */
    public S3.c f8785i;

    @Override // O0.b
    public final f d(boolean[] zArr) {
        int i5 = -1;
        for (int i10 = 0; i10 < this.f8784h; i10++) {
            f[] fVarArr = this.f8782f;
            f fVar = fVarArr[i10];
            if (!zArr[fVar.f8787b]) {
                S3.c cVar = this.f8785i;
                cVar.f10936b = fVar;
                int i11 = 8;
                if (i5 == -1) {
                    while (i11 >= 0) {
                        float f10 = ((f) cVar.f10936b).f8793h[i11];
                        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                i5 = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i5];
                    while (true) {
                        if (i11 >= 0) {
                            float f11 = fVar2.f8793h[i11];
                            float f12 = ((f) cVar.f10936b).f8793h[i11];
                            if (f12 == f11) {
                                i11--;
                            } else if (f12 < f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i5 == -1) {
            return null;
        }
        return this.f8782f[i5];
    }

    @Override // O0.b
    public final boolean e() {
        return this.f8784h == 0;
    }

    @Override // O0.b
    public final void i(c cVar, b bVar, boolean z2) {
        f fVar = bVar.f8759a;
        if (fVar == null) {
            return;
        }
        a aVar = bVar.f8762d;
        int iD = aVar.d();
        for (int i5 = 0; i5 < iD; i5++) {
            f fVarE = aVar.e(i5);
            float f10 = aVar.f(i5);
            S3.c cVar2 = this.f8785i;
            cVar2.f10936b = fVarE;
            boolean z10 = fVarE.f8786a;
            float[] fArr = fVar.f8793h;
            if (z10) {
                boolean z11 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((f) cVar2.f10936b).f8793h;
                    float f11 = (fArr[i10] * f10) + fArr2[i10];
                    fArr2[i10] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        ((f) cVar2.f10936b).f8793h[i10] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((e) cVar2.f10937c).k((f) cVar2.f10936b);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f12 = fArr[i11];
                    if (f12 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f13 = f12 * f10;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        ((f) cVar2.f10936b).f8793h[i11] = f13;
                    } else {
                        ((f) cVar2.f10936b).f8793h[i11] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f8760b = (bVar.f8760b * f10) + this.f8760b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i5;
        int i10 = this.f8784h + 1;
        f[] fVarArr = this.f8782f;
        if (i10 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f8782f = fVarArr2;
            this.f8783g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f8782f;
        int i11 = this.f8784h;
        fVarArr3[i11] = fVar;
        int i12 = i11 + 1;
        this.f8784h = i12;
        if (i12 > 1 && fVarArr3[i11].f8787b > fVar.f8787b) {
            int i13 = 0;
            while (true) {
                i5 = this.f8784h;
                if (i13 >= i5) {
                    break;
                }
                this.f8783g[i13] = this.f8782f[i13];
                i13++;
            }
            Arrays.sort(this.f8783g, 0, i5, new R0(4));
            for (int i14 = 0; i14 < this.f8784h; i14++) {
                this.f8782f[i14] = this.f8783g[i14];
            }
        }
        fVar.f8786a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i5 = 0;
        while (i5 < this.f8784h) {
            if (this.f8782f[i5] == fVar) {
                while (true) {
                    int i10 = this.f8784h;
                    if (i5 >= i10 - 1) {
                        this.f8784h = i10 - 1;
                        fVar.f8786a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f8782f;
                        int i11 = i5 + 1;
                        fVarArr[i5] = fVarArr[i11];
                        i5 = i11;
                    }
                }
            } else {
                i5++;
            }
        }
    }

    @Override // O0.b
    public final String toString() {
        String str = " goal -> (" + this.f8760b + ") : ";
        for (int i5 = 0; i5 < this.f8784h; i5++) {
            f fVar = this.f8782f[i5];
            S3.c cVar = this.f8785i;
            cVar.f10936b = fVar;
            str = str + cVar + StringUtils.SPACE;
        }
        return str;
    }
}
