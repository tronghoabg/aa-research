package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.b.a.f;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.a.t;
import h.g.b.ap;
import h.g.b.aq;
import h.g.b.u;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionManager {
    public static final int $stable = 8;
    private LayoutCoordinates containerLayoutCoordinates;
    private af coroutineScope;
    private HapticFeedback hapticFeedBack;
    private boolean isLongPressOrClickSelection;
    private l<? super AnnotatedString, ab> onCopyHandler;
    private PlatformSelectionBehaviors platformSelectionBehaviors;
    private Offset previousPosition;
    private SelectionLayout previousSelectionLayout;
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean shouldIgnoreCopyKeyEvent;
    private boolean showToolbar;
    private TextToolbar textToolbar;
    private final MutableState<Selection> _selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState<Boolean> _isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private l<? super Selection, ab> onSelectionChange = new l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda5
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SelectionManager.onSelectionChange$lambda$0(this.f$0, (Selection) obj);
        }
    };
    private ToolbarRequester toolbarRequester = new ToolbarRequesterImpl();
    private FocusRequester focusRequester = new FocusRequester();
    private final MutableState hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final State derivedContentRect$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda6
        @Override // h.g.a.a
        public final Object invoke() {
            return this.f$0.getContentRect();
        }
    });
    private final MutableState positionChangeState$delegate = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
    private final MutableState dragBeginPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0()), null, 2, null);
    private final MutableState dragTotalDistance$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0()), null, 2, null);
    private final MutableState startHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState endHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ aq<TextRange> $selectionInSelectable;
        final /* synthetic */ ap $targetSelectableId;
        final /* synthetic */ aq<CharSequence> $textInSelectable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(aq<CharSequence> aqVar, aq<TextRange> aqVar2, ap apVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$textInSelectable = aqVar;
            this.$selectionInSelectable = aqVar2;
            this.$targetSelectableId = apVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return SelectionManager.this.new AnonymousClass2(this.$textInSelectable, this.$selectionInSelectable, this.$targetSelectableId, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            TextRange textRange;
            Selectable selectable;
            TextLayoutResult textLayoutResult;
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                PlatformSelectionBehaviors platformSelectionBehaviors$foundation = SelectionManager.this.getPlatformSelectionBehaviors$foundation();
                if (platformSelectionBehaviors$foundation == null) {
                    textRange = null;
                    if (textRange != null && !x.n(textRange, this.$selectionInSelectable.f48105a) && (selectable = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation().get(this.$targetSelectableId.f48104a)) != null) {
                        if (selectable.getText() == this.$textInSelectable.f48105a && (textLayoutResult = selectable.textLayoutResult()) != null) {
                            Selection selection = new Selection(new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m10546getStartimpl(textRange.m10550unboximpl())), TextRange.m10546getStartimpl(textRange.m10550unboximpl()), this.$targetSelectableId.f48104a), new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m10541getEndimpl(textRange.m10550unboximpl())), TextRange.m10541getEndimpl(textRange.m10550unboximpl()), this.$targetSelectableId.f48104a), false, 4, null);
                            SelectionManager.this.selectionRegistrar.setSubselections(LongObjectMapKt.mutableLongObjectMapOf(this.$targetSelectableId.f48104a, selection));
                            SelectionManager.this.getOnSelectionChange().invoke(selection);
                            SelectionManager.this.setPreviousSelectionLayout$foundation(null);
                        }
                    }
                    return ab.f48028a;
                }
                this.label = 1;
                obj = platformSelectionBehaviors$foundation.mo3853suggestSelectionForLongPressOrDoubleClickpYaCww((CharSequence) this.$textInSelectable.f48105a, ((TextRange) this.$selectionInSelectable.f48105a).m10550unboximpl(), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            textRange = (TextRange) obj;
            if (textRange != null) {
                if (selectable.getText() == this.$textInSelectable.f48105a) {
                    Selection selection2 = new Selection(new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m10546getStartimpl(textRange.m10550unboximpl())), TextRange.m10546getStartimpl(textRange.m10550unboximpl()), this.$targetSelectableId.f48104a), new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m10541getEndimpl(textRange.m10550unboximpl())), TextRange.m10541getEndimpl(textRange.m10550unboximpl()), this.$targetSelectableId.f48104a), false, 4, null);
                    SelectionManager.this.selectionRegistrar.setSubselections(LongObjectMapKt.mutableLongObjectMapOf(this.$targetSelectableId.f48104a, selection2));
                    SelectionManager.this.getOnSelectionChange().invoke(selection2);
                    SelectionManager.this.setPreviousSelectionLayout$foundation(null);
                }
            }
            return ab.f48028a;
        }
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation(new l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionManager._init_$lambda$0(this.f$0, ((Long) obj).longValue());
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation(new r() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda8
            @Override // h.g.a.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SelectionManager._init_$lambda$1(this.f$0, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (SelectionAdjustment) obj4);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation(new p() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda9
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return SelectionManager._init_$lambda$2(this.f$0, ((Boolean) obj).booleanValue(), ((Long) obj2).longValue());
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation(new t() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda10
            @Override // h.g.a.t
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return Boolean.valueOf(SelectionManager._init_$lambda$3(this.f$0, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (Offset) obj4, ((Boolean) obj5).booleanValue(), (SelectionAdjustment) obj6));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation(new a() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda11
            @Override // h.g.a.a
            public final Object invoke() {
                return SelectionManager._init_$lambda$4(this.f$0);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation(new l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda12
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionManager._init_$lambda$5(this.f$0, ((Long) obj).longValue());
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation(new l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda13
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionManager._init_$lambda$6(this.f$0, ((Long) obj).longValue());
            }
        });
    }

    static final Rect _get_contextMenuAreaModifier_$lambda$0(SelectionManager selectionManager, LayoutCoordinates layoutCoordinates) {
        Rect derivedContentRect = selectionManager.getDerivedContentRect();
        if (derivedContentRect == null) {
            return null;
        }
        LayoutCoordinates layoutCoordinates2 = selectionManager.containerLayoutCoordinates;
        if (layoutCoordinates2 != null) {
            return TextContextMenuToolbarHandlerModifierKt.translateRootToDestination(derivedContentRect, layoutCoordinates2, layoutCoordinates);
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new h.e();
    }

    static final ab _get_modifier_$lambda$0(SelectionManager selectionManager) {
        selectionManager.onRelease();
        return ab.f48028a;
    }

    static final ab _get_modifier_$lambda$1(SelectionManager selectionManager, LayoutCoordinates layoutCoordinates) {
        selectionManager.setContainerLayoutCoordinates(layoutCoordinates);
        return ab.f48028a;
    }

    static final ab _get_modifier_$lambda$2(SelectionManager selectionManager, FocusState focusState) {
        if (!focusState.getHasFocus() && selectionManager.getHasFocus()) {
            selectionManager.onRelease();
        }
        selectionManager.setHasFocus(focusState.getHasFocus());
        return ab.f48028a;
    }

    static final ab _get_modifier_$lambda$3(SelectionManager selectionManager, boolean z) {
        selectionManager.setInTouchMode(z);
        return ab.f48028a;
    }

    static final ab _init_$lambda$0(SelectionManager selectionManager, long j2) {
        if (selectionManager.selectionRegistrar.getSubselections().containsKey(j2)) {
            selectionManager.setPositionChangeState(ab.f48028a);
            selectionManager.updateHandleOffsets();
            selectionManager.updateSelectionToolbar();
        }
        return ab.f48028a;
    }

    static final ab _init_$lambda$1(SelectionManager selectionManager, boolean z, LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
        long jMo9743getSizeYbymL2g = layoutCoordinates.mo9743getSizeYbymL2g();
        Rect rect = new Rect(0.0f, 0.0f, (int) (jMo9743getSizeYbymL2g >> 32), (int) (jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        long jM3879convertToContainerCoordinatesR5De75A = selectionManager.m3879convertToContainerCoordinatesR5De75A(layoutCoordinates, SelectionManagerKt.m3898containsInclusiveUv8p0NA(rect, offset.m7990unboximpl()) ? offset.m7990unboximpl() : TextLayoutStateKt.m3691coerceIn3MmeM6k(offset.m7990unboximpl(), rect));
        if ((9223372034707292159L & jM3879convertToContainerCoordinatesR5De75A) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            selectionManager.setInTouchMode(z);
            selectionManager.m3886startSelection9KIMszo(jM3879convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
            FocusRequester.m7885requestFocus3ESFkO8$default(selectionManager.focusRequester, 0, 1, null);
            selectionManager.setShowToolbar$foundation(false);
            selectionManager.isLongPressOrClickSelection = true;
        }
        return ab.f48028a;
    }

    static final ab _init_$lambda$2(SelectionManager selectionManager, boolean z, long j2) {
        k<Selection, LongObjectMap<Selection>> kVarSelectAllInSelectable$foundation = selectionManager.selectAllInSelectable$foundation(j2, selectionManager.getSelection());
        Selection selection = (Selection) kVarSelectAllInSelectable$foundation.a();
        LongObjectMap<Selection> longObjectMap = (LongObjectMap) kVarSelectAllInSelectable$foundation.b();
        if (!x.n(selection, selectionManager.getSelection())) {
            selectionManager.selectionRegistrar.setSubselections(longObjectMap);
            selectionManager.onSelectionChange.invoke(selection);
        }
        selectionManager.setInTouchMode(z);
        FocusRequester.m7885requestFocus3ESFkO8$default(selectionManager.focusRequester, 0, 1, null);
        selectionManager.setShowToolbar$foundation(false);
        return ab.f48028a;
    }

    static final boolean _init_$lambda$3(SelectionManager selectionManager, boolean z, LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, boolean z2, SelectionAdjustment selectionAdjustment) {
        long jM3879convertToContainerCoordinatesR5De75A = selectionManager.m3879convertToContainerCoordinatesR5De75A(layoutCoordinates, offset.m7990unboximpl());
        long jM3879convertToContainerCoordinatesR5De75A2 = selectionManager.m3879convertToContainerCoordinatesR5De75A(layoutCoordinates, offset2.m7990unboximpl());
        selectionManager.setInTouchMode(z);
        return selectionManager.m3894updateSelectionqNKwrvQ$foundation(Offset.m7969boximpl(jM3879convertToContainerCoordinatesR5De75A), jM3879convertToContainerCoordinatesR5De75A2, z2, selectionAdjustment);
    }

    static final ab _init_$lambda$4(SelectionManager selectionManager) {
        selectionManager.setShowToolbar$foundation(true);
        selectionManager.setDraggingHandle(null);
        selectionManager.m3881setCurrentDragPosition_kEHs6E(null);
        if (selectionManager.isLongPressOrClickSelection && selectionManager.isNonEmptySelection$foundation()) {
            selectionManager.suggestSelectionForLongPressOrDoubleClick();
        }
        selectionManager.isLongPressOrClickSelection = false;
        return ab.f48028a;
    }

    static final ab _init_$lambda$5(SelectionManager selectionManager, long j2) {
        if (selectionManager.selectionRegistrar.getSubselections().containsKey(j2)) {
            selectionManager.onRelease();
            selectionManager.setSelection(null);
        }
        return ab.f48028a;
    }

    static final ab _init_$lambda$6(SelectionManager selectionManager, long j2) {
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = selectionManager.getSelection();
        if (selection != null && (start = selection.getStart()) != null && j2 == start.getSelectableId()) {
            selectionManager.m3885setStartHandlePosition_kEHs6E(null);
        }
        Selection selection2 = selectionManager.getSelection();
        if (selection2 != null && (end = selection2.getEnd()) != null && j2 == end.getSelectableId()) {
            selectionManager.m3884setEndHandlePosition_kEHs6E(null);
        }
        if (selectionManager.selectionRegistrar.getSubselections().containsKey(j2)) {
            selectionManager.updateSelectionToolbar();
        }
        return ab.f48028a;
    }

    static final ab _set_onSelectionChange_$lambda$0(SelectionManager selectionManager, l lVar, Selection selection) {
        selectionManager.setSelection(selection);
        lVar.invoke(selection);
        return ab.f48028a;
    }

    private final Modifier addContextMenuComponents(Modifier modifier) {
        return ComposeFoundationFlags.isNewContextMenuEnabled ? SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents(modifier, this) : modifier;
    }

    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    private final long m3879convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long j2) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        return (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) ? Offset.Companion.m7995getUnspecifiedF1C5BW0() : requireContainerCoordinates$foundation().mo9744localPositionOfR5De75A(layoutCoordinates, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        getPositionChangeState();
        if (getSelection() != null && (layoutCoordinates = this.containerLayoutCoordinates) != null && layoutCoordinates.isAttached()) {
            List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
            ArrayList arrayList = new ArrayList(listSort.size());
            int size = listSort.size();
            for (int i2 = 0; i2 < size; i2++) {
                Selectable selectable = listSort.get(i2);
                Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
                k kVar = selection != null ? new k(selectable, selection) : null;
                if (kVar != null) {
                    arrayList.add(kVar);
                }
            }
            List listFirstAndLast = SelectionManagerKt.firstAndLast(arrayList);
            if (!listFirstAndLast.isEmpty()) {
                Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(listFirstAndLast, layoutCoordinates);
                if (!x.n(selectedRegionRect, SelectionManagerKt.invertedInfiniteRect)) {
                    Rect rectIntersect = SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
                    if (rectIntersect.getRight() - rectIntersect.getLeft() >= 0.0f && rectIntersect.getBottom() - rectIntersect.getTop() >= 0.0f) {
                        Rect rectM8017translatek4lQ0M = rectIntersect.m8017translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
                        return Rect.copy$default(rectM8017translatek4lQ0M, 0.0f, 0.0f, 0.0f, rectM8017translatek4lQ0M.getBottom() + (SelectionHandlesKt.getHandleHeight() * 4.0f), 7, null);
                    }
                }
            }
        }
        return null;
    }

    private final Rect getDerivedContentRect() {
        return (Rect) this.derivedContentRect$delegate.getValue();
    }

    private final ab getPositionChangeState() {
        this.positionChangeState$delegate.getValue();
        return ab.f48028a;
    }

    /* renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final SelectionLayout m3880getSelectionLayoutWko1d7g(long j2, long j3, boolean z) {
        SelectionRegistrarImpl selectionRegistrarImpl = this.selectionRegistrar;
        LayoutCoordinates layoutCoordinatesRequireContainerCoordinates$foundation = requireContainerCoordinates$foundation();
        List<Selectable> listSort = selectionRegistrarImpl.sort(layoutCoordinatesRequireContainerCoordinates$foundation);
        final MutableLongIntMap mutableLongIntMapMutableLongIntMapOf = LongIntMapKt.mutableLongIntMapOf();
        List<Selectable> list = listSort;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mutableLongIntMapMutableLongIntMapOf.set(listSort.get(i2).getSelectableId(), i2);
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(j2, j3, layoutCoordinatesRequireContainerCoordinates$foundation, z, (j3 & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? null : getSelection(), new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return h.b.a.a(Integer.valueOf(mutableLongIntMapMutableLongIntMapOf.get(((Number) t).longValue())), Integer.valueOf(mutableLongIntMapMutableLongIntMapOf.get(((Number) t2).longValue())));
            }
        }, null);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            listSort.get(i3).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final boolean getShouldShowMagnifier() {
        return isDraggingInProgress() && isInTouchMode() && !isTriviallyCollapsedSelection$foundation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDraggingInProgress() {
        return getDraggingHandle() != null;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, final a<ab> aVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, ab.f48028a, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name and collision with other inner class name */
            final class C00551 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
                final /* synthetic */ a<ab> $block;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SelectionManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00551(SelectionManager selectionManager, a<ab> aVar, e<? super C00551> eVar) {
                    super(2, eVar);
                    this.this$0 = selectionManager;
                    this.$block = aVar;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    C00551 c00551 = new C00551(this.this$0, this.$block, eVar);
                    c00551.L$0 = obj;
                    return c00551;
                }

                @Override // h.g.a.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                    return ((C00551) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
                
                    if (r11 != r0) goto L15;
                 */
                @Override // h.c.b.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        h.c.a.a r0 = h.c.a.a.f48038a
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L20
                        if (r1 == r3) goto L18
                        if (r1 != r2) goto L10
                        e.b.c.b(r11)
                        goto L4c
                    L10:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L18:
                        java.lang.Object r1 = r10.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        e.b.c.b(r11)
                        goto L3a
                    L20:
                        e.b.c.b(r11)
                        java.lang.Object r11 = r10.L$0
                        r4 = r11
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                        r7 = r10
                        h.c.e r7 = (h.c.e) r7
                        r10.L$0 = r4
                        r10.label = r3
                        r8 = 2
                        r9 = 0
                        r5 = 0
                        r6 = 0
                        java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown$default(r4, r5, r6, r7, r8, r9)
                        if (r11 == r0) goto L64
                        r1 = r4
                    L3a:
                        androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                        androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r4 = r10
                        h.c.e r4 = (h.c.e) r4
                        r5 = 0
                        r10.L$0 = r5
                        r10.label = r2
                        java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(r1, r11, r3, r4)
                        if (r11 == r0) goto L64
                    L4c:
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        if (r11 != 0) goto L61
                        androidx.compose.foundation.text.selection.SelectionManager r11 = r10.this$0
                        boolean r11 = androidx.compose.foundation.text.selection.SelectionManager.access$isDraggingInProgress(r11)
                        if (r11 != 0) goto L61
                        h.g.a.a<h.ab> r10 = r10.$block
                        r10.invoke()
                    L61:
                        h.ab r10 = h.ab.f48028a
                        return r10
                    L64:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.C03231.C00551.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C00551(SelectionManager.this, aVar, null), eVar);
                return objAwaitEachGesture == h.c.a.a.f48038a ? objAwaitEachGesture : ab.f48028a;
            }
        });
    }

    static final ab onSelectionChange$lambda$0(SelectionManager selectionManager, Selection selection) {
        selectionManager.setSelection(selection);
        return ab.f48028a;
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection selection) {
        HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(selection));
        this.onSelectionChange.invoke(selection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m3881setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m3882setDragBeginPositionk4lQ0M(long j2) {
        this.dragBeginPosition$delegate.setValue(Offset.m7969boximpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m3883setDragTotalDistancek4lQ0M(long j2) {
        this.dragTotalDistance$delegate.setValue(Offset.m7969boximpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m3884setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    private final void setPositionChangeState(ab abVar) {
        this.positionChangeState$delegate.setValue(abVar);
    }

    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m3885setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    private final void m3886startSelection9KIMszo(long j2, boolean z, SelectionAdjustment selectionAdjustment) {
        this.previousSelectionLayout = null;
        m3893updateSelectionjyLRC_s$foundation(j2, Offset.Companion.m7995getUnspecifiedF1C5BW0(), z, selectionAdjustment);
    }

    private final void suggestSelectionForLongPressOrDoubleClick() {
        int iNextIndex;
        af afVar;
        aq aqVar = new aq();
        aq aqVar2 = new aq();
        ap apVar = new ap();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = listSort.listIterator(listSort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            Selection selection = this.selectionRegistrar.getSubselections().get(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = listSort.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Selectable selectable = listSort.get(i2);
                Selection selection2 = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
                if (selection2 != null) {
                    AnnotatedString text = selectable.getText();
                    long jTextRange = TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                    long selectableId = selectable.getSelectableId();
                    if (i2 >= iNextIndex) {
                        aqVar.f48105a = text;
                        aqVar2.f48105a = TextRange.m10534boximpl(jTextRange);
                        apVar.f48104a = selectableId;
                    }
                } else {
                    i2++;
                }
            }
        }
        Object obj = aqVar.f48105a;
        if (obj == null || aqVar2.f48105a == null || apVar.f48104a == 0 || ((CharSequence) obj).length() <= 0 || (afVar = this.coroutineScope) == null) {
            return;
        }
        aj.z(afVar, null, null, new AnonymousClass2(aqVar, aqVar2, apVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation();
        onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateHandleOffsets() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.text.selection.Selection r1 = r0.getSelection()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r0.containerLayoutCoordinates
            r3 = 0
            if (r1 == 0) goto L16
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r4 = r1.getStart()
            if (r4 == 0) goto L16
            androidx.compose.foundation.text.selection.Selectable r4 = r0.getAnchorSelectable$foundation(r4)
            goto L17
        L16:
            r4 = r3
        L17:
            if (r1 == 0) goto L24
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r5 = r1.getEnd()
            if (r5 == 0) goto L24
            androidx.compose.foundation.text.selection.Selectable r5 = r0.getAnchorSelectable$foundation(r5)
            goto L25
        L24:
            r5 = r3
        L25:
            if (r4 == 0) goto L2c
            androidx.compose.ui.layout.LayoutCoordinates r6 = r4.getLayoutCoordinates()
            goto L2d
        L2c:
            r6 = r3
        L2d:
            if (r5 == 0) goto L34
            androidx.compose.ui.layout.LayoutCoordinates r7 = r5.getLayoutCoordinates()
            goto L35
        L34:
            r7 = r3
        L35:
            if (r1 == 0) goto Laa
            if (r2 == 0) goto Laa
            boolean r8 = r2.isAttached()
            if (r8 == 0) goto Laa
            if (r6 != 0) goto L43
            if (r7 == 0) goto Laa
        L43:
            androidx.compose.ui.geometry.Rect r8 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r2)
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L79
            r13 = 1
            long r13 = r4.mo3845getHandlePositiondBAh8RU(r1, r13)
            long r15 = r13 & r11
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L5f
            goto L79
        L5f:
            long r13 = r2.mo9744localPositionOfR5De75A(r6, r13)
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.m7969boximpl(r13)
            long r13 = r4.m7990unboximpl()
            androidx.compose.foundation.text.Handle r6 = r0.getDraggingHandle()
            androidx.compose.foundation.text.Handle r15 = androidx.compose.foundation.text.Handle.SelectionStart
            if (r6 == r15) goto L7a
            boolean r6 = androidx.compose.foundation.text.selection.SelectionManagerKt.m3898containsInclusiveUv8p0NA(r8, r13)
            if (r6 != 0) goto L7a
        L79:
            r4 = r3
        L7a:
            r0.m3885setStartHandlePosition_kEHs6E(r4)
            if (r7 == 0) goto La6
            r4 = 0
            long r4 = r5.mo3845getHandlePositiondBAh8RU(r1, r4)
            long r11 = r11 & r4
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L8a
            goto La6
        L8a:
            long r1 = r2.mo9744localPositionOfR5De75A(r7, r4)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m7969boximpl(r1)
            long r4 = r1.m7990unboximpl()
            androidx.compose.foundation.text.Handle r2 = r0.getDraggingHandle()
            androidx.compose.foundation.text.Handle r6 = androidx.compose.foundation.text.Handle.SelectionEnd
            if (r2 == r6) goto La5
            boolean r2 = androidx.compose.foundation.text.selection.SelectionManagerKt.m3898containsInclusiveUv8p0NA(r8, r4)
            if (r2 != 0) goto La5
            goto La6
        La5:
            r3 = r1
        La6:
            r0.m3884setEndHandlePosition_kEHs6E(r3)
            return
        Laa:
            r0.m3885setStartHandlePosition_kEHs6E(r3)
            r0.m3884setEndHandlePosition_kEHs6E(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.updateHandleOffsets():void");
    }

    private final void updateSelectionTextToolbar() {
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar == null) {
            return;
        }
        if (!this.showToolbar || !isInTouchMode()) {
            if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
                textToolbar.hide();
            }
        } else {
            Rect contentRect = getContentRect();
            if (contentRect != null) {
                TextToolbar.CC.showMenu$default(textToolbar, contentRect, canCopy$foundation() ? new C03241(this) : null, null, null, isEntireContainerSelected$foundation() ? null : new C03252(this), null, 12, null);
            }
        }
    }

    private final void updateSelectionToolbar() {
        if (getHasFocus()) {
            if (!ComposeFoundationFlags.isNewContextMenuEnabled) {
                updateSelectionTextToolbar();
                return;
            }
            if (!this.showToolbar || !isInTouchMode()) {
                this.toolbarRequester.hide();
            } else if (getDerivedContentRect() != null) {
                this.toolbarRequester.show();
            }
        }
    }

    public final boolean canCopy$foundation() {
        return this.onCopyHandler != null && isNonEmptySelection$foundation();
    }

    public final void copy$foundation() {
        l<? super AnnotatedString, ab> lVar;
        AnnotatedString selectedText$foundation = getSelectedText$foundation();
        if (selectedText$foundation != null) {
            if (selectedText$foundation.length() <= 0) {
                selectedText$foundation = null;
            }
            if (selectedText$foundation == null || (lVar = this.onCopyHandler) == null) {
                return;
            }
            lVar.invoke(selectedText$foundation);
        }
    }

    public final void forEachSelectableWithSelection$foundation(r<? super Long, ? super AnnotatedString, ? super TextRange, ? super Boolean, Boolean> rVar) {
        int iNextIndex;
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = listSort.listIterator(listSort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            Selection selection = this.selectionRegistrar.getSubselections().get(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return;
        }
        int size = listSort.size();
        int i2 = 0;
        while (i2 < size) {
            Selectable selectable = listSort.get(i2);
            Selection selection2 = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            if (selection2 != null) {
                if (!rVar.invoke(Long.valueOf(selectable.getSelectableId()), selectable.getText(), TextRange.m10534boximpl(TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset())), Boolean.valueOf(i2 >= iNextIndex)).booleanValue()) {
                    return;
                }
            }
            i2++;
        }
    }

    public final Selectable getAnchorSelectable$foundation(Selection.AnchorInfo anchorInfo) {
        return this.selectionRegistrar.getSelectableMap$foundation().get(anchorInfo.getSelectableId());
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final Modifier getContextMenuAreaModifier() {
        return TextContextMenuToolbarHandlerModifierKt.textContextMenuToolbarHandler$default(TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(Modifier.Companion, new SelectionManager$contextMenuAreaModifier$1(this, null)), this.toolbarRequester, new SelectionManager$contextMenuAreaModifier$2(this, null), null, new l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionManager._get_contextMenuAreaModifier_$lambda$0(this.f$0, (LayoutCoordinates) obj);
            }
        }, 4, null);
    }

    public final k<AnnotatedString, TextRange> getContextTextAndSelection$foundation() {
        int iNextIndex;
        int iM10544getMinimpl;
        int length;
        if (getSelection() != null && !this.selectionRegistrar.getSelectables$foundation().isEmpty()) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
            ListIterator<Selectable> listIterator = listSort.listIterator(listSort.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                Selection selection = this.selectionRegistrar.getSubselections().get(listIterator.previous().getSelectableId());
                if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex != -1) {
                int size = listSort.size();
                iM10544getMinimpl = -1;
                length = -1;
                for (int i2 = 0; i2 < size; i2++) {
                    Selectable selectable = listSort.get(i2);
                    Selection selection2 = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
                    if (selection2 != null) {
                        AnnotatedString text = selectable.getText();
                        long jTextRange = TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                        selectable.getSelectableId();
                        if (iM10544getMinimpl == -1) {
                            iM10544getMinimpl = TextRange.m10544getMinimpl(jTextRange);
                            builder.append(text, 0, TextRange.m10544getMinimpl(jTextRange));
                        }
                        builder.append(text, TextRange.m10544getMinimpl(jTextRange), TextRange.m10543getMaximpl(jTextRange));
                        if (i2 < iNextIndex) {
                            builder.append('\n');
                        } else {
                            length = builder.getLength();
                            builder.append(text, TextRange.m10543getMaximpl(jTextRange), text.length());
                        }
                    }
                }
            } else {
                iM10544getMinimpl = -1;
                length = -1;
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (iM10544getMinimpl != -1 && length != -1) {
                return new k<>(annotatedString, TextRange.m10534boximpl(TextRangeKt.TextRange(iM10544getMinimpl, length)));
            }
        }
        return null;
    }

    public final af getCoroutineScope$foundation() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m3887getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation, reason: not valid java name */
    public final long m3888getDragBeginPositionF1C5BW0$foundation() {
        return ((Offset) this.dragBeginPosition$delegate.getValue()).m7990unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation, reason: not valid java name */
    public final long m3889getDragTotalDistanceF1C5BW0$foundation() {
        return ((Offset) this.dragTotalDistance$delegate.getValue()).m7990unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final float getEndHandleLineHeight() {
        Selectable anchorSelectable$foundation;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation = getAnchorSelectable$foundation(selection.getEnd())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation.getLineHeight(selection.getEnd().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m3890getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final Modifier getModifier() {
        return addContextMenuComponents(KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusModifierKt.focusTarget(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(Modifier.Companion, new a() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SelectionManager._get_modifier_$lambda$0(this.f$0);
            }
        }), new l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionManager._get_modifier_$lambda$1(this.f$0, (LayoutCoordinates) obj);
            }
        }), this.focusRequester), new l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionManager._get_modifier_$lambda$2(this.f$0, (FocusState) obj);
            }
        })), new l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionManager._get_modifier_$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        }), new l<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m3896invokeZmokQxo(keyEvent.m9424unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m3896invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z = false;
                if (!this.this$0.getShouldIgnoreCopyKeyEvent$foundation() && SelectionManager_androidKt.m3902isCopyKeyEventZmokQxo(keyEvent)) {
                    this.this$0.copy$foundation();
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).then(getShouldShowMagnifier() ? SelectionManager_androidKt.selectionMagnifier(Modifier.Companion, this) : Modifier.Companion));
    }

    public final l<AnnotatedString, ab> getOnCopyHandler() {
        return this.onCopyHandler;
    }

    public final l<Selection, ab> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final PlatformSelectionBehaviors getPlatformSelectionBehaviors$foundation() {
        return this.platformSelectionBehaviors;
    }

    public final SelectionLayout getPreviousSelectionLayout$foundation() {
        return this.previousSelectionLayout;
    }

    public final AnnotatedString getSelectedText$foundation() {
        int iNextIndex;
        if (getSelection() == null || this.selectionRegistrar.getSubselections().isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = listSort.listIterator(listSort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            Selection selection = this.selectionRegistrar.getSubselections().get(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = listSort.size();
            for (int i2 = 0; i2 < size; i2++) {
                Selectable selectable = listSort.get(i2);
                Selection selection2 = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
                if (selection2 != null) {
                    AnnotatedString text = selectable.getText();
                    long jTextRange = TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                    selectable.getSelectableId();
                    builder.append(text, TextRange.m10544getMinimpl(jTextRange), TextRange.m10543getMaximpl(jTextRange));
                    if (i2 < iNextIndex) {
                        builder.append('\n');
                    }
                }
            }
        }
        return builder.toAnnotatedString();
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final boolean getShouldIgnoreCopyKeyEvent$foundation() {
        return this.shouldIgnoreCopyKeyEvent;
    }

    public final boolean getShowToolbar$foundation() {
        return this.showToolbar;
    }

    public final float getStartHandleLineHeight() {
        Selectable anchorSelectable$foundation;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation = getAnchorSelectable$foundation(selection.getStart())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation.getLineHeight(selection.getStart().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m3891getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final ToolbarRequester getToolbarRequester$foundation() {
        return this.toolbarRequester;
    }

    public final TextDragObserver handleDragObserver(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager.handleDragObserver.1
            private final void done() {
                this.setShowToolbar$foundation(true);
                this.setDraggingHandle(null);
                this.m3881setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo3385onDownk4lQ0M(long j2) {
                Selection selection;
                LayoutCoordinates layoutCoordinates;
                boolean z2 = z;
                SelectionManager selectionManager = this;
                if ((z2 ? selectionManager.m3891getStartHandlePosition_m7T9E() : selectionManager.m3890getEndHandlePosition_m7T9E()) == null || (selection = this.getSelection()) == null) {
                    return;
                }
                Selectable anchorSelectable$foundation = this.getAnchorSelectable$foundation(z ? selection.getStart() : selection.getEnd());
                if (anchorSelectable$foundation == null || (layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates()) == null) {
                    return;
                }
                long jMo3845getHandlePositiondBAh8RU = anchorSelectable$foundation.mo3845getHandlePositiondBAh8RU(selection, z);
                if ((9223372034707292159L & jMo3845getHandlePositiondBAh8RU) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                    long jM3871getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m3871getAdjustedCoordinatesk4lQ0M(jMo3845getHandlePositiondBAh8RU);
                    SelectionManager selectionManager2 = this;
                    selectionManager2.m3881setCurrentDragPosition_kEHs6E(Offset.m7969boximpl(selectionManager2.requireContainerCoordinates$foundation().mo9744localPositionOfR5De75A(layoutCoordinates, jM3871getAdjustedCoordinatesk4lQ0M)));
                    this.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                    this.setShowToolbar$foundation(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo3386onDragk4lQ0M(long j2) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager selectionManager = this;
                selectionManager.m3883setDragTotalDistancek4lQ0M(Offset.m7985plusMKHz9U(selectionManager.m3889getDragTotalDistanceF1C5BW0$foundation(), j2));
                SelectionManager selectionManager2 = this;
                long jM7985plusMKHz9U = Offset.m7985plusMKHz9U(selectionManager2.m3888getDragBeginPositionF1C5BW0$foundation(), selectionManager2.m3889getDragTotalDistanceF1C5BW0$foundation());
                SelectionManager selectionManager3 = this;
                if (selectionManager3.m3894updateSelectionqNKwrvQ$foundation(Offset.m7969boximpl(jM7985plusMKHz9U), selectionManager3.m3888getDragBeginPositionF1C5BW0$foundation(), z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    this.m3882setDragBeginPositionk4lQ0M(jM7985plusMKHz9U);
                    this.m3883setDragTotalDistancek4lQ0M(Offset.Companion.m7996getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo3387onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                Selection selection = this.getSelection();
                x.c(selection);
                Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation().get((z ? selection.getStart() : selection.getEnd()).getSelectableId());
                if (selectable == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new h.e();
                }
                Selectable selectable2 = selectable;
                LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Current selectable should have layout coordinates.");
                    throw new h.e();
                }
                long jMo3845getHandlePositiondBAh8RU = selectable2.mo3845getHandlePositiondBAh8RU(selection, z);
                if ((9223372034707292159L & jMo3845getHandlePositiondBAh8RU) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                    long jM3871getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m3871getAdjustedCoordinatesk4lQ0M(jMo3845getHandlePositiondBAh8RU);
                    SelectionManager selectionManager = this;
                    selectionManager.m3882setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation().mo9744localPositionOfR5De75A(layoutCoordinates, jM3871getAdjustedCoordinatesk4lQ0M));
                    this.m3883setDragTotalDistancek4lQ0M(Offset.Companion.m7996getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }
        };
    }

    public final boolean isEntireContainerSelected$foundation() {
        Selection selection;
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        if (listSort.isEmpty()) {
            return true;
        }
        int size = listSort.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            AnnotatedString text = selectable.getText();
            if (text.length() != 0 && ((selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId())) == null || Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final boolean isNonEmptySelection$foundation() {
        Selection selection = getSelection();
        if (selection == null || x.n(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        int size = listSort.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selection selection2 = this.selectionRegistrar.getSubselections().get(listSort.get(i2).getSelectableId());
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTriviallyCollapsedSelection$foundation() {
        Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return x.n(selection.getStart(), selection.getEnd());
    }

    public final void onRelease() {
        HapticFeedback hapticFeedback;
        this.selectionRegistrar.setSubselections(LongObjectMapKt.emptyLongObjectMap());
        setShowToolbar$foundation(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI());
        }
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null coordinates");
            throw new h.e();
        }
        if (!layoutCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("unattached coordinates");
        }
        return layoutCoordinates;
    }

    public final void selectAll$foundation() {
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        if (listSort.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        int size = listSort.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            Selection selectAllSelection = selectable.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (selection == null) {
                    selection = selectAllSelection;
                }
                mutableLongObjectMapMutableLongObjectMapOf.put(selectable.getSelectableId(), selectAllSelection);
                selection2 = selectAllSelection;
            }
        }
        if (mutableLongObjectMapMutableLongObjectMapOf.isEmpty()) {
            return;
        }
        if (selection != selection2) {
            x.c(selection);
            Selection.AnchorInfo start = selection.getStart();
            x.c(selection2);
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.setSubselections(mutableLongObjectMapMutableLongObjectMapOf);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    public final k<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation(long j2, Selection selection) {
        HapticFeedback hapticFeedback;
        MutableLongObjectMap mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        int size = listSort.size();
        Selection selectionMerge = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            Selection selectAllSelection = selectable.getSelectableId() == j2 ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                mutableLongObjectMapMutableLongObjectMapOf.set(selectable.getSelectableId(), selectAllSelection);
            }
            selectionMerge = SelectionManagerKt.merge(selectionMerge, selectAllSelection);
        }
        if (isInTouchMode() && !x.n(selectionMerge, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI());
        }
        return new k<>(selectionMerge, mutableLongObjectMapMutableLongObjectMapOf);
    }

    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m3892selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long j2) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 != null && layoutCoordinates2.isAttached()) {
            List<Selectable> selectables$foundation = this.selectionRegistrar.getSelectables$foundation();
            int size = selectables$foundation.size();
            for (int i2 = 0; i2 < size; i2++) {
                Selectable selectable = selectables$foundation.get(i2);
                Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
                if (selection != null && (layoutCoordinates = selectable.getLayoutCoordinates()) != null) {
                    long jMo9744localPositionOfR5De75A = layoutCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates2, j2);
                    TextLayoutResult textLayoutResult = selectable.textLayoutResult();
                    if (textLayoutResult != null && TextLayoutHelperKt.m3420isPositionInsideSelectionuaM50fQ(textLayoutResult, jMo9744localPositionOfR5De75A, TextRange.m10534boximpl(selection.m3865toTextRanged9O1mEE()))) {
                        return;
                    }
                }
            }
            m3886startSelection9KIMszo(j2, true, SelectionAdjustment.Companion.getWord());
        }
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset offsetM7969boximpl = layoutCoordinates != null ? Offset.m7969boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (x.n(this.previousPosition, offsetM7969boximpl)) {
            return;
        }
        this.previousPosition = offsetM7969boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    public final void setCoroutineScope$foundation(af afVar) {
        this.coroutineScope = afVar;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setInTouchMode(boolean z) {
        if (this._isInTouchMode.getValue().booleanValue() != z) {
            this._isInTouchMode.setValue(Boolean.valueOf(z));
            updateSelectionToolbar();
        }
    }

    public final void setOnCopyHandler(l<? super AnnotatedString, ab> lVar) {
        this.onCopyHandler = lVar;
    }

    public final void setOnSelectionChange(final l<? super Selection, ab> lVar) {
        this.onSelectionChange = new l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda14
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SelectionManager._set_onSelectionChange_$lambda$0(this.f$0, lVar, (Selection) obj);
            }
        };
    }

    public final void setPlatformSelectionBehaviors$foundation(PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.platformSelectionBehaviors = platformSelectionBehaviors;
    }

    public final void setPreviousSelectionLayout$foundation(SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setShouldIgnoreCopyKeyEvent$foundation(boolean z) {
        this.shouldIgnoreCopyKeyEvent = z;
    }

    public final void setShowToolbar$foundation(boolean z) {
        this.showToolbar = z;
        updateSelectionToolbar();
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setToolbarRequester$foundation(ToolbarRequester toolbarRequester) {
        this.toolbarRequester = toolbarRequester;
    }

    public final boolean shouldPerformHaptics$foundation() {
        if (isInTouchMode()) {
            List<Selectable> selectables$foundation = this.selectionRegistrar.getSelectables$foundation();
            int size = selectables$foundation.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (selectables$foundation.get(i2).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: updateSelection-jyLRC_s$foundation, reason: not valid java name */
    public final boolean m3893updateSelectionjyLRC_s$foundation(long j2, long j3, boolean z, SelectionAdjustment selectionAdjustment) {
        setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
        m3881setCurrentDragPosition_kEHs6E(Offset.m7969boximpl(j2));
        SelectionLayout selectionLayoutM3880getSelectionLayoutWko1d7g = m3880getSelectionLayoutWko1d7g(j2, j3, z);
        if (selectionLayoutM3880getSelectionLayoutWko1d7g == null || !selectionLayoutM3880getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection selectionAdjust = selectionAdjustment.adjust(selectionLayoutM3880getSelectionLayoutWko1d7g);
        if (!x.n(selectionAdjust, getSelection())) {
            selectionChanged(selectionLayoutM3880getSelectionLayoutWko1d7g, selectionAdjust);
            this.isLongPressOrClickSelection = false;
        }
        this.previousSelectionLayout = selectionLayoutM3880getSelectionLayoutWko1d7g;
        return true;
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation, reason: not valid java name */
    public final boolean m3894updateSelectionqNKwrvQ$foundation(Offset offset, long j2, boolean z, SelectionAdjustment selectionAdjustment) {
        if (offset == null) {
            return false;
        }
        return m3893updateSelectionjyLRC_s$foundation(offset.m7990unboximpl(), j2, z, selectionAdjustment);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionTextToolbar$1, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C03241 extends u implements a<ab> {
        C03241(Object obj) {
            super(0, obj, SelectionManager.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((SelectionManager) this.receiver).toolbarCopy();
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionTextToolbar$2, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C03252 extends u implements a<ab> {
        C03252(Object obj) {
            super(0, obj, SelectionManager.class, "selectAll", "selectAll$foundation()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((SelectionManager) this.receiver).selectAll$foundation();
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }

    public static /* synthetic */ void getPreviousSelectionLayout$foundation$annotations() {
    }

    public static /* synthetic */ void getToolbarRequester$foundation$annotations() {
    }
}
