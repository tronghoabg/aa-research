package com.bytedance.sdk.component.adexpress.moa;

import G5.AbstractC0523d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import c5.AbstractC1558a;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class uef {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap oa(android.content.Context r4, android.graphics.Bitmap r5, int r6) {
        /*
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5)     // Catch: java.lang.Throwable -> L6c
            android.renderscript.RenderScript r4 = android.renderscript.RenderScript.create(r4)     // Catch: java.lang.Throwable -> L6c
            if (r4 != 0) goto L20
            com.bytedance.sdk.component.adexpress.uef.uef.uef r5 = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef()     // Catch: java.lang.Throwable -> L1b
            com.bytedance.sdk.component.adexpress.uef.uef.yo r5 = r5.yo()     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L1f
            if (r4 == 0) goto L1f
            android.renderscript.RenderScript.releaseAllContexts()     // Catch: java.lang.Throwable -> L1b
            return r0
        L1b:
            r4 = move-exception
            r4.getMessage()
        L1f:
            return r0
        L20:
            android.renderscript.Element r2 = android.renderscript.Element.U8_4(r4)     // Catch: java.lang.Throwable -> L67
            android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r4, r2)     // Catch: java.lang.Throwable -> L67
            android.renderscript.Allocation r5 = android.renderscript.Allocation.createFromBitmap(r4, r5)     // Catch: java.lang.Throwable -> L63
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r4, r1)     // Catch: java.lang.Throwable -> L60
            float r6 = (float) r6
            r2.setRadius(r6)     // Catch: java.lang.Throwable -> L5e
            r2.setInput(r5)     // Catch: java.lang.Throwable -> L5e
            r2.forEach(r3)     // Catch: java.lang.Throwable -> L5e
            r3.copyTo(r1)     // Catch: java.lang.Throwable -> L5e
            com.bytedance.sdk.component.adexpress.uef.uef.uef r4 = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef()     // Catch: java.lang.Throwable -> L50
            com.bytedance.sdk.component.adexpress.uef.uef.yo r4 = r4.yo()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L5c
            android.renderscript.RenderScript.releaseAllContexts()     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L52
            r5.destroy()     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r4 = move-exception
            goto L59
        L52:
            r3.destroy()     // Catch: java.lang.Throwable -> L50
            r2.destroy()     // Catch: java.lang.Throwable -> L50
            goto L5c
        L59:
            r4.getMessage()
        L5c:
            r0 = r1
            goto L98
        L5e:
            r6 = move-exception
            goto L70
        L60:
            r6 = move-exception
            r3 = r0
            goto L70
        L63:
            r6 = move-exception
            r5 = r0
            r3 = r5
            goto L70
        L67:
            r6 = move-exception
            r5 = r0
        L69:
            r2 = r5
            r3 = r2
            goto L70
        L6c:
            r6 = move-exception
            r4 = r0
            r5 = r4
            goto L69
        L70:
            r6.getMessage()     // Catch: java.lang.Throwable -> L99
            com.bytedance.sdk.component.adexpress.uef.uef.uef r6 = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef()     // Catch: java.lang.Throwable -> L83
            com.bytedance.sdk.component.adexpress.uef.uef.yo r6 = r6.yo()     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L98
            if (r4 == 0) goto L85
            android.renderscript.RenderScript.releaseAllContexts()     // Catch: java.lang.Throwable -> L83
            goto L85
        L83:
            r4 = move-exception
            goto L95
        L85:
            if (r5 == 0) goto L8a
            r5.destroy()     // Catch: java.lang.Throwable -> L83
        L8a:
            if (r3 == 0) goto L8f
            r3.destroy()     // Catch: java.lang.Throwable -> L83
        L8f:
            if (r2 == 0) goto L98
            r2.destroy()     // Catch: java.lang.Throwable -> L83
            goto L98
        L95:
            r4.getMessage()
        L98:
            return r0
        L99:
            r6 = move-exception
            com.bytedance.sdk.component.adexpress.uef.uef.uef r0 = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef()     // Catch: java.lang.Throwable -> Laa
            com.bytedance.sdk.component.adexpress.uef.uef.yo r0 = r0.yo()     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto Lbf
            if (r4 == 0) goto Lac
            android.renderscript.RenderScript.releaseAllContexts()     // Catch: java.lang.Throwable -> Laa
            goto Lac
        Laa:
            r4 = move-exception
            goto Lbc
        Lac:
            if (r5 == 0) goto Lb1
            r5.destroy()     // Catch: java.lang.Throwable -> Laa
        Lb1:
            if (r3 == 0) goto Lb6
            r3.destroy()     // Catch: java.lang.Throwable -> Laa
        Lb6:
            if (r2 == 0) goto Lbf
            r2.destroy()     // Catch: java.lang.Throwable -> Laa
            goto Lbf
        Lbc:
            r4.getMessage()
        Lbf:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.moa.uef.oa(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static Bitmap uef(Context context, Bitmap bitmap, int i5) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            return com.bytedance.sdk.component.adexpress.moa.moa() == 0 ? oa(context, bitmapCreateScaledBitmap, i5) : com.bytedance.sdk.component.adexpress.moa.moa() == 1 ? uef(bitmapCreateScaledBitmap, i5) : oa(bitmapCreateScaledBitmap, i5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Bitmap uef(Bitmap bitmap, int i5) {
        int i10;
        int i11;
        int i12 = i5;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i13 = width * height;
            int[] iArr = new int[i13];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int[] iArr2 = iArr;
            int i14 = width - 1;
            int i15 = height - 1;
            int i16 = i12 + i12;
            int i17 = i16 + 1;
            char c10 = 2;
            int i18 = (i16 + 2) >> 1;
            int i19 = i18 * i18;
            int[] iArr3 = new int[Math.max(width, height)];
            int i20 = i19 * 256;
            int[] iArr4 = new int[i20];
            int[] iArr5 = new int[i13];
            int[] iArr6 = new int[i13];
            int[] iArr7 = new int[i13];
            int i21 = 0;
            for (int i22 = 0; i22 < i20; i22++) {
                iArr4[i22] = i22 / i19;
            }
            int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i17, 3);
            int i23 = i12 + 1;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i24 < height) {
                char c11 = c10;
                int i27 = -i12;
                int i28 = i21;
                int i29 = i28;
                int i30 = i29;
                int i31 = i30;
                int i32 = i31;
                int i33 = i32;
                int i34 = i33;
                int i35 = i34;
                int i36 = i35;
                while (i27 <= i12) {
                    int[] iArr9 = iArr2;
                    int[][] iArr10 = iArr8;
                    int i37 = iArr9[i25 + Math.min(i14, Math.max(i27, i21))];
                    int[] iArr11 = iArr10[i27 + i12];
                    iArr11[0] = (i37 & 16711680) >> 16;
                    iArr11[1] = (i37 & 65280) >> 8;
                    iArr11[c11] = i37 & 255;
                    int iAbs = i23 - Math.abs(i27);
                    int i38 = iArr11[0];
                    i28 = (i38 * iAbs) + i28;
                    int i39 = iArr11[1];
                    i29 = (i39 * iAbs) + i29;
                    int i40 = iArr11[c11];
                    i30 = (iAbs * i40) + i30;
                    if (i27 <= 0) {
                        i32 += i38;
                        i34 += i39;
                        i36 += i40;
                    } else {
                        i31 += i38;
                        i33 += i39;
                        i35 += i40;
                    }
                    i27++;
                    iArr2 = iArr9;
                    iArr8 = iArr10;
                    i21 = 0;
                }
                int[] iArr12 = iArr2;
                int[][] iArr13 = iArr8;
                int i41 = i12;
                int i42 = 0;
                while (i42 < width) {
                    iArr5[i25] = iArr4[i28];
                    iArr6[i25] = iArr4[i29];
                    iArr7[i25] = iArr4[i30];
                    int[] iArr14 = iArr13[((i41 - i12) + i17) % i17];
                    int i43 = i28 - i32;
                    int i44 = i29 - i34;
                    int i45 = i30 - i36;
                    int i46 = i32 - iArr14[0];
                    int i47 = i34 - iArr14[1];
                    int i48 = i36 - iArr14[c11];
                    if (i24 == 0) {
                        i11 = i42;
                        iArr3[i11] = Math.min(i42 + i12 + 1, i14);
                    } else {
                        i11 = i42;
                    }
                    int i49 = iArr12[i26 + iArr3[i11]];
                    int i50 = (i49 & 16711680) >> 16;
                    iArr14[0] = i50;
                    int i51 = (i49 & 65280) >> 8;
                    iArr14[1] = i51;
                    int i52 = i49 & 255;
                    iArr14[c11] = i52;
                    int i53 = i31 + i50;
                    int i54 = i33 + i51;
                    int i55 = i35 + i52;
                    i41 = (i41 + 1) % i17;
                    int[] iArr15 = iArr13[i41 % i17];
                    i28 = i43 + i53;
                    i29 = i44 + i54;
                    i30 = i45 + i55;
                    int i56 = iArr15[0];
                    i31 = i53 - i56;
                    int i57 = iArr15[1];
                    i33 = i54 - i57;
                    int i58 = iArr15[c11];
                    i35 = i55 - i58;
                    i32 = i46 + i56;
                    i34 = i47 + i57;
                    i36 = i48 + i58;
                    i25++;
                    i42 = i11 + 1;
                }
                i26 += width;
                i24++;
                c10 = c11;
                iArr2 = iArr12;
                iArr8 = iArr13;
                i21 = 0;
            }
            int[] iArr16 = iArr2;
            int[][] iArr17 = iArr8;
            char c12 = c10;
            int i59 = 0;
            while (i59 < width) {
                int i60 = -i12;
                int i61 = i60 * width;
                int i62 = 0;
                int i63 = 0;
                int i64 = 0;
                int i65 = 0;
                int i66 = 0;
                int i67 = 0;
                int i68 = 0;
                int i69 = 0;
                int i70 = 0;
                while (i60 <= i12) {
                    int[] iArr18 = iArr17[i60 + i12];
                    int iMax = Math.max(0, i61) + i59;
                    int iAbs2 = i23 - Math.abs(i60);
                    int i71 = iArr5[iMax];
                    i62 = (i71 * iAbs2) + i62;
                    i63 = (iArr6[iMax] * iAbs2) + i63;
                    i64 = (iArr7[iMax] * iAbs2) + i64;
                    iArr18[0] = i71;
                    int i72 = iArr6[iMax];
                    iArr18[1] = i72;
                    int i73 = iArr7[iMax];
                    iArr18[c12] = i73;
                    if (i60 <= 0) {
                        i66 += i71;
                        i68 += i72;
                        i70 += i73;
                    } else {
                        i65 += i71;
                        i67 += i72;
                        i69 += i73;
                    }
                    if (i60 < i15) {
                        i61 += width;
                    }
                    i60++;
                    i12 = i5;
                }
                int i74 = i5;
                int i75 = i59;
                int i76 = 0;
                while (i76 < height) {
                    iArr16[i75] = (iArr16[i75] & (-16777216)) | (iArr4[i62] << 16) | (iArr4[i63] << 8) | iArr4[i64];
                    int[] iArr19 = iArr17[((i74 - i5) + i17) % i17];
                    int i77 = i62 - i66;
                    int i78 = i63 - i68;
                    int i79 = i64 - i70;
                    int i80 = i66 - iArr19[0];
                    int i81 = i68 - iArr19[1];
                    int i82 = i70 - iArr19[c12];
                    if (i59 == 0) {
                        i10 = i76;
                        iArr3[i10] = Math.min(i10 + i23, i15) * width;
                    } else {
                        i10 = i76;
                    }
                    int i83 = iArr3[i10] + i59;
                    int i84 = iArr5[i83];
                    iArr19[0] = i84;
                    int i85 = iArr6[i83];
                    iArr19[1] = i85;
                    int i86 = iArr7[i83];
                    iArr19[c12] = i86;
                    int i87 = i65 + i84;
                    int i88 = i67 + i85;
                    int i89 = i69 + i86;
                    i62 = i77 + i87;
                    i63 = i78 + i88;
                    i64 = i79 + i89;
                    i74 = (i74 + 1) % i17;
                    int[] iArr20 = iArr17[i74];
                    int i90 = iArr20[0];
                    i65 = i87 - i90;
                    int i91 = iArr20[1];
                    i67 = i88 - i91;
                    int i92 = iArr20[c12];
                    i69 = i89 - i92;
                    i66 = i80 + i90;
                    i68 = i81 + i91;
                    i70 = i82 + i92;
                    i75 += width;
                    i76 = i10 + 1;
                }
                i59++;
                i12 = i5;
            }
            bitmap.setPixels(iArr16, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static Bitmap oa(Bitmap bitmap, int i5) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                AbstractC0523d.j();
                RenderNode renderNodeD = AbstractC0523d.d();
                AbstractC1558a.k();
                HardwareRenderer hardwareRendererC = AbstractC0523d.c();
                hardwareRendererC.setSurface(imageReaderNewInstance.getSurface());
                hardwareRendererC.setContentRoot(renderNodeD);
                renderNodeD.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
                float f10 = i5;
                Shader.TileMode tileMode = Shader.TileMode.MIRROR;
                renderNodeD.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR));
                renderNodeD.beginRecording().drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                renderNodeD.endRecording();
                hardwareRendererC.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                hardwareBuffer.close();
                imageAcquireNextImage.close();
                imageReaderNewInstance.close();
                renderNodeD.discardDisplayList();
                hardwareRendererC.destroy();
                return bitmapWrapHardwareBuffer;
            }
            return uef(bitmap, i5);
        } catch (Throwable th) {
            th.getMessage();
            return uef(bitmap, i5);
        }
    }
}
