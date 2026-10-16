package Y2;

import android.util.SparseArray;
import s2.C;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C f16492a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16493b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16494c;

    /* renamed from: f, reason: collision with root package name */
    public final J5.y f16497f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f16498g;

    /* renamed from: h, reason: collision with root package name */
    public int f16499h;

    /* renamed from: i, reason: collision with root package name */
    public int f16500i;

    /* renamed from: j, reason: collision with root package name */
    public long f16501j;

    /* renamed from: l, reason: collision with root package name */
    public long f16502l;

    /* renamed from: p, reason: collision with root package name */
    public long f16506p;

    /* renamed from: q, reason: collision with root package name */
    public long f16507q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16508r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16509s;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f16495d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f16496e = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public T5.l f16503m = new T5.l();

    /* renamed from: n, reason: collision with root package name */
    public T5.l f16504n = new T5.l();
    public boolean k = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16505o = false;

    public m(C c10, boolean z2, boolean z10) {
        this.f16492a = c10;
        this.f16493b = z2;
        this.f16494c = z10;
        byte[] bArr = new byte[128];
        this.f16498g = bArr;
        this.f16497f = new J5.y(0, bArr, 0, 3);
        T5.l lVar = this.f16504n;
        lVar.f11582b = false;
        lVar.f11581a = false;
    }

    public final void a() {
        boolean z2;
        int i5;
        boolean z10 = false;
        if (this.f16493b) {
            T5.l lVar = this.f16504n;
            z2 = lVar.f11582b && ((i5 = lVar.f11584d) == 7 || i5 == 2);
        } else {
            z2 = this.f16509s;
        }
        boolean z11 = this.f16508r;
        int i10 = this.f16500i;
        if (i10 == 5 || (z2 && i10 == 1)) {
            z10 = true;
        }
        this.f16508r = z11 | z10;
    }
}
