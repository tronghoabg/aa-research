package L2;

import G5.L;
import J9.C0664x;
import N1.A;
import N1.B;
import Q1.o;
import Q1.x;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import org.apache.tika.pipes.PipesConfigBase;
import s2.AbstractC3991a;
import s2.C;
import s2.i;
import s2.j;
import s2.l;
import s2.m;
import s2.n;
import s2.s;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: v, reason: collision with root package name */
    public static final C0664x f6835v = new C0664x(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f6836a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6837b;

    /* renamed from: c, reason: collision with root package name */
    public final o f6838c;

    /* renamed from: d, reason: collision with root package name */
    public final L f6839d;

    /* renamed from: e, reason: collision with root package name */
    public final s f6840e;

    /* renamed from: f, reason: collision with root package name */
    public final X2.a f6841f;

    /* renamed from: g, reason: collision with root package name */
    public final l f6842g;

    /* renamed from: h, reason: collision with root package name */
    public s2.o f6843h;

    /* renamed from: i, reason: collision with root package name */
    public C f6844i;

    /* renamed from: j, reason: collision with root package name */
    public C f6845j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public B f6846l;

    /* renamed from: m, reason: collision with root package name */
    public long f6847m;

    /* renamed from: n, reason: collision with root package name */
    public long f6848n;

    /* renamed from: o, reason: collision with root package name */
    public long f6849o;

    /* renamed from: p, reason: collision with root package name */
    public long f6850p;

    /* renamed from: q, reason: collision with root package name */
    public int f6851q;

    /* renamed from: r, reason: collision with root package name */
    public f f6852r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6853s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6854t;

    /* renamed from: u, reason: collision with root package name */
    public long f6855u;

    public d(int i5) {
        this(i5, -9223372036854775807L);
    }

    public static long b(B b5) {
        if (b5 == null) {
            return -9223372036854775807L;
        }
        for (A a5 : b5.f8023a) {
            if (a5 instanceof G2.o) {
                G2.o oVar = (G2.o) a5;
                if (oVar.f4185a.equals("TLEN")) {
                    return x.K(Long.parseLong((String) oVar.f4198c.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        this.k = 0;
        this.f6847m = -9223372036854775807L;
        this.f6848n = 0L;
        this.f6851q = 0;
        this.f6855u = j10;
        f fVar = this.f6852r;
        if (fVar instanceof b) {
            Q1.l lVar = ((b) fVar).f6831c.f44933b;
            int i5 = lVar.f9690b;
            if (i5 != 0 && j10 - lVar.c(i5 - 1) < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH) {
                return;
            }
            this.f6854t = true;
            this.f6845j = this.f6842g;
        }
    }

    public final void c() {
        Object obj = this.f6852r;
        if ((obj instanceof a) && ((i) obj).e()) {
            long j8 = this.f6850p;
            if (j8 == -1 || j8 == this.f6852r.d()) {
                return;
            }
            a aVar = (a) this.f6852r;
            long j10 = this.f6850p;
            int i5 = aVar.f6827j;
            this.f6852r = new a(j10, aVar.f6825h, aVar.f6826i, i5, aVar.k);
            s2.o oVar = this.f6843h;
            oVar.getClass();
            oVar.s(this.f6852r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(s2.j r9) {
        /*
            r8 = this;
            L2.f r0 = r8.f6852r
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
            Q1.o r0 = r8.f6838c     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.f9702a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.c(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.d.d(s2.j):boolean");
    }

    public final boolean e(j jVar, boolean z2) throws EOFException, InterruptedIOException {
        int iG;
        int i5;
        int iJ;
        int i10 = z2 ? 32768 : 131072;
        jVar.f44900f = 0;
        if (jVar.f44898d == 0) {
            B bA = this.f6841f.a(jVar, (this.f6836a & 8) == 0 ? null : f6835v);
            this.f6846l = bA;
            if (bA != null) {
                this.f6840e.b(bA);
            }
            iG = (int) jVar.g();
            if (!z2) {
                jVar.j(iG);
            }
            i5 = 0;
        } else {
            iG = 0;
            i5 = 0;
        }
        int i11 = i5;
        int i12 = i11;
        while (true) {
            if (!d(jVar)) {
                o oVar = this.f6838c;
                oVar.G(0);
                int iH = oVar.h();
                if ((i5 == 0 || ((-128000) & iH) == (i5 & (-128000))) && (iJ = AbstractC3991a.j(iH)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.f6839d.a(iH);
                        i5 = iH;
                    }
                    jVar.b(iJ - 4, false);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == i10) {
                        if (z2) {
                            return false;
                        }
                        c();
                        throw new EOFException();
                    }
                    if (z2) {
                        jVar.f44900f = 0;
                        jVar.b(iG + i13, false);
                    } else {
                        jVar.j(1);
                    }
                    i11 = 0;
                    i12 = i13;
                    i5 = 0;
                }
            } else if (i11 <= 0) {
                c();
                throw new EOFException();
            }
        }
        if (z2) {
            jVar.j(iG + i12);
        } else {
            jVar.f44900f = 0;
        }
        this.k = i5;
        return true;
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        this.f6843h = oVar;
        C cMo0m = oVar.mo0m(0, 1);
        this.f6844i = cMo0m;
        this.f6845j = cMo0m;
        this.f6843h.l();
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) {
        return e((j) nVar, true);
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[PHI: r25 r34
  0x009b: PHI (r25v2 boolean) = (r25v9 boolean), (r25v10 boolean), (r25v11 boolean), (r25v8 boolean) binds: [B:139:0x02bb, B:146:0x02cf, B:123:0x0277, B:35:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r34v2 Q1.o) = (r34v0 Q1.o), (r34v0 Q1.o), (r34v0 Q1.o), (r34v7 Q1.o) binds: [B:139:0x02bb, B:146:0x02cf, B:123:0x0277, B:35:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r59, J5.n r60) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.d.k(s2.n, J5.n):int");
    }

    public d(int i5, long j8) {
        this.f6836a = (i5 & 2) != 0 ? i5 | 1 : i5;
        this.f6837b = j8;
        this.f6838c = new o(10);
        this.f6839d = new L(1);
        this.f6840e = new s();
        this.f6847m = -9223372036854775807L;
        this.f6841f = new X2.a(1);
        l lVar = new l();
        this.f6842g = lVar;
        this.f6845j = lVar;
        this.f6850p = -1L;
    }

    @Override // s2.m
    public final void release() {
    }
}
