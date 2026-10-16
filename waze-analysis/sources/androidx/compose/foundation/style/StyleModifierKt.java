package androidx.compose.foundation.style;

import androidx.compose.foundation.text.modifiers.StylePhase;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
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
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;
import h.g.b.o;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StyleModifierKt {
    public static final String OuterNodeKey = "StyleOuterNode";
    private static final String StyleableWithNoStyles = "The styleable() modifier must provide one or more 'style' parameter values. Calling it with no style parameter values has no effect.";

    private static final float addIfSpecified(float f2, float f3) {
        return Float.isNaN(f3) ? f2 : f2 + f3;
    }

    private static final int addMaxWithMinimum(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        int i4 = i2 + i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    private static final <T> T hasOrElse(StyleProperties styleProperties, byte b2, T t, l<? super StyleProperties, ? extends T> lVar) {
        return styleProperties.hasId(b2) ? lVar.invoke(styleProperties) : t;
    }

    private static final <T> T hasOrNull(StyleProperties styleProperties, int i2, l<? super StyleProperties, ? extends T> lVar) {
        if (styleProperties.hasId(i2)) {
            return lVar.invoke(styleProperties);
        }
        return null;
    }

    private static final float hasOrOne(StyleProperties styleProperties, byte b2, l<? super StyleProperties, Float> lVar) {
        if (styleProperties.hasId(b2)) {
            return lVar.invoke(styleProperties).floatValue();
        }
        return 1.0f;
    }

    private static final float hasOrZero(StyleProperties styleProperties, byte b2, l<? super StyleProperties, Float> lVar) {
        if (styleProperties.hasId(b2)) {
            return lVar.invoke(styleProperties).floatValue();
        }
        return 0.0f;
    }

    private static final boolean isSpecified(float f2) {
        return !Float.isNaN(f2);
    }

    /* renamed from: minus-Kibmq7A, reason: not valid java name */
    private static final long m3149minusKibmq7A(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - f2;
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fMax = Math.max(0.0f, fIntBitsToFloat);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat(i2) - f2);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldPlaceRelativeToBottom(StyleProperties styleProperties) {
        return styleProperties.hasId(StylePropertiesKt.BottomId) && !styleProperties.hasId(StylePropertiesKt.TopId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldPlaceRelativeToRight(StyleProperties styleProperties) {
        return !styleProperties.hasId(StylePropertiesKt.LeftId) && styleProperties.hasId(StylePropertiesKt.RightId);
    }

    public static final Modifier styleable(Modifier modifier, StyleState styleState, Style style) {
        return style == Style.Companion ? modifier : modifier.then(new StyleElement(styleState, style)).then(StyleInnerElement.INSTANCE);
    }

    public static /* synthetic */ Modifier styleable$default(Modifier modifier, StyleState styleState, Style style, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            styleState = null;
        }
        return styleable(modifier, styleState, style);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFlags-uwmK9pY, reason: not valid java name */
    public static final int m3150toFlagsuwmK9pY(int i2) {
        if (StylePhase.m3827equalsimpl0(i2, StylePhase.Companion.m3833getLayoutoWBPZag())) {
            return 16;
        }
        return !StylePhase.m3827equalsimpl0(i2, StylePhase.Companion.m3832getDrawoWBPZag()) ? 48 : 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle toTextStyle(StyleProperties styleProperties, TextStyle textStyle) {
        long jM10576getColor0d7_KjU = textStyle.m10576getColor0d7_KjU();
        if (styleProperties.hasId(StylePropertiesKt.ContentColorId)) {
            jM10576getColor0d7_KjU = styleProperties.m3165getContentColor0d7_KjU$foundation();
        }
        long j2 = jM10576getColor0d7_KjU;
        long jM10577getFontSizeXSAIIZE = textStyle.m10577getFontSizeXSAIIZE();
        if (styleProperties.hasId(StylePropertiesKt.FontSizeId)) {
            jM10577getFontSizeXSAIIZE = styleProperties.m3166getFontSizeXSAIIZE$foundation();
        }
        long j3 = jM10577getFontSizeXSAIIZE;
        FontWeight fontWeight = textStyle.getFontWeight();
        if (styleProperties.hasId(StylePropertiesKt.FontWeightId)) {
            fontWeight = styleProperties.getFontWeight$foundation();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyleM10578getFontStyle4Lr2A7w = textStyle.m10578getFontStyle4Lr2A7w();
        if (styleProperties.hasId(StylePropertiesKt.FontStyleId)) {
            fontStyleM10578getFontStyle4Lr2A7w = FontStyle.m10658boximpl(styleProperties.m3167getFontStyle_LCdwA$foundation());
        }
        FontStyle fontStyle = fontStyleM10578getFontStyle4Lr2A7w;
        FontSynthesis fontSynthesisM10579getFontSynthesisZQGJjVo = textStyle.m10579getFontSynthesisZQGJjVo();
        if (styleProperties.hasId(StylePropertiesKt.FontSynthesisId)) {
            fontSynthesisM10579getFontSynthesisZQGJjVo = FontSynthesis.m10669boximpl(styleProperties.m3168getFontSynthesisGVVA2EU$foundation());
        }
        FontSynthesis fontSynthesis = fontSynthesisM10579getFontSynthesisZQGJjVo;
        FontFamily fontFamily = textStyle.getFontFamily();
        if (styleProperties.hasId(58)) {
            fontFamily = styleProperties.fontFamily;
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = textStyle.getFontFeatureSettings();
        long jM10582getLetterSpacingXSAIIZE = textStyle.m10582getLetterSpacingXSAIIZE();
        if (styleProperties.hasId(StylePropertiesKt.LetterSpacingId)) {
            jM10582getLetterSpacingXSAIIZE = styleProperties.m3171getLetterSpacingXSAIIZE$foundation();
        }
        long j4 = jM10582getLetterSpacingXSAIIZE;
        BaselineShift baselineShiftM10575getBaselineShift5SSeXJ0 = textStyle.m10575getBaselineShift5SSeXJ0();
        if (styleProperties.hasId(StylePropertiesKt.BaselineShiftId)) {
            baselineShiftM10575getBaselineShift5SSeXJ0 = BaselineShift.m10873boximpl(styleProperties.m3163getBaselineShifty9eOQZs$foundation());
        }
        BaselineShift baselineShift = baselineShiftM10575getBaselineShift5SSeXJ0;
        TextGeometricTransform textGeometricTransform = textStyle.getTextGeometricTransform();
        LocaleList localeList = textStyle.getLocaleList();
        long jM10574getBackground0d7_KjU = textStyle.m10574getBackground0d7_KjU();
        TextDecoration textDecoration = textStyle.getTextDecoration();
        if (styleProperties.hasId(StylePropertiesKt.TextDecorationId)) {
            textDecoration = styleProperties.getTextDecoration$foundation();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = textStyle.getShadow();
        DrawStyle drawStyle = textStyle.getDrawStyle();
        int iM10587getTextAligne0LSkKk = textStyle.m10587getTextAligne0LSkKk();
        if (styleProperties.hasId(StylePropertiesKt.TextAlignId)) {
            iM10587getTextAligne0LSkKk = styleProperties.m3174getTextAligne0LSkKk$foundation();
        }
        int i2 = iM10587getTextAligne0LSkKk;
        int iM10589getTextDirections_7Xco = textStyle.m10589getTextDirections_7Xco();
        if (styleProperties.hasId(StylePropertiesKt.TextDirectionId)) {
            iM10589getTextDirections_7Xco = styleProperties.m3175getTextDirections_7Xco$foundation();
        }
        int i3 = iM10589getTextDirections_7Xco;
        long jM10585getLineHeightXSAIIZE = textStyle.m10585getLineHeightXSAIIZE();
        if (styleProperties.hasId(StylePropertiesKt.LineHeightId)) {
            jM10585getLineHeightXSAIIZE = styleProperties.m3173getLineHeightXSAIIZE$foundation();
        }
        long j5 = jM10585getLineHeightXSAIIZE;
        TextIndent textIndent = textStyle.getTextIndent();
        if (styleProperties.hasId(60)) {
            textIndent = styleProperties.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
        int iM10584getLineBreakrAG3T2k = textStyle.m10584getLineBreakrAG3T2k();
        if (styleProperties.hasId(StylePropertiesKt.LineBreakId)) {
            iM10584getLineBreakrAG3T2k = styleProperties.m3172getLineBreakrAG3T2k$foundation();
        }
        int i4 = iM10584getLineBreakrAG3T2k;
        int iM10581getHyphensvmbZdU8 = textStyle.m10581getHyphensvmbZdU8();
        if (styleProperties.hasId(StylePropertiesKt.HyphensId)) {
            iM10581getHyphensvmbZdU8 = styleProperties.m3170getHyphensvmbZdU8$foundation();
        }
        int i5 = iM10581getHyphensvmbZdU8;
        TextMotion textMotion = textStyle.getTextMotion();
        if (styleProperties.hasId(59)) {
            textMotion = styleProperties.textMotion;
        }
        TextStyle textStyle2 = new TextStyle(j2, j3, fontWeight2, fontStyle, fontSynthesis, fontFamily2, fontFeatureSettings, j4, baselineShift, textGeometricTransform, localeList, jM10574getBackground0d7_KjU, textDecoration2, shadow, drawStyle, i2, i3, j5, textIndent2, platformStyle, lineHeightStyle, i4, i5, textMotion, (o) null);
        return styleProperties.hasId(57) ? TextStyle.m10557copyNs73l9s$default(textStyle2, styleProperties.getContentBrush$foundation(), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null) : textStyle2;
    }

    private static final <T> T hasOrElse(StyleProperties styleProperties, int i2, T t, l<? super StyleProperties, ? extends T> lVar) {
        return styleProperties.hasId(i2) ? lVar.invoke(styleProperties) : t;
    }

    public static final Modifier styleable(Modifier modifier, StyleState styleState) {
        throw new IllegalStateException(StyleableWithNoStyles);
    }

    public static final Modifier styleable(Modifier modifier, StyleState styleState, Style... styleArr) {
        return styleable(modifier, styleState, StyleKt.Style((Style[]) Arrays.copyOf(styleArr, styleArr.length)));
    }
}
