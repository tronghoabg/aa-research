package O0;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8786a;

    /* renamed from: e, reason: collision with root package name */
    public float f8790e;

    /* renamed from: l, reason: collision with root package name */
    public int f8796l;

    /* renamed from: b, reason: collision with root package name */
    public int f8787b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f8788c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f8789d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8791f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f8792g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f8793h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public b[] f8794i = new b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f8795j = 0;
    public int k = 0;

    public f(int i5) {
        this.f8796l = i5;
    }

    public final void a(b bVar) {
        int i5 = 0;
        while (true) {
            int i10 = this.f8795j;
            if (i5 >= i10) {
                b[] bVarArr = this.f8794i;
                if (i10 >= bVarArr.length) {
                    this.f8794i = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f8794i;
                int i11 = this.f8795j;
                bVarArr2[i11] = bVar;
                this.f8795j = i11 + 1;
                return;
            }
            if (this.f8794i[i5] == bVar) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final void b(b bVar) {
        int i5 = this.f8795j;
        int i10 = 0;
        while (i10 < i5) {
            if (this.f8794i[i10] == bVar) {
                while (i10 < i5 - 1) {
                    b[] bVarArr = this.f8794i;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.f8795j--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.f8796l = 5;
        this.f8789d = 0;
        this.f8787b = -1;
        this.f8788c = -1;
        this.f8790e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8791f = false;
        int i5 = this.f8795j;
        for (int i10 = 0; i10 < i5; i10++) {
            this.f8794i[i10] = null;
        }
        this.f8795j = 0;
        this.k = 0;
        this.f8786a = false;
        Arrays.fill(this.f8793h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8787b - ((f) obj).f8787b;
    }

    public final void d(c cVar, float f10) {
        this.f8790e = f10;
        this.f8791f = true;
        int i5 = this.f8795j;
        this.f8788c = -1;
        for (int i10 = 0; i10 < i5; i10++) {
            this.f8794i[i10].h(cVar, this, false);
        }
        this.f8795j = 0;
    }

    public final void e(c cVar, b bVar) {
        int i5 = this.f8795j;
        for (int i10 = 0; i10 < i5; i10++) {
            this.f8794i[i10].i(cVar, bVar, false);
        }
        this.f8795j = 0;
    }

    public final String toString() {
        return "" + this.f8787b;
    }
}
