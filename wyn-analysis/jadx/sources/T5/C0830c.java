package T5;

import E5.S;
import E5.T;
import java.util.Arrays;

/* renamed from: T5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0830c implements f {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f11496v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11497a;

    /* renamed from: d, reason: collision with root package name */
    public final String f11500d;

    /* renamed from: e, reason: collision with root package name */
    public String f11501e;

    /* renamed from: f, reason: collision with root package name */
    public J5.w f11502f;

    /* renamed from: g, reason: collision with root package name */
    public J5.w f11503g;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11507l;

    /* renamed from: o, reason: collision with root package name */
    public int f11510o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11511p;

    /* renamed from: r, reason: collision with root package name */
    public int f11513r;

    /* renamed from: t, reason: collision with root package name */
    public J5.w f11515t;

    /* renamed from: u, reason: collision with root package name */
    public long f11516u;

    /* renamed from: b, reason: collision with root package name */
    public final J5.y f11498b = new J5.y(new byte[7], 7, 6, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public final Y4.b f11499c = new Y4.b(Arrays.copyOf(f11496v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f11504h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f11505i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f11506j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f11508m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f11509n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f11512q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f11514s = -9223372036854775807L;

    public C0830c(boolean z2, String str) {
        this.f11497a = z2;
        this.f11500d = str;
    }

    @Override // T5.f
    public final void a() {
        this.f11514s = -9223372036854775807L;
        this.f11507l = false;
        this.f11504h = 0;
        this.f11505i = 0;
        this.f11506j = 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x029e, code lost:
    
        r24 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // T5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Y4.b r26) throws E5.o0 {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.C0830c.c(Y4.b):void");
    }

    @Override // T5.f
    public final void d(int i5, long j8) {
        if (j8 != -9223372036854775807L) {
            this.f11514s = j8;
        }
    }

    @Override // T5.f
    public final void g(J5.m mVar, B b5) {
        b5.a();
        b5.b();
        this.f11501e = b5.f11474f;
        b5.b();
        J5.w wVarM = mVar.m(b5.f11473e, 1);
        this.f11502f = wVarM;
        this.f11515t = wVarM;
        if (!this.f11497a) {
            this.f11503g = new J5.j();
            return;
        }
        b5.a();
        b5.b();
        J5.w wVarM2 = mVar.m(b5.f11473e, 5);
        this.f11503g = wVarM2;
        S s10 = new S();
        b5.b();
        s10.f3195a = b5.f11474f;
        s10.k = "application/id3";
        wVarM2.a(new T(s10));
    }

    @Override // T5.f
    public final void i() {
    }
}
