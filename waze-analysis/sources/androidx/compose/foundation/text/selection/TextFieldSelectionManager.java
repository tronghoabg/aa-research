package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    private Clipboard clipboard;
    private af coroutineScope;
    private final MutableState currentDragPosition$delegate;
    private long dragBeginPosition;
    private TextRange dragBeginSelection;
    private long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private final MutableState enabled$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MutableState hasAvailableTextToPaste$delegate;
    private TextRange latestSelection;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private l<? super TextFieldValue, ab> onValueChange;
    private PlatformSelectionBehaviors platformSelectionBehaviors;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private a<ab> requestAutofillAction;
    private LegacyTextFieldState state;
    private TextToolbar textToolbar;
    private boolean textToolbarShownViaProvider;
    private ToolbarRequester toolbarRequester;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState<TextFieldValue> valueState;
    private VisualTransformation visualTransformation;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab invokeSuspend$lambda$0$0(TextFieldSelectionManager textFieldSelectionManager) {
            af coroutineScope$foundation = textFieldSelectionManager.getCoroutineScope$foundation();
            if (coroutineScope$foundation != null) {
                aj.z(coroutineScope$foundation, null, ag.f51345d, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(textFieldSelectionManager, null), 1);
            }
            textFieldSelectionManager.hideSelectionToolbar$foundation();
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab invokeSuspend$lambda$0$1(TextFieldSelectionManager textFieldSelectionManager) {
            af coroutineScope$foundation = textFieldSelectionManager.getCoroutineScope$foundation();
            if (coroutineScope$foundation != null) {
                aj.z(coroutineScope$foundation, null, ag.f51345d, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$cut$1$1(textFieldSelectionManager, null), 1);
            }
            textFieldSelectionManager.hideSelectionToolbar$foundation();
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab invokeSuspend$lambda$0$2(TextFieldSelectionManager textFieldSelectionManager) {
            af coroutineScope$foundation = textFieldSelectionManager.getCoroutineScope$foundation();
            if (coroutineScope$foundation != null) {
                aj.z(coroutineScope$foundation, null, ag.f51345d, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$paste$1$1(textFieldSelectionManager, null), 1);
            }
            textFieldSelectionManager.hideSelectionToolbar$foundation();
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab invokeSuspend$lambda$0$3(TextFieldSelectionManager textFieldSelectionManager) {
            textFieldSelectionManager.selectAll$foundation();
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab invokeSuspend$lambda$0$4(TextFieldSelectionManager textFieldSelectionManager) {
            textFieldSelectionManager.autofill$foundation();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return TextFieldSelectionManager.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (TextFieldSelectionManager.this.updateClipboardEntry$foundation(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            final TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                a<ab> aVar2 = textFieldSelectionManager.canShowCopyMenuItem$foundation() ? new a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$0(textFieldSelectionManager);
                    }
                } : null;
                a<ab> aVar3 = textFieldSelectionManager.canShowCutMenuItem$foundation() ? new a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$1(textFieldSelectionManager);
                    }
                } : null;
                a<ab> aVar4 = textFieldSelectionManager.canShowPasteMenuItem$foundation() ? new a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda2
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$2(textFieldSelectionManager);
                    }
                } : null;
                a<ab> aVar5 = textFieldSelectionManager.canShowSelectAllMenuItem$foundation() ? new a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda3
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$3(textFieldSelectionManager);
                    }
                } : null;
                a<ab> aVar6 = textFieldSelectionManager.canShowAutofillMenuItem$foundation() ? new a() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$$ExternalSyntheticLambda4
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TextFieldSelectionManager.AnonymousClass1.invokeSuspend$lambda$0$4(textFieldSelectionManager);
                    }
                } : null;
                TextToolbar textToolbar = textFieldSelectionManager.getTextToolbar();
                if (textToolbar != null) {
                    textToolbar.showMenu(textFieldSelectionManager.getContentRect(), aVar2, aVar4, aVar3, aVar5, aVar6);
                }
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                return ab.f48028a;
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new l() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ab.f48028a;
            }
        };
        this.valueState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (o) null), null, 2, null);
        this.visualTransformation = VisualTransformation.Companion.getNone();
        this.editable$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.enabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.dragBeginPosition = Offset.Companion.m7996getZeroF1C5BW0();
        this.dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) (null == true ? 1 : 0), 7, (o) null);
        this.hasAvailableTextToPaste$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.toolbarRequester = new ToolbarRequesterImpl();
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            private TextRange runningSelection;
            private boolean isLongPressSelectionOnly = true;
            private SelectionAdjustment selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();

            private final void onEnd() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m3920setCurrentDragPosition_kEHs6E(null);
                this.selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();
                this.this$0.updateFloatingToolbar(true);
                TextRange textRange = this.runningSelection;
                boolean zM10540getCollapsedimpl = textRange != null ? TextRange.m10540getCollapsedimpl(textRange.m10550unboximpl()) : TextRange.m10540getCollapsedimpl(this.this$0.getValue$foundation().m10831getSelectiond9O1mEE());
                this.this$0.setHandleState(zM10540getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state$foundation = this.this$0.getState$foundation();
                if (state$foundation != null) {
                    state$foundation.setShowSelectionHandleStart(!zM10540getCollapsedimpl && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this.this$0, true));
                }
                LegacyTextFieldState state$foundation2 = this.this$0.getState$foundation();
                if (state$foundation2 != null) {
                    state$foundation2.setShowSelectionHandleEnd(!zM10540getCollapsedimpl && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this.this$0, false));
                }
                LegacyTextFieldState state$foundation3 = this.this$0.getState$foundation();
                if (state$foundation3 != null) {
                    state$foundation3.setShowCursorHandle(zM10540getCollapsedimpl && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this.this$0, true));
                }
                if (this.isLongPressSelectionOnly) {
                    TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                    textFieldSelectionManager.m3919maybeSuggestSelectionOEnZFl4(textFieldSelectionManager.dragBeginSelection);
                }
                this.this$0.dragBeginSelection = null;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                onEnd();
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void mo3386onDragk4lQ0M(long r11) {
                /*
                    Method dump skipped, instructions count: 297
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1.mo3386onDragk4lQ0M(long):void");
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo3387onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                long j3;
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                if (this.this$0.getEnabled() && this.this$0.getDraggingHandle() == null) {
                    this.this$0.setDraggingHandle(Handle.SelectionEnd);
                    this.this$0.previousRawDragOffset = -1;
                    this.isLongPressSelectionOnly = true;
                    this.selectionAdjustmentMode = selectionAdjustment;
                    this.this$0.hideSelectionToolbar$foundation();
                    LegacyTextFieldState state$foundation = this.this$0.getState$foundation();
                    if (state$foundation == null || (layoutResult2 = state$foundation.getLayoutResult()) == null || !layoutResult2.m3424isPositionOnTextk4lQ0M(j2)) {
                        j3 = j2;
                        LegacyTextFieldState state$foundation2 = this.this$0.getState$foundation();
                        if (state$foundation2 != null && (layoutResult = state$foundation2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                            int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation().transformedToOriginal(layoutResult.m3423getOffsetForPosition3MmeM6k(j3, false | (!((2 & 2) == 0))));
                            TextFieldValue textFieldValueM3917createTextFieldValueFDrldGo = textFieldSelectionManager.m3917createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation().getAnnotatedString(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9047getLongPress5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation().invoke(textFieldValueM3917createTextFieldValueFDrldGo);
                            textFieldSelectionManager.m3929setLatestSelectionOEnZFl4$foundation(TextRange.m10534boximpl(textFieldValueM3917createTextFieldValueFDrldGo.m10831getSelectiond9O1mEE()));
                        }
                        this.isLongPressSelectionOnly = false;
                    } else {
                        if (this.this$0.getValue$foundation().getText().length() == 0) {
                            return;
                        }
                        this.this$0.enterSelectionMode$foundation(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                        long jM3921updateSelectionjSglsI8 = textFieldSelectionManager2.m3921updateSelectionjSglsI8(TextFieldValue.m10826copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation(), (AnnotatedString) null, TextRange.Companion.m10551getZerod9O1mEE(), (TextRange) null, 5, (Object) null), j2, true, false, this.selectionAdjustmentMode, true, HapticFeedbackType.m9035boximpl(HapticFeedbackType.Companion.m9047getLongPress5zf0vsI()));
                        j3 = j2;
                        this.this$0.dragBeginSelection = TextRange.m10534boximpl(jM3921updateSelectionjSglsI8);
                        this.runningSelection = TextRange.m10534boximpl(jM3921updateSelectionjSglsI8);
                    }
                    this.this$0.setHandleState(HandleState.None);
                    this.this$0.dragBeginPosition = j3;
                    TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                    textFieldSelectionManager3.m3920setCurrentDragPosition_kEHs6E(Offset.m7969boximpl(textFieldSelectionManager3.dragBeginPosition));
                    this.this$0.dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo3385onDownk4lQ0M(long j2) {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            private TextRange initialSelection;
            private boolean isDoubleOrTripleClickSelectionOnly = true;

            public final TextRange getInitialSelection() {
                return this.initialSelection;
            }

            public final boolean isDoubleOrTripleClickSelectionOnly() {
                return this.isDoubleOrTripleClickSelectionOnly;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo3762onDrag3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState state$foundation;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation().getText().length() == 0 || (state$foundation = this.this$0.getState$foundation()) == null || state$foundation.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation(), j2, false, selectionAdjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                if (this.isDoubleOrTripleClickSelectionOnly) {
                    this.this$0.m3919maybeSuggestSelectionOEnZFl4(this.initialSelection);
                }
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo3763onExtendk4lQ0M(long j2) {
                LegacyTextFieldState state$foundation = this.this$0.getState$foundation();
                if (state$foundation == null || state$foundation.getLayoutResult() == null || !this.this$0.getEnabled()) {
                    return false;
                }
                this.this$0.previousRawDragOffset = -1;
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                updateMouseSelection(this.this$0.getValue$foundation(), j2, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo3764onExtendDragk4lQ0M(long j2) {
                LegacyTextFieldState state$foundation;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation().getText().length() == 0 || (state$foundation = this.this$0.getState$foundation()) == null || state$foundation.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation(), j2, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-9KIMszo */
            public boolean mo3765onStart9KIMszo(long j2, SelectionAdjustment selectionAdjustment, int i2) {
                LegacyTextFieldState state$foundation;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation().getText().length() == 0 || (state$foundation = this.this$0.getState$foundation()) == null || state$foundation.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                this.this$0.dragBeginPosition = j2;
                this.this$0.previousRawDragOffset = -1;
                this.this$0.enterSelectionMode$foundation(1 == ((false ? 1 : 0) | (1 & 1)));
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                long jUpdateMouseSelection = updateMouseSelection(textFieldSelectionManager.getValue$foundation(), textFieldSelectionManager.dragBeginPosition, true, selectionAdjustment);
                if (i2 >= 2) {
                    this.isDoubleOrTripleClickSelectionOnly = true;
                    this.initialSelection = TextRange.m10534boximpl(jUpdateMouseSelection);
                }
                return true;
            }

            public final void setDoubleOrTripleClickSelectionOnly(boolean z) {
                this.isDoubleOrTripleClickSelectionOnly = z;
            }

            public final void setInitialSelection(TextRange textRange) {
                this.initialSelection = textRange;
            }

            public final long updateMouseSelection(TextFieldValue textFieldValue, long j2, boolean z, SelectionAdjustment selectionAdjustment) {
                long jM3921updateSelectionjSglsI8 = this.this$0.m3921updateSelectionjSglsI8(textFieldValue, j2, z, false, selectionAdjustment, false, null);
                if (!TextRange.m10538equalsimpl(jM3921updateSelectionjSglsI8, this.initialSelection)) {
                    this.isDoubleOrTripleClickSelectionOnly = false;
                }
                this.this$0.setHandleState(TextRange.m10540getCollapsedimpl(jM3921updateSelectionjSglsI8) ? HandleState.Cursor : HandleState.Selection);
                return jM3921updateSelectionjSglsI8;
            }
        };
    }

    static final Rect _get_contextMenuAreaModifier_$lambda$0(TextFieldSelectionManager textFieldSelectionManager, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        Rect contentRect = textFieldSelectionManager.getContentRect();
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
        if (legacyTextFieldState == null || (layoutCoordinates2 = legacyTextFieldState.getLayoutCoordinates()) == null) {
            return null;
        }
        return TextContextMenuToolbarHandlerModifierKt.translateRootToDestination(contentRect, layoutCoordinates2, layoutCoordinates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m3917createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j2) {
        return new TextFieldValue(annotatedString, j2, (TextRange) null, 4, (o) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation$default, reason: not valid java name */
    public static /* synthetic */ void m3918deselect_kEHs6E$foundation$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            offset = null;
        }
        textFieldSelectionManager.m3922deselect_kEHs6E$foundation(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        char c2;
        long j2;
        float fIntBitsToFloat;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (true == legacyTextFieldState.isLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m10546getStartimpl(getValue$foundation().m10831getSelectiond9O1mEE()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m10541getEndimpl(getValue$foundation().m10831getSelectiond9O1mEE()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long jM7996getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.Companion.m7996getZeroF1C5BW0() : layoutCoordinates4.mo9746localToRootMKHz9U(m3925getHandlePositiontuRUvjQ$foundation(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long jM7996getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.Companion.m7996getZeroF1C5BW0() : layoutCoordinates3.mo9746localToRootMKHz9U(m3925getHandlePositiontuRUvjQ$foundation(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float fIntBitsToFloat2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    c2 = ' ';
                    j2 = MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                    fIntBitsToFloat = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    float top = (layoutResult == null || (value2 = layoutResult.getValue()) == null) ? 0.0f : value2.getCursorRect(iOriginalToTransformed).getTop();
                    long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    int iFloatToRawIntBits = Float.floatToRawIntBits(top);
                    c2 = ' ';
                    j2 = MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates2.mo9746localToRootMKHz9U((iFloatToRawIntBits & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (layoutCoordinates.mo9746localToRootMKHz9U((Float.floatToRawIntBits((layoutResult2 == null || (value = layoutResult2.getValue()) == null) ? 0.0f : value.getCursorRect(iOriginalToTransformed2).getTop()) & j2) | (Float.floatToRawIntBits(0.0f) << c2)) & j2));
                }
                int i2 = (int) (jM7996getZeroF1C5BW02 >> c2);
                int i3 = (int) (jM7996getZeroF1C5BW0 >> c2);
                return new Rect(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat((int) (jM7996getZeroF1C5BW0 & j2)), Float.intBitsToFloat((int) (jM7996getZeroF1C5BW02 & j2))) + (legacyTextFieldState.getTextDelegate().getDensity().getDensity() * 25.0f));
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k<String, TextRange> getContextTextAndSelection() {
        String text;
        TextRange textRange;
        AnnotatedString transformedText$foundation = getTransformedText$foundation();
        if (transformedText$foundation == null || (text = transformedText$foundation.getText()) == null || (textRange = this.latestSelection) == null) {
            return null;
        }
        long jM10550unboximpl = textRange.m10550unboximpl();
        return new k<>(text, TextRange.m10534boximpl(TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m10546getStartimpl(jM10550unboximpl)), this.offsetMapping.originalToTransformed(TextRange.m10541getEndimpl(jM10550unboximpl)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getHasAvailableTextToPaste() {
        return ((Boolean) this.hasAvailableTextToPaste$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSelection() {
        return !TextRange.m10540getCollapsedimpl(getValue$foundation().m10831getSelectiond9O1mEE());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPassword() {
        return this.visualTransformation instanceof PasswordVisualTransformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: maybeSuggestSelection-OEnZFl4, reason: not valid java name */
    public final void m3919maybeSuggestSelectionOEnZFl4(TextRange textRange) {
        PlatformSelectionBehaviors platformSelectionBehaviors;
        AnnotatedString transformedText$foundation;
        String text;
        af afVar;
        if (textRange == null || (platformSelectionBehaviors = this.platformSelectionBehaviors) == null || (transformedText$foundation = getTransformedText$foundation()) == null || (text = transformedText$foundation.getText()) == null) {
            return;
        }
        OffsetMapping offsetMapping = this.offsetMapping;
        long jTextRange = TextRangeKt.TextRange(offsetMapping.originalToTransformed(TextRange.m10546getStartimpl(textRange.m10550unboximpl())), offsetMapping.originalToTransformed(TextRange.m10541getEndimpl(textRange.m10550unboximpl())));
        if (text.length() <= 0 || TextRange.m10540getCollapsedimpl(jTextRange) || (afVar = this.coroutineScope) == null) {
            return;
        }
        aj.z(afVar, null, null, new TextFieldSelectionManager$maybeSuggestSelection$1(platformSelectionBehaviors, text, jTextRange, textRange, this, offsetMapping, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m3920setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(handleState);
            }
        }
    }

    private final void setHasAvailableTextToPaste(boolean z) {
        this.hasAvailableTextToPaste$delegate.setValue(Boolean.valueOf(z));
    }

    private final br showSelectionToolbarViaTextToolbar() {
        af afVar = this.coroutineScope;
        if (afVar != null) {
            return aj.z(afVar, null, ag.f51345d, new AnonymousClass1(null), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean z) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(z);
        }
        if (z) {
            showSelectionToolbar$foundation();
        } else {
            hideSelectionToolbar$foundation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-jSglsI8, reason: not valid java name */
    public final long m3921updateSelectionjSglsI8(TextFieldValue textFieldValue, long j2, boolean z, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3, HapticFeedbackType hapticFeedbackType) {
        TextLayoutResultProxy layoutResult;
        int i2;
        HapticFeedback hapticFeedback;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.Companion.m10551getZerod9O1mEE();
        }
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m10546getStartimpl(textFieldValue.m10831getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m10541getEndimpl(textFieldValue.m10831getSelectiond9O1mEE())));
        boolean z4 = false;
        int iM3423getOffsetForPosition3MmeM6k = layoutResult.m3423getOffsetForPosition3MmeM6k(j2, false);
        int iM10546getStartimpl = (z2 || z) ? iM3423getOffsetForPosition3MmeM6k : TextRange.m10546getStartimpl(jTextRange);
        int iM10541getEndimpl = (!z2 || z) ? iM3423getOffsetForPosition3MmeM6k : TextRange.m10541getEndimpl(jTextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        if (z || selectionLayout == null || (i2 = this.previousRawDragOffset) == -1) {
            i2 = -1;
        }
        SelectionLayout selectionLayoutM3874getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m3874getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), iM10546getStartimpl, iM10541getEndimpl, i2, jTextRange, z, z2);
        if (!selectionLayoutM3874getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return textFieldValue.m10831getSelectiond9O1mEE();
        }
        this.previousSelectionLayout = selectionLayoutM3874getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = iM3423getOffsetForPosition3MmeM6k;
        Selection selectionAdjust = selectionAdjustment.adjust(selectionLayoutM3874getTextFieldSelectionLayoutRcvTLA);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(selectionAdjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(selectionAdjust.getEnd().getOffset()));
        if (TextRange.m10539equalsimpl0(jTextRange2, textFieldValue.m10831getSelectiond9O1mEE())) {
            return textFieldValue.m10831getSelectiond9O1mEE();
        }
        boolean z5 = TextRange.m10545getReversedimpl(jTextRange2) != TextRange.m10545getReversedimpl(textFieldValue.m10831getSelectiond9O1mEE()) && TextRange.m10539equalsimpl0(TextRangeKt.TextRange(TextRange.m10541getEndimpl(jTextRange2), TextRange.m10546getStartimpl(jTextRange2)), textFieldValue.m10831getSelectiond9O1mEE());
        boolean z6 = TextRange.m10540getCollapsedimpl(jTextRange2) && TextRange.m10540getCollapsedimpl(textFieldValue.m10831getSelectiond9O1mEE());
        if (z3 && textFieldValue.getText().length() > 0 && !z5 && !z6 && hapticFeedbackType != null && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo9034performHapticFeedbackCdsT49E(hapticFeedbackType.m9041unboximpl());
        }
        this.onValueChange.invoke(m3917createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), jTextRange2));
        this.latestSelection = TextRange.m10534boximpl(jTextRange2);
        if (!z3) {
            updateFloatingToolbar(!TextRange.m10540getCollapsedimpl(jTextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(z3);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m10540getCollapsedimpl(jTextRange2) && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m10540getCollapsedimpl(jTextRange2) && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 != null) {
            if (TextRange.m10540getCollapsedimpl(jTextRange2) && TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this, true)) {
                z4 = true;
            }
            legacyTextFieldState5.setShowCursorHandle(z4);
        }
        return jTextRange2;
    }

    public final void autofill$foundation() {
        a<ab> aVar = this.requestAutofillAction;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean canShowAutofillMenuItem$foundation() {
        return getEditable() && TextRange.m10540getCollapsedimpl(getValue$foundation().m10831getSelectiond9O1mEE());
    }

    public final boolean canShowCopyMenuItem$foundation() {
        return (!getHasSelection() || isPassword() || this.clipboard == null) ? false : true;
    }

    public final boolean canShowCutMenuItem$foundation() {
        return getHasSelection() && getEditable() && !isPassword() && this.clipboard != null;
    }

    public final boolean canShowPasteMenuItem$foundation() {
        return getEditable() && getHasAvailableTextToPaste() && this.clipboard != null;
    }

    public final boolean canShowSelectAllMenuItem$foundation() {
        return TextRange.m10542getLengthimpl(getValue$foundation().m10831getSelectiond9O1mEE()) != getValue$foundation().getText().length();
    }

    public final void clearPreviewHighlight$foundation() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m3344setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m10551getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m3347setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m10551getZerod9O1mEE());
        }
    }

    public final br copy$foundation(boolean z) {
        af afVar = this.coroutineScope;
        if (afVar != null) {
            return aj.z(afVar, null, ag.f51345d, new TextFieldSelectionManager$copy$1(this, z, null), 1);
        }
        return null;
    }

    public final AnnotatedString copyWithResult$foundation(boolean z) {
        if (!getHasSelection() || isPassword()) {
            return null;
        }
        AnnotatedString selectedText = TextFieldValueKt.getSelectedText(getValue$foundation());
        if (!z) {
            return selectedText;
        }
        int iM10543getMaximpl = TextRange.m10543getMaximpl(getValue$foundation().m10831getSelectiond9O1mEE());
        this.onValueChange.invoke(m3917createTextFieldValueFDrldGo(getValue$foundation().getAnnotatedString(), TextRangeKt.TextRange(iM10543getMaximpl, iM10543getMaximpl)));
        setHandleState(HandleState.None);
        return selectedText;
    }

    public final TextDragObserver cursorDragObserver$foundation() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo3386onDragk4lQ0M(long j2) {
                TextLayoutResultProxy layoutResult;
                HapticFeedback hapticFeedBack;
                this.this$0.dragTotalDistance = Offset.m7985plusMKHz9U(this.this$0.dragTotalDistance, j2);
                LegacyTextFieldState state$foundation = this.this$0.getState$foundation();
                if (state$foundation == null || (layoutResult = state$foundation.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.m3920setCurrentDragPosition_kEHs6E(Offset.m7969boximpl(Offset.m7985plusMKHz9U(textFieldSelectionManager.dragBeginPosition, textFieldSelectionManager.dragTotalDistance)));
                OffsetMapping offsetMapping$foundation = textFieldSelectionManager.getOffsetMapping$foundation();
                Offset offsetM3923getCurrentDragPosition_m7T9E = textFieldSelectionManager.m3923getCurrentDragPosition_m7T9E();
                x.c(offsetM3923getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping$foundation.transformedToOriginal(layoutResult.m3423getOffsetForPosition3MmeM6k(offsetM3923getCurrentDragPosition_m7T9E.m7990unboximpl(), false | (!((2 & 2) == 0))));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m10539equalsimpl0(jTextRange, textFieldSelectionManager.getValue$foundation().m10831getSelectiond9O1mEE())) {
                    return;
                }
                LegacyTextFieldState state$foundation2 = textFieldSelectionManager.getState$foundation();
                if ((state$foundation2 == null || state$foundation2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager.getOnValueChange$foundation().invoke(textFieldSelectionManager.m3917createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation().getAnnotatedString(), jTextRange));
                textFieldSelectionManager.m3929setLatestSelectionOEnZFl4$foundation(TextRange.m10534boximpl(jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo3387onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                TextLayoutResultProxy layoutResult;
                long jM3871getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m3871getAdjustedCoordinatesk4lQ0M(this.this$0.m3925getHandlePositiontuRUvjQ$foundation(true));
                LegacyTextFieldState state$foundation = this.this$0.getState$foundation();
                if (state$foundation == null || (layoutResult = state$foundation.getLayoutResult()) == null) {
                    return;
                }
                long jM3426translateInnerToDecorationCoordinatesMKHz9U$foundation = layoutResult.m3426translateInnerToDecorationCoordinatesMKHz9U$foundation(jM3871getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM3426translateInnerToDecorationCoordinatesMKHz9U$foundation;
                this.this$0.m3920setCurrentDragPosition_kEHs6E(Offset.m7969boximpl(jM3426translateInnerToDecorationCoordinatesMKHz9U$foundation));
                this.this$0.dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
                this.this$0.setDraggingHandle(Handle.Cursor);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m3920setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m3920setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo3385onDownk4lQ0M(long j2) {
            }
        };
    }

    public final br cut$foundation() {
        af afVar = this.coroutineScope;
        if (afVar != null) {
            return aj.z(afVar, null, ag.f51345d, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
        return null;
    }

    public final AnnotatedString cutWithResult$foundation() {
        if (!getHasSelection() || !getEditable() || isPassword()) {
            return null;
        }
        AnnotatedString selectedText = TextFieldValueKt.getSelectedText(getValue$foundation());
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation(), getValue$foundation().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation(), getValue$foundation().getText().length()));
        int iM10544getMinimpl = TextRange.m10544getMinimpl(getValue$foundation().m10831getSelectiond9O1mEE());
        this.onValueChange.invoke(m3917createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM10544getMinimpl, iM10544getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return selectedText;
    }

    /* renamed from: deselect-_kEHs6E$foundation, reason: not valid java name */
    public final void m3922deselect_kEHs6E$foundation(Offset offset) {
        if (!TextRange.m10540getCollapsedimpl(getValue$foundation().m10831getSelectiond9O1mEE())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            TextFieldValue textFieldValueM10826copy3r_uNRQ$default = TextFieldValue.m10826copy3r_uNRQ$default(getValue$foundation(), (AnnotatedString) null, TextRangeKt.TextRange((offset == null || layoutResult == null) ? TextRange.m10543getMaximpl(getValue$foundation().m10831getSelectiond9O1mEE()) : this.offsetMapping.transformedToOriginal(layoutResult.m3423getOffsetForPosition3MmeM6k(offset.m7990unboximpl(), false | (!((2 & 2) == 0))))), (TextRange) null, 5, (Object) null);
            this.onValueChange.invoke(textFieldValueM10826copy3r_uNRQ$default);
            this.latestSelection = TextRange.m10534boximpl(textFieldValueM10826copy3r_uNRQ$default.m10831getSelectiond9O1mEE());
        }
        setHandleState((offset == null || getValue$foundation().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation(boolean z) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        this.oldValue = getValue$foundation();
        updateFloatingToolbar(z);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    public final Clipboard getClipboard$foundation() {
        return this.clipboard;
    }

    public final Modifier getContextMenuAreaModifier() {
        return !getEnabled() ? Modifier.Companion : TextContextMenuToolbarHandlerModifierKt.textContextMenuToolbarHandler(TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(Modifier.Companion, new TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.toolbarRequester, new TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new l() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldSelectionManager._get_contextMenuAreaModifier_$lambda$0(this.f$0, (LayoutCoordinates) obj);
            }
        });
    }

    public final af getCoroutineScope$foundation() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m3923getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation, reason: not valid java name */
    public final long m3924getCursorPositiontuRUvjQ$foundation(Density density) {
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m10546getStartimpl(getValue$foundation().m10831getSelectiond9O1mEE()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        if (layoutResult == null) {
            x.g();
        }
        TextLayoutResult value = layoutResult.getValue();
        int length = value.getLayoutInput().getText().length();
        if (iOriginalToTransformed < 0) {
            iOriginalToTransformed = 0;
        } else if (iOriginalToTransformed > length) {
            iOriginalToTransformed = length;
        }
        float left = value.getCursorRect(iOriginalToTransformed).getLeft() + (density.mo2127toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()) / 2.0f);
        return (Float.floatToRawIntBits(r4.getBottom()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(left) << 32);
    }

    public final Rect getCursorRect$foundation() {
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m10546getStartimpl(getValue$foundation().m10831getSelectiond9O1mEE()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        if (layoutResult == null) {
            x.g();
        }
        TextLayoutResult value = layoutResult.getValue();
        int length = value.getLayoutInput().getText().length();
        if (iOriginalToTransformed < 0) {
            iOriginalToTransformed = 0;
        } else if (iOriginalToTransformed > length) {
            iOriginalToTransformed = length;
        }
        return value.getCursorRect(iOriginalToTransformed);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled$delegate.getValue()).booleanValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final float getHandleLineHeight$foundation(boolean z) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        int iM10546getStartimpl = z ? TextRange.m10546getStartimpl(getValue$foundation().m10831getSelectiond9O1mEE()) : TextRange.m10541getEndimpl(getValue$foundation().m10831getSelectiond9O1mEE());
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return 0.0f;
        }
        return TextLayoutHelperKt.getLineHeight(value, iM10546getStartimpl);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation, reason: not valid java name */
    public final long m3925getHandlePositiontuRUvjQ$foundation(boolean z) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation = getTransformedText$foundation();
        if (transformedText$foundation == null) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        if (x.n(transformedText$foundation.getText(), value.getLayoutInput().getText().getText())) {
            return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(z ? TextRange.m10546getStartimpl(getValue$foundation().m10831getSelectiond9O1mEE()) : TextRange.m10541getEndimpl(getValue$foundation().m10831getSelectiond9O1mEE())), z, TextRange.m10545getReversedimpl(getValue$foundation().m10831getSelectiond9O1mEE()));
        }
        return Offset.Companion.m7995getUnspecifiedF1C5BW0();
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* renamed from: getLatestSelection-MzsxiRA$foundation, reason: not valid java name */
    public final TextRange m3926getLatestSelectionMzsxiRA$foundation() {
        return this.latestSelection;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation() {
        return this.mouseSelectionObserver;
    }

    public final OffsetMapping getOffsetMapping$foundation() {
        return this.offsetMapping;
    }

    public final l<TextFieldValue, ab> getOnValueChange$foundation() {
        return this.onValueChange;
    }

    public final PlatformSelectionBehaviors getPlatformSelectionBehaviors$foundation() {
        return this.platformSelectionBehaviors;
    }

    public final a<ab> getRequestAutofillAction$foundation() {
        return this.requestAutofillAction;
    }

    public final LegacyTextFieldState getState$foundation() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean getTextToolbarShown$foundation() {
        if (ComposeFoundationFlags.isNewContextMenuEnabled) {
            return this.textToolbarShownViaProvider;
        }
        TextToolbar textToolbar = this.textToolbar;
        return (textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Shown;
    }

    public final boolean getTextToolbarShownViaProvider$foundation() {
        return this.textToolbarShownViaProvider;
    }

    public final ToolbarRequester getToolbarRequester$foundation() {
        return this.toolbarRequester;
    }

    public final TextDragObserver getTouchSelectionObserver$foundation() {
        return this.touchSelectionObserver;
    }

    public final AnnotatedString getTransformedText$foundation() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final TextFieldValue getValue$foundation() {
        return this.valueState.getValue();
    }

    public final VisualTransformation getVisualTransformation$foundation() {
        return this.visualTransformation;
    }

    public final TextDragObserver handleDragObserver$foundation(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo3385onDownk4lQ0M(long j2) {
                TextLayoutResultProxy layoutResult;
                this.this$0.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                long jM3871getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m3871getAdjustedCoordinatesk4lQ0M(this.this$0.m3925getHandlePositiontuRUvjQ$foundation(z));
                LegacyTextFieldState state$foundation = this.this$0.getState$foundation();
                if (state$foundation == null || (layoutResult = state$foundation.getLayoutResult()) == null) {
                    return;
                }
                long jM3426translateInnerToDecorationCoordinatesMKHz9U$foundation = layoutResult.m3426translateInnerToDecorationCoordinatesMKHz9U$foundation(jM3871getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM3426translateInnerToDecorationCoordinatesMKHz9U$foundation;
                this.this$0.m3920setCurrentDragPosition_kEHs6E(Offset.m7969boximpl(jM3426translateInnerToDecorationCoordinatesMKHz9U$foundation));
                this.this$0.dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
                this.this$0.previousRawDragOffset = -1;
                LegacyTextFieldState state$foundation2 = this.this$0.getState$foundation();
                if (state$foundation2 != null) {
                    state$foundation2.setInTouchMode(true);
                }
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo3386onDragk4lQ0M(long j2) {
                this.this$0.dragTotalDistance = Offset.m7985plusMKHz9U(this.this$0.dragTotalDistance, j2);
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                this.this$0.m3920setCurrentDragPosition_kEHs6E(Offset.m7969boximpl(Offset.m7985plusMKHz9U(textFieldSelectionManager.dragBeginPosition, textFieldSelectionManager.dragTotalDistance)));
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                TextFieldValue value$foundation = textFieldSelectionManager2.getValue$foundation();
                Offset offsetM3923getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m3923getCurrentDragPosition_m7T9E();
                x.c(offsetM3923getCurrentDragPosition_m7T9E);
                long jM7990unboximpl = offsetM3923getCurrentDragPosition_m7T9E.m7990unboximpl();
                SelectionAdjustment characterWithWordAccelerate = SelectionAdjustment.Companion.getCharacterWithWordAccelerate();
                HapticFeedbackType hapticFeedbackTypeM9035boximpl = HapticFeedbackType.m9035boximpl(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI());
                this.this$0.m3921updateSelectionjSglsI8(value$foundation, jM7990unboximpl, false, z, characterWithWordAccelerate, true, hapticFeedbackTypeM9035boximpl);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m3920setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m3920setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo3387onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
            }
        };
    }

    public final void hideSelectionToolbar$foundation() {
        TextToolbar textToolbar;
        if (ComposeFoundationFlags.isNewContextMenuEnabled) {
            this.toolbarRequester.hide();
            return;
        }
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isCopyAllowed$foundation() {
        return getHasSelection() && !isPassword();
    }

    public final boolean isCutAllowed$foundation() {
        return getHasSelection() && getEditable() && !isPassword();
    }

    public final boolean isPasteAllowed$foundation() {
        return getEditable();
    }

    public final boolean isTextChanged$foundation() {
        return !x.n(this.oldValue.getText(), getValue$foundation().getText());
    }

    public final void paste$foundation(AnnotatedString annotatedString) {
        if (getEditable()) {
            AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation(), getValue$foundation().getText().length()).plus(annotatedString).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation(), getValue$foundation().getText().length()));
            int iM10544getMinimpl = TextRange.m10544getMinimpl(getValue$foundation().m10831getSelectiond9O1mEE()) + annotatedString.length();
            this.onValueChange.invoke(m3917createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM10544getMinimpl, iM10544getMinimpl)));
            setHandleState(HandleState.None);
            UndoManager undoManager = this.undoManager;
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
        }
    }

    public final void selectAll$foundation() {
        TextFieldValue textFieldValueM3917createTextFieldValueFDrldGo = m3917createTextFieldValueFDrldGo(getValue$foundation().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation().getText().length()));
        this.onValueChange.invoke(textFieldValueM3917createTextFieldValueFDrldGo);
        this.latestSelection = TextRange.m10534boximpl(textFieldValueM3917createTextFieldValueFDrldGo.m10831getSelectiond9O1mEE());
        this.oldValue = TextFieldValue.m10826copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM3917createTextFieldValueFDrldGo.m10831getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation(true);
    }

    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m3927selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long j2) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || TextLayoutHelperKt.m3420isPositionInsideSelectionuaM50fQ(layoutResult.getValue(), layoutResult.m3425translateDecorationToInnerCoordinatesMKHz9U$foundation(j2), TextRange.m10534boximpl(getValue$foundation().m10831getSelectiond9O1mEE()))) {
            return;
        }
        m3921updateSelectionjSglsI8(getValue$foundation(), j2, true, false, SelectionAdjustment.Companion.getWord(), false, null);
    }

    public final void setClipboard$foundation(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final void setCoroutineScope$foundation(af afVar) {
        this.coroutineScope = afVar;
    }

    /* renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation, reason: not valid java name */
    public final void m3928setDeletionPreviewHighlight5zctL8$foundation(long j2) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m3344setDeletionPreviewHighlightRange5zctL8(j2);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m3347setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m10551getZerod9O1mEE());
        }
        if (TextRange.m10540getCollapsedimpl(j2)) {
            return;
        }
        exitSelectionMode$foundation();
    }

    public final void setEditable(boolean z) {
        this.editable$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setEnabled(boolean z) {
        this.enabled$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    /* renamed from: setLatestSelection-OEnZFl4$foundation, reason: not valid java name */
    public final void m3929setLatestSelectionOEnZFl4$foundation(TextRange textRange) {
        this.latestSelection = textRange;
    }

    public final void setOffsetMapping$foundation(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation(l<? super TextFieldValue, ab> lVar) {
        this.onValueChange = lVar;
    }

    public final void setPlatformSelectionBehaviors$foundation(PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.platformSelectionBehaviors = platformSelectionBehaviors;
    }

    public final void setRequestAutofillAction$foundation(a<ab> aVar) {
        this.requestAutofillAction = aVar;
    }

    /* renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation, reason: not valid java name */
    public final void m3930setSelectionPreviewHighlight5zctL8$foundation(long j2) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m3347setSelectionPreviewHighlightRange5zctL8(j2);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m3344setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m10551getZerod9O1mEE());
        }
        if (TextRange.m10540getCollapsedimpl(j2)) {
            return;
        }
        exitSelectionMode$foundation();
    }

    public final void setState$foundation(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setTextToolbarShownViaProvider$foundation(boolean z) {
        this.textToolbarShownViaProvider = z;
    }

    public final void setToolbarRequester$foundation(ToolbarRequester toolbarRequester) {
        this.toolbarRequester = toolbarRequester;
    }

    public final void setValue$foundation(TextFieldValue textFieldValue) {
        this.valueState.setValue(textFieldValue);
        this.latestSelection = TextRange.m10534boximpl(textFieldValue.m10831getSelectiond9O1mEE());
    }

    public final void setVisualTransformation$foundation(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r4.isInTouchMode() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showSelectionToolbar$foundation() {
        /*
            r5 = this;
            androidx.compose.runtime.snapshots.Snapshot$Companion r0 = androidx.compose.runtime.snapshots.Snapshot.Companion
            androidx.compose.runtime.snapshots.Snapshot r1 = r0.getCurrentThreadSnapshot()
            if (r1 == 0) goto Ld
            h.g.a.l r2 = r1.getReadObserver()
            goto Le
        Ld:
            r2 = 0
        Le:
            androidx.compose.runtime.snapshots.Snapshot r3 = r0.makeCurrentNonObservable(r1)
            boolean r4 = r5.getEnabled()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L33
            androidx.compose.foundation.text.LegacyTextFieldState r4 = r5.state     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L22
            boolean r4 = r4.isInTouchMode()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L33
        L22:
            r0.restoreNonObservable(r1, r3, r2)
            boolean r0 = androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled
            if (r0 == 0) goto L2f
            androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester r5 = r5.toolbarRequester
            r5.show()
            return
        L2f:
            r5.showSelectionToolbarViaTextToolbar()
            return
        L33:
            r0.restoreNonObservable(r1, r3, r2)
            return
        L37:
            r5 = move-exception
            r0.restoreNonObservable(r1, r3, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar$foundation():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateClipboardEntry$foundation(h.c.e<? super h.ab> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1 r0 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r4 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r4
            e.b.c.b(r5)
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r5)
            androidx.compose.ui.platform.Clipboard r5 = r4.clipboard
            if (r5 == 0) goto L4e
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.hasAvailableTextToPaste(r4, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r4.setHasAvailableTextToPaste(r5)
        L4e:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.updateClipboardEntry$foundation(h.c.e):java.lang.Object");
    }

    public static /* synthetic */ void getTextToolbarShown$foundation$annotations() {
    }

    public static /* synthetic */ void getToolbarRequester$foundation$annotations() {
    }

    public final br paste$foundation() {
        af afVar = this.coroutineScope;
        if (afVar != null) {
            return aj.z(afVar, null, ag.f51345d, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : undoManager);
    }
}
