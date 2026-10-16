package Y2;

import G5.C0520a;
import N1.C0764m;
import N1.C0765n;
import N1.D;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.fork.ForkServer;
import s2.AbstractC3991a;
import s2.C;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Q1.o f16439a;

    /* renamed from: c, reason: collision with root package name */
    public final String f16441c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16442d;

    /* renamed from: e, reason: collision with root package name */
    public String f16443e;

    /* renamed from: f, reason: collision with root package name */
    public C f16444f;

    /* renamed from: h, reason: collision with root package name */
    public int f16446h;

    /* renamed from: i, reason: collision with root package name */
    public int f16447i;

    /* renamed from: j, reason: collision with root package name */
    public long f16448j;
    public C0765n k;

    /* renamed from: l, reason: collision with root package name */
    public int f16449l;

    /* renamed from: m, reason: collision with root package name */
    public int f16450m;

    /* renamed from: g, reason: collision with root package name */
    public int f16445g = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f16453p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f16440b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public int f16451n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f16452o = -1;

    public g(String str, int i5, int i10) {
        this.f16439a = new Q1.o(new byte[i10]);
        this.f16441c = str;
        this.f16442d = i5;
    }

    @Override // Y2.h
    public final void a() {
        this.f16445g = 0;
        this.f16446h = 0;
        this.f16447i = 0;
        this.f16453p = -9223372036854775807L;
        this.f16440b.set(0);
    }

    public final boolean b(Q1.o oVar, byte[] bArr, int i5) {
        int iMin = Math.min(oVar.a(), i5 - this.f16446h);
        oVar.f(this.f16446h, iMin, bArr);
        int i10 = this.f16446h + iMin;
        this.f16446h = i10;
        return i10 == i5;
    }

    public final void c(C0520a c0520a) {
        int i5;
        int i10 = c0520a.f4384a;
        if (i10 == -2147483647 || (i5 = c0520a.f4385b) == -1) {
            return;
        }
        C0765n c0765n = this.k;
        String str = c0520a.f4386c;
        if (c0765n != null && i5 == c0765n.f8210C && i10 == c0765n.f8211D && str.equals(c0765n.f8232n)) {
            return;
        }
        C0765n c0765n2 = this.k;
        C0764m c0764m = c0765n2 == null ? new C0764m() : c0765n2.a();
        c0764m.f8183a = this.f16443e;
        c0764m.f8194m = N1.C.m(str);
        c0764m.f8173B = i5;
        c0764m.f8174C = i10;
        c0764m.f8186d = this.f16441c;
        c0764m.f8188f = this.f16442d;
        C0765n c0765n3 = new C0765n(c0764m);
        this.k = c0765n3;
        this.f16444f.c(c0765n3);
    }

    @Override // Y2.h
    public final void d(int i5, long j8) {
        this.f16453p = j8;
    }

    @Override // Y2.h
    public final void e(Q1.o oVar) throws D {
        int i5;
        boolean z2;
        int i10;
        byte b5;
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long jS;
        int i19;
        int i20;
        long jS2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = 4;
        Q1.k.h(this.f16444f);
        while (oVar.a() > 0) {
            int i26 = this.f16445g;
            int i27 = 8;
            Q1.o oVar2 = this.f16439a;
            switch (i26) {
                case 0:
                    while (oVar.a() > 0) {
                        int i28 = this.f16447i << 8;
                        this.f16447i = i28;
                        int iU = i28 | oVar.u();
                        this.f16447i = iU;
                        int i29 = (iU == 2147385345 || iU == -25230976 || iU == 536864768 || iU == -14745368) ? 1 : (iU == 1683496997 || iU == 622876772) ? 2 : (iU == 1078008818 || iU == -233094848) ? 3 : (iU == 1908687592 || iU == -398277519) ? 4 : 0;
                        this.f16450m = i29;
                        if (i29 != 0) {
                            byte[] bArr = oVar2.f9702a;
                            bArr[0] = (byte) ((iU >> 24) & 255);
                            bArr[1] = (byte) ((iU >> 16) & 255);
                            bArr[2] = (byte) ((iU >> 8) & 255);
                            bArr[3] = (byte) (iU & 255);
                            this.f16446h = 4;
                            this.f16447i = 0;
                            if (i29 == 3 || i29 == 4) {
                                this.f16445g = 4;
                            } else if (i29 == 1) {
                                this.f16445g = 1;
                            } else {
                                this.f16445g = 2;
                            }
                            i25 = 4;
                        }
                    }
                    i25 = 4;
                    break;
                case 1:
                    if (b(oVar, oVar2.f9702a, 18)) {
                        byte[] bArr2 = oVar2.f9702a;
                        if (this.k == null) {
                            String str = this.f16443e;
                            J5.y yVarK = AbstractC3991a.k(bArr2);
                            yVarK.t(60);
                            int i30 = AbstractC3991a.f44840j[yVarK.i(6)];
                            int i31 = AbstractC3991a.k[yVarK.i(4)];
                            int i32 = yVarK.i(5);
                            int i33 = i32 >= 29 ? -1 : (AbstractC3991a.f44841l[i32] * 1000) / 2;
                            yVarK.t(10);
                            int i34 = i30 + (yVarK.i(2) > 0 ? 1 : 0);
                            C0764m c0764m = new C0764m();
                            c0764m.f8183a = str;
                            c0764m.f8194m = N1.C.m("audio/vnd.dts");
                            c0764m.f8190h = i33;
                            c0764m.f8173B = i34;
                            c0764m.f8174C = i31;
                            c0764m.f8198q = null;
                            c0764m.f8186d = this.f16441c;
                            c0764m.f8188f = this.f16442d;
                            C0765n c0765n = new C0765n(c0764m);
                            this.k = c0765n;
                            this.f16444f.c(c0765n);
                        }
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i12 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & ForkServer.ERROR) << 4);
                                b11 = bArr2[9];
                            } else if (b12 != 31) {
                                i5 = (((bArr2[5] & 3) << 12) | ((bArr2[6] & ForkServer.ERROR) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                                z2 = false;
                            } else {
                                i12 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & ForkServer.ERROR) << 4);
                                b11 = bArr2[8];
                            }
                            i5 = (i12 | ((b11 & 60) >> 2)) + 1;
                            z2 = true;
                        } else {
                            i5 = (((bArr2[4] & 3) << 12) | ((bArr2[7] & ForkServer.ERROR) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                            z2 = false;
                        }
                        if (z2) {
                            i5 = (i5 * 16) / 14;
                        }
                        this.f16449l = i5;
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i10 = (bArr2[4] & 7) << 4;
                                b10 = bArr2[7];
                            } else if (b12 != 31) {
                                i10 = (bArr2[4] & 1) << 6;
                                b5 = bArr2[5];
                            } else {
                                i10 = (bArr2[5] & 7) << 4;
                                b10 = bArr2[6];
                            }
                            i11 = b10 & 60;
                            this.f16448j = S3.f.l(Q1.x.Q(this.k.f8211D, (((i11 >> 2) | i10) + 1) * 32));
                            oVar2.G(0);
                            this.f16444f.e(18, oVar2);
                            this.f16445g = 6;
                        } else {
                            i10 = (bArr2[5] & 1) << 6;
                            b5 = bArr2[4];
                        }
                        i11 = b5 & 252;
                        this.f16448j = S3.f.l(Q1.x.Q(this.k.f8211D, (((i11 >> 2) | i10) + 1) * 32));
                        oVar2.G(0);
                        this.f16444f.e(18, oVar2);
                        this.f16445g = 6;
                    }
                    i25 = 4;
                case 2:
                    if (b(oVar, oVar2.f9702a, 7)) {
                        J5.y yVarK2 = AbstractC3991a.k(oVar2.f9702a);
                        yVarK2.t(42);
                        this.f16451n = yVarK2.i(yVarK2.h() ? 12 : 8) + 1;
                        this.f16445g = 3;
                    }
                    i25 = 4;
                case 3:
                    int i35 = i25;
                    if (b(oVar, oVar2.f9702a, this.f16451n)) {
                        J5.y yVarK3 = AbstractC3991a.k(oVar2.f9702a);
                        yVarK3.t(40);
                        int i36 = yVarK3.i(2);
                        if (yVarK3.h()) {
                            i13 = 20;
                            i14 = 12;
                        } else {
                            i13 = 16;
                            i14 = 8;
                        }
                        yVarK3.t(i14);
                        int i37 = yVarK3.i(i13) + 1;
                        boolean zH = yVarK3.h();
                        if (zH) {
                            i15 = yVarK3.i(2);
                            i16 = (yVarK3.i(3) + 1) * 512;
                            if (yVarK3.h()) {
                                yVarK3.t(36);
                            }
                            int i38 = yVarK3.i(3) + 1;
                            int i39 = yVarK3.i(3) + 1;
                            if (i38 != 1 || i39 != 1) {
                                throw D.c("Multiple audio presentations or assets not supported");
                            }
                            int i40 = i36 + 1;
                            int i41 = yVarK3.i(i40);
                            int i42 = 0;
                            while (i42 < i40) {
                                if (((i41 >> i42) & 1) == 1) {
                                    yVarK3.t(i27);
                                }
                                i42++;
                                i27 = 8;
                            }
                            if (yVarK3.h()) {
                                yVarK3.t(2);
                                int i43 = (yVarK3.i(2) + 1) << 2;
                                int i44 = yVarK3.i(2) + 1;
                                for (int i45 = 0; i45 < i44; i45++) {
                                    yVarK3.t(i43);
                                }
                            }
                        } else {
                            i15 = -1;
                            i16 = 0;
                        }
                        yVarK3.t(i13);
                        yVarK3.t(12);
                        if (zH) {
                            if (yVarK3.h()) {
                                yVarK3.t(i35);
                            }
                            if (yVarK3.h()) {
                                yVarK3.t(24);
                            }
                            if (yVarK3.h()) {
                                yVarK3.u(yVarK3.i(10) + 1);
                            }
                            yVarK3.t(5);
                            int i46 = AbstractC3991a.f44842m[yVarK3.i(4)];
                            i17 = yVarK3.i(8) + 1;
                            i18 = i46;
                        } else {
                            i17 = -1;
                            i18 = -2147483647;
                        }
                        if (zH) {
                            if (i15 == 0) {
                                i19 = 32000;
                            } else if (i15 == 1) {
                                i19 = 44100;
                            } else {
                                if (i15 != 2) {
                                    throw D.a(null, "Unsupported reference clock code in DTS HD header: " + i15);
                                }
                                i19 = 48000;
                            }
                            int i47 = Q1.x.f9724a;
                            jS = Q1.x.S(i16, 1000000L, i19, RoundingMode.DOWN);
                        } else {
                            jS = -9223372036854775807L;
                        }
                        c(new C0520a("audio/vnd.dts.hd;profile=lbr", i17, i18, i37, jS));
                        this.f16449l = i37;
                        this.f16448j = jS == -9223372036854775807L ? 0L : jS;
                        oVar2.G(0);
                        this.f16444f.e(this.f16451n, oVar2);
                        this.f16445g = 6;
                    }
                    i25 = 4;
                    break;
                case 4:
                    i20 = i25;
                    if (b(oVar, oVar2.f9702a, 6)) {
                        J5.y yVarK4 = AbstractC3991a.k(oVar2.f9702a);
                        yVarK4.t(32);
                        int iT = AbstractC3991a.t(yVarK4, AbstractC3991a.f44847r) + 1;
                        this.f16452o = iT;
                        int i48 = this.f16446h;
                        if (i48 > iT) {
                            int i49 = i48 - iT;
                            this.f16446h = i48 - i49;
                            oVar.G(oVar.f9703b - i49);
                        }
                        this.f16445g = 5;
                    }
                    i25 = i20;
                case 5:
                    if (b(oVar, oVar2.f9702a, this.f16452o)) {
                        byte[] bArr3 = oVar2.f9702a;
                        AtomicInteger atomicInteger = this.f16440b;
                        i20 = i25;
                        J5.y yVarK5 = AbstractC3991a.k(bArr3);
                        int i50 = yVarK5.i(32) == 1078008818 ? 1 : 0;
                        int iT2 = AbstractC3991a.t(yVarK5, AbstractC3991a.f44843n);
                        int i51 = iT2 + 1;
                        if (i50 == 0) {
                            jS2 = -9223372036854775807L;
                            i21 = -2147483647;
                        } else {
                            if (!yVarK5.h()) {
                                throw D.c("Only supports full channel mask-based audio presentation");
                            }
                            int i52 = iT2 - 1;
                            int i53 = ((bArr3[i52] << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (bArr3[iT2] & ForkServer.ERROR);
                            int i54 = Q1.x.f9724a;
                            int i55 = 65535;
                            for (int i56 = 0; i56 < i52; i56++) {
                                byte b13 = bArr3[i56];
                                int i57 = (((b13 & ForkServer.ERROR) >> 4) ^ ((i55 >> 12) & 255)) & 255;
                                int i58 = (i55 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                int[] iArr = Q1.x.f9737o;
                                int i59 = (iArr[i57] ^ i58) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                i55 = (((i59 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) ^ iArr[((b13 & 15) ^ ((i59 >> 12) & 255)) & 255]) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                            }
                            if (i53 != i55) {
                                throw D.a(null, "CRC check failed");
                            }
                            int i60 = yVarK5.i(2);
                            if (i60 != 0) {
                                if (i60 == 1) {
                                    i23 = 480;
                                } else {
                                    if (i60 != 2) {
                                        throw D.a(null, "Unsupported base duration index in DTS UHD header: " + i60);
                                    }
                                    i23 = 384;
                                }
                                i22 = 3;
                            } else {
                                i22 = 3;
                                i23 = 512;
                            }
                            int i61 = (yVarK5.i(i22) + 1) * i23;
                            int i62 = yVarK5.i(2);
                            if (i62 == 0) {
                                i24 = 32000;
                            } else if (i62 == 1) {
                                i24 = 44100;
                            } else {
                                if (i62 != 2) {
                                    throw D.a(null, "Unsupported clock rate index in DTS UHD header: " + i62);
                                }
                                i24 = 48000;
                            }
                            if (yVarK5.h()) {
                                yVarK5.t(36);
                            }
                            i21 = i24 * (1 << yVarK5.i(2));
                            jS2 = Q1.x.S(i61, 1000000L, i24, RoundingMode.DOWN);
                        }
                        int iT3 = 0;
                        for (int i63 = 0; i63 < i50; i63++) {
                            iT3 += AbstractC3991a.t(yVarK5, AbstractC3991a.f44844o);
                        }
                        if (i50 != 0) {
                            atomicInteger.set(AbstractC3991a.t(yVarK5, AbstractC3991a.f44845p));
                        }
                        int iT4 = iT3 + (atomicInteger.get() != 0 ? AbstractC3991a.t(yVarK5, AbstractC3991a.f44846q) : 0) + i51;
                        C0520a c0520a = new C0520a("audio/vnd.dts.uhd;profile=p2", 2, i21, iT4, jS2);
                        if (this.f16450m == 3) {
                            c(c0520a);
                        }
                        this.f16449l = iT4;
                        this.f16448j = jS2 == -9223372036854775807L ? 0L : jS2;
                        oVar2.G(0);
                        this.f16444f.e(this.f16452o, oVar2);
                        this.f16445g = 6;
                        i25 = i20;
                    } else {
                        continue;
                    }
                case 6:
                    int iMin = Math.min(oVar.a(), this.f16449l - this.f16446h);
                    this.f16444f.e(iMin, oVar);
                    int i64 = this.f16446h + iMin;
                    this.f16446h = i64;
                    if (i64 == this.f16449l) {
                        Q1.k.g(this.f16453p != -9223372036854775807L);
                        this.f16444f.a(this.f16453p, this.f16450m == i25 ? 0 : 1, this.f16449l, 0, null);
                        this.f16453p += this.f16448j;
                        this.f16445g = 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // Y2.h
    public final void f(s2.o oVar, T5.B b5) {
        b5.a();
        b5.b();
        this.f16443e = b5.f11474f;
        b5.b();
        this.f16444f = oVar.mo0m(b5.f11473e, 1);
    }

    @Override // Y2.h
    public final void h(boolean z2) {
    }
}
