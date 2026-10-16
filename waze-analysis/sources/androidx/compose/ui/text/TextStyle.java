package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.ViewCompat;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, ViewCompat.MEASURED_SIZE_MASK, (o) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, o oVar) {
        long jM8264getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM11373getUnspecifiedXSAIIZE = (i6 & 2) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3;
        FontWeight fontWeight2 = (i6 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i6 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i6 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i6 & 32) != 0 ? null : fontFamily;
        String str2 = (i6 & 64) != 0 ? null : str;
        long jM11373getUnspecifiedXSAIIZE2 = (i6 & 128) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j4;
        BaselineShift baselineShift2 = (i6 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i6 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i6 & 1024) != 0 ? null : localeList;
        long jM8264getUnspecified0d7_KjU2 = (i6 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i6 & 4096) != 0 ? null : textDecoration;
        long j7 = jM8264getUnspecified0d7_KjU;
        Shadow shadow2 = (i6 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i6 & 16384) != 0 ? null : drawStyle;
        int iM11017getUnspecifiede0LSkKk = (i6 & 32768) != 0 ? TextAlign.Companion.m11017getUnspecifiede0LSkKk() : i2;
        int iM11033getUnspecifieds_7Xco = (i6 & 65536) != 0 ? TextDirection.Companion.m11033getUnspecifieds_7Xco() : i3;
        long jM11373getUnspecifiedXSAIIZE3 = (i6 & 131072) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j6;
        TextIndent textIndent2 = (i6 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i6 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i6 & 1048576) != 0 ? null : lineHeightStyle;
        int iM10929getUnspecifiedrAG3T2k = (i6 & 2097152) != 0 ? LineBreak.Companion.m10929getUnspecifiedrAG3T2k() : i4;
        int iM10905getUnspecifiedvmbZdU8 = (i6 & 4194304) != 0 ? Hyphens.Companion.m10905getUnspecifiedvmbZdU8() : i5;
        long j8 = jM11373getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j9 = jM11373getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j10 = jM8264getUnspecified0d7_KjU2;
        this(j7, j8, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j9, baselineShift3, textGeometricTransform3, localeList3, j10, textDecoration3, shadow2, drawStyle2, iM11017getUnspecifiede0LSkKk, iM11033getUnspecifieds_7Xco, jM11373getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, iM10929getUnspecifiedrAG3T2k, iM10905getUnspecifiedvmbZdU8, (i6 & 8388608) != 0 ? null : textMotion, (o) null);
    }

    /* renamed from: copy-CXVQc50$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m10554copyCXVQc50$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, Object obj) {
        TextDirection textDirection2;
        long jM10449getLineHeightXSAIIZE;
        Hyphens hyphensM10896boximpl;
        LineBreak lineBreak2;
        long jM10487getColor0d7_KjU = (i2 & 1) != 0 ? textStyle.spanStyle.m10487getColor0d7_KjU() : j2;
        long jM10488getFontSizeXSAIIZE = (i2 & 2) != 0 ? textStyle.spanStyle.m10488getFontSizeXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = (i2 & 8) != 0 ? textStyle.spanStyle.m10489getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = (i2 & 16) != 0 ? textStyle.spanStyle.m10490getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i2 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM10491getLetterSpacingXSAIIZE = (i2 & 128) != 0 ? textStyle.spanStyle.m10491getLetterSpacingXSAIIZE() : j4;
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = (i2 & 256) != 0 ? textStyle.spanStyle.m10486getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j7 = jM10487getColor0d7_KjU;
        long jM10485getBackground0d7_KjU = (i2 & 2048) != 0 ? textStyle.spanStyle.m10485getBackground0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i2 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign textAlignM11004boximpl = (i2 & 16384) != 0 ? TextAlign.m11004boximpl(textStyle.paragraphStyle.m10451getTextAligne0LSkKk()) : textAlign;
        TextDirection textDirectionM11021boximpl = (i2 & 32768) != 0 ? TextDirection.m11021boximpl(textStyle.paragraphStyle.m10453getTextDirections_7Xco()) : textDirection;
        if ((i2 & 65536) != 0) {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = textStyle.paragraphStyle.m10449getLineHeightXSAIIZE();
        } else {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = j6;
        }
        TextIndent textIndent2 = (i2 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i2 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i2 & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM10909boximpl = (i2 & 1048576) != 0 ? LineBreak.m10909boximpl(textStyle.paragraphStyle.m10448getLineBreakrAG3T2k()) : lineBreak;
        if ((i2 & 2097152) != 0) {
            lineBreak2 = lineBreakM10909boximpl;
            hyphensM10896boximpl = Hyphens.m10896boximpl(textStyle.paragraphStyle.m10446getHyphensvmbZdU8());
        } else {
            hyphensM10896boximpl = hyphens;
            lineBreak2 = lineBreakM10909boximpl;
        }
        return textStyle.m10567copyCXVQc50(j7, jM10488getFontSizeXSAIIZE, fontWeight2, fontStyleM10489getFontStyle4Lr2A7w, fontSynthesisM10490getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM10491getLetterSpacingXSAIIZE, baselineShiftM10486getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM10485getBackground0d7_KjU, textDecoration3, shadow2, textAlignM11004boximpl, textDirection2, jM10449getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphensM10896boximpl);
    }

    /* renamed from: copy-HL5avdY$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m10555copyHL5avdY$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, int i2, Object obj) {
        TextDirection textDirection2;
        long jM10449getLineHeightXSAIIZE;
        long jM10487getColor0d7_KjU = (i2 & 1) != 0 ? textStyle.spanStyle.m10487getColor0d7_KjU() : j2;
        long jM10488getFontSizeXSAIIZE = (i2 & 2) != 0 ? textStyle.spanStyle.m10488getFontSizeXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = (i2 & 8) != 0 ? textStyle.spanStyle.m10489getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = (i2 & 16) != 0 ? textStyle.spanStyle.m10490getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i2 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM10491getLetterSpacingXSAIIZE = (i2 & 128) != 0 ? textStyle.spanStyle.m10491getLetterSpacingXSAIIZE() : j4;
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = (i2 & 256) != 0 ? textStyle.spanStyle.m10486getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j7 = jM10487getColor0d7_KjU;
        long jM10485getBackground0d7_KjU = (i2 & 2048) != 0 ? textStyle.spanStyle.m10485getBackground0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i2 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign textAlignM11004boximpl = (i2 & 16384) != 0 ? TextAlign.m11004boximpl(textStyle.paragraphStyle.m10451getTextAligne0LSkKk()) : textAlign;
        TextDirection textDirectionM11021boximpl = (i2 & 32768) != 0 ? TextDirection.m11021boximpl(textStyle.paragraphStyle.m10453getTextDirections_7Xco()) : textDirection;
        if ((i2 & 65536) != 0) {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = textStyle.paragraphStyle.m10449getLineHeightXSAIIZE();
        } else {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = j6;
        }
        return textStyle.m10568copyHL5avdY(j7, jM10488getFontSizeXSAIIZE, fontWeight2, fontStyleM10489getFontStyle4Lr2A7w, fontSynthesisM10490getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM10491getLetterSpacingXSAIIZE, baselineShiftM10486getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM10485getBackground0d7_KjU, textDecoration3, shadow2, textAlignM11004boximpl, textDirection2, jM10449getLineHeightXSAIIZE, (i2 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent);
    }

    /* renamed from: copy-NOaFTUo$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m10556copyNOaFTUo$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i2, Object obj) {
        TextDirection textDirection2;
        long jM10449getLineHeightXSAIIZE;
        LineHeightStyle lineHeightStyle2;
        PlatformTextStyle platformTextStyle2;
        long jM10487getColor0d7_KjU = (i2 & 1) != 0 ? textStyle.spanStyle.m10487getColor0d7_KjU() : j2;
        long jM10488getFontSizeXSAIIZE = (i2 & 2) != 0 ? textStyle.spanStyle.m10488getFontSizeXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = (i2 & 8) != 0 ? textStyle.spanStyle.m10489getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = (i2 & 16) != 0 ? textStyle.spanStyle.m10490getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i2 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM10491getLetterSpacingXSAIIZE = (i2 & 128) != 0 ? textStyle.spanStyle.m10491getLetterSpacingXSAIIZE() : j4;
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = (i2 & 256) != 0 ? textStyle.spanStyle.m10486getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j7 = jM10487getColor0d7_KjU;
        long jM10485getBackground0d7_KjU = (i2 & 2048) != 0 ? textStyle.spanStyle.m10485getBackground0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i2 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign textAlignM11004boximpl = (i2 & 16384) != 0 ? TextAlign.m11004boximpl(textStyle.paragraphStyle.m10451getTextAligne0LSkKk()) : textAlign;
        TextDirection textDirectionM11021boximpl = (i2 & 32768) != 0 ? TextDirection.m11021boximpl(textStyle.paragraphStyle.m10453getTextDirections_7Xco()) : textDirection;
        if ((i2 & 65536) != 0) {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = textStyle.paragraphStyle.m10449getLineHeightXSAIIZE();
        } else {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = j6;
        }
        TextIndent textIndent2 = (i2 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i2 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        if ((i2 & 524288) != 0) {
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            lineHeightStyle2 = lineHeightStyle;
            platformTextStyle2 = platformTextStyle3;
        }
        return textStyle.m10569copyNOaFTUo(j7, jM10488getFontSizeXSAIIZE, fontWeight2, fontStyleM10489getFontStyle4Lr2A7w, fontSynthesisM10490getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM10491getLetterSpacingXSAIIZE, baselineShiftM10486getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM10485getBackground0d7_KjU, textDecoration3, shadow2, textAlignM11004boximpl, textDirection2, jM10449getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2);
    }

    /* renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m10557copyNs73l9s$default(TextStyle textStyle, Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, Object obj) {
        int i7;
        long jM10449getLineHeightXSAIIZE;
        TextMotion textMotion2;
        int i8;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i9;
        int i10;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j6;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j7;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j8;
        long j9;
        Brush brush2;
        float f3;
        int i11;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i6 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f2;
        long jM10488getFontSizeXSAIIZE = (i6 & 4) != 0 ? textStyle.spanStyle.m10488getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight3 = (i6 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = (i6 & 16) != 0 ? textStyle.spanStyle.m10489getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = (i6 & 32) != 0 ? textStyle.spanStyle.m10490getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i6 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i6 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM10491getLetterSpacingXSAIIZE = (i6 & 256) != 0 ? textStyle.spanStyle.m10491getLetterSpacingXSAIIZE() : j3;
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = (i6 & 512) != 0 ? textStyle.spanStyle.m10486getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i6 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i6 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long jM10485getBackground0d7_KjU = (i6 & 4096) != 0 ? textStyle.spanStyle.m10485getBackground0d7_KjU() : j4;
        float f4 = alpha;
        TextDecoration textDecoration3 = (i6 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i6 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i6 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int iM10451getTextAligne0LSkKk = (i6 & 65536) != 0 ? textStyle.paragraphStyle.m10451getTextAligne0LSkKk() : i2;
        int iM10453getTextDirections_7Xco = (i6 & 131072) != 0 ? textStyle.paragraphStyle.m10453getTextDirections_7Xco() : i3;
        if ((i6 & 262144) != 0) {
            i7 = iM10453getTextDirections_7Xco;
            jM10449getLineHeightXSAIIZE = textStyle.paragraphStyle.m10449getLineHeightXSAIIZE();
        } else {
            i7 = iM10453getTextDirections_7Xco;
            jM10449getLineHeightXSAIIZE = j5;
        }
        TextIndent textIndent3 = (i6 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i6 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i6 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int iM10448getLineBreakrAG3T2k = (i6 & 4194304) != 0 ? textStyle.paragraphStyle.m10448getLineBreakrAG3T2k() : i4;
        int iM10446getHyphensvmbZdU8 = (i6 & 8388608) != 0 ? textStyle.paragraphStyle.m10446getHyphensvmbZdU8() : i5;
        if ((i6 & 16777216) != 0) {
            i8 = iM10446getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i9 = iM10451getTextAligne0LSkKk;
            i10 = i7;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            i11 = iM10448getLineBreakrAG3T2k;
            shadow2 = shadow3;
            j6 = jM10488getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyleM10489getFontStyle4Lr2A7w;
            fontSynthesis2 = fontSynthesisM10490getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j7 = jM10491getLetterSpacingXSAIIZE;
            baselineShift2 = baselineShiftM10486getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j8 = jM10485getBackground0d7_KjU;
            j9 = jM10449getLineHeightXSAIIZE;
            brush2 = brush;
            f3 = f4;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            i8 = iM10446getHyphensvmbZdU8;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i9 = iM10451getTextAligne0LSkKk;
            i10 = i7;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j6 = jM10488getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyleM10489getFontStyle4Lr2A7w;
            fontSynthesis2 = fontSynthesisM10490getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j7 = jM10491getLetterSpacingXSAIIZE;
            baselineShift2 = baselineShiftM10486getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j8 = jM10485getBackground0d7_KjU;
            j9 = jM10449getLineHeightXSAIIZE;
            brush2 = brush;
            f3 = f4;
            i11 = iM10448getLineBreakrAG3T2k;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m10570copyNs73l9s(brush2, f3, j6, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j8, textDecoration2, shadow2, drawStyle2, i9, i10, j9, textIndent2, platformTextStyle2, lineHeightStyle2, i11, i8, textMotion2);
    }

    /* renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m10558copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, Object obj) {
        TextDirection textDirection2;
        long jM10449getLineHeightXSAIIZE;
        TextMotion textMotion2;
        Hyphens hyphens2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        TextAlign textAlign2;
        TextDirection textDirection3;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j6;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j7;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j8;
        long j9;
        Brush brush2;
        float f3;
        LineBreak lineBreak2;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i2 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f2;
        long jM10488getFontSizeXSAIIZE = (i2 & 4) != 0 ? textStyle.spanStyle.m10488getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight3 = (i2 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = (i2 & 16) != 0 ? textStyle.spanStyle.m10489getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = (i2 & 32) != 0 ? textStyle.spanStyle.m10490getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i2 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i2 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM10491getLetterSpacingXSAIIZE = (i2 & 256) != 0 ? textStyle.spanStyle.m10491getLetterSpacingXSAIIZE() : j3;
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = (i2 & 512) != 0 ? textStyle.spanStyle.m10486getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i2 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i2 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long jM10485getBackground0d7_KjU = (i2 & 4096) != 0 ? textStyle.spanStyle.m10485getBackground0d7_KjU() : j4;
        float f4 = alpha;
        TextDecoration textDecoration3 = (i2 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i2 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i2 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlignM11004boximpl = (i2 & 65536) != 0 ? TextAlign.m11004boximpl(textStyle.paragraphStyle.m10451getTextAligne0LSkKk()) : textAlign;
        TextDirection textDirectionM11021boximpl = (i2 & 131072) != 0 ? TextDirection.m11021boximpl(textStyle.paragraphStyle.m10453getTextDirections_7Xco()) : textDirection;
        if ((i2 & 262144) != 0) {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = textStyle.paragraphStyle.m10449getLineHeightXSAIIZE();
        } else {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = j5;
        }
        TextIndent textIndent3 = (i2 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i2 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i2 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM10909boximpl = (i2 & 4194304) != 0 ? LineBreak.m10909boximpl(textStyle.paragraphStyle.m10448getLineBreakrAG3T2k()) : lineBreak;
        Hyphens hyphensM10896boximpl = (i2 & 8388608) != 0 ? Hyphens.m10896boximpl(textStyle.paragraphStyle.m10446getHyphensvmbZdU8()) : hyphens;
        if ((i2 & 16777216) != 0) {
            hyphens2 = hyphensM10896boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlignM11004boximpl;
            textDirection3 = textDirection2;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            lineBreak2 = lineBreakM10909boximpl;
            shadow2 = shadow3;
            j6 = jM10488getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyleM10489getFontStyle4Lr2A7w;
            fontSynthesis2 = fontSynthesisM10490getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j7 = jM10491getLetterSpacingXSAIIZE;
            baselineShift2 = baselineShiftM10486getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j8 = jM10485getBackground0d7_KjU;
            j9 = jM10449getLineHeightXSAIIZE;
            brush2 = brush;
            f3 = f4;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphensM10896boximpl;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlignM11004boximpl;
            textDirection3 = textDirection2;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j6 = jM10488getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyleM10489getFontStyle4Lr2A7w;
            fontSynthesis2 = fontSynthesisM10490getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j7 = jM10491getLetterSpacingXSAIIZE;
            baselineShift2 = baselineShiftM10486getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j8 = jM10485getBackground0d7_KjU;
            j9 = jM10449getLineHeightXSAIIZE;
            brush2 = brush;
            f3 = f4;
            lineBreak2 = lineBreakM10909boximpl;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m10571copyaIRg9q4(brush2, f3, j6, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j8, textDecoration2, shadow2, drawStyle2, textAlign2, textDirection3, j9, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-p1EtxEg$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m10559copyp1EtxEg$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, Object obj) {
        int i7;
        long jM10449getLineHeightXSAIIZE;
        TextMotion textMotion2;
        int i8;
        long jM10487getColor0d7_KjU = (i6 & 1) != 0 ? textStyle.spanStyle.m10487getColor0d7_KjU() : j2;
        long jM10488getFontSizeXSAIIZE = (i6 & 2) != 0 ? textStyle.spanStyle.m10488getFontSizeXSAIIZE() : j3;
        FontWeight fontWeight2 = (i6 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = (i6 & 8) != 0 ? textStyle.spanStyle.m10489getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = (i6 & 16) != 0 ? textStyle.spanStyle.m10490getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i6 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i6 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM10491getLetterSpacingXSAIIZE = (i6 & 128) != 0 ? textStyle.spanStyle.m10491getLetterSpacingXSAIIZE() : j4;
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = (i6 & 256) != 0 ? textStyle.spanStyle.m10486getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i6 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i6 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j7 = jM10487getColor0d7_KjU;
        long jM10485getBackground0d7_KjU = (i6 & 2048) != 0 ? textStyle.spanStyle.m10485getBackground0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i6 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i6 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i6 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int iM10451getTextAligne0LSkKk = (i6 & 32768) != 0 ? textStyle.paragraphStyle.m10451getTextAligne0LSkKk() : i2;
        int iM10453getTextDirections_7Xco = (i6 & 65536) != 0 ? textStyle.paragraphStyle.m10453getTextDirections_7Xco() : i3;
        if ((i6 & 131072) != 0) {
            i7 = iM10453getTextDirections_7Xco;
            jM10449getLineHeightXSAIIZE = textStyle.paragraphStyle.m10449getLineHeightXSAIIZE();
        } else {
            i7 = iM10453getTextDirections_7Xco;
            jM10449getLineHeightXSAIIZE = j6;
        }
        TextIndent textIndent2 = (i6 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i6 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i6 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int iM10448getLineBreakrAG3T2k = (i6 & 2097152) != 0 ? textStyle.paragraphStyle.m10448getLineBreakrAG3T2k() : i4;
        int iM10446getHyphensvmbZdU8 = (i6 & 4194304) != 0 ? textStyle.paragraphStyle.m10446getHyphensvmbZdU8() : i5;
        if ((i6 & 8388608) != 0) {
            i8 = iM10446getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            i8 = iM10446getHyphensvmbZdU8;
        }
        return textStyle.m10572copyp1EtxEg(j7, jM10488getFontSizeXSAIIZE, fontWeight2, fontStyleM10489getFontStyle4Lr2A7w, fontSynthesisM10490getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM10491getLetterSpacingXSAIIZE, baselineShiftM10486getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM10485getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, iM10451getTextAligne0LSkKk, i7, jM10449getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, iM10448getLineBreakrAG3T2k, i8, textMotion2);
    }

    /* renamed from: copy-v2rsoow$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m10560copyv2rsoow$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, Object obj) {
        TextDirection textDirection2;
        long jM10449getLineHeightXSAIIZE;
        TextMotion textMotion2;
        Hyphens hyphens2;
        long jM10487getColor0d7_KjU = (i2 & 1) != 0 ? textStyle.spanStyle.m10487getColor0d7_KjU() : j2;
        long jM10488getFontSizeXSAIIZE = (i2 & 2) != 0 ? textStyle.spanStyle.m10488getFontSizeXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = (i2 & 8) != 0 ? textStyle.spanStyle.m10489getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = (i2 & 16) != 0 ? textStyle.spanStyle.m10490getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i2 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM10491getLetterSpacingXSAIIZE = (i2 & 128) != 0 ? textStyle.spanStyle.m10491getLetterSpacingXSAIIZE() : j4;
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = (i2 & 256) != 0 ? textStyle.spanStyle.m10486getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j7 = jM10487getColor0d7_KjU;
        long jM10485getBackground0d7_KjU = (i2 & 2048) != 0 ? textStyle.spanStyle.m10485getBackground0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i2 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i2 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlignM11004boximpl = (i2 & 32768) != 0 ? TextAlign.m11004boximpl(textStyle.paragraphStyle.m10451getTextAligne0LSkKk()) : textAlign;
        TextDirection textDirectionM11021boximpl = (i2 & 65536) != 0 ? TextDirection.m11021boximpl(textStyle.paragraphStyle.m10453getTextDirections_7Xco()) : textDirection;
        if ((i2 & 131072) != 0) {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = textStyle.paragraphStyle.m10449getLineHeightXSAIIZE();
        } else {
            textDirection2 = textDirectionM11021boximpl;
            jM10449getLineHeightXSAIIZE = j6;
        }
        TextIndent textIndent2 = (i2 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i2 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i2 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM10909boximpl = (i2 & 2097152) != 0 ? LineBreak.m10909boximpl(textStyle.paragraphStyle.m10448getLineBreakrAG3T2k()) : lineBreak;
        Hyphens hyphensM10896boximpl = (i2 & 4194304) != 0 ? Hyphens.m10896boximpl(textStyle.paragraphStyle.m10446getHyphensvmbZdU8()) : hyphens;
        if ((i2 & 8388608) != 0) {
            hyphens2 = hyphensM10896boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphensM10896boximpl;
        }
        return textStyle.m10573copyv2rsoow(j7, jM10488getFontSizeXSAIIZE, fontWeight2, fontStyleM10489getFontStyle4Lr2A7w, fontSynthesisM10490getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM10491getLetterSpacingXSAIIZE, baselineShiftM10486getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM10485getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, textAlignM11004boximpl, textDirection2, jM10449getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreakM10909boximpl, hyphens2, textMotion2);
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    /* renamed from: merge-Z1GrekI$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m10565mergeZ1GrekI$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion, int i2, Object obj) {
        long jM8264getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        return textStyle.m10590mergeZ1GrekI(jM8264getUnspecified0d7_KjU, (i2 & 2) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3, (i2 & 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (i2 & 32) != 0 ? null : fontFamily, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j4, (i2 & 256) != 0 ? null : baselineShift, (i2 & 512) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (i2 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (i2 & 16384) != 0 ? null : drawStyle, (i2 & 32768) != 0 ? null : textAlign, (i2 & 65536) != 0 ? null : textDirection, (i2 & 131072) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j6, (i2 & 262144) != 0 ? null : textIndent, (i2 & 524288) != 0 ? null : lineHeightStyle, (i2 & 1048576) != 0 ? null : lineBreak, (i2 & 2097152) != 0 ? null : hyphens, (i2 & 4194304) != 0 ? null : platformTextStyle, (i2 & 8388608) != 0 ? null : textMotion);
    }

    /* renamed from: merge-dA7vx0o$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m10566mergedA7vx0o$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i4, int i5, PlatformTextStyle platformTextStyle, TextMotion textMotion, int i6, Object obj) {
        long jM8264getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        return textStyle.m10591mergedA7vx0o(jM8264getUnspecified0d7_KjU, (i6 & 2) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3, (i6 & 4) != 0 ? null : fontWeight, (i6 & 8) != 0 ? null : fontStyle, (i6 & 16) != 0 ? null : fontSynthesis, (i6 & 32) != 0 ? null : fontFamily, (i6 & 64) != 0 ? null : str, (i6 & 128) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j4, (i6 & 256) != 0 ? null : baselineShift, (i6 & 512) != 0 ? null : textGeometricTransform, (i6 & 1024) != 0 ? null : localeList, (i6 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5, (i6 & 4096) != 0 ? null : textDecoration, (i6 & 8192) != 0 ? null : shadow, (i6 & 16384) != 0 ? null : drawStyle, (i6 & 32768) != 0 ? TextAlign.Companion.m11017getUnspecifiede0LSkKk() : i2, (i6 & 65536) != 0 ? TextDirection.Companion.m11033getUnspecifieds_7Xco() : i3, (i6 & 131072) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j6, (i6 & 262144) != 0 ? null : textIndent, (i6 & 524288) != 0 ? null : lineHeightStyle, (i6 & 1048576) != 0 ? LineBreak.Companion.m10929getUnspecifiedrAG3T2k() : i4, (i6 & 2097152) != 0 ? Hyphens.Companion.m10905getUnspecifiedvmbZdU8() : i5, (i6 & 4194304) != 0 ? null : platformTextStyle, (i6 & 8388608) != 0 ? null : textMotion);
    }

    /* renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m10567copyCXVQc50(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new TextStyle(new SpanStyle(Color.m8229equalsimpl0(j2, this.spanStyle.m10487getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, getDrawStyle(), (o) null), new ParagraphStyle(textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m10921unboximpl() : LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m10902unboximpl() : Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), getTextMotion(), (o) null), platformTextStyle);
    }

    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m10568copyHL5avdY(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent) {
        TextForegroundStyle textForegroundStyle$ui_text = Color.m8229equalsimpl0(j2, this.spanStyle.m10487getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m11038from8_81llA(j2);
        SpanStyle spanStyle = this.spanStyle;
        return new TextStyle(new SpanStyle(textForegroundStyle$ui_text, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, spanStyle.getPlatformStyle(), spanStyle.getDrawStyle(), (o) null), new ParagraphStyle(textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j6, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m10584getLineBreakrAG3T2k(), m10581getHyphensvmbZdU8(), getTextMotion(), (o) null), this.platformStyle);
    }

    /* renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m10569copyNOaFTUo(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        return new TextStyle(new SpanStyle(Color.m8229equalsimpl0(j2, this.spanStyle.m10487getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (o) null), new ParagraphStyle(textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, m10584getLineBreakrAG3T2k(), m10581getHyphensvmbZdU8(), getTextMotion(), (o) null), platformTextStyle);
    }

    /* renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m10570copyNs73l9s(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (o) null), new ParagraphStyle(i2, i3, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i4, i5, textMotion, (o) null), platformTextStyle);
    }

    /* renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m10571copyaIRg9q4(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (o) null), new ParagraphStyle(textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m10921unboximpl() : LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m10902unboximpl() : Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), textMotion, (o) null), platformTextStyle);
    }

    /* renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m10572copyp1EtxEg(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m8229equalsimpl0(j2, this.spanStyle.m10487getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (o) null), new ParagraphStyle(i2, i3, j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i4, i5, textMotion, (o) null), platformTextStyle);
    }

    /* renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m10573copyv2rsoow(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m8229equalsimpl0(j2, this.spanStyle.m10487getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (o) null), new ParagraphStyle(textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m10921unboximpl() : LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m10902unboximpl() : Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), textMotion, (o) null), platformTextStyle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return x.n(this.spanStyle, textStyle.spanStyle) && x.n(this.paragraphStyle, textStyle.paragraphStyle) && x.n(this.platformStyle, textStyle.platformStyle);
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m10574getBackground0d7_KjU() {
        return this.spanStyle.m10485getBackground0d7_KjU();
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m10575getBaselineShift5SSeXJ0() {
        return this.spanStyle.m10486getBaselineShift5SSeXJ0();
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m10576getColor0d7_KjU() {
        return this.spanStyle.m10487getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m10577getFontSizeXSAIIZE() {
        return this.spanStyle.m10488getFontSizeXSAIIZE();
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m10578getFontStyle4Lr2A7w() {
        return this.spanStyle.m10489getFontStyle4Lr2A7w();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m10579getFontSynthesisZQGJjVo() {
        return this.spanStyle.m10490getFontSynthesisZQGJjVo();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m10580getHyphensEaSxIns() {
        return Hyphens.m10896boximpl(m10581getHyphensvmbZdU8());
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m10581getHyphensvmbZdU8() {
        return this.paragraphStyle.m10446getHyphensvmbZdU8();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m10582getLetterSpacingXSAIIZE() {
        return this.spanStyle.m10491getLetterSpacingXSAIIZE();
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m10583getLineBreakLgCVezo() {
        return LineBreak.m10909boximpl(m10584getLineBreakrAG3T2k());
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m10584getLineBreakrAG3T2k() {
        return this.paragraphStyle.m10448getLineBreakrAG3T2k();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m10585getLineHeightXSAIIZE() {
        return this.paragraphStyle.m10449getLineHeightXSAIIZE();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle getParagraphStyle$ui_text() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    public final SpanStyle getSpanStyle$ui_text() {
        return this.spanStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m10586getTextAlignbuA522U() {
        return TextAlign.m11004boximpl(m10587getTextAligne0LSkKk());
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m10587getTextAligne0LSkKk() {
        return this.paragraphStyle.m10451getTextAligne0LSkKk();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m10588getTextDirectionmmuk1to() {
        return TextDirection.m11021boximpl(m10589getTextDirections_7Xco());
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m10589getTextDirections_7Xco() {
        return this.paragraphStyle.m10453getTextDirections_7Xco();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle textStyle) {
        return this == textStyle || this.spanStyle.hasSameNonLayoutAttributes$ui_text(textStyle.spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        if (this != textStyle) {
            return x.n(this.paragraphStyle, textStyle.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text(textStyle.spanStyle);
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = (this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode();
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return (iHashCode * 31) + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text() {
        int iHashCodeLayoutAffectingAttributes$ui_text = (this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text() * 31) + this.paragraphStyle.hashCode();
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return (iHashCodeLayoutAffectingAttributes$ui_text * 31) + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || x.n(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    /* renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m10590mergeZ1GrekI(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle spanStyleM10492fastMergedSHsh3o = SpanStyleKt.m10492fastMergedSHsh3o(this.spanStyle, j2, null, Float.NaN, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM10454fastMergej5T8yCg = ParagraphStyleKt.m10454fastMergej5T8yCg(this.paragraphStyle, textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m10921unboximpl() : LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m10902unboximpl() : Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), textMotion);
        return (this.spanStyle == spanStyleM10492fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM10454fastMergej5T8yCg) ? this : new TextStyle(spanStyleM10492fastMergedSHsh3o, paragraphStyleM10454fastMergej5T8yCg);
    }

    /* renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m10591mergedA7vx0o(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i4, int i5, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle spanStyleM10492fastMergedSHsh3o = SpanStyleKt.m10492fastMergedSHsh3o(this.spanStyle, j2, null, Float.NaN, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM10454fastMergej5T8yCg = ParagraphStyleKt.m10454fastMergej5T8yCg(this.paragraphStyle, i2, i3, j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i4, i5, textMotion);
        return (this.spanStyle == spanStyleM10492fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM10454fastMergej5T8yCg) ? this : new TextStyle(spanStyleM10492fastMergedSHsh3o, paragraphStyleM10454fastMergej5T8yCg);
    }

    public final TextStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m8236toStringimpl(m10576getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m11369toStringimpl(m10577getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m10578getFontStyle4Lr2A7w() + ", fontSynthesis=" + m10579getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m11369toStringimpl(m10582getLetterSpacingXSAIIZE())) + ", baselineShift=" + m10575getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m8236toStringimpl(m10574getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m11009toStringimpl(m10587getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m11026toStringimpl(m10589getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m11369toStringimpl(m10585getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m10920toStringimpl(m10584getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m10901toStringimpl(m10581getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    public final TextStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    public final TextStyle plus(TextStyle textStyle) {
        return merge(textStyle);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, o oVar) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, textAlign, textDirection, j6, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, o oVar) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, o oVar) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent, platformTextStyle, lineHeightStyle);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, o oVar) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent);
    }

    public /* synthetic */ TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, o oVar) {
        this(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, i2, i3, j5, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion);
    }

    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m10561getHyphensEaSxIns$annotations() {
    }

    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m10562getLineBreakLgCVezo$annotations() {
    }

    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m10563getTextAlignbuA522U$annotations() {
    }

    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m10564getTextDirectionmmuk1to$annotations() {
    }

    public /* synthetic */ TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, o oVar) {
        this(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        this(new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (o) null), new ParagraphStyle(i2, i3, j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i4, i5, textMotion, (o) null), platformTextStyle);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        int iM11033getUnspecifieds_7Xco;
        int iM10905getUnspecifiedvmbZdU8;
        SpanStyle spanStyle = new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (o) null);
        int iM11010unboximpl = textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        if (textDirection != null) {
            iM11033getUnspecifieds_7Xco = textDirection.m11027unboximpl();
        } else {
            iM11033getUnspecifieds_7Xco = TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        PlatformParagraphStyle paragraphStyle = platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null;
        int iM10921unboximpl = lineBreak != null ? lineBreak.m10921unboximpl() : LineBreak.Companion.m10929getUnspecifiedrAG3T2k();
        if (hyphens != null) {
            iM10905getUnspecifiedvmbZdU8 = hyphens.m10902unboximpl();
        } else {
            iM10905getUnspecifiedvmbZdU8 = Hyphens.Companion.m10905getUnspecifiedvmbZdU8();
        }
        this(spanStyle, new ParagraphStyle(iM11010unboximpl, iM11033getUnspecifieds_7Xco, j6, textIndent, paragraphStyle, lineHeightStyle, iM10921unboximpl, iM10905getUnspecifiedvmbZdU8, textMotion, (o) null), platformTextStyle);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent) {
        int iM11033getUnspecifieds_7Xco;
        SpanStyle spanStyle = new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (o) null);
        int iM11010unboximpl = textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        if (textDirection != null) {
            iM11033getUnspecifieds_7Xco = textDirection.m11027unboximpl();
        } else {
            iM11033getUnspecifieds_7Xco = TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        this(spanStyle, new ParagraphStyle(iM11010unboximpl, iM11033getUnspecifieds_7Xco, j6, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), (TextMotion) null, (o) null), null);
    }

    public final TextStyle merge(SpanStyle spanStyle) {
        return new TextStyle(toSpanStyle().merge(spanStyle), toParagraphStyle());
    }

    private TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        this(new SpanStyle(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (o) null), new ParagraphStyle(i2, i3, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i4, i5, textMotion, (o) null), platformTextStyle);
    }

    public final TextStyle merge(ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    private TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        int iM11033getUnspecifieds_7Xco;
        int iM10905getUnspecifiedvmbZdU8;
        SpanStyle spanStyle = new SpanStyle(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (o) null);
        int iM11010unboximpl = textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        if (textDirection != null) {
            iM11033getUnspecifieds_7Xco = textDirection.m11027unboximpl();
        } else {
            iM11033getUnspecifieds_7Xco = TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        PlatformParagraphStyle paragraphStyle = platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null;
        int iM10921unboximpl = lineBreak != null ? lineBreak.m10921unboximpl() : LineBreak.Companion.m10929getUnspecifiedrAG3T2k();
        if (hyphens != null) {
            iM10905getUnspecifiedvmbZdU8 = hyphens.m10902unboximpl();
        } else {
            iM10905getUnspecifiedvmbZdU8 = Hyphens.Companion.m10905getUnspecifiedvmbZdU8();
        }
        this(spanStyle, new ParagraphStyle(iM11010unboximpl, iM11033getUnspecifieds_7Xco, j5, textIndent, paragraphStyle, lineHeightStyle, iM10921unboximpl, iM10905getUnspecifiedvmbZdU8, textMotion, (o) null), platformTextStyle);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i2, o oVar) {
        this(spanStyle, paragraphStyle, (i2 & 4) != 0 ? null : platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, o oVar) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, i2, i3, j6, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion);
    }

    public /* synthetic */ TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, o oVar) {
        this(brush, (i6 & 2) != 0 ? Float.NaN : f2, (i6 & 4) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j2, (i6 & 8) != 0 ? null : fontWeight, (i6 & 16) != 0 ? null : fontStyle, (i6 & 32) != 0 ? null : fontSynthesis, (i6 & 64) != 0 ? null : fontFamily, (i6 & 128) != 0 ? null : str, (i6 & 256) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3, (i6 & 512) != 0 ? null : baselineShift, (i6 & 1024) != 0 ? null : textGeometricTransform, (i6 & 2048) != 0 ? null : localeList, (i6 & 4096) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4, (i6 & 8192) != 0 ? null : textDecoration, (i6 & 16384) != 0 ? null : shadow, (32768 & i6) != 0 ? null : drawStyle, (65536 & i6) != 0 ? TextAlign.Companion.m11017getUnspecifiede0LSkKk() : i2, (131072 & i6) != 0 ? TextDirection.Companion.m11033getUnspecifieds_7Xco() : i3, (262144 & i6) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j5, (524288 & i6) != 0 ? null : textIndent, (1048576 & i6) != 0 ? null : platformTextStyle, (2097152 & i6) != 0 ? null : lineHeightStyle, (4194304 & i6) != 0 ? LineBreak.Companion.m10929getUnspecifiedrAG3T2k() : i4, (8388608 & i6) != 0 ? Hyphens.Companion.m10905getUnspecifiedvmbZdU8() : i5, (i6 & 16777216) != 0 ? null : textMotion, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, o oVar) {
        long jM8264getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM11373getUnspecifiedXSAIIZE = (i2 & 2) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i2 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        String str2 = (i2 & 64) != 0 ? null : str;
        long jM11373getUnspecifiedXSAIIZE2 = (i2 & 128) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j4;
        BaselineShift baselineShift2 = (i2 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? null : localeList;
        long jM8264getUnspecified0d7_KjU2 = (i2 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? null : textDecoration;
        long j7 = jM8264getUnspecified0d7_KjU;
        Shadow shadow2 = (i2 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i2 & 16384) != 0 ? null : drawStyle;
        TextAlign textAlign2 = (i2 & 32768) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i2 & 65536) != 0 ? null : textDirection;
        long jM11373getUnspecifiedXSAIIZE3 = (i2 & 131072) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j6;
        TextIndent textIndent2 = (i2 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i2 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i2 & 1048576) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i2 & 2097152) != 0 ? null : lineBreak;
        Hyphens hyphens2 = (i2 & 4194304) != 0 ? null : hyphens;
        long j8 = jM11373getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j9 = jM11373getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j10 = jM8264getUnspecified0d7_KjU2;
        this(j7, j8, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j9, baselineShift3, textGeometricTransform3, localeList3, j10, textDecoration3, shadow2, drawStyle2, textAlign2, textDirection2, jM11373getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, (i2 & 8388608) != 0 ? null : textMotion, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, int i2, o oVar) {
        long jM8264getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM11373getUnspecifiedXSAIIZE = (i2 & 2) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i2 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        String str2 = (i2 & 64) != 0 ? null : str;
        long jM11373getUnspecifiedXSAIIZE2 = (i2 & 128) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j4;
        BaselineShift baselineShift2 = (i2 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? null : localeList;
        long jM8264getUnspecified0d7_KjU2 = (i2 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? null : textDecoration;
        long j7 = jM8264getUnspecified0d7_KjU;
        Shadow shadow2 = (i2 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i2 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i2 & 32768) != 0 ? null : textDirection;
        long jM11373getUnspecifiedXSAIIZE3 = (i2 & 65536) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j6;
        long j8 = jM11373getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j9 = jM11373getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j10 = jM8264getUnspecified0d7_KjU2;
        this(j7, j8, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j9, baselineShift3, textGeometricTransform3, localeList3, j10, textDecoration3, shadow2, textAlign2, textDirection2, jM11373getUnspecifiedXSAIIZE3, (i2 & 131072) != 0 ? null : textIndent, null);
    }

    public /* synthetic */ TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, o oVar) {
        this(brush, (i2 & 2) != 0 ? Float.NaN : f2, (i2 & 4) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j2, (i2 & 8) != 0 ? null : fontWeight, (i2 & 16) != 0 ? null : fontStyle, (i2 & 32) != 0 ? null : fontSynthesis, (i2 & 64) != 0 ? null : fontFamily, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3, (i2 & 512) != 0 ? null : baselineShift, (i2 & 1024) != 0 ? null : textGeometricTransform, (i2 & 2048) != 0 ? null : localeList, (i2 & 4096) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4, (i2 & 8192) != 0 ? null : textDecoration, (i2 & 16384) != 0 ? null : shadow, (32768 & i2) != 0 ? null : drawStyle, (65536 & i2) != 0 ? null : textAlign, (131072 & i2) != 0 ? null : textDirection, (262144 & i2) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j5, (524288 & i2) != 0 ? null : textIndent, (1048576 & i2) != 0 ? null : platformTextStyle, (2097152 & i2) != 0 ? null : lineHeightStyle, (4194304 & i2) != 0 ? null : lineBreak, (8388608 & i2) != 0 ? null : hyphens, (i2 & 16777216) != 0 ? null : textMotion, (o) null);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        int iM11033getUnspecifieds_7Xco;
        SpanStyle spanStyle = new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (o) null);
        int iM11010unboximpl = textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        if (textDirection != null) {
            iM11033getUnspecifieds_7Xco = textDirection.m11027unboximpl();
        } else {
            iM11033getUnspecifieds_7Xco = TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        this(spanStyle, new ParagraphStyle(iM11010unboximpl, iM11033getUnspecifieds_7Xco, j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), (TextMotion) null, (o) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i2, o oVar) {
        long jM8264getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM11373getUnspecifiedXSAIIZE = (i2 & 2) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i2 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        String str2 = (i2 & 64) != 0 ? null : str;
        long jM11373getUnspecifiedXSAIIZE2 = (i2 & 128) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j4;
        BaselineShift baselineShift2 = (i2 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? null : localeList;
        long jM8264getUnspecified0d7_KjU2 = (i2 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? null : textDecoration;
        long j7 = jM8264getUnspecified0d7_KjU;
        Shadow shadow2 = (i2 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i2 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i2 & 32768) != 0 ? null : textDirection;
        long jM11373getUnspecifiedXSAIIZE3 = (i2 & 65536) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j6;
        TextIndent textIndent2 = (i2 & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i2 & 262144) != 0 ? null : platformTextStyle;
        long j8 = jM11373getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j9 = jM11373getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j10 = jM8264getUnspecified0d7_KjU2;
        this(j7, j8, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j9, baselineShift3, textGeometricTransform3, localeList3, j10, textDecoration3, shadow2, textAlign2, textDirection2, jM11373getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, (i2 & 524288) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        int iM11033getUnspecifieds_7Xco;
        int iM10905getUnspecifiedvmbZdU8;
        SpanStyle spanStyle = new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, 32768, (o) null);
        int iM11010unboximpl = textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        if (textDirection != null) {
            iM11033getUnspecifieds_7Xco = textDirection.m11027unboximpl();
        } else {
            iM11033getUnspecifieds_7Xco = TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        PlatformParagraphStyle paragraphStyle = platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null;
        int iM10921unboximpl = lineBreak != null ? lineBreak.m10921unboximpl() : LineBreak.Companion.m10929getUnspecifiedrAG3T2k();
        if (hyphens != null) {
            iM10905getUnspecifiedvmbZdU8 = hyphens.m10902unboximpl();
        } else {
            iM10905getUnspecifiedvmbZdU8 = Hyphens.Companion.m10905getUnspecifiedvmbZdU8();
        }
        this(spanStyle, new ParagraphStyle(iM11010unboximpl, iM11033getUnspecifieds_7Xco, j6, textIndent, paragraphStyle, lineHeightStyle, iM10921unboximpl, iM10905getUnspecifiedvmbZdU8, (TextMotion) null, 256, (o) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, o oVar) {
        long jM8264getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM11373getUnspecifiedXSAIIZE = (i2 & 2) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i2 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        String str2 = (i2 & 64) != 0 ? null : str;
        long jM11373getUnspecifiedXSAIIZE2 = (i2 & 128) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j4;
        BaselineShift baselineShift2 = (i2 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? null : localeList;
        long jM8264getUnspecified0d7_KjU2 = (i2 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? null : textDecoration;
        long j7 = jM8264getUnspecified0d7_KjU;
        Shadow shadow2 = (i2 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i2 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i2 & 32768) != 0 ? null : textDirection;
        long jM11373getUnspecifiedXSAIIZE3 = (i2 & 65536) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j6;
        TextIndent textIndent2 = (i2 & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i2 & 262144) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i2 & 524288) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i2 & 1048576) != 0 ? null : lineBreak;
        long j8 = jM11373getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j9 = jM11373getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j10 = jM8264getUnspecified0d7_KjU2;
        this(j7, j8, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j9, baselineShift3, textGeometricTransform3, localeList3, j10, textDecoration3, shadow2, textAlign2, textDirection2, jM11373getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, (i2 & 2097152) != 0 ? null : hyphens, null);
    }
}
