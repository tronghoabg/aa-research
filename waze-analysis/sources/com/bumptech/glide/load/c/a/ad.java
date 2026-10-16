package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class ad implements com.bumptech.glide.g.j {
    @Override // com.bumptech.glide.g.j
    public final Object a() {
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }
}
