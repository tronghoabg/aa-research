package N5;

import J5.h;
import J5.j;
import J5.k;
import J5.l;
import f6.C2584N;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes3.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Y4.b f8403a = new Y4.b(4);

    /* renamed from: b, reason: collision with root package name */
    public final Y4.b f8404b = new Y4.b(9);

    /* renamed from: c, reason: collision with root package name */
    public final Y4.b f8405c = new Y4.b(11);

    /* renamed from: d, reason: collision with root package name */
    public final Y4.b f8406d = new Y4.b();

    /* renamed from: e, reason: collision with root package name */
    public final c f8407e;

    /* renamed from: f, reason: collision with root package name */
    public C2584N f8408f;

    /* renamed from: g, reason: collision with root package name */
    public int f8409g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8410h;

    /* renamed from: i, reason: collision with root package name */
    public long f8411i;

    /* renamed from: j, reason: collision with root package name */
    public int f8412j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8413l;

    /* renamed from: m, reason: collision with root package name */
    public long f8414m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8415n;

    /* renamed from: o, reason: collision with root package name */
    public a f8416o;

    /* renamed from: p, reason: collision with root package name */
    public e f8417p;

    public b() {
        c cVar = new c(new j());
        cVar.f8418b = -9223372036854775807L;
        cVar.f8419c = new long[0];
        cVar.f8420d = new long[0];
        this.f8407e = cVar;
        this.f8409g = 1;
    }

    @Override // J5.k
    public final void a(long j8, long j10) {
        if (j8 == 0) {
            this.f8409g = 1;
            this.f8410h = false;
        } else {
            this.f8409g = 3;
        }
        this.f8412j = 0;
    }

    public final Y4.b b(h hVar) throws EOFException, InterruptedIOException {
        int i5 = this.f8413l;
        Y4.b bVar = this.f8406d;
        byte[] bArr = bVar.f16679a;
        if (i5 > bArr.length) {
            bVar.y(0, new byte[Math.max(bArr.length * 2, i5)]);
        } else {
            bVar.A(0);
        }
        bVar.z(this.f8413l);
        hVar.f(bVar.f16679a, 0, this.f8413l, false);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0288  */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(J5.l r32, J5.n r33) throws E5.o0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.b.g(J5.l, J5.n):int");
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f8408f = c2584n;
    }

    @Override // J5.k
    public final boolean i(l lVar) throws EOFException, InterruptedIOException {
        Y4.b bVar = this.f8403a;
        h hVar = (h) lVar;
        hVar.c(bVar.f16679a, 0, 3, false);
        bVar.A(0);
        if (bVar.s() == 4607062) {
            hVar.c(bVar.f16679a, 0, 2, false);
            bVar.A(0);
            if ((bVar.v() & 250) == 0) {
                hVar.c(bVar.f16679a, 0, 4, false);
                bVar.A(0);
                int iD = bVar.d();
                hVar.f5648f = 0;
                hVar.b(iD, false);
                hVar.c(bVar.f16679a, 0, 4, false);
                bVar.A(0);
                if (bVar.d() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // J5.k
    public final void release() {
    }
}
