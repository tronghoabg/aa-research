package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.TextRange;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.g.a.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private TextFieldValue mTextFieldValue;
    private final List<EditCommand> editCommands = new ArrayList();
    private boolean isActive = true;

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue;
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i2 = this.batchDepth - 1;
        this.batchDepth = i2;
        if (i2 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.onEditCommands(i.aq(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean ensureActive(a<ab> aVar) {
        boolean z = this.isActive;
        if (z) {
            aVar.invoke();
        }
        return z;
    }

    private final void sendSynthesizedKeyEvent(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        if (!this.isActive) {
            return false;
        }
        beginBatchEditInternal();
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        if (this.isActive) {
            return this.autoCorrect;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        if (!this.isActive) {
            return false;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        if (!this.isActive) {
            return false;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        if (!this.isActive) {
            return false;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i2) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m10544getMinimpl(this.mTextFieldValue.m10831getSelectiond9O1mEE()), i2);
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        int i3 = i2 & 1;
        this.extractedTextMonitorMode = 1 == i3;
        if (i3 != 0) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    public final TextFieldValue getMTextFieldValue$ui() {
        return this.mTextFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i2) {
        if (TextRange.m10540getCollapsedimpl(this.mTextFieldValue.m10831getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i2, int i3) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, i2).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i2, int i3) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, i2).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i2) {
        if (this.isActive) {
            switch (i2) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_LIGHTER);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_USUAL);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_UNITS_PS);
                    break;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i2) {
        int iM10730getDefaulteUduSuo;
        if (!this.isActive) {
            return false;
        }
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    iM10730getDefaulteUduSuo = ImeAction.Companion.m10732getGoeUduSuo();
                    break;
                case 3:
                    iM10730getDefaulteUduSuo = ImeAction.Companion.m10736getSearcheUduSuo();
                    break;
                case 4:
                    iM10730getDefaulteUduSuo = ImeAction.Companion.m10737getSendeUduSuo();
                    break;
                case 5:
                    iM10730getDefaulteUduSuo = ImeAction.Companion.m10733getNexteUduSuo();
                    break;
                case 6:
                    iM10730getDefaulteUduSuo = ImeAction.Companion.m10731getDoneeUduSuo();
                    break;
                case 7:
                    iM10730getDefaulteUduSuo = ImeAction.Companion.m10735getPreviouseUduSuo();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i2);
                    iM10730getDefaulteUduSuo = ImeAction.Companion.m10730getDefaulteUduSuo();
                    break;
            }
        } else {
            iM10730getDefaulteUduSuo = ImeAction.Companion.m10730getDefaulteUduSuo();
        }
        this.eventCallback.mo10749onImeActionKlQnJC8(iM10730getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        return this.isActive;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!this.isActive) {
            return false;
        }
        int i3 = i2 & 1;
        boolean z5 = (i2 & 2) != 0;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z6 = (i2 & 16) != 0;
            boolean z7 = (i2 & 8) != 0;
            boolean z8 = (i2 & 4) != 0;
            boolean z9 = Build.VERSION.SDK_INT >= 34 && (i2 & 32) != 0;
            if (z6 || z7 || z8 || z9) {
                z2 = z9;
                z3 = z6;
                z4 = z7;
                z = z8;
            } else if (Build.VERSION.SDK_INT >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z9;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(1 == i3, z5, z3, z4, z, z2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (!this.isActive) {
            return false;
        }
        this.eventCallback.onKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i2, int i3) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i2, i3));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i2));
        }
        return z;
    }

    public final void setMTextFieldValue$ui(TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i2, int i3) {
        if (!this.isActive) {
            return false;
        }
        addEditCommandWithBatch(new SetSelectionCommand(i2, i3));
        return true;
    }

    public final void updateInputState(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        if (this.isActive) {
            setMTextFieldValue$ui(textFieldValue);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(textFieldValue));
            }
            TextRange textRangeM10830getCompositionMzsxiRA = textFieldValue.m10830getCompositionMzsxiRA();
            int iM10544getMinimpl = textRangeM10830getCompositionMzsxiRA != null ? TextRange.m10544getMinimpl(textRangeM10830getCompositionMzsxiRA.m10550unboximpl()) : -1;
            TextRange textRangeM10830getCompositionMzsxiRA2 = textFieldValue.m10830getCompositionMzsxiRA();
            inputMethodManager.updateSelection(TextRange.m10544getMinimpl(textFieldValue.m10831getSelectiond9O1mEE()), TextRange.m10543getMaximpl(textFieldValue.m10831getSelectiond9O1mEE()), iM10544getMinimpl, textRangeM10830getCompositionMzsxiRA2 != null ? TextRange.m10543getMaximpl(textRangeM10830getCompositionMzsxiRA2.m10550unboximpl()) : -1);
        }
    }

    private final void logDebug(String str) {
    }
}
