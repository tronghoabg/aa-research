package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SpanStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final long background;
    private final BaselineShift baselineShift;
    private final DrawStyle drawStyle;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final LocaleList localeList;
    private final PlatformSpanStyle platformStyle;
    private final Shadow shadow;
    private final TextDecoration textDecoration;
    private final TextForegroundStyle textForegroundStyle;
    private final TextGeometricTransform textGeometricTransform;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, o oVar) {
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
        long j6 = jM8264getUnspecified0d7_KjU;
        Shadow shadow2 = (i2 & 8192) != 0 ? null : shadow;
        PlatformSpanStyle platformSpanStyle2 = (i2 & 16384) != 0 ? null : platformSpanStyle;
        long j7 = jM11373getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j8 = jM11373getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = jM8264getUnspecified0d7_KjU2;
        this(j6, j7, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j8, baselineShift3, textGeometricTransform3, localeList3, j9, textDecoration3, shadow2, platformSpanStyle2, (i2 & 32768) != 0 ? null : drawStyle, (o) null);
    }

    /* renamed from: copy-2BkPm_w$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m10477copy2BkPm_w$default(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i2, Object obj) {
        long jM10487getColor0d7_KjU = (i2 & 1) != 0 ? spanStyle.m10487getColor0d7_KjU() : j2;
        return spanStyle.m10481copy2BkPm_w(jM10487getColor0d7_KjU, (i2 & 2) != 0 ? spanStyle.fontSize : j3, (i2 & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i2 & 8) != 0 ? spanStyle.fontStyle : fontStyle, (i2 & 16) != 0 ? spanStyle.fontSynthesis : fontSynthesis, (i2 & 32) != 0 ? spanStyle.fontFamily : fontFamily, (i2 & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i2 & 128) != 0 ? spanStyle.letterSpacing : j4, (i2 & 256) != 0 ? spanStyle.baselineShift : baselineShift, (i2 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i2 & 1024) != 0 ? spanStyle.localeList : localeList, (i2 & 2048) != 0 ? spanStyle.background : j5, (i2 & 4096) != 0 ? spanStyle.textDecoration : textDecoration, (i2 & 8192) != 0 ? spanStyle.shadow : shadow, (i2 & 16384) != 0 ? spanStyle.platformStyle : platformSpanStyle);
    }

    /* renamed from: copy-GSF8kmg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m10478copyGSF8kmg$default(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, Object obj) {
        long jM10487getColor0d7_KjU = (i2 & 1) != 0 ? spanStyle.m10487getColor0d7_KjU() : j2;
        long j6 = (i2 & 2) != 0 ? spanStyle.fontSize : j3;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? spanStyle.fontWeight : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? spanStyle.fontStyle : fontStyle;
        FontSynthesis fontSynthesis2 = (i2 & 16) != 0 ? spanStyle.fontSynthesis : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? spanStyle.fontFamily : fontFamily;
        String str2 = (i2 & 64) != 0 ? spanStyle.fontFeatureSettings : str;
        long j7 = (i2 & 128) != 0 ? spanStyle.letterSpacing : j4;
        BaselineShift baselineShift2 = (i2 & 256) != 0 ? spanStyle.baselineShift : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        LocaleList localeList2 = (i2 & 1024) != 0 ? spanStyle.localeList : localeList;
        long j8 = jM10487getColor0d7_KjU;
        long j9 = (i2 & 2048) != 0 ? spanStyle.background : j5;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? spanStyle.textDecoration : textDecoration;
        return spanStyle.m10482copyGSF8kmg(j8, j6, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j9, textDecoration2, (i2 & 8192) != 0 ? spanStyle.shadow : shadow, (i2 & 16384) != 0 ? spanStyle.platformStyle : platformSpanStyle, (i2 & 32768) != 0 ? spanStyle.drawStyle : drawStyle);
    }

    /* renamed from: copy-IuqyXdg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m10479copyIuqyXdg$default(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, int i2, Object obj) {
        long jM10487getColor0d7_KjU = (i2 & 1) != 0 ? spanStyle.m10487getColor0d7_KjU() : j2;
        return spanStyle.m10483copyIuqyXdg(jM10487getColor0d7_KjU, (i2 & 2) != 0 ? spanStyle.fontSize : j3, (i2 & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i2 & 8) != 0 ? spanStyle.fontStyle : fontStyle, (i2 & 16) != 0 ? spanStyle.fontSynthesis : fontSynthesis, (i2 & 32) != 0 ? spanStyle.fontFamily : fontFamily, (i2 & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i2 & 128) != 0 ? spanStyle.letterSpacing : j4, (i2 & 256) != 0 ? spanStyle.baselineShift : baselineShift, (i2 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i2 & 1024) != 0 ? spanStyle.localeList : localeList, (i2 & 2048) != 0 ? spanStyle.background : j5, (i2 & 4096) != 0 ? spanStyle.textDecoration : textDecoration, (i2 & 8192) != 0 ? spanStyle.shadow : shadow);
    }

    /* renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m10480copyNcG25M8$default(SpanStyle spanStyle, Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, Object obj) {
        float f3;
        long j5;
        long j6;
        DrawStyle drawStyle2;
        PlatformSpanStyle platformSpanStyle2;
        long j7;
        long j8;
        TextDecoration textDecoration2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        FontFamily fontFamily2;
        String str2;
        long j9;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        Shadow shadow2;
        float alpha = (i2 & 2) != 0 ? spanStyle.getAlpha() : f2;
        long j10 = (i2 & 4) != 0 ? spanStyle.fontSize : j2;
        FontWeight fontWeight3 = (i2 & 8) != 0 ? spanStyle.fontWeight : fontWeight;
        FontStyle fontStyle3 = (i2 & 16) != 0 ? spanStyle.fontStyle : fontStyle;
        FontSynthesis fontSynthesis3 = (i2 & 32) != 0 ? spanStyle.fontSynthesis : fontSynthesis;
        FontFamily fontFamily3 = (i2 & 64) != 0 ? spanStyle.fontFamily : fontFamily;
        String str3 = (i2 & 128) != 0 ? spanStyle.fontFeatureSettings : str;
        long j11 = (i2 & 256) != 0 ? spanStyle.letterSpacing : j3;
        BaselineShift baselineShift3 = (i2 & 512) != 0 ? spanStyle.baselineShift : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i2 & 1024) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        LocaleList localeList3 = (i2 & 2048) != 0 ? spanStyle.localeList : localeList;
        if ((i2 & 4096) != 0) {
            f3 = alpha;
            j5 = j10;
            j6 = spanStyle.background;
        } else {
            f3 = alpha;
            j5 = j10;
            j6 = j4;
        }
        TextDecoration textDecoration3 = (i2 & 8192) != 0 ? spanStyle.textDecoration : textDecoration;
        Shadow shadow3 = (i2 & 16384) != 0 ? spanStyle.shadow : shadow;
        PlatformSpanStyle platformSpanStyle3 = (i2 & 32768) != 0 ? spanStyle.platformStyle : platformSpanStyle;
        if ((i2 & 65536) != 0) {
            platformSpanStyle2 = platformSpanStyle3;
            drawStyle2 = spanStyle.drawStyle;
            j8 = j6;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j9 = j11;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
            j7 = j5;
        } else {
            drawStyle2 = drawStyle;
            platformSpanStyle2 = platformSpanStyle3;
            j7 = j5;
            j8 = j6;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j9 = j11;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
        }
        return spanStyle.m10484copyNcG25M8(brush, f3, j7, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j9, baselineShift2, textGeometricTransform2, localeList2, j8, textDecoration2, shadow2, platformSpanStyle2, drawStyle2);
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    /* renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ SpanStyle m10481copy2BkPm_w(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        return new SpanStyle(Color.m8229equalsimpl0(j2, m10487getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (o) null);
    }

    /* renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m10482copyGSF8kmg(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        return new SpanStyle(Color.m8229equalsimpl0(j2, m10487getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle, (o) null);
    }

    /* renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ SpanStyle m10483copyIuqyXdg(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow) {
        return new SpanStyle(Color.m8229equalsimpl0(j2, m10487getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, this.platformStyle, this.drawStyle, (o) null);
    }

    /* renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m10484copyNcG25M8(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush, f2), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (o) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return hasSameLayoutAffectingAttributes$ui_text(spanStyle) && hasSameNonLayoutAttributes$ui_text(spanStyle);
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m10485getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m10486getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m10487getColor0d7_KjU() {
        return this.textForegroundStyle.mo10891getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m10488getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m10489getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m10490getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m10491getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final TextForegroundStyle getTextForegroundStyle$ui_text() {
        return this.textForegroundStyle;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        return TextUnit.m11359equalsimpl0(this.fontSize, spanStyle.fontSize) && x.n(this.fontWeight, spanStyle.fontWeight) && x.n(this.fontStyle, spanStyle.fontStyle) && x.n(this.fontSynthesis, spanStyle.fontSynthesis) && x.n(this.fontFamily, spanStyle.fontFamily) && x.n(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.m11359equalsimpl0(this.letterSpacing, spanStyle.letterSpacing) && x.n(this.baselineShift, spanStyle.baselineShift) && x.n(this.textGeometricTransform, spanStyle.textGeometricTransform) && x.n(this.localeList, spanStyle.localeList) && Color.m8229equalsimpl0(this.background, spanStyle.background) && x.n(this.platformStyle, spanStyle.platformStyle);
    }

    public final boolean hasSameNonLayoutAttributes$ui_text(SpanStyle spanStyle) {
        return x.n(this.textForegroundStyle, spanStyle.textForegroundStyle) && x.n(this.textDecoration, spanStyle.textDecoration) && x.n(this.shadow, spanStyle.shadow) && x.n(this.drawStyle, spanStyle.drawStyle);
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(m10487getColor0d7_KjU());
        Brush brush = getBrush();
        int iHashCode = (((((iM8235hashCodeimpl * 31) + (brush != null ? brush.hashCode() : 0)) * 31) + Float.floatToIntBits(getAlpha())) * 31) + TextUnit.m11363hashCodeimpl(this.fontSize);
        FontWeight fontWeight = this.fontWeight;
        int iHashCode2 = ((iHashCode * 31) + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iM10664unboximpl = (iHashCode2 + (fontStyle != null ? fontStyle.m10664unboximpl() : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM10677unboximpl = (iM10664unboximpl + (fontSynthesis != null ? fontSynthesis.m10677unboximpl() : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode3 = (iM10677unboximpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.m11363hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int iM10877hashCodeimpl = (iHashCode4 + (baselineShift != null ? BaselineShift.m10877hashCodeimpl(baselineShift.m10879unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode5 = (iM10877hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode6 = (((iHashCode5 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m8235hashCodeimpl(this.background)) * 31;
        TextDecoration textDecoration = this.textDecoration;
        int iHashCode7 = (iHashCode6 + (textDecoration != null ? textDecoration.hashCode() : 0)) * 31;
        Shadow shadow = this.shadow;
        int iHashCode8 = (iHashCode7 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int iHashCode9 = (iHashCode8 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.drawStyle;
        return iHashCode9 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text() {
        TextUnit.Companion companion = TextUnit.Companion;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode = fontWeight != null ? fontWeight.hashCode() : 0;
        long j2 = this.fontSize;
        FontStyle fontStyle = this.fontStyle;
        int iM10664unboximpl = fontStyle != null ? fontStyle.m10664unboximpl() : 0;
        int iM11363hashCodeimpl = (TextUnit.m11363hashCodeimpl(j2) * 31) + iHashCode;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM10677unboximpl = ((((iM11363hashCodeimpl * 31) + iM10664unboximpl) * 31) + (fontSynthesis != null ? fontSynthesis.m10677unboximpl() : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode2 = (iM10677unboximpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.m11363hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int iM10877hashCodeimpl = (iHashCode3 + (baselineShift != null ? BaselineShift.m10877hashCodeimpl(baselineShift.m10879unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = (iM10877hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode5 = (((iHashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m8235hashCodeimpl(this.background)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return iHashCode5 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    public final SpanStyle merge(SpanStyle spanStyle) {
        if (spanStyle == null) {
            return this;
        }
        TextForegroundStyle textForegroundStyle = spanStyle.textForegroundStyle;
        return SpanStyleKt.m10492fastMergedSHsh3o(this, textForegroundStyle.mo10891getColor0d7_KjU(), textForegroundStyle.getBrush(), textForegroundStyle.getAlpha(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.background, spanStyle.textDecoration, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    public final SpanStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.m8236toStringimpl(m10487getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m11369toStringimpl(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) TextUnit.m11369toStringimpl(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.m8236toStringimpl(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, o oVar) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle);
    }

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, o oVar) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, o oVar) {
        this(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j2;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j3;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j4;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, o oVar) {
        this(textForegroundStyle, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow) {
        this(TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, 32768, (o) null);
    }

    private SpanStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.from(brush, f2), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (o) null);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, o oVar) {
        this(textForegroundStyle, (i2 & 2) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j2, (i2 & 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (i2 & 32) != 0 ? null : fontFamily, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3, (i2 & 256) != 0 ? null : baselineShift, (i2 & 512) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (i2 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (i2 & 16384) != 0 ? null : platformSpanStyle, (i2 & 32768) != 0 ? null : drawStyle, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, int i2, o oVar) {
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
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j6 = jM11373getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j7 = jM8264getUnspecified0d7_KjU2;
        this(jM8264getUnspecified0d7_KjU, jM11373getUnspecifiedXSAIIZE, fontWeight2, fontStyle3, fontSynthesis3, fontFamily3, str3, j6, baselineShift3, textGeometricTransform3, localeList3, j7, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (o) null);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, o oVar) {
        this(brush, (i2 & 2) != 0 ? Float.NaN : f2, (i2 & 4) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j2, (i2 & 8) != 0 ? null : fontWeight, (i2 & 16) != 0 ? null : fontStyle, (i2 & 32) != 0 ? null : fontSynthesis, (i2 & 64) != 0 ? null : fontFamily, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j3, (i2 & 512) != 0 ? null : baselineShift, (i2 & 1024) != 0 ? null : textGeometricTransform, (i2 & 2048) != 0 ? null : localeList, (i2 & 4096) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4, (i2 & 8192) != 0 ? null : textDecoration, (i2 & 16384) != 0 ? null : shadow, (32768 & i2) != 0 ? null : platformSpanStyle, (i2 & 65536) != 0 ? null : drawStyle, (o) null);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i2, o oVar) {
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
        long j6 = jM8264getUnspecified0d7_KjU;
        long j7 = jM11373getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j8 = jM11373getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = jM8264getUnspecified0d7_KjU2;
        this(j6, j7, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j8, baselineShift3, textGeometricTransform3, localeList3, j9, textDecoration3, (i2 & 8192) != 0 ? null : shadow, (i2 & 16384) != 0 ? null : platformSpanStyle, (o) null);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.m11038from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle, (o) null);
    }

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, o oVar) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle);
    }
}
