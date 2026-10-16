package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m8961BitmapPainterQZhYCtY(ImageBitmap imageBitmap, long j2, long j3, int i2) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j2, j3, null);
        bitmapPainter.m8960setFilterQualityvDHp3xo$ui_graphics(i2);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m8962BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j2, long j3, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            j2 = IntOffset.Companion.m11307getZeronOccac();
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            j3 = (imageBitmap.getWidth() << 32) | (imageBitmap.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        long j5 = j3;
        if ((i3 & 8) != 0) {
            i2 = FilterQuality.Companion.m8328getLowfv9h1I();
        }
        return m8961BitmapPainterQZhYCtY(imageBitmap, j4, j5, i2);
    }
}
