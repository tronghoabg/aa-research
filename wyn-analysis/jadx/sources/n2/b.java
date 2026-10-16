package N2;

import J5.t;
import Q1.x;
import s2.w;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes.dex */
public final class b implements g, S5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8332a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f8333b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8334c;

    /* renamed from: d, reason: collision with root package name */
    public int f8335d;

    /* renamed from: e, reason: collision with root package name */
    public long f8336e;

    /* renamed from: f, reason: collision with root package name */
    public long f8337f;

    /* renamed from: g, reason: collision with root package name */
    public long f8338g;

    /* renamed from: h, reason: collision with root package name */
    public long f8339h;

    /* renamed from: i, reason: collision with root package name */
    public long f8340i;

    /* renamed from: j, reason: collision with root package name */
    public long f8341j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f8342l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f8343m;

    public b(i iVar, long j8, long j10, long j11, long j12, boolean z2, byte b5) {
        AbstractC4256a.e(j8 >= 0 && j10 > j8);
        this.f8343m = iVar;
        this.f8333b = j8;
        this.f8334c = j10;
        if (j11 == j10 - j8 || z2) {
            this.f8336e = j12;
            this.f8335d = 4;
        } else {
            this.f8335d = 0;
        }
        this.f8342l = new f(1);
    }

    @Override // S5.d
    public t a() {
        if (this.f8336e != 0) {
            return new S5.a(this);
        }
        return null;
    }

    @Override // N2.g, S5.d
    public final void b(long j8) {
        switch (this.f8332a) {
            case 0:
                this.f8338g = x.j(j8, 0L, this.f8336e - 1);
                this.f8335d = 2;
                this.f8339h = this.f8333b;
                this.f8340i = this.f8334c;
                this.f8341j = 0L;
                this.k = this.f8336e;
                break;
            default:
                this.f8338g = v.i(j8, 0L, this.f8336e - 1);
                this.f8335d = 2;
                this.f8339h = this.f8333b;
                this.f8340i = this.f8334c;
                this.f8341j = 0L;
                this.k = this.f8336e;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // S5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d(J5.h r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.b.d(J5.h):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // N2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long f(s2.j r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.b.f(s2.j):long");
    }

    @Override // N2.g
    /* renamed from: a */
    public w mo1a() {
        if (this.f8336e != 0) {
            return new a(this);
        }
        return null;
    }

    public b(i iVar, long j8, long j10, long j11, long j12, boolean z2) {
        Q1.k.c(j8 >= 0 && j10 > j8);
        this.f8343m = iVar;
        this.f8333b = j8;
        this.f8334c = j10;
        if (j11 != j10 - j8 && !z2) {
            this.f8335d = 0;
        } else {
            this.f8336e = j12;
            this.f8335d = 4;
        }
        this.f8342l = new f(0);
    }
}
