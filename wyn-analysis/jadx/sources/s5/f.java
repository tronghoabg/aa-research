package S5;

import E5.S;
import E5.T;
import E5.o0;
import J5.y;
import J5.z;
import N2.i;
import N2.j;
import S3.l;
import S3.s;
import java.util.ArrayList;
import java.util.Arrays;
import l8.AbstractC3409K;
import s8.C4026b;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class f extends i {

    /* renamed from: o, reason: collision with root package name */
    public j f11021o;

    /* renamed from: p, reason: collision with root package name */
    public int f11022p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11023q;

    /* renamed from: r, reason: collision with root package name */
    public z f11024r;

    /* renamed from: s, reason: collision with root package name */
    public l f11025s;

    @Override // N2.i
    public final void a(long j8) {
        this.f8368d = j8;
        this.f11023q = j8 != 0;
        z zVar = this.f11024r;
        this.f11022p = zVar != null ? zVar.f5703e : 0;
    }

    @Override // N2.i
    public final long c(Y4.b bVar) {
        byte b5 = bVar.f16679a[0];
        if ((b5 & 1) == 1) {
            return -1L;
        }
        j jVar = this.f11021o;
        AbstractC4256a.j(jVar);
        boolean z2 = ((C4026b[]) jVar.f8382e)[(b5 >> 1) & (255 >>> (8 - jVar.f8379b))].f45322b;
        z zVar = (z) jVar.f8380c;
        int i5 = !z2 ? zVar.f5703e : zVar.f5704f;
        long j8 = this.f11023q ? (this.f11022p + i5) / 4 : 0;
        byte[] bArr = bVar.f16679a;
        int length = bArr.length;
        int i10 = bVar.f16681c + 4;
        if (length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            bVar.y(bArrCopyOf.length, bArrCopyOf);
        } else {
            bVar.z(i10);
        }
        byte[] bArr2 = bVar.f16679a;
        int i11 = bVar.f16681c;
        bArr2[i11 - 4] = (byte) (j8 & 255);
        bArr2[i11 - 3] = (byte) ((j8 >>> 8) & 255);
        bArr2[i11 - 2] = (byte) ((j8 >>> 16) & 255);
        bArr2[i11 - 1] = (byte) ((j8 >>> 24) & 255);
        this.f11023q = true;
        this.f11022p = i5;
        return j8;
    }

    @Override // N2.i
    public final boolean e(Y4.b bVar, long j8, s sVar) throws o0 {
        j jVar;
        z zVar;
        int i5;
        z zVar2;
        int i10;
        z zVar3;
        if (this.f11021o != null) {
            ((T) sVar.f11009b).getClass();
            return false;
        }
        z zVar4 = this.f11024r;
        int i11 = 1;
        int i12 = 4;
        if (zVar4 == null) {
            android.support.v4.media.session.b.v0(1, bVar, false);
            bVar.i();
            int iQ = bVar.q();
            int i13 = bVar.i();
            int iF = bVar.f();
            int i14 = iF <= 0 ? -1 : iF;
            int iF2 = bVar.f();
            int i15 = iF2 <= 0 ? -1 : iF2;
            bVar.f();
            int iQ2 = bVar.q();
            int iPow = (int) Math.pow(2.0d, iQ2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iQ2 & 240) >> 4);
            bVar.q();
            this.f11024r = new z(iQ, i13, i14, i15, iPow, iPow2, Arrays.copyOf(bVar.f16679a, bVar.f16681c));
        } else {
            l lVar = this.f11025s;
            if (lVar == null) {
                this.f11025s = android.support.v4.media.session.b.p0(bVar, true, true);
            } else {
                int i16 = bVar.f16681c;
                byte[] bArr = new byte[i16];
                System.arraycopy(bVar.f16679a, 0, bArr, 0, i16);
                int i17 = 5;
                android.support.v4.media.session.b.v0(5, bVar, false);
                int iQ3 = bVar.q() + 1;
                y yVar = new y(bVar.f16679a, 0);
                int i18 = 8;
                yVar.t(bVar.f16680b * 8);
                int i19 = 0;
                while (i19 < iQ3) {
                    int i20 = i18;
                    if (yVar.i(24) != 5653314) {
                        throw o0.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((yVar.f5697d * 8) + yVar.f5698e), null);
                    }
                    int i21 = yVar.i(16);
                    int i22 = yVar.i(24);
                    long[] jArr = new long[i22];
                    long jFloor = 0;
                    if (yVar.h()) {
                        i5 = i11;
                        zVar2 = zVar4;
                        int i23 = yVar.i(i17) + 1;
                        int i24 = 0;
                        while (i24 < i22) {
                            int i25 = yVar.i(android.support.v4.media.session.b.h0(i22 - i24));
                            int i26 = 0;
                            while (i26 < i25 && i24 < i22) {
                                jArr[i24] = i23;
                                i24++;
                                i26++;
                                bArr = bArr;
                            }
                            i23++;
                            bArr = bArr;
                        }
                        i10 = 4;
                    } else {
                        boolean zH = yVar.h();
                        i5 = i11;
                        int i27 = 0;
                        while (i27 < i22) {
                            if (!zH) {
                                zVar3 = zVar4;
                                jArr[i27] = yVar.i(i17) + 1;
                            } else if (yVar.h()) {
                                zVar3 = zVar4;
                                jArr[i27] = yVar.i(i17) + 1;
                            } else {
                                zVar3 = zVar4;
                                jArr[i27] = 0;
                            }
                            i27++;
                            zVar4 = zVar3;
                            i12 = 4;
                        }
                        zVar2 = zVar4;
                        i10 = i12;
                    }
                    byte[] bArr2 = bArr;
                    int i28 = yVar.i(i10);
                    if (i28 > 2) {
                        throw o0.a("lookup type greater than 2 not decodable: " + i28, null);
                    }
                    int i29 = i5;
                    if (i28 == i29 || i28 == 2) {
                        yVar.t(32);
                        yVar.t(32);
                        int i30 = yVar.i(i10) + i29;
                        yVar.t(i29);
                        if (i28 != i29) {
                            jFloor = i22 * i21;
                        } else if (i21 != 0) {
                            jFloor = (long) Math.floor(Math.pow(i22, 1.0d / i21));
                        }
                        yVar.t((int) (i30 * jFloor));
                    }
                    i19++;
                    i18 = i20;
                    zVar4 = zVar2;
                    bArr = bArr2;
                    i11 = 1;
                    i12 = 4;
                    i17 = 5;
                }
                z zVar5 = zVar4;
                byte[] bArr3 = bArr;
                int i31 = i18;
                int i32 = yVar.i(6) + 1;
                for (int i33 = 0; i33 < i32; i33++) {
                    if (yVar.i(16) != 0) {
                        throw o0.a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i34 = 1;
                int i35 = yVar.i(6) + 1;
                int i36 = 0;
                while (true) {
                    int i37 = 3;
                    if (i36 < i35) {
                        int i38 = yVar.i(16);
                        if (i38 == 0) {
                            int i39 = i31;
                            yVar.t(i39);
                            yVar.t(16);
                            yVar.t(16);
                            yVar.t(6);
                            yVar.t(i39);
                            int i40 = yVar.i(4) + 1;
                            int i41 = 0;
                            while (i41 < i40) {
                                yVar.t(i39);
                                i41++;
                                i39 = 8;
                            }
                        } else {
                            if (i38 != i34) {
                                throw o0.a("floor type greater than 1 not decodable: " + i38, null);
                            }
                            int i42 = yVar.i(5);
                            int[] iArr = new int[i42];
                            int i43 = -1;
                            for (int i44 = 0; i44 < i42; i44++) {
                                int i45 = yVar.i(4);
                                iArr[i44] = i45;
                                if (i45 > i43) {
                                    i43 = i45;
                                }
                            }
                            int i46 = i43 + 1;
                            int[] iArr2 = new int[i46];
                            int i47 = 0;
                            while (i47 < i46) {
                                iArr2[i47] = yVar.i(i37) + 1;
                                int i48 = yVar.i(2);
                                int i49 = i31;
                                if (i48 > 0) {
                                    yVar.t(i49);
                                }
                                int i50 = 0;
                                for (int i51 = 1; i50 < (i51 << i48); i51 = 1) {
                                    yVar.t(i49);
                                    i50++;
                                    i49 = 8;
                                }
                                i47++;
                                i31 = 8;
                                i37 = 3;
                            }
                            yVar.t(2);
                            int i52 = yVar.i(4);
                            int i53 = 0;
                            int i54 = 0;
                            for (int i55 = 0; i55 < i42; i55++) {
                                i53 += iArr2[iArr[i55]];
                                while (i54 < i53) {
                                    yVar.t(i52);
                                    i54++;
                                }
                            }
                        }
                        i36++;
                        i31 = 8;
                        i34 = 1;
                    } else {
                        int i56 = yVar.i(6) + 1;
                        for (int i57 = 0; i57 < i56; i57++) {
                            if (yVar.i(16) > 2) {
                                throw o0.a("residueType greater than 2 is not decodable", null);
                            }
                            yVar.t(24);
                            yVar.t(24);
                            yVar.t(24);
                            int i58 = yVar.i(6) + 1;
                            int i59 = 8;
                            yVar.t(8);
                            int[] iArr3 = new int[i58];
                            for (int i60 = 0; i60 < i58; i60++) {
                                iArr3[i60] = ((yVar.h() ? yVar.i(5) : 0) * 8) + yVar.i(3);
                            }
                            int i61 = 0;
                            while (i61 < i58) {
                                int i62 = 0;
                                while (i62 < i59) {
                                    if ((iArr3[i61] & (1 << i62)) != 0) {
                                        yVar.t(i59);
                                    }
                                    i62++;
                                    i59 = 8;
                                }
                                i61++;
                                i59 = 8;
                            }
                        }
                        int i63 = yVar.i(6) + 1;
                        int i64 = 0;
                        while (i64 < i63) {
                            int i65 = yVar.i(16);
                            if (i65 != 0) {
                                AbstractC4256a.o("VorbisUtil", "mapping type other than 0 not supported: " + i65);
                                zVar = zVar5;
                            } else {
                                int i66 = yVar.h() ? yVar.i(4) + 1 : 1;
                                boolean zH2 = yVar.h();
                                zVar = zVar5;
                                int i67 = zVar.f5699a;
                                if (zH2) {
                                    int i68 = yVar.i(8) + 1;
                                    for (int i69 = 0; i69 < i68; i69++) {
                                        int i70 = i67 - 1;
                                        yVar.t(android.support.v4.media.session.b.h0(i70));
                                        yVar.t(android.support.v4.media.session.b.h0(i70));
                                    }
                                }
                                if (yVar.i(2) != 0) {
                                    throw o0.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i66 > 1) {
                                    for (int i71 = 0; i71 < i67; i71++) {
                                        yVar.t(4);
                                    }
                                }
                                for (int i72 = 0; i72 < i66; i72++) {
                                    yVar.t(8);
                                    yVar.t(8);
                                    yVar.t(8);
                                }
                            }
                            i64++;
                            zVar5 = zVar;
                        }
                        z zVar6 = zVar5;
                        int i73 = yVar.i(6);
                        int i74 = i73 + 1;
                        C4026b[] c4026bArr = new C4026b[i74];
                        for (int i75 = 0; i75 < i74; i75++) {
                            boolean zH3 = yVar.h();
                            yVar.i(16);
                            yVar.i(16);
                            yVar.i(8);
                            c4026bArr[i75] = new C4026b(zH3, 1);
                        }
                        if (!yVar.h()) {
                            throw o0.a("framing bit after modes not set as expected", null);
                        }
                        jVar = new j(zVar6, lVar, bArr3, c4026bArr, android.support.v4.media.session.b.h0(i73));
                    }
                }
            }
        }
        jVar = null;
        this.f11021o = jVar;
        if (jVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        z zVar7 = (z) jVar.f8380c;
        arrayList.add(zVar7.f5705g);
        arrayList.add((byte[]) jVar.f8378a);
        W5.c cVarM0 = android.support.v4.media.session.b.m0(AbstractC3409K.k((String[]) ((l) jVar.f8381d).f10967a));
        S s10 = new S();
        s10.k = "audio/vorbis";
        s10.f3200f = zVar7.f5702d;
        s10.f3201g = zVar7.f5701c;
        s10.f3217x = zVar7.f5699a;
        s10.f3218y = zVar7.f5700b;
        s10.f3206m = arrayList;
        s10.f3203i = cVarM0;
        sVar.f11009b = new T(s10);
        return true;
    }

    @Override // N2.i
    public final void f(boolean z2) {
        super.f(z2);
        if (z2) {
            this.f11021o = null;
            this.f11024r = null;
            this.f11025s = null;
        }
        this.f11022p = 0;
        this.f11023q = false;
    }
}
