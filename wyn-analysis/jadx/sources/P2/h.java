package P2;

import N1.C0764m;
import N1.C0765n;
import Q1.o;
import Q1.x;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.C;
import s2.n;
import s2.u;

/* loaded from: classes.dex */
public final class h implements s2.m {

    /* renamed from: a, reason: collision with root package name */
    public final l f9068a;

    /* renamed from: b, reason: collision with root package name */
    public final C0765n f9069b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9070c;

    /* renamed from: f, reason: collision with root package name */
    public C f9073f;

    /* renamed from: g, reason: collision with root package name */
    public int f9074g;

    /* renamed from: h, reason: collision with root package name */
    public int f9075h;

    /* renamed from: i, reason: collision with root package name */
    public long[] f9076i;

    /* renamed from: j, reason: collision with root package name */
    public long f9077j;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f9072e = x.f9729f;

    /* renamed from: d, reason: collision with root package name */
    public final o f9071d = new o();

    public h(l lVar, C0765n c0765n) {
        this.f9068a = lVar;
        C0764m c0764mA = c0765n.a();
        c0764mA.f8194m = N1.C.m("application/x-media3-cues");
        c0764mA.f8192j = c0765n.f8232n;
        c0764mA.f8179H = lVar.P();
        this.f9069b = new C0765n(c0764mA);
        this.f9070c = new ArrayList();
        this.f9075h = 0;
        this.f9076i = x.f9730g;
        this.f9077j = -9223372036854775807L;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        int i5 = this.f9075h;
        Q1.k.g((i5 == 0 || i5 == 5) ? false : true);
        this.f9077j = j10;
        if (this.f9075h == 2) {
            this.f9075h = 1;
        }
        if (this.f9075h == 4) {
            this.f9075h = 3;
        }
    }

    public final void b(g gVar) {
        Q1.k.h(this.f9073f);
        byte[] bArr = gVar.f9067b;
        int length = bArr.length;
        o oVar = this.f9071d;
        oVar.getClass();
        oVar.E(bArr.length, bArr);
        this.f9073f.e(length, oVar);
        this.f9073f.a(gVar.f9066a, 1, length, 0, null);
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        Q1.k.g(this.f9075h == 0);
        C cMo0m = oVar.mo0m(0, 3);
        this.f9073f = cMo0m;
        cMo0m.c(this.f9069b);
        oVar.l();
        oVar.s(new u(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f9075h = 1;
    }

    @Override // s2.m
    public final s2.m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) {
        return true;
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0080 A[EXC_TOP_SPLITTER, PHI: r15
  0x0080: PHI (r15v3 long) = (r15v4 long), (r15v5 long) binds: [B:32:0x007e, B:29:0x007a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r24, J5.n r25) throws java.io.EOFException, java.io.InterruptedIOException, N1.D {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.h.k(s2.n, J5.n):int");
    }

    @Override // s2.m
    public final void release() {
        if (this.f9075h == 5) {
            return;
        }
        this.f9068a.reset();
        this.f9075h = 5;
    }
}
