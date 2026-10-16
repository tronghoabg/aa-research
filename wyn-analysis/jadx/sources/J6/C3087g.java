package j6;

import J5.y;
import R2.h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.vungle.ads.internal.protos.Sdk;
import u6.v;

/* renamed from: j6.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3087g {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f38658h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f38659i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f38660j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f38661a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f38662b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f38663c;

    /* renamed from: d, reason: collision with root package name */
    public final R2.b f38664d;

    /* renamed from: e, reason: collision with root package name */
    public final C3082b f38665e;

    /* renamed from: f, reason: collision with root package name */
    public final h f38666f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f38667g;

    public C3087g(int i5, int i10) {
        Paint paint = new Paint();
        this.f38661a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f38662b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f38663c = new Canvas();
        this.f38664d = new R2.b(719, 575, 0, 719, 0, 575);
        this.f38665e = new C3082b(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f38666f = new h(i5, i10, 1);
    }

    public static byte[] a(int i5, int i10, y yVar) {
        byte[] bArr = new byte[i5];
        for (int i11 = 0; i11 < i5; i11++) {
            bArr[i11] = (byte) yVar.i(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i5 = 1; i5 < 16; i5++) {
            if (i5 < 8) {
                iArr[i5] = d(255, (i5 & 1) != 0 ? 255 : 0, (i5 & 2) != 0 ? 255 : 0, (i5 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i5] = d(255, (i5 & 1) != 0 ? 127 : 0, (i5 & 2) != 0 ? 127 : 0, (i5 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            if (i5 < 8) {
                iArr[i5] = d(63, (i5 & 1) != 0 ? 255 : 0, (i5 & 2) != 0 ? 255 : 0, (i5 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i5 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i10 == 0) {
                    iArr[i5] = d(255, ((i5 & 1) != 0 ? 85 : 0) + ((i5 & 16) != 0 ? 170 : 0), ((i5 & 2) != 0 ? 85 : 0) + ((i5 & 32) != 0 ? 170 : 0), ((i5 & 4) == 0 ? 0 : 85) + ((i5 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i5] = d(127, ((i5 & 1) != 0 ? 85 : 0) + ((i5 & 16) != 0 ? 170 : 0), ((i5 & 2) != 0 ? 85 : 0) + ((i5 & 32) != 0 ? 170 : 0), ((i5 & 4) == 0 ? 0 : 85) + ((i5 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i5] = d(255, ((i5 & 1) != 0 ? 43 : 0) + 127 + ((i5 & 16) != 0 ? 85 : 0), ((i5 & 2) != 0 ? 43 : 0) + 127 + ((i5 & 32) != 0 ? 85 : 0), ((i5 & 4) == 0 ? 0 : 43) + 127 + ((i5 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i5] = d(255, ((i5 & 1) != 0 ? 43 : 0) + ((i5 & 16) != 0 ? 85 : 0), ((i5 & 2) != 0 ? 43 : 0) + ((i5 & 32) != 0 ? 85 : 0), ((i5 & 4) == 0 ? 0 : 43) + ((i5 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i5, int i10, int i11, int i12) {
        return (i5 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0200 A[LOOP:3: B:86:0x0168->B:116:0x0200, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.C3087g.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static C3082b f(y yVar, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        int i16 = yVar.i(8);
        yVar.t(8);
        int i17 = 2;
        int i18 = i5 - 2;
        int i19 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i18 > 0) {
            int i20 = yVar.i(i15);
            int i21 = yVar.i(i15);
            int[] iArr2 = (i21 & 128) != 0 ? iArr : (i21 & 64) != 0 ? iArrB : iArrC;
            if ((i21 & 1) != 0) {
                i13 = yVar.i(i15);
                i14 = yVar.i(i15);
                i10 = yVar.i(i15);
                i12 = yVar.i(i15);
                i11 = i18 - 6;
            } else {
                int i22 = yVar.i(6) << i17;
                int i23 = yVar.i(4) << 4;
                i10 = yVar.i(4) << 4;
                i11 = i18 - 4;
                i12 = yVar.i(i17) << 6;
                i13 = i22;
                i14 = i23;
            }
            if (i13 == 0) {
                i14 = i19;
                i10 = i14;
                i12 = 255;
            }
            double d3 = i13;
            double d5 = i14 - 128;
            double d10 = i10 - 128;
            iArr2[i20] = d((byte) (255 - (i12 & 255)), v.h((int) ((1.402d * d5) + d3), 0, 255), v.h((int) ((d3 - (0.34414d * d10)) - (d5 * 0.71414d)), 0, 255), v.h((int) ((d10 * 1.772d) + d3), 0, 255));
            i18 = i11;
            i19 = 0;
            i16 = i16;
            iArrC = iArrC;
            i15 = 8;
            i17 = 2;
        }
        return new C3082b(i16, iArr, iArrB, iArrC);
    }

    public static C3083c g(y yVar) {
        byte[] bArr;
        int i5 = yVar.i(16);
        yVar.t(4);
        int i10 = yVar.i(2);
        boolean zH = yVar.h();
        yVar.t(1);
        byte[] bArr2 = v.f46726f;
        if (i10 != 1) {
            if (i10 == 0) {
                int i11 = yVar.i(16);
                int i12 = yVar.i(16);
                if (i11 > 0) {
                    bArr2 = new byte[i11];
                    yVar.l(i11, bArr2);
                }
                if (i12 > 0) {
                    bArr = new byte[i12];
                    yVar.l(i12, bArr);
                }
            }
            return new C3083c(i5, zH, bArr2, bArr);
        }
        yVar.t(yVar.i(8) * 16);
        bArr = bArr2;
        return new C3083c(i5, zH, bArr2, bArr);
    }
}
