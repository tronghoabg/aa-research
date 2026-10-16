package R2;

import J5.y;
import P2.k;
import P2.l;
import Q1.o;
import Q1.x;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f10203h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f10204i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f10205j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f10206a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f10207b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f10208c;

    /* renamed from: d, reason: collision with root package name */
    public final b f10209d;

    /* renamed from: e, reason: collision with root package name */
    public final a f10210e;

    /* renamed from: f, reason: collision with root package name */
    public final h f10211f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f10212g;

    public i(List list) {
        o oVar = new o((byte[]) list.get(0));
        int iA = oVar.A();
        int iA2 = oVar.A();
        Paint paint = new Paint();
        this.f10206a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f10207b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f10208c = new Canvas();
        this.f10209d = new b(719, 575, 0, 719, 0, 575);
        this.f10210e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f10211f = new h(iA, iA2, 0);
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
        throw new UnsupportedOperationException("Method not decompiled: R2.i.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(y yVar, int i5) {
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
            iArr2[i20] = d((byte) (255 - (i12 & 255)), x.i((int) ((1.402d * d5) + d3), 0, 255), x.i((int) ((d3 - (0.34414d * d10)) - (d5 * 0.71414d)), 0, 255), x.i((int) ((d10 * 1.772d) + d3), 0, 255));
            i18 = i11;
            i19 = 0;
            i16 = i16;
            iArrC = iArrC;
            i15 = 8;
            i17 = 2;
        }
        return new a(i16, iArr, iArrB, iArrC);
    }

    public static c g(y yVar) {
        byte[] bArr;
        int i5 = yVar.i(16);
        yVar.t(4);
        int i10 = yVar.i(2);
        boolean zH = yVar.h();
        yVar.t(1);
        byte[] bArr2 = x.f9729f;
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
            return new c(i5, zH, bArr2, bArr);
        }
        yVar.t(yVar.i(8) * 16);
        bArr = bArr2;
        return new c(i5, zH, bArr2, bArr);
    }

    @Override // P2.l
    public final void E(byte[] bArr, int i5, int i10, k kVar, Q1.c cVar) {
        h hVar;
        P2.a aVar;
        int i11;
        char c10;
        char c11;
        char c12;
        int i12;
        int i13;
        h hVar2;
        Canvas canvas;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        f fVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = 8;
        boolean z2 = true;
        int i24 = 0;
        y yVar = new y(bArr, i5 + i10, 1, (byte) 0);
        yVar.q(i5);
        while (true) {
            int iB = yVar.b();
            hVar = this.f10211f;
            if (iB >= 48 && yVar.i(i23) == 15) {
                int i25 = yVar.i(i23);
                int i26 = yVar.i(16);
                int i27 = yVar.i(16);
                int iF = yVar.f() + i27;
                if (i27 * 8 > yVar.b()) {
                    Q1.k.w("DvbParser", "Data field length exceeds limit");
                    yVar.t(yVar.b());
                } else {
                    switch (i25) {
                        case 16:
                            if (i26 == hVar.f10194a) {
                                d dVar = (d) hVar.f10202i;
                                yVar.i(i23);
                                int i28 = yVar.i(4);
                                int i29 = yVar.i(2);
                                yVar.t(2);
                                int i30 = i27 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i30 > 0) {
                                    int i31 = yVar.i(i23);
                                    yVar.t(i23);
                                    i30 -= 6;
                                    sparseArray.put(i31, new e(yVar.i(16), yVar.i(16)));
                                    i23 = 8;
                                }
                                d dVar2 = new d(i28, i29, sparseArray);
                                if (i29 == 0) {
                                    if (dVar != null && dVar.f10177a != i28) {
                                        hVar.f10202i = dVar2;
                                        break;
                                    }
                                } else {
                                    hVar.f10202i = dVar2;
                                    hVar.f10196c.clear();
                                    hVar.f10197d.clear();
                                    hVar.f10198e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = (d) hVar.f10202i;
                            if (i26 == hVar.f10194a && dVar3 != null) {
                                int i32 = yVar.i(i23);
                                yVar.t(4);
                                boolean zH = yVar.h();
                                yVar.t(3);
                                int i33 = yVar.i(16);
                                int i34 = yVar.i(16);
                                yVar.i(3);
                                int i35 = yVar.i(3);
                                yVar.t(2);
                                int i36 = yVar.i(i23);
                                int i37 = yVar.i(i23);
                                int i38 = yVar.i(4);
                                int i39 = yVar.i(2);
                                yVar.t(2);
                                int i40 = i27 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i40 > 0) {
                                    int i41 = yVar.i(16);
                                    int i42 = yVar.i(2);
                                    yVar.i(2);
                                    int i43 = yVar.i(12);
                                    yVar.t(4);
                                    int i44 = yVar.i(12);
                                    int i45 = i40 - 6;
                                    if (i42 == 1 || i42 == 2) {
                                        yVar.i(i23);
                                        yVar.i(i23);
                                        i40 -= 8;
                                    } else {
                                        i40 = i45;
                                    }
                                    sparseArray2.put(i41, new g(i43, i44));
                                }
                                f fVar2 = new f(i32, zH, i33, i34, i35, i36, i37, i38, i39, sparseArray2);
                                SparseArray sparseArray3 = hVar.f10196c;
                                if (dVar3.f10178b == 0 && (fVar = (f) sparseArray3.get(i32)) != null) {
                                    int i46 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = fVar.f10191j;
                                        if (i46 < sparseArray4.size()) {
                                            fVar2.f10191j.put(sparseArray4.keyAt(i46), (g) sparseArray4.valueAt(i46));
                                            i46++;
                                        }
                                    }
                                }
                                sparseArray3.put(fVar2.f10182a, fVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (i26 != hVar.f10194a) {
                                if (i26 == hVar.f10195b) {
                                    a aVarF = f(yVar, i27);
                                    hVar.f10199f.put(aVarF.f10163a, aVarF);
                                    break;
                                }
                            } else {
                                a aVarF2 = f(yVar, i27);
                                hVar.f10197d.put(aVarF2.f10163a, aVarF2);
                                break;
                            }
                            break;
                        case 19:
                            if (i26 != hVar.f10194a) {
                                if (i26 == hVar.f10195b) {
                                    c cVarG = g(yVar);
                                    hVar.f10200g.put(cVarG.f10173a, cVarG);
                                    break;
                                }
                            } else {
                                c cVarG2 = g(yVar);
                                hVar.f10198e.put(cVarG2.f10173a, cVarG2);
                                break;
                            }
                            break;
                        case 20:
                            if (i26 == hVar.f10194a) {
                                yVar.t(4);
                                boolean zH2 = yVar.h();
                                yVar.t(3);
                                int i47 = yVar.i(16);
                                int i48 = yVar.i(16);
                                if (zH2) {
                                    int i49 = yVar.i(16);
                                    int i50 = yVar.i(16);
                                    int i51 = yVar.i(16);
                                    i19 = i49;
                                    i22 = yVar.i(16);
                                    i21 = i50;
                                    i20 = i51;
                                } else {
                                    i19 = i24;
                                    i20 = i19;
                                    i21 = i47;
                                    i22 = i48;
                                }
                                hVar.f10201h = new b(i47, i48, i19, i21, i20, i22);
                                break;
                            }
                            break;
                    }
                    yVar.u(iF - yVar.f());
                }
                i23 = 8;
                i24 = 0;
            }
        }
        d dVar4 = (d) hVar.f10202i;
        if (dVar4 == null) {
            C3407I c3407i = AbstractC3409K.f40056b;
            aVar = new P2.a(e0.f40101e, -9223372036854775807L, -9223372036854775807L);
        } else {
            b bVar = (b) hVar.f10201h;
            if (bVar == null) {
                bVar = this.f10209d;
            }
            Bitmap bitmap = this.f10212g;
            Canvas canvas2 = this.f10208c;
            if (bitmap == null || bVar.f10167a + 1 != bitmap.getWidth() || bVar.f10168b + 1 != this.f10212g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f10167a + 1, bVar.f10168b + 1, Bitmap.Config.ARGB_8888);
                this.f10212g = bitmapCreateBitmap;
                canvas2.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i52 = 0;
            while (true) {
                SparseArray sparseArray5 = dVar4.f10179c;
                if (i52 < sparseArray5.size()) {
                    canvas2.save();
                    e eVar = (e) sparseArray5.valueAt(i52);
                    f fVar3 = (f) hVar.f10196c.get(sparseArray5.keyAt(i52));
                    int i53 = eVar.f10180a + bVar.f10169c;
                    int i54 = eVar.f10181b + bVar.f10171e;
                    int iMin = Math.min(fVar3.f10184c + i53, bVar.f10170d);
                    int i55 = fVar3.f10185d;
                    int i56 = i54 + i55;
                    boolean z10 = z2;
                    canvas2.clipRect(i53, i54, iMin, Math.min(i56, bVar.f10172f));
                    SparseArray sparseArray6 = hVar.f10197d;
                    int i57 = fVar3.f10187f;
                    a aVar2 = (a) sparseArray6.get(i57);
                    if (aVar2 == null && (aVar2 = (a) hVar.f10199f.get(i57)) == null) {
                        aVar2 = this.f10210e;
                    }
                    int i58 = 0;
                    while (true) {
                        SparseArray sparseArray7 = fVar3.f10191j;
                        if (i58 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i58);
                            g gVar = (g) sparseArray7.valueAt(i58);
                            d dVar5 = dVar4;
                            c cVar2 = (c) hVar.f10198e.get(iKeyAt);
                            if (cVar2 == null) {
                                cVar2 = (c) hVar.f10200g.get(iKeyAt);
                            }
                            if (cVar2 != null) {
                                Paint paint = cVar2.f10174b ? null : this.f10206a;
                                i13 = i52;
                                int i59 = gVar.f10192a + i53;
                                int i60 = gVar.f10193b + i54;
                                int i61 = i53;
                                int i62 = fVar3.f10186e;
                                canvas = canvas2;
                                int i63 = i54;
                                int[] iArr = i62 == 3 ? aVar2.f10166d : i62 == 2 ? aVar2.f10165c : aVar2.f10164b;
                                i15 = i61;
                                i16 = i58;
                                i14 = i63;
                                int i64 = i56;
                                Paint paint2 = paint;
                                i17 = i55;
                                hVar2 = hVar;
                                i18 = i64;
                                e(cVar2.f10175c, iArr, i62, i59, i60, paint2, canvas);
                                e(cVar2.f10176d, iArr, i62, i59, i60 + 1, paint2, canvas);
                            } else {
                                i13 = i52;
                                hVar2 = hVar;
                                canvas = canvas2;
                                i14 = i54;
                                i15 = i53;
                                i16 = i58;
                                i17 = i55;
                                i18 = i56;
                            }
                            i58 = i16 + 1;
                            dVar4 = dVar5;
                            i53 = i15;
                            i54 = i14;
                            i55 = i17;
                            i56 = i18;
                            canvas2 = canvas;
                            i52 = i13;
                            hVar = hVar2;
                        } else {
                            d dVar6 = dVar4;
                            int i65 = i52;
                            h hVar3 = hVar;
                            Canvas canvas3 = canvas2;
                            int i66 = i54;
                            int i67 = i53;
                            int i68 = i55;
                            int i69 = i56;
                            boolean z11 = fVar3.f10183b;
                            int i70 = fVar3.f10184c;
                            if (z11) {
                                int i71 = fVar3.f10186e;
                                if (i71 == 3) {
                                    i12 = aVar2.f10166d[fVar3.f10188g];
                                    c12 = 2;
                                } else {
                                    c12 = 2;
                                    i12 = i71 == 2 ? aVar2.f10165c[fVar3.f10189h] : aVar2.f10164b[fVar3.f10190i];
                                }
                                Paint paint3 = this.f10207b;
                                paint3.setColor(i12);
                                c10 = 3;
                                c11 = c12;
                                i11 = i70;
                                canvas2 = canvas3;
                                canvas2.drawRect(i67, i66, i67 + i70, i69, paint3);
                            } else {
                                i11 = i70;
                                canvas2 = canvas3;
                                c10 = 3;
                                c11 = 2;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f10212g, i67, i66, i11, i68);
                            float f10 = bVar.f10167a;
                            float f11 = i67 / f10;
                            float f12 = i66;
                            float f13 = bVar.f10168b;
                            arrayList.add(new P1.b(null, null, null, bitmapCreateBitmap2, f12 / f13, 0, 0, f11, 0, Integer.MIN_VALUE, -3.4028235E38f, i11 / f10, i68 / f13, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas2.restore();
                            z2 = z10;
                            i52 = i65 + 1;
                            hVar = hVar3;
                            dVar4 = dVar6;
                        }
                    }
                } else {
                    aVar = new P2.a(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        cVar.accept(aVar);
    }

    @Override // P2.l
    public final /* synthetic */ P2.d H(int i5, int i10, byte[] bArr) {
        return N0.a.a(this, bArr, i10);
    }

    @Override // P2.l
    public final int P() {
        return 2;
    }

    @Override // P2.l
    public final void reset() {
        h hVar = this.f10211f;
        hVar.f10196c.clear();
        hVar.f10197d.clear();
        hVar.f10198e.clear();
        hVar.f10199f.clear();
        hVar.f10200g.clear();
        hVar.f10201h = null;
        hVar.f10202i = null;
    }
}
