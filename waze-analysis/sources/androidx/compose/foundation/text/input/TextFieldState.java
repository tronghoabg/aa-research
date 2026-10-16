package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.TextStyleBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldState {
    public static final int $stable = 0;
    private final MutableState isEditing$delegate;
    private TextFieldBuffer mainBuffer;
    private final MutableVector<NotifyImeListener> notifyImeListeners;
    private final TextUndoManager textUndoManager;
    private final UndoState undoState;
    private final MutableState userCommit$delegate;
    private final MutableState value$delegate;

    /* compiled from: WazeSource */
    public interface NotifyImeListener {
        void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z);
    }

    /* compiled from: WazeSource */
    public final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static final int $stable = 0;
        public static final Saver INSTANCE = new Saver();

        private Saver() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextFieldState restore(Object obj) {
            x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            x.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            x.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            x.d(obj4, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange = TextRangeKt.TextRange(iIntValue, ((Integer) obj4).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.INSTANCE;
            x.c(obj5);
            return new TextFieldState(str, jTextRange, saver.restore(obj5), (o) null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextFieldState textFieldState) {
            return i.i(textFieldState.getText().toString(), Integer.valueOf(TextRange.m10546getStartimpl(textFieldState.m3486getSelectiond9O1mEE())), Integer.valueOf(TextRange.m10541getEndimpl(textFieldState.m3486getSelectiond9O1mEE())), TextUndoManager.Companion.Saver.INSTANCE.save(saverScope, textFieldState.getTextUndoManager$foundation()));
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldState(String str, long j2, TextUndoManager textUndoManager) {
        this.textUndoManager = textUndoManager;
        String str2 = str;
        ChangeTracker changeTracker = null;
        TextFieldCharSequence textFieldCharSequence = null;
        OffsetMappingCalculator offsetMappingCalculator = null;
        this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(str2, TextRangeKt.m10552coerceIn8ffj60Q(j2, 0, str.length()), null, null, null, null, null, 124, null), changeTracker, textFieldCharSequence, offsetMappingCalculator, 14, null);
        this.isEditing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldCharSequence(str2, j2, null, null, null, null, null, 124, null), null, 2, null);
        this.userCommit$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector<>(new NotifyImeListener[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitEditAsUser(InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldCharSequence value$foundation = getValue$foundation();
        if (this.mainBuffer.getChangeTracker$foundation().getChangeCount() == 0 && TextRange.m10539equalsimpl0(value$foundation.m3484getSelectiond9O1mEE(), this.mainBuffer.m3476getSelectiond9O1mEE())) {
            if (x.n(value$foundation.m3483getCompositionMzsxiRA(), this.mainBuffer.m3474getCompositionMzsxiRA$foundation()) && x.n(value$foundation.getHighlight(), this.mainBuffer.getHighlight$foundation()) && x.n(value$foundation.getComposingAnnotations(), this.mainBuffer.getComposingAnnotations$foundation())) {
                return;
            }
            updateValueAndNotifyListeners(getValue$foundation(), new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.m3476getSelectiond9O1mEE(), this.mainBuffer.m3474getCompositionMzsxiRA$foundation(), this.mainBuffer.getHighlight$foundation(), TextFieldStateKt.m3488finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m3474getCompositionMzsxiRA$foundation(), this.mainBuffer.getComposingAnnotations$foundation()), null, value$foundation.getTextStyleBuffer(), 32, null), z);
            return;
        }
        int changeCount = this.mainBuffer.getChangeTracker$foundation().getChangeCount();
        String string = this.mainBuffer.toString();
        long jM3476getSelectiond9O1mEE = this.mainBuffer.m3476getSelectiond9O1mEE();
        TextRange textRangeM3474getCompositionMzsxiRA$foundation = this.mainBuffer.m3474getCompositionMzsxiRA$foundation();
        k<TextHighlightType, TextRange> highlight$foundation = this.mainBuffer.getHighlight$foundation();
        List listM3488finalizeComposingAnnotationsitr0ztk = TextFieldStateKt.m3488finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m3474getCompositionMzsxiRA$foundation(), this.mainBuffer.getComposingAnnotations$foundation());
        TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer$foundation = this.mainBuffer.getTextStyleBuffer$foundation();
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(string, jM3476getSelectiond9O1mEE, textRangeM3474getCompositionMzsxiRA$foundation, highlight$foundation, listM3488finalizeComposingAnnotationsitr0ztk, null, textStyleBuffer$foundation != null ? textStyleBuffer$foundation.toImmutable() : null, 32, null);
        if (inputTransformation == null) {
            boolean z2 = false;
            if (changeCount != 0 && z) {
                z2 = true;
            }
            updateValueAndNotifyListeners(value$foundation, textFieldCharSequence, z2);
            recordEditForUndo(value$foundation, textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation(), textFieldEditUndoBehavior);
            return;
        }
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation(), value$foundation, null, 8, null);
        inputTransformation.transformInput(textFieldBuffer);
        boolean zK = h.n.o.k(textFieldBuffer.asCharSequence(), textFieldCharSequence);
        boolean z3 = !zK;
        boolean zM10539equalsimpl0 = TextRange.m10539equalsimpl0(textFieldBuffer.m3476getSelectiond9O1mEE(), textFieldCharSequence.m3484getSelectiond9O1mEE());
        boolean z4 = !zM10539equalsimpl0;
        boolean zN = x.n(textFieldBuffer.getTextStyleBuffer$foundation(), textFieldCharSequence.getTextStyleBuffer());
        boolean z5 = !zN;
        if (zK && zM10539equalsimpl0 && zN) {
            updateValueAndNotifyListeners(value$foundation, TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer, 0L, textFieldCharSequence.m3483getCompositionMzsxiRA(), null, null, 13, null), z);
        } else {
            syncMainBufferToTemporaryBuffer$foundation(textFieldBuffer, z3, z4, z5);
        }
        recordEditForUndo(value$foundation, getValue$foundation(), textFieldBuffer.getChanges(), textFieldEditUndoBehavior);
    }

    static /* synthetic */ void commitEditAsUser$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.commitEditAsUser(inputTransformation, z | (!((i2 & 2) == 0)), textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void editAsUser$foundation$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        boolean z2 = z | (!((i2 & 2) == 0));
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        lVar.invoke(textFieldState.getMainBuffer$foundation());
        textFieldState.commitEditAsUser(inputTransformation, z2, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isEditing() {
        return ((Boolean) this.isEditing$delegate.getValue()).booleanValue();
    }

    private final void recordEditForUndo(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = TextFieldEditUndoBehavior.MergeIfPossible;
        int iOrdinal = textFieldEditUndoBehavior.ordinal();
        if (iOrdinal == 0) {
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, true);
        } else if (iOrdinal == 1) {
            this.textUndoManager.clearHistory();
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, false);
        }
    }

    private final void setEditing(boolean z) {
        this.isEditing$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUserCommit(boolean z) {
        this.userCommit$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setValue(TextFieldCharSequence textFieldCharSequence) {
        this.value$delegate.setValue(textFieldCharSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateValueAndNotifyListeners(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
        setValue(textFieldCharSequence2);
        MutableVector<NotifyImeListener> mutableVector = this.notifyImeListeners;
        NotifyImeListener[] notifyImeListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            notifyImeListenerArr[i2].onChange(textFieldCharSequence, textFieldCharSequence2, (!z || textFieldCharSequence.contentEquals(textFieldCharSequence2) || textFieldCharSequence.m3483getCompositionMzsxiRA() == null) ? false : true);
        }
        setUserCommit(false);
    }

    public final void addNotifyImeListener$foundation(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.add(notifyImeListener);
    }

    public final void commitEdit(TextFieldBuffer textFieldBuffer) {
        TextFieldBuffer textFieldBuffer2;
        int changeCount = textFieldBuffer.getChanges().getChangeCount();
        boolean zM10539equalsimpl0 = TextRange.m10539equalsimpl0(textFieldBuffer.m3476getSelectiond9O1mEE(), this.mainBuffer.m3476getSelectiond9O1mEE());
        boolean z = !x.n(textFieldBuffer.getTextStyleBuffer$foundation(), this.mainBuffer.getTextStyleBuffer$foundation());
        boolean z2 = !zM10539equalsimpl0;
        boolean z3 = changeCount > 0;
        if (!z3 && zM10539equalsimpl0) {
            textFieldBuffer.setCanCallAddStyle$foundation(true);
        }
        if (z3) {
            textFieldBuffer2 = textFieldBuffer;
            recordEditForUndo(getValue$foundation(), TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer2, 0L, null, null, null, 15, null), textFieldBuffer2.getChanges(), TextFieldEditUndoBehavior.NeverMerge);
        } else {
            textFieldBuffer2 = textFieldBuffer;
        }
        syncMainBufferToTemporaryBuffer$foundation(textFieldBuffer2, z3, z2, z);
    }

    public final void edit(l<? super TextFieldBuffer, ab> lVar) {
        TextFieldBuffer textFieldBufferStartEdit = startEdit();
        try {
            lVar.invoke(textFieldBufferStartEdit);
            commitEdit(textFieldBufferStartEdit);
        } finally {
            finishEditing();
        }
    }

    public final void editAsUser$foundation(InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, l<? super TextFieldBuffer, ab> lVar) {
        getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        lVar.invoke(getMainBuffer$foundation());
        commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
        setUserCommit(true);
    }

    public final void editWithNoSideEffects$foundation(l<? super TextFieldBuffer, ab> lVar) {
        getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        lVar.invoke(getMainBuffer$foundation());
        updateValueAndNotifyListeners(getValue$foundation(), TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(getMainBuffer$foundation(), 0L, null, null, null, 15, null), true);
    }

    public final void finishEditing() {
        setEditing(false);
        setUserCommit(false);
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m3485getCompositionMzsxiRA() {
        return getValue$foundation().m3483getCompositionMzsxiRA();
    }

    public final TextFieldBuffer getMainBuffer$foundation() {
        return this.mainBuffer;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m3486getSelectiond9O1mEE() {
        return getValue$foundation().m3484getSelectiond9O1mEE();
    }

    public final CharSequence getText() {
        return getValue$foundation().getText();
    }

    public final TextUndoManager getTextUndoManager$foundation() {
        return this.textUndoManager;
    }

    public final UndoState getUndoState() {
        return this.undoState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getUserCommit$foundation() {
        return ((Boolean) this.userCommit$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldCharSequence getValue$foundation() {
        return (TextFieldCharSequence) this.value$delegate.getValue();
    }

    public final void removeNotifyImeListener$foundation(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.remove(notifyImeListener);
    }

    public final void setMainBuffer$foundation(TextFieldBuffer textFieldBuffer) {
        this.mainBuffer = textFieldBuffer;
    }

    public final TextFieldBuffer startEdit() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (isEditing()) {
                InlineClassHelperKt.throwIllegalStateException("TextFieldState does not support concurrent or nested editing.");
            }
            setEditing(true);
            return new TextFieldBuffer(getValue$foundation(), null, null, null, 14, null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final void syncMainBufferToTemporaryBuffer$foundation(TextFieldBuffer textFieldBuffer, boolean z, boolean z2, boolean z3) {
        TextFieldCharSequence textFieldCharSequenceM3472toTextFieldCharSequencewFTz33Y$foundation$default = TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(this.mainBuffer, 0L, null, null, null, 15, null);
        if (z || z3) {
            String string = textFieldBuffer.toString();
            long jM3476getSelectiond9O1mEE = textFieldBuffer.m3476getSelectiond9O1mEE();
            TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer$foundation = textFieldBuffer.getTextStyleBuffer$foundation();
            this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(string, jM3476getSelectiond9O1mEE, null, null, null, null, textStyleBuffer$foundation != null ? textStyleBuffer$foundation.toImmutable() : null, 60, null), null, null, null, 14, null);
        } else if (z2) {
            this.mainBuffer.m3478setSelection5zctL8(TextRangeKt.TextRange(TextRange.m10546getStartimpl(textFieldBuffer.m3476getSelectiond9O1mEE()), TextRange.m10541getEndimpl(textFieldBuffer.m3476getSelectiond9O1mEE())));
        }
        if (z || z2 || !x.n(textFieldCharSequenceM3472toTextFieldCharSequencewFTz33Y$foundation$default.m3483getCompositionMzsxiRA(), textFieldBuffer.m3474getCompositionMzsxiRA$foundation())) {
            this.mainBuffer.commitComposition$foundation();
        }
        updateValueAndNotifyListeners(textFieldCharSequenceM3472toTextFieldCharSequencewFTz33Y$foundation$default, TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(this.mainBuffer, 0L, null, null, null, 15, null), true);
    }

    public String toString() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.m10549toStringimpl(m3486getSelectiond9O1mEE())) + ", text=\"" + ((Object) getText()) + "\")";
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public static /* synthetic */ void getMainBuffer$foundation$annotations() {
    }

    public static /* synthetic */ void getUndoState$annotations() {
    }

    public /* synthetic */ TextFieldState(String str, long j2, o oVar) {
        this(str, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldState(String str, long j2) {
        this(str, j2, new TextUndoManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldState(String str, long j2, int i2, o oVar) {
        str = 1 == (i2 & 1) ? "" : str;
        this(str, (i2 & 2) != 0 ? TextRangeKt.TextRange(str.length()) : j2, (o) null);
    }

    public /* synthetic */ TextFieldState(String str, long j2, TextUndoManager textUndoManager, o oVar) {
        this(str, j2, textUndoManager);
    }
}
