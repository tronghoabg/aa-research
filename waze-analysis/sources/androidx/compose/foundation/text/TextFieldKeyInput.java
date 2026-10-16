package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import h.ab;
import h.g.a.l;
import h.g.b.am;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldKeyInput {
    public static final int $stable = 8;
    private final boolean editable;
    private final int imeAction;
    private final DeadKeyCombiner keyCombiner;
    private final KeyMapping keyMapping;
    private final OffsetMapping offsetMapping;
    private final l<TextFieldValue, ab> onValueChange;
    private final TextPreparedSelectionState preparedSelectionState;
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final LegacyTextFieldState state;
    private final UndoManager undoManager;
    private final TextFieldValue value;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KeyCommand.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[KeyCommand.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[KeyCommand.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[KeyCommand.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[KeyCommand.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[KeyCommand.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[KeyCommand.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[KeyCommand.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[KeyCommand.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[KeyCommand.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[KeyCommand.CENTER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, l lVar, int i2, int i3, o oVar) {
        this(legacyTextFieldState, textFieldSelectionManager, (i3 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (o) null) : textFieldValue, (!((i3 & 8) == 0)) | z, ((i3 & 16) == 0) & z2, textPreparedSelectionState, (i3 & 64) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i3 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i3 & 512) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i3 & 1024) != 0 ? new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda9
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ab.f48028a;
            }
        } : lVar, i2, null);
    }

    private final void apply(List<? extends EditCommand> list) {
        EditProcessor processor = this.state.getProcessor();
        List<? extends EditCommand> list2 = list;
        x.f(list2, "<this>");
        ArrayList arrayList = new ArrayList(list2);
        arrayList.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(arrayList));
    }

    private final void commandExecutionContext(l<? super TextFieldPreparedSelection, ab> lVar) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        lVar.invoke(textFieldPreparedSelection);
        if (TextRange.m10539equalsimpl0(textFieldPreparedSelection.m3842getSelectiond9O1mEE(), this.value.m10831getSelectiond9O1mEE()) && x.n(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.onValueChange.invoke(textFieldPreparedSelection.getValue());
    }

    static final ab process_ZmokQxo$lambda$1(KeyCommand keyCommand, TextFieldKeyInput textFieldKeyInput, am amVar, TextFieldPreparedSelection textFieldPreparedSelection) {
        TextFieldValue textFieldValueUndo;
        TextFieldValue textFieldValueRedo;
        KeyCommand keyCommand2 = KeyCommand.LEFT_CHAR;
        switch (keyCommand.ordinal()) {
            case 0:
                textFieldPreparedSelection.collapseLeftOr(new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextFieldKeyInput.process_ZmokQxo$lambda$1$0((TextFieldPreparedSelection) obj);
                    }
                });
                break;
            case 1:
                textFieldPreparedSelection.collapseRightOr(new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextFieldKeyInput.process_ZmokQxo$lambda$1$1((TextFieldPreparedSelection) obj);
                    }
                });
                break;
            case 2:
                textFieldPreparedSelection.moveCursorRightByWord();
                break;
            case 3:
                textFieldPreparedSelection.moveCursorLeftByWord();
                break;
            case 4:
                textFieldPreparedSelection.moveCursorNextByParagraph();
                break;
            case 5:
                textFieldPreparedSelection.moveCursorPrevByParagraph();
                break;
            case 6:
                textFieldPreparedSelection.moveCursorToLineStart();
                break;
            case 7:
                textFieldPreparedSelection.moveCursorToLineEnd();
                break;
            case 8:
                textFieldPreparedSelection.moveCursorToLineLeftSide();
                break;
            case 9:
                textFieldPreparedSelection.moveCursorToLineRightSide();
                break;
            case 10:
                textFieldPreparedSelection.moveCursorUpByLine();
                break;
            case 11:
                textFieldPreparedSelection.moveCursorDownByLine();
                break;
            case 12:
            case 48:
                break;
            case 13:
                textFieldPreparedSelection.moveCursorUpByPage();
                break;
            case 14:
                textFieldPreparedSelection.moveCursorDownByPage();
                break;
            case 15:
                textFieldPreparedSelection.moveCursorToHome();
                break;
            case 16:
                textFieldPreparedSelection.moveCursorToEnd();
                break;
            case 17:
                textFieldKeyInput.selectionManager.copy$foundation(false);
                break;
            case 18:
                textFieldKeyInput.selectionManager.paste$foundation();
                break;
            case 19:
                textFieldKeyInput.selectionManager.cut$foundation();
                break;
            case 20:
                List<EditCommand> listDeleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda3
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextFieldKeyInput.process_ZmokQxo$lambda$1$2((TextFieldPreparedSelection) obj);
                    }
                });
                if (listDeleteIfSelectedOr != null) {
                    textFieldKeyInput.apply(listDeleteIfSelectedOr);
                    break;
                }
                break;
            case 21:
                List<EditCommand> listDeleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextFieldKeyInput.process_ZmokQxo$lambda$1$3((TextFieldPreparedSelection) obj);
                    }
                });
                if (listDeleteIfSelectedOr2 != null) {
                    textFieldKeyInput.apply(listDeleteIfSelectedOr2);
                    break;
                }
                break;
            case 22:
                List<EditCommand> listDeleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextFieldKeyInput.process_ZmokQxo$lambda$1$4((TextFieldPreparedSelection) obj);
                    }
                });
                if (listDeleteIfSelectedOr3 != null) {
                    textFieldKeyInput.apply(listDeleteIfSelectedOr3);
                    break;
                }
                break;
            case 23:
                List<EditCommand> listDeleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda6
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextFieldKeyInput.process_ZmokQxo$lambda$1$5((TextFieldPreparedSelection) obj);
                    }
                });
                if (listDeleteIfSelectedOr4 != null) {
                    textFieldKeyInput.apply(listDeleteIfSelectedOr4);
                    break;
                }
                break;
            case 24:
                List<EditCommand> listDeleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda7
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextFieldKeyInput.process_ZmokQxo$lambda$1$6((TextFieldPreparedSelection) obj);
                    }
                });
                if (listDeleteIfSelectedOr5 != null) {
                    textFieldKeyInput.apply(listDeleteIfSelectedOr5);
                    break;
                }
                break;
            case 25:
                List<EditCommand> listDeleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda8
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextFieldKeyInput.process_ZmokQxo$lambda$1$7((TextFieldPreparedSelection) obj);
                    }
                });
                if (listDeleteIfSelectedOr6 != null) {
                    textFieldKeyInput.apply(listDeleteIfSelectedOr6);
                    break;
                }
                break;
            case 26:
                textFieldPreparedSelection.selectAll();
                break;
            case 27:
                textFieldPreparedSelection.moveCursorLeft().selectMovement();
                break;
            case 28:
                textFieldPreparedSelection.moveCursorRight().selectMovement();
                break;
            case 29:
                textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                break;
            case 30:
                textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                break;
            case 31:
                textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                break;
            case 32:
                textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                break;
            case 33:
                textFieldPreparedSelection.moveCursorToHome().selectMovement();
                break;
            case 34:
                textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                break;
            case 35:
                textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                break;
            case 36:
                textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                break;
            case 37:
                textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                break;
            case 38:
                textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                break;
            case 39:
                textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                break;
            case 40:
                textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                break;
            case 41:
                textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                break;
            case 42:
                textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                break;
            case 43:
                textFieldPreparedSelection.deselect();
                break;
            case 44:
                if (!textFieldKeyInput.singleLine) {
                    textFieldKeyInput.apply(new CommitTextCommand("\n", 1));
                    break;
                } else {
                    amVar.f48101a = textFieldKeyInput.state.getOnImeActionPerformedWithResult().invoke(ImeAction.m10714boximpl(textFieldKeyInput.imeAction)).booleanValue();
                    break;
                }
            case 45:
                if (!textFieldKeyInput.singleLine) {
                    textFieldKeyInput.apply(new CommitTextCommand("\t", 1));
                    break;
                } else {
                    amVar.f48101a = false;
                    break;
                }
            case 46:
                UndoManager undoManager = textFieldKeyInput.undoManager;
                if (undoManager != null) {
                    undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                }
                UndoManager undoManager2 = textFieldKeyInput.undoManager;
                if (undoManager2 != null && (textFieldValueUndo = undoManager2.undo()) != null) {
                    textFieldKeyInput.onValueChange.invoke(textFieldValueUndo);
                    break;
                }
                break;
            case 47:
                UndoManager undoManager3 = textFieldKeyInput.undoManager;
                if (undoManager3 != null && (textFieldValueRedo = undoManager3.redo()) != null) {
                    textFieldKeyInput.onValueChange.invoke(textFieldValueRedo);
                    break;
                }
                break;
            default:
                throw new i();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab process_ZmokQxo$lambda$1$0(TextFieldPreparedSelection textFieldPreparedSelection) {
        textFieldPreparedSelection.moveCursorLeft();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab process_ZmokQxo$lambda$1$1(TextFieldPreparedSelection textFieldPreparedSelection) {
        textFieldPreparedSelection.moveCursorRight();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$2(TextFieldPreparedSelection textFieldPreparedSelection) {
        int precedingCodePointOrEmojiStartIndex = textFieldPreparedSelection.getPrecedingCodePointOrEmojiStartIndex();
        if (precedingCodePointOrEmojiStartIndex == -1) {
            return null;
        }
        return new DeleteSurroundingTextCommand(TextRange.m10541getEndimpl(textFieldPreparedSelection.m3842getSelectiond9O1mEE()) - precedingCodePointOrEmojiStartIndex, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$3(TextFieldPreparedSelection textFieldPreparedSelection) {
        int nextCharacterIndex = textFieldPreparedSelection.getNextCharacterIndex();
        if (nextCharacterIndex != -1) {
            return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m10541getEndimpl(textFieldPreparedSelection.m3842getSelectiond9O1mEE()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$4(TextFieldPreparedSelection textFieldPreparedSelection) {
        DeleteSurroundingTextCommand deleteSurroundingTextCommand;
        Integer previousWordOffset = textFieldPreparedSelection.getPreviousWordOffset();
        if (previousWordOffset != null) {
            deleteSurroundingTextCommand = new DeleteSurroundingTextCommand(TextRange.m10541getEndimpl(textFieldPreparedSelection.m3842getSelectiond9O1mEE()) - previousWordOffset.intValue(), 0);
        } else {
            deleteSurroundingTextCommand = null;
        }
        return deleteSurroundingTextCommand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$5(TextFieldPreparedSelection textFieldPreparedSelection) {
        Integer nextWordOffset = textFieldPreparedSelection.getNextWordOffset();
        return nextWordOffset != null ? new DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - TextRange.m10541getEndimpl(textFieldPreparedSelection.m3842getSelectiond9O1mEE())) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$6(TextFieldPreparedSelection textFieldPreparedSelection) {
        DeleteSurroundingTextCommand deleteSurroundingTextCommand;
        Integer lineStartByOffset = textFieldPreparedSelection.getLineStartByOffset();
        if (lineStartByOffset != null) {
            deleteSurroundingTextCommand = new DeleteSurroundingTextCommand(TextRange.m10541getEndimpl(textFieldPreparedSelection.m3842getSelectiond9O1mEE()) - lineStartByOffset.intValue(), 0);
        } else {
            deleteSurroundingTextCommand = null;
        }
        return deleteSurroundingTextCommand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$7(TextFieldPreparedSelection textFieldPreparedSelection) {
        Integer lineEndByOffset = textFieldPreparedSelection.getLineEndByOffset();
        return lineEndByOffset != null ? new DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - TextRange.m10541getEndimpl(textFieldPreparedSelection.m3842getSelectiond9O1mEE())) : null;
    }

    /* renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m3406typedCommandZmokQxo(KeyEvent keyEvent) {
        Integer numM3272consumeZmokQxo;
        if (TextFieldKeyInput_androidKt.m3411isTypedEventZmokQxo(keyEvent) && (numM3272consumeZmokQxo = this.keyCombiner.m3272consumeZmokQxo(keyEvent)) != null) {
            return new CommitTextCommand(StringsHelpers_jvmAndAndroidKt.appendCodePointX(new StringBuilder(), numM3272consumeZmokQxo.intValue()).toString(), 1);
        }
        return null;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m3407processZmokQxo(KeyEvent keyEvent) {
        final KeyCommand keyCommandMo3275mapZmokQxo;
        CommitTextCommand commitTextCommandM3406typedCommandZmokQxo = m3406typedCommandZmokQxo(keyEvent);
        if (commitTextCommandM3406typedCommandZmokQxo != null) {
            if (!this.editable) {
                return false;
            }
            apply(commitTextCommandM3406typedCommandZmokQxo);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        if (!KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) || (keyCommandMo3275mapZmokQxo = this.keyMapping.mo3275mapZmokQxo(keyEvent)) == null) {
            return false;
        }
        if (keyCommandMo3275mapZmokQxo.getEditsText() && !this.editable) {
            return false;
        }
        final am amVar = new am();
        amVar.f48101a = true;
        commandExecutionContext(new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldKeyInput.process_ZmokQxo$lambda$1(keyCommandMo3275mapZmokQxo, this, amVar, (TextFieldPreparedSelection) obj);
            }
        });
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return amVar.f48101a;
    }

    private final void apply(EditCommand editCommand) {
        List<? extends EditCommand> listSingletonList = Collections.singletonList(editCommand);
        x.e(listSingletonList, "singletonList(...)");
        apply(listSingletonList);
    }

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, l lVar, int i2, o oVar) {
        this(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, lVar, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, l<? super TextFieldValue, ab> lVar, int i2) {
        this.state = legacyTextFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = lVar;
        this.imeAction = i2;
    }
}
