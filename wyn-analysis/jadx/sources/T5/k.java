package T5;

import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class k implements f {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f11570l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final S3.e f11571a;

    /* renamed from: b, reason: collision with root package name */
    public final Y4.b f11572b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f11573c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final i f11574d;

    /* renamed from: e, reason: collision with root package name */
    public final s f11575e;

    /* renamed from: f, reason: collision with root package name */
    public j f11576f;

    /* renamed from: g, reason: collision with root package name */
    public long f11577g;

    /* renamed from: h, reason: collision with root package name */
    public String f11578h;

    /* renamed from: i, reason: collision with root package name */
    public J5.w f11579i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11580j;
    public long k;

    public k(S3.e eVar) {
        this.f11571a = eVar;
        i iVar = new i();
        iVar.f11560e = new byte[128];
        this.f11574d = iVar;
        this.k = -9223372036854775807L;
        this.f11575e = new s(178, 0);
        this.f11572b = new Y4.b();
    }

    @Override // T5.f
    public final void a() {
        AbstractC4256a.l(this.f11573c);
        i iVar = this.f11574d;
        iVar.f11556a = false;
        iVar.f11558c = 0;
        iVar.f11557b = 0;
        j jVar = this.f11576f;
        if (jVar != null) {
            jVar.f11562b = false;
            jVar.f11563c = false;
            jVar.f11564d = false;
            jVar.f11565e = -1;
        }
        s sVar = this.f11575e;
        if (sVar != null) {
            sVar.d();
        }
        this.f11577g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0297 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0244  */
    @Override // T5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Y4.b r29) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.k.c(Y4.b):void");
    }

    @Override // T5.f
    public final void d(int i5, long j8) {
        if (j8 != -9223372036854775807L) {
            this.k = j8;
        }
    }

    @Override // T5.f
    public final void g(J5.m mVar, B b5) {
        b5.a();
        b5.b();
        this.f11578h = b5.f11474f;
        b5.b();
        J5.w wVarM = mVar.m(b5.f11473e, 2);
        this.f11579i = wVarM;
        this.f11576f = new j(wVarM, 0);
        this.f11571a.m(mVar, b5);
    }

    @Override // T5.f
    public final void i() {
    }
}
