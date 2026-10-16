package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class ibg implements ifs {
    @Override // defpackage.ifs
    public final Object a() {
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", a.bR(z, "calculateNeedsGainmapDecodeWorkaround="));
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }
}
