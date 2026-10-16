package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.UndoManagerKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextUndoManagerKt {
    private static final int TEXT_UNDO_CAPACITY = 100;

    private static final boolean isNewLineInsert(TextUndoOperation textUndoOperation) {
        return x.n(textUndoOperation.getPostText(), "\n") || x.n(textUndoOperation.getPostText(), "\r\n");
    }

    public static final TextUndoOperation merge(TextUndoOperation textUndoOperation, TextUndoOperation textUndoOperation2) {
        if (!textUndoOperation.getCanMerge() || !textUndoOperation2.getCanMerge() || textUndoOperation2.getTimeInMillis() < textUndoOperation.getTimeInMillis() || textUndoOperation2.getTimeInMillis() - textUndoOperation.getTimeInMillis() >= UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS() || isNewLineInsert(textUndoOperation) || isNewLineInsert(textUndoOperation2) || textUndoOperation.getTextEditType() != textUndoOperation2.getTextEditType()) {
            return null;
        }
        if (textUndoOperation.getTextEditType() == TextEditType.Insert && textUndoOperation.getIndex() + textUndoOperation.getPostText().length() == textUndoOperation2.getIndex()) {
            int index = textUndoOperation.getIndex();
            String postText = textUndoOperation.getPostText();
            String postText2 = textUndoOperation2.getPostText();
            return new TextUndoOperation(index, "", String.valueOf(postText).concat(String.valueOf(postText2)), textUndoOperation.m3771getPreSelectiond9O1mEE(), textUndoOperation2.m3770getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
        }
        if (textUndoOperation.getTextEditType() != TextEditType.Delete || textUndoOperation.getDeletionType() != textUndoOperation2.getDeletionType()) {
            return null;
        }
        if (textUndoOperation.getDeletionType() != TextDeleteType.Start && textUndoOperation.getDeletionType() != TextDeleteType.End) {
            return null;
        }
        if (textUndoOperation.getIndex() == textUndoOperation2.getIndex() + textUndoOperation2.getPreText().length()) {
            int index2 = textUndoOperation2.getIndex();
            String preText = textUndoOperation2.getPreText();
            String preText2 = textUndoOperation.getPreText();
            return new TextUndoOperation(index2, String.valueOf(preText).concat(String.valueOf(preText2)), "", textUndoOperation.m3771getPreSelectiond9O1mEE(), textUndoOperation2.m3770getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
        }
        if (textUndoOperation.getIndex() != textUndoOperation2.getIndex()) {
            return null;
        }
        int index3 = textUndoOperation.getIndex();
        String preText3 = textUndoOperation.getPreText();
        String preText4 = textUndoOperation2.getPreText();
        return new TextUndoOperation(index3, String.valueOf(preText3).concat(String.valueOf(preText4)), "", textUndoOperation.m3771getPreSelectiond9O1mEE(), textUndoOperation2.m3770getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
    }

    public static final void recordChanges(TextUndoManager textUndoManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, boolean z) {
        if (changeList.getChangeCount() > 1) {
            textUndoManager.record(new TextUndoOperation(0, textFieldCharSequence.toString(), textFieldCharSequence2.toString(), textFieldCharSequence.m3484getSelectiond9O1mEE(), textFieldCharSequence2.m3484getSelectiond9O1mEE(), 0L, false, 32, null));
            return;
        }
        if (changeList.getChangeCount() == 1) {
            long jMo3480getOriginalRangejx7JFs = changeList.mo3480getOriginalRangejx7JFs(0);
            long jMo3481getRangejx7JFs = changeList.mo3481getRangejx7JFs(0);
            if (TextRange.m10540getCollapsedimpl(jMo3480getOriginalRangejx7JFs) && TextRange.m10540getCollapsedimpl(jMo3481getRangejx7JFs)) {
                return;
            }
            textUndoManager.record(new TextUndoOperation(TextRange.m10544getMinimpl(jMo3480getOriginalRangejx7JFs), TextRangeKt.m10553substringFDrldGo(textFieldCharSequence, jMo3480getOriginalRangejx7JFs), TextRangeKt.m10553substringFDrldGo(textFieldCharSequence2, jMo3481getRangejx7JFs), textFieldCharSequence.m3484getSelectiond9O1mEE(), textFieldCharSequence2.m3484getSelectiond9O1mEE(), 0L, z, 32, null));
        }
    }
}
