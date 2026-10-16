package T5;

import E5.o0;
import f6.C2584N;
import java.io.EOFException;
import java.io.InterruptedIOException;
import u6.AbstractC4256a;

/* renamed from: T5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0829b implements J5.k {

    /* renamed from: c, reason: collision with root package name */
    public final Y4.b f11489c;

    /* renamed from: d, reason: collision with root package name */
    public final J5.y f11490d;

    /* renamed from: e, reason: collision with root package name */
    public C2584N f11491e;

    /* renamed from: f, reason: collision with root package name */
    public long f11492f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11494h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11495i;

    /* renamed from: a, reason: collision with root package name */
    public final C0830c f11487a = new C0830c(true, null);

    /* renamed from: b, reason: collision with root package name */
    public final Y4.b f11488b = new Y4.b(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f11493g = -1;

    public C0829b() {
        Y4.b bVar = new Y4.b(10);
        this.f11489c = bVar;
        byte[] bArr = bVar.f16679a;
        this.f11490d = new J5.y(bArr, bArr.length, 6, (byte) 0);
    }

    @Override // J5.k
    public final void a(long j8, long j10) {
        this.f11494h = false;
        this.f11487a.a();
        this.f11492f = j10;
    }

    @Override // J5.k
    public final int g(J5.l lVar, J5.n nVar) throws o0, EOFException, InterruptedIOException {
        AbstractC4256a.j(this.f11491e);
        long j8 = ((J5.h) lVar).f5645c;
        Y4.b bVar = this.f11488b;
        int i5 = ((J5.h) lVar).read(bVar.f16679a, 0, 2048);
        boolean z2 = i5 == -1;
        if (!this.f11495i) {
            this.f11491e.x(new J5.o(-9223372036854775807L));
            this.f11495i = true;
        }
        if (z2) {
            return -1;
        }
        bVar.A(0);
        bVar.z(i5);
        boolean z10 = this.f11494h;
        C0830c c0830c = this.f11487a;
        if (!z10) {
            c0830c.d(4, this.f11492f);
            this.f11494h = true;
        }
        c0830c.c(bVar);
        return 0;
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f11491e = c2584n;
        this.f11487a.g(c2584n, new B(0, 1, 0, (byte) 0));
        c2584n.l();
    }

    @Override // J5.k
    public final boolean i(J5.l lVar) throws EOFException, InterruptedIOException {
        J5.h hVar = (J5.h) lVar;
        int i5 = 0;
        while (true) {
            Y4.b bVar = this.f11489c;
            hVar.c(bVar.f16679a, 0, 10, false);
            bVar.A(0);
            if (bVar.s() != 4801587) {
                break;
            }
            bVar.B(3);
            int iP = bVar.p();
            i5 += iP + 10;
            hVar.b(iP, false);
        }
        hVar.f5648f = 0;
        hVar.b(i5, false);
        if (this.f11493g == -1) {
            this.f11493g = i5;
        }
        int i10 = i5;
        int i11 = 0;
        int i12 = 0;
        do {
            Y4.b bVar2 = this.f11489c;
            hVar.c(bVar2.f16679a, 0, 2, false);
            bVar2.A(0);
            if ((bVar2.v() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.c(bVar2.f16679a, 0, 4, false);
                J5.y yVar = this.f11490d;
                yVar.q(14);
                int i13 = yVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f5648f = 0;
                    hVar.b(i10, false);
                } else {
                    hVar.b(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                hVar.f5648f = 0;
                hVar.b(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - i5 < 8192);
        return false;
    }

    @Override // J5.k
    public final void release() {
    }
}
