package L5;

import G5.C0522c;
import J5.k;
import J5.l;
import J5.m;
import c8.C1581e;
import f6.C2584N;
import u6.v;

/* loaded from: classes3.dex */
public final class b implements k {

    /* renamed from: c, reason: collision with root package name */
    public int f6942c;

    /* renamed from: e, reason: collision with root package name */
    public c f6944e;

    /* renamed from: h, reason: collision with root package name */
    public long f6947h;

    /* renamed from: i, reason: collision with root package name */
    public e f6948i;

    /* renamed from: m, reason: collision with root package name */
    public int f6951m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6952n;

    /* renamed from: a, reason: collision with root package name */
    public final Y4.b f6940a = new Y4.b(12);

    /* renamed from: b, reason: collision with root package name */
    public final C0522c f6941b = new C0522c();

    /* renamed from: d, reason: collision with root package name */
    public m f6943d = new C1581e(20);

    /* renamed from: g, reason: collision with root package name */
    public e[] f6946g = new e[0];
    public long k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f6950l = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f6949j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f6945f = -9223372036854775807L;

    @Override // J5.k
    public final void a(long j8, long j10) {
        this.f6947h = -1L;
        this.f6948i = null;
        for (e eVar : this.f6946g) {
            if (eVar.f6970j == 0) {
                eVar.f6968h = 0;
            } else {
                eVar.f6968h = eVar.f6971l[v.e(eVar.k, j8, true)];
            }
        }
        if (j8 != 0) {
            this.f6942c = 6;
        } else if (this.f6946g.length == 0) {
            this.f6942c = 0;
        } else {
            this.f6942c = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(J5.l r23, J5.n r24) throws E5.o0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.b.g(J5.l, J5.n):int");
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f6942c = 0;
        this.f6943d = c2584n;
        this.f6947h = -1L;
    }

    @Override // J5.k
    public final boolean i(l lVar) {
        Y4.b bVar = this.f6940a;
        ((J5.h) lVar).c(bVar.f16679a, 0, 12, false);
        bVar.A(0);
        if (bVar.f() == 1179011410) {
            bVar.B(4);
            if (bVar.f() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // J5.k
    public final void release() {
    }
}
