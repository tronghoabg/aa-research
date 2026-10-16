package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ColorVectorConverterKt$ColorToVector$1 extends y implements l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<Color, AnimationVector4D> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ AnimationVector4D invoke(Color color) {
            return m1748invoke8_81llA(color.m8238unboximpl());
        }

        /* renamed from: invoke-8_81llA, reason: not valid java name */
        public final AnimationVector4D m1748invoke8_81llA(long j2) {
            long jM8225convertvNxB06k = Color.m8225convertvNxB06k(j2, ColorSpaces.INSTANCE.getOklab());
            return new AnimationVector4D(Color.m8230getAlphaimpl(jM8225convertvNxB06k), Color.m8234getRedimpl(jM8225convertvNxB06k), Color.m8233getGreenimpl(jM8225convertvNxB06k), Color.m8231getBlueimpl(jM8225convertvNxB06k));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements l<AnimationVector4D, Color> {
        final /* synthetic */ ColorSpace $colorSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.$colorSpace = colorSpace;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Color invoke(AnimationVector4D animationVector4D) {
            return Color.m8218boximpl(m1749invokevNxB06k(animationVector4D));
        }

        /* renamed from: invoke-vNxB06k, reason: not valid java name */
        public final long m1749invokevNxB06k(AnimationVector4D animationVector4D) {
            float v2 = animationVector4D.getV2();
            if (v2 < 0.0f) {
                v2 = 0.0f;
            }
            float v3 = animationVector4D.getV3();
            if (v3 < -0.5f) {
                v3 = -0.5f;
            }
            float v4 = animationVector4D.getV4();
            float f2 = v4 >= -0.5f ? v4 : -0.5f;
            float v1 = animationVector4D.getV1();
            float f3 = v1 >= 0.0f ? v1 : 0.0f;
            ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
            if (v2 > 1.0f) {
                v2 = 1.0f;
            }
            if (v3 > 0.5f) {
                v3 = 0.5f;
            }
            if (f2 > 0.5f) {
                f2 = 0.5f;
            }
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            return Color.m8225convertvNxB06k(ColorKt.Color(v2, v3, f2, f3, oklab), this.$colorSpace);
        }
    }

    ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // h.g.a.l
    public final TwoWayConverter<Color, AnimationVector4D> invoke(ColorSpace colorSpace) {
        return VectorConvertersKt.TwoWayConverter(AnonymousClass1.INSTANCE, new AnonymousClass2(colorSpace));
    }
}
