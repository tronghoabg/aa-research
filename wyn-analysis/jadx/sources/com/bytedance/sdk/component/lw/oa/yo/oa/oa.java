package com.bytedance.sdk.component.lw.oa.yo.oa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.bytedance.sdk.component.lw.oa.yo.ivm;
import com.google.android.gms.common.api.f;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class oa {
    private final ImageView.ScaleType bcc;
    private final int ivm;
    private int lw;
    private int moa;
    private final int xs;
    private final Bitmap.Config yo;
    public static final ImageView.ScaleType uef = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: oa, reason: collision with root package name */
    public static final Bitmap.Config f25028oa = Bitmap.Config.ARGB_4444;
    private final int cz = 1280;
    private final int zjm = 83886080;

    public oa(int i5, int i10, ImageView.ScaleType scaleType, Bitmap.Config config, int i11, int i12) {
        this.yo = config;
        this.moa = i5;
        this.lw = i10;
        this.bcc = scaleType;
        this.ivm = i11;
        this.xs = i12;
        uef(i5, i10);
    }

    private static int uef(int i5, int i10, int i11, int i12) {
        if (i5 == 0 && i10 == 0) {
            return i11;
        }
        if (i5 == 0) {
            return (int) (i11 * (i10 / i12));
        }
        if (i10 == 0) {
            return i5;
        }
        double d3 = i12 / i11;
        double d5 = i10;
        return ((double) i5) * d3 > d5 ? (int) (d5 / d3) : i5;
    }

    public static int uef(int i5, int i10, int i11, int i12, int i13, int i14) {
        double dMin = Math.min(i5 / i11, i10 / i12);
        if (i13 > 0 && i14 > 0) {
            dMin = Math.max(dMin, Math.min(Math.max(i5, i10) / Math.max(i13, i14), Math.min(i5, i10) / Math.min(i13, i14)));
        }
        return Integer.highestOneBit((int) dMin);
    }

    private float uef(int i5, int i10, int i11, int i12, int i13) {
        float f10 = i5;
        return Math.max(i12 / (i10 / f10), i13 / (i11 / f10));
    }

    public Bitmap uef(byte[] bArr, ivm ivmVar) {
        Context contextUef;
        boolean zOa;
        Bitmap bitmapDecodeByteArray;
        if (ivmVar != null) {
            contextUef = ivmVar.uef();
            zOa = ivmVar.oa();
        } else {
            contextUef = null;
            zOa = false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.moa == 0 && this.lw == 0) {
            options.inPreferredConfig = this.yo;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i5 = options.outWidth;
            int i10 = options.outHeight;
            int iUef = uef(this.moa, this.lw, i5, i10);
            int iUef2 = uef(this.lw, this.moa, i10, i5);
            options.inJustDecodeBounds = false;
            int iUef3 = uef(i5, i10, iUef, iUef2, this.ivm, this.xs);
            options.inSampleSize = iUef3;
            float fUef = uef(iUef3, i5, i10, iUef, iUef2);
            boolean z2 = fUef > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fUef < 1.0f && contextUef != null && zOa;
            if (z2) {
                options.inScaled = true;
                options.inDensity = f.API_PRIORITY_OTHER;
                options.inTargetDensity = Math.round(fUef * 2.1474836E9f);
            }
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (z2 && bitmapDecodeByteArray != null) {
                bitmapDecodeByteArray.setDensity(contextUef.getResources().getDisplayMetrics().densityDpi);
            }
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iUef || bitmapDecodeByteArray.getHeight() > iUef2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iUef, iUef2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void uef(int i5, int i10) {
        if (i5 > 1280 && i10 > 1280) {
            if (i5 > i10) {
                this.moa = 1280;
                this.lw = (i10 * 1280) / i5;
                return;
            } else {
                this.moa = (i5 * 1280) / i10;
                this.lw = 1280;
                return;
            }
        }
        if (i5 > 1280) {
            this.moa = 1280;
            this.lw = (i10 * 1280) / i5;
        } else if (i10 > 1280) {
            this.moa = (i5 * 1280) / i10;
            this.lw = 1280;
        }
    }
}
