package Y2;

import N1.C0764m;
import Va.M6;
import java.util.Arrays;
import s2.C;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f16415w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16416a;

    /* renamed from: d, reason: collision with root package name */
    public final String f16419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16420e;

    /* renamed from: f, reason: collision with root package name */
    public String f16421f;

    /* renamed from: g, reason: collision with root package name */
    public C f16422g;

    /* renamed from: h, reason: collision with root package name */
    public C f16423h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16426l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16427m;

    /* renamed from: p, reason: collision with root package name */
    public int f16430p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16431q;

    /* renamed from: s, reason: collision with root package name */
    public int f16433s;

    /* renamed from: u, reason: collision with root package name */
    public C f16435u;

    /* renamed from: v, reason: collision with root package name */
    public long f16436v;

    /* renamed from: b, reason: collision with root package name */
    public final J5.y f16417b = new J5.y(new byte[7], 7, 1, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f16418c = new Q1.o(Arrays.copyOf(f16415w, 10));

    /* renamed from: i, reason: collision with root package name */
    public int f16424i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f16425j = 0;
    public int k = 256;

    /* renamed from: n, reason: collision with root package name */
    public int f16428n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f16429o = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f16432r = -9223372036854775807L;

    /* renamed from: t, reason: collision with root package name */
    public long f16434t = -9223372036854775807L;

    public e(int i5, String str, boolean z2) {
        this.f16416a = z2;
        this.f16419d = str;
        this.f16420e = i5;
    }

    @Override // Y2.h
    public final void a() {
        this.f16434t = -9223372036854775807L;
        this.f16427m = false;
        this.f16424i = 0;
        this.f16425j = 0;
        this.k = 256;
    }

    @Override // Y2.h
    public final void d(int i5, long j8) {
        this.f16434t = j8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x021a, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // Y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(Q1.o r24) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.e.e(Q1.o):void");
    }

    @Override // Y2.h
    public final void f(s2.o oVar, T5.B b5) {
        b5.a();
        b5.b();
        this.f16421f = b5.f11474f;
        b5.b();
        C cMo0m = oVar.mo0m(b5.f11473e, 1);
        this.f16422g = cMo0m;
        this.f16435u = cMo0m;
        if (!this.f16416a) {
            this.f16423h = new s2.l();
            return;
        }
        b5.a();
        b5.b();
        C cMo0m2 = oVar.mo0m(b5.f11473e, 5);
        this.f16423h = cMo0m2;
        C0764m c0764m = new C0764m();
        b5.b();
        c0764m.f8183a = b5.f11474f;
        c0764m.f8194m = N1.C.m("application/id3");
        M6.y(c0764m, cMo0m2);
    }

    @Override // Y2.h
    public final void h(boolean z2) {
    }
}
