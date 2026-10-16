package androidx.compose.foundation.text.selection;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.text.TextRange;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextClassificationResult {
    public static final int $stable = 8;
    private final List<Drawable> icons;
    private final long selection;
    private final CharSequence text;
    private final TextClassification textClassification;

    /* JADX WARN: Multi-variable type inference failed */
    private TextClassificationResult(CharSequence charSequence, long j2, TextClassification textClassification, List<? extends Drawable> list) {
        this.text = charSequence;
        this.selection = j2;
        this.textClassification = textClassification;
        this.icons = list;
    }

    /* renamed from: copy-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ TextClassificationResult m3909copyM8tDOmk$default(TextClassificationResult textClassificationResult, CharSequence charSequence, long j2, TextClassification textClassification, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = textClassificationResult.text;
        }
        if ((i2 & 2) != 0) {
            j2 = textClassificationResult.selection;
        }
        if ((i2 & 4) != 0) {
            textClassification = textClassificationResult.textClassification;
        }
        if ((i2 & 8) != 0) {
            list = textClassificationResult.icons;
        }
        return textClassificationResult.m3911copyM8tDOmk(charSequence, j2, textClassification, list);
    }

    public final CharSequence component1() {
        return this.text;
    }

    /* renamed from: component2-d9O1mEE, reason: not valid java name */
    public final long m3910component2d9O1mEE() {
        return this.selection;
    }

    public final TextClassification component3() {
        return this.textClassification;
    }

    public final List<Drawable> component4() {
        return this.icons;
    }

    /* renamed from: copy-M8tDOmk, reason: not valid java name */
    public final TextClassificationResult m3911copyM8tDOmk(CharSequence charSequence, long j2, TextClassification textClassification, List<? extends Drawable> list) {
        return new TextClassificationResult(charSequence, j2, textClassification, list, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextClassificationResult)) {
            return false;
        }
        TextClassificationResult textClassificationResult = (TextClassificationResult) obj;
        return x.n(this.text, textClassificationResult.text) && TextRange.m10539equalsimpl0(this.selection, textClassificationResult.selection) && x.n(this.textClassification, textClassificationResult.textClassification) && x.n(this.icons, textClassificationResult.icons);
    }

    public final List<Drawable> getIcons() {
        return this.icons;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m3912getSelectiond9O1mEE() {
        return this.selection;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + TextRange.m10547hashCodeimpl(this.selection)) * 31) + this.textClassification.hashCode()) * 31) + this.icons.hashCode();
    }

    public String toString() {
        return "TextClassificationResult(text=" + ((Object) this.text) + ", selection=" + ((Object) TextRange.m10549toStringimpl(this.selection)) + ", textClassification=" + this.textClassification + ", icons=" + this.icons + ')';
    }

    public /* synthetic */ TextClassificationResult(CharSequence charSequence, long j2, TextClassification textClassification, List list, o oVar) {
        this(charSequence, j2, textClassification, list);
    }
}
