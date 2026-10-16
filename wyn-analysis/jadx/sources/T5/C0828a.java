package T5;

import E5.T;

/* renamed from: T5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0828a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11475a;

    /* renamed from: b, reason: collision with root package name */
    public final J5.y f11476b;

    /* renamed from: c, reason: collision with root package name */
    public final Y4.b f11477c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11478d;

    /* renamed from: e, reason: collision with root package name */
    public String f11479e;

    /* renamed from: f, reason: collision with root package name */
    public J5.w f11480f;

    /* renamed from: g, reason: collision with root package name */
    public int f11481g;

    /* renamed from: h, reason: collision with root package name */
    public int f11482h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11483i;

    /* renamed from: j, reason: collision with root package name */
    public long f11484j;
    public T k;

    /* renamed from: l, reason: collision with root package name */
    public int f11485l;

    /* renamed from: m, reason: collision with root package name */
    public long f11486m;

    public C0828a(String str, int i5) {
        this.f11475a = i5;
        switch (i5) {
            case 1:
                byte[] bArr = new byte[16];
                this.f11476b = new J5.y(bArr, 16, 6, (byte) 0);
                this.f11477c = new Y4.b(bArr);
                this.f11481g = 0;
                this.f11482h = 0;
                this.f11483i = false;
                this.f11486m = -9223372036854775807L;
                this.f11478d = str;
                break;
            default:
                byte[] bArr2 = new byte[128];
                this.f11476b = new J5.y(bArr2, 128, 6, (byte) 0);
                this.f11477c = new Y4.b(bArr2);
                this.f11481g = 0;
                this.f11486m = -9223372036854775807L;
                this.f11478d = str;
                break;
        }
    }

    @Override // T5.f
    public final void a() {
        switch (this.f11475a) {
            case 0:
                this.f11481g = 0;
                this.f11482h = 0;
                this.f11483i = false;
                this.f11486m = -9223372036854775807L;
                break;
            default:
                this.f11481g = 0;
                this.f11482h = 0;
                this.f11483i = false;
                this.f11486m = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b8  */
    @Override // T5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Y4.b r21) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.C0828a.c(Y4.b):void");
    }

    @Override // T5.f
    public final void d(int i5, long j8) {
        switch (this.f11475a) {
            case 0:
                if (j8 != -9223372036854775807L) {
                    this.f11486m = j8;
                    break;
                }
                break;
            default:
                if (j8 != -9223372036854775807L) {
                    this.f11486m = j8;
                    break;
                }
                break;
        }
    }

    @Override // T5.f
    public final void g(J5.m mVar, B b5) {
        switch (this.f11475a) {
            case 0:
                b5.a();
                b5.b();
                this.f11479e = b5.f11474f;
                b5.b();
                this.f11480f = mVar.m(b5.f11473e, 1);
                break;
            default:
                b5.a();
                b5.b();
                this.f11479e = b5.f11474f;
                b5.b();
                this.f11480f = mVar.m(b5.f11473e, 1);
                break;
        }
    }

    @Override // T5.f
    public final void i() {
        int i5 = this.f11475a;
    }

    private final void b() {
    }

    private final void e() {
    }
}
