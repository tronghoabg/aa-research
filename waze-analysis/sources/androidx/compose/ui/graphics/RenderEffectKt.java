package androidx.compose.ui.graphics;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RenderEffectKt {
    /* renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final BlurEffect m8582BlurEffect3YTHUZs(float f2, float f3, int i2) {
        return new BlurEffect(null, f2, f3, i2, null);
    }

    /* renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ BlurEffect m8583BlurEffect3YTHUZs$default(float f2, float f3, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = TileMode.Companion.m8653getClamp3opZhB0();
        }
        return m8582BlurEffect3YTHUZs(f2, f3, i2);
    }

    public static final OffsetEffect OffsetEffect(float f2, float f3) {
        return new OffsetEffect(null, (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32), null);
    }
}
