package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;
import h.g.b.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DelegatingAnimationSpec implements AnimationSpec<AnimationData> {
    private final AnimationSpec<Offset> offsetAnimationSpec;
    private final AnimationSpec<Float> rotationAnimationSpec;
    private final AnimationSpec<Float> zoomAnimationSpec;

    public DelegatingAnimationSpec(AnimationSpec<Float> animationSpec, AnimationSpec<Offset> animationSpec2, AnimationSpec<Float> animationSpec3) {
        this.zoomAnimationSpec = animationSpec;
        this.offsetAnimationSpec = animationSpec2;
        this.rotationAnimationSpec = animationSpec3;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(final TwoWayConverter<AnimationData, V> twoWayConverter) {
        q qVar = q.f48127a;
        final VectorizedAnimationSpec<V> vectorizedAnimationSpecVectorize = this.zoomAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(qVar));
        final VectorizedAnimationSpec<V> vectorizedAnimationSpecVectorize2 = this.offsetAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(Offset.Companion));
        final VectorizedAnimationSpec<V> vectorizedAnimationSpecVectorize3 = this.rotationAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(qVar));
        return new VectorizedFiniteAnimationSpec() { // from class: androidx.compose.foundation.gestures.DelegatingAnimationSpec.vectorize.1
            private final AnimationVector1D degreesVector(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.getVectorConverter(q.f48127a).getConvertToVector().invoke(Float.valueOf(animationData.getDegrees()));
            }

            private final AnimationVector2D offsetVector(AnimationData animationData) {
                l<Offset, V> convertToVector = VectorConvertersKt.getVectorConverter(Offset.Companion).getConvertToVector();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (animationData.m2152getOffsetF1C5BW0() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (animationData.m2152getOffsetF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                return (AnimationVector2D) convertToVector.invoke(Offset.m7969boximpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            }

            private final AnimationVector packToAnimationVector(AnimationVector1D animationVector1D, AnimationVector2D animationVector2D, AnimationVector1D animationVector1D2) {
                l convertToVector = twoWayConverter.getConvertToVector();
                float value = animationVector1D.getValue();
                float v1 = animationVector2D.getV1();
                float v2 = animationVector2D.getV2();
                return (AnimationVector) convertToVector.invoke(new AnimationData(value, (Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), animationVector1D2.getValue(), null));
            }

            private final AnimationVector1D zoomVector(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.getVectorConverter(q.f48127a).getConvertToVector().invoke(Float.valueOf(animationData.getZoom()));
            }

            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData animationData = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData animationData2 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData animationData3 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return Math.max(vectorizedAnimationSpecVectorize.getDurationNanos(zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), Math.max(vectorizedAnimationSpecVectorize2.getDurationNanos(offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), vectorizedAnimationSpecVectorize3.getDurationNanos(degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3))));
            }

            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                return VectorizedAnimationSpec.CC.$default$getEndVelocity(this, animationVector, animationVector2, animationVector3);
            }

            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getValueFromNanos(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData animationData = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData animationData2 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData animationData3 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return packToAnimationVector((AnimationVector1D) vectorizedAnimationSpecVectorize.getValueFromNanos(j2, zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), (AnimationVector2D) vectorizedAnimationSpecVectorize2.getValueFromNanos(j2, offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), (AnimationVector1D) vectorizedAnimationSpecVectorize3.getValueFromNanos(j2, degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3)));
            }

            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getVelocityFromNanos(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData animationData = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData animationData2 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData animationData3 = (AnimationData) twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return packToAnimationVector((AnimationVector1D) vectorizedAnimationSpecVectorize.getVelocityFromNanos(j2, zoomVector(animationData), zoomVector(animationData2), zoomVector(animationData3)), (AnimationVector2D) vectorizedAnimationSpecVectorize2.getVelocityFromNanos(j2, offsetVector(animationData), offsetVector(animationData2), offsetVector(animationData3)), (AnimationVector1D) vectorizedAnimationSpecVectorize3.getVelocityFromNanos(j2, degreesVector(animationData), degreesVector(animationData2), degreesVector(animationData3)));
            }

            @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
            public /* synthetic */ boolean isInfinite() {
                return false;
            }
        };
    }
}
