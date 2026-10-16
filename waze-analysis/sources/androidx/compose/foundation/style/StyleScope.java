package androidx.compose.foundation.style;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface StyleScope extends CompositionLocalAccessorScope, Density {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.style.StyleScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void clip$default(StyleScope styleScope, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clip");
            }
            styleScope.clip(1 == ((z ? 1 : 0) | (i2 & 1)));
        }
    }

    void alpha(float f2);

    void animate(AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, Style style);

    void animate(AnimationSpec<Float> animationSpec, Style style);

    void animate(Style style);

    void background(Brush brush);

    /* renamed from: background-8_81llA */
    void mo3089background8_81llA(long j2);

    /* renamed from: baselineShift-4Dl_Bck */
    void mo3090baselineShift4Dl_Bck(float f2);

    /* renamed from: border-D5KLDUw */
    void mo3091borderD5KLDUw(float f2, Brush brush);

    /* renamed from: border-cXLIe8U */
    void mo3092bordercXLIe8U(float f2, long j2);

    void borderBrush(Brush brush);

    /* renamed from: borderColor-8_81llA */
    void mo3093borderColor8_81llA(long j2);

    /* renamed from: borderWidth-0680j_4 */
    void mo3094borderWidth0680j_4(float f2);

    /* renamed from: bottom-0680j_4 */
    void mo3095bottom0680j_4(float f2);

    void clip(boolean z);

    void colorFilter(ColorFilter colorFilter);

    void contentBrush(Brush brush);

    /* renamed from: contentColor-8_81llA */
    void mo3096contentColor8_81llA(long j2);

    /* renamed from: contentPadding-0680j_4 */
    void mo3097contentPadding0680j_4(float f2);

    /* renamed from: contentPadding-YgX7TsA */
    void mo3098contentPaddingYgX7TsA(float f2, float f3);

    /* renamed from: contentPadding-a9UjIt4 */
    void mo3099contentPaddinga9UjIt4(float f2, float f3, float f4, float f5);

    /* renamed from: contentPaddingBottom-0680j_4 */
    void mo3100contentPaddingBottom0680j_4(float f2);

    /* renamed from: contentPaddingEnd-0680j_4 */
    void mo3101contentPaddingEnd0680j_4(float f2);

    /* renamed from: contentPaddingHorizontal-0680j_4 */
    void mo3102contentPaddingHorizontal0680j_4(float f2);

    /* renamed from: contentPaddingStart-0680j_4 */
    void mo3103contentPaddingStart0680j_4(float f2);

    /* renamed from: contentPaddingTop-0680j_4 */
    void mo3104contentPaddingTop0680j_4(float f2);

    /* renamed from: contentPaddingVertical-0680j_4 */
    void mo3105contentPaddingVertical0680j_4(float f2);

    void dropShadow(Shadow shadow);

    void dropShadow(Shadow... shadowArr);

    /* renamed from: externalPadding-0680j_4 */
    void mo3106externalPadding0680j_4(float f2);

    /* renamed from: externalPadding-YgX7TsA */
    void mo3107externalPaddingYgX7TsA(float f2, float f3);

    /* renamed from: externalPadding-a9UjIt4 */
    void mo3108externalPaddinga9UjIt4(float f2, float f3, float f4, float f5);

    /* renamed from: externalPaddingBottom-0680j_4 */
    void mo3109externalPaddingBottom0680j_4(float f2);

    /* renamed from: externalPaddingEnd-0680j_4 */
    void mo3110externalPaddingEnd0680j_4(float f2);

    /* renamed from: externalPaddingHorizontal-0680j_4 */
    void mo3111externalPaddingHorizontal0680j_4(float f2);

    /* renamed from: externalPaddingStart-0680j_4 */
    void mo3112externalPaddingStart0680j_4(float f2);

    /* renamed from: externalPaddingTop-0680j_4 */
    void mo3113externalPaddingTop0680j_4(float f2);

    /* renamed from: externalPaddingVertical-0680j_4 */
    void mo3114externalPaddingVertical0680j_4(float f2);

    void fontFamily(FontFamily fontFamily);

    /* renamed from: fontSize--R2X_6o */
    void mo3115fontSizeR2X_6o(long j2);

    /* renamed from: fontStyle-nzbMABs */
    void mo3116fontStylenzbMABs(int i2);

    /* renamed from: fontSynthesis-6p3vJLY */
    void mo3117fontSynthesis6p3vJLY(int i2);

    void fontWeight(FontWeight fontWeight);

    void foreground(Brush brush);

    /* renamed from: foreground-8_81llA */
    void mo3118foreground8_81llA(long j2);

    StyleState getState();

    void height(float f2);

    /* renamed from: height-0680j_4 */
    void mo3124height0680j_4(float f2);

    /* renamed from: hyphens--3fSNIE */
    void mo3125hyphens3fSNIE(int i2);

    void innerShadow(Shadow shadow);

    void innerShadow(Shadow... shadowArr);

    /* renamed from: left-0680j_4 */
    void mo3126left0680j_4(float f2);

    /* renamed from: letterSpacing--R2X_6o */
    void mo3127letterSpacingR2X_6o(long j2);

    /* renamed from: lineBreak-CZqVlQI */
    void mo3128lineBreakCZqVlQI(int i2);

    /* renamed from: lineHeight--R2X_6o */
    void mo3129lineHeightR2X_6o(long j2);

    /* renamed from: maxHeight-0680j_4 */
    void mo3130maxHeight0680j_4(float f2);

    /* renamed from: maxSize-EaSLcWc */
    void mo3131maxSizeEaSLcWc(long j2);

    /* renamed from: maxSize-YgX7TsA */
    void mo3132maxSizeYgX7TsA(float f2, float f3);

    /* renamed from: maxWidth-0680j_4 */
    void mo3133maxWidth0680j_4(float f2);

    /* renamed from: minHeight-0680j_4 */
    void mo3134minHeight0680j_4(float f2);

    /* renamed from: minSize-EaSLcWc */
    void mo3135minSizeEaSLcWc(long j2);

    /* renamed from: minSize-YgX7TsA */
    void mo3136minSizeYgX7TsA(float f2, float f3);

    /* renamed from: minWidth-0680j_4 */
    void mo3137minWidth0680j_4(float f2);

    /* renamed from: right-0680j_4 */
    void mo3138right0680j_4(float f2);

    void rotationX(float f2);

    void rotationY(float f2);

    void rotationZ(float f2);

    void scale(float f2);

    void scaleX(float f2);

    void scaleY(float f2);

    void shape(Shape shape);

    /* renamed from: size-0680j_4 */
    void mo3139size0680j_4(float f2);

    /* renamed from: size-EaSLcWc */
    void mo3140sizeEaSLcWc(long j2);

    /* renamed from: size-YgX7TsA */
    void mo3141sizeYgX7TsA(float f2, float f3);

    <T> void state(StyleStateKey<T> styleStateKey, Style style, p<? super StyleStateKey<T>, ? super StyleState, Boolean> pVar);

    /* renamed from: textAlign-aXe7zB0 */
    void mo3142textAlignaXe7zB0(int i2);

    void textDecoration(TextDecoration textDecoration);

    /* renamed from: textDirection-Hejc4pk */
    void mo3143textDirectionHejc4pk(int i2);

    void textIndent(TextIndent textIndent);

    void textMotion(TextMotion textMotion);

    void textStyle(TextStyle textStyle);

    /* renamed from: top-0680j_4 */
    void mo3144top0680j_4(float f2);

    /* renamed from: transformOrigin-__ExYCQ */
    void mo3145transformOrigin__ExYCQ(long j2);

    void translation(float f2, float f3);

    /* renamed from: translation-k-4lQ0M */
    void mo3146translationk4lQ0M(long j2);

    void translationX(float f2);

    void translationY(float f2);

    void width(float f2);

    /* renamed from: width-0680j_4 */
    void mo3147width0680j_4(float f2);

    void zIndex(float f2);
}
