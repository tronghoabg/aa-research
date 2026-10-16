package s2;

import G5.C0520a;
import N1.D;
import Va.M6;
import android.util.Base64;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;
import qd.C3889d;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3991a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f44831a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f44832b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f44833c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f44834d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f44835e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f44836f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f44837g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f44838h = {69, 87, 104, 121, 139, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f44839i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f44840j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f44841l = {64, 112, 128, 192, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 256, 384, 448, 512, 640, 768, 896, Segment.SHARE_MINIMUM, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f44842m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f44843n = {5, 8, 10, 12};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f44844o = {6, 9, 12, 15};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f44845p = {2, 4, 6, 8};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f44846q = {9, 11, 13, 16};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f44847r = {5, 8, 10, 12};

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f44848s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f44849t = {44100, 48000, 32000};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f44850u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f44851v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f44852w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f44853x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f44854y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i5, int i10) {
        int i11 = -1;
        for (int i12 = 0; i12 < 13; i12++) {
            if (i5 == f44831a[i12]) {
                i11 = i12;
            }
        }
        int i13 = -1;
        for (int i14 = 0; i14 < 16; i14++) {
            if (i10 == f44832b[i14]) {
                i13 = i14;
            }
        }
        if (i5 == -1 || i13 == -1) {
            throw new IllegalArgumentException(R8.v.e(i5, i10, "Invalid sample rate or number of channels: ", ", "));
        }
        return b(2, i11, i13);
    }

    public static byte[] b(int i5, int i10, int i11) {
        return new byte[]{(byte) (((i5 << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & 128) | ((i11 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & ForkServer.ERROR) << 8) | (bArr[10] & ForkServer.ERROR)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean d(Q1.o oVar, J5.p pVar, int i5, J5.n nVar) {
        int i10 = oVar.f9703b;
        long jW = oVar.w();
        long j8 = jW >>> 16;
        if (j8 != i5) {
            return false;
        }
        boolean z2 = (j8 & 1) == 1;
        int i11 = (int) ((jW >> 12) & 15);
        int i12 = (int) ((jW >> 8) & 15);
        int i13 = (int) ((jW >> 4) & 15);
        int i14 = (int) ((jW >> 1) & 7);
        boolean z10 = (jW & 1) == 1;
        if (i13 <= 7) {
            if (i13 != pVar.f5666h - 1) {
                return false;
            }
        } else if (i13 > 10 || pVar.f5666h != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == pVar.f5668j) || z10) {
            return false;
        }
        try {
            long jB = oVar.B();
            if (!z2) {
                jB *= pVar.f5661c;
            }
            nVar.f5655a = jB;
            int iV = v(i11, oVar);
            if (iV == -1 || iV > pVar.f5661c) {
                return false;
            }
            if (i12 != 0) {
                if (i12 > 11) {
                    int i15 = pVar.f5664f;
                    if (i12 != 12) {
                        if (i12 > 14) {
                            return false;
                        }
                        int iA = oVar.A();
                        if (i12 == 14) {
                            iA *= 10;
                        }
                        if (iA != i15) {
                            return false;
                        }
                    } else if (oVar.u() * 1000 != i15) {
                        return false;
                    }
                } else if (i12 != pVar.f5665g) {
                    return false;
                }
            }
            int iU = oVar.u();
            int i16 = oVar.f9703b;
            byte[] bArr = oVar.f9702a;
            int i17 = i16 - 1;
            int i18 = Q1.x.f9724a;
            int i19 = 0;
            for (int i20 = i10; i20 < i17; i20++) {
                i19 = Q1.x.f9738p[i19 ^ (bArr[i20] & ForkServer.ERROR)];
            }
            return iU == i19;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void e(String str, boolean z2) {
        if (!z2) {
            throw D.a(null, str);
        }
    }

    public static void f(long j8, Q1.o oVar, C[] cArr) {
        int i5;
        while (true) {
            if (oVar.a() <= 1) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (oVar.a() == 0) {
                    i5 = -1;
                    break;
                }
                int iU = oVar.u();
                i10 += iU;
                if (iU != 255) {
                    i5 = i10;
                    break;
                }
            }
            int i11 = 0;
            while (true) {
                if (oVar.a() == 0) {
                    i11 = -1;
                    break;
                }
                int iU2 = oVar.u();
                i11 += iU2;
                if (iU2 != 255) {
                    break;
                }
            }
            int i12 = oVar.f9703b + i11;
            if (i11 == -1 || i11 > oVar.a()) {
                Q1.k.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i12 = oVar.f9704c;
            } else if (i5 == 4 && i11 >= 8) {
                int iU3 = oVar.u();
                int iA = oVar.A();
                int iH = iA == 49 ? oVar.h() : 0;
                int iU4 = oVar.u();
                if (iA == 47) {
                    oVar.H(1);
                }
                boolean z2 = iU3 == 181 && (iA == 49 || iA == 47) && iU4 == 3;
                if (iA == 49) {
                    z2 &= iH == 1195456820;
                }
                if (z2) {
                    g(j8, oVar, cArr);
                }
            }
            oVar.G(i12);
        }
    }

    public static void g(long j8, Q1.o oVar, C[] cArr) {
        int iU = oVar.u();
        if ((iU & 64) != 0) {
            oVar.H(1);
            int i5 = (iU & 31) * 3;
            int i10 = oVar.f9703b;
            for (C c10 : cArr) {
                oVar.G(i10);
                c10.e(i5, oVar);
                Q1.k.g(j8 != -9223372036854775807L);
                c10.a(j8, 1, i5, 0, null);
            }
        }
    }

    public static int h(int i5, int i10) {
        int i11 = i10 / 2;
        if (i5 < 0 || i5 >= 3 || i10 < 0 || i11 >= 19) {
            return -1;
        }
        int i12 = f44834d[i5];
        if (i12 == 44100) {
            return ((i10 % 2) + f44838h[i11]) * 2;
        }
        int i13 = f44837g[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static void i(int i5, Q1.o oVar) {
        oVar.D(7);
        byte[] bArr = oVar.f9702a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i5 >> 16) & 255);
        bArr[5] = (byte) ((i5 >> 8) & 255);
        bArr[6] = (byte) (i5 & 255);
    }

    public static int j(int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!((i5 & (-2097152)) == -2097152) || (i10 = (i5 >>> 19) & 3) == 1 || (i11 = (i5 >>> 17) & 3) == 0 || (i12 = (i5 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i5 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = f44849t[i13];
        if (i10 == 2) {
            i14 /= 2;
        } else if (i10 == 0) {
            i14 /= 4;
        }
        int i15 = (i5 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f44850u[i12 - 1] : f44851v[i12 - 1]) * 12) / i14) + i15) * 4;
        }
        int i16 = i10 == 3 ? i11 == 2 ? f44852w[i12 - 1] : f44853x[i12 - 1] : f44854y[i12 - 1];
        if (i10 == 3) {
            return M6.C(i16, 144, i14, i15);
        }
        return M6.C(i11 == 1 ? 72 : 144, i16, i14, i15);
    }

    public static J5.y k(byte[] bArr) {
        byte b5 = bArr[0];
        if (b5 == 127 || b5 == 100 || b5 == 64 || b5 == 113) {
            return new J5.y(bArr, bArr.length, 1, (byte) 0);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = bArrCopyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i5 = 0; i5 < bArrCopyOf.length - 1; i5 += 2) {
                byte b11 = bArrCopyOf[i5];
                int i10 = i5 + 1;
                bArrCopyOf[i5] = bArrCopyOf[i10];
                bArrCopyOf[i10] = b11;
            }
        }
        J5.y yVar = new J5.y(bArrCopyOf, bArrCopyOf.length, 1, (byte) 0);
        if (bArrCopyOf[0] == 31) {
            J5.y yVar2 = new J5.y(bArrCopyOf, bArrCopyOf.length, 1, (byte) 0);
            while (yVar2.b() >= 16) {
                yVar2.t(2);
                int i11 = yVar2.i(14) & 16383;
                int iMin = Math.min(8 - yVar.f5697d, 14);
                int i12 = yVar.f5697d;
                int i13 = (8 - i12) - iMin;
                byte[] bArr2 = yVar.f5695b;
                int i14 = yVar.f5696c;
                byte b12 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                bArr2[i14] = b12;
                int i15 = 14 - iMin;
                bArr2[i14] = (byte) (b12 | ((i11 >>> i15) << i13));
                int i16 = i14 + 1;
                while (i15 > 8) {
                    yVar.f5695b[i16] = (byte) (i11 >>> (i15 - 8));
                    i15 -= 8;
                    i16++;
                }
                int i17 = 8 - i15;
                byte[] bArr3 = yVar.f5695b;
                byte b13 = (byte) (bArr3[i16] & ((1 << i17) - 1));
                bArr3[i16] = b13;
                bArr3[i16] = (byte) (((i11 & ((1 << i15) - 1)) << i17) | b13);
                yVar.t(14);
                yVar.a();
            }
        }
        yVar.o(bArrCopyOf.length, bArrCopyOf);
        return yVar;
    }

    public static long l(byte b5, byte b10) {
        int i5;
        int i10 = b5 & ForkServer.ERROR;
        int i11 = b5 & 3;
        if (i11 != 0) {
            i5 = 2;
            if (i11 != 1 && i11 != 2) {
                i5 = b10 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i5 = 1;
        }
        int i12 = i10 >> 3;
        return i5 * (i12 >= 16 ? UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL << r6 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int m(J5.y yVar) throws D {
        int i5 = yVar.i(4);
        if (i5 == 15) {
            if (yVar.b() >= 24) {
                return yVar.i(24);
            }
            throw D.a(null, "AAC header insufficient data");
        }
        if (i5 < 13) {
            return f44831a[i5];
        }
        throw D.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static int n(int i5) {
        int i10 = 0;
        while (i5 > 0) {
            i10++;
            i5 >>>= 1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s2.C3992b o(J5.y r21) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.AbstractC3991a.o(J5.y):s2.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static G5.C0522c p(J5.y r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = s2.AbstractC3991a.f44839i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            G5.c r1 = new G5.c
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.AbstractC3991a.p(J5.y):G5.c");
    }

    public static C0520a q(J5.y yVar, boolean z2) {
        int i5 = yVar.i(5);
        if (i5 == 31) {
            i5 = yVar.i(6) + 32;
        }
        int iM = m(yVar);
        int i10 = yVar.i(4);
        String strG = AbstractC3256n.g(i5, "mp4a.40.");
        if (i5 == 5 || i5 == 29) {
            iM = m(yVar);
            int i11 = yVar.i(5);
            if (i11 == 31) {
                i11 = yVar.i(6) + 32;
            }
            i5 = i11;
            if (i5 == 22) {
                i10 = yVar.i(4);
            }
        }
        if (z2) {
            if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4 && i5 != 6 && i5 != 7 && i5 != 17) {
                switch (i5) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw D.c("Unsupported audio object type: " + i5);
                }
            }
            if (yVar.h()) {
                Q1.k.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (yVar.h()) {
                yVar.t(14);
            }
            boolean zH = yVar.h();
            if (i10 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i5 == 6 || i5 == 20) {
                yVar.t(3);
            }
            if (zH) {
                if (i5 == 22) {
                    yVar.t(16);
                }
                if (i5 == 17 || i5 == 19 || i5 == 20 || i5 == 23) {
                    yVar.t(3);
                }
                yVar.t(1);
            }
            switch (i5) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i12 = yVar.i(2);
                    if (i12 == 2 || i12 == 3) {
                        throw D.c("Unsupported epConfig: " + i12);
                    }
            }
        }
        int i13 = f44832b[i10];
        if (i13 != -1) {
            return new C0520a(iM, i13, strG);
        }
        throw D.a(null, null);
    }

    public static void r(J5.y yVar, W1.g gVar) {
        int i5 = yVar.i(5);
        yVar.t(2);
        if (yVar.h()) {
            yVar.t(5);
        }
        if (i5 >= 7 && i5 <= 10) {
            yVar.s();
        }
        if (yVar.h()) {
            int i10 = yVar.i(3);
            if (gVar.f14961b == -1 && i5 >= 0 && i5 <= 15 && (i10 == 0 || i10 == 1)) {
                gVar.f14961b = i5;
            }
            if (yVar.h()) {
                y(yVar);
            }
        }
    }

    public static void s(J5.y yVar, W1.g gVar) {
        yVar.t(2);
        boolean zH = yVar.h();
        int i5 = yVar.i(8);
        for (int i10 = 0; i10 < i5; i10++) {
            yVar.t(2);
            if (yVar.h()) {
                yVar.t(5);
            }
            if (zH) {
                yVar.t(24);
            } else {
                if (yVar.h()) {
                    if (!yVar.h()) {
                        yVar.t(4);
                    }
                    gVar.f14962c = yVar.i(6) + 1;
                }
                yVar.t(4);
            }
        }
        if (yVar.h()) {
            yVar.t(3);
            if (yVar.h()) {
                y(yVar);
            }
        }
    }

    public static int t(J5.y yVar, int[] iArr) {
        int i5 = 0;
        for (int i10 = 0; i10 < 3 && yVar.h(); i10++) {
            i5++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i5; i12++) {
            i11 += 1 << iArr[i12];
        }
        return yVar.i(iArr[i5]) + i11;
    }

    public static N1.B u(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str = (String) list.get(i5);
            int i10 = Q1.x.f9724a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                Q1.k.w("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(E2.a.c(new Q1.o(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e7) {
                    Q1.k.x("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new J2.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new N1.B(arrayList);
    }

    public static int v(int i5, Q1.o oVar) {
        switch (i5) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i5 - 2);
            case 6:
                return oVar.u() + 1;
            case 7:
                return oVar.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i5 - 8);
            default:
                return -1;
        }
    }

    public static Y2.B w(Q1.o oVar) {
        oVar.H(1);
        int iX = oVar.x();
        long j8 = oVar.f9703b + iX;
        int i5 = iX / 18;
        long[] jArrCopyOf = new long[i5];
        long[] jArrCopyOf2 = new long[i5];
        int i10 = 0;
        while (true) {
            if (i10 >= i5) {
                break;
            }
            long jO = oVar.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jO;
            jArrCopyOf2[i10] = oVar.o();
            oVar.H(2);
            i10++;
        }
        oVar.H((int) (j8 - oVar.f9703b));
        return new Y2.B(jArrCopyOf, false, jArrCopyOf2, 25);
    }

    public static C3889d x(Q1.o oVar, boolean z2, boolean z10) throws D {
        if (z2) {
            z(3, oVar, false);
        }
        oVar.s((int) oVar.l(), StandardCharsets.UTF_8);
        long jL = oVar.l();
        String[] strArr = new String[(int) jL];
        for (int i5 = 0; i5 < jL; i5++) {
            strArr[i5] = oVar.s((int) oVar.l(), StandardCharsets.UTF_8);
        }
        if (z10 && (oVar.u() & 1) == 0) {
            throw D.a(null, "framing bit expected to be set");
        }
        return new C3889d(strArr);
    }

    public static void y(J5.y yVar) throws D {
        int i5 = yVar.i(6);
        if (i5 < 2 || i5 > 42) {
            throw D.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i5)));
        }
        yVar.t(i5 * 8);
    }

    public static boolean z(int i5, Q1.o oVar, boolean z2) throws D {
        if (oVar.a() < 7) {
            if (z2) {
                return false;
            }
            throw D.a(null, "too short header: " + oVar.a());
        }
        if (oVar.u() != i5) {
            if (z2) {
                return false;
            }
            throw D.a(null, "expected header type " + Integer.toHexString(i5));
        }
        if (oVar.u() == 118 && oVar.u() == 111 && oVar.u() == 114 && oVar.u() == 98 && oVar.u() == 105 && oVar.u() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw D.a(null, "expected characters 'vorbis'");
    }
}
