package T5;

import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f11539q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f11540a;

    /* renamed from: b, reason: collision with root package name */
    public J5.w f11541b;

    /* renamed from: c, reason: collision with root package name */
    public final S3.e f11542c;

    /* renamed from: d, reason: collision with root package name */
    public final Y4.b f11543d;

    /* renamed from: e, reason: collision with root package name */
    public final s f11544e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f11545f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final g f11546g;

    /* renamed from: h, reason: collision with root package name */
    public long f11547h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11548i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11549j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f11550l;

    /* renamed from: m, reason: collision with root package name */
    public long f11551m;

    /* renamed from: n, reason: collision with root package name */
    public long f11552n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11553o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11554p;

    public h(S3.e eVar) {
        this.f11542c = eVar;
        g gVar = new g();
        gVar.f11538d = new byte[128];
        this.f11546g = gVar;
        if (eVar != null) {
            this.f11544e = new s(178, 0);
            this.f11543d = new Y4.b();
        } else {
            this.f11544e = null;
            this.f11543d = null;
        }
        this.f11550l = -9223372036854775807L;
        this.f11552n = -9223372036854775807L;
    }

    @Override // T5.f
    public final void a() {
        AbstractC4256a.l(this.f11545f);
        g gVar = this.f11546g;
        gVar.f11535a = false;
        gVar.f11536b = 0;
        gVar.f11537c = 0;
        s sVar = this.f11544e;
        if (sVar != null) {
            sVar.d();
        }
        this.f11547h = 0L;
        this.f11548i = false;
        this.f11550l = -9223372036854775807L;
        this.f11552n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0197  */
    @Override // T5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Y4.b r29) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.h.c(Y4.b):void");
    }

    @Override // T5.f
    public final void d(int i5, long j8) {
        this.f11550l = j8;
    }

    @Override // T5.f
    public final void g(J5.m mVar, B b5) {
        b5.a();
        b5.b();
        this.f11540a = b5.f11474f;
        b5.b();
        this.f11541b = mVar.m(b5.f11473e, 2);
        S3.e eVar = this.f11542c;
        if (eVar != null) {
            eVar.m(mVar, b5);
        }
    }

    @Override // T5.f
    public final void i() {
    }
}
