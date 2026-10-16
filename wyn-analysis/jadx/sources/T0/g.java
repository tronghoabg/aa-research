package T0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int[] f11227a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11228b;

    /* renamed from: c, reason: collision with root package name */
    public int f11229c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f11230d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f11231e;

    /* renamed from: f, reason: collision with root package name */
    public int f11232f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f11233g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f11234h;

    /* renamed from: i, reason: collision with root package name */
    public int f11235i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f11236j;
    public boolean[] k;

    /* renamed from: l, reason: collision with root package name */
    public int f11237l;

    public final void a(float f10, int i5) {
        int i10 = this.f11232f;
        int[] iArr = this.f11230d;
        if (i10 >= iArr.length) {
            this.f11230d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f11231e;
            this.f11231e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f11230d;
        int i11 = this.f11232f;
        iArr2[i11] = i5;
        float[] fArr2 = this.f11231e;
        this.f11232f = i11 + 1;
        fArr2[i11] = f10;
    }

    public final void b(int i5, int i10) {
        int i11 = this.f11229c;
        int[] iArr = this.f11227a;
        if (i11 >= iArr.length) {
            this.f11227a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f11228b;
            this.f11228b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f11227a;
        int i12 = this.f11229c;
        iArr3[i12] = i5;
        int[] iArr4 = this.f11228b;
        this.f11229c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i5, String str) {
        int i10 = this.f11235i;
        int[] iArr = this.f11233g;
        if (i10 >= iArr.length) {
            this.f11233g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f11234h;
            this.f11234h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f11233g;
        int i11 = this.f11235i;
        iArr2[i11] = i5;
        String[] strArr2 = this.f11234h;
        this.f11235i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i5, boolean z2) {
        int i10 = this.f11237l;
        int[] iArr = this.f11236j;
        if (i10 >= iArr.length) {
            this.f11236j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f11236j;
        int i11 = this.f11237l;
        iArr2[i11] = i5;
        boolean[] zArr2 = this.k;
        this.f11237l = i11 + 1;
        zArr2[i11] = z2;
    }
}
