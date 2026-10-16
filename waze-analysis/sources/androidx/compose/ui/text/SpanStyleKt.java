package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SpanStyleKt {
    private static final long DefaultColor;
    private static final TextForegroundStyle DefaultColorForegroundStyle;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);
    private static final long DefaultBackgroundColor = Color.Companion.m8263getTransparent0d7_KjU();

    static {
        long jM8254getBlack0d7_KjU = Color.Companion.m8254getBlack0d7_KjU();
        DefaultColor = jM8254getBlack0d7_KjU;
        DefaultColorForegroundStyle = TextForegroundStyle.Companion.m11038from8_81llA(jM8254getBlack0d7_KjU);
    }

    private static final Shadow dropAlpha(Shadow shadow) {
        return Shadow.m8598copyqcb84PM$default(shadow, Color.m8227copywmQWz5c$default(shadow.m8602getColor0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125 A[PHI: r11
  0x0125: PHI (r11v6 long) = 
  (r11v0 long)
  (r11v7 long)
  (r11v7 long)
  (r11v7 long)
  (r11v7 long)
  (r11v7 long)
  (r11v7 long)
  (r11v7 long)
  (r11v7 long)
  (r11v7 long)
  (r11v7 long)
  (r11v7 long)
 binds: [B:6:0x002f, B:25:0x007a, B:30:0x0094, B:42:0x00c6, B:39:0x00ba, B:36:0x00ae, B:33:0x00a2, B:28:0x0086, B:20:0x0063, B:17:0x005b, B:14:0x004f, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0187  */
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.SpanStyle m10492fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle r22, long r23, androidx.compose.ui.graphics.Brush r25, float r26, long r27, androidx.compose.ui.text.font.FontWeight r29, androidx.compose.ui.text.font.FontStyle r30, androidx.compose.ui.text.font.FontSynthesis r31, androidx.compose.ui.text.font.FontFamily r32, java.lang.String r33, long r34, androidx.compose.ui.text.style.BaselineShift r36, androidx.compose.ui.text.style.TextGeometricTransform r37, androidx.compose.ui.text.intl.LocaleList r38, long r39, androidx.compose.ui.text.style.TextDecoration r41, androidx.compose.ui.graphics.Shadow r42, androidx.compose.ui.text.PlatformSpanStyle r43, androidx.compose.ui.graphics.drawscope.DrawStyle r44) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyleKt.m10492fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f2) {
        TextForegroundStyle textForegroundStyleLerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text(), spanStyle2.getTextForegroundStyle$ui_text(), f2);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f2);
        long jM10493lerpTextUnitInheritableC3pnCVY = m10493lerpTextUnitInheritableC3pnCVY(spanStyle.m10488getFontSizeXSAIIZE(), spanStyle2.m10488getFontSizeXSAIIZE(), f2);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeightLerp = FontWeightKt.lerp(fontWeight, fontWeight2, f2);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m10489getFontStyle4Lr2A7w(), spanStyle2.m10489getFontStyle4Lr2A7w(), f2);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m10490getFontSynthesisZQGJjVo(), spanStyle2.m10490getFontSynthesisZQGJjVo(), f2);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f2);
        long jM10493lerpTextUnitInheritableC3pnCVY2 = m10493lerpTextUnitInheritableC3pnCVY(spanStyle.m10491getLetterSpacingXSAIIZE(), spanStyle2.m10491getLetterSpacingXSAIIZE(), f2);
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = spanStyle.m10486getBaselineShift5SSeXJ0();
        float fM10879unboximpl = baselineShiftM10486getBaselineShift5SSeXJ0 != null ? baselineShiftM10486getBaselineShift5SSeXJ0.m10879unboximpl() : 0.0f;
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ02 = spanStyle2.m10486getBaselineShift5SSeXJ0();
        float fM10889lerpjWV1Mfo = BaselineShiftKt.m10889lerpjWV1Mfo(fM10879unboximpl, baselineShiftM10486getBaselineShift5SSeXJ02 != null ? baselineShiftM10486getBaselineShift5SSeXJ02.m10879unboximpl() : 0.0f, f2);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text();
        }
        return new SpanStyle(textForegroundStyleLerp, jM10493lerpTextUnitInheritableC3pnCVY, fontWeightLerp, fontStyle, fontSynthesis, fontFamily, str, jM10493lerpTextUnitInheritableC3pnCVY2, BaselineShift.m10873boximpl(fM10889lerpjWV1Mfo), TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f2), (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f2), ColorKt.m8279lerpjxsXWHM(spanStyle.m10485getBackground0d7_KjU(), spanStyle2.m10485getBackground0d7_KjU(), f2), (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f2), nullSafeLerp(spanStyle.getShadow(), spanStyle2.getShadow(), f2), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f2), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f2), (o) null);
    }

    public static final <T> T lerpDiscrete(T t, T t2, float f2) {
        return ((double) f2) < 0.5d ? t : t2;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f2) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            PlatformSpanStyle.Companion.getDefault();
        }
        return platformSpanStyle;
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m10493lerpTextUnitInheritableC3pnCVY(long j2, long j3, float f2) {
        return (TextUnit.m11360getRawTypeimpl(j2) == 0 || TextUnit.m11360getRawTypeimpl(j3) == 0) ? ((TextUnit) lerpDiscrete(TextUnit.m11352boximpl(j2), TextUnit.m11352boximpl(j3), f2)).m11371unboximpl() : TextUnitKt.m11382lerpC3pnCVY(j2, j3, f2);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        platformStyle.merge(platformSpanStyle);
        return platformStyle;
    }

    public static final Shadow nullSafeLerp(Shadow shadow, Shadow shadow2, float f2) {
        if (ComposeUiTextFlags.isCorrectShadowLerpWithNullsEnabled) {
            if (shadow == null) {
                shadow = null;
                if (shadow2 == null) {
                    return null;
                }
            }
            return shadow == null ? ShadowKt.lerp(dropAlpha(shadow2), shadow2, f2) : shadow2 == null ? ShadowKt.lerp(shadow, dropAlpha(shadow), f2) : ShadowKt.lerp(shadow, shadow2, f2);
        }
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return ShadowKt.lerp(shadow, shadow2, f2);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        TextForegroundStyle textForegroundStyleTakeOrElse = spanStyle.getTextForegroundStyle$ui_text().takeOrElse(new a() { // from class: androidx.compose.ui.text.SpanStyleKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SpanStyleKt.DefaultColorForegroundStyle;
            }
        });
        long jM10488getFontSizeXSAIIZE = TextUnit.m11360getRawTypeimpl(spanStyle.m10488getFontSizeXSAIIZE()) == 0 ? DefaultFontSize : spanStyle.m10488getFontSizeXSAIIZE();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = spanStyle.m10489getFontStyle4Lr2A7w();
        FontStyle fontStyleM10658boximpl = FontStyle.m10658boximpl(fontStyleM10489getFontStyle4Lr2A7w != null ? fontStyleM10489getFontStyle4Lr2A7w.m10664unboximpl() : FontStyle.Companion.m10668getNormal_LCdwA());
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = spanStyle.m10490getFontSynthesisZQGJjVo();
        FontSynthesis fontSynthesisM10669boximpl = FontSynthesis.m10669boximpl(fontSynthesisM10490getFontSynthesisZQGJjVo != null ? fontSynthesisM10490getFontSynthesisZQGJjVo.m10677unboximpl() : FontSynthesis.Companion.m10678getAllGVVA2EU());
        SystemFontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long jM10491getLetterSpacingXSAIIZE = TextUnit.m11360getRawTypeimpl(spanStyle.m10491getLetterSpacingXSAIIZE()) == 0 ? DefaultLetterSpacing : spanStyle.m10491getLetterSpacingXSAIIZE();
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = spanStyle.m10486getBaselineShift5SSeXJ0();
        float fM10879unboximpl = baselineShiftM10486getBaselineShift5SSeXJ0 != null ? baselineShiftM10486getBaselineShift5SSeXJ0.m10879unboximpl() : BaselineShift.Companion.m10884getNoney9eOQZs();
        if (Float.isNaN(fM10879unboximpl)) {
            fM10879unboximpl = BaselineShift.Companion.m10884getNoney9eOQZs();
        }
        BaselineShift baselineShiftM10873boximpl = BaselineShift.m10873boximpl(fM10879unboximpl);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long jM10485getBackground0d7_KjU = spanStyle.m10485getBackground0d7_KjU();
        if (jM10485getBackground0d7_KjU == 16) {
            jM10485getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j2 = jM10485getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        Fill drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyleTakeOrElse, jM10488getFontSizeXSAIIZE, fontWeight2, fontStyleM10658boximpl, fontSynthesisM10669boximpl, fontFamily2, str, jM10491getLetterSpacingXSAIIZE, baselineShiftM10873boximpl, textGeometricTransform2, localeList2, j2, textDecoration2, shadow2, platformStyle, drawStyle, (o) null);
    }
}
