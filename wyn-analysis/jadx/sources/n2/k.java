package N2;

import J5.y;
import J5.z;
import N1.B;
import N1.C;
import N1.C0764m;
import N1.C0765n;
import N1.D;
import Q1.o;
import java.util.ArrayList;
import java.util.Arrays;
import l8.AbstractC3409K;
import qd.C3889d;
import s2.AbstractC3991a;
import s8.C4026b;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: o, reason: collision with root package name */
    public j f8383o;

    /* renamed from: p, reason: collision with root package name */
    public int f8384p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8385q;

    /* renamed from: r, reason: collision with root package name */
    public z f8386r;

    /* renamed from: s, reason: collision with root package name */
    public C3889d f8387s;

    @Override // N2.i
    public final void a(long j8) {
        this.f8368d = j8;
        this.f8385q = j8 != 0;
        z zVar = this.f8386r;
        this.f8384p = zVar != null ? zVar.f5703e : 0;
    }

    @Override // N2.i
    public final long b(o oVar) {
        byte b5 = oVar.f9702a[0];
        if ((b5 & 1) == 1) {
            return -1L;
        }
        j jVar = this.f8383o;
        Q1.k.h(jVar);
        boolean z2 = ((C4026b[]) jVar.f8382e)[(b5 >> 1) & (255 >>> (8 - jVar.f8379b))].f45322b;
        z zVar = (z) jVar.f8380c;
        int i5 = !z2 ? zVar.f5703e : zVar.f5704f;
        long j8 = this.f8385q ? (this.f8384p + i5) / 4 : 0;
        byte[] bArr = oVar.f9702a;
        int length = bArr.length;
        int i10 = oVar.f9704c + 4;
        if (length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            oVar.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            oVar.F(i10);
        }
        byte[] bArr2 = oVar.f9702a;
        int i11 = oVar.f9704c;
        bArr2[i11 - 4] = (byte) (j8 & 255);
        bArr2[i11 - 3] = (byte) ((j8 >>> 8) & 255);
        bArr2[i11 - 2] = (byte) ((j8 >>> 16) & 255);
        bArr2[i11 - 1] = (byte) ((j8 >>> 24) & 255);
        this.f8385q = true;
        this.f8384p = i5;
        return j8;
    }

    @Override // N2.i
    public final boolean d(o oVar, long j8, S3.c cVar) throws D {
        j jVar;
        int i5;
        if (this.f8383o != null) {
            ((C0765n) cVar.f10936b).getClass();
            return false;
        }
        z zVar = this.f8386r;
        int i10 = 1;
        int i11 = 4;
        if (zVar == null) {
            AbstractC3991a.z(1, oVar, false);
            oVar.m();
            int iU = oVar.u();
            int iM = oVar.m();
            int iJ = oVar.j();
            int i12 = iJ <= 0 ? -1 : iJ;
            int iJ2 = oVar.j();
            int i13 = iJ2 <= 0 ? -1 : iJ2;
            oVar.j();
            int iU2 = oVar.u();
            int iPow = (int) Math.pow(2.0d, iU2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iU2 & 240) >> 4);
            oVar.u();
            this.f8386r = new z(iU, iM, i12, i13, iPow, iPow2, Arrays.copyOf(oVar.f9702a, oVar.f9704c));
        } else {
            C3889d c3889d = this.f8387s;
            if (c3889d == null) {
                this.f8387s = AbstractC3991a.x(oVar, true, true);
            } else {
                int i14 = oVar.f9704c;
                byte[] bArr = new byte[i14];
                System.arraycopy(oVar.f9702a, 0, bArr, 0, i14);
                int i15 = 5;
                AbstractC3991a.z(5, oVar, false);
                int iU3 = oVar.u() + 1;
                y yVar = new y(oVar.f9702a, 5);
                int i16 = 8;
                yVar.t(oVar.f9703b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 2;
                    int i19 = 16;
                    if (i17 < iU3) {
                        int i20 = i16;
                        if (yVar.i(24) != 5653314) {
                            throw D.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((yVar.f5697d * 8) + yVar.f5698e));
                        }
                        int i21 = yVar.i(16);
                        int i22 = yVar.i(24);
                        if (yVar.h()) {
                            yVar.t(5);
                            for (int i23 = 0; i23 < i22; i23 += yVar.i(AbstractC3991a.n(i22 - i23))) {
                            }
                        } else {
                            boolean zH = yVar.h();
                            for (int i24 = 0; i24 < i22; i24++) {
                                if (!zH) {
                                    yVar.t(5);
                                } else if (yVar.h()) {
                                    yVar.t(5);
                                }
                            }
                        }
                        int i25 = yVar.i(4);
                        if (i25 > 2) {
                            throw D.a(null, "lookup type greater than 2 not decodable: " + i25);
                        }
                        if (i25 == 1 || i25 == 2) {
                            yVar.t(32);
                            yVar.t(32);
                            int i26 = yVar.i(4) + 1;
                            yVar.t(1);
                            yVar.t((int) ((i25 == 1 ? i21 != 0 ? (long) Math.floor(Math.pow(i22, 1.0d / i21)) : 0L : i21 * i22) * i26));
                        }
                        i17++;
                        i16 = i20;
                    } else {
                        int i27 = i16;
                        int i28 = 6;
                        int i29 = yVar.i(6) + 1;
                        for (int i30 = 0; i30 < i29; i30++) {
                            if (yVar.i(16) != 0) {
                                throw D.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i31 = yVar.i(6) + 1;
                        int i32 = 0;
                        while (true) {
                            int i33 = 3;
                            if (i32 < i31) {
                                int i34 = yVar.i(i19);
                                if (i34 == 0) {
                                    int i35 = i27;
                                    i5 = i10;
                                    yVar.t(i35);
                                    yVar.t(16);
                                    yVar.t(16);
                                    yVar.t(6);
                                    yVar.t(i35);
                                    int i36 = yVar.i(4) + 1;
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        yVar.t(i35);
                                        i37++;
                                        i35 = 8;
                                    }
                                } else {
                                    if (i34 != i10) {
                                        throw D.a(null, "floor type greater than 1 not decodable: " + i34);
                                    }
                                    int i38 = yVar.i(i15);
                                    i5 = i10;
                                    int[] iArr = new int[i38];
                                    int i39 = -1;
                                    for (int i40 = 0; i40 < i38; i40++) {
                                        int i41 = yVar.i(i11);
                                        iArr[i40] = i41;
                                        if (i41 > i39) {
                                            i39 = i41;
                                        }
                                    }
                                    int i42 = i39 + 1;
                                    int[] iArr2 = new int[i42];
                                    int i43 = 0;
                                    while (i43 < i42) {
                                        iArr2[i43] = yVar.i(i33) + 1;
                                        int i44 = yVar.i(i18);
                                        int i45 = i27;
                                        if (i44 > 0) {
                                            yVar.t(i45);
                                        }
                                        int i46 = 0;
                                        while (i46 < (i5 << i44)) {
                                            yVar.t(i45);
                                            i46++;
                                            i45 = 8;
                                        }
                                        i43++;
                                        i27 = 8;
                                        i18 = 2;
                                        i33 = 3;
                                    }
                                    yVar.t(i18);
                                    int i47 = yVar.i(4);
                                    int i48 = 0;
                                    int i49 = 0;
                                    for (int i50 = 0; i50 < i38; i50++) {
                                        i48 += iArr2[iArr[i50]];
                                        while (i49 < i48) {
                                            yVar.t(i47);
                                            i49++;
                                        }
                                    }
                                }
                                i32++;
                                i10 = i5;
                                i27 = 8;
                                i28 = 6;
                                i18 = 2;
                                i11 = 4;
                                i19 = 16;
                                i15 = 5;
                            } else {
                                int i51 = i10;
                                int i52 = yVar.i(i28) + 1;
                                int i53 = 0;
                                while (i53 < i52) {
                                    if (yVar.i(16) > 2) {
                                        throw D.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    yVar.t(24);
                                    yVar.t(24);
                                    yVar.t(24);
                                    int i54 = yVar.i(i28) + 1;
                                    int i55 = 8;
                                    yVar.t(8);
                                    int[] iArr3 = new int[i54];
                                    for (int i56 = 0; i56 < i54; i56++) {
                                        iArr3[i56] = ((yVar.h() ? yVar.i(5) : 0) * 8) + yVar.i(3);
                                    }
                                    int i57 = 0;
                                    while (i57 < i54) {
                                        int i58 = 0;
                                        while (i58 < i55) {
                                            if ((iArr3[i57] & (i51 << i58)) != 0) {
                                                yVar.t(i55);
                                            }
                                            i58++;
                                            i55 = 8;
                                        }
                                        i57++;
                                        i55 = 8;
                                    }
                                    i53++;
                                    i28 = 6;
                                }
                                int i59 = yVar.i(i28) + 1;
                                int i60 = 0;
                                while (i60 < i59) {
                                    int i61 = yVar.i(16);
                                    if (i61 != 0) {
                                        Q1.k.k("VorbisUtil", "mapping type other than 0 not supported: " + i61);
                                    } else {
                                        int i62 = yVar.h() ? yVar.i(4) + 1 : i51;
                                        boolean zH2 = yVar.h();
                                        int i63 = zVar.f5699a;
                                        if (zH2) {
                                            int i64 = yVar.i(8) + 1;
                                            for (int i65 = 0; i65 < i64; i65++) {
                                                int i66 = i63 - 1;
                                                yVar.t(AbstractC3991a.n(i66));
                                                yVar.t(AbstractC3991a.n(i66));
                                            }
                                        }
                                        if (yVar.i(2) != 0) {
                                            throw D.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i62 > i51) {
                                            for (int i67 = 0; i67 < i63; i67++) {
                                                yVar.t(4);
                                            }
                                        }
                                        for (int i68 = 0; i68 < i62; i68++) {
                                            yVar.t(8);
                                            yVar.t(8);
                                            yVar.t(8);
                                        }
                                    }
                                    i60++;
                                    i51 = 1;
                                }
                                int i69 = yVar.i(6);
                                int i70 = i69 + 1;
                                C4026b[] c4026bArr = new C4026b[i70];
                                for (int i71 = 0; i71 < i70; i71++) {
                                    boolean zH3 = yVar.h();
                                    yVar.i(16);
                                    yVar.i(16);
                                    yVar.i(8);
                                    c4026bArr[i71] = new C4026b(zH3, 6);
                                }
                                if (!yVar.h()) {
                                    throw D.a(null, "framing bit after modes not set as expected");
                                }
                                jVar = new j(zVar, c3889d, bArr, c4026bArr, AbstractC3991a.n(i69));
                            }
                        }
                    }
                }
            }
        }
        jVar = null;
        this.f8383o = jVar;
        if (jVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        z zVar2 = (z) jVar.f8380c;
        arrayList.add(zVar2.f5705g);
        arrayList.add((byte[]) jVar.f8378a);
        B bU = AbstractC3991a.u(AbstractC3409K.k(((C3889d) jVar.f8381d).f44222b));
        C0764m c0764m = new C0764m();
        c0764m.f8194m = C.m("audio/vorbis");
        c0764m.f8190h = zVar2.f5702d;
        c0764m.f8191i = zVar2.f5701c;
        c0764m.f8173B = zVar2.f5699a;
        c0764m.f8174C = zVar2.f5700b;
        c0764m.f8197p = arrayList;
        c0764m.k = bU;
        cVar.f10936b = new C0765n(c0764m);
        return true;
    }

    @Override // N2.i
    public final void f(boolean z2) {
        super.f(z2);
        if (z2) {
            this.f8383o = null;
            this.f8386r = null;
            this.f8387s = null;
        }
        this.f8384p = 0;
        this.f8385q = false;
    }
}
