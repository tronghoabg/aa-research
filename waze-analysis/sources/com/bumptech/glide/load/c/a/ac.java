package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac {

    /* renamed from: a, reason: collision with root package name */
    private static final ColorMatrixColorFilter f3293a = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f});

    public static Gainmap a(Gainmap gainmap) {
        Bitmap gainmapContents = gainmap.getGainmapContents();
        if (gainmapContents.getConfig() != Bitmap.Config.ALPHA_8) {
            return gainmap;
        }
        com.bumptech.glide.g.p.a(gainmapContents.getConfig() == Bitmap.Config.ALPHA_8);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(f3293a);
        canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        Gainmap gainmap2 = new Gainmap(bitmapCreateBitmap);
        float[] ratioMin = gainmap.getRatioMin();
        gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
        float[] ratioMax = gainmap.getRatioMax();
        gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
        float[] gamma = gainmap.getGamma();
        gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
        float[] epsilonSdr = gainmap.getEpsilonSdr();
        gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
        float[] epsilonHdr = gainmap.getEpsilonHdr();
        gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
        gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
        gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
        return gainmap2;
    }
}
