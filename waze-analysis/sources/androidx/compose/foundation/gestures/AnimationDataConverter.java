package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {
    public static final AnimationDataConverter INSTANCE = new AnimationDataConverter();

    private AnimationDataConverter() {
    }

    static final AnimationData _get_convertFromVector_$lambda$0(AnimationVector4D animationVector4D) {
        float v1 = animationVector4D.getV1();
        float v2 = animationVector4D.getV2();
        float v3 = animationVector4D.getV3();
        return new AnimationData(v1, (Float.floatToRawIntBits(v3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(v2) << 32), animationVector4D.getV4(), null);
    }

    static final AnimationVector4D _get_convertToVector_$lambda$0(AnimationData animationData) {
        return new AnimationVector4D(animationData.getZoom(), Float.intBitsToFloat((int) (animationData.m2152getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (animationData.m2152getOffsetF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), animationData.getDegrees());
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public l<AnimationVector4D, AnimationData> getConvertFromVector() {
        return new l() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationDataConverter._get_convertFromVector_$lambda$0((AnimationVector4D) obj);
            }
        };
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public l<AnimationData, AnimationVector4D> getConvertToVector() {
        return new l() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AnimationDataConverter._get_convertToVector_$lambda$0((AnimationData) obj);
            }
        };
    }
}
