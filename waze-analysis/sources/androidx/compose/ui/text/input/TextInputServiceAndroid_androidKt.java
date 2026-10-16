package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import com.waze.strings.DisplayStrings;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    public static final Executor asExecutor(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j2) {
                        runnable.run();
                    }
                });
            }
        };
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int iM10746getImeActioneUduSuo = imeOptions.m10746getImeActioneUduSuo();
        int i2 = 6;
        if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10730getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10734getNoneeUduSuo())) {
            i2 = 1;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10732getGoeUduSuo())) {
            i2 = 2;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10733getNexteUduSuo())) {
            i2 = 5;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10735getPreviouseUduSuo())) {
            i2 = 7;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10736getSearcheUduSuo())) {
            i2 = 3;
        } else if (ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10737getSendeUduSuo())) {
            i2 = 4;
        } else if (!ImeAction.m10717equalsimpl0(iM10746getImeActioneUduSuo, ImeAction.Companion.m10731getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i2;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int iM10747getKeyboardTypePjHm6EE = imeOptions.m10747getKeyboardTypePjHm6EE();
        if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10822getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10800getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10811getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10818getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10825getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10807getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10815getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10812getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10803getDecimalPjHm6EE())) {
            editorInfo.inputType = InputDeviceCompat.SOURCE_MOUSE;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10816getPasswordVisiblePjHm6EE())) {
            editorInfo.inputType = 145;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10820getPostalAddressPjHm6EE())) {
            editorInfo.inputType = 113;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10817getPersonNamePjHm6EE())) {
            editorInfo.inputType = 97;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10808getEmailSubjectPjHm6EE())) {
            editorInfo.inputType = 49;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10821getShortMessagePjHm6EE())) {
            editorInfo.inputType = 65;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10810getLongMessagePjHm6EE())) {
            editorInfo.inputType = 81;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10809getFilterPjHm6EE())) {
            editorInfo.inputType = 177;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10819getPhoneticPjHm6EE())) {
            editorInfo.inputType = DisplayStrings.DS_TRIP_OVERVIEW_BADGE_POLICE;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10802getDateTimePjHm6EE())) {
            editorInfo.inputType = 4;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10801getDatePjHm6EE())) {
            editorInfo.inputType = 20;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10823getTimePjHm6EE())) {
            editorInfo.inputType = 36;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10814getNumberSignedPjHm6EE())) {
            editorInfo.inputType = InputDeviceCompat.SOURCE_TOUCHSCREEN;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10806getDecimalSignedPjHm6EE())) {
            editorInfo.inputType = 12290;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10804getDecimalPasswordPjHm6EE())) {
            editorInfo.inputType = 8210;
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10813getNumberPasswordSignedPjHm6EE())) {
            editorInfo.inputType = 4114;
        } else {
            if (!KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10805getDecimalPasswordSignedPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 12306;
        }
        if (!imeOptions.getSingleLine() && (editorInfo.inputType & 15) == 1) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m10717equalsimpl0(imeOptions.m10746getImeActioneUduSuo(), ImeAction.Companion.m10730getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((editorInfo.inputType & 15) == 1) {
            int iM10745getCapitalizationIUNYP9k = imeOptions.m10745getCapitalizationIUNYP9k();
            if (KeyboardCapitalization.m10753equalsimpl0(iM10745getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m10762getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m10753equalsimpl0(iM10745getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m10766getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m10753equalsimpl0(iM10745getCapitalizationIUNYP9k, KeyboardCapitalization.Companion.m10764getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m10546getStartimpl(textFieldValue.m10831getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m10541getEndimpl(textFieldValue.m10831getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
