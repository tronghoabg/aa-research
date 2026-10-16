package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ProgressIndicatorKt {
    public static final float CircularAdditionalRotationDegreesTarget = 360.0f;
    public static final int CircularAnimationAdditionalRotationDelay = 1500;
    public static final int CircularAnimationAdditionalRotationDuration = 300;
    public static final int CircularAnimationProgressDuration = 6000;
    public static final float CircularGlobalRotationDegreesTarget = 1080.0f;
    public static final float CircularIndeterminateMaxProgress = 0.87f;
    public static final float CircularIndeterminateMinProgress = 0.1f;
    public static final int FirstLineHeadDelay = 0;
    public static final int FirstLineHeadDuration = 1000;
    public static final int FirstLineTailDelay = 250;
    public static final int FirstLineTailDuration = 1000;
    public static final int LinearAnimationDuration = 1750;
    private static final float LinearIndicatorWidth = 240.0f;
    public static final int SecondLineHeadDelay = 650;
    public static final int SecondLineHeadDuration = 850;
    public static final int SecondLineTailDelay = 900;
    public static final int SecondLineTailDuration = 850;
    private static final float LinearIndicatorHeight = LinearProgressIndicatorTokens.INSTANCE.m6807getHeightD9Ej5fM();
    private static final float StopIndicatorTrailingSpace = 6.0f;
    private static final float CircularIndicatorDiameter = CircularProgressIndicatorTokens.INSTANCE.m6516getSizeD9Ej5fM();
    private static final CubicBezierEasing LinearIndeterminateProgressEasing = MotionTokens.INSTANCE.getEasingEmphasizedAccelerateCubicBezier();
    private static final CubicBezierEasing CircularProgressEasing = MotionTokens.INSTANCE.getEasingStandardCubicBezier();

    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* renamed from: CircularProgressIndicator-4lLiAd8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5374CircularProgressIndicator4lLiAd8(androidx.compose.ui.Modifier r33, long r34, float r36, long r37, int r39, float r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5374CircularProgressIndicator4lLiAd8(androidx.compose.ui.Modifier, long, float, long, int, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5375CircularProgressIndicatorDUhRLBM(final float r22, androidx.compose.ui.Modifier r23, long r24, float r26, long r27, int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5375CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* renamed from: CircularProgressIndicator-IyT6zlY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5377CircularProgressIndicatorIyT6zlY(final h.g.a.a<java.lang.Float> r24, androidx.compose.ui.Modifier r25, long r26, float r28, long r29, int r31, float r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5377CircularProgressIndicatorIyT6zlY(h.g.a.a, androidx.compose.ui.Modifier, long, float, long, int, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m5378CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier r20, long r21, float r23, long r24, int r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5378CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m5379CircularProgressIndicatorMBs18nI(final float r18, androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5379CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m5380CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5380CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CircularProgressIndicator_4lLiAd8$lambda$1$0(State state, int i2, float f2, float f3, State state2, State state3, long j2, Stroke stroke, long j3, DrawScope drawScope) {
        float fFloatValue = ((Number) state.getValue()).floatValue() * 360.0f;
        if (!StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8632getButtKaPHkGw()) && Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) <= Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32))) {
            f2 += f3;
        }
        float f4 = (f2 / ((float) (drawScope.mo2123toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32))) * 3.141592653589793d))) * 360.0f;
        float fFloatValue2 = ((Number) state2.getValue()).floatValue() + ((Number) state3.getValue()).floatValue();
        long jMo8750getCenterF1C5BW0 = drawScope.mo8750getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8764rotateUv8p0NA(fFloatValue2, jMo8750getCenterF1C5BW0);
            float fMin = fFloatValue + Math.min(fFloatValue, f4);
            float fMin2 = Math.min(fFloatValue, f4);
            m5388drawCircularIndicator42QJj7c(drawScope, fMin, (360.0f - fFloatValue) - (fMin2 + fMin2), j2, stroke);
            m5390drawDeterminateCircularIndicator42QJj7c(drawScope, 0.0f, fFloatValue, j3, stroke);
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            return ab.f48028a;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            throw th;
        }
    }

    static final ab CircularProgressIndicator_4lLiAd8$lambda$2(Modifier modifier, long j2, float f2, long j3, int i2, float f3, int i3, int i4, Composer composer, int i5) {
        m5374CircularProgressIndicator4lLiAd8(modifier, j2, f2, j3, i2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab CircularProgressIndicator_DUhRLBM$lambda$0(a aVar, Modifier modifier, long j2, float f2, long j3, int i2, int i3, int i4, Composer composer, int i5) {
        m5376CircularProgressIndicatorDUhRLBM(aVar, modifier, j2, f2, j3, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab CircularProgressIndicator_DUhRLBM$lambda$2(float f2, Modifier modifier, long j2, float f3, long j3, int i2, int i3, int i4, Composer composer, int i5) {
        m5375CircularProgressIndicatorDUhRLBM(f2, modifier, j2, f3, j3, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_IyT6zlY$lambda$0$0(a aVar) {
        float fFloatValue = ((Number) aVar.invoke()).floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 1.0f) {
            return 1.0f;
        }
        return fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CircularProgressIndicator_IyT6zlY$lambda$2$0(a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object objInvoke = aVar.invoke();
        if (true == Float.isNaN(((Number) objInvoke).floatValue())) {
            objInvoke = null;
        }
        Float f2 = (Float) objInvoke;
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(f2 != null ? f2.floatValue() : 0.0f, n.b(0.0f, 1.0f), 0, 4, null));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CircularProgressIndicator_IyT6zlY$lambda$3$0(a aVar, int i2, float f2, float f3, long j2, Stroke stroke, long j3, DrawScope drawScope) {
        float fFloatValue = ((Number) aVar.invoke()).floatValue() * 360.0f;
        if (!StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8632getButtKaPHkGw()) && Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) <= Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32))) {
            f2 += f3;
        }
        float f4 = (f2 / ((float) (drawScope.mo2123toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32))) * 3.141592653589793d))) * 360.0f;
        float fMin = 270.0f + fFloatValue + Math.min(fFloatValue, f4);
        float fMin2 = Math.min(fFloatValue, f4);
        m5388drawCircularIndicator42QJj7c(drawScope, fMin, (360.0f - fFloatValue) - (fMin2 + fMin2), j2, stroke);
        m5390drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue, j3, stroke);
        return ab.f48028a;
    }

    static final ab CircularProgressIndicator_IyT6zlY$lambda$4(a aVar, Modifier modifier, long j2, float f2, long j3, int i2, float f3, int i3, int i4, Composer composer, int i5) {
        m5377CircularProgressIndicatorIyT6zlY(aVar, modifier, j2, f2, j3, i2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab CircularProgressIndicator_LxG7B9w$lambda$0(Modifier modifier, long j2, float f2, long j3, int i2, int i3, int i4, Composer composer, int i5) {
        m5378CircularProgressIndicatorLxG7B9w(modifier, j2, f2, j3, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab CircularProgressIndicator_MBs18nI$lambda$0(float f2, Modifier modifier, long j2, float f3, int i2, int i3, Composer composer, int i4) {
        m5379CircularProgressIndicatorMBs18nI(f2, modifier, j2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab CircularProgressIndicator_aM_cp0Q$lambda$0(Modifier modifier, long j2, float f2, int i2, int i3, Composer composer, int i4) {
        m5380CircularProgressIndicatoraMcp0Q(modifier, j2, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m5381LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier r18, long r19, long r21, int r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5381LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* renamed from: LinearProgressIndicator-GJbTh5U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5382LinearProgressIndicatorGJbTh5U(final h.g.a.a<java.lang.Float> r30, androidx.compose.ui.Modifier r31, long r32, long r34, int r36, float r37, h.g.a.l<? super androidx.compose.ui.graphics.drawscope.DrawScope, h.ab> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5382LinearProgressIndicatorGJbTh5U(h.g.a.a, androidx.compose.ui.Modifier, long, long, int, float, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m5383LinearProgressIndicatorRIQooxk(Modifier modifier, long j2, long j3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long linearColor;
        long linearTrackColor;
        final Modifier modifier3;
        Modifier modifier4;
        Composer composerStartRestartGroup = composer.startRestartGroup(585576195);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0) {
                linearColor = j2;
                if (composerStartRestartGroup.changed(linearColor)) {
                    i6 = 32;
                }
            } else {
                linearColor = j2;
            }
            i4 |= i6;
        } else {
            linearColor = j2;
        }
        if ((i2 & 384) == 0) {
            int i7 = 128;
            if ((i3 & 4) == 0) {
                linearTrackColor = j3;
                if (composerStartRestartGroup.changed(linearTrackColor)) {
                    i7 = 256;
                }
            } else {
                linearTrackColor = j3;
            }
            i4 |= i7;
        } else {
            linearTrackColor = j3;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            int i8 = i3 & 4;
            int i9 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i5 != 0 ? Modifier.Companion : modifier2;
                if (i9 != 0) {
                    i4 &= -113;
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                }
                if (i8 != 0) {
                    i4 &= -897;
                    modifier4 = companion;
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                } else {
                    modifier4 = companion;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i9 != 0) {
                    i4 &= -113;
                }
                if (i8 != 0) {
                    i4 &= -897;
                }
                modifier4 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585576195, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:393)");
            }
            m5387LinearProgressIndicatorrIrjwxo(modifier4, linearColor, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m5368getLinearStrokeCapKaPHkGw(), 0.0f, composerStartRestartGroup, (i4 & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS | (i4 & 112) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        final long j4 = linearColor;
        final long j5 = linearTrackColor;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda24
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ProgressIndicatorKt.LinearProgressIndicator_RIQooxk$lambda$0(modifier3, j4, j5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5384LinearProgressIndicator_5eSRE(final float r21, androidx.compose.ui.Modifier r22, long r23, long r25, int r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5384LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m5386LinearProgressIndicatoreaDK9VM(final float r18, androidx.compose.ui.Modifier r19, long r20, long r22, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5386LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dd  */
    /* renamed from: LinearProgressIndicator-rIrjwxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5387LinearProgressIndicatorrIrjwxo(androidx.compose.ui.Modifier r29, long r30, long r32, int r34, float r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5387LinearProgressIndicatorrIrjwxo(androidx.compose.ui.Modifier, long, long, int, float, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab LinearProgressIndicator_2cYBFYY$lambda$0(Modifier modifier, long j2, long j3, int i2, int i3, int i4, Composer composer, int i5) {
        m5381LinearProgressIndicator2cYBFYY(modifier, j2, j3, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab LinearProgressIndicator_GJbTh5U$lambda$0$0(long j2, int i2, DrawScope drawScope) {
        ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
        progressIndicatorDefaults.m5362drawStopIndicatorEgI2THU(drawScope, progressIndicatorDefaults.m5369getLinearTrackStopIndicatorSizeD9Ej5fM(), j2, i2);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_GJbTh5U$lambda$1$0(a aVar) {
        float fFloatValue = ((Number) aVar.invoke()).floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 1.0f) {
            return 1.0f;
        }
        return fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab LinearProgressIndicator_GJbTh5U$lambda$2$0(a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object objInvoke = aVar.invoke();
        if (true == Float.isNaN(((Number) objInvoke).floatValue())) {
            objInvoke = null;
        }
        Float f2 = (Float) objInvoke;
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(f2 != null ? f2.floatValue() : 0.0f, n.b(0.0f, 1.0f), 0, 4, null));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab LinearProgressIndicator_GJbTh5U$lambda$3$0(int i2, float f2, a aVar, long j2, long j3, l lVar, DrawScope drawScope) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        if (!StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8632getButtKaPHkGw()) && Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & drawScope.mo8751getSizeNHjbRc())) <= Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32))) {
            f2 += drawScope.mo2123toDpu2uoSUM(fIntBitsToFloat);
        }
        float f3 = f2 / drawScope.mo2123toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)));
        float fFloatValue = ((Number) aVar.invoke()).floatValue();
        float fMin = fFloatValue + Math.min(fFloatValue, f3);
        if (fMin <= 1.0f) {
            m5392drawLinearIndicatorqYKTg0g(drawScope, fMin, 1.0f, j2, fIntBitsToFloat, i2);
        }
        m5392drawLinearIndicatorqYKTg0g(drawScope, 0.0f, fFloatValue, j3, fIntBitsToFloat, i2);
        lVar.invoke(drawScope);
        return ab.f48028a;
    }

    static final ab LinearProgressIndicator_GJbTh5U$lambda$4(a aVar, Modifier modifier, long j2, long j3, int i2, float f2, l lVar, int i3, int i4, Composer composer, int i5) {
        m5382LinearProgressIndicatorGJbTh5U(aVar, modifier, j2, j3, i2, f2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab LinearProgressIndicator_RIQooxk$lambda$0(Modifier modifier, long j2, long j3, int i2, int i3, Composer composer, int i4) {
        m5383LinearProgressIndicatorRIQooxk(modifier, j2, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LinearProgressIndicator__5eSR_E$lambda$0(a aVar, Modifier modifier, long j2, long j3, int i2, int i3, int i4, Composer composer, int i5) {
        m5385LinearProgressIndicator_5eSRE(aVar, modifier, j2, j3, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab LinearProgressIndicator__5eSR_E$lambda$2(float f2, Modifier modifier, long j2, long j3, int i2, int i3, int i4, Composer composer, int i5) {
        m5384LinearProgressIndicator_5eSRE(f2, modifier, j2, j3, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab LinearProgressIndicator_eaDK9VM$lambda$0(float f2, Modifier modifier, long j2, long j3, int i2, int i3, Composer composer, int i4) {
        m5386LinearProgressIndicatoreaDK9VM(f2, modifier, j2, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab LinearProgressIndicator_rIrjwxo$lambda$0$0(int i2, float f2, State state, long j2, State state2, long j3, State state3, State state4, DrawScope drawScope) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        if (!StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8632getButtKaPHkGw()) && Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & drawScope.mo8751getSizeNHjbRc())) <= Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32))) {
            f2 += drawScope.mo2123toDpu2uoSUM(fIntBitsToFloat);
        }
        float f3 = f2 / drawScope.mo2123toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)));
        if (((Number) state.getValue()).floatValue() < 1.0f - f3) {
            m5392drawLinearIndicatorqYKTg0g(drawScope, ((Number) state.getValue()).floatValue() > 0.0f ? ((Number) state.getValue()).floatValue() + f3 : 0.0f, 1.0f, j2, fIntBitsToFloat, i2);
        }
        if (((Number) state.getValue()).floatValue() - ((Number) state2.getValue()).floatValue() > 0.0f) {
            m5392drawLinearIndicatorqYKTg0g(drawScope, ((Number) state.getValue()).floatValue(), ((Number) state2.getValue()).floatValue(), j3, fIntBitsToFloat, i2);
        }
        if (((Number) state2.getValue()).floatValue() > f3) {
            m5392drawLinearIndicatorqYKTg0g(drawScope, ((Number) state3.getValue()).floatValue() > 0.0f ? ((Number) state3.getValue()).floatValue() + f3 : 0.0f, ((Number) state2.getValue()).floatValue() < 1.0f ? ((Number) state2.getValue()).floatValue() - f3 : 1.0f, j2, fIntBitsToFloat, i2);
        }
        if (((Number) state3.getValue()).floatValue() - ((Number) state4.getValue()).floatValue() > 0.0f) {
            m5392drawLinearIndicatorqYKTg0g(drawScope, ((Number) state3.getValue()).floatValue(), ((Number) state4.getValue()).floatValue(), j3, fIntBitsToFloat, i2);
        }
        if (((Number) state4.getValue()).floatValue() > f3) {
            m5392drawLinearIndicatorqYKTg0g(drawScope, 0.0f, ((Number) state4.getValue()).floatValue() < 1.0f ? ((Number) state4.getValue()).floatValue() - f3 : 1.0f, j2, fIntBitsToFloat, i2);
        }
        return ab.f48028a;
    }

    static final ab LinearProgressIndicator_rIrjwxo$lambda$1(Modifier modifier, long j2, long j3, int i2, float f2, int i3, int i4, Composer composer, int i5) {
        m5387LinearProgressIndicatorrIrjwxo(modifier, j2, j3, i2, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab _get_circularIndeterminateProgressAnimationSpec_$lambda$0(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(6000);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.87f), 3000), CircularProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.1f), 6000);
        return ab.f48028a;
    }

    static final ab _get_circularIndeterminateRotationAnimationSpec_$lambda$0(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(6000);
        Float fValueOf = Float.valueOf(90.0f);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) fValueOf, 300), MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier());
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) fValueOf, 1500);
        Float fValueOf2 = Float.valueOf(180.0f);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) fValueOf2, DisplayStrings.DS_BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) fValueOf2, 3000);
        Float fValueOf3 = Float.valueOf(270.0f);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) fValueOf3, DisplayStrings.DS_SEARCH_FIELD_ADD_STOP_PLACEHOLDER);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) fValueOf3, 4500);
        Float fValueOf4 = Float.valueOf(360.0f);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) fValueOf4, 4800);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) fValueOf4, 6000);
        return ab.f48028a;
    }

    static final ab _get_linearIndeterminateFirstLineHeadAnimationSpec_$lambda$0(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(DisplayStrings.DS_NAVLIST_OPTIONS_EDIT_HOME);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 0), LinearIndeterminateProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), 1000);
        return ab.f48028a;
    }

    static final ab _get_linearIndeterminateFirstLineTailAnimationSpec_$lambda$0(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(DisplayStrings.DS_NAVLIST_OPTIONS_EDIT_HOME);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 250), LinearIndeterminateProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), DisplayStrings.DS_LOCATION_PREVIEW_SET_ADDRESS_BUTTON);
        return ab.f48028a;
    }

    static final ab _get_linearIndeterminateSecondLineHeadAnimationSpec_$lambda$0(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(DisplayStrings.DS_NAVLIST_OPTIONS_EDIT_HOME);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 650), LinearIndeterminateProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), 1500);
        return ab.f48028a;
    }

    static final ab _get_linearIndeterminateSecondLineTailAnimationSpec_$lambda$0(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(DisplayStrings.DS_NAVLIST_OPTIONS_EDIT_HOME);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 900), LinearIndeterminateProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), DisplayStrings.DS_NAVLIST_OPTIONS_EDIT_HOME);
        return ab.f48028a;
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m5388drawCircularIndicator42QJj7c(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        float width = stroke.getWidth() / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) - (width + width);
        long jFloatToRawIntBits = Float.floatToRawIntBits(width);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(width);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat);
        DrawScope.CC.m8821drawArcyD3GUKo$default(drawScope, j2, f2, f3, false, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (jFloatToRawIntBits3 << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), 0.0f, stroke, null, 0, DisplayStrings.DS_YES, null);
    }

    /* renamed from: drawCircularIndicatorTrack-bw27NRU, reason: not valid java name */
    private static final void m5389drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j2, Stroke stroke) {
        m5388drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j2, stroke);
    }

    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m5390drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        m5388drawCircularIndicator42QJj7c(drawScope, f2, f3, j2, stroke);
    }

    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    private static final void m5391drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f2, float f3, float f4, long j2, Stroke stroke) {
        m5388drawCircularIndicator42QJj7c(drawScope, f2 + (StrokeCap.m8628equalsimpl0(stroke.m8908getCapKaPHkGw(), StrokeCap.Companion.m8632getButtKaPHkGw()) ? 0.0f : ((f3 / (CircularIndicatorDiameter / 2.0f)) * 57.29578f) / 2.0f), Math.max(f4, 0.1f), j2, stroke);
    }

    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    private static final void m5392drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f2, float f3, long j2, float f4, int i2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float f5 = fIntBitsToFloat2 / 2.0f;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f6 = (z ? f2 : 1.0f - f3) * fIntBitsToFloat;
        float f7 = (z ? f3 : 1.0f - f2) * fIntBitsToFloat;
        if (StrokeCap.m8628equalsimpl0(i2, StrokeCap.Companion.m8632getButtKaPHkGw()) || fIntBitsToFloat2 > fIntBitsToFloat) {
            DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, j2, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f5) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f4, 0, null, 0.0f, null, 0, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL, null);
            return;
        }
        float f8 = f4 / 2.0f;
        float f9 = fIntBitsToFloat - f8;
        if (f6 < f8) {
            f6 = f8;
        }
        if (f7 < f8) {
            f7 = f8;
        }
        if (Math.abs(f3 - f2) > 0.0f) {
            if (f7 > f9) {
                f7 = f9;
            }
            if (f6 <= f9) {
                f9 = f6;
            }
            DrawScope.CC.m8828drawLineNGM6Ib0$default(drawScope, j2, (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f5) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f5) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f4, i2, null, 0.0f, null, 0, 480, null);
        }
    }

    public static final InfiniteRepeatableSpec<Float> getCircularIndeterminateGlobalRotationAnimationSpec() {
        return AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6000, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
    }

    public static final InfiniteRepeatableSpec<Float> getCircularIndeterminateProgressAnimationSpec() {
        return AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new l() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda21
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProgressIndicatorKt._get_circularIndeterminateProgressAnimationSpec_$lambda$0((KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final InfiniteRepeatableSpec<Float> getCircularIndeterminateRotationAnimationSpec() {
        return AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new l() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda23
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProgressIndicatorKt._get_circularIndeterminateRotationAnimationSpec_$lambda$0((KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final float getCircularIndicatorDiameter() {
        return CircularIndicatorDiameter;
    }

    public static final CubicBezierEasing getCircularProgressEasing() {
        return CircularProgressEasing;
    }

    public static final InfiniteRepeatableSpec<Float> getLinearIndeterminateFirstLineHeadAnimationSpec() {
        return AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new l() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProgressIndicatorKt._get_linearIndeterminateFirstLineHeadAnimationSpec_$lambda$0((KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final InfiniteRepeatableSpec<Float> getLinearIndeterminateFirstLineTailAnimationSpec() {
        return AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new l() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda18
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProgressIndicatorKt._get_linearIndeterminateFirstLineTailAnimationSpec_$lambda$0((KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final CubicBezierEasing getLinearIndeterminateProgressEasing() {
        return LinearIndeterminateProgressEasing;
    }

    public static final InfiniteRepeatableSpec<Float> getLinearIndeterminateSecondLineHeadAnimationSpec() {
        return AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new l() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda25
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProgressIndicatorKt._get_linearIndeterminateSecondLineHeadAnimationSpec_$lambda$0((KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final InfiniteRepeatableSpec<Float> getLinearIndeterminateSecondLineTailAnimationSpec() {
        return AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new l() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda27
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProgressIndicatorKt._get_linearIndeterminateSecondLineTailAnimationSpec_$lambda$0((KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final float getLinearIndicatorHeight() {
        return LinearIndicatorHeight;
    }

    public static final float getLinearIndicatorWidth() {
        return LinearIndicatorWidth;
    }

    public static final float getStopIndicatorTrailingSpace() {
        return StopIndicatorTrailingSpace;
    }

    public static /* synthetic */ float $r8$lambda$361j07g59P2Ru_GKgCOvnmlIoS0(float f2) {
        return f2;
    }

    public static /* synthetic */ float $r8$lambda$3t1fB4vliMSgDm8FfGzw1vGzowM(float f2) {
        return f2;
    }

    private static final float CircularProgressIndicator_DUhRLBM$lambda$1$0(float f2) {
        return f2;
    }

    private static final float LinearProgressIndicator__5eSR_E$lambda$1$0(float f2) {
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m5385LinearProgressIndicator_5eSRE(final h.g.a.a r21, androidx.compose.ui.Modifier r22, long r23, long r25, int r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5385LinearProgressIndicator_5eSRE(h.g.a.a, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m5376CircularProgressIndicatorDUhRLBM(final h.g.a.a r22, androidx.compose.ui.Modifier r23, long r24, float r26, long r27, int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m5376CircularProgressIndicatorDUhRLBM(h.g.a.a, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }
}
