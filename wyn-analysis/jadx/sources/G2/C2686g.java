package g2;

import android.os.SystemClock;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* renamed from: g2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2686g implements s2.m {

    /* renamed from: a, reason: collision with root package name */
    public final h2.i f35588a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.o f35589b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f35590c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35591d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f35592e;

    /* renamed from: f, reason: collision with root package name */
    public final C2690k f35593f;

    /* renamed from: g, reason: collision with root package name */
    public s2.o f35594g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35595h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f35596i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f35597j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f35598l;

    /* renamed from: m, reason: collision with root package name */
    public long f35599m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2686g(g2.C2691l r5, int r6) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C2686g.<init>(g2.l, int):void");
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        synchronized (this.f35592e) {
            try {
                if (!this.k) {
                    this.k = true;
                }
                this.f35598l = j8;
                this.f35599m = j10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        this.f35588a.c(oVar, this.f35591d);
        oVar.l();
        oVar.s(new s2.q(-9223372036854775807L));
        this.f35594g = oVar;
    }

    @Override // s2.m
    public final s2.m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(s2.n nVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    @Override // s2.m
    public final int k(s2.n nVar, J5.n nVar2) {
        this.f35594g.getClass();
        int i5 = nVar.read(this.f35589b.f9702a, 0, 65507);
        if (i5 == -1) {
            return -1;
        }
        if (i5 == 0) {
            return 0;
        }
        this.f35589b.G(0);
        this.f35589b.F(i5);
        Q1.o oVar = this.f35589b;
        C2688i c2688i = null;
        if (oVar.a() >= 12) {
            int iU = oVar.u();
            byte b5 = (byte) (iU >> 6);
            byte b10 = (byte) (iU & 15);
            boolean z2 = ((iU >> 4) & 1) == 1;
            if (b5 == 2) {
                int iU2 = oVar.u();
                boolean z10 = ((iU2 >> 7) & 1) == 1;
                byte b11 = (byte) (iU2 & 127);
                int iA = oVar.A();
                long jW = oVar.w();
                int iH = oVar.h();
                byte[] bArr = C2688i.f35606g;
                if (b10 > 0) {
                    byte[] bArr2 = new byte[b10 * 4];
                    for (int i10 = 0; i10 < b10; i10++) {
                        oVar.f(i10 * 4, 4, bArr2);
                    }
                }
                if (z2) {
                    oVar.H(2);
                    short sR = oVar.r();
                    if (sR != 0) {
                        oVar.H(sR * 4);
                    }
                }
                byte[] bArr3 = new byte[oVar.a()];
                oVar.f(0, oVar.a(), bArr3);
                C2687h c2687h = new C2687h();
                c2687h.f35605f = bArr;
                c2687h.f35600a = z10;
                c2687h.f35601b = b11;
                Q1.k.c(iA >= 0 && iA <= 65535);
                c2687h.f35602c = 65535 & iA;
                c2687h.f35603d = jW;
                c2687h.f35604e = iH;
                c2687h.f35605f = bArr3;
                c2688i = new C2688i(c2687h);
            }
        }
        if (c2688i != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j8 = jElapsedRealtime - 30;
            this.f35593f.c(c2688i, jElapsedRealtime);
            C2688i c2688iD = this.f35593f.d(j8);
            if (c2688iD != null) {
                if (!this.f35595h) {
                    if (this.f35596i == -9223372036854775807L) {
                        this.f35596i = c2688iD.f35610d;
                    }
                    if (this.f35597j == -1) {
                        this.f35597j = c2688iD.f35609c;
                    }
                    this.f35588a.d(this.f35596i);
                    this.f35595h = true;
                }
                synchronized (this.f35592e) {
                    try {
                        if (!this.k) {
                            do {
                                Q1.o oVar2 = this.f35590c;
                                byte[] bArr4 = c2688iD.f35612f;
                                oVar2.getClass();
                                oVar2.E(bArr4.length, bArr4);
                                this.f35588a.b(this.f35590c, c2688iD.f35610d, c2688iD.f35609c, c2688iD.f35607a);
                                c2688iD = this.f35593f.d(j8);
                            } while (c2688iD != null);
                        } else if (this.f35598l != -9223372036854775807L && this.f35599m != -9223372036854775807L) {
                            this.f35593f.e();
                            this.f35588a.a(this.f35598l, this.f35599m);
                            this.k = false;
                            this.f35598l = -9223372036854775807L;
                            this.f35599m = -9223372036854775807L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return 0;
            }
        }
        return 0;
    }

    @Override // s2.m
    public final void release() {
    }
}
