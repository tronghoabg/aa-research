package o6;

import android.text.Layout;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f41406a;

    /* renamed from: b, reason: collision with root package name */
    public int f41407b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41408c;

    /* renamed from: d, reason: collision with root package name */
    public int f41409d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41410e;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public String f41416l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f41419o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f41420p;

    /* renamed from: r, reason: collision with root package name */
    public C3651b f41422r;

    /* renamed from: f, reason: collision with root package name */
    public int f41411f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f41412g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f41413h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f41414i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f41415j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f41417m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f41418n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f41421q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f41423s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i5;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f41408c && fVar.f41408c) {
                this.f41407b = fVar.f41407b;
                this.f41408c = true;
            }
            if (this.f41413h == -1) {
                this.f41413h = fVar.f41413h;
            }
            if (this.f41414i == -1) {
                this.f41414i = fVar.f41414i;
            }
            if (this.f41406a == null && (str = fVar.f41406a) != null) {
                this.f41406a = str;
            }
            if (this.f41411f == -1) {
                this.f41411f = fVar.f41411f;
            }
            if (this.f41412g == -1) {
                this.f41412g = fVar.f41412g;
            }
            if (this.f41418n == -1) {
                this.f41418n = fVar.f41418n;
            }
            if (this.f41419o == null && (alignment2 = fVar.f41419o) != null) {
                this.f41419o = alignment2;
            }
            if (this.f41420p == null && (alignment = fVar.f41420p) != null) {
                this.f41420p = alignment;
            }
            if (this.f41421q == -1) {
                this.f41421q = fVar.f41421q;
            }
            if (this.f41415j == -1) {
                this.f41415j = fVar.f41415j;
                this.k = fVar.k;
            }
            if (this.f41422r == null) {
                this.f41422r = fVar.f41422r;
            }
            if (this.f41423s == Float.MAX_VALUE) {
                this.f41423s = fVar.f41423s;
            }
            if (!this.f41410e && fVar.f41410e) {
                this.f41409d = fVar.f41409d;
                this.f41410e = true;
            }
            if (this.f41417m != -1 || (i5 = fVar.f41417m) == -1) {
                return;
            }
            this.f41417m = i5;
        }
    }
}
