package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;
import h.g.b.q;
import h.g.b.v;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorConvertersKt {
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.FloatToVector$lambda$0(((Float) obj).floatValue());
        }
    }, new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda9
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Float.valueOf(((AnimationVector1D) obj).getValue());
        }
    });
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda10
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.IntToVector$lambda$0(((Integer) obj).intValue());
        }
    }, new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda11
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Integer.valueOf(VectorConvertersKt.IntToVector$lambda$1((AnimationVector1D) obj));
        }
    });
    private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda12
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.DpToVector$lambda$0((Dp) obj);
        }
    }, new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda13
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Dp.m11162boximpl(((AnimationVector1D) obj).getValue());
        }
    });
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda14
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.DpOffsetToVector$lambda$0((DpOffset) obj);
        }
    }, new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda15
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.DpOffsetToVector$lambda$1((AnimationVector2D) obj);
        }
    });
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda16
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.SizeToVector$lambda$0((Size) obj);
        }
    }, new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda17
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.SizeToVector$lambda$1((AnimationVector2D) obj);
        }
    });
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.OffsetToVector$lambda$0((Offset) obj);
        }
    }, new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.OffsetToVector$lambda$1((AnimationVector2D) obj);
        }
    });
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda3
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.IntOffsetToVector$lambda$0((IntOffset) obj);
        }
    }, new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda4
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            AnimationVector2D animationVector2D = (AnimationVector2D) obj;
            return IntOffset.m11287boximpl((Math.round(animationVector2D.getV1()) << 32) | (Math.round(animationVector2D.getV2()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
    });
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda5
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.IntSizeToVector$lambda$0((IntSize) obj);
        }
    }, new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda6
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.IntSizeToVector$lambda$1((AnimationVector2D) obj);
        }
    });
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda7
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.RectToVector$lambda$0((Rect) obj);
        }
    }, new l() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda8
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return VectorConvertersKt.RectToVector$lambda$1((AnimationVector4D) obj);
        }
    });

    static final AnimationVector2D DpOffsetToVector$lambda$0(DpOffset dpOffset) {
        return new AnimationVector2D(DpOffset.m11225getXD9Ej5fM(dpOffset.m11233unboximpl()), DpOffset.m11227getYD9Ej5fM(dpOffset.m11233unboximpl()));
    }

    static final DpOffset DpOffsetToVector$lambda$1(AnimationVector2D animationVector2D) {
        float v1 = animationVector2D.getV1();
        float v2 = animationVector2D.getV2();
        return DpOffset.m11219boximpl((Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    static final AnimationVector1D DpToVector$lambda$0(Dp dp) {
        return new AnimationVector1D(dp.m11178unboximpl());
    }

    static final AnimationVector1D FloatToVector$lambda$0(float f2) {
        return new AnimationVector1D(f2);
    }

    static final AnimationVector2D IntOffsetToVector$lambda$0(IntOffset intOffset) {
        return new AnimationVector2D(IntOffset.m11296getXimpl(intOffset.m11305unboximpl()), IntOffset.m11297getYimpl(intOffset.m11305unboximpl()));
    }

    static final AnimationVector2D IntSizeToVector$lambda$0(IntSize intSize) {
        return new AnimationVector2D((int) (intSize.m11343unboximpl() >> 32), (int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    static final IntSize IntSizeToVector$lambda$1(AnimationVector2D animationVector2D) {
        int iRound = Math.round(animationVector2D.getV1());
        if (iRound < 0) {
            iRound = 0;
        }
        return IntSize.m11331boximpl((Math.round(animationVector2D.getV2()) >= 0 ? r4 : 0) | (iRound << 32));
    }

    static final AnimationVector1D IntToVector$lambda$0(int i2) {
        return new AnimationVector1D(i2);
    }

    static final int IntToVector$lambda$1(AnimationVector1D animationVector1D) {
        return (int) animationVector1D.getValue();
    }

    static final AnimationVector2D OffsetToVector$lambda$0(Offset offset) {
        return new AnimationVector2D(Float.intBitsToFloat((int) (offset.m7990unboximpl() >> 32)), Float.intBitsToFloat((int) (offset.m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    static final Offset OffsetToVector$lambda$1(AnimationVector2D animationVector2D) {
        float v1 = animationVector2D.getV1();
        float v2 = animationVector2D.getV2();
        return Offset.m7969boximpl((Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    static final AnimationVector4D RectToVector$lambda$0(Rect rect) {
        return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    static final Rect RectToVector$lambda$1(AnimationVector4D animationVector4D) {
        return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
    }

    static final AnimationVector2D SizeToVector$lambda$0(Size size) {
        return new AnimationVector2D(Float.intBitsToFloat((int) (size.m8054unboximpl() >> 32)), Float.intBitsToFloat((int) (size.m8054unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    static final Size SizeToVector$lambda$1(AnimationVector2D animationVector2D) {
        float v1 = animationVector2D.getV1();
        float v2 = animationVector2D.getV2();
        return Size.m8037boximpl((Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(l<? super T, ? extends V> lVar, l<? super V, ? extends T> lVar2) {
        return new TwoWayConverterImpl(lVar, lVar2);
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(Offset.Companion companion) {
        return OffsetToVector;
    }

    public static final float lerp(float f2, float f3, float f4) {
        return (f2 * (1.0f - f4)) + (f3 * f4);
    }

    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(Rect.Companion companion) {
        return RectToVector;
    }

    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(Size.Companion companion) {
        return SizeToVector;
    }

    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(Dp.Companion companion) {
        return DpToVector;
    }

    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(DpOffset.Companion companion) {
        return DpOffsetToVector;
    }

    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(IntSize.Companion companion) {
        return IntSizeToVector;
    }

    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(q qVar) {
        return FloatToVector;
    }

    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(v vVar) {
        return IntToVector;
    }
}
