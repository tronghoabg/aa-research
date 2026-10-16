package Q5;

import E5.o0;
import G5.AbstractC0521b;
import G5.L;
import J5.j;
import J5.k;
import J5.l;
import J5.q;
import J5.w;
import f6.C2584N;
import java.io.EOFException;
import java.io.InterruptedIOException;
import y3.C4552j;

/* loaded from: classes3.dex */
public final class d implements k {

    /* renamed from: e, reason: collision with root package name */
    public final j f9861e;

    /* renamed from: f, reason: collision with root package name */
    public C2584N f9862f;

    /* renamed from: g, reason: collision with root package name */
    public w f9863g;

    /* renamed from: h, reason: collision with root package name */
    public w f9864h;

    /* renamed from: i, reason: collision with root package name */
    public int f9865i;

    /* renamed from: j, reason: collision with root package name */
    public W5.c f9866j;

    /* renamed from: l, reason: collision with root package name */
    public long f9867l;

    /* renamed from: m, reason: collision with root package name */
    public long f9868m;

    /* renamed from: n, reason: collision with root package name */
    public int f9869n;

    /* renamed from: o, reason: collision with root package name */
    public f f9870o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9871p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9872q;

    /* renamed from: r, reason: collision with root package name */
    public long f9873r;

    /* renamed from: a, reason: collision with root package name */
    public final Y4.b f9857a = new Y4.b(10);

    /* renamed from: b, reason: collision with root package name */
    public final L f9858b = new L(0);

    /* renamed from: c, reason: collision with root package name */
    public final q f9859c = new q();
    public long k = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public final C4552j f9860d = new C4552j(13);

    public d() {
        j jVar = new j();
        this.f9861e = jVar;
        this.f9864h = jVar;
    }

    @Override // J5.k
    public final void a(long j8, long j10) {
        this.f9865i = 0;
        this.k = -9223372036854775807L;
        this.f9867l = 0L;
        this.f9869n = 0;
        this.f9873r = j10;
        f fVar = this.f9870o;
        if (!(fVar instanceof b) || ((b) fVar).a(j10)) {
            return;
        }
        this.f9872q = true;
        this.f9864h = this.f9861e;
    }

    public final a b(J5.h hVar, boolean z2) {
        Y4.b bVar = this.f9857a;
        hVar.c(bVar.f16679a, 0, 4, false);
        bVar.A(0);
        int iD = bVar.d();
        L l10 = this.f9858b;
        l10.a(iD);
        return new a(hVar.f5645c, hVar.f5646d, l10.f4330g, l10.f4327d, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(J5.h r9) {
        /*
            r8 = this;
            Q5.f r0 = r8.f9870o
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.d()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.g()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            Y4.b r0 = r8.f9857a     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.f16679a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.c(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.d.c(J5.h):boolean");
    }

    public final boolean d(J5.h hVar, boolean z2) throws o0, EOFException, InterruptedIOException {
        int iG;
        int i5;
        int iD;
        int i10 = z2 ? 32768 : 131072;
        hVar.f5648f = 0;
        if (hVar.f5646d == 0) {
            W5.c cVarO = this.f9860d.o(hVar, null);
            this.f9866j = cVarO;
            if (cVarO != null) {
                this.f9859c.b(cVarO);
            }
            iG = (int) hVar.g();
            if (!z2) {
                hVar.j(iG);
            }
            i5 = 0;
        } else {
            iG = 0;
            i5 = 0;
        }
        int i11 = i5;
        int i12 = i11;
        while (true) {
            if (!c(hVar)) {
                Y4.b bVar = this.f9857a;
                bVar.A(0);
                int iD2 = bVar.d();
                if ((i5 == 0 || ((-128000) & iD2) == (i5 & (-128000))) && (iD = AbstractC0521b.d(iD2)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.f9858b.a(iD2);
                        i5 = iD2;
                    }
                    hVar.b(iD - 4, false);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == i10) {
                        if (z2) {
                            return false;
                        }
                        throw o0.a("Searched too many bytes.", null);
                    }
                    if (z2) {
                        hVar.f5648f = 0;
                        hVar.b(iG + i13, false);
                    } else {
                        hVar.j(1);
                    }
                    i11 = 0;
                    i12 = i13;
                    i5 = 0;
                }
            } else if (i11 <= 0) {
                throw new EOFException();
            }
        }
        if (z2) {
            hVar.j(iG + i12);
        } else {
            hVar.f5648f = 0;
        }
        this.f9865i = i5;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0291 A[LOOP:2: B:120:0x028f->B:121:0x0291, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(J5.l r42, J5.n r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.d.g(J5.l, J5.n):int");
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f9862f = c2584n;
        w wVarM = c2584n.m(0, 1);
        this.f9863g = wVarM;
        this.f9864h = wVarM;
        this.f9862f.l();
    }

    @Override // J5.k
    public final boolean i(l lVar) {
        return d((J5.h) lVar, true);
    }

    @Override // J5.k
    public final void release() {
    }
}
