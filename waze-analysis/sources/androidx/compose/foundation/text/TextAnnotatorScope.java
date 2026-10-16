package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import h.g.a.l;
import h.g.b.am;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextAnnotatorScope {
    private final AnnotatedString initialText;
    private AnnotatedString styledText;

    public TextAnnotatorScope(AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.styledText = annotatedString;
    }

    static final AnnotatedString.Range replaceStyle$lambda$0(am amVar, AnnotatedString.Range range, SpanStyle spanStyle, AnnotatedString.Range range2) {
        AnnotatedString.Range range3;
        AnnotatedString.Range range4;
        if (amVar.f48101a && (range2.getItem() instanceof SpanStyle) && range2.getStart() == range.getStart() && range2.getEnd() == range.getEnd()) {
            range3 = new AnnotatedString.Range(spanStyle == null ? new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (o) null) : spanStyle, range2.getStart(), range2.getEnd());
            range4 = range2;
        } else {
            range3 = range2;
            range4 = range3;
        }
        amVar.f48101a = x.n(range, range4);
        return range3;
    }

    public final AnnotatedString getStyledText() {
        return this.styledText;
    }

    public final void replaceStyle(final AnnotatedString.Range<LinkAnnotation> range, final SpanStyle spanStyle) {
        final am amVar = new am();
        this.styledText = this.initialText.mapAnnotations(new l() { // from class: androidx.compose.foundation.text.TextAnnotatorScope$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextAnnotatorScope.replaceStyle$lambda$0(amVar, range, spanStyle, (AnnotatedString.Range) obj);
            }
        });
    }

    public final void setStyledText(AnnotatedString annotatedString) {
        this.styledText = annotatedString;
    }
}
