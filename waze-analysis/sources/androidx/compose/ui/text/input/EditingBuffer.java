package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private EditingBuffer(AnnotatedString annotatedString, long j2) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m10544getMinimpl(j2);
        this.selectionEnd = TextRange.m10543getMaximpl(j2);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM10544getMinimpl = TextRange.m10544getMinimpl(j2);
        int iM10543getMaximpl = TextRange.m10543getMaximpl(j2);
        if (iM10544getMinimpl < 0 || iM10544getMinimpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("start (" + iM10544getMinimpl + ") offset is outside of text region " + annotatedString.length());
        }
        if (iM10543getMaximpl < 0 || iM10543getMaximpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("end (" + iM10543getMaximpl + ") offset is outside of text region " + annotatedString.length());
        }
        if (iM10544getMinimpl <= iM10543getMaximpl) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iM10544getMinimpl + " > " + iM10543getMaximpl);
    }

    private final void setSelectionEnd(int i2) {
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: " + i2);
        }
        this.selectionEnd = i2;
    }

    private final void setSelectionStart(int i2) {
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: " + i2);
        }
        this.selectionStart = i2;
    }

    public final void cancelComposition$ui_text() {
        replace$ui_text(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text(int i2, int i3) {
        PartialGapBuffer partialGapBuffer = this.gapBuffer;
        long jTextRange = TextRangeKt.TextRange(i2, i3);
        partialGapBuffer.replace(i2, i3, "");
        long jM10713updateRangeAfterDeletepWDy79M = EditingBufferKt.m10713updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m10544getMinimpl(jM10713updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m10543getMaximpl(jM10713updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text()) {
            long jM10713updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m10713updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m10540getCollapsedimpl(jM10713updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text();
            } else {
                this.compositionStart = TextRange.m10544getMinimpl(jM10713updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m10543getMaximpl(jM10713updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text(int i2) {
        return this.gapBuffer.get(i2);
    }

    /* renamed from: getComposition-MzsxiRA$ui_text, reason: not valid java name */
    public final TextRange m10711getCompositionMzsxiRA$ui_text() {
        if (hasComposition$ui_text()) {
            return TextRange.m10534boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text() {
        int i2 = this.selectionStart;
        int i3 = this.selectionEnd;
        if (i2 == i3) {
            return i3;
        }
        return -1;
    }

    public final int getLength$ui_text() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text, reason: not valid java name */
    public final long m10712getSelectiond9O1mEE$ui_text() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd$ui_text() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text(int i2, int i3, String str) {
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i3 < 0 || i3 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException("Do not set reversed range: " + i2 + " > " + i3);
        }
        this.gapBuffer.replace(i2, i3, str);
        setSelectionStart(str.length() + i2);
        setSelectionEnd(i2 + str.length());
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void setComposition$ui_text(int i2, int i3) {
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i3 < 0 || i3 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i2 < i3) {
            this.compositionStart = i2;
            this.compositionEnd = i3;
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i2 + " > " + i3);
        }
    }

    public final void setCursor$ui_text(int i2) {
        setSelection$ui_text(i2, i2);
    }

    public final void setSelection$ui_text(int i2, int i3) {
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i3 < 0 || i3 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i2 <= i3) {
            setSelectionStart(i2);
            setSelectionEnd(i3);
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i2 + " > " + i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnotatedString toAnnotatedString$ui_text() {
        return new AnnotatedString(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final void replace$ui_text(int i2, int i3, AnnotatedString annotatedString) {
        replace$ui_text(i2, i3, annotatedString.getText());
    }

    public /* synthetic */ EditingBuffer(String str, long j2, o oVar) {
        this(str, j2);
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j2, o oVar) {
        this(annotatedString, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(String str, long j2) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j2, (o) (0 == true ? 1 : 0));
    }
}
