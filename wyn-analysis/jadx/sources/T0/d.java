package T0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f11148A;

    /* renamed from: B, reason: collision with root package name */
    public int f11149B;

    /* renamed from: C, reason: collision with root package name */
    public int f11150C;

    /* renamed from: D, reason: collision with root package name */
    public int f11151D;

    /* renamed from: E, reason: collision with root package name */
    public float f11152E;

    /* renamed from: F, reason: collision with root package name */
    public float f11153F;

    /* renamed from: G, reason: collision with root package name */
    public String f11154G;

    /* renamed from: H, reason: collision with root package name */
    public float f11155H;

    /* renamed from: I, reason: collision with root package name */
    public float f11156I;

    /* renamed from: J, reason: collision with root package name */
    public int f11157J;

    /* renamed from: K, reason: collision with root package name */
    public int f11158K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public int f11159M;

    /* renamed from: N, reason: collision with root package name */
    public int f11160N;

    /* renamed from: O, reason: collision with root package name */
    public int f11161O;

    /* renamed from: P, reason: collision with root package name */
    public int f11162P;

    /* renamed from: Q, reason: collision with root package name */
    public int f11163Q;

    /* renamed from: R, reason: collision with root package name */
    public float f11164R;

    /* renamed from: S, reason: collision with root package name */
    public float f11165S;

    /* renamed from: T, reason: collision with root package name */
    public int f11166T;

    /* renamed from: U, reason: collision with root package name */
    public int f11167U;

    /* renamed from: V, reason: collision with root package name */
    public int f11168V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f11169W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f11170X;

    /* renamed from: Y, reason: collision with root package name */
    public String f11171Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f11172Z;

    /* renamed from: a, reason: collision with root package name */
    public int f11173a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f11174a0;

    /* renamed from: b, reason: collision with root package name */
    public int f11175b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f11176b0;

    /* renamed from: c, reason: collision with root package name */
    public float f11177c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f11178c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11179d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f11180d0;

    /* renamed from: e, reason: collision with root package name */
    public int f11181e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f11182e0;

    /* renamed from: f, reason: collision with root package name */
    public int f11183f;

    /* renamed from: f0, reason: collision with root package name */
    public int f11184f0;

    /* renamed from: g, reason: collision with root package name */
    public int f11185g;

    /* renamed from: g0, reason: collision with root package name */
    public int f11186g0;

    /* renamed from: h, reason: collision with root package name */
    public int f11187h;

    /* renamed from: h0, reason: collision with root package name */
    public int f11188h0;

    /* renamed from: i, reason: collision with root package name */
    public int f11189i;

    /* renamed from: i0, reason: collision with root package name */
    public int f11190i0;

    /* renamed from: j, reason: collision with root package name */
    public int f11191j;

    /* renamed from: j0, reason: collision with root package name */
    public int f11192j0;
    public int k;

    /* renamed from: k0, reason: collision with root package name */
    public int f11193k0;

    /* renamed from: l, reason: collision with root package name */
    public int f11194l;

    /* renamed from: l0, reason: collision with root package name */
    public float f11195l0;

    /* renamed from: m, reason: collision with root package name */
    public int f11196m;

    /* renamed from: m0, reason: collision with root package name */
    public int f11197m0;

    /* renamed from: n, reason: collision with root package name */
    public int f11198n;

    /* renamed from: n0, reason: collision with root package name */
    public int f11199n0;

    /* renamed from: o, reason: collision with root package name */
    public int f11200o;

    /* renamed from: o0, reason: collision with root package name */
    public float f11201o0;

    /* renamed from: p, reason: collision with root package name */
    public int f11202p;

    /* renamed from: p0, reason: collision with root package name */
    public Q0.d f11203p0;

    /* renamed from: q, reason: collision with root package name */
    public int f11204q;

    /* renamed from: r, reason: collision with root package name */
    public float f11205r;

    /* renamed from: s, reason: collision with root package name */
    public int f11206s;

    /* renamed from: t, reason: collision with root package name */
    public int f11207t;

    /* renamed from: u, reason: collision with root package name */
    public int f11208u;

    /* renamed from: v, reason: collision with root package name */
    public int f11209v;

    /* renamed from: w, reason: collision with root package name */
    public int f11210w;

    /* renamed from: x, reason: collision with root package name */
    public int f11211x;

    /* renamed from: y, reason: collision with root package name */
    public int f11212y;

    /* renamed from: z, reason: collision with root package name */
    public int f11213z;

    public final void a() {
        this.f11180d0 = false;
        this.f11174a0 = true;
        this.f11176b0 = true;
        int i5 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i5 == -2 && this.f11169W) {
            this.f11174a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.f11170X) {
            this.f11176b0 = false;
            if (this.f11159M == 0) {
                this.f11159M = 1;
            }
        }
        if (i5 == 0 || i5 == -1) {
            this.f11174a0 = false;
            if (i5 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f11169W = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f11176b0 = false;
            if (i10 == 0 && this.f11159M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f11170X = true;
            }
        }
        if (this.f11177c == -1.0f && this.f11173a == -1 && this.f11175b == -1) {
            return;
        }
        this.f11180d0 = true;
        this.f11174a0 = true;
        this.f11176b0 = true;
        if (!(this.f11203p0 instanceof Q0.h)) {
            this.f11203p0 = new Q0.h();
        }
        ((Q0.h) this.f11203p0).S(this.f11168V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.d.resolveLayoutDirection(int):void");
    }
}
