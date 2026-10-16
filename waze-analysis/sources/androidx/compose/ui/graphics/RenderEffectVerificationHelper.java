package androidx.compose.ui.graphics;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final android.graphics.RenderEffect m8584createBlurEffect8A3gB4(RenderEffect renderEffect, float f2, float f3, int i2) {
        return (f2 == 0.0f && f3 == 0.0f) ? android.graphics.RenderEffect.createOffsetEffect(0.0f, 0.0f) : renderEffect == null ? android.graphics.RenderEffect.createBlurEffect(f2, f3, AndroidTileMode_androidKt.m8131toAndroidTileMode0vamqd0(i2)) : android.graphics.RenderEffect.createBlurEffect(f2, f3, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m8131toAndroidTileMode0vamqd0(i2));
    }

    /* renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final android.graphics.RenderEffect m8585createOffsetEffectUv8p0NA(RenderEffect renderEffect, long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return renderEffect == null ? android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)) : android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), renderEffect.asAndroidRenderEffect());
    }
}
