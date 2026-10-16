package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import h.g.a.r;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar, Density density, boolean z) {
        long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(spanStyle.m10488getFontSizeXSAIIZE());
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo2126toPxR2X_6o(spanStyle.m10488getFontSizeXSAIIZE()));
        } else if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m11362getValueimpl(spanStyle.m10488getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle fontStyleM10489getFontStyle4Lr2A7w = spanStyle.m10489getFontStyle4Lr2A7w();
            FontStyle fontStyleM10658boximpl = FontStyle.m10658boximpl(fontStyleM10489getFontStyle4Lr2A7w != null ? fontStyleM10489getFontStyle4Lr2A7w.m10664unboximpl() : FontStyle.Companion.m10668getNormal_LCdwA());
            FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = spanStyle.m10490getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface(rVar.invoke(fontFamily, fontWeight, fontStyleM10658boximpl, FontSynthesis.m10669boximpl(fontSynthesisM10490getFontSynthesisZQGJjVo != null ? fontSynthesisM10490getFontSynthesisZQGJjVo.m10677unboximpl() : FontSynthesis.Companion.m10678getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !x.n(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !x.n(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !x.n(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m10850setColor8_81llA(spanStyle.m10487getColor0d7_KjU());
        androidTextPaint.m10848setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m8057getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(spanStyle.m10491getLetterSpacingXSAIIZE()), TextUnitType.Companion.m11395getSpUIouoOA()) && TextUnit.m11362getValueimpl(spanStyle.m10491getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float fMo2126toPxR2X_6o = density.mo2126toPxR2X_6o(spanStyle.m10491getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo2126toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(spanStyle.m10491getLetterSpacingXSAIIZE()), TextUnitType.Companion.m11394getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m11362getValueimpl(spanStyle.m10491getLetterSpacingXSAIIZE()));
        }
        return m10865generateFallbackSpanStyle62GTOB8(spanStyle.m10491getLetterSpacingXSAIIZE(), z, spanStyle.m10485getBackground0d7_KjU(), spanStyle.m10486getBaselineShift5SSeXJ0());
    }

    public static final float correctBlurRadius(float f2) {
        if (f2 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f2;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m10865generateFallbackSpanStyle62GTOB8(long j2, boolean z, long j3, BaselineShift baselineShift) {
        long jM8264getUnspecified0d7_KjU = j3;
        boolean z2 = false;
        boolean z3 = z && TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(j2), TextUnitType.Companion.m11395getSpUIouoOA()) && TextUnit.m11362getValueimpl(j2) != 0.0f;
        boolean z4 = (Color.m8229equalsimpl0(jM8264getUnspecified0d7_KjU, Color.Companion.m8264getUnspecified0d7_KjU()) || Color.m8229equalsimpl0(jM8264getUnspecified0d7_KjU, Color.Companion.m8263getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.m10876equalsimpl0(baselineShift.m10879unboximpl(), BaselineShift.Companion.m10884getNoney9eOQZs())) {
                z2 = true;
            }
        }
        if (!z3 && !z4) {
            if (!z2) {
                return null;
            }
            z2 = true;
        }
        long jM11373getUnspecifiedXSAIIZE = z3 ? j2 : TextUnit.Companion.m11373getUnspecifiedXSAIIZE();
        if (!z4) {
            jM8264getUnspecified0d7_KjU = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jM11373getUnspecifiedXSAIIZE, true != z2 ? null : baselineShift, (TextGeometricTransform) null, (LocaleList) null, jM8264getUnspecified0d7_KjU, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (o) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.m10489getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning$ui_text() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int iM11045getLinearity4e0Vf04$ui_text = textMotion.m11045getLinearity4e0Vf04$ui_text();
        if (TextMotion.Linearity.m11049equalsimpl0(iM11045getLinearity4e0Vf04$ui_text, TextMotion.Linearity.Companion.m11054getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m11049equalsimpl0(iM11045getLinearity4e0Vf04$ui_text, TextMotion.Linearity.Companion.m11053getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m11049equalsimpl0(iM11045getLinearity4e0Vf04$ui_text, TextMotion.Linearity.Companion.m11055getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
