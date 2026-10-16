package com.waze.utils;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f44820a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LineBreakId, 50, 51, 52, 53, 54, 55, 56, 57, StylePropertiesKt.BaselineShiftId, StylePropertiesKt.LineHeightId};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f44821b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, StylePropertiesKt.WidthFractionId, StylePropertiesKt.HeightFractionId, StylePropertiesKt.LeftId, StylePropertiesKt.TopId, StylePropertiesKt.RightId, StylePropertiesKt.BottomId, StylePropertiesKt.MinWidthId, StylePropertiesKt.MinHeightId, StylePropertiesKt.MaxWidthId, StylePropertiesKt.MaxHeightId, StylePropertiesKt.AlphaId, StylePropertiesKt.ScaleXId, StylePropertiesKt.ScaleYId, StylePropertiesKt.TranslationXId, StylePropertiesKt.TranslationYId, -9, -9, -9, -9, -9, -9, StylePropertiesKt.RotationXId, StylePropertiesKt.RotationYId, StylePropertiesKt.RotationZId, StylePropertiesKt.TransformOriginXId, StylePropertiesKt.TransformOriginYId, StylePropertiesKt.ClipId, StylePropertiesKt.ZIndexId, StylePropertiesKt.CameraDistanceId, StylePropertiesKt.BackgroundColorId, StylePropertiesKt.BorderColorId, StylePropertiesKt.ForegroundColorId, StylePropertiesKt.ContentColorId, StylePropertiesKt.TextDecorationId, StylePropertiesKt.FontWeightId, StylePropertiesKt.FontStyleId, StylePropertiesKt.TextAlignId, StylePropertiesKt.TextDirectionId, StylePropertiesKt.BaselineShiftId, StylePropertiesKt.HyphensId, StylePropertiesKt.FontSynthesisId, StylePropertiesKt.FontSizeId, StylePropertiesKt.LineHeightId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LineBreakId, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    public static String a(byte[] bArr) {
        try {
            int length = bArr.length;
            if (bArr == null) {
                throw new NullPointerException("Cannot serialize a null array.");
            }
            int i2 = 4;
            int i3 = (length / 3) * 4;
            if (length % 3 <= 0) {
                i2 = 0;
            }
            int i4 = i3 + i2;
            byte[] bArr2 = new byte[i4];
            int i5 = length - 2;
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                c(bArr, i6, 3, bArr2, i7);
                i6 += 3;
                i7 += 4;
            }
            if (i6 < length) {
                c(bArr, i6, length - i6, bArr2, i7);
                i7 += 4;
            }
            if (i7 <= i4 - 1) {
                byte[] bArr3 = new byte[i7];
                System.arraycopy(bArr2, 0, bArr3, 0, i7);
                bArr2 = bArr3;
            }
            try {
                return new String(bArr2, "US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr2);
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:93:0x0142
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static byte[] b(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.utils.a.b(java.lang.String):byte[]");
    }

    private static void c(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        byte[] bArr3 = f44820a;
        int i5 = (i3 > 0 ? (bArr[i2] << StylePropertiesKt.TranslationXId) >>> 8 : 0) | (i3 > 1 ? (bArr[i2 + 1] << StylePropertiesKt.TranslationXId) >>> 16 : 0) | (i3 > 2 ? (bArr[i2 + 2] << StylePropertiesKt.TranslationXId) >>> 24 : 0);
        if (i3 == 1) {
            bArr2[i4] = bArr3[i5 >>> 18];
            bArr2[i4 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            return;
        }
        if (i3 == 2) {
            bArr2[i4] = bArr3[i5 >>> 18];
            bArr2[i4 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i4 + 2] = bArr3[(i5 >>> 6) & 63];
            bArr2[i4 + 3] = 61;
            return;
        }
        if (i3 != 3) {
            return;
        }
        bArr2[i4] = bArr3[i5 >>> 18];
        bArr2[i4 + 1] = bArr3[(i5 >>> 12) & 63];
        bArr2[i4 + 2] = bArr3[(i5 >>> 6) & 63];
        bArr2[i4 + 3] = bArr3[i5 & 63];
    }
}
