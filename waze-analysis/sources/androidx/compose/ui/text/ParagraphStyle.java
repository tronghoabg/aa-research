package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ParagraphStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, o oVar) {
        int iM11017getUnspecifiede0LSkKk = (i6 & 1) != 0 ? TextAlign.Companion.m11017getUnspecifiede0LSkKk() : i2;
        int iM11033getUnspecifieds_7Xco = (i6 & 2) != 0 ? TextDirection.Companion.m11033getUnspecifieds_7Xco() : i3;
        long jM11373getUnspecifiedXSAIIZE = (i6 & 4) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j2;
        TextIndent textIndent2 = (i6 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i6 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i6 & 32) != 0 ? null : lineHeightStyle;
        int iM10929getUnspecifiedrAG3T2k = (i6 & 64) != 0 ? LineBreak.Companion.m10929getUnspecifiedrAG3T2k() : i4;
        int iM10905getUnspecifiedvmbZdU8 = (i6 & 128) != 0 ? Hyphens.Companion.m10905getUnspecifiedvmbZdU8() : i5;
        this(iM11017getUnspecifiede0LSkKk, iM11033getUnspecifieds_7Xco, jM11373getUnspecifiedXSAIIZE, textIndent2, platformParagraphStyle2, lineHeightStyle2, iM10929getUnspecifiedrAG3T2k, iM10905getUnspecifiedvmbZdU8, (i6 & 256) == 0 ? textMotion : null, (o) null);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m10431copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = TextAlign.m11004boximpl(paragraphStyle.textAlign);
        }
        if ((i2 & 2) != 0) {
            textDirection = TextDirection.m11021boximpl(paragraphStyle.textDirection);
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        return paragraphStyle.m10440copyElsmlbk(textAlign, textDirection, j2, textIndent2);
    }

    /* renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m10432copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = TextAlign.m11004boximpl(paragraphStyle.textAlign);
        }
        if ((i2 & 2) != 0) {
            textDirection = TextDirection.m11021boximpl(paragraphStyle.textDirection);
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i2 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i2 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i2 & 64) != 0) {
            lineBreak = LineBreak.m10909boximpl(paragraphStyle.lineBreak);
        }
        if ((i2 & 128) != 0) {
            hyphens = Hyphens.m10896boximpl(paragraphStyle.hyphens);
        }
        if ((i2 & 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        Hyphens hyphens2 = hyphens;
        TextMotion textMotion2 = textMotion;
        long j3 = j2;
        return paragraphStyle.m10441copyNH1kkwU(textAlign, textDirection, j3, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m10433copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = TextAlign.m11004boximpl(paragraphStyle.textAlign);
        }
        if ((i2 & 2) != 0) {
            textDirection = TextDirection.m11021boximpl(paragraphStyle.textDirection);
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i2 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i2 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i2 & 64) != 0) {
            lineBreak = LineBreak.m10909boximpl(paragraphStyle.lineBreak);
        }
        if ((i2 & 128) != 0) {
            hyphens = Hyphens.m10896boximpl(paragraphStyle.hyphens);
        }
        Hyphens hyphens2 = hyphens;
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j3 = j2;
        return paragraphStyle.m10442copyciSxzs0(textAlign, textDirection, j3, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m10434copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = TextAlign.m11004boximpl(paragraphStyle.textAlign);
        }
        if ((i2 & 2) != 0) {
            textDirection = TextDirection.m11021boximpl(paragraphStyle.textDirection);
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i2 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i2 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j3 = j2;
        return paragraphStyle.m10443copyxPh5V4g(textAlign, textDirection, j3, textIndent2, platformParagraphStyle, lineHeightStyle2);
    }

    /* renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m10435copyykzQM6k$default(ParagraphStyle paragraphStyle, int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = paragraphStyle.textAlign;
        }
        if ((i6 & 2) != 0) {
            i3 = paragraphStyle.textDirection;
        }
        if ((i6 & 4) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i6 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i6 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i6 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i6 & 64) != 0) {
            i4 = paragraphStyle.lineBreak;
        }
        if ((i6 & 128) != 0) {
            i5 = paragraphStyle.hyphens;
        }
        if ((i6 & 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        int i7 = i5;
        TextMotion textMotion2 = textMotion;
        long j3 = j2;
        return paragraphStyle.m10444copyykzQM6k(i2, i3, j3, textIndent, platformParagraphStyle, lineHeightStyle, i4, i7, textMotion2);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m10440copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent) {
        return new ParagraphStyle(textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j2, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (o) null);
    }

    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m10441copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m10921unboximpl() : LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m10902unboximpl() : Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), textMotion, (o) null);
    }

    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m10442copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m10921unboximpl() : LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m10902unboximpl() : Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), this.textMotion, (o) null);
    }

    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m10443copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign != null ? textAlign.m11010unboximpl() : TextAlign.Companion.m11017getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m11027unboximpl() : TextDirection.Companion.m11033getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (o) null);
    }

    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m10444copyykzQM6k(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        return new ParagraphStyle(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion, (o) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        return TextAlign.m11007equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m11024equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m11359equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && x.n(this.textIndent, paragraphStyle.textIndent) && x.n(this.platformStyle, paragraphStyle.platformStyle) && x.n(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m10915equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m10899equalsimpl0(this.hyphens, paragraphStyle.hyphens) && x.n(this.textMotion, paragraphStyle.textMotion);
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m10445getHyphensEaSxIns() {
        return Hyphens.m10896boximpl(this.hyphens);
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m10446getHyphensvmbZdU8() {
        return this.hyphens;
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m10447getLineBreakLgCVezo() {
        return LineBreak.m10909boximpl(this.lineBreak);
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m10448getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m10449getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m10450getTextAlignbuA522U() {
        return TextAlign.m11004boximpl(this.textAlign);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m10451getTextAligne0LSkKk() {
        return this.textAlign;
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m10452getTextDirectionmmuk1to() {
        return TextDirection.m11021boximpl(this.textDirection);
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m10453getTextDirections_7Xco() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        TextUnit.Companion companion = TextUnit.Companion;
        TextIndent textIndent = this.textIndent;
        int iHashCode = textIndent != null ? textIndent.hashCode() : 0;
        int i2 = this.textAlign;
        int i3 = this.textDirection;
        long j2 = this.lineHeight;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0;
        int iM11363hashCodeimpl = (((((i2 * 31) + i3) * 31) + TextUnit.m11363hashCodeimpl(j2)) * 31) + iHashCode;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = ((((iM11363hashCodeimpl * 31) + iHashCode2) * 31) + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31;
        int i4 = this.lineBreak;
        LineBreak.Companion companion2 = LineBreak.Companion;
        int i5 = (((iHashCode3 + i4) * 31) + this.hyphens) * 31;
        TextMotion textMotion = this.textMotion;
        return i5 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.m10454fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    public final ParagraphStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m11009toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m11026toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m11369toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m10920toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m10901toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m10436getHyphensEaSxIns$annotations() {
    }

    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m10437getLineBreakLgCVezo$annotations() {
    }

    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m10438getTextAlignbuA522U$annotations() {
    }

    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m10439getTextDirectionmmuk1to$annotations() {
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, o oVar) {
        this(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, o oVar) {
        this(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, o oVar) {
        this(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, o oVar) {
        this(textAlign, textDirection, j2, textIndent);
    }

    private ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        this.textAlign = i2;
        this.textDirection = i3;
        this.lineHeight = j2;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i4;
        this.hyphens = i5;
        this.textMotion = textMotion;
        if (TextUnit.m11359equalsimpl0(j2, TextUnit.Companion.m11373getUnspecifiedXSAIIZE()) || TextUnit.m11362getValueimpl(j2) >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("lineHeight can't be negative (" + TextUnit.m11362getValueimpl(j2) + ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent) {
        int iM11017getUnspecifiede0LSkKk;
        int iM11033getUnspecifieds_7Xco;
        if (textAlign != null) {
            iM11017getUnspecifiede0LSkKk = textAlign.m11010unboximpl();
        } else {
            iM11017getUnspecifiede0LSkKk = TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        }
        int i2 = iM11017getUnspecifiede0LSkKk;
        if (textDirection != null) {
            iM11033getUnspecifieds_7Xco = textDirection.m11027unboximpl();
        } else {
            iM11033getUnspecifieds_7Xco = TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        this(i2, iM11033getUnspecifieds_7Xco, j2, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), (TextMotion) null, (o) null);
    }

    public /* synthetic */ ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, o oVar) {
        this(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, o oVar) {
        long jM11373getUnspecifiedXSAIIZE = (i2 & 4) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j2;
        int i3 = i2 & 1;
        this(1 == i3 ? null : textAlign, (i2 & 2) != 0 ? null : textDirection, jM11373getUnspecifiedXSAIIZE, (i2 & 8) != 0 ? null : textIndent, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        int iM11017getUnspecifiede0LSkKk;
        int iM11033getUnspecifieds_7Xco;
        if (textAlign != null) {
            iM11017getUnspecifiede0LSkKk = textAlign.m11010unboximpl();
        } else {
            iM11017getUnspecifiede0LSkKk = TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        }
        int i2 = iM11017getUnspecifiede0LSkKk;
        if (textDirection != null) {
            iM11033getUnspecifieds_7Xco = textDirection.m11027unboximpl();
        } else {
            iM11033getUnspecifieds_7Xco = TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        this(i2, iM11033getUnspecifieds_7Xco, j2, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.Companion.m10929getUnspecifiedrAG3T2k(), Hyphens.Companion.m10905getUnspecifiedvmbZdU8(), (TextMotion) null, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i2, o oVar) {
        long jM11373getUnspecifiedXSAIIZE = (i2 & 4) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j2;
        int i3 = i2 & 1;
        TextDirection textDirection2 = (i2 & 2) != 0 ? null : textDirection;
        TextAlign textAlign2 = 1 == i3 ? null : textAlign;
        TextIndent textIndent2 = (i2 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i2 & 16) != 0 ? null : platformParagraphStyle;
        TextAlign textAlign3 = textAlign2;
        this(textAlign3, textDirection2, jM11373getUnspecifiedXSAIIZE, textIndent2, platformParagraphStyle2, (i2 & 32) == 0 ? lineHeightStyle : null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        int iM11017getUnspecifiede0LSkKk;
        int iM11033getUnspecifieds_7Xco;
        int iM10929getUnspecifiedrAG3T2k;
        int iM10905getUnspecifiedvmbZdU8;
        if (textAlign != null) {
            iM11017getUnspecifiede0LSkKk = textAlign.m11010unboximpl();
        } else {
            iM11017getUnspecifiede0LSkKk = TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        }
        int i2 = iM11017getUnspecifiede0LSkKk;
        if (textDirection != null) {
            iM11033getUnspecifieds_7Xco = textDirection.m11027unboximpl();
        } else {
            iM11033getUnspecifieds_7Xco = TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        int i3 = iM11033getUnspecifieds_7Xco;
        if (lineBreak != null) {
            iM10929getUnspecifiedrAG3T2k = lineBreak.m10921unboximpl();
        } else {
            iM10929getUnspecifiedrAG3T2k = LineBreak.Companion.m10929getUnspecifiedrAG3T2k();
        }
        int i4 = iM10929getUnspecifiedrAG3T2k;
        if (hyphens != null) {
            iM10905getUnspecifiedvmbZdU8 = hyphens.m10902unboximpl();
        } else {
            iM10905getUnspecifiedvmbZdU8 = Hyphens.Companion.m10905getUnspecifiedvmbZdU8();
        }
        this(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, iM10905getUnspecifiedvmbZdU8, (TextMotion) null, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, o oVar) {
        long jM11373getUnspecifiedXSAIIZE = (i2 & 4) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j2;
        int i3 = i2 & 1;
        TextDirection textDirection2 = (i2 & 2) != 0 ? null : textDirection;
        TextAlign textAlign2 = 1 == i3 ? null : textAlign;
        TextIndent textIndent2 = (i2 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i2 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i2 & 32) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i2 & 64) != 0 ? null : lineBreak;
        TextAlign textAlign3 = textAlign2;
        this(textAlign3, textDirection2, jM11373getUnspecifiedXSAIIZE, textIndent2, platformParagraphStyle2, lineHeightStyle2, lineBreak2, (i2 & 128) == 0 ? hyphens : null, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        int iM11017getUnspecifiede0LSkKk;
        int iM11033getUnspecifieds_7Xco;
        int iM10929getUnspecifiedrAG3T2k;
        int iM10905getUnspecifiedvmbZdU8;
        if (textAlign != null) {
            iM11017getUnspecifiede0LSkKk = textAlign.m11010unboximpl();
        } else {
            iM11017getUnspecifiede0LSkKk = TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        }
        int i2 = iM11017getUnspecifiede0LSkKk;
        if (textDirection != null) {
            iM11033getUnspecifieds_7Xco = textDirection.m11027unboximpl();
        } else {
            iM11033getUnspecifieds_7Xco = TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        int i3 = iM11033getUnspecifieds_7Xco;
        if (lineBreak != null) {
            iM10929getUnspecifiedrAG3T2k = lineBreak.m10921unboximpl();
        } else {
            iM10929getUnspecifiedrAG3T2k = LineBreak.Companion.m10929getUnspecifiedrAG3T2k();
        }
        int i4 = iM10929getUnspecifiedrAG3T2k;
        if (hyphens != null) {
            iM10905getUnspecifiedvmbZdU8 = hyphens.m10902unboximpl();
        } else {
            iM10905getUnspecifiedvmbZdU8 = Hyphens.Companion.m10905getUnspecifiedvmbZdU8();
        }
        this(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, iM10905getUnspecifiedvmbZdU8, textMotion, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, o oVar) {
        long jM11373getUnspecifiedXSAIIZE = (i2 & 4) != 0 ? TextUnit.Companion.m11373getUnspecifiedXSAIIZE() : j2;
        int i3 = i2 & 1;
        TextDirection textDirection2 = (i2 & 2) != 0 ? null : textDirection;
        TextAlign textAlign2 = 1 == i3 ? null : textAlign;
        TextIndent textIndent2 = (i2 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i2 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i2 & 32) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i2 & 64) != 0 ? null : lineBreak;
        Hyphens hyphens2 = (i2 & 128) != 0 ? null : hyphens;
        TextAlign textAlign3 = textAlign2;
        this(textAlign3, textDirection2, jM11373getUnspecifiedXSAIIZE, textIndent2, platformParagraphStyle2, lineHeightStyle2, lineBreak2, hyphens2, (i2 & 256) == 0 ? textMotion : null, (o) null);
    }
}
