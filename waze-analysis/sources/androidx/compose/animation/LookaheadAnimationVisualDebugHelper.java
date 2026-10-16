package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.ArcAnimationSpec;
import androidx.compose.animation.core.ArcMode;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LookaheadAnimationVisualDebugHelper {
    public static final int $stable = 8;
    private boolean isProgressAnimationRunning;
    private final Animatable<Float, AnimationVector1D> reverseProgress = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private final Animatable<Float, AnimationVector1D> restartProgress = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private long sharedTransitionScopeOffset = Offset.Companion.m7996getZeroF1C5BW0();
    private long sharedTransitionScopeSize = IntSize.Companion.m11344getZeroYbymL2g();
    private long debugOffset = Offset.Companion.m7996getZeroF1C5BW0();
    private final Path debugPath = AndroidPath_androidKt.Path();
    private final Path centerPath = AndroidPath_androidKt.Path();
    private final List<Color> colors = i.i(Color.m8218boximpl(ColorKt.Color(4293542709L)), Color.m8218boximpl(ColorKt.Color(4294086695L)), Color.m8218boximpl(ColorKt.Color(4291905755L)), Color.m8218boximpl(ColorKt.Color(4282549748L)), Color.m8218boximpl(ColorKt.Color(4282038458L)));

    public static /* synthetic */ void calculatePath$animation$default(LookaheadAnimationVisualDebugHelper lookaheadAnimationVisualDebugHelper, FiniteAnimationSpec finiteAnimationSpec, Rect rect, Rect rect2, Rect rect3, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            rect3 = RectKt.m8019Rect3MmeM6k((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), 0.0f);
        }
        lookaheadAnimationVisualDebugHelper.calculatePath$animation(finiteAnimationSpec, rect, rect2, rect3);
    }

    private final void calculatePathCenter(float f2) {
        this.centerPath.rewind();
        Path path = this.centerPath;
        float f3 = -f2;
        path.moveTo(0.0f, f3);
        path.lineTo(f2, 0.0f);
        path.lineTo(0.0f, f2);
        path.lineTo(f3, 0.0f);
        path.close();
    }

    /* renamed from: findPositionAlongPerimeter-tuRUvjQ, reason: not valid java name */
    private final long m1784findPositionAlongPerimetertuRUvjQ(float f2) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long j2;
        long j3;
        long jFloatToRawIntBits2;
        int iFloatToRawIntBits2;
        long j4 = this.sharedTransitionScopeSize;
        long j5 = j4 >> 32;
        long j6 = j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        float f3 = (int) j5;
        if (f2 <= f3) {
            jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
            iFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
        } else {
            float f4 = (int) j6;
            if (f2 > f3 + f4) {
                float f5 = f3 + f3;
                float f6 = f5 + f4;
                if (f2 <= f6) {
                    jFloatToRawIntBits = Float.floatToRawIntBits(f6 - f2);
                    iFloatToRawIntBits = Float.floatToRawIntBits(f4);
                } else {
                    jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    iFloatToRawIntBits = Float.floatToRawIntBits(((f4 + f4) + f5) - f2);
                }
                j2 = jFloatToRawIntBits << 32;
                j3 = iFloatToRawIntBits & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                return j2 | j3;
            }
            jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
            iFloatToRawIntBits2 = Float.floatToRawIntBits(f2 - f3);
        }
        j2 = jFloatToRawIntBits2 << 32;
        j3 = iFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        return j2 | j3;
    }

    public final void calculatePath$animation(FiniteAnimationSpec<Rect> finiteAnimationSpec, Rect rect, Rect rect2, Rect rect3) {
        this.debugPath.rewind();
        if ((finiteAnimationSpec instanceof TweenSpec) || (finiteAnimationSpec instanceof SnapSpec) || ((finiteAnimationSpec instanceof ArcAnimationSpec) && ArcMode.m1885equalsimpl0(((ArcAnimationSpec) finiteAnimationSpec).m1881getMode9TMq4(), ArcMode.Companion.m1891getArcLinear9TMq4()))) {
            this.debugPath.moveTo(Float.intBitsToFloat((int) (rect.m8010getCenterF1C5BW0() >> 32)), Float.intBitsToFloat((int) (rect.m8010getCenterF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            this.debugPath.lineTo(Float.intBitsToFloat((int) (rect2.m8010getCenterF1C5BW0() >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & rect2.m8010getCenterF1C5BW0())));
            this.debugPath.mo8120translatek4lQ0M((-9223372034707292160L) ^ rect.m8010getCenterF1C5BW0());
            this.debugOffset = Offset.m7984minusMKHz9U(rect2.m8010getCenterF1C5BW0(), rect.m8010getCenterF1C5BW0());
            return;
        }
        TargetBasedAnimation TargetBasedAnimation = AnimationKt.TargetBasedAnimation(finiteAnimationSpec, VectorConvertersKt.getVectorConverter(Rect.Companion), rect, rect2, rect3);
        long durationNanos = TargetBasedAnimation.getDurationNanos();
        Rect rect4 = (Rect) TargetBasedAnimation.getValueFromNanos(0L);
        int i2 = 0;
        while (true) {
            long jM8010getCenterF1C5BW0 = ((Rect) TargetBasedAnimation.getValueFromNanos(durationNanos - ((long) (durationNanos * (i2 / 399.0f))))).m8010getCenterF1C5BW0();
            long j2 = jM8010getCenterF1C5BW0 >> 32;
            int i3 = (int) (jM8010getCenterF1C5BW0 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            int i4 = (int) j2;
            Path path = this.debugPath;
            if (i2 == 0) {
                path.moveTo(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3));
            } else {
                path.lineTo(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3));
            }
            if (i2 == 400) {
                this.debugPath.mo8120translatek4lQ0M((-9223372034707292160L) ^ rect4.m8010getCenterF1C5BW0());
                this.debugOffset = Offset.m7984minusMKHz9U(rect2.m8010getCenterF1C5BW0(), rect4.m8010getCenterF1C5BW0());
                return;
            }
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: chooseColor-vNxB06k$animation, reason: not valid java name */
    public final long m1785chooseColorvNxB06k$animation(Object obj) {
        if (LookaheadAnimationVisualDebugHelperKt.keyToColor.contains(obj)) {
            V v = LookaheadAnimationVisualDebugHelperKt.keyToColor.get(obj);
            x.c(v);
            return ((Color) v).m8238unboximpl();
        }
        if (LookaheadAnimationVisualDebugHelperKt.colorIndex >= this.colors.size()) {
            LookaheadAnimationVisualDebugHelperKt.colorIndex = 0;
        }
        long jM8238unboximpl = this.colors.get(LookaheadAnimationVisualDebugHelperKt.colorIndex).m8238unboximpl();
        LookaheadAnimationVisualDebugHelperKt.colorIndex++;
        LookaheadAnimationVisualDebugHelperKt.keyToColor.set(obj, Color.m8218boximpl(jM8238unboximpl));
        return jM8238unboximpl;
    }

    public final void drawGlobalVisualizations$animation(ContentDrawScope contentDrawScope) {
        long j2 = this.sharedTransitionScopeSize;
        long j3 = j2 >> 32;
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i3 = (int) j3;
        Brush brushM8179radialGradientP_VxKs$default = Brush.Companion.m8179radialGradientP_VxKs$default(Brush.Companion, i.i(Color.m8218boximpl(ColorKt.Color(4293542709L)), Color.m8218boximpl(ColorKt.Color(4282549748L)), Color.m8218boximpl(ColorKt.Color(4281641043L)), Color.m8218boximpl(ColorKt.Color(4294687748L)), Color.m8218boximpl(ColorKt.Color(4293542709L))), m1784findPositionAlongPerimetertuRUvjQ((i3 + i3 + i2 + i2) * this.restartProgress.getValue().floatValue()), 2000.0f, 0, 8, (Object) null);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        Paint Paint = AndroidPaint_androidKt.Paint();
        brushM8179radialGradientP_VxKs$default.mo8173applyToPq9zytI(contentDrawScope.mo8751getSizeNHjbRc(), Paint, 1.0f);
        Paint.mo8108setStylek9PVt8s(PaintingStyle.Companion.m8539getStrokeTiuSbCo());
        Paint.setStrokeWidth((contentDrawScope.mo2127toPx0680j_4(8.0f) * this.reverseProgress.getValue().floatValue()) + contentDrawScope.mo2127toPx0680j_4(4.0f));
        canvas.save();
        canvas.translate(-Float.intBitsToFloat((int) (this.sharedTransitionScopeOffset >> 32)), -Float.intBitsToFloat((int) (this.sharedTransitionScopeOffset & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        long j4 = this.sharedTransitionScopeSize;
        canvas.drawRect(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), Paint);
        canvas.restore();
    }

    /* renamed from: drawInactiveVisualizations-3IgeMak$animation, reason: not valid java name */
    public final void m1786drawInactiveVisualizations3IgeMak$animation(ContentDrawScope contentDrawScope, long j2, boolean z, float f2, Object obj, TextMeasurer textMeasurer) {
        long jColor;
        if (Color.m8229equalsimpl0(j2, Color.Companion.m8264getUnspecified0d7_KjU())) {
            DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope, Color.Companion.m8265getWhite0d7_KjU(), 0L, 0L, 0.0f, new Stroke(f2 + f2, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
            jColor = ColorKt.Color(4288323750L);
        } else {
            jColor = j2;
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope2, jColor, 0L, 0L, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        if (!z || textMeasurer == null) {
            return;
        }
        TextPainterKt.m10531drawTextd8rzKo(contentDrawScope2, textMeasurer.m10521measurewNUYSr0(obj.toString(), (1004 & 2) != 0 ? TextStyle.Companion.getDefault() : new TextStyle(jColor, TextUnitKt.getSp(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, Color.m8227copywmQWz5c$default(Color.Companion.m8265getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16775164, (o) null), (1004 & 4) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : 0, (!((1004 & 8) == 0)) | false, (1004 & 16) != 0 ? Integer.MAX_VALUE : 0, (1004 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : 0L, (1004 & 64) != 0 ? textMeasurer.defaultLayoutDirection : null, (1004 & 128) != 0 ? textMeasurer.defaultDensity : null, (1004 & 256) != 0 ? textMeasurer.defaultFontFamilyResolver : null, ((1004 & 512) == 0) & false), (250 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : 0L, (250 & 4) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : (Float.floatToRawIntBits(10.0f) << 32) | (Float.floatToRawIntBits(10.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : 0);
    }

    /* renamed from: drawLocalVisualizations-0XenJco$animation, reason: not valid java name */
    public final void m1787drawLocalVisualizations0XenJco$animation(ContentDrawScope contentDrawScope, long j2, long j3, long j4, Rect rect, long j5, boolean z, float f2, Object obj, TextMeasurer textMeasurer) throws Throwable {
        ContentDrawScope contentDrawScope2;
        int i2;
        float f3;
        long j6;
        float f4;
        float f5;
        float f6;
        char c2;
        Object obj2;
        long jM1785chooseColorvNxB06k$animation;
        ContentDrawScope contentDrawScope3;
        if (Color.m8229equalsimpl0(j2, Color.Companion.m8263getTransparent0d7_KjU())) {
            return;
        }
        float f7 = f2 + f2;
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (Color.m8229equalsimpl0(j2, Color.Companion.m8264getUnspecified0d7_KjU())) {
            contentDrawScope2 = contentDrawScope;
            i2 = 2;
            DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope2, Color.Companion.m8265getWhite0d7_KjU(), 0L, 0L, 0.0f, new Stroke(f7, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
            float fIntBitsToFloat = Float.intBitsToFloat(i3) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat(i4) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            contentDrawScope2.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
            float f8 = -fIntBitsToFloat2;
            float f9 = -fIntBitsToFloat;
            try {
                try {
                    j6 = 4294967295L;
                    f3 = f8;
                    try {
                        DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope2, Color.Companion.m8265getWhite0d7_KjU(), 0L, j4, 0.0f, new Stroke(f7, 0.0f, 0, 0, null, 30, null), null, 0, 106, null);
                        contentDrawScope2.getDrawContext().getTransform().translate(f9, f3);
                        float fIntBitsToFloat3 = (Float.intBitsToFloat(i3) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() >> 32))) - Float.intBitsToFloat((int) (this.debugOffset >> 32));
                        float fIntBitsToFloat4 = (Float.intBitsToFloat(i4) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) - Float.intBitsToFloat((int) (this.debugOffset & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                        contentDrawScope2.getDrawContext().getTransform().translate(fIntBitsToFloat3, fIntBitsToFloat4);
                        f4 = -fIntBitsToFloat4;
                        f5 = -fIntBitsToFloat3;
                        try {
                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j4 >> 32)) * 0.5f;
                            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * 0.5f;
                            contentDrawScope2.getDrawContext().getTransform().translate(fIntBitsToFloat5, fIntBitsToFloat6);
                            try {
                                try {
                                    c2 = ' ';
                                    f6 = fIntBitsToFloat6;
                                    try {
                                        DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, this.debugPath, Color.Companion.m8265getWhite0d7_KjU(), 0.0f, new Stroke(f7, 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.Companion, new float[]{20.0f, 10.0f}, 0.0f, 2, null), 14, null), null, 0, 52, null);
                                        contentDrawScope2.getDrawContext().getTransform().translate(-fIntBitsToFloat5, -f6);
                                        long j7 = j5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                                        contentDrawScope2.getDrawContext().getTransform().translate(f5, f4);
                                        calculatePathCenter(3.5f * f2);
                                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (j5 >> 32));
                                        f5 = -fIntBitsToFloat7;
                                        float fIntBitsToFloat8 = Float.intBitsToFloat((int) j7);
                                        f4 = -fIntBitsToFloat8;
                                        contentDrawScope2.getDrawContext().getTransform().translate(fIntBitsToFloat7, fIntBitsToFloat8);
                                        try {
                                            DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, this.centerPath, Color.Companion.m8265getWhite0d7_KjU(), 0.0f, null, null, 0, 60, null);
                                            contentDrawScope2.getDrawContext().getTransform().translate(f5, f4);
                                            obj2 = obj;
                                            jM1785chooseColorvNxB06k$animation = m1785chooseColorvNxB06k$animation(obj2);
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        contentDrawScope2.getDrawContext().getTransform().translate(-fIntBitsToFloat5, -f6);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    f6 = fIntBitsToFloat6;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                f6 = fIntBitsToFloat6;
                            }
                        } finally {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        contentDrawScope2.getDrawContext().getTransform().translate(f9, f3);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    f3 = f8;
                }
            } catch (Throwable th6) {
                th = th6;
                f3 = f8;
            }
        } else {
            jM1785chooseColorvNxB06k$animation = j2;
            j6 = 4294967295L;
            c2 = ' ';
            i2 = 2;
            obj2 = obj;
        }
        contentDrawScope2 = contentDrawScope;
        DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope2, jM1785chooseColorvNxB06k$animation, 0L, 0L, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        float fIntBitsToFloat9 = Float.intBitsToFloat(i3) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() >> c2));
        float fIntBitsToFloat10 = Float.intBitsToFloat(i4) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() & j6));
        contentDrawScope2.getDrawContext().getTransform().translate(fIntBitsToFloat9, fIntBitsToFloat10);
        f4 = -fIntBitsToFloat10;
        f5 = -fIntBitsToFloat9;
        try {
            DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope2, jM1785chooseColorvNxB06k$animation, 0L, j4, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 106, null);
            contentDrawScope2.getDrawContext().getTransform().translate(f5, f4);
            float fIntBitsToFloat11 = (Float.intBitsToFloat(i3) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() >> c2))) - Float.intBitsToFloat((int) (this.debugOffset >> c2));
            float fIntBitsToFloat12 = (Float.intBitsToFloat(i4) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() & j6))) - Float.intBitsToFloat((int) (this.debugOffset & j6));
            contentDrawScope2.getDrawContext().getTransform().translate(fIntBitsToFloat11, fIntBitsToFloat12);
            f4 = -fIntBitsToFloat12;
            f5 = -fIntBitsToFloat11;
            try {
                float fIntBitsToFloat13 = Float.intBitsToFloat((int) (j4 >> c2)) * 0.5f;
                float fIntBitsToFloat14 = Float.intBitsToFloat((int) (j4 & j6)) * 0.5f;
                contentDrawScope2.getDrawContext().getTransform().translate(fIntBitsToFloat13, fIntBitsToFloat14);
                try {
                    float[] fArr = new float[i2];
                    // fill-array-data instruction
                    fArr[0] = 20.0f;
                    fArr[1] = 10.0f;
                    try {
                        DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, this.debugPath, jM1785chooseColorvNxB06k$animation, 0.0f, new Stroke(f2, 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.Companion, fArr, 0.0f, i2, null), 14, null), null, 0, 52, null);
                        contentDrawScope2.getDrawContext().getTransform().translate(-fIntBitsToFloat13, -fIntBitsToFloat14);
                        contentDrawScope2.getDrawContext().getTransform().translate(f5, f4);
                        calculatePathCenter(3.0f * f2);
                        float fIntBitsToFloat15 = Float.intBitsToFloat((int) (j5 >> c2));
                        f5 = -fIntBitsToFloat15;
                        float fIntBitsToFloat16 = Float.intBitsToFloat((int) (j5 & j6));
                        f4 = -fIntBitsToFloat16;
                        contentDrawScope2.getDrawContext().getTransform().translate(fIntBitsToFloat15, fIntBitsToFloat16);
                        try {
                            try {
                                DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, this.centerPath, jM1785chooseColorvNxB06k$animation, 0.0f, null, null, 0, 60, null);
                                if (!z || textMeasurer == null) {
                                    return;
                                }
                                TextLayoutResult textLayoutResultM10521measurewNUYSr0 = textMeasurer.m10521measurewNUYSr0(obj2.toString(), (1004 & 2) != 0 ? TextStyle.Companion.getDefault() : new TextStyle(jM1785chooseColorvNxB06k$animation, TextUnitKt.getSp(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, Color.m8227copywmQWz5c$default(Color.Companion.m8265getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16775164, (o) null), (1004 & 4) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : 0, (!((1004 & 8) == 0)) | false, (1004 & 16) != 0 ? Integer.MAX_VALUE : 0, (1004 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : 0L, (1004 & 64) != 0 ? textMeasurer.defaultLayoutDirection : null, (1004 & 128) != 0 ? textMeasurer.defaultDensity : null, (1004 & 256) != 0 ? textMeasurer.defaultFontFamilyResolver : null, ((1004 & 512) == 0) & false);
                                TextPainterKt.m10531drawTextd8rzKo(contentDrawScope2, textLayoutResultM10521measurewNUYSr0, (250 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : 0L, (250 & 4) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : (Float.floatToRawIntBits(10.0f) << c2) | (Float.floatToRawIntBits(10.0f) & j6), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : 0);
                                ContentDrawScope contentDrawScope4 = contentDrawScope2;
                                float fIntBitsToFloat17 = Float.intBitsToFloat(i3) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() >> c2));
                                float fIntBitsToFloat18 = Float.intBitsToFloat(i4) - Float.intBitsToFloat((int) (rect.m8015getTopLeftF1C5BW0() & j6));
                                contentDrawScope4.getDrawContext().getTransform().translate(fIntBitsToFloat17, fIntBitsToFloat18);
                                float f10 = -fIntBitsToFloat18;
                                float f11 = -fIntBitsToFloat17;
                                try {
                                    try {
                                        TextPainterKt.m10531drawTextd8rzKo(contentDrawScope4, textLayoutResultM10521measurewNUYSr0, (250 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : 0L, (250 & 4) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : (Float.floatToRawIntBits(10.0f) << c2) | (Float.floatToRawIntBits(10.0f) & j6), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : 0);
                                        contentDrawScope4.getDrawContext().getTransform().translate(f11, f10);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        contentDrawScope4 = contentDrawScope4;
                                        contentDrawScope4.getDrawContext().getTransform().translate(f11, f10);
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                contentDrawScope3 = contentDrawScope2;
                                contentDrawScope3.getDrawContext().getTransform().translate(f5, f4);
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        contentDrawScope3 = contentDrawScope2;
                        contentDrawScope3.getDrawContext().getTransform().translate(-fIntBitsToFloat13, -fIntBitsToFloat14);
                        throw th;
                    }
                } catch (Throwable th12) {
                    th = th12;
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: drawMultipleMatchesElement-sW7UJKQ$animation, reason: not valid java name */
    public final void m1788drawMultipleMatchesElementsW7UJKQ$animation(ContentDrawScope contentDrawScope, long j2, boolean z, Object obj, int i2, TextMeasurer textMeasurer, float f2) {
        String str;
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope2, Color.Companion.m8265getWhite0d7_KjU(), 0L, 0L, 0.0f, new Stroke(f2 + f2, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope2, j2, 0L, 0L, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        if (z) {
            switch (i2) {
                case 2:
                    str = "2️⃣";
                    break;
                case 3:
                    str = "3️⃣";
                    break;
                case 4:
                    str = "4️⃣";
                    break;
                case 5:
                    str = "5️⃣";
                    break;
                case 6:
                    str = "6️⃣";
                    break;
                case 7:
                    str = "7️⃣";
                    break;
                case 8:
                    str = "8️⃣";
                    break;
                case 9:
                    str = "9️⃣";
                    break;
                default:
                    str = "> 9️⃣";
                    break;
            }
            TextPainterKt.m10531drawTextd8rzKo(contentDrawScope2, textMeasurer.m10521measurewNUYSr0(obj + ": " + str + " matches", (1004 & 2) != 0 ? TextStyle.Companion.getDefault() : new TextStyle(Color.Companion.m8265getWhite0d7_KjU(), TextUnitKt.getSp(22), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, Color.m8227copywmQWz5c$default(j2, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16775160, (o) null), (1004 & 4) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : 0, (!((1004 & 8) == 0)) | false, (1004 & 16) != 0 ? Integer.MAX_VALUE : 0, (1004 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : 0L, (1004 & 64) != 0 ? textMeasurer.defaultLayoutDirection : null, (1004 & 128) != 0 ? textMeasurer.defaultDensity : null, (1004 & 256) != 0 ? textMeasurer.defaultFontFamilyResolver : null, ((1004 & 512) == 0) & false), (250 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : 0L, (250 & 4) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : (Float.floatToRawIntBits(10.0f) << 32) | (Float.floatToRawIntBits(10.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : 0);
        }
    }

    /* renamed from: drawOverlay-4WTKRHQ$animation, reason: not valid java name */
    public final void m1789drawOverlay4WTKRHQ$animation(ContentDrawScope contentDrawScope, long j2) {
        DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope, j2, 0L, 0L, 0.0f, null, null, 0, 126, null);
    }

    /* renamed from: drawUnmatchedElement-3IgeMak$animation, reason: not valid java name */
    public final void m1790drawUnmatchedElement3IgeMak$animation(ContentDrawScope contentDrawScope, long j2, boolean z, Object obj, TextMeasurer textMeasurer, float f2) throws Throwable {
        DrawContext drawContext;
        long j3;
        long j4;
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope2, Color.Companion.m8265getWhite0d7_KjU(), 0L, 0L, 0.0f, new Stroke(f2 + f2, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        DrawScope.CC.m8836drawRectnJ9OG0$default(contentDrawScope2, j2, 0L, 0L, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope2.mo8751getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope2.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        int iM8217getIntersectrtfAjoo = ClipOp.Companion.m8217getIntersectrtfAjoo();
        DrawContext drawContext2 = contentDrawScope2.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext2.mo8758getSizeNHjbRc();
        drawContext2.getCanvas().save();
        try {
            drawContext2.getTransform().mo8761clipRectN_I0leg(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iM8217getIntersectrtfAjoo);
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope2.mo8751getSizeNHjbRc() >> 32));
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (contentDrawScope2.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            float f3 = -fIntBitsToFloat4;
            while (f3 < fIntBitsToFloat3) {
                try {
                    float f4 = fIntBitsToFloat4;
                    j4 = jMo8758getSizeNHjbRc;
                    drawContext = drawContext2;
                    try {
                        DrawScope.CC.m8828drawLineNGM6Ib0$default(contentDrawScope2, Color.m8227copywmQWz5c$default(j2, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(f3 + fIntBitsToFloat4) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f2, 0, null, 0.0f, null, 0, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL, null);
                        f3 += 4.0f * f2;
                        drawContext2 = drawContext;
                        fIntBitsToFloat4 = f4;
                        jMo8758getSizeNHjbRc = j4;
                    } catch (Throwable th) {
                        th = th;
                        j3 = j4;
                        drawContext.getCanvas().restore();
                        drawContext.mo8759setSizeuvyYCjk(j3);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    drawContext = drawContext2;
                    j4 = jMo8758getSizeNHjbRc;
                }
            }
            DrawContext drawContext3 = drawContext2;
            drawContext3.getCanvas().restore();
            drawContext3.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            if (z) {
                Objects.toString(obj);
                TextPainterKt.m10531drawTextd8rzKo(contentDrawScope2, textMeasurer.m10521measurewNUYSr0(String.valueOf(obj).concat(": 0️⃣ matches"), (1004 & 2) != 0 ? TextStyle.Companion.getDefault() : new TextStyle(Color.Companion.m8265getWhite0d7_KjU(), TextUnitKt.getSp(22), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, Color.m8227copywmQWz5c$default(j2, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16775160, (o) null), (1004 & 4) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : 0, (!((1004 & 8) == 0)) | false, (1004 & 16) != 0 ? Integer.MAX_VALUE : 0, (1004 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : 0L, (1004 & 64) != 0 ? textMeasurer.defaultLayoutDirection : null, (1004 & 128) != 0 ? textMeasurer.defaultDensity : null, (1004 & 256) != 0 ? textMeasurer.defaultFontFamilyResolver : null, ((1004 & 512) == 0) & false), (250 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : 0L, (250 & 4) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : (Float.floatToRawIntBits(10.0f) << 32) | (Float.floatToRawIntBits(10.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : 0);
            }
        } catch (Throwable th3) {
            th = th3;
            drawContext = drawContext2;
            j3 = jMo8758getSizeNHjbRc;
        }
    }

    public final Path getCenterPath() {
        return this.centerPath;
    }

    public final List<Color> getColors() {
        return this.colors;
    }

    /* renamed from: getDebugOffset-F1C5BW0, reason: not valid java name */
    public final long m1791getDebugOffsetF1C5BW0() {
        return this.debugOffset;
    }

    public final Path getDebugPath() {
        return this.debugPath;
    }

    /* renamed from: getSharedTransitionScopeOffset-F1C5BW0, reason: not valid java name */
    public final long m1792getSharedTransitionScopeOffsetF1C5BW0() {
        return this.sharedTransitionScopeOffset;
    }

    /* renamed from: getSharedTransitionScopeSize-YbymL2g, reason: not valid java name */
    public final long m1793getSharedTransitionScopeSizeYbymL2g() {
        return this.sharedTransitionScopeSize;
    }

    public final void onAttach$animation(af afVar) {
        if (this.isProgressAnimationRunning) {
            return;
        }
        this.isProgressAnimationRunning = true;
        aj.z(afVar, null, null, new LookaheadAnimationVisualDebugHelper$onAttach$1(this, null), 3);
        aj.z(afVar, null, null, new LookaheadAnimationVisualDebugHelper$onAttach$2(this, null), 3);
    }

    public final void onDetach$animation(af afVar) {
        if (this.isProgressAnimationRunning) {
            this.isProgressAnimationRunning = false;
            aj.z(afVar, null, null, new LookaheadAnimationVisualDebugHelper$onDetach$1(this, null), 3);
        }
    }

    /* renamed from: setDebugOffset-k-4lQ0M, reason: not valid java name */
    public final void m1794setDebugOffsetk4lQ0M(long j2) {
        this.debugOffset = j2;
    }

    /* renamed from: setSharedTransitionScopeOffset-k-4lQ0M, reason: not valid java name */
    public final void m1795setSharedTransitionScopeOffsetk4lQ0M(long j2) {
        this.sharedTransitionScopeOffset = j2;
    }

    /* renamed from: setSharedTransitionScopeSize-ozmzZPI, reason: not valid java name */
    public final void m1796setSharedTransitionScopeSizeozmzZPI(long j2) {
        this.sharedTransitionScopeSize = j2;
    }

    /* renamed from: updateDrawingCoordinates-CowoxoA$animation, reason: not valid java name */
    public final void m1797updateDrawingCoordinatesCowoxoA$animation(long j2, long j3) {
        this.sharedTransitionScopeOffset = j2;
        this.sharedTransitionScopeSize = j3;
    }

    public static /* synthetic */ void getColors$annotations() {
    }
}
