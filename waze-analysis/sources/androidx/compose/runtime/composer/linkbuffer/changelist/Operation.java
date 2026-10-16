package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.LinkRememberObserverHolder;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.composer.linkbuffer.AnchorHandle;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operation;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.System_jvmKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final boolean isExternallyVisible;
    private final int objects;

    /* compiled from: WazeSource */
    public final class AppendValue extends Operation {
        public static final int $stable = 0;
        public static final AppendValue INSTANCE = new AppendValue();

        private AppendValue() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object objMo7540getObjectgvac4VY = operationArgContainer.mo7540getObjectgvac4VY(0);
            if (objMo7540getObjectgvac4VY instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) objMo7540getObjectgvac4VY);
            }
            slotTableEditor.appendSlot(objMo7540getObjectgvac4VY);
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m7496getValues5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "value" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class ApplyChangeList extends Operation {
        public static final int $stable = 0;
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, false, 1, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            IntRef intRef = (IntRef) operationArgContainer.mo7540getObjectgvac4VY(1);
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo7540getObjectgvac4VY(0);
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotTableEditor, rememberManager, operationErrorContext != null ? OperationKt.withCurrentStackTrace(operationErrorContext, slotTableEditor) : null);
        }

        /* renamed from: getChanges-s5KIjrA, reason: not valid java name */
        public final int m7497getChangess5KIjrA() {
            return 0;
        }

        /* renamed from: getEffectiveNodeIndex-s5KIjrA, reason: not valid java name */
        public final int m7498getEffectiveNodeIndexs5KIjrA() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "changes" : ObjectParameter.m7520equalsimpl0(i2, 1) ? "effectiveNodeIndex" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class ClearAllRecompositionRequired extends Operation {
        public static final int $stable = 0;
        public static final ClearAllRecompositionRequired INSTANCE = new ClearAllRecompositionRequired();

        private ClearAllRecompositionRequired() {
            super(0, 0, false, 3, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.removeAllInstancesOfFlags(67108864);
        }
    }

    /* compiled from: WazeSource */
    public final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int element = ((IntRef) operationArgContainer.mo7540getObjectgvac4VY(0)).getElement();
            List list = (List) operationArgContainer.mo7540getObjectgvac4VY(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i3 = element + i2;
                applier.insertBottomUp(i3, obj);
                applier.insertTopDown(i3, obj);
            }
        }

        /* renamed from: getEffectiveNodeIndex-s5KIjrA, reason: not valid java name */
        public final int m7499getEffectiveNodeIndexs5KIjrA() {
            return 0;
        }

        /* renamed from: getNodes-s5KIjrA, reason: not valid java name */
        public final int m7500getNodess5KIjrA() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "effectiveNodeIndex" : ObjectParameter.m7520equalsimpl0(i2, 1) ? "nodes" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class CopySlotTableToHandleLocation extends Operation {
        public static final int $stable = 0;
        public static final CopySlotTableToHandleLocation INSTANCE = new CopySlotTableToHandleLocation();

        private CopySlotTableToHandleLocation() {
            super(0, 4, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo7540getObjectgvac4VY(2);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo7540getObjectgvac4VY(3);
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo7540getObjectgvac4VY(1);
            MovableContentState movableContentStateMovableContentStateResolve$runtime = (MovableContentState) operationArgContainer.mo7540getObjectgvac4VY(0);
            if (movableContentStateMovableContentStateResolve$runtime == null && (movableContentStateMovableContentStateResolve$runtime = compositionContext.movableContentStateResolve$runtime(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new e();
            }
            SlotTableEditor slotTableEditorOpenEditor = SlotTableKt.asLinkBufferSlotTable(movableContentStateMovableContentStateResolve$runtime.getSlotStorage$runtime()).openEditor();
            try {
                slotTableEditorOpenEditor.startGroup();
                slotTableEditorOpenEditor.startGroup();
                long jMoveFrom = slotTableEditor.moveFrom(slotTableEditorOpenEditor, slotTableEditorOpenEditor.handle(), (slotTableEditor.firstChildOf(slotTableEditor.getCurrentGroup()) << 32) | MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                slotTableEditorOpenEditor.close();
                SlotTable table = slotTableEditor.getTable();
                int group = GroupHandleKt.getGroup(jMoveFrom);
                ControlledComposition composition$runtime = movableContentStateReference2.getComposition$runtime();
                x.d(composition$runtime, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
                SlotTableKt.adoptScopesInGroupToNewParent(table, group, (RecomposeScopeOwner) composition$runtime);
            } catch (Throwable th) {
                slotTableEditorOpenEditor.close();
                throw th;
            }
        }

        /* renamed from: getFrom-s5KIjrA, reason: not valid java name */
        public final int m7501getFroms5KIjrA() {
            return 2;
        }

        /* renamed from: getParentCompositionContext-s5KIjrA, reason: not valid java name */
        public final int m7502getParentCompositionContexts5KIjrA() {
            return 1;
        }

        /* renamed from: getResolvedState-s5KIjrA, reason: not valid java name */
        public final int m7503getResolvedStates5KIjrA() {
            return 0;
        }

        /* renamed from: getTo-s5KIjrA, reason: not valid java name */
        public final int m7504getTos5KIjrA() {
            return 3;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "resolvedState" : ObjectParameter.m7520equalsimpl0(i2, 1) ? "resolvedCompositionContext" : ObjectParameter.m7520equalsimpl0(i2, 2) ? TypedValues.TransitionType.S_FROM : ObjectParameter.m7520equalsimpl0(i2, 3) ? TypedValues.TransitionType.S_TO : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class DeactivateGroup extends Operation {
        public static final int $stable = 0;
        public static final DeactivateGroup INSTANCE = new DeactivateGroup();

        private DeactivateGroup() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            SlotTableEditorKt.deactivateGroup(slotTableEditor, rememberManager);
        }
    }

    /* compiled from: WazeSource */
    public final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(2, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            IntRef intRef = (IntRef) operationArgContainer.mo7540getObjectgvac4VY(0);
            long j2 = OperationArgContainerKt.getLong(operationArgContainer, 1, 0);
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.setElement(OperationKt.positionToInsert(slotTableEditor, j2, applier));
        }

        /* renamed from: getEffectiveNodeIndexOut-s5KIjrA, reason: not valid java name */
        public final int m7505getEffectiveNodeIndexOuts5KIjrA() {
            return 0;
        }

        public final int getGroupHandleHighBits() {
            return 1;
        }

        public final int getGroupHandleLowBits() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "groupHandle[32..63]" : i2 == 1 ? "groupHandle[0..31]" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "effectiveNodeIndexOut" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class DisposeMovableContentState extends Operation {
        public static final int $stable = 0;
        public static final DisposeMovableContentState INSTANCE = new DisposeMovableContentState();

        private DisposeMovableContentState() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ((MovableContentState) operationArgContainer.mo7540getObjectgvac4VY(0)).dispose$runtime();
        }

        /* renamed from: getResolvedState-s5KIjrA, reason: not valid java name */
        public final int m7506getResolvedStates5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "resolvedState" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class Downs extends Operation {
        public static final int $stable = 0;
        public static final Downs INSTANCE = new Downs();

        private Downs() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) operationArgContainer.mo7540getObjectgvac4VY(0)) {
                applier.down(obj);
            }
        }

        /* renamed from: getNodes-s5KIjrA, reason: not valid java name */
        public final int m7507getNodess5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "nodes" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class EndCompositionScope extends Operation {
        public static final int $stable = 0;
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ((l) operationArgContainer.mo7540getObjectgvac4VY(0)).invoke((Composition) operationArgContainer.mo7540getObjectgvac4VY(1));
        }

        /* renamed from: getAction-s5KIjrA, reason: not valid java name */
        public final int m7508getActions5KIjrA() {
            return 0;
        }

        /* renamed from: getComposition-s5KIjrA, reason: not valid java name */
        public final int m7509getCompositions5KIjrA() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "anchor" : ObjectParameter.m7520equalsimpl0(i2, 1) ? "composition" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        private EndMovableContentPlacement() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            while (slotTableEditor.getParentGroup() >= 0) {
                if (slotTableEditor.isParentGroupANode()) {
                    applier.up();
                }
                slotTableEditor.endGroup();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class EndResumingScope extends Operation {
        public static final int $stable = 0;
        public static final EndResumingScope INSTANCE = new EndResumingScope();

        private EndResumingScope() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.endResumingScope((RecomposeScopeImpl) operationArgContainer.mo7540getObjectgvac4VY(0));
        }

        /* renamed from: getScope-s5KIjrA, reason: not valid java name */
        public final int m7510getScopes5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "scope" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(3, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object objInvoke = ((a) operationArgContainer.mo7540getObjectgvac4VY(0)).invoke();
            int i2 = operationArgContainer.getInt(0);
            int group = GroupHandleKt.getGroup(getGroupHandle(operationArgContainer, slotTableEditor));
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotTableEditor.updateNode(group, objInvoke);
            applier.insertTopDown(i2, objInvoke);
            applier.down(objInvoke);
        }

        /* renamed from: getFactory-s5KIjrA, reason: not valid java name */
        public final int m7511getFactorys5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected long getGroupHandle(OperationArgContainer operationArgContainer, SlotTableEditor slotTableEditor) {
            return OperationArgContainerKt.getLong(operationArgContainer, 1, 2);
        }

        public final int getGroupHandleHigh() {
            return 1;
        }

        public final int getGroupHandleLow() {
            return 2;
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "insertIndex" : i2 == 1 ? "groupHandleHigh" : i2 == 2 ? "groupHandleLow" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "factory" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class InsertNodeFixupByAnchor extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixupByAnchor INSTANCE = new InsertNodeFixupByAnchor();

        private InsertNodeFixupByAnchor() {
            super(1, 2, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object objInvoke = ((a) operationArgContainer.mo7540getObjectgvac4VY(0)).invoke();
            int i2 = operationArgContainer.getInt(0);
            int address = ((LinkAnchor) operationArgContainer.mo7540getObjectgvac4VY(1)).getAddress();
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotTableEditor.updateNode(address, objInvoke);
            applier.insertTopDown(i2, objInvoke);
            applier.down(objInvoke);
        }

        /* renamed from: getAnchor-s5KIjrA, reason: not valid java name */
        public final int m7512getAnchors5KIjrA() {
            return 1;
        }

        /* renamed from: getFactory-s5KIjrA, reason: not valid java name */
        public final int m7513getFactorys5KIjrA() {
            return 0;
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "insertIndex" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "factory" : ObjectParameter.m7520equalsimpl0(i2, 1) ? "anchor" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class InsertSlots extends Operation {
        public static final int $stable = 0;
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(2, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            SlotTableEditor.moveFrom$default(slotTableEditor, (SlotTable) operationArgContainer.mo7540getObjectgvac4VY(0), OperationArgContainerKt.getLong(operationArgContainer, 0, 1), 0L, 4, (Object) null);
            slotTableEditor.skipGroup();
        }

        /* renamed from: getFromSlotTable-s5KIjrA, reason: not valid java name */
        public final int m7514getFromSlotTables5KIjrA() {
            return 0;
        }

        public final int getSourceHighBits() {
            return 0;
        }

        public final int getSourceLowBits() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "source[32..63]" : i2 == 1 ? "source[0..31]" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? TypedValues.TransitionType.S_FROM : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(2, 2, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            OperationErrorContext operationErrorContextWithCurrentStackTrace;
            SlotTable slotTable = (SlotTable) operationArgContainer.mo7540getObjectgvac4VY(0);
            FixupList fixupList = (FixupList) operationArgContainer.mo7540getObjectgvac4VY(1);
            SlotTableEditor slotTableEditorOpenEditor = slotTable.openEditor();
            if (operationErrorContext != null) {
                try {
                    operationErrorContextWithCurrentStackTrace = OperationKt.withCurrentStackTrace(operationErrorContext, slotTableEditor);
                } catch (Throwable th) {
                    slotTableEditorOpenEditor.close();
                    throw th;
                }
            } else {
                operationErrorContextWithCurrentStackTrace = null;
            }
            fixupList.executeAndFlushAllPendingFixups(applier, slotTableEditorOpenEditor, rememberManager, operationErrorContextWithCurrentStackTrace);
            slotTableEditorOpenEditor.close();
            SlotTableEditor.moveFrom$default(slotTableEditor, slotTable, OperationArgContainerKt.getLong(operationArgContainer, 0, 1), 0L, 4, (Object) null);
            slotTableEditor.skipGroup();
        }

        /* renamed from: getFixups-s5KIjrA, reason: not valid java name */
        public final int m7515getFixupss5KIjrA() {
            return 1;
        }

        /* renamed from: getFromSlotTable-s5KIjrA, reason: not valid java name */
        public final int m7516getFromSlotTables5KIjrA() {
            return 0;
        }

        public final int getSourceHighBits() {
            return 0;
        }

        public final int getSourceLowBits() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "sourceHandle[32..63]" : i2 == 1 ? "sourceHandle[0..31]" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? TypedValues.TransitionType.S_FROM : ObjectParameter.m7520equalsimpl0(i2, 1) ? "fixups" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class MoveGroup extends Operation {
        public static final int $stable = 0;
        public static final MoveGroup INSTANCE = new MoveGroup();

        private MoveGroup() {
            super(1, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.moveGroup(operationArgContainer.getInt(0));
        }

        public final int getOffset() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? TypedValues.CycleType.S_WAVE_OFFSET : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class MoveNode extends Operation {
        public static final int $stable = 0;
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.move(operationArgContainer.getInt(0), operationArgContainer.getInt(1), operationArgContainer.getInt(2));
        }

        public final int getCount() {
            return 2;
        }

        public final int getFrom() {
            return 0;
        }

        public final int getTo() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? TypedValues.TransitionType.S_FROM : i2 == 1 ? TypedValues.TransitionType.S_TO : i2 == 2 ? "count" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        private PostInsertNodeFixup() {
            super(3, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i2 = operationArgContainer.getInt(0);
            int group = GroupHandleKt.getGroup(OperationArgContainerKt.getLong(operationArgContainer, 1, 2));
            applier.up();
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(i2, slotTableEditor.node(group));
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected long getGroupHandle(OperationArgContainer operationArgContainer, SlotTableEditor slotTableEditor) {
            return OperationArgContainerKt.getLong(operationArgContainer, 1, 2);
        }

        public final int getGroupHandleHigh() {
            return 1;
        }

        public final int getGroupHandleLow() {
            return 2;
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "insertIndex" : i2 == 1 ? "groupHandleHigh" : i2 == 2 ? "groupHandleLow" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class PostInsertNodeFixupByAnchor extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixupByAnchor INSTANCE = new PostInsertNodeFixupByAnchor();

        private PostInsertNodeFixupByAnchor() {
            super(1, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i2 = operationArgContainer.getInt(0);
            int address = ((LinkAnchor) operationArgContainer.mo7540getObjectgvac4VY(0)).getAddress();
            applier.up();
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(i2, slotTableEditor.node(address));
        }

        /* renamed from: getAnchor-s5KIjrA, reason: not valid java name */
        public final int m7524getAnchors5KIjrA() {
            return 0;
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "insertIndex" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "anchor" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class ReleaseMovableGroup extends Operation {
        public static final int $stable = 0;
        public static final ReleaseMovableGroup INSTANCE = new ReleaseMovableGroup();

        private ReleaseMovableGroup() {
            super(0, 3, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            OperationKt.releaseMovableGroup((ControlledComposition) operationArgContainer.mo7540getObjectgvac4VY(0), (CompositionContext) operationArgContainer.mo7540getObjectgvac4VY(1), (MovableContentStateReference) operationArgContainer.mo7540getObjectgvac4VY(2), slotTableEditor, applier);
        }

        /* renamed from: getComposition-s5KIjrA, reason: not valid java name */
        public final int m7525getCompositions5KIjrA() {
            return 0;
        }

        /* renamed from: getParentCompositionContext-s5KIjrA, reason: not valid java name */
        public final int m7526getParentCompositionContexts5KIjrA() {
            return 1;
        }

        /* renamed from: getReference-s5KIjrA, reason: not valid java name */
        public final int m7527getReferences5KIjrA() {
            return 2;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "composition" : ObjectParameter.m7520equalsimpl0(i2, 1) ? "parentCompositionContext" : ObjectParameter.m7520equalsimpl0(i2, 2) ? TypedValues.Custom.S_REFERENCE : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class Remember extends Operation {
        public static final int $stable = 0;
        public static final Remember INSTANCE = new Remember();

        private Remember() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.remembering((RememberObserverHolder) operationArgContainer.mo7540getObjectgvac4VY(0));
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m7528getValues5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "value" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class RememberPausingScope extends Operation {
        public static final int $stable = 0;
        public static final RememberPausingScope INSTANCE = new RememberPausingScope();

        private RememberPausingScope() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.rememberPausingScope((RecomposeScopeImpl) operationArgContainer.mo7540getObjectgvac4VY(0));
        }

        /* renamed from: getScope-s5KIjrA, reason: not valid java name */
        public final int m7529getScopes5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "scope" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class RemoveGroup extends Operation {
        public static final int $stable = 0;
        public static final RemoveGroup INSTANCE = new RemoveGroup();

        private RemoveGroup() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            SlotTableEditorKt.removeGroupAndForgetSlots(slotTableEditor, rememberManager);
        }
    }

    /* compiled from: WazeSource */
    public final class RemoveNode extends Operation {
        public static final int $stable = 0;
        public static final RemoveNode INSTANCE = new RemoveNode();

        private RemoveNode() {
            super(2, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.remove(operationArgContainer.getInt(0), operationArgContainer.getInt(1));
        }

        public final int getCount() {
            return 1;
        }

        public final int getRemoveIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "removeIndex" : i2 == 1 ? "count" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class RemoveTailGroupsAndValues extends Operation {
        public static final int $stable = 0;
        public static final RemoveTailGroupsAndValues INSTANCE = new RemoveTailGroupsAndValues();

        private RemoveTailGroupsAndValues() {
            super(2, 0, false, 6, null);
        }

        static final boolean execute$lambda$0(RememberManager rememberManager, int i2, int i3, Object obj) {
            if (obj instanceof ComposeNodeLifecycleCallback) {
                ((ComposeNodeLifecycleCallback) obj).onRelease();
                return false;
            }
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) obj);
                return false;
            }
            if (!(obj instanceof RecomposeScopeImpl)) {
                return false;
            }
            ((RecomposeScopeImpl) obj).release();
            return false;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, final RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i2 = operationArgContainer.getInt(1);
            int i3 = operationArgContainer.getInt(0);
            slotTableEditor.visitTailSlotsInRememberOrder$runtime(slotTableEditor.getParentGroup(), i3, i2, new SlotTableEditor.VisitSlotsInRememberOrderCallback() { // from class: androidx.compose.runtime.composer.linkbuffer.changelist.Operation$RemoveTailGroupsAndValues$$ExternalSyntheticLambda0
                @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
                public final boolean visit(int i4, int i5, Object obj) {
                    Operation.RemoveTailGroupsAndValues.execute$lambda$0(rememberManager, i4, i5, obj);
                    return false;
                }
            });
            slotTableEditor.trimSlots(i2);
            while (slotTableEditor.getCurrentGroup() != i3) {
                slotTableEditor.skipGroup();
            }
            while (slotTableEditor.getCurrentGroup() >= 0) {
                slotTableEditor.removeGroup(true);
            }
        }

        public final int getFirstTailGroupToRemove() {
            return 0;
        }

        public final int getTailSlotCount() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "firstTailGroupToRemove" : i2 == 1 ? "tailSlotCount" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class ResetSlots extends Operation {
        public static final int $stable = 0;
        public static final ResetSlots INSTANCE = new ResetSlots();

        private ResetSlots() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.reset();
        }
    }

    /* compiled from: WazeSource */
    public final class SeekToAnchor extends Operation {
        public static final int $stable = 0;
        public static final SeekToAnchor INSTANCE = new SeekToAnchor();

        private SeekToAnchor() {
            super(0, 1, false, 1, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.seek(((AnchorHandle) operationArgContainer.mo7540getObjectgvac4VY(0)).toHandle());
        }

        /* renamed from: getAnchorHandle-s5KIjrA, reason: not valid java name */
        public final int m7530getAnchorHandles5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "anchorHandle" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class SeekToGroupHandle extends Operation {
        public static final int $stable = 0;
        public static final SeekToGroupHandle INSTANCE = new SeekToGroupHandle();

        private SeekToGroupHandle() {
            super(2, 0, false, 2, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.seek(OperationArgContainerKt.getLong(operationArgContainer, 0, 1));
        }

        public final int getGroupHandleHighBits() {
            return 0;
        }

        public final int getGroupHandleLowBits() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "group[32..63]" : i2 == 1 ? "group[0..31]" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class SideEffect extends Operation {
        public static final int $stable = 0;
        public static final SideEffect INSTANCE = new SideEffect();

        private SideEffect() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.sideEffect((a) operationArgContainer.mo7540getObjectgvac4VY(0));
        }

        /* renamed from: getEffect-s5KIjrA, reason: not valid java name */
        public final int m7531getEffects5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "effect" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class SkipGroup extends Operation {
        public static final int $stable = 0;
        public static final SkipGroup INSTANCE = new SkipGroup();

        private SkipGroup() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.skipGroup();
        }
    }

    /* compiled from: WazeSource */
    public final class StartGroup extends Operation {
        public static final int $stable = 0;
        public static final StartGroup INSTANCE = new StartGroup();

        private StartGroup() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.startGroup();
        }
    }

    /* compiled from: WazeSource */
    public final class StartResumingScope extends Operation {
        public static final int $stable = 0;
        public static final StartResumingScope INSTANCE = new StartResumingScope();

        private StartResumingScope() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.startResumingScope((RecomposeScopeImpl) operationArgContainer.mo7540getObjectgvac4VY(0));
        }

        /* renamed from: getScope-s5KIjrA, reason: not valid java name */
        public final int m7532getScopes5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "scope" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UpdateAuxData extends Operation {
        public static final int $stable = 0;
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        private UpdateAuxData() {
            super(0, 1, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotTableEditor.updateAux(operationArgContainer.mo7540getObjectgvac4VY(0));
        }

        /* renamed from: getData-s5KIjrA, reason: not valid java name */
        public final int m7533getDatas5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "data" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UpdateNode extends Operation {
        public static final int $stable = 0;
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, false, 5, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.apply((p) operationArgContainer.mo7540getObjectgvac4VY(1), operationArgContainer.mo7540getObjectgvac4VY(0));
        }

        /* renamed from: getBlock-s5KIjrA, reason: not valid java name */
        public final int m7534getBlocks5KIjrA() {
            return 1;
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m7535getValues5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "value" : ObjectParameter.m7520equalsimpl0(i2, 1) ? "block" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UpdateRememberObserverHolderOrdering extends Operation {
        public static final int $stable = 0;
        public static final UpdateRememberObserverHolderOrdering INSTANCE = new UpdateRememberObserverHolderOrdering();

        private UpdateRememberObserverHolderOrdering() {
            super(0, 2, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ((LinkRememberObserverHolder) operationArgContainer.mo7540getObjectgvac4VY(1)).setAfter((LinkAnchor) operationArgContainer.mo7540getObjectgvac4VY(0));
        }

        /* renamed from: getAfter-s5KIjrA, reason: not valid java name */
        public final int m7536getAfters5KIjrA() {
            return 0;
        }

        /* renamed from: getHolder-s5KIjrA, reason: not valid java name */
        public final int m7537getHolders5KIjrA() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? TtmlNode.ANNOTATION_POSITION_AFTER : ObjectParameter.m7520equalsimpl0(i2, 1) ? "rememberObserverHolder" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UpdateValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateValue INSTANCE = new UpdateValue();

        private UpdateValue() {
            super(1, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object objMo7540getObjectgvac4VY = operationArgContainer.mo7540getObjectgvac4VY(0);
            boolean z = objMo7540getObjectgvac4VY instanceof RememberObserverHolder;
            int i2 = operationArgContainer.getInt(0);
            if (z) {
                rememberManager.remembering((RememberObserverHolder) objMo7540getObjectgvac4VY);
            }
            Object absolute = slotTableEditor.setAbsolute(i2, objMo7540getObjectgvac4VY);
            if (absolute instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) absolute);
            } else if (absolute instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) absolute).release();
            }
        }

        public final int getSlotAddress() {
            return 0;
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m7538getValues5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "slotAddress" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "value" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UpdateValueRelative extends Operation {
        public static final int $stable = 0;
        public static final UpdateValueRelative INSTANCE = new UpdateValueRelative();

        private UpdateValueRelative() {
            super(1, 1, false, 4, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object objMo7540getObjectgvac4VY = operationArgContainer.mo7540getObjectgvac4VY(0);
            boolean z = objMo7540getObjectgvac4VY instanceof RememberObserverHolder;
            int i2 = operationArgContainer.getInt(0);
            if (z) {
                rememberManager.remembering((RememberObserverHolder) objMo7540getObjectgvac4VY);
            }
            Object relative = slotTableEditor.setRelative(i2, objMo7540getObjectgvac4VY);
            if (relative instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) relative);
            } else if (relative instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) relative).release();
            }
        }

        public final int getSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-s5KIjrA, reason: not valid java name */
        public final int m7539getValues5KIjrA() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "slotIndex" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        /* renamed from: objectParamName-gvac4VY */
        public String mo7495objectParamNamegvac4VY(int i2) {
            return ObjectParameter.m7520equalsimpl0(i2, 0) ? "value" : super.mo7495objectParamNamegvac4VY(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class Ups extends Operation {
        public static final int $stable = 0;
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, false, 6, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i2 = operationArgContainer.getInt(0);
            for (int i3 = 0; i3 < i2; i3++) {
                applier.up();
            }
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "count" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UseCurrentNode extends Operation {
        public static final int $stable = 0;
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        private UseCurrentNode() {
            super(0, 0, false, 7, null);
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.reuse();
        }
    }

    public /* synthetic */ Operation(int i2, int i3, boolean z, int i4, o oVar) {
        this(1 == (i4 & 1) ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, z | (!((i4 & 4) == 0)), null);
    }

    protected abstract void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext);

    public final void executeWithComposeStackTrace(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        long groupHandle = getGroupHandle(operationArgContainer, slotTableEditor);
        try {
            execute(operationArgContainer, applier, slotTableEditor, rememberManager, operationErrorContext);
        } catch (Throwable th) {
            OperationKt.access$attachComposeStackTrace(th, operationErrorContext, slotTableEditor, groupHandle);
            throw th;
        }
    }

    protected long getGroupHandle(OperationArgContainer operationArgContainer, SlotTableEditor slotTableEditor) {
        return -1L;
    }

    public final int getInts() {
        return this.ints;
    }

    public final String getName() {
        int i2 = ar.f48106a;
        String strC = new m(getClass()).c();
        return strC == null ? "" : strC;
    }

    public final int getObjects() {
        return this.objects;
    }

    public String intParamName(int i2) {
        return "IntParameter(" + i2 + ')';
    }

    public final boolean isExternallyVisible() {
        return this.isExternallyVisible;
    }

    /* renamed from: objectParamName-gvac4VY, reason: not valid java name */
    public String mo7495objectParamNamegvac4VY(int i2) {
        return "ObjectParameter(" + i2 + ')';
    }

    public String toString() {
        return getName();
    }

    /* compiled from: WazeSource */
    public final class TestOperation extends Operation {
        public static final int $stable = 8;
        private final q<Applier<?>, SlotTableEditor, RememberManager, ab> block;
        private final List<Integer> intParams;
        private final List<ObjectParameter<Object>> objParams;

        /* JADX WARN: Multi-variable type inference failed */
        public TestOperation(int i2, int i3, q<? super Applier<?>, ? super SlotTableEditor, ? super RememberManager, ab> qVar) {
            super(i2, i3, false, 4, null);
            this.block = qVar;
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(Integer.valueOf(i4));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList2.add(ObjectParameter.m7517boximpl(i5));
            }
            this.objParams = arrayList2;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            this.block.invoke(applier, slotTableEditor, rememberManager);
        }

        public final q<Applier<?>, SlotTableEditor, RememberManager, ab> getBlock() {
            return this.block;
        }

        public final List<Integer> getIntParams() {
            return this.intParams;
        }

        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.composer.linkbuffer.changelist.Operation
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + System_jvmKt.identityHashCode(this);
        }

        public static /* synthetic */ void getIntParams$annotations() {
        }

        public static /* synthetic */ void getObjParams$annotations() {
        }

        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TestOperation(int i2, int i3, q qVar, int i4, o oVar) {
            qVar = (i4 & 4) != 0 ? new q() { // from class: androidx.compose.runtime.composer.linkbuffer.changelist.Operation$TestOperation$$ExternalSyntheticLambda0
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ab.f48028a;
                }
            } : qVar;
            int i5 = i4 & 2;
            int i6 = i4 & 1;
            this(1 == i6 ? 0 : i2, i5 != 0 ? 0 : i3, qVar);
        }
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class ObjectParameter<T> {
        private final int offset;

        private /* synthetic */ ObjectParameter(int i2) {
            this.offset = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m7517boximpl(int i2) {
            return new ObjectParameter(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7519equalsimpl(int i2, Object obj) {
            return (obj instanceof ObjectParameter) && i2 == ((ObjectParameter) obj).m7523unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7520equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7522toStringimpl(int i2) {
            return "ObjectParameter(offset=" + i2 + ')';
        }

        public boolean equals(Object obj) {
            return m7519equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return this.offset;
        }

        public String toString() {
            return m7522toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7523unboximpl() {
            return this.offset;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m7518constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7521hashCodeimpl(int i2) {
            return i2;
        }
    }

    public /* synthetic */ Operation(int i2, int i3, boolean z, o oVar) {
        this(i2, i3, z);
    }

    private Operation(int i2, int i3, boolean z) {
        this.ints = i2;
        this.objects = i3;
        this.isExternallyVisible = z;
    }
}
