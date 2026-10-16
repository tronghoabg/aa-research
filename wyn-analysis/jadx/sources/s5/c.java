package S5;

import E5.o0;
import G5.AbstractC0521b;
import J5.h;
import J5.k;
import J5.l;
import J5.o;
import N2.i;
import T5.B;
import T5.C0828a;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Utf8;
import f6.C2584N;
import java.io.EOFException;
import java.io.InterruptedIOException;
import org.apache.tika.fork.ForkServer;
import u6.v;

/* loaded from: classes3.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11014a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11015b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11016c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11017d;

    public c(int i5) {
        this.f11014a = i5;
        switch (i5) {
            case 1:
                this.f11016c = new C0828a(null, 0);
                this.f11017d = new Y4.b(2786);
                break;
            case 2:
                this.f11016c = new C0828a(null, 1);
                this.f11017d = new Y4.b(Http2.INITIAL_MAX_FRAME_SIZE);
                break;
        }
    }

    @Override // J5.k
    public final void a(long j8, long j10) {
        switch (this.f11014a) {
            case 0:
                i iVar = (i) this.f11017d;
                if (iVar != null) {
                    N2.e eVar = (N2.e) iVar.f8374j;
                    N2.f fVar = (N2.f) eVar.f8353e;
                    fVar.f8355a = 0;
                    fVar.f8356b = 0L;
                    fVar.f8357c = 0;
                    fVar.f8358d = 0;
                    fVar.f8359e = 0;
                    ((Y4.b) eVar.f8354f).x(0);
                    eVar.f8350b = -1;
                    eVar.f8352d = false;
                    if (j8 != 0) {
                        if (iVar.f8369e != 0) {
                            long j11 = (iVar.f8370f * j10) / 1000000;
                            iVar.f8366b = j11;
                            d dVar = (d) iVar.f8376m;
                            int i5 = v.f46721a;
                            dVar.b(j11);
                            iVar.f8369e = 2;
                            break;
                        }
                    } else {
                        iVar.f(!iVar.f8372h);
                        break;
                    }
                }
                break;
            case 1:
                this.f11015b = false;
                ((C0828a) this.f11016c).a();
                break;
            default:
                this.f11015b = false;
                ((C0828a) this.f11016c).a();
                break;
        }
    }

    public boolean e(h hVar) {
        boolean zV0;
        N2.f fVar = new N2.f(1);
        if (fVar.a(hVar, true) && (fVar.f8355a & 2) == 2) {
            int iMin = Math.min(fVar.f8359e, 8);
            Y4.b bVar = new Y4.b(iMin);
            hVar.c(bVar.f16679a, 0, iMin, false);
            bVar.A(0);
            if (bVar.a() >= 5 && bVar.q() == 127 && bVar.r() == 1179402563) {
                this.f11017d = new b(1);
                return true;
            }
            bVar.A(0);
            try {
                zV0 = android.support.v4.media.session.b.v0(1, bVar, true);
            } catch (o0 unused) {
                zV0 = false;
            }
            if (zV0) {
                this.f11017d = new f(1);
            } else {
                bVar.A(0);
                if (e.g(bVar, e.f11018p)) {
                    this.f11017d = new e(1);
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0209  */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(J5.l r21, J5.n r22) throws E5.o0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.c.g(J5.l, J5.n):int");
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        switch (this.f11014a) {
            case 0:
                this.f11016c = c2584n;
                break;
            case 1:
                ((C0828a) this.f11016c).g(c2584n, new B(0, 1, 0, (byte) 0));
                c2584n.l();
                c2584n.x(new o(-9223372036854775807L));
                break;
            default:
                ((C0828a) this.f11016c).g(c2584n, new B(0, 1, 0, (byte) 0));
                c2584n.l();
                c2584n.x(new o(-9223372036854775807L));
                break;
        }
    }

    @Override // J5.k
    public final boolean i(l lVar) throws EOFException, InterruptedIOException {
        int iB;
        int i5;
        switch (this.f11014a) {
            case 0:
                try {
                    break;
                }
            case 1:
                Y4.b bVar = new Y4.b(10);
                int i10 = 0;
                while (true) {
                    h hVar = (h) lVar;
                    hVar.c(bVar.f16679a, 0, 10, false);
                    bVar.A(0);
                    if (bVar.s() != 4801587) {
                        hVar.f5648f = 0;
                        hVar.b(i10, false);
                        int i11 = 0;
                        int i12 = i10;
                        while (true) {
                            hVar.c(bVar.f16679a, 0, 6, false);
                            bVar.A(0);
                            if (bVar.v() != 2935) {
                                hVar.f5648f = 0;
                                i12++;
                                if (i12 - i10 >= 8192) {
                                    break;
                                } else {
                                    hVar.b(i12, false);
                                    i11 = 0;
                                }
                            } else {
                                i11++;
                                if (i11 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr = bVar.f16679a;
                                    if (bArr.length < 6) {
                                        iB = -1;
                                    } else if (((bArr[5] & 248) >> 3) > 10) {
                                        iB = ((((bArr[2] & 7) << 8) | (bArr[3] & ForkServer.ERROR)) + 1) * 2;
                                    } else {
                                        byte b5 = bArr[4];
                                        iB = AbstractC0521b.b((b5 & 192) >> 6, b5 & Utf8.REPLACEMENT_BYTE);
                                    }
                                    if (iB == -1) {
                                        break;
                                    } else {
                                        hVar.b(iB - 6, false);
                                    }
                                }
                            }
                        }
                    } else {
                        bVar.B(3);
                        int iP = bVar.p();
                        i10 += iP + 10;
                        hVar.b(iP, false);
                    }
                }
            default:
                Y4.b bVar2 = new Y4.b(10);
                int i13 = 0;
                while (true) {
                    h hVar2 = (h) lVar;
                    hVar2.c(bVar2.f16679a, 0, 10, false);
                    bVar2.A(0);
                    if (bVar2.s() != 4801587) {
                        hVar2.f5648f = 0;
                        hVar2.b(i13, false);
                        int i14 = 0;
                        int i15 = i13;
                        while (true) {
                            int i16 = 7;
                            hVar2.c(bVar2.f16679a, 0, 7, false);
                            bVar2.A(0);
                            int iV = bVar2.v();
                            if (iV == 44096 || iV == 44097) {
                                i14++;
                                if (i14 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr2 = bVar2.f16679a;
                                    if (bArr2.length < 7) {
                                        i5 = -1;
                                    } else {
                                        int i17 = ((bArr2[2] & ForkServer.ERROR) << 8) | (bArr2[3] & ForkServer.ERROR);
                                        if (i17 == 65535) {
                                            i17 = ((bArr2[4] & ForkServer.ERROR) << 16) | ((bArr2[5] & ForkServer.ERROR) << 8) | (bArr2[6] & ForkServer.ERROR);
                                        } else {
                                            i16 = 4;
                                        }
                                        if (iV == 44097) {
                                            i16 += 2;
                                        }
                                        i5 = i17 + i16;
                                    }
                                    if (i5 == -1) {
                                        break;
                                    } else {
                                        hVar2.b(i5 - 7, false);
                                    }
                                }
                            } else {
                                hVar2.f5648f = 0;
                                i15++;
                                if (i15 - i13 >= 8192) {
                                    break;
                                } else {
                                    hVar2.b(i15, false);
                                    i14 = 0;
                                }
                            }
                        }
                    } else {
                        bVar2.B(3);
                        int iP2 = bVar2.p();
                        i13 += iP2 + 10;
                        hVar2.b(iP2, false);
                    }
                }
                break;
        }
        return true;
    }

    @Override // J5.k
    public final void release() {
        int i5 = this.f11014a;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
