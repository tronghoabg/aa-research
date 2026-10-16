package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.b.a.f;
import h.c.b.a.g;
import h.c.e;
import h.d.b;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ap;
import h.g.b.u;
import h.g.b.x;
import h.i;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;
    private Clipboard clipboard;
    private ClipboardPasteState clipboardPasteState;
    private final af coroutineScope;
    private Density density;
    private boolean enabled;
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;
    private boolean isPassword;
    private final PlatformSelectionBehaviors platformSelectionBehaviors;
    private PressInteraction.Press pressInteraction;
    private SelectionLayout previousSelectionLayout;
    private boolean readOnly;
    private a<? extends ReceiveContentConfiguration> receiveContentConfiguration;
    private a<ab> requestAutofillAction;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private TextToolbarHandler textToolbarHandler;
    private final ToolbarRequester toolbarRequester;
    private final MutableState isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private final MutableState startTextLayoutPositionInWindow$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m7969boximpl(Offset.Companion.m7995getUnspecifiedF1C5BW0()), null, 2, null);
    private final MutableState rawHandleDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m7969boximpl(Offset.Companion.m7995getUnspecifiedF1C5BW0()), null, 2, null);
    private final MutableState draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState directDragGestureInitiator$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
    private final MutableState showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState textToolbarState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
    private final MutableState textToolbarShown$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private int previousRawDragOffset = -1;
    private final State derivedVisibleContentBounds$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda2
        @Override // h.g.a.a
        public final Object invoke() {
            return TextFieldSelectionState.derivedVisibleContentBounds_delegate$lambda$0(this.f$0);
        }
    });

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class InputType {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType None = new InputType("None", 0);
        public static final InputType Touch = new InputType("Touch", 1);
        public static final InputType Mouse = new InputType("Mouse", 2);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{None, Touch, Mouse};
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = b.a(inputTypeArr$values);
        }

        private InputType(String str, int i2) {
        }

        public static h.d.a<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        private boolean isDoubleOrTripleClickOnly = true;
        private final a<ab> requestFocus;

        public TextFieldMouseSelectionObserver(a<ab> aVar) {
            this.requestFocus = aVar;
        }

        /* renamed from: updateSelection-12glfjA, reason: not valid java name */
        private final long m3761updateSelection12glfjA(long j2, SelectionAdjustment selectionAdjustment, TextLayoutResult textLayoutResult, boolean z) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            int iM3687getOffsetForPosition3MmeM6k = this.dragBeginOffsetInText;
            if (iM3687getOffsetForPosition3MmeM6k < 0 || iM3687getOffsetForPosition3MmeM6k > length) {
                iM3687getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.getTextLayoutState$foundation().m3687getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            }
            int iM3687getOffsetForPosition3MmeM6k2 = TextFieldSelectionState.this.getTextLayoutState$foundation().m3687getOffsetForPosition3MmeM6k(j2, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM3760updateSelectionQkiN0lo$foundation = textFieldSelectionState.m3760updateSelectionQkiN0lo$foundation(textFieldSelectionState.getTextFieldState$foundation().getVisualText(), iM3687getOffsetForPosition3MmeM6k, iM3687getOffsetForPosition3MmeM6k2, false, selectionAdjustment, false, z, null);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m10540getCollapsedimpl(jM3760updateSelectionQkiN0lo$foundation)) {
                this.dragBeginOffsetInText = TextRange.m10546getStartimpl(jM3760updateSelectionQkiN0lo$foundation);
            }
            if (TextRange.m10545getReversedimpl(jM3760updateSelectionQkiN0lo$foundation)) {
                jM3760updateSelectionQkiN0lo$foundation = TextFieldSelectionStateKt.m3767reverse5zctL8(jM3760updateSelectionQkiN0lo$foundation);
            }
            TextFieldSelectionState.this.getTextFieldState$foundation().m3715selectCharsIn5zctL8(jM3760updateSelectionQkiN0lo$foundation);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            return jM3760updateSelectionQkiN0lo$foundation;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo3762onDrag3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
            TextLayoutResult layoutResult = TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult();
            if (!TextFieldSelectionState.this.getEnabled() || layoutResult == null || TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().length() == 0) {
                return false;
            }
            if (TextRange.m10539equalsimpl0(TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE(), m3761updateSelection12glfjA(j2, selectionAdjustment, layoutResult, false))) {
                return true;
            }
            this.isDoubleOrTripleClickOnly = false;
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
            if (this.isDoubleOrTripleClickOnly) {
                TextFieldSelectionState.this.maybeSuggestSelectionRange();
            }
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo3763onExtendk4lQ0M(long j2) {
            TextLayoutResult layoutResult = TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult();
            if (!TextFieldSelectionState.this.getEnabled() || layoutResult == null || TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().length() == 0) {
                return false;
            }
            this.isDoubleOrTripleClickOnly = false;
            this.requestFocus.invoke();
            m3761updateSelection12glfjA(j2, SelectionAdjustment.Companion.getNone(), layoutResult, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo3764onExtendDragk4lQ0M(long j2) {
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onStart-9KIMszo, reason: not valid java name */
        public boolean mo3765onStart9KIMszo(long j2, SelectionAdjustment selectionAdjustment, int i2) {
            TextLayoutResult layoutResult = TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult();
            if (!TextFieldSelectionState.this.getEnabled() || layoutResult == null || TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().length() == 0) {
                return false;
            }
            this.isDoubleOrTripleClickOnly = i2 >= 2;
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Mouse);
            this.requestFocus.invoke();
            TextFieldSelectionState.this.previousRawDragOffset = -1;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = j2;
            this.dragBeginOffsetInText = TextRange.m10546getStartimpl(m3761updateSelection12glfjA(j2, selectionAdjustment, layoutResult, true));
            return true;
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super br>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, eVar);
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
                    if (this.this$0.detectTouchMode(this.$this_cursorHandleGestures, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2, reason: invalid class name and collision with other inner class name */
        final class C00512 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00512(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, e<? super C00512> eVar) {
                super(2, eVar);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00512(this.this$0, this.$this_cursorHandleGestures, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00512) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    if (this.this$0.detectCursorHandleDragGestures(this.$this_cursorHandleGestures, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3, reason: invalid class name */
        final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, e<? super AnonymousClass3> eVar) {
                super(2, eVar);
                this.$this_cursorHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
            }

            static final ab invokeSuspend$lambda$0(TextFieldSelectionState textFieldSelectionState, Offset offset) {
                TextToolbarState textToolbarState = textFieldSelectionState.getTextToolbarState();
                TextToolbarState textToolbarState2 = TextToolbarState.Cursor;
                if (textToolbarState == textToolbarState2) {
                    textToolbarState2 = TextToolbarState.None;
                }
                textFieldSelectionState.setTextToolbarState(textToolbarState2);
                return ab.f48028a;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0;
                    this.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj2) {
                            return TextFieldSelectionState.AnonymousClass2.AnonymousClass3.invokeSuspend$lambda$0(textFieldSelectionState, (Offset) obj2);
                        }
                    }, this, 7, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PointerInputScope pointerInputScope, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = TextFieldSelectionState.this.new AnonymousClass2(this.$this_cursorHandleGestures, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super br> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            af afVar = (af) this.L$0;
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
            ag agVar = ag.f51345d;
            aj.z(afVar, null, agVar, new AnonymousClass1(textFieldSelectionState, pointerInputScope, null), 1);
            aj.z(afVar, null, agVar, new C00512(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1);
            return aj.z(afVar, null, agVar, new AnonymousClass3(this.$this_cursorHandleGestures, TextFieldSelectionState.this, null), 1);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectCursorHandleDragGestures(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1, reason: invalid class name and case insensitive filesystem */
    final class C03101 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C03101(e<? super C03101> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectSelectionHandleDragGestures(null, false, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2, reason: invalid class name and case insensitive filesystem */
    final class C03112 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C03112(e<? super C03112> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03112 c03112 = TextFieldSelectionState.this.new C03112(eVar);
            c03112.L$0 = obj;
            return c03112;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((C03112) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r5)
                goto L31
            L11:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L19:
                e.b.c.b(r5)
                java.lang.Object r5 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                r1 = r5
            L21:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r3 = r4
                h.c.e r3 = (h.c.e) r3
                r4.L$0 = r1
                r4.label = r2
                java.lang.Object r5 = r1.awaitPointerEvent(r5, r3)
                if (r5 != r0) goto L31
                return r0
            L31:
                androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                boolean r5 = androidx.compose.foundation.text.selection.SelectionGestures_androidKt.isMouseOrTouchPad(r5)
                r5 = r5 ^ r2
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r3 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                r3.setInTouchMode(r5)
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C03112.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1, reason: invalid class name and case insensitive filesystem */
    final class C03121 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ PlatformSelectionBehaviors $platformSelectionBehaviors;
        final /* synthetic */ long $selection;
        final /* synthetic */ CharSequence $text;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03121(PlatformSelectionBehaviors platformSelectionBehaviors, CharSequence charSequence, long j2, TextFieldSelectionState textFieldSelectionState, e<? super C03121> eVar) {
            super(2, eVar);
            this.$platformSelectionBehaviors = platformSelectionBehaviors;
            this.$text = charSequence;
            this.$selection = j2;
            this.this$0 = textFieldSelectionState;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C03121(this.$platformSelectionBehaviors, this.$text, this.$selection, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03121) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                obj = this.$platformSelectionBehaviors.mo3853suggestSelectionForLongPressOrDoubleClickpYaCww(this.$text, this.$selection, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            TextRange textRange = (TextRange) obj;
            if (!this.this$0.isPassword && textRange != null && x.n(this.this$0.getTextFieldState$foundation().getVisualText().getText(), this.$text) && TextRange.m10539equalsimpl0(this.this$0.getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE(), this.$selection)) {
                if (!TextRange.m10539equalsimpl0(textRange.m10550unboximpl(), this.this$0.getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE())) {
                    this.this$0.getTextFieldState$foundation().m3715selectCharsIn5zctL8(textRange.m10550unboximpl());
                }
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 extends u implements p<TextFieldCharSequence, CharSequence, Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // h.g.a.p
        public final Boolean invoke(TextFieldCharSequence textFieldCharSequence, CharSequence charSequence) {
            return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1, reason: invalid class name and case insensitive filesystem */
    final class C03141 extends h.c.b.a.c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C03141(e<? super C03141> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.paste(false, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1, reason: invalid class name and case insensitive filesystem */
    final class C03151 extends h.c.b.a.c {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C03151(e<? super C03151> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.pasteAsPlainText(false, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2, reason: invalid class name and case insensitive filesystem */
    final class C03162 extends g implements p<af, e<? super br>, Object> {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, eVar);
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
                    if (this.this$0.detectTouchMode(this.$this_selectionHandleGestures, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name and collision with other inner class name */
        final class C00522 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00522(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z, e<? super C00522> eVar) {
                super(2, eVar);
                this.$this_selectionHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
                this.$isStartHandle = z;
            }

            static final ab invokeSuspend$lambda$0(TextFieldSelectionState textFieldSelectionState) {
                textFieldSelectionState.clearHandleDragging();
                return ab.f48028a;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00522(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00522) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0;
                    final boolean z = this.$isStartHandle;
                    this.label = 1;
                    if (PressDownGestureKt.detectPressDownGesture(pointerInputScope, new TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                        @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                        /* renamed from: onEvent-k-4lQ0M */
                        public final void mo3737onEventk4lQ0M(long j2) {
                            textFieldSelectionState.markStartContentVisibleOffset();
                            Handle handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
                            TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                            textFieldSelectionState2.m3759updateHandleDraggingUv8p0NA(handle, SelectionHandlesKt.m3871getAdjustedCoordinatesk4lQ0M(textFieldSelectionState2.m3750getHandlePositiontuRUvjQ(z)));
                        }
                    }, new a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$$ExternalSyntheticLambda0
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return TextFieldSelectionState.C03162.C00522.invokeSuspend$lambda$0(textFieldSelectionState);
                        }
                    }, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$4, reason: invalid class name */
        final class AnonymousClass4 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z, e<? super AnonymousClass4> eVar) {
                super(2, eVar);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
                this.$isStartHandle = z;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass4(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    if (this.this$0.detectSelectionHandleDragGestures(this.$this_selectionHandleGestures, this.$isStartHandle, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03162(PointerInputScope pointerInputScope, boolean z, e<? super C03162> eVar) {
            super(2, eVar);
            this.$this_selectionHandleGestures = pointerInputScope;
            this.$isStartHandle = z;
        }

        static final ab invokeSuspend$lambda$0(TextFieldSelectionState textFieldSelectionState, Throwable th) {
            textFieldSelectionState.clearHandleDragging();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03162 c03162 = TextFieldSelectionState.this.new C03162(this.$this_selectionHandleGestures, this.$isStartHandle, eVar);
            c03162.L$0 = obj;
            return c03162;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super br> eVar) {
            return ((C03162) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            af afVar = (af) this.L$0;
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
            ag agVar = ag.f51345d;
            aj.z(afVar, null, agVar, new AnonymousClass1(textFieldSelectionState, pointerInputScope, null), 1);
            br brVarZ = aj.z(afVar, null, agVar, new C00522(this.$this_selectionHandleGestures, TextFieldSelectionState.this, this.$isStartHandle, null), 1);
            final TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
            brVarZ.bY(new l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return TextFieldSelectionState.C03162.invokeSuspend$lambda$0(textFieldSelectionState2, (Throwable) obj2);
                }
            });
            return aj.z(afVar, null, agVar, new AnonymousClass4(TextFieldSelectionState.this, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1, reason: invalid class name and case insensitive filesystem */
    final class C03171 extends h.c.b.a.c {
        int label;
        /* synthetic */ Object result;

        C03171(e<? super C03171> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.startToolbarAndHandlesVisibilityObserver(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2, reason: invalid class name and case insensitive filesystem */
    final class C03182 extends g implements p<af, e<? super br>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TextFieldSelectionState textFieldSelectionState, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = textFieldSelectionState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.this$0, eVar);
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
                    if (this.this$0.observeTextChanges(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2, reason: invalid class name and collision with other inner class name */
        final class C00532 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00532(TextFieldSelectionState textFieldSelectionState, e<? super C00532> eVar) {
                super(2, eVar);
                this.this$0 = textFieldSelectionState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00532(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00532) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    if (this.this$0.observeTextToolbarVisibility(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }
        }

        C03182(e<? super C03182> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03182 c03182 = TextFieldSelectionState.this.new C03182(eVar);
            c03182.L$0 = obj;
            return c03182;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super br> eVar) {
            return ((C03182) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            af afVar = (af) this.L$0;
            aj.z(afVar, null, null, new AnonymousClass1(TextFieldSelectionState.this, null), 3);
            return aj.z(afVar, null, null, new C00532(TextFieldSelectionState.this, null), 3);
        }
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z, boolean z2, boolean z3, boolean z4, ToolbarRequester toolbarRequester, af afVar, PlatformSelectionBehaviors platformSelectionBehaviors, Clipboard clipboard) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.isFocused = z3;
        this.isPassword = z4;
        this.toolbarRequester = toolbarRequester;
        this.coroutineScope = afVar;
        this.platformSelectionBehaviors = platformSelectionBehaviors;
        this.clipboard = clipboard;
        this.enabled = z;
        this.readOnly = z2;
        this.clipboardPasteState = new ClipboardPasteState(this.clipboard);
    }

    private final Rect calculateCursorRect(TextLayoutResult textLayoutResult, TextFieldCharSequence textFieldCharSequence) {
        if (!TextRange.m10540getCollapsedimpl(textFieldCharSequence.m3484getSelectiond9O1mEE())) {
            return Rect.Companion.getZero();
        }
        Rect cursorRect = textLayoutResult.getCursorRect(TextRange.m10546getStartimpl(textFieldCharSequence.m3484getSelectiond9O1mEE()));
        float fFloor = (float) Math.floor(this.density.mo2127toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()));
        LayoutDirection layoutDirection = textLayoutResult.getLayoutInput().getLayoutDirection();
        float fE = n.e(fFloor, 1.0f);
        float left = layoutDirection == LayoutDirection.Ltr ? cursorRect.getLeft() + (fE / 2.0f) : cursorRect.getRight() - (fE / 2.0f);
        long jM10517getSizeYbymL2g = textLayoutResult.m10517getSizeYbymL2g() >> 32;
        float f2 = fE / 2.0f;
        int i2 = ((int) fE) % 2;
        double dE = n.e(n.f(left, ((int) jM10517getSizeYbymL2g) - f2), f2);
        float fFloor2 = i2 == 1 ? ((float) Math.floor(dE)) + 0.5f : (float) Math.rint(dE);
        return new Rect(fFloor2 - f2, cursorRect.getTop(), fFloor2 + f2, cursorRect.getBottom());
    }

    private final Rect calculateSelectionRect(TextLayoutResult textLayoutResult, TextFieldCharSequence textFieldCharSequence) {
        if (TextRange.m10540getCollapsedimpl(textFieldCharSequence.m3484getSelectiond9O1mEE())) {
            return Rect.Companion.getZero();
        }
        int lineForOffset = textLayoutResult.getLineForOffset(TextRange.m10546getStartimpl(textFieldCharSequence.m3484getSelectiond9O1mEE()));
        int lineForOffset2 = textLayoutResult.getLineForOffset(TextRange.m10541getEndimpl(textFieldCharSequence.m3484getSelectiond9O1mEE()));
        if (lineForOffset != lineForOffset2) {
            return textLayoutResult.getPathForRange(TextRange.m10544getMinimpl(textFieldCharSequence.m3484getSelectiond9O1mEE()), TextRange.m10543getMaximpl(textFieldCharSequence.m3484getSelectiond9O1mEE())).getBounds();
        }
        float horizontalPosition = textLayoutResult.getHorizontalPosition(TextRange.m10546getStartimpl(textFieldCharSequence.m3484getSelectiond9O1mEE()), true);
        float horizontalPosition2 = textLayoutResult.getHorizontalPosition(TextRange.m10541getEndimpl(textFieldCharSequence.m3484getSelectiond9O1mEE()), true);
        return new Rect(Math.min(horizontalPosition, horizontalPosition2), textLayoutResult.getLineTop(lineForOffset), Math.max(horizontalPosition, horizontalPosition2), textLayoutResult.getLineBottom(lineForOffset2));
    }

    static final Rect derivedVisibleContentBounds_delegate$lambda$0(TextFieldSelectionState textFieldSelectionState) {
        LayoutCoordinates textLayoutCoordinates;
        if (TextRange.m10540getCollapsedimpl(textFieldSelectionState.textFieldState.getVisualText().m3484getSelectiond9O1mEE())) {
            if (textFieldSelectionState.getTextToolbarState() != TextToolbarState.Cursor) {
                return null;
            }
        } else if (textFieldSelectionState.getTextToolbarState() != TextToolbarState.Selection) {
            return null;
        }
        if (textFieldSelectionState.getDraggingHandle() != null || !textFieldSelectionState.isInTouchMode() || (textLayoutCoordinates = textFieldSelectionState.getTextLayoutCoordinates()) == null) {
            return null;
        }
        Rect rectVisibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates);
        Rect rectM8020Recttz77jQw = RectKt.m8020Recttz77jQw(textLayoutCoordinates.mo9746localToRootMKHz9U(rectVisibleBounds.m8015getTopLeftF1C5BW0()), rectVisibleBounds.m8013getSizeNHjbRc());
        Rect contentRect = textFieldSelectionState.getContentRect();
        if (contentRect.overlaps(rectM8020Recttz77jQw)) {
            return contentRect.intersect(rectM8020Recttz77jQw);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r9, h.c.e<? super h.ab> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            r0.<init>(r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r9 = r6.L$1
            h.g.b.ap r9 = (h.g.b.ap) r9
            java.lang.Object r0 = r6.L$0
            r1 = r0
            h.g.b.ap r1 = (h.g.b.ap) r1
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L31:
            r0 = move-exception
            r10 = r0
            goto L89
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            e.b.c.b(r10)
            h.g.b.ap r10 = new h.g.b.ap
            r10.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r3 = r1.m7995getUnspecifiedF1C5BW0()
            r10.f48104a = r3
            h.g.b.ap r7 = new h.g.b.ap
            r7.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r3 = r1.m7995getUnspecifiedF1C5BW0()
            r7.f48104a = r3
            r1 = r2
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda4 r2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda4     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda5 r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda5     // Catch: java.lang.Throwable -> L84
            r3.<init>()     // Catch: java.lang.Throwable -> L84
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda6 r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda6     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda7 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda7     // Catch: java.lang.Throwable -> L84
            r5.<init>()     // Catch: java.lang.Throwable -> L84
            r6.L$0 = r10     // Catch: java.lang.Throwable -> L84
            r6.L$1 = r7     // Catch: java.lang.Throwable -> L84
            r6.label = r1     // Catch: java.lang.Throwable -> L84
            r1 = r9
            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L84
            if (r9 == r0) goto L83
            r1 = r10
            r9 = r7
        L7d:
            detectCursorHandleDragGestures$onDragStop(r1, r9, r8)
            h.ab r8 = h.ab.f48028a
            return r8
        L83:
            return r0
        L84:
            r0 = move-exception
            r9 = r0
            r1 = r10
            r10 = r9
            r9 = r7
        L89:
            detectCursorHandleDragGestures$onDragStop(r1, r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, h.c.e):java.lang.Object");
    }

    static final ab detectCursorHandleDragGestures$lambda$0(ap apVar, TextFieldSelectionState textFieldSelectionState, ap apVar2, Offset offset) {
        apVar.f48104a = SelectionHandlesKt.m3871getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.getCursorRect().m8007getBottomCenterF1C5BW0());
        apVar2.f48104a = Offset.Companion.m7996getZeroF1C5BW0();
        textFieldSelectionState.setInTouchMode(true);
        textFieldSelectionState.markStartContentVisibleOffset();
        textFieldSelectionState.m3759updateHandleDraggingUv8p0NA(Handle.Cursor, apVar.f48104a);
        return ab.f48028a;
    }

    static final ab detectCursorHandleDragGestures$lambda$1(ap apVar, ap apVar2, TextFieldSelectionState textFieldSelectionState) {
        detectCursorHandleDragGestures$onDragStop(apVar, apVar2, textFieldSelectionState);
        return ab.f48028a;
    }

    static final ab detectCursorHandleDragGestures$lambda$2(ap apVar, ap apVar2, TextFieldSelectionState textFieldSelectionState) {
        detectCursorHandleDragGestures$onDragStop(apVar, apVar2, textFieldSelectionState);
        return ab.f48028a;
    }

    static final ab detectCursorHandleDragGestures$lambda$3(ap apVar, TextFieldSelectionState textFieldSelectionState, ap apVar2, PointerInputChange pointerInputChange, Offset offset) {
        apVar.f48104a = Offset.m7985plusMKHz9U(apVar.f48104a, offset.m7990unboximpl());
        textFieldSelectionState.m3759updateHandleDraggingUv8p0NA(Handle.Cursor, Offset.m7985plusMKHz9U(apVar2.f48104a, apVar.f48104a));
        if (textFieldSelectionState.m3758placeCursorAtNearestOffsetk4lQ0M(textFieldSelectionState.m3757getHandleDragPositionF1C5BW0())) {
            pointerInputChange.consume();
            HapticFeedback hapticFeedback = textFieldSelectionState.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI());
            }
        }
        return ab.f48028a;
    }

    private static final void detectCursorHandleDragGestures$onDragStop(ap apVar, ap apVar2, TextFieldSelectionState textFieldSelectionState) {
        if ((apVar.f48104a & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            apVar.f48104a = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            apVar2.f48104a = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r15, final boolean r16, h.c.e<? super h.ab> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, boolean, h.c.e):java.lang.Object");
    }

    static final ab detectSelectionHandleDragGestures$lambda$0(ap apVar, TextFieldSelectionState textFieldSelectionState, boolean z, Handle handle, ap apVar2, Offset offset) {
        long jM3871getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m3871getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m3750getHandlePositiontuRUvjQ(z));
        apVar.f48104a = jM3871getAdjustedCoordinatesk4lQ0M;
        textFieldSelectionState.m3759updateHandleDraggingUv8p0NA(handle, jM3871getAdjustedCoordinatesk4lQ0M);
        apVar2.f48104a = Offset.Companion.m7996getZeroF1C5BW0();
        textFieldSelectionState.previousRawDragOffset = -1;
        return ab.f48028a;
    }

    static final ab detectSelectionHandleDragGestures$lambda$1(ap apVar, TextFieldSelectionState textFieldSelectionState, ap apVar2) {
        detectSelectionHandleDragGestures$onDragStop(apVar, textFieldSelectionState, apVar2);
        return ab.f48028a;
    }

    static final ab detectSelectionHandleDragGestures$lambda$2(ap apVar, TextFieldSelectionState textFieldSelectionState, ap apVar2) {
        detectSelectionHandleDragGestures$onDragStop(apVar, textFieldSelectionState, apVar2);
        return ab.f48028a;
    }

    static final ab detectSelectionHandleDragGestures$lambda$3(ap apVar, TextFieldSelectionState textFieldSelectionState, Handle handle, ap apVar2, boolean z, PointerInputChange pointerInputChange, Offset offset) {
        apVar.f48104a = Offset.m7985plusMKHz9U(apVar.f48104a, offset.m7990unboximpl());
        TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
        if (layoutResult != null) {
            textFieldSelectionState.m3759updateHandleDraggingUv8p0NA(handle, Offset.m7985plusMKHz9U(apVar2.f48104a, apVar.f48104a));
            int iM10516getOffsetForPositionk4lQ0M = z ? layoutResult.m10516getOffsetForPositionk4lQ0M(textFieldSelectionState.m3757getHandleDragPositionF1C5BW0()) : TextRange.m10546getStartimpl(textFieldSelectionState.textFieldState.getVisualText().m3484getSelectiond9O1mEE());
            int iM10541getEndimpl = z ? TextRange.m10541getEndimpl(textFieldSelectionState.textFieldState.getVisualText().m3484getSelectiond9O1mEE()) : layoutResult.m10516getOffsetForPositionk4lQ0M(textFieldSelectionState.m3757getHandleDragPositionF1C5BW0());
            long jM3484getSelectiond9O1mEE = textFieldSelectionState.textFieldState.getVisualText().m3484getSelectiond9O1mEE();
            long jM3756updateSelectionQkiN0lo$foundation$default = m3756updateSelectionQkiN0lo$foundation$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), iM10516getOffsetForPositionk4lQ0M, iM10541getEndimpl, z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), false, false, HapticFeedbackType.m9035boximpl(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI()), 96, null);
            if (TextRange.m10540getCollapsedimpl(jM3484getSelectiond9O1mEE) || !TextRange.m10540getCollapsedimpl(jM3756updateSelectionQkiN0lo$foundation$default)) {
                textFieldSelectionState.textFieldState.m3715selectCharsIn5zctL8(jM3756updateSelectionQkiN0lo$foundation$default);
            }
        }
        return ab.f48028a;
    }

    private static final void detectSelectionHandleDragGestures$onDragStop(ap apVar, TextFieldSelectionState textFieldSelectionState, ap apVar2) {
        if ((apVar.f48104a & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            textFieldSelectionState.clearHandleDragging();
            apVar.f48104a = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            apVar2.f48104a = Offset.Companion.m7996getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    private final Rect getContentRect() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        if (textLayoutCoordinates == null) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("textLayoutCoordinates should not be null.");
            throw new h.e();
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m10540getCollapsedimpl(visualText.m3484getSelectiond9O1mEE())) {
            Rect cursorRect = getCursorRect();
            return RectKt.m8020Recttz77jQw(textLayoutCoordinates.mo9746localToRootMKHz9U(cursorRect.m8015getTopLeftF1C5BW0()), cursorRect.m8013getSizeNHjbRc());
        }
        long jMo9746localToRootMKHz9U = textLayoutCoordinates.mo9746localToRootMKHz9U(m3750getHandlePositiontuRUvjQ(true));
        long jMo9746localToRootMKHz9U2 = textLayoutCoordinates.mo9746localToRootMKHz9U(m3750getHandlePositiontuRUvjQ(false));
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.Companion.getZero();
        }
        float top = layoutResult.getCursorRect(TextRange.m10546getStartimpl(visualText.m3484getSelectiond9O1mEE())).getTop();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (textLayoutCoordinates.mo9746localToRootMKHz9U((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float top2 = layoutResult.getCursorRect(TextRange.m10541getEndimpl(visualText.m3484getSelectiond9O1mEE())).getTop();
        int i2 = (int) (jMo9746localToRootMKHz9U2 >> 32);
        int i3 = (int) (jMo9746localToRootMKHz9U >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (textLayoutCoordinates.mo9746localToRootMKHz9U((Float.floatToRawIntBits(top2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(0.0f) << 32)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float fMin = Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2));
        float fMax = Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2));
        if (fMin == fMax) {
            fMax += 1.0f;
        }
        return new Rect(fMin, Math.min(fIntBitsToFloat, fIntBitsToFloat2), fMax, Math.max(Float.intBitsToFloat((int) (jMo9746localToRootMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (jMo9746localToRootMKHz9U2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
    }

    /* renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m3749getCurrentTextLayoutPositionInWindowF1C5BW0() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return textLayoutCoordinates != null ? LayoutCoordinatesKt.positionInWindow(textLayoutCoordinates) : Offset.Companion.m7995getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m3750getHandlePositiontuRUvjQ(boolean z) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        long jM3484getSelectiond9O1mEE = this.textFieldState.getVisualText().m3484getSelectiond9O1mEE();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, z ? TextRange.m10546getStartimpl(jM3484getSelectiond9O1mEE) : TextRange.m10541getEndimpl(jM3484getSelectiond9O1mEE), z, TextRange.m10545getReversedimpl(jM3484getSelectiond9O1mEE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m3751getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition$delegate.getValue()).m7990unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m3752getStartTextLayoutPositionInWindowF1C5BW0() {
        return ((Offset) this.startTextLayoutPositionInWindow$delegate.getValue()).m7990unboximpl();
    }

    /* renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m3753getTextFieldSelectionqeG_v_k(int i2, int i3, TextRange textRange, boolean z, SelectionAdjustment selectionAdjustment) {
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.Companion.m10551getZerod9O1mEE();
        }
        if (textRange == null && x.n(selectionAdjustment, SelectionAdjustment.Companion.getCharacter())) {
            return TextRangeKt.TextRange(i2, i3);
        }
        int i6 = this.previousRawDragOffset;
        long jM10550unboximpl = textRange != null ? textRange.m10550unboximpl() : TextRange.Companion.m10551getZerod9O1mEE();
        if (textRange == null) {
            z2 = true;
            i5 = i2;
            i4 = i3;
            z3 = z;
        } else {
            z2 = false;
            i4 = i3;
            z3 = z;
            i5 = i2;
        }
        SelectionLayout selectionLayoutM3874getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m3874getTextFieldSelectionLayoutRcvTLA(layoutResult, i5, i4, i6, jM10550unboximpl, z2, z3);
        if (textRange != null && !selectionLayoutM3874getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return textRange.m10550unboximpl();
        }
        long jM3865toTextRanged9O1mEE = selectionAdjustment.adjust(selectionLayoutM3874getTextFieldSelectionLayoutRcvTLA).m3865toTextRanged9O1mEE();
        this.previousSelectionLayout = selectionLayoutM3874getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = true == z3 ? i5 : i4;
        return jM3865toTextRanged9O1mEE;
    }

    private final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextToolbarState getTextToolbarState() {
        return (TextToolbarState) this.textToolbarState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTextToolbar() {
        if (ComposeFoundationFlags.isNewContextMenuEnabled) {
            this.toolbarRequester.hide();
            return;
        }
        TextToolbarHandler textToolbarHandler = this.textToolbarHandler;
        if (textToolbarHandler != null) {
            textToolbarHandler.hideTextToolbar();
        }
    }

    private final boolean isCursorHandleInVisibleBounds() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long jM8007getBottomCenterF1C5BW0 = getCursorRect().m8007getBottomCenterF1C5BW0();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates != null) {
                return SelectionManagerKt.m3898containsInclusiveUv8p0NA(SelectionManagerKt.visibleBounds(textLayoutCoordinates), jM8007getBottomCenterF1C5BW0);
            }
            return false;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        m3755setStartTextLayoutPositionInWindowk4lQ0M(m3749getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextChanges(e<? super ab> eVar) {
        Object objCollect = ai.X(ai.z(SnapshotStateKt.snapshotFlow(new a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.textFieldState.getVisualText();
            }
        }), AnonymousClass3.INSTANCE)).collect(new kotlinx.coroutines.b.l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextChanges.4
            public final Object emit(TextFieldCharSequence textFieldCharSequence, e<? super ab> eVar2) {
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar2) {
                return emit((TextFieldCharSequence) obj, (e<? super ab>) eVar2);
            }
        }, eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextToolbarVisibility(e<? super ab> eVar) {
        k kVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.getDerivedVisibleContentBounds$foundation();
            }
        });
        if (ComposeFoundationFlags.isNewContextMenuEnabled) {
            kVarSnapshotFlow = ai.A(kVarSnapshotFlow, new l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TextFieldSelectionState.observeTextToolbarVisibility$lambda$1$0((Rect) obj));
                }
            });
        }
        Object objCollect = kVarSnapshotFlow.collect(new kotlinx.coroutines.b.l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.4
            public final Object emit(Rect rect, e<? super ab> eVar2) {
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                if (rect != null) {
                    Object objShowTextToolbar = textFieldSelectionState.showTextToolbar(rect, eVar2);
                    return objShowTextToolbar == h.c.a.a.f48038a ? objShowTextToolbar : ab.f48028a;
                }
                textFieldSelectionState.hideTextToolbar();
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar2) {
                return emit((Rect) obj, (e<? super ab>) eVar2);
            }
        }, eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeTextToolbarVisibility$lambda$1$0(Rect rect) {
        return rect == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r12 != r1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pasteAsPlainText(boolean r11, h.c.e<? super h.ab> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C03151
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C03151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            boolean r11 = r0.Z$0
            e.b.c.b(r12)
        L2b:
            r7 = r11
            goto L59
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            boolean r11 = r0.Z$0
            e.b.c.b(r12)
            goto L4a
        L3b:
            e.b.c.b(r12)
            androidx.compose.ui.platform.Clipboard r12 = r10.clipboard
            r0.Z$0 = r11
            r0.label = r4
            java.lang.Object r12 = r12.getClipEntry(r0)
            if (r12 == r1) goto L73
        L4a:
            androidx.compose.ui.platform.ClipEntry r12 = (androidx.compose.ui.platform.ClipEntry) r12
            if (r12 == 0) goto L70
            r0.Z$0 = r11
            r0.label = r3
            java.lang.Object r12 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.readText(r12, r0)
            if (r12 == r1) goto L73
            goto L2b
        L59:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L5e
            goto L70
        L5e:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r2 = r10.textFieldState
            r3 = r12
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r5 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r8 = 10
            r9 = 0
            r4 = 0
            r6 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(r2, r3, r4, r5, r6, r7, r8, r9)
            h.ab r10 = h.ab.f48028a
            return r10
        L70:
            h.ab r10 = h.ab.f48028a
            return r10
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.pasteAsPlainText(boolean, h.c.e):java.lang.Object");
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m3754setRawHandleDragPositionk4lQ0M(long j2) {
        this.rawHandleDragPosition$delegate.setValue(Offset.m7969boximpl(j2));
    }

    /* renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M, reason: not valid java name */
    private final void m3755setStartTextLayoutPositionInWindowk4lQ0M(long j2) {
        this.startTextLayoutPositionInWindow$delegate.setValue(Offset.m7969boximpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState$delegate.setValue(textToolbarState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showTextToolbar(Rect rect, e<? super ab> eVar) {
        Object objShowTextToolbar;
        if (ComposeFoundationFlags.isNewContextMenuEnabled) {
            this.toolbarRequester.show();
        } else {
            TextToolbarHandler textToolbarHandler = this.textToolbarHandler;
            if (textToolbarHandler != null && (objShowTextToolbar = textToolbarHandler.showTextToolbar(this, rect, eVar)) == h.c.a.a.f48038a) {
                return objShowTextToolbar;
            }
        }
        return ab.f48028a;
    }

    /* renamed from: updateSelection-QkiN0lo$foundation$default, reason: not valid java name */
    public static /* synthetic */ long m3756updateSelectionQkiN0lo$foundation$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i2, int i3, boolean z, SelectionAdjustment selectionAdjustment, boolean z2, boolean z3, HapticFeedbackType hapticFeedbackType, int i4, Object obj) {
        return textFieldSelectionState.m3760updateSelectionQkiN0lo$foundation(textFieldCharSequence, i2, i3, z, selectionAdjustment, z2 & ((i4 & 32) == 0), z3 & ((i4 & 64) == 0), hapticFeedbackType);
    }

    public final void autofill() {
        a<ab> aVar = this.requestAutofillAction;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean canShowAutofillMenuItem() {
        return getEditable$foundation() && TextRange.m10540getCollapsedimpl(this.textFieldState.getVisualText().m3484getSelectiond9O1mEE());
    }

    public final boolean canShowCopyMenuItem() {
        return (TextRange.m10540getCollapsedimpl(getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE()) || this.isPassword) ? false : true;
    }

    public final boolean canShowCutMenuItem() {
        return (TextRange.m10540getCollapsedimpl(getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE()) || !getEditable$foundation() || this.isPassword) ? false : true;
    }

    public final boolean canShowPasteMenuItem() {
        if (getEditable$foundation()) {
            if (this.clipboardPasteState.getHasText()) {
                return true;
            }
            a<? extends ReceiveContentConfiguration> aVar = this.receiveContentConfiguration;
            if ((aVar != null ? aVar.invoke() : null) != null && this.clipboardPasteState.getHasClip()) {
                return true;
            }
        }
        return false;
    }

    public final boolean canShowSelectAllMenuItem() {
        return TextRange.m10542getLengthimpl(this.textFieldState.getVisualText().m3484getSelectiond9O1mEE()) != this.textFieldState.getVisualText().length();
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        m3754setRawHandleDragPositionk4lQ0M(Offset.Companion.m7995getUnspecifiedF1C5BW0());
        m3755setStartTextLayoutPositionInWindowk4lQ0M(Offset.Companion.m7995getUnspecifiedF1C5BW0());
    }

    public final Object copy(boolean z, e<? super ab> eVar) {
        Object clipEntry;
        AnnotatedString annotatedStringCopyWithResult$foundation = copyWithResult$foundation(z);
        return (annotatedStringCopyWithResult$foundation != null && (clipEntry = this.clipboard.setClipEntry(ClipboardUtils_androidKt.toClipEntry(annotatedStringCopyWithResult$foundation), eVar)) == h.c.a.a.f48038a) ? clipEntry : ab.f48028a;
    }

    public final AnnotatedString copyWithResult$foundation(boolean z) {
        if (TextRange.m10540getCollapsedimpl(getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE()) || this.isPassword) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(this.textFieldState.getVisualText()).toString(), null, 2, null);
        if (z) {
            this.textFieldState.collapseSelectionToMax();
        }
        return annotatedString;
    }

    public final Object cursorHandleGestures(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(pointerInputScope, null), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    public final Object cut(e<? super ab> eVar) {
        Object clipEntry;
        AnnotatedString annotatedStringCutWithResult = cutWithResult();
        return (annotatedStringCutWithResult != null && (clipEntry = this.clipboard.setClipEntry(ClipboardUtils_androidKt.toClipEntry(annotatedStringCutWithResult), eVar)) == h.c.a.a.f48038a) ? clipEntry : ab.f48028a;
    }

    public final AnnotatedString cutWithResult() {
        if (TextRange.m10540getCollapsedimpl(getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE()) || !getEditable$foundation() || this.isPassword) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(this.textFieldState.getVisualText()).toString(), null, 2, null);
        this.textFieldState.deleteSelectedText(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)));
        return annotatedString;
    }

    public final void deselect() {
        if (!TextRange.m10540getCollapsedimpl(this.textFieldState.getVisualText().m3484getSelectiond9O1mEE())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    public final Object detectTextFieldTapGestures(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, a<ab> aVar, a<ab> aVar2, e<? super ab> eVar) {
        Object objDetectTextFieldTapGestures = TextFieldSelectionState_androidKt.detectTextFieldTapGestures(this, pointerInputScope, mutableInteractionSource, aVar, aVar2, eVar);
        return objDetectTextFieldTapGestures == h.c.a.a.f48038a ? objDetectTextFieldTapGestures : ab.f48028a;
    }

    public final Object detectTouchMode(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C03112(null), eVar);
        return objAwaitPointerEventScope == h.c.a.a.f48038a ? objAwaitPointerEventScope : ab.f48028a;
    }

    public final void dispose() {
        hideTextToolbar();
        this.hapticFeedBack = null;
    }

    public final TextFieldHandleState getCursorHandleState$foundation(boolean z) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        InputType directDragGestureInitiator = getDirectDragGestureInitiator();
        InputType inputType = InputType.None;
        Handle draggingHandle = getDraggingHandle();
        if (showCursorHandle && directDragGestureInitiator == inputType && TextRange.m10540getCollapsedimpl(visualText.m3484getSelectiond9O1mEE()) && visualText.shouldShowSelection() && visualText.length() > 0 && (draggingHandle == Handle.Cursor || isCursorHandleInVisibleBounds())) {
            return new TextFieldHandleState(true, z ? getCursorRect().m8007getBottomCenterF1C5BW0() : Offset.Companion.m7995getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);
        }
        return TextFieldHandleState.Companion.getHidden();
    }

    public final Rect getCursorRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        return layoutResult == null ? Rect.Companion.getZero() : calculateCursorRect(layoutResult, this.textFieldState.getVisualText());
    }

    public final Rect getDerivedVisibleContentBounds$foundation() {
        return (Rect) this.derivedVisibleContentBounds$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputType getDirectDragGestureInitiator() {
        return (InputType) this.directDragGestureInitiator$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final boolean getEditable$foundation() {
        return this.enabled && !this.readOnly;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Rect getFocusRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.Companion.getZero();
        }
        if (!this.isFocused) {
            return FocusProperties.Companion.getUnsetFocusRect();
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        return TextLayoutStateKt.fromTextLayoutToDecoration(this.textLayoutState, TextRange.m10540getCollapsedimpl(visualText.m3484getSelectiond9O1mEE()) ? calculateCursorRect(layoutResult, visualText) : calculateSelectionRect(layoutResult, visualText));
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m3757getHandleDragPositionF1C5BW0() {
        return (m3751getRawHandleDragPositionF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? Offset.Companion.m7995getUnspecifiedF1C5BW0() : (m3752getStartTextLayoutPositionInWindowF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? TextLayoutStateKt.m3692fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m3751getRawHandleDragPositionF1C5BW0()) : Offset.m7985plusMKHz9U(m3751getRawHandleDragPositionF1C5BW0(), Offset.m7984minusMKHz9U(m3752getStartTextLayoutPositionInWindowF1C5BW0(), m3749getCurrentTextLayoutPositionInWindowF1C5BW0()));
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final PlatformSelectionBehaviors getPlatformSelectionBehaviors$foundation() {
        return this.platformSelectionBehaviors;
    }

    public final PressInteraction.Press getPressInteraction() {
        return this.pressInteraction;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final a<ReceiveContentConfiguration> getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    public final a<ab> getRequestAutofillAction() {
        return this.requestAutofillAction;
    }

    public final TextFieldHandleState getSelectionHandleState$foundation(boolean z, boolean z2) {
        LayoutCoordinates textLayoutCoordinates;
        Handle handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextFieldHandleState.Companion.getHidden();
        }
        long jM3484getSelectiond9O1mEE = this.textFieldState.getVisualText().m3484getSelectiond9O1mEE();
        if (TextRange.m10540getCollapsedimpl(jM3484getSelectiond9O1mEE)) {
            return TextFieldHandleState.Companion.getHidden();
        }
        long jM3750getHandlePositiontuRUvjQ = m3750getHandlePositiontuRUvjQ(z);
        if (getDirectDragGestureInitiator() != InputType.None || (getDraggingHandle() != handle && ((textLayoutCoordinates = getTextLayoutCoordinates()) == null || !SelectionManagerKt.m3898containsInclusiveUv8p0NA(SelectionManagerKt.visibleBounds(textLayoutCoordinates), jM3750getHandlePositiontuRUvjQ)))) {
            return TextFieldHandleState.Companion.getHidden();
        }
        if (!this.textFieldState.getVisualText().shouldShowSelection()) {
            return TextFieldHandleState.Companion.getHidden();
        }
        ResolvedTextDirection bidiRunDirection = layoutResult.getBidiRunDirection(z ? TextRange.m10546getStartimpl(jM3484getSelectiond9O1mEE) : Math.max(TextRange.m10541getEndimpl(jM3484getSelectiond9O1mEE) - 1, 0));
        boolean zM10545getReversedimpl = TextRange.m10545getReversedimpl(jM3484getSelectiond9O1mEE);
        if (z2) {
            LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
            if (textLayoutCoordinates2 != null) {
                jM3750getHandlePositiontuRUvjQ = TextLayoutStateKt.m3691coerceIn3MmeM6k(jM3750getHandlePositiontuRUvjQ, SelectionManagerKt.visibleBounds(textLayoutCoordinates2));
            }
        } else {
            jM3750getHandlePositiontuRUvjQ = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        return new TextFieldHandleState(true, jM3750getHandlePositiontuRUvjQ, TextLayoutHelperKt.getLineHeight(layoutResult, z ? TextRange.m10546getStartimpl(jM3484getSelectiond9O1mEE) : TextRange.m10541getEndimpl(jM3484getSelectiond9O1mEE)), bidiRunDirection, zM10545getReversedimpl, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    public final TransformedTextFieldState getTextFieldState$foundation() {
        return this.textFieldState;
    }

    public final TextLayoutState getTextLayoutState$foundation() {
        return this.textLayoutState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getTextToolbarShown() {
        return ((Boolean) this.textToolbarShown$delegate.getValue()).booleanValue();
    }

    public final boolean isCopyAllowed() {
        return (TextRange.m10540getCollapsedimpl(getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE()) || this.isPassword) ? false : true;
    }

    public final boolean isCutAllowed() {
        return (TextRange.m10540getCollapsedimpl(getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE()) || !getEditable$foundation() || this.isPassword) ? false : true;
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final boolean isPasteAllowed() {
        return getEditable$foundation();
    }

    public final void maybeSuggestSelectionRange() {
        PlatformSelectionBehaviors platformSelectionBehaviors = this.platformSelectionBehaviors;
        if (platformSelectionBehaviors == null) {
            return;
        }
        CharSequence text = this.textFieldState.getVisualText().getText();
        long jM3484getSelectiond9O1mEE = this.textFieldState.getVisualText().m3484getSelectiond9O1mEE();
        if (text.length() <= 0 || TextRange.m10540getCollapsedimpl(jM3484getSelectiond9O1mEE)) {
            return;
        }
        aj.z(this.coroutineScope, null, ag.f51345d, new C03121(platformSelectionBehaviors, text, jM3484getSelectiond9O1mEE, this, null), 1);
    }

    public final void onPasteEvent$foundation(AnnotatedString annotatedString, boolean z) {
        if (getEditable$foundation()) {
            TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, annotatedString.getText(), false, TextFieldEditUndoBehavior.NeverMerge, false, z, 10, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (pasteAsPlainText(r12, r3) == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (pasteAsPlainText(r1, r3) == r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object paste(boolean r21, h.c.e<? super h.ab> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C03141
            if (r3 == 0) goto L19
            r3 = r2
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r3 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C03141) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.result
            h.c.a.a r4 = h.c.a.a.f48038a
            int r5 = r3.label
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L48
            if (r5 == r8) goto L43
            if (r5 == r7) goto L38
            if (r5 != r6) goto L30
            goto L43
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            boolean r1 = r3.Z$0
            java.lang.Object r5 = r3.L$0
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r5 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r5
            e.b.c.b(r2)
        L41:
            r12 = r1
            goto L68
        L43:
            e.b.c.b(r2)
            goto Lbd
        L48:
            e.b.c.b(r2)
            h.g.a.a<? extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration> r2 = r0.receiveContentConfiguration
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.invoke()
            r5 = r2
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r5 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r5
            if (r5 != 0) goto L59
            goto Lb4
        L59:
            androidx.compose.ui.platform.Clipboard r2 = r0.clipboard
            r3.L$0 = r5
            r3.Z$0 = r1
            r3.label = r7
            java.lang.Object r2 = r2.getClipEntry(r3)
            if (r2 != r4) goto L41
            goto Lbc
        L68:
            r14 = r2
            androidx.compose.ui.platform.ClipEntry r14 = (androidx.compose.ui.platform.ClipEntry) r14
            if (r14 != 0) goto L79
            r1 = 0
            r3.L$0 = r1
            r3.label = r6
            java.lang.Object r0 = r0.pasteAsPlainText(r12, r3)
            if (r0 != r4) goto Lbd
            goto Lbc
        L79:
            androidx.compose.ui.platform.ClipMetadata r15 = r14.getClipMetadata()
            androidx.compose.foundation.content.ReceiveContentListener r1 = r5.getReceiveContentListener()
            androidx.compose.foundation.content.TransferableContent$Source$Companion r2 = androidx.compose.foundation.content.TransferableContent.Source.Companion
            int r16 = r2.m2084getClipboardkB6V9T0()
            androidx.compose.foundation.content.TransferableContent r13 = new androidx.compose.foundation.content.TransferableContent
            r18 = 8
            r19 = 0
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            androidx.compose.foundation.content.TransferableContent r1 = r1.onReceive(r13)
            if (r1 == 0) goto Lbd
            androidx.compose.ui.platform.ClipEntry r1 = r1.getClipEntry()
            if (r1 == 0) goto Lbd
            java.lang.String r1 = androidx.compose.foundation.content.TransferableContent_androidKt.readPlainText(r1)
            if (r1 == 0) goto Lbd
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r0.textFieldState
            r8 = r1
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r10 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r13 = 10
            r14 = 0
            r9 = 0
            r11 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lbd
        Lb4:
            r3.label = r8
            java.lang.Object r0 = r0.pasteAsPlainText(r1, r3)
            if (r0 != r4) goto Lbd
        Lbc:
            return r4
        Lbd:
            h.ab r0 = h.ab.f48028a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.paste(boolean, h.c.e):java.lang.Object");
    }

    /* renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    public final boolean m3758placeCursorAtNearestOffsetk4lQ0M(long j2) {
        int iM10516getOffsetForPositionk4lQ0M;
        int iM10546getStartimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (iM10516getOffsetForPositionk4lQ0M = layoutResult.m10516getOffsetForPositionk4lQ0M(j2)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long jM3710mapFromTransformedjx7JFs = transformedTextFieldState.m3710mapFromTransformedjx7JFs(iM10516getOffsetForPositionk4lQ0M);
        long jM3713mapToTransformedGEjPoXI = transformedTextFieldState.m3713mapToTransformedGEjPoXI(jM3710mapFromTransformedjx7JFs);
        int iOrdinal = ((TextRange.m10540getCollapsedimpl(jM3710mapFromTransformedjx7JFs) && TextRange.m10540getCollapsedimpl(jM3713mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m10540getCollapsedimpl(jM3710mapFromTransformedjx7JFs) || TextRange.m10540getCollapsedimpl(jM3713mapToTransformedGEjPoXI)) ? (!TextRange.m10540getCollapsedimpl(jM3710mapFromTransformedjx7JFs) || TextRange.m10540getCollapsedimpl(jM3713mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal();
        SelectionWedgeAffinity selectionWedgeAffinity = null;
        if (iOrdinal == 0) {
            iM10546getStartimpl = TextRange.m10546getStartimpl(jM3710mapFromTransformedjx7JFs);
        } else if (iOrdinal == 1) {
            selectionWedgeAffinity = MathUtilsKt.m3636findClosestRect9KIMszo(j2, layoutResult.getCursorRect(TextRange.m10546getStartimpl(jM3713mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m10541getEndimpl(jM3713mapToTransformedGEjPoXI))) < 0 ? new SelectionWedgeAffinity(WedgeAffinity.Start) : new SelectionWedgeAffinity(WedgeAffinity.End);
            iM10546getStartimpl = TextRange.m10546getStartimpl(jM3710mapFromTransformedjx7JFs);
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new i();
            }
            iM10546getStartimpl = TextRange.m10546getStartimpl(jM3710mapFromTransformedjx7JFs);
        } else {
            iM10546getStartimpl = MathUtilsKt.m3636findClosestRect9KIMszo(j2, layoutResult.getCursorRect(TextRange.m10546getStartimpl(jM3713mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m10541getEndimpl(jM3713mapToTransformedGEjPoXI))) < 0 ? TextRange.m10546getStartimpl(jM3710mapFromTransformedjx7JFs) : TextRange.m10541getEndimpl(jM3710mapFromTransformedjx7JFs);
        }
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        long jTextRange = TextRangeKt.TextRange(iM10546getStartimpl);
        if (TextRange.m10539equalsimpl0(jTextRange, transformedTextFieldState2.getUntransformedText().m3484getSelectiond9O1mEE()) && (selectionWedgeAffinity == null || x.n(selectionWedgeAffinity, this.textFieldState.getSelectionWedgeAffinity()))) {
            return false;
        }
        this.textFieldState.m3716selectUntransformedCharsIn5zctL8(jTextRange);
        if (selectionWedgeAffinity != null) {
            this.textFieldState.setSelectionWedgeAffinity(selectionWedgeAffinity);
        }
        return true;
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    public final Object selectionHandleGestures(PointerInputScope pointerInputScope, boolean z, e<? super ab> eVar) {
        Object objD = aj.d(new C03162(pointerInputScope, z, null), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    public final void setDirectDragGestureInitiator(InputType inputType) {
        this.directDragGestureInitiator$delegate.setValue(inputType);
    }

    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    public final void setFocused(boolean z) {
        this.isFocused = z;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setPressInteraction(PressInteraction.Press press) {
        this.pressInteraction = press;
    }

    public final void setReceiveContentConfiguration(a<? extends ReceiveContentConfiguration> aVar) {
        this.receiveContentConfiguration = aVar;
    }

    public final void setRequestAutofillAction(a<ab> aVar) {
        this.requestAutofillAction = aVar;
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTextToolbarShown$foundation(boolean z) {
        this.textToolbarShown$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startToolbarAndHandlesVisibilityObserver(h.c.e<? super h.ab> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C03171
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C03171) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L28
            goto L46
        L28:
            r6 = move-exception
            goto L59
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L28
            h.g.a.p r6 = (h.g.a.p) r6     // Catch: java.lang.Throwable -> L28
            r0.label = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = kotlinx.coroutines.aj.d(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlinx.coroutines.br r6 = (kotlinx.coroutines.br) r6     // Catch: java.lang.Throwable -> L28
            r5.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r6 = r5.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r0 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r6 == r0) goto L56
            r5.hideTextToolbar()
        L56:
            h.ab r5 = h.ab.f48028a
            return r5
        L59:
            r5.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r0 = r5.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r0 != r1) goto L65
            goto L68
        L65:
            r5.hideTextToolbar()
        L68:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.startToolbarAndHandlesVisibilityObserver(h.c.e):java.lang.Object");
    }

    public final Object textFieldSelectionGestures(PointerInputScope pointerInputScope, a<ab> aVar, e<? super ab> eVar) {
        Object objTextFieldSelectionGestures = TextFieldSelectionState_androidKt.textFieldSelectionGestures(this, pointerInputScope, new TextFieldMouseSelectionObserver(aVar), new TextFieldTextDragObserver(aVar), eVar);
        return objTextFieldSelectionGestures == h.c.a.a.f48038a ? objTextFieldSelectionGestures : ab.f48028a;
    }

    public final void update(HapticFeedback hapticFeedback, Clipboard clipboard, TextToolbarHandler textToolbarHandler, Density density, boolean z, boolean z2, boolean z3) {
        if (!z) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedback;
        this.clipboard = clipboard;
        this.textToolbarHandler = textToolbarHandler;
        this.density = density;
        this.enabled = z;
        this.readOnly = z2;
        this.isPassword = z3;
    }

    public final Object updateClipboardEntry(e<? super ab> eVar) {
        Object objUpdate = this.clipboardPasteState.update(eVar);
        return objUpdate == h.c.a.a.f48038a ? objUpdate : ab.f48028a;
    }

    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m3759updateHandleDraggingUv8p0NA(Handle handle, long j2) {
        setDraggingHandle(handle);
        m3754setRawHandleDragPositionk4lQ0M(j2);
    }

    /* renamed from: updateSelection-QkiN0lo$foundation, reason: not valid java name */
    public final long m3760updateSelectionQkiN0lo$foundation(TextFieldCharSequence textFieldCharSequence, int i2, int i3, boolean z, SelectionAdjustment selectionAdjustment, boolean z2, boolean z3, HapticFeedbackType hapticFeedbackType) {
        TextFieldSelectionState textFieldSelectionState;
        int i4;
        int i5;
        boolean z4;
        SelectionAdjustment selectionAdjustment2;
        TextRange textRange;
        HapticFeedback hapticFeedback;
        TextRange textRangeM10534boximpl = TextRange.m10534boximpl(textFieldCharSequence.m3484getSelectiond9O1mEE());
        long jM10550unboximpl = textRangeM10534boximpl.m10550unboximpl();
        if (z3 || (!z2 && TextRange.m10540getCollapsedimpl(jM10550unboximpl))) {
            textFieldSelectionState = this;
            i4 = i2;
            i5 = i3;
            z4 = z;
            selectionAdjustment2 = selectionAdjustment;
            textRange = null;
        } else {
            textFieldSelectionState = this;
            i4 = i2;
            i5 = i3;
            z4 = z;
            selectionAdjustment2 = selectionAdjustment;
            textRange = textRangeM10534boximpl;
        }
        long jM3753getTextFieldSelectionqeG_v_k = textFieldSelectionState.m3753getTextFieldSelectionqeG_v_k(i4, i5, textRange, z4, selectionAdjustment2);
        if (hapticFeedbackType != null && ((TextRange.m10544getMinimpl(jM3753getTextFieldSelectionqeG_v_k) != TextRange.m10544getMinimpl(textFieldCharSequence.m3484getSelectiond9O1mEE()) || TextRange.m10543getMaximpl(jM3753getTextFieldSelectionqeG_v_k) != TextRange.m10543getMaximpl(textFieldCharSequence.m3484getSelectiond9O1mEE())) && (hapticFeedback = this.hapticFeedBack) != null)) {
            hapticFeedback.mo9034performHapticFeedbackCdsT49E(hapticFeedbackType.m9041unboximpl());
        }
        return jM3753getTextFieldSelectionqeG_v_k;
    }

    public final void updateTextToolbarState(TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }

    /* compiled from: WazeSource */
    final class TextFieldTextDragObserver implements TextDragObserver {
        private final a<ab> requestFocus;
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        private long dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
        private Handle actingHandle = Handle.SelectionEnd;
        private boolean isLongPressSelectionOnly = true;
        private SelectionAdjustment selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();

        public TextFieldTextDragObserver(a<ab> aVar) {
            this.requestFocus = aVar;
        }

        private final void onDragStop() {
            if ((this.dragBeginPosition & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                TextFieldSelectionState.this.clearHandleDragging();
                this.dragBeginOffsetInText = -1;
                this.dragBeginPosition = Offset.Companion.m7995getUnspecifiedF1C5BW0();
                this.dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                this.selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
                this.requestFocus.invoke();
                if (this.isLongPressSelectionOnly) {
                    TextFieldSelectionState.this.maybeSuggestSelectionRange();
                }
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDrag-k-4lQ0M */
        public void mo3386onDragk4lQ0M(long j2) {
            int iIntValue;
            int iM3687getOffsetForPosition3MmeM6k;
            SelectionAdjustment none;
            TextLayoutInput layoutInput;
            AnnotatedString text;
            if (!TextFieldSelectionState.this.getEnabled() || TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult() == null || TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().length() == 0) {
                return;
            }
            long jM7985plusMKHz9U = Offset.m7985plusMKHz9U(this.dragTotalDistance, j2);
            this.dragTotalDistance = jM7985plusMKHz9U;
            long jM7985plusMKHz9U2 = Offset.m7985plusMKHz9U(this.dragBeginPosition, jM7985plusMKHz9U);
            if (this.dragBeginOffsetInText >= 0 || TextFieldSelectionState.this.getTextLayoutState$foundation().m3688isPositionOnTextk4lQ0M(jM7985plusMKHz9U2)) {
                if (ComposeFoundationFlags.isConcurrentTextFieldSelectionFixEnabled) {
                    TextLayoutResult layoutResult = TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult();
                    int length = (layoutResult == null || (layoutInput = layoutResult.getLayoutInput()) == null || (text = layoutInput.getText()) == null) ? 0 : text.length();
                    Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
                    int iIntValue2 = numValueOf.intValue();
                    if (iIntValue2 >= 0 && iIntValue2 <= length) {
                        num = numValueOf;
                    }
                    iIntValue = num != null ? num.intValue() : TextFieldSelectionState.this.getTextLayoutState$foundation().m3687getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                } else {
                    Integer numValueOf2 = Integer.valueOf(this.dragBeginOffsetInText);
                    num = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
                    iIntValue = num != null ? num.intValue() : TextFieldSelectionState.this.getTextLayoutState$foundation().m3687getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                }
                iM3687getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.getTextLayoutState$foundation().m3687getOffsetForPosition3MmeM6k(jM7985plusMKHz9U2, false);
                if (this.dragBeginOffsetInText < 0 && iIntValue == iM3687getOffsetForPosition3MmeM6k) {
                    return;
                }
                none = this.selectionAdjustmentMode;
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            } else {
                iIntValue = TextFieldSelectionState.this.getTextLayoutState$foundation().m3687getOffsetForPosition3MmeM6k(this.dragBeginPosition, false | (!((2 & 2) == 0)));
                iM3687getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.getTextLayoutState$foundation().m3687getOffsetForPosition3MmeM6k(jM7985plusMKHz9U2, false | (!((2 & 2) == 0)));
                none = iIntValue == iM3687getOffsetForPosition3MmeM6k ? SelectionAdjustment.Companion.getNone() : this.selectionAdjustmentMode;
            }
            int i2 = iIntValue;
            int i3 = iM3687getOffsetForPosition3MmeM6k;
            SelectionAdjustment selectionAdjustment = none;
            long jM3484getSelectiond9O1mEE = TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE();
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM3756updateSelectionQkiN0lo$foundation$default = TextFieldSelectionState.m3756updateSelectionQkiN0lo$foundation$default(textFieldSelectionState, textFieldSelectionState.getTextFieldState$foundation().getVisualText(), i2, i3, false, selectionAdjustment, false, false, HapticFeedbackType.m9035boximpl(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI()), 64, null);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m10540getCollapsedimpl(jM3756updateSelectionQkiN0lo$foundation$default)) {
                this.dragBeginOffsetInText = TextRange.m10546getStartimpl(jM3756updateSelectionQkiN0lo$foundation$default);
            }
            if (TextRange.m10545getReversedimpl(jM3756updateSelectionQkiN0lo$foundation$default)) {
                jM3756updateSelectionQkiN0lo$foundation$default = TextFieldSelectionStateKt.m3767reverse5zctL8(jM3756updateSelectionQkiN0lo$foundation$default);
            }
            if (!TextRange.m10539equalsimpl0(jM3756updateSelectionQkiN0lo$foundation$default, jM3484getSelectiond9O1mEE)) {
                this.actingHandle = (TextRange.m10546getStartimpl(jM3756updateSelectionQkiN0lo$foundation$default) == TextRange.m10546getStartimpl(jM3484getSelectiond9O1mEE) || TextRange.m10541getEndimpl(jM3756updateSelectionQkiN0lo$foundation$default) != TextRange.m10541getEndimpl(jM3484getSelectiond9O1mEE)) ? (TextRange.m10546getStartimpl(jM3756updateSelectionQkiN0lo$foundation$default) != TextRange.m10546getStartimpl(jM3484getSelectiond9O1mEE) || TextRange.m10541getEndimpl(jM3756updateSelectionQkiN0lo$foundation$default) == TextRange.m10541getEndimpl(jM3484getSelectiond9O1mEE)) ? ((float) (TextRange.m10546getStartimpl(jM3756updateSelectionQkiN0lo$foundation$default) + TextRange.m10541getEndimpl(jM3756updateSelectionQkiN0lo$foundation$default))) / 2.0f > ((float) (TextRange.m10546getStartimpl(jM3484getSelectiond9O1mEE) + TextRange.m10541getEndimpl(jM3484getSelectiond9O1mEE))) / 2.0f ? Handle.SelectionEnd : Handle.SelectionStart : Handle.SelectionEnd : Handle.SelectionStart;
                this.isLongPressSelectionOnly = false;
            }
            if (TextRange.m10540getCollapsedimpl(jM3484getSelectiond9O1mEE) || !TextRange.m10540getCollapsedimpl(jM3756updateSelectionQkiN0lo$foundation$default)) {
                TextFieldSelectionState.this.getTextFieldState$foundation().m3715selectCharsIn5zctL8(jM3756updateSelectionQkiN0lo$foundation$default);
            }
            TextFieldSelectionState.this.m3759updateHandleDraggingUv8p0NA(this.actingHandle, jM7985plusMKHz9U2);
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onStart-3MmeM6k */
        public void mo3387onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
            if (TextFieldSelectionState.this.getEnabled()) {
                TextFieldSelectionState.this.m3759updateHandleDraggingUv8p0NA(this.actingHandle, j2);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Touch);
                this.dragBeginPosition = j2;
                this.dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                this.isLongPressSelectionOnly = true;
                this.selectionAdjustmentMode = selectionAdjustment;
                if (TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult() != null) {
                    boolean zM3688isPositionOnTextk4lQ0M = TextFieldSelectionState.this.getTextLayoutState$foundation().m3688isPositionOnTextk4lQ0M(j2);
                    TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                    if (zM3688isPositionOnTextk4lQ0M) {
                        if (textFieldSelectionState.getTextFieldState$foundation().getVisualText().length() != 0) {
                            int iM3687getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.getTextLayoutState$foundation().m3687getOffsetForPosition3MmeM6k(j2, false | (!((2 & 2) == 0)));
                            TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                            long jM3756updateSelectionQkiN0lo$foundation$default = TextFieldSelectionState.m3756updateSelectionQkiN0lo$foundation$default(textFieldSelectionState2, new TextFieldCharSequence(textFieldSelectionState2.getTextFieldState$foundation().getVisualText(), TextRange.Companion.m10551getZerod9O1mEE(), null, null, null, null, null, 124, null), iM3687getOffsetForPosition3MmeM6k, iM3687getOffsetForPosition3MmeM6k, false, this.selectionAdjustmentMode, false, false, HapticFeedbackType.m9035boximpl(HapticFeedbackType.Companion.m9047getLongPress5zf0vsI()), 96, null);
                            TextFieldSelectionState.this.getTextFieldState$foundation().m3715selectCharsIn5zctL8(jM3756updateSelectionQkiN0lo$foundation$default);
                            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                            this.dragBeginOffsetInText = TextRange.m10546getStartimpl(jM3756updateSelectionQkiN0lo$foundation$default);
                            return;
                        }
                        return;
                    }
                    int iM3687getOffsetForPosition3MmeM6k2 = textFieldSelectionState.getTextLayoutState$foundation().m3687getOffsetForPosition3MmeM6k(j2, false | (!((2 & 2) == 0)));
                    HapticFeedback hapticFeedBack = TextFieldSelectionState.this.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9047getLongPress5zf0vsI());
                    }
                    TextFieldSelectionState.this.getTextFieldState$foundation().placeCursorBeforeCharAt(iM3687getOffsetForPosition3MmeM6k2);
                    TextFieldSelectionState.this.setShowCursorHandle(true);
                    this.isLongPressSelectionOnly = false;
                    TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Cursor);
                }
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onUp() {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDown-k-4lQ0M */
        public void mo3385onDownk4lQ0M(long j2) {
        }
    }
}
