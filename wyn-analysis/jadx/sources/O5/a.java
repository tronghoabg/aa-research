package O5;

import E5.S;
import E5.T;
import E5.o0;
import J5.h;
import J5.k;
import J5.l;
import J5.n;
import J5.o;
import J5.w;
import R5.i;
import c6.C1561c;
import com.applovin.shadow.okio.Segment;
import f6.C2584N;
import f6.U;
import java.io.EOFException;
import java.io.InterruptedIOException;
import l8.e0;
import org.xmlpull.v1.XmlPullParserException;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class a implements k {

    /* renamed from: b, reason: collision with root package name */
    public C2584N f8858b;

    /* renamed from: c, reason: collision with root package name */
    public int f8859c;

    /* renamed from: d, reason: collision with root package name */
    public int f8860d;

    /* renamed from: e, reason: collision with root package name */
    public int f8861e;

    /* renamed from: g, reason: collision with root package name */
    public C1561c f8863g;

    /* renamed from: h, reason: collision with root package name */
    public h f8864h;

    /* renamed from: i, reason: collision with root package name */
    public A2.d f8865i;

    /* renamed from: j, reason: collision with root package name */
    public R5.k f8866j;

    /* renamed from: a, reason: collision with root package name */
    public final Y4.b f8857a = new Y4.b(6);

    /* renamed from: f, reason: collision with root package name */
    public long f8862f = -1;

    @Override // J5.k
    public final void a(long j8, long j10) {
        if (j8 == 0) {
            this.f8859c = 0;
            this.f8866j = null;
        } else if (this.f8859c == 5) {
            R5.k kVar = this.f8866j;
            kVar.getClass();
            kVar.a(j8, j10);
        }
    }

    public final void b() {
        c(new W5.b[0]);
        C2584N c2584n = this.f8858b;
        c2584n.getClass();
        c2584n.l();
        this.f8858b.x(new o(-9223372036854775807L));
        this.f8859c = 6;
    }

    public final void c(W5.b... bVarArr) {
        C2584N c2584n = this.f8858b;
        c2584n.getClass();
        w wVarM = c2584n.m(Segment.SHARE_MINIMUM, 4);
        S s10 = new S();
        s10.f3204j = "image/jpeg";
        s10.f3203i = new W5.c(bVarArr);
        ((U) wVarM).a(new T(s10));
    }

    @Override // J5.k
    public final int g(l lVar, n nVar) throws o0, EOFException, InterruptedIOException {
        String strL;
        A2.c cVarA;
        e0 e0Var;
        int i5;
        long j8;
        long j10;
        char c10 = 65535;
        int i10 = this.f8859c;
        Y4.b bVar = this.f8857a;
        long j11 = -1;
        if (i10 == 0) {
            bVar.x(2);
            ((h) lVar).f(bVar.f16679a, 0, 2, false);
            int iV = bVar.v();
            this.f8860d = iV;
            if (iV == 65498) {
                if (this.f8862f != -1) {
                    this.f8859c = 4;
                    return 0;
                }
                b();
                return 0;
            }
            if ((iV < 65488 || iV > 65497) && iV != 65281) {
                this.f8859c = 1;
            }
        } else {
            if (i10 == 1) {
                bVar.x(2);
                ((h) lVar).f(bVar.f16679a, 0, 2, false);
                this.f8861e = bVar.v() - 2;
                this.f8859c = 2;
                return 0;
            }
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 == 6) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.f8865i == null || lVar != this.f8864h) {
                        h hVar = (h) lVar;
                        this.f8864h = hVar;
                        this.f8865i = new A2.d(hVar, this.f8862f);
                    }
                    R5.k kVar = this.f8866j;
                    kVar.getClass();
                    int iG = kVar.g(this.f8865i, nVar);
                    if (iG == 1) {
                        nVar.f5655a += this.f8862f;
                    }
                    return iG;
                }
                long j12 = ((h) lVar).f5646d;
                long j13 = this.f8862f;
                if (j12 != j13) {
                    nVar.f5655a = j13;
                    return 1;
                }
                h hVar2 = (h) lVar;
                if (!hVar2.c(bVar.f16679a, 0, 1, true)) {
                    b();
                    return 0;
                }
                hVar2.f5648f = 0;
                if (this.f8866j == null) {
                    this.f8866j = new R5.k();
                }
                A2.d dVar = new A2.d(hVar2, this.f8862f);
                this.f8865i = dVar;
                this.f8866j.getClass();
                if (!i.h(dVar, false, false)) {
                    b();
                    return 0;
                }
                R5.k kVar2 = this.f8866j;
                long j14 = this.f8862f;
                C2584N c2584n = this.f8858b;
                c2584n.getClass();
                kVar2.f10332q = new A2.d(j14, c2584n, 7);
                C1561c c1561c = this.f8863g;
                c1561c.getClass();
                c(c1561c);
                this.f8859c = 5;
                return 0;
            }
            if (this.f8860d == 65505) {
                Y4.b bVar2 = new Y4.b(this.f8861e);
                ((h) lVar).f(bVar2.f16679a, 0, this.f8861e, false);
                if (this.f8863g == null && "http://ns.adobe.com/xap/1.0/".equals(bVar2.l()) && (strL = bVar2.l()) != null) {
                    long j15 = ((h) lVar).f5645c;
                    C1561c c1561c2 = null;
                    if (j15 != -1) {
                        try {
                            cVarA = d.a(strL);
                        } catch (o0 | NumberFormatException | XmlPullParserException unused) {
                            AbstractC4256a.E("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                            cVarA = null;
                        }
                        if (cVarA != null && (i5 = (e0Var = cVarA.f269b).f40103d) >= 2) {
                            int i11 = i5 - 1;
                            boolean z2 = false;
                            long j16 = -1;
                            long j17 = -1;
                            long j18 = -1;
                            long j19 = -1;
                            while (i11 >= 0) {
                                b bVar3 = (b) e0Var.get(i11);
                                char c11 = c10;
                                boolean zEquals = "video/mp4".equals(bVar3.f8867a) | z2;
                                if (i11 == 0) {
                                    j8 = j11;
                                    j15 -= bVar3.f8869c;
                                    j10 = 0;
                                } else {
                                    j8 = j11;
                                    j10 = j15 - bVar3.f8868b;
                                }
                                long j20 = j10;
                                long j21 = j15;
                                j15 = j20;
                                if (!zEquals || j15 == j21) {
                                    z2 = zEquals;
                                } else {
                                    j19 = j21 - j15;
                                    z2 = false;
                                    j18 = j15;
                                }
                                if (i11 == 0) {
                                    j16 = j15;
                                    j17 = j21;
                                }
                                i11--;
                                c10 = c11;
                                j11 = j8;
                            }
                            long j22 = j11;
                            if (j18 != j22 && j19 != j22 && j16 != j22 && j17 != j22) {
                                c1561c2 = new C1561c(j16, j17, cVarA.f268a, j18, j19);
                            }
                        }
                    }
                    this.f8863g = c1561c2;
                    if (c1561c2 != null) {
                        this.f8862f = c1561c2.f19662d;
                    }
                }
            } else {
                ((h) lVar).j(this.f8861e);
            }
            this.f8859c = 0;
        }
        return 0;
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f8858b = c2584n;
    }

    @Override // J5.k
    public final boolean i(l lVar) throws EOFException, InterruptedIOException {
        h hVar = (h) lVar;
        Y4.b bVar = this.f8857a;
        bVar.x(2);
        hVar.c(bVar.f16679a, 0, 2, false);
        if (bVar.v() == 65496) {
            bVar.x(2);
            hVar.c(bVar.f16679a, 0, 2, false);
            int iV = bVar.v();
            this.f8860d = iV;
            if (iV == 65504) {
                bVar.x(2);
                hVar.c(bVar.f16679a, 0, 2, false);
                hVar.b(bVar.v() - 2, false);
                bVar.x(2);
                hVar.c(bVar.f16679a, 0, 2, false);
                this.f8860d = bVar.v();
            }
            if (this.f8860d == 65505) {
                hVar.b(2, false);
                bVar.x(6);
                hVar.c(bVar.f16679a, 0, 6, false);
                if (bVar.r() == 1165519206 && bVar.v() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // J5.k
    public final void release() {
        R5.k kVar = this.f8866j;
        if (kVar != null) {
            kVar.getClass();
        }
    }
}
