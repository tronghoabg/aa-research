package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.TextStyleBuffer;
import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.g.b.x;
import h.k;
import h.n.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 8;
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
    private final TextRange composition;
    private final k<TextHighlightType, TextRange> highlight;
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> outputAnnotations;
    private final long selection;
    private final CharSequence text;
    private final TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer;

    private TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, k<TextHighlightType, TextRange> kVar, List<AnnotatedString.Range<AnnotatedString.Annotation>> list, List<AnnotatedString.Range<AnnotatedString.Annotation>> list2, TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer) {
        this.composingAnnotations = list;
        this.outputAnnotations = list2;
        this.textStyleBuffer = textStyleBuffer;
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = TextRangeKt.m10552coerceIn8ffj60Q(j2, 0, charSequence.length());
        this.composition = textRange != null ? TextRange.m10534boximpl(TextRangeKt.m10552coerceIn8ffj60Q(textRange.m10550unboximpl(), 0, charSequence.length())) : null;
        this.highlight = kVar != null ? k.e(kVar, null, TextRange.m10534boximpl(TextRangeKt.m10552coerceIn8ffj60Q(((TextRange) kVar.d()).m10550unboximpl(), 0, charSequence.length())), 1) : null;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return get(i2);
    }

    public final boolean contentEquals(CharSequence charSequence) {
        return o.k(this.text, charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        return TextRange.m10539equalsimpl0(this.selection, textFieldCharSequence.selection) && x.n(this.composition, textFieldCharSequence.composition) && x.n(this.highlight, textFieldCharSequence.highlight) && x.n(this.composingAnnotations, textFieldCharSequence.composingAnnotations) && contentEquals(textFieldCharSequence.text) && x.n(this.textStyleBuffer, textFieldCharSequence.textStyleBuffer);
    }

    public char get(int i2) {
        return this.text.charAt(i2);
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
        return this.composingAnnotations;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m3483getCompositionMzsxiRA() {
        return this.composition;
    }

    public final k<TextHighlightType, TextRange> getHighlight() {
        return this.highlight;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getOutputAnnotations() {
        return this.outputAnnotations;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m3484getSelectiond9O1mEE() {
        return this.selection;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final TextStyleBuffer<AnnotatedString.Annotation> getTextStyleBuffer() {
        return this.textStyleBuffer;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        TextRange.Companion companion = TextRange.Companion;
        TextRange textRange = this.composition;
        int iM10547hashCodeimpl = (((iHashCode + TextRange.m10547hashCodeimpl(this.selection)) * 31) + (textRange != null ? TextRange.m10547hashCodeimpl(textRange.m10550unboximpl()) : 0)) * 31;
        k<TextHighlightType, TextRange> kVar = this.highlight;
        int iHashCode2 = (iM10547hashCodeimpl + (kVar != null ? kVar.hashCode() : 0)) * 31;
        List<AnnotatedString.Range<AnnotatedString.Annotation>> list = this.composingAnnotations;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer = this.textStyleBuffer;
        return iHashCode3 + (textStyleBuffer != null ? textStyleBuffer.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final boolean shouldShowSelection() {
        return this.highlight == null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.text.subSequence(i2, i3);
    }

    public final void toCharArray(char[] cArr, int i2, int i3, int i4) {
        ToCharArray_androidKt.toCharArray(this.text, cArr, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text.toString();
    }

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, k kVar, List list, List list2, TextStyleBuffer textStyleBuffer, h.g.b.o oVar) {
        this(charSequence, j2, textRange, kVar, list, list2, textStyleBuffer);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, k kVar, List list, List list2, TextStyleBuffer textStyleBuffer, int i2, h.g.b.o oVar) {
        CharSequence charSequence2 = (i2 & 1) != 0 ? "" : charSequence;
        long jM10551getZerod9O1mEE = (i2 & 2) != 0 ? TextRange.Companion.m10551getZerod9O1mEE() : j2;
        TextRange textRange2 = (i2 & 4) != 0 ? null : textRange;
        k kVar2 = (i2 & 8) != 0 ? null : kVar;
        List list3 = (i2 & 16) != 0 ? null : list;
        List list4 = (i2 & 32) != 0 ? null : list2;
        this(charSequence2, jM10551getZerod9O1mEE, textRange2, kVar2, list3, list4, (i2 & 64) == 0 ? textStyleBuffer : null, null);
    }
}
