package G5;

import E5.o0;
import Va.M6;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;
import u6.AbstractC4256a;

/* renamed from: G5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0521b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4387a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4388b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4389c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4390d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f4391e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f4392f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f4393g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f4394h = {69, 87, 104, 121, 139, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f4395i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f4396j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f4397l = {64, 112, 128, 192, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 256, 384, 448, 512, 640, 768, 896, Segment.SHARE_MINIMUM, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f4398m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f4399n = {44100, 48000, 32000};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f4400o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f4401p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f4402q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f4403r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f4404s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & ForkServer.ERROR) << 8) | (bArr[10] & ForkServer.ERROR)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static int b(int i5, int i10) {
        int i11 = i10 / 2;
        if (i5 < 0 || i5 >= 3 || i10 < 0 || i11 >= 19) {
            return -1;
        }
        int i12 = f4390d[i5];
        if (i12 == 44100) {
            return ((i10 % 2) + f4394h[i11]) * 2;
        }
        int i13 = f4393g[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static void c(int i5, Y4.b bVar) {
        bVar.x(7);
        byte[] bArr = bVar.f16679a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i5 >> 16) & 255);
        bArr[5] = (byte) ((i5 >> 8) & 255);
        bArr[6] = (byte) (i5 & 255);
    }

    public static int d(int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!((i5 & (-2097152)) == -2097152) || (i10 = (i5 >>> 19) & 3) == 1 || (i11 = (i5 >>> 17) & 3) == 0 || (i12 = (i5 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i5 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = f4399n[i13];
        if (i10 == 2) {
            i14 /= 2;
        } else if (i10 == 0) {
            i14 /= 4;
        }
        int i15 = (i5 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f4400o[i12 - 1] : f4401p[i12 - 1]) * 12) / i14) + i15) * 4;
        }
        int i16 = i10 == 3 ? i11 == 2 ? f4402q[i12 - 1] : f4403r[i12 - 1] : f4404s[i12 - 1];
        if (i10 == 3) {
            return M6.C(i16, 144, i14, i15);
        }
        return M6.C(i11 == 1 ? 72 : 144, i16, i14, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static G5.C0522c e(J5.y r9) {
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
            int[] r8 = G5.AbstractC0521b.f4395i
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
        throw new UnsupportedOperationException("Method not decompiled: G5.AbstractC0521b.e(J5.y):G5.c");
    }

    public static C0520a f(J5.y yVar, boolean z2) throws o0 {
        int i5;
        int i10;
        int i11 = yVar.i(5);
        if (i11 == 31) {
            i11 = yVar.i(6) + 32;
        }
        int i12 = yVar.i(4);
        int[] iArr = f4387a;
        if (i12 == 15) {
            i5 = yVar.i(24);
        } else {
            if (i12 >= 13) {
                throw o0.a(null, null);
            }
            i5 = iArr[i12];
        }
        int i13 = yVar.i(4);
        String strG = AbstractC3256n.g(i11, "mp4a.40.");
        if (i11 == 5 || i11 == 29) {
            int i14 = yVar.i(4);
            if (i14 == 15) {
                i10 = yVar.i(24);
            } else {
                if (i14 >= 13) {
                    throw o0.a(null, null);
                }
                i10 = iArr[i14];
            }
            i5 = i10;
            int i15 = yVar.i(5);
            if (i15 == 31) {
                i15 = yVar.i(6) + 32;
            }
            i11 = i15;
            if (i11 == 22) {
                i13 = yVar.i(4);
            }
        }
        if (z2) {
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 6 && i11 != 7 && i11 != 17) {
                switch (i11) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw o0.b("Unsupported audio object type: " + i11);
                }
            }
            if (yVar.h()) {
                AbstractC4256a.E("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (yVar.h()) {
                yVar.t(14);
            }
            boolean zH = yVar.h();
            if (i13 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i11 == 6 || i11 == 20) {
                yVar.t(3);
            }
            if (zH) {
                if (i11 == 22) {
                    yVar.t(16);
                }
                if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                    yVar.t(3);
                }
                yVar.t(1);
            }
            switch (i11) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i16 = yVar.i(2);
                    if (i16 == 2 || i16 == 3) {
                        throw o0.b("Unsupported epConfig: " + i16);
                    }
            }
        }
        int i17 = f4388b[i13];
        if (i17 != -1) {
            return new C0520a(i5, i17, strG);
        }
        throw o0.a(null, null);
    }

    public static int g(int i5) {
        int i10;
        int i11;
        if (!((i5 & (-2097152)) == -2097152) || (i10 = (i5 >>> 19) & 3) == 1 || (i11 = (i5 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = (i5 >>> 12) & 15;
        int i13 = (i5 >>> 10) & 3;
        if (i12 == 0 || i12 == 15 || i13 == 3) {
            return -1;
        }
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
