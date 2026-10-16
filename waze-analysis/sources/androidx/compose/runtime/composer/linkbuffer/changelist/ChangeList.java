package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Changes;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.LinkRememberObserverHolder;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operation;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.au;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ChangeList extends Changes {
    public static final int $stable = 8;
    private final Operations operations = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    @Override // androidx.compose.runtime.Changes
    public void clear() {
        this.operations.clear();
    }

    @Override // androidx.compose.runtime.Changes
    public void execute(SlotStorage slotStorage, Applier<?> applier, RememberManager rememberManager, CompositionErrorContextImpl compositionErrorContextImpl) {
        SlotTableEditor slotTableEditorOpenEditor = SlotTableKt.asLinkBufferSlotTable(slotStorage).openEditor();
        try {
            executeAndFlushAllPendingChanges(applier, slotTableEditorOpenEditor, rememberManager, compositionErrorContextImpl);
        } finally {
            slotTableEditorOpenEditor.close();
        }
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        this.operations.executeAndFlushAllPendingOperations(applier, slotTableEditor, rememberManager, operationErrorContext);
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean hasChangesRequiringApplication() {
        return this.operations.getRequiresApplication();
    }

    @Override // androidx.compose.runtime.Changes
    public boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final void pushAppendValue(Object obj) {
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(appendValue);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, obj);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushClearAllRecompositionRequiredGroups() {
        this.operations.push(Operation.ClearAllRecompositionRequired.INSTANCE);
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        if (list.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations.WriteScope.m7554setObjectsEykTJF8(operations, 1, list, 0, intRef);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        Operation.CopySlotTableToHandleLocation copySlotTableToHandleLocation = Operation.CopySlotTableToHandleLocation.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(copySlotTableToHandleLocation);
        Operations.WriteScope.m7556setObjectsUOUgNZM(operations, 0, movableContentState, 1, compositionContext, 3, movableContentStateReference2, 2, movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(copySlotTableToHandleLocation);
    }

    public final void pushDeactivateGroup() {
        this.operations.push(Operation.DeactivateGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef intRef, long j2) {
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, intRef);
        Operations.WriteScope.m7552setLongimpl(operations, 1, 0, j2);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushDisposeDisposeMovableContentState(MovableContentState movableContentState) {
        Operation.DisposeMovableContentState disposeMovableContentState = Operation.DisposeMovableContentState.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(disposeMovableContentState);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, movableContentState);
        operations.ensureAllArgumentsPushedFor(disposeMovableContentState);
    }

    public final void pushDowns(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, objArr);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushEndCompositionScope(l<? super Composition, ab> lVar, Composition composition) {
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(endCompositionScope);
        Operations.WriteScope.m7554setObjectsEykTJF8(operations, 0, lVar, 1, composition);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEndResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(endResumingScope);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef intRef) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations.WriteScope.m7554setObjectsEykTJF8(operations, 0, changeList, 1, intRef);
            if (changeList.operations.getRequiresApplication()) {
                Operations.WriteScope.m7548requireApplicationimpl(operations);
            }
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }

    public final void pushInsertSlots(SlotTable slotTable, long j2) {
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(insertSlots);
        Operations.WriteScope.m7552setLongimpl(operations, 0, 1, j2);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, slotTable);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }

    public final void pushMoveGroup(int i2) {
        Operation.MoveGroup moveGroup = Operation.MoveGroup.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(moveGroup);
        operations.intArgs[operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()] = i2;
        operations.ensureAllArgumentsPushedFor(moveGroup);
    }

    public final void pushMoveNode(int i2, int i3, int i4) {
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(moveNode);
        int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
        int[] iArr = operations.intArgs;
        iArr[ints + 1] = i2;
        iArr[ints] = i3;
        iArr[ints + 2] = i4;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushReleaseMovableGroup(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        Operation.ReleaseMovableGroup releaseMovableGroup = Operation.ReleaseMovableGroup.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(releaseMovableGroup);
        Operations.WriteScope.m7555setObjectsGn0XI2A(operations, 0, controlledComposition, 1, compositionContext, 2, movableContentStateReference);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroup);
    }

    public final void pushRemember(RememberObserverHolder rememberObserverHolder) {
        Operation.Remember remember = Operation.Remember.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(remember);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, rememberObserverHolder);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(rememberPausingScope);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushRemoveGroup() {
        this.operations.push(Operation.RemoveGroup.INSTANCE);
    }

    public final void pushRemoveNode(int i2, int i3) {
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(removeNode);
        int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
        int[] iArr = operations.intArgs;
        iArr[ints] = i2;
        iArr[ints + 1] = i3;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushRemoveTailGroupsAndValues(int i2, int i3) {
        Operation.RemoveTailGroupsAndValues removeTailGroupsAndValues = Operation.RemoveTailGroupsAndValues.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(removeTailGroupsAndValues);
        int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
        int[] iArr = operations.intArgs;
        iArr[ints] = i2;
        iArr[ints + 1] = i3;
        operations.ensureAllArgumentsPushedFor(removeTailGroupsAndValues);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSeekToAnchor(SlotTableAddressSpace slotTableAddressSpace, long j2) {
        Operation.SeekToAnchor seekToAnchor = Operation.SeekToAnchor.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(seekToAnchor);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, LinkAnchorKt.anchorHandle(slotTableAddressSpace, j2));
        operations.ensureAllArgumentsPushedFor(seekToAnchor);
    }

    public final void pushSeekToGroupHandle(long j2) {
        Operation.SeekToGroupHandle seekToGroupHandle = Operation.SeekToGroupHandle.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(seekToGroupHandle);
        Operations.WriteScope.m7552setLongimpl(operations, 0, 1, j2);
        operations.ensureAllArgumentsPushedFor(seekToGroupHandle);
    }

    public final void pushSideEffect(a<ab> aVar) {
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, aVar);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushSkipGroup() {
        this.operations.push(Operation.SkipGroup.INSTANCE);
    }

    public final void pushStartGroup() {
        this.operations.push(Operation.StartGroup.INSTANCE);
    }

    public final void pushStartResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(startResumingScope);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, recomposeScopeImpl);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushUpdateAuxData(Object obj) {
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, obj);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final <T, V> void pushUpdateNode(V v, p<? super T, ? super V, ab> pVar) {
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(updateNode);
        x.d(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        au.h(pVar, 2);
        Operations.WriteScope.m7554setObjectsEykTJF8(operations, 0, v, 1, pVar);
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushUpdateRelativeValue(int i2, Object obj) {
        Operation.UpdateValueRelative updateValueRelative = Operation.UpdateValueRelative.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(updateValueRelative);
        operations.intArgs[operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()] = i2;
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, obj);
        operations.ensureAllArgumentsPushedFor(updateValueRelative);
    }

    public final void pushUpdateRememberObserverHolderOrdering(LinkRememberObserverHolder linkRememberObserverHolder, LinkAnchor linkAnchor) {
        Operation.UpdateRememberObserverHolderOrdering updateRememberObserverHolderOrdering = Operation.UpdateRememberObserverHolderOrdering.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(updateRememberObserverHolderOrdering);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 1, linkRememberObserverHolder);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, linkAnchor);
        operations.ensureAllArgumentsPushedFor(updateRememberObserverHolderOrdering);
    }

    public final void pushUpdateValue(int i2, Object obj) {
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(updateValue);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, obj);
        operations.intArgs[operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()] = i2;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUps(int i2) {
        Operation.Ups ups = Operation.Ups.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(ups);
        operations.intArgs[operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()] = i2;
        operations.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushUseNode(Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.composer.DebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing ");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.operations.toDebugString(str));
        }
        return sb.toString();
    }

    public final void pushInsertSlots(SlotTable slotTable, long j2, FixupList fixupList) {
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(insertSlotsWithFixups);
        Operations.WriteScope.m7552setLongimpl(operations, 0, 1, j2);
        Operations.WriteScope.m7554setObjectsEykTJF8(operations, 0, slotTable, 1, fixupList);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }
}
