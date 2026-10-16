package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.LinkRememberObserverHolder;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsSpec;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableReader;
import androidx.compose.runtime.internal.IntRef;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposerChangeListWriter {
    public static final int $stable = 8;
    private ChangeList changeList;
    private final LinkComposer composer;
    private int pendingUps;
    private boolean implicitRootStart = true;
    private final ArrayList<Object> pendingDownNodes = Stack.m7327constructorimpl$default(null, 1, null);
    private int removeFromNodeIndex = -1;
    private int moveFromNodeIndex = -1;
    private int moveToNodeIndex = -1;
    private int moveCount = -1;
    private ComposerChangeListWriterAddressMode addressMode = ComposerChangeListWriterAddressMode.AbsoluteAddressing;
    private long editorCurrentPosition = -1;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerChangeListWriterAddressMode.values().length];
            try {
                iArr[ComposerChangeListWriterAddressMode.AbsoluteAddressing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerChangeListWriterAddressMode.AnchorAddressing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposerChangeListWriterAddressMode.RelativeAddressing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ComposerChangeListWriter(LinkComposer linkComposer, ChangeList changeList) {
        this.composer = linkComposer;
        this.changeList = changeList;
    }

    private final SlotTableReader getReader() {
        return this.composer.getReader$runtime();
    }

    private final void inMode(ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode, a<ab> aVar) {
        ComposerChangeListWriterAddressMode addressMode$runtime = getAddressMode$runtime();
        long j2 = this.editorCurrentPosition;
        setAddressMode$runtime(composerChangeListWriterAddressMode);
        try {
            aVar.invoke();
        } finally {
            setAddressMode$runtime(addressMode$runtime);
            if (addressMode$runtime != ComposerChangeListWriterAddressMode.RelativeAddressing) {
                j2 = -1;
            }
            this.editorCurrentPosition = j2;
        }
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter, ChangeList changeList, IntRef intRef, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushPendingUpsAndDowns() {
        int i2 = this.pendingUps;
        if (i2 > 0) {
            this.changeList.pushUps(i2);
            this.pendingUps = 0;
        }
        if (Stack.m7333isNotEmptyimpl(this.pendingDownNodes)) {
            this.changeList.pushDowns(Stack.m7338toArrayimpl(this.pendingDownNodes));
            Stack.m7325clearimpl(this.pendingDownNodes);
        }
    }

    private final void pushSlotOperationPreamble() {
        long jHandle = getReader().handle();
        if (this.editorCurrentPosition != jHandle) {
            seekTo$default(this, jHandle, false, 2, null);
        }
    }

    private final void pushSlotOperationPreambleUnconditionally() {
        seekTo$default(this, getReader().handle(), false, 2, null);
    }

    private final void realizeMoveNode(int i2, int i3, int i4) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(i2, i3, i4);
    }

    private final void realizeNodeMovementOperations() {
        int i2 = this.moveCount;
        if (i2 > 0) {
            int i3 = this.removeFromNodeIndex;
            if (i3 >= 0) {
                realizeRemoveNode(i3, i2);
                this.removeFromNodeIndex = -1;
            } else {
                realizeMoveNode(this.moveToNodeIndex, this.moveFromNodeIndex, i2);
                this.moveToNodeIndex = -1;
                this.moveFromNodeIndex = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeRemoveNode(int i2, int i3) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(i2, i3);
    }

    public static /* synthetic */ void seekTo$default(ComposerChangeListWriter composerChangeListWriter, long j2, boolean z, int i2, Object obj) {
        composerChangeListWriter.seekTo(j2, z & ((i2 & 2) == 0));
    }

    public final void appendValue(Object obj) {
        pushSlotOperationPreamble();
        this.changeList.pushAppendValue(obj);
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        this.changeList.pushCopyNodesToNewAnchorLocation(list, intRef);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.changeList.pushCopySlotTableToAnchorLocation(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void deactivateCurrentGroup() {
        pushSlotOperationPreamble();
        this.changeList.pushDeactivateGroup();
    }

    public final void determineMovableContentNodeIndex(IntRef intRef, long j2) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(intRef, j2);
        this.editorCurrentPosition = j2;
    }

    public final void disposeResolvedMovableState(MovableContentState movableContentState) {
        if (movableContentState != null) {
            this.changeList.pushDisposeDisposeMovableContentState(movableContentState);
        }
    }

    public final void endCompositionScope(l<? super Composition, ab> lVar, Composition composition) {
        this.changeList.pushEndCompositionScope(lVar, composition);
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.pendingUps = 0;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i2, int i3) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int iFlagsOf = getReader().flagsOf(i3);
        removeNode(i2, (iFlagsOf & 8388608) == 8388608 ? 1 : iFlagsOf & GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
    }

    public final void endResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushEndResumingScope(recomposeScopeImpl);
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        this.changeList.pushClearAllRecompositionRequiredGroups();
        this.editorCurrentPosition = -1L;
    }

    public final ComposerChangeListWriterAddressMode getAddressMode$runtime() {
        return this.addressMode;
    }

    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void inAnchorMode(a<ab> aVar) {
        this.editorCurrentPosition = -1L;
        ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.AnchorAddressing;
        ComposerChangeListWriterAddressMode addressMode$runtime = getAddressMode$runtime();
        long j2 = this.editorCurrentPosition;
        setAddressMode$runtime(composerChangeListWriterAddressMode);
        try {
            aVar.invoke();
        } finally {
            setAddressMode$runtime(addressMode$runtime);
            this.editorCurrentPosition = addressMode$runtime == ComposerChangeListWriterAddressMode.RelativeAddressing ? j2 : -1L;
        }
    }

    public final void inRelativeAddressMode(long j2, a<ab> aVar) {
        this.editorCurrentPosition = j2;
        ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.RelativeAddressing;
        ComposerChangeListWriterAddressMode addressMode$runtime = getAddressMode$runtime();
        long j3 = this.editorCurrentPosition;
        setAddressMode$runtime(composerChangeListWriterAddressMode);
        try {
            aVar.invoke();
        } finally {
            setAddressMode$runtime(addressMode$runtime);
            if (addressMode$runtime != ComposerChangeListWriterAddressMode.RelativeAddressing) {
                j3 = -1;
            }
            this.editorCurrentPosition = j3;
        }
    }

    public final void includeOperationsIn(ChangeList changeList, IntRef intRef) {
        this.changeList.pushExecuteOperationsIn(changeList, intRef);
    }

    public final void insertSlots(SlotTable slotTable, long j2) {
        if (j2 == -1) {
            ComposerKt.composeImmediateRuntimeError("Tried moving from an unspecified position");
            j2 = -1;
        }
        pushPendingUpsAndDowns();
        pushSlotOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(slotTable, j2);
    }

    public final boolean isInAnchorMode() {
        return this.addressMode == ComposerChangeListWriterAddressMode.AnchorAddressing;
    }

    public final void moveDown(Object obj) {
        realizeNodeMovementOperations();
        Stack.m7337pushimpl(this.pendingDownNodes, obj);
    }

    public final void moveGroup(int i2) {
        if (i2 < 0) {
            ComposerKt.composeImmediateRuntimeError("Offset must not be negative");
        }
        pushSlotOperationPreambleUnconditionally();
        this.changeList.pushMoveGroup(i2);
        this.editorCurrentPosition = -1L;
    }

    public final void moveNode(int i2, int i3, int i4) {
        if (i4 > 0) {
            int i5 = this.moveCount;
            if (i5 > 0 && this.moveFromNodeIndex == i2 && this.moveToNodeIndex == i3) {
                this.moveCount = i5 + i4;
                return;
            }
            realizeNodeMovementOperations();
            this.moveToNodeIndex = i3;
            this.moveFromNodeIndex = i2;
            this.moveCount = i4;
        }
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (Stack.m7333isNotEmptyimpl(this.pendingDownNodes)) {
            Stack.m7336popimpl(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void releaseMovableGroup(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        this.changeList.pushReleaseMovableGroup(controlledComposition, compositionContext, movableContentStateReference);
        this.editorCurrentPosition = -1L;
    }

    public final void remember(RememberObserverHolder rememberObserverHolder) {
        pushSlotOperationPreamble();
        this.changeList.pushRemember(rememberObserverHolder);
    }

    public final void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushRememberPausingScope(recomposeScopeImpl);
    }

    public final void removeGroup() {
        pushSlotOperationPreamble();
        this.changeList.pushRemoveGroup();
    }

    public final void removeNode(int i2, int i3) {
        if (i3 > 0) {
            if (this.removeFromNodeIndex == i2) {
                this.moveCount += i3;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFromNodeIndex = i2;
            this.moveCount = i3;
        }
    }

    public final void removeTailGroupsAndValues(int i2, int i3) {
        if (i2 >= 0 || i3 > 0) {
            pushSlotOperationPreamble();
            this.changeList.pushRemoveTailGroupsAndValues(i2, i3);
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
        this.editorCurrentPosition = -1L;
    }

    public final void resetTransientState() {
        this.implicitRootStart = true;
        this.pendingUps = 0;
        Stack.m7325clearimpl(this.pendingDownNodes);
        this.removeFromNodeIndex = -1;
        this.moveFromNodeIndex = -1;
        this.moveToNodeIndex = -1;
        this.moveCount = -1;
        this.editorCurrentPosition = -1L;
    }

    public final void seekTo(long j2, boolean z) {
        ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode = this.addressMode;
        ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode2 = ComposerChangeListWriterAddressMode.AbsoluteAddressing;
        int iOrdinal = composerChangeListWriterAddressMode.ordinal();
        if (iOrdinal == 0) {
            this.changeList.pushSeekToGroupHandle(j2);
        } else if (iOrdinal == 1) {
            this.changeList.pushSeekToAnchor(getReader().getTable().getAddressSpace(), j2);
        } else {
            if (iOrdinal != 2) {
                throw new i();
            }
            int group = GroupHandleKt.getGroup(j2);
            int context = group == -1 ? GroupHandleKt.getContext(j2) : getReader().parentOf(group);
            if (context != GroupHandleKt.getGroup(this.editorCurrentPosition)) {
                ComposerKt.composeImmediateRuntimeError("Relative addressing only supports navigating to a child of the current group");
            }
            this.changeList.pushStartGroup();
            int iFirstChildOf = getReader().firstChildOf(context);
            while (iFirstChildOf != group) {
                this.changeList.pushSkipGroup();
                iFirstChildOf = getReader().nextSiblingOf(iFirstChildOf);
            }
            if (z) {
                this.addressMode = ComposerChangeListWriterAddressMode.AbsoluteAddressing;
            }
        }
        this.editorCurrentPosition = j2;
    }

    public final void setAddressMode$runtime(ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode) {
        this.addressMode = composerChangeListWriterAddressMode;
    }

    public final void setChangeList(ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void setImplicitRootStart(boolean z) {
        this.implicitRootStart = z;
    }

    public final void sideEffect(a<ab> aVar) {
        this.changeList.pushSideEffect(aVar);
    }

    public final void startComposition() {
        Stack.m7325clearimpl(this.pendingDownNodes);
        this.pendingUps = 0;
        this.removeFromNodeIndex = -1;
        this.moveFromNodeIndex = -1;
        this.moveToNodeIndex = -1;
        this.addressMode = ComposerChangeListWriterAddressMode.AbsoluteAddressing;
        this.editorCurrentPosition = -1L;
    }

    public final void startResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        this.changeList.pushStartResumingScope(recomposeScopeImpl);
    }

    public final void updateAuxData(Object obj) {
        pushSlotOperationPreamble();
        this.changeList.pushUpdateAuxData(obj);
    }

    public final <T, V> void updateNode(V v, p<? super T, ? super V, ab> pVar) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(v, pVar);
    }

    public final void updateRememberOrdering(LinkRememberObserverHolder linkRememberObserverHolder, LinkAnchor linkAnchor) {
        if (x.n(linkRememberObserverHolder.getAfter(), linkAnchor)) {
            return;
        }
        this.changeList.pushUpdateRememberObserverHolderOrdering(linkRememberObserverHolder, linkAnchor);
    }

    public final void updateValue(int i2, Object obj) {
        pushSlotOperationPreamble();
        this.changeList.pushUpdateRelativeValue(i2, obj);
    }

    public final void useNode(Object obj) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(obj);
    }

    public final void withChangeList(ChangeList changeList, a<ab> aVar) {
        ChangeList changeList2 = getChangeList();
        try {
            setChangeList(changeList);
            aVar.invoke();
        } finally {
            setChangeList(changeList2);
        }
    }

    public final void withoutImplicitRootStart(a<ab> aVar) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            aVar.invoke();
        } finally {
            setImplicitRootStart(implicitRootStart);
        }
    }

    public final void insertSlots(SlotTable slotTable, long j2, FixupList fixupList) {
        if (j2 == -1) {
            ComposerKt.composeImmediateRuntimeError("Tried moving from an unspecified position");
            j2 = -1;
        }
        pushPendingUpsAndDowns();
        pushSlotOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(slotTable, j2, fixupList);
    }
}
