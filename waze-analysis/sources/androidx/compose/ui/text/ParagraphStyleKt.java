package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m11373getUnspecifiedXSAIIZE();

    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    public static final ParagraphStyle m10454fastMergej5T8yCg(ParagraphStyle paragraphStyle, int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        long jM10449getLineHeightXSAIIZE;
        int iM10451getTextAligne0LSkKk = i2;
        TextIndent textIndent2 = textIndent;
        if (TextAlign.m11007equalsimpl0(iM10451getTextAligne0LSkKk, TextAlign.Companion.m11017getUnspecifiede0LSkKk()) || TextAlign.m11007equalsimpl0(iM10451getTextAligne0LSkKk, paragraphStyle.m10451getTextAligne0LSkKk())) {
            if (TextUnit.m11360getRawTypeimpl(j2) == 0) {
                jM10449getLineHeightXSAIIZE = j2;
            } else {
                jM10449getLineHeightXSAIIZE = j2;
                if (TextUnit.m11359equalsimpl0(jM10449getLineHeightXSAIIZE, paragraphStyle.m10449getLineHeightXSAIIZE())) {
                }
            }
            if ((textIndent2 == null || x.n(textIndent2, paragraphStyle.getTextIndent())) && ((TextDirection.m11024equalsimpl0(i3, TextDirection.Companion.m11033getUnspecifieds_7Xco()) || TextDirection.m11024equalsimpl0(i3, paragraphStyle.m10453getTextDirections_7Xco())) && ((platformParagraphStyle == null || x.n(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || x.n(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((LineBreak.m10915equalsimpl0(i4, LineBreak.Companion.m10929getUnspecifiedrAG3T2k()) || LineBreak.m10915equalsimpl0(i4, paragraphStyle.m10448getLineBreakrAG3T2k())) && ((Hyphens.m10899equalsimpl0(i5, Hyphens.Companion.m10905getUnspecifiedvmbZdU8()) || Hyphens.m10899equalsimpl0(i5, paragraphStyle.m10446getHyphensvmbZdU8())) && (textMotion == null || x.n(textMotion, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            jM10449getLineHeightXSAIIZE = j2;
        }
        if (TextUnit.m11360getRawTypeimpl(jM10449getLineHeightXSAIIZE) == 0) {
            jM10449getLineHeightXSAIIZE = paragraphStyle.m10449getLineHeightXSAIIZE();
        }
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (TextAlign.m11007equalsimpl0(iM10451getTextAligne0LSkKk, TextAlign.Companion.m11017getUnspecifiede0LSkKk())) {
            iM10451getTextAligne0LSkKk = paragraphStyle.m10451getTextAligne0LSkKk();
        }
        return new ParagraphStyle(iM10451getTextAligne0LSkKk, TextDirection.m11024equalsimpl0(i3, TextDirection.Companion.m11033getUnspecifieds_7Xco()) ? paragraphStyle.m10453getTextDirections_7Xco() : i3, jM10449getLineHeightXSAIIZE, textIndent3, mergePlatformStyle(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, LineBreak.m10915equalsimpl0(i4, LineBreak.Companion.m10929getUnspecifiedrAG3T2k()) ? paragraphStyle.m10448getLineBreakrAG3T2k() : i4, Hyphens.m10899equalsimpl0(i5, Hyphens.Companion.m10905getUnspecifiedvmbZdU8()) ? paragraphStyle.m10446getHyphensvmbZdU8() : i5, textMotion == null ? paragraphStyle.getTextMotion() : textMotion, (o) null);
    }

    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f2) {
        int iM11010unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m11004boximpl(paragraphStyle.m10451getTextAligne0LSkKk()), TextAlign.m11004boximpl(paragraphStyle2.m10451getTextAligne0LSkKk()), f2)).m11010unboximpl();
        int iM11027unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m11021boximpl(paragraphStyle.m10453getTextDirections_7Xco()), TextDirection.m11021boximpl(paragraphStyle2.m10453getTextDirections_7Xco()), f2)).m11027unboximpl();
        long jM10493lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m10493lerpTextUnitInheritableC3pnCVY(paragraphStyle.m10449getLineHeightXSAIIZE(), paragraphStyle2.m10449getLineHeightXSAIIZE(), f2);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(iM11010unboximpl, iM11027unboximpl, jM10493lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f2), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f2), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f2), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m10909boximpl(paragraphStyle.m10448getLineBreakrAG3T2k()), LineBreak.m10909boximpl(paragraphStyle2.m10448getLineBreakrAG3T2k()), f2)).m10921unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m10896boximpl(paragraphStyle.m10446getHyphensvmbZdU8()), Hyphens.m10896boximpl(paragraphStyle2.m10446getHyphensvmbZdU8()), f2)).m10902unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f2), (o) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f2) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f2);
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        return paragraphStyle.getPlatformStyle() == null ? platformParagraphStyle : platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        int iM11016getStarte0LSkKk = TextAlign.m11007equalsimpl0(paragraphStyle.m10451getTextAligne0LSkKk(), TextAlign.Companion.m11017getUnspecifiede0LSkKk()) ? TextAlign.Companion.m11016getStarte0LSkKk() : paragraphStyle.m10451getTextAligne0LSkKk();
        int iM10592resolveTextDirectionIhaHGbI = TextStyleKt.m10592resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m10453getTextDirections_7Xco());
        long jM10449getLineHeightXSAIIZE = TextUnit.m11360getRawTypeimpl(paragraphStyle.m10449getLineHeightXSAIIZE()) == 0 ? DefaultLineHeight : paragraphStyle.m10449getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int iM10928getSimplerAG3T2k = LineBreak.m10915equalsimpl0(paragraphStyle.m10448getLineBreakrAG3T2k(), LineBreak.Companion.m10929getUnspecifiedrAG3T2k()) ? LineBreak.Companion.m10928getSimplerAG3T2k() : paragraphStyle.m10448getLineBreakrAG3T2k();
        int iM10904getNonevmbZdU8 = Hyphens.m10899equalsimpl0(paragraphStyle.m10446getHyphensvmbZdU8(), Hyphens.Companion.m10905getUnspecifiedvmbZdU8()) ? Hyphens.Companion.m10904getNonevmbZdU8() : paragraphStyle.m10446getHyphensvmbZdU8();
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(iM11016getStarte0LSkKk, iM10592resolveTextDirectionIhaHGbI, jM10449getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, iM10928getSimplerAG3T2k, iM10904getNonevmbZdU8, textMotion, (o) null);
    }
}
