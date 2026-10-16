package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.input.TextFieldValue$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            SaverScope saverScope = (SaverScope) obj;
            TextFieldValue textFieldValue = (TextFieldValue) obj2;
            return i.f(SaversKt.save(textFieldValue.annotatedString, SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m10534boximpl(textFieldValue.selection), SaversKt.getSaver(TextRange.Companion), saverScope));
        }
    }, new l() { // from class: androidx.compose.ui.text.input.TextFieldValue$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return TextFieldValue.Saver$lambda$1(obj);
        }
    });
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    private TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m10552coerceIn8ffj60Q(j2, 0, getText().length());
        this.composition = textRange != null ? TextRange.m10534boximpl(TextRangeKt.m10552coerceIn8ffj60Q(textRange.m10550unboximpl(), 0, getText().length())) : null;
    }

    static final TextFieldValue Saver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
        TextRange textRangeRestore = null;
        AnnotatedString annotatedStringRestore = ((!x.n(obj2, false) || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
        if (annotatedStringRestore == null) {
            x.g();
        }
        Object obj3 = list.get(1);
        Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
        if ((!x.n(obj3, false) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textRangeRestore = saver.restore(obj3);
        }
        if (textRangeRestore == null) {
            x.g();
        }
        return new TextFieldValue(annotatedStringRestore, textRangeRestore.m10550unboximpl(), (TextRange) null, 4, (o) null);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m10826copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j2, TextRange textRange, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i2 & 2) != 0) {
            j2 = textFieldValue.selection;
        }
        if ((i2 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m10828copy3r_uNRQ(annotatedString, j2, textRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m10829copy3r_uNRQ(String str, long j2, TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j2, textRange, (o) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.m10539equalsimpl0(this.selection, textFieldValue.selection) && x.n(this.composition, textFieldValue.composition) && x.n(this.annotatedString, textFieldValue.annotatedString);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m10830getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m10831getSelectiond9O1mEE() {
        return this.selection;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int iHashCode = this.annotatedString.hashCode() * 31;
        TextRange.Companion companion = TextRange.Companion;
        TextRange textRange = this.composition;
        return ((iHashCode + TextRange.m10547hashCodeimpl(this.selection)) * 31) + (textRange != null ? TextRange.m10547hashCodeimpl(textRange.m10550unboximpl()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m10549toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m10828copy3r_uNRQ(AnnotatedString annotatedString, long j2, TextRange textRange) {
        return new TextFieldValue(annotatedString, j2, textRange, (o) null);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m10827copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j2, TextRange textRange, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = textFieldValue.selection;
        }
        if ((i2 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m10829copy3r_uNRQ(str, j2, textRange);
    }

    public /* synthetic */ TextFieldValue(String str, long j2, TextRange textRange, o oVar) {
        this(str, j2, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange, o oVar) {
        this(annotatedString, j2, textRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String str, long j2, TextRange textRange) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j2, textRange, (o) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j2, TextRange textRange, int i2, o oVar) {
        this(1 == (i2 & 1) ? "" : str, (i2 & 2) != 0 ? TextRange.Companion.m10551getZerod9O1mEE() : j2, (i2 & 4) != 0 ? null : textRange, (o) null);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange, int i2, o oVar) {
        this(annotatedString, (i2 & 2) != 0 ? TextRange.Companion.m10551getZerod9O1mEE() : j2, (i2 & 4) != 0 ? null : textRange, (o) null);
    }
}
