package V2;

import android.text.Layout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f12997a;

    /* renamed from: b, reason: collision with root package name */
    public int f12998b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12999c;

    /* renamed from: d, reason: collision with root package name */
    public int f13000d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13001e;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public String f13007l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f13010o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f13011p;

    /* renamed from: r, reason: collision with root package name */
    public b f13013r;

    /* renamed from: f, reason: collision with root package name */
    public int f13002f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f13003g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f13004h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f13005i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f13006j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f13008m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f13009n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f13012q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f13014s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i5;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f12999c && gVar.f12999c) {
                this.f12998b = gVar.f12998b;
                this.f12999c = true;
            }
            if (this.f13004h == -1) {
                this.f13004h = gVar.f13004h;
            }
            if (this.f13005i == -1) {
                this.f13005i = gVar.f13005i;
            }
            if (this.f12997a == null && (str = gVar.f12997a) != null) {
                this.f12997a = str;
            }
            if (this.f13002f == -1) {
                this.f13002f = gVar.f13002f;
            }
            if (this.f13003g == -1) {
                this.f13003g = gVar.f13003g;
            }
            if (this.f13009n == -1) {
                this.f13009n = gVar.f13009n;
            }
            if (this.f13010o == null && (alignment2 = gVar.f13010o) != null) {
                this.f13010o = alignment2;
            }
            if (this.f13011p == null && (alignment = gVar.f13011p) != null) {
                this.f13011p = alignment;
            }
            if (this.f13012q == -1) {
                this.f13012q = gVar.f13012q;
            }
            if (this.f13006j == -1) {
                this.f13006j = gVar.f13006j;
                this.k = gVar.k;
            }
            if (this.f13013r == null) {
                this.f13013r = gVar.f13013r;
            }
            if (this.f13014s == Float.MAX_VALUE) {
                this.f13014s = gVar.f13014s;
            }
            if (!this.f13001e && gVar.f13001e) {
                this.f13000d = gVar.f13000d;
                this.f13001e = true;
            }
            if (this.f13008m != -1 || (i5 = gVar.f13008m) == -1) {
                return;
            }
            this.f13008m = i5;
        }
    }
}
