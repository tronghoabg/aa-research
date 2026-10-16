package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.a.i;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import java.io.IOException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EditProcessor {
    public static final int $stable = 8;
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m10551getZerod9O1mEE(), (TextRange) null, (o) null);
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m10831getSelectiond9O1mEE(), (o) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, final EditCommand editCommand) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text() + ", composition=" + this.mBuffer.m10711getCompositionMzsxiRA$ui_text() + ", selection=" + ((Object) TextRange.m10549toStringimpl(this.mBuffer.m10712getSelectiond9O1mEE$ui_text())) + "):");
        sb.append('\n');
        i.aV(list, sb, "\n", new l() { // from class: androidx.compose.ui.text.input.EditProcessor$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return EditProcessor.generateBatchErrorMessage$lambda$0$0(editCommand, this, (EditCommand) obj);
            }
        }, 60);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence generateBatchErrorMessage$lambda$0$0(EditCommand editCommand, EditProcessor editProcessor, EditCommand editCommand2) {
        return (editCommand == editCommand2 ? " > " : "   ").concat(editProcessor.toStringForLog(editCommand2));
    }

    private final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return ((SetComposingRegionCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return ((DeleteSurroundingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return ((DeleteSurroundingTextInCodePointsCommand) editCommand).toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return ((SetSelectionCommand) editCommand).toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return ((FinishComposingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return ((BackspaceCommand) editCommand).toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return ((MoveCursorCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return ((DeleteAllCommand) editCommand).toString();
        }
        Class<?> cls = editCommand.getClass();
        int i2 = ar.f48106a;
        String strC = new m(cls).c();
        if (strC == null) {
            strC = "{anonymous EditCommand}";
        }
        return "Unknown EditCommand: ".concat(strC);
    }

    public final TextFieldValue apply(List<? extends EditCommand> list) {
        EditCommand editCommand;
        EditCommand editCommand2 = null;
        try {
            int size = list.size();
            int i2 = 0;
            EditCommand editCommand3 = null;
            while (i2 < size) {
                try {
                    editCommand = list.get(i2);
                } catch (Exception e2) {
                    e = e2;
                    editCommand2 = editCommand3;
                }
                try {
                    editCommand.applyTo(this.mBuffer);
                    i2++;
                    editCommand3 = editCommand;
                } catch (Exception e3) {
                    e = e3;
                    editCommand2 = editCommand;
                    throw new RuntimeException(generateBatchErrorMessage(list, editCommand2), e);
                }
            }
            AnnotatedString annotatedString$ui_text = this.mBuffer.toAnnotatedString$ui_text();
            long jM10712getSelectiond9O1mEE$ui_text = this.mBuffer.m10712getSelectiond9O1mEE$ui_text();
            TextRange textRangeM10534boximpl = true != TextRange.m10545getReversedimpl(this.mBufferState.m10831getSelectiond9O1mEE()) ? TextRange.m10534boximpl(jM10712getSelectiond9O1mEE$ui_text) : null;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text, textRangeM10534boximpl != null ? textRangeM10534boximpl.m10550unboximpl() : TextRangeKt.TextRange(TextRange.m10543getMaximpl(jM10712getSelectiond9O1mEE$ui_text), TextRange.m10544getMinimpl(jM10712getSelectiond9O1mEE$ui_text)), this.mBuffer.m10711getCompositionMzsxiRA$ui_text(), (o) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e4) {
            e = e4;
        }
    }

    public final EditingBuffer getMBuffer$ui_text() {
        return this.mBuffer;
    }

    public final TextFieldValue getMBufferState$ui_text() {
        return this.mBufferState;
    }

    public final void reset(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        boolean zN = x.n(textFieldValue.m10830getCompositionMzsxiRA(), this.mBuffer.m10711getCompositionMzsxiRA$ui_text());
        boolean z = true;
        boolean z2 = false;
        if (!x.n(this.mBufferState.getAnnotatedString().getText(), textFieldValue.getAnnotatedString().getText())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m10831getSelectiond9O1mEE(), (o) null);
        } else if (TextRange.m10539equalsimpl0(this.mBufferState.m10831getSelectiond9O1mEE(), textFieldValue.m10831getSelectiond9O1mEE())) {
            z = false;
        } else {
            this.mBuffer.setSelection$ui_text(TextRange.m10544getMinimpl(textFieldValue.m10831getSelectiond9O1mEE()), TextRange.m10543getMaximpl(textFieldValue.m10831getSelectiond9O1mEE()));
            z2 = true;
            z = false;
        }
        if (textFieldValue.m10830getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text();
        } else if (!TextRange.m10540getCollapsedimpl(textFieldValue.m10830getCompositionMzsxiRA().m10550unboximpl())) {
            this.mBuffer.setComposition$ui_text(TextRange.m10544getMinimpl(textFieldValue.m10830getCompositionMzsxiRA().m10550unboximpl()), TextRange.m10543getMaximpl(textFieldValue.m10830getCompositionMzsxiRA().m10550unboximpl()));
        }
        if (z || (!z2 && !zN)) {
            this.mBuffer.commitComposition$ui_text();
            textFieldValue = TextFieldValue.m10826copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
