package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.media3.muxer.MuxerUtil;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayerSnapshotV21 implements LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final LayerSnapshotV21 INSTANCE = new LayerSnapshotV21();

    private LayerSnapshotV21() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, e<? super Bitmap> eVar) {
        long jM8930getSizeYbymL2g = graphicsLayer.m8930getSizeYbymL2g();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (jM8930getSizeYbymL2g >> 32), (int) (jM8930getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE), Bitmap.Config.ARGB_8888);
        graphicsLayer.draw$ui_graphics(AndroidCanvas_androidKt.Canvas(new Canvas(bitmapCreateBitmap)), null);
        return bitmapCreateBitmap;
    }
}
