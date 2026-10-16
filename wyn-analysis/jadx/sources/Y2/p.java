package Y2;

import s2.C;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: e, reason: collision with root package name */
    public String f16547e;

    /* renamed from: f, reason: collision with root package name */
    public C f16548f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16551i;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f16553l;

    /* renamed from: n, reason: collision with root package name */
    public int f16555n;

    /* renamed from: o, reason: collision with root package name */
    public int f16556o;

    /* renamed from: s, reason: collision with root package name */
    public int f16560s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16562u;

    /* renamed from: d, reason: collision with root package name */
    public int f16546d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Q1.o f16543a = new Q1.o(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final J5.y f16544b = new J5.y(1);

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f16545c = new Q1.o();

    /* renamed from: p, reason: collision with root package name */
    public final q f16557p = new q();

    /* renamed from: q, reason: collision with root package name */
    public int f16558q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f16559r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f16561t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16552j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16554m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f16549g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f16550h = -9.223372036854776E18d;

    @Override // Y2.h
    public final void a() {
        this.f16546d = 0;
        this.f16553l = 0;
        this.f16543a.D(2);
        this.f16555n = 0;
        this.f16556o = 0;
        this.f16558q = -2147483647;
        this.f16559r = -1;
        this.f16560s = 0;
        this.f16561t = -1L;
        this.f16562u = false;
        this.f16551i = false;
        this.f16554m = true;
        this.f16552j = true;
        this.f16549g = -9.223372036854776E18d;
        this.f16550h = -9.223372036854776E18d;
    }

    @Override // Y2.h
    public final void d(int i5, long j8) {
        this.k = i5;
        if (!this.f16552j && (this.f16556o != 0 || !this.f16554m)) {
            this.f16551i = true;
        }
        if (j8 != -9223372036854775807L) {
            if (this.f16551i) {
                this.f16550h = j8;
            } else {
                this.f16549g = j8;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x046c A[SYNTHETIC] */
    @Override // Y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(Q1.o r27) throws N1.D {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.p.e(Q1.o):void");
    }

    @Override // Y2.h
    public final void f(s2.o oVar, T5.B b5) {
        b5.a();
        b5.b();
        this.f16547e = b5.f11474f;
        b5.b();
        this.f16548f = oVar.mo0m(b5.f11473e, 1);
    }

    @Override // Y2.h
    public final void h(boolean z2) {
    }
}
