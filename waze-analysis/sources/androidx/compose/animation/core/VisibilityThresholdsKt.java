package androidx.compose.animation.core;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.a.r;
import h.g.b.q;
import h.g.b.v;
import h.k;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.4f;
    private static final float PxVisibilityThreshold = 1.0f;
    private static final Rect RectVisibilityThreshold = new Rect(1.0f, 1.0f, 1.0f, 1.0f);
    private static final Map<TwoWayConverter<?, ?>, Float> VisibilityThresholdMap;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1650a = 0;

    static {
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(v.f48128a);
        Float fValueOf = Float.valueOf(1.0f);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(Dp.Companion);
        Float fValueOf2 = Float.valueOf(DpVisibilityThreshold);
        VisibilityThresholdMap = r.k(new k(vectorConverter, fValueOf), new k(VectorConvertersKt.getVectorConverter(IntSize.Companion), fValueOf), new k(VectorConvertersKt.getVectorConverter(IntOffset.Companion), fValueOf), new k(VectorConvertersKt.getVectorConverter(q.f48127a), Float.valueOf(0.01f)), new k(VectorConvertersKt.getVectorConverter(Rect.Companion), fValueOf), new k(VectorConvertersKt.getVectorConverter(Size.Companion), fValueOf), new k(VectorConvertersKt.getVectorConverter(Offset.Companion), fValueOf), new k(vectorConverter2, fValueOf2), new k(VectorConvertersKt.getVectorConverter(DpOffset.Companion), fValueOf2));
    }

    public static final long getVisibilityThreshold(DpOffset.Companion companion) {
        return (Float.floatToRawIntBits(DpVisibilityThreshold) << 32) | (Float.floatToRawIntBits(DpVisibilityThreshold) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }

    public static /* synthetic */ void getVisibilityThresholdMap$annotations() {
    }

    public static final int getVisibilityThreshold(v vVar) {
        return 1;
    }

    public static final long getVisibilityThreshold(IntOffset.Companion companion) {
        return InlineClassHelperKt.Uint64Low32;
    }

    public static final long getVisibilityThreshold(IntSize.Companion companion) {
        return InlineClassHelperKt.Uint64Low32;
    }

    public static final Rect getVisibilityThreshold(Rect.Companion companion) {
        return RectVisibilityThreshold;
    }

    public static final long getVisibilityThreshold(Offset.Companion companion) {
        return (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public static final long getVisibilityThreshold(Size.Companion companion) {
        return (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public static final float getVisibilityThreshold(Dp.Companion companion) {
        return DpVisibilityThreshold;
    }
}
