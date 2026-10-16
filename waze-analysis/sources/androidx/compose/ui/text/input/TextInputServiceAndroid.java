package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import h.ab;
import h.d.a;
import h.d.b;
import h.f;
import h.g;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;
import h.h;
import h.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;
    private final f baseInputConnection$delegate;
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private Runnable frameCallback;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    private l<? super List<? extends EditCommand>, ab> onEditCommand;
    private l<? super ImeAction, ab> onImeActionPerformed;
    private TextFieldValue state;
    private final MutableVector<TextInputCommand> textInputCommandQueue;
    private final View view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    final class TextInputCommand {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TextInputCommand[] $VALUES;
        public static final TextInputCommand StartInput = new TextInputCommand("StartInput", 0);
        public static final TextInputCommand StopInput = new TextInputCommand("StopInput", 1);
        public static final TextInputCommand ShowKeyboard = new TextInputCommand("ShowKeyboard", 2);
        public static final TextInputCommand HideKeyboard = new TextInputCommand("HideKeyboard", 3);

        private static final /* synthetic */ TextInputCommand[] $values() {
            return new TextInputCommand[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
        }

        static {
            TextInputCommand[] textInputCommandArr$values = $values();
            $VALUES = textInputCommandArr$values;
            $ENTRIES = b.a(textInputCommandArr$values);
        }

        private TextInputCommand(String str, int i2) {
        }

        public static a<TextInputCommand> getEntries() {
            return $ENTRIES;
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.state = new TextFieldValue("", TextRange.Companion.m10551getZerod9O1mEE(), (TextRange) null, 4, (o) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = g.b(h.f48132c, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.cursorAnchorInfoController = new CursorAnchorInfoController(matrixPositionCalculator, inputMethodManager);
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    private final void processInputCommands() {
        View viewFindFocus;
        if (!this.view.isFocused() && (viewFindFocus = this.view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.textInputCommandQueue.clear();
            return;
        }
        aq aqVar = new aq();
        aq aqVar2 = new aq();
        MutableVector<TextInputCommand> mutableVector = this.textInputCommandQueue;
        TextInputCommand[] textInputCommandArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            processInputCommands$applyToState(textInputCommandArr[i2], aqVar, aqVar2);
        }
        this.textInputCommandQueue.clear();
        if (x.n(aqVar.f48105a, true)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) aqVar2.f48105a;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (x.n(aqVar.f48105a, false)) {
            restartInputImmediately();
        }
    }

    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, aq<Boolean> aqVar, aq<Boolean> aqVar2) {
        TextInputCommand textInputCommand2 = TextInputCommand.StartInput;
        int iOrdinal = textInputCommand.ordinal();
        if (iOrdinal == 0) {
            aqVar.f48105a = true;
            aqVar2.f48105a = true;
        } else if (iOrdinal == 1) {
            aqVar.f48105a = false;
            aqVar2.f48105a = false;
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new i();
            }
            if (x.n(aqVar.f48105a, false)) {
                return;
            }
            aqVar2.f48105a = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.sendInputCommand$lambda$0(this.f$0);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    static final void sendInputCommand$lambda$0(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean z) {
        InputMethodManager inputMethodManager = this.inputMethodManager;
        if (z) {
            inputMethodManager.showSoftInput();
        } else {
            inputMethodManager.hideSoftInput();
        }
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.createInputConnection.1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                int size = TextInputServiceAndroid.this.ics.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (x.n(((WeakReference) TextInputServiceAndroid.this.ics.get(i2)).get(), recordingInputConnection2)) {
                        TextInputServiceAndroid.this.ics.remove(i2);
                        return;
                    }
                }
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                TextInputServiceAndroid.this.onEditCommand.invoke(list);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo10749onImeActionKlQnJC8(int i2) {
                TextInputServiceAndroid.this.onImeActionPerformed.invoke(ImeAction.m10714boximpl(i2));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                TextInputServiceAndroid.this.getBaseInputConnection().sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
                TextInputServiceAndroid.this.cursorAnchorInfoController.requestUpdate(z, z2, z3, z4, z5, z6);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    public final TextFieldValue getState$ui() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(h.h.a.b(rect.getLeft()), h.h.a.b(rect.getTop()), h.h.a.b(rect.getRight()), h.h.a.b(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, l<? super List<? extends EditCommand>, ab> lVar, l<? super ImeAction, ab> lVar2) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = lVar;
        this.onImeActionPerformed = lVar2;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = C03971.INSTANCE;
        this.onImeActionPerformed = AnonymousClass2.INSTANCE;
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z = true;
        if (TextRange.m10539equalsimpl0(this.state.m10831getSelectiond9O1mEE(), textFieldValue2.m10831getSelectiond9O1mEE()) && x.n(this.state.m10830getCompositionMzsxiRA(), textFieldValue2.m10830getCompositionMzsxiRA())) {
            z = false;
        }
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i2).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (x.n(textFieldValue, textFieldValue2)) {
            if (z) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM10544getMinimpl = TextRange.m10544getMinimpl(textFieldValue2.m10831getSelectiond9O1mEE());
                int iM10543getMaximpl = TextRange.m10543getMaximpl(textFieldValue2.m10831getSelectiond9O1mEE());
                TextRange textRangeM10830getCompositionMzsxiRA = this.state.m10830getCompositionMzsxiRA();
                int iM10544getMinimpl2 = textRangeM10830getCompositionMzsxiRA != null ? TextRange.m10544getMinimpl(textRangeM10830getCompositionMzsxiRA.m10550unboximpl()) : -1;
                TextRange textRangeM10830getCompositionMzsxiRA2 = this.state.m10830getCompositionMzsxiRA();
                inputMethodManager.updateSelection(iM10544getMinimpl, iM10543getMaximpl, iM10544getMinimpl2, textRangeM10830getCompositionMzsxiRA2 != null ? TextRange.m10543getMaximpl(textRangeM10830getCompositionMzsxiRA2.m10550unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!x.n(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m10539equalsimpl0(textFieldValue.m10831getSelectiond9O1mEE(), textFieldValue2.m10831getSelectiond9O1mEE()) && !x.n(textFieldValue.m10830getCompositionMzsxiRA(), textFieldValue2.m10830getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i3 = 0; i3 < size2; i3++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i3).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, l<? super Matrix, ab> lVar, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, lVar, rect, rect2);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1, reason: invalid class name and case insensitive filesystem */
    final class C03971 extends y implements l<List<? extends EditCommand>, ab> {
        public static final C03971 INSTANCE = new C03971();

        C03971() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(List<? extends EditCommand> list) {
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends EditCommand> list) {
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements l<ImeAction, ab> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(ImeAction imeAction) {
            imeAction.m10720unboximpl();
            return ab.f48028a;
        }

        /* renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m10833invokeKlQnJC8(int i2) {
        }
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator) {
        this(view, matrixPositionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor, int i2, o oVar) {
        this(view, matrixPositionCalculator, inputMethodManager, (i2 & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }
}
