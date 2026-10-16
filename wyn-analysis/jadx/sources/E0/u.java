package e0;

import U8.v0;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public final class u extends AbstractC2440C {

    /* renamed from: c, reason: collision with root package name */
    public final List f34387c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34388d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34389e;

    public u(List list, long j8, long j10) {
        this.f34387c = list;
        this.f34388d = j8;
        this.f34389e = j10;
    }

    @Override // e0.AbstractC2440C
    public final Shader b(long j8) {
        int i5;
        char c10;
        int[] iArr;
        int i10;
        float[] fArr;
        long j10 = this.f34388d;
        float fD = C2384c.b(j10) == Float.POSITIVE_INFINITY ? d0.f.d(j8) : C2384c.b(j10);
        float fB = C2384c.c(j10) == Float.POSITIVE_INFINITY ? d0.f.b(j8) : C2384c.c(j10);
        long j11 = this.f34389e;
        float fD2 = C2384c.b(j11) == Float.POSITIVE_INFINITY ? d0.f.d(j8) : C2384c.b(j11);
        float fB2 = C2384c.c(j11) == Float.POSITIVE_INFINITY ? d0.f.b(j8) : C2384c.c(j11);
        long jF = v0.f(fD, fB);
        long jF2 = v0.f(fD2, fB2);
        List colors = this.f34387c;
        AbstractC3340k.e(colors, "colors");
        if (colors.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i5 = 0;
        } else {
            int iZ = AbstractC3935e.z(colors);
            i5 = 0;
            for (int i11 = 1; i11 < iZ; i11++) {
                if (C2465q.c(((C2465q) colors.get(i11)).f34382a) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i5++;
                }
            }
        }
        float fB3 = C2384c.b(jF);
        float fC = C2384c.c(jF);
        float fB4 = C2384c.b(jF2);
        float fC2 = C2384c.c(jF2);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr2 = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr2[i12] = z.s(((C2465q) colors.get(i12)).f34382a);
            }
            iArr = iArr2;
            c10 = 0;
        } else {
            int[] iArr3 = new int[colors.size() + i5];
            int iZ2 = AbstractC3935e.z(colors);
            int size2 = colors.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                long j12 = ((C2465q) colors.get(i14)).f34382a;
                if (C2465q.c(j12) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i10 = i13 + 1;
                    iArr3[i13] = z.s(j12);
                } else if (i14 == 0) {
                    i10 = i13 + 1;
                    iArr3[i13] = z.s(C2465q.a(((C2465q) colors.get(1)).f34382a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                } else if (i14 == iZ2) {
                    i10 = i13 + 1;
                    iArr3[i13] = z.s(C2465q.a(((C2465q) colors.get(i14 - 1)).f34382a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                } else {
                    int i15 = i13 + 1;
                    iArr3[i13] = z.s(C2465q.a(((C2465q) colors.get(i14 - 1)).f34382a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    i13 += 2;
                    iArr3[i15] = z.s(C2465q.a(((C2465q) colors.get(i14 + 1)).f34382a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
                i13 = i10;
            }
            c10 = 0;
            iArr = iArr3;
        }
        if (i5 == 0) {
            fArr = null;
        } else {
            fArr = new float[colors.size() + i5];
            fArr[c10] = 0.0f;
            int iZ3 = AbstractC3935e.z(colors);
            int i16 = 1;
            for (int i17 = 1; i17 < iZ3; i17++) {
                long j13 = ((C2465q) colors.get(i17)).f34382a;
                float fZ = i17 / AbstractC3935e.z(colors);
                int i18 = i16 + 1;
                fArr[i16] = fZ;
                if (C2465q.c(j13) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i16 += 2;
                    fArr[i18] = fZ;
                } else {
                    i16 = i18;
                }
            }
            fArr[i16] = 1.0f;
        }
        return new LinearGradient(fB3, fC, fB4, fC2, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC3340k.a(this.f34387c, uVar.f34387c) && C2384c.a(this.f34388d, uVar.f34388d) && C2384c.a(this.f34389e, uVar.f34389e);
    }

    public final int hashCode() {
        return (C2384c.d(this.f34389e) + ((C2384c.d(this.f34388d) + (this.f34387c.hashCode() * 961)) * 31)) * 31;
    }

    public final String toString() {
        String str;
        long j8 = this.f34388d;
        String str2 = "";
        if (v0.R(j8)) {
            str = "start=" + ((Object) C2384c.g(j8)) + ", ";
        } else {
            str = "";
        }
        long j10 = this.f34389e;
        if (v0.R(j10)) {
            str2 = "end=" + ((Object) C2384c.g(j10)) + ", ";
        }
        return "LinearGradient(colors=" + this.f34387c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
