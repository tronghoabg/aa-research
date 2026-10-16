package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.System_jvmKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
    private final int objects;

    /* compiled from: WazeSource */
    public final class AdvanceSlotsBy extends Operation {
        public static final int $stable = 0;
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.advanceBy(operationArgContainer.getInt(0));
        }

        public final int getDistance() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "distance" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class AppendValue extends Operation {
        public static final int $stable = 0;
        public static final AppendValue INSTANCE = new AppendValue();

        private AppendValue() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(0);
            Object objMo7477getObjectPtLUHM = operationArgContainer.mo7477getObjectPtLUHM(1);
            if (objMo7477getObjectPtLUHM instanceof RememberObserverHolder) {
                rememberManager.remembering((RememberObserverHolder) objMo7477getObjectPtLUHM);
            }
            slotWriter.appendSlot(gapAnchor, objMo7477getObjectPtLUHM);
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m7432getAnchorw8_IdGo() {
            return 0;
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m7433getValuew8_IdGo() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "anchor" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "value" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class ApplyChangeList extends Operation {
        public static final int $stable = 0;
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            IntRef intRef = (IntRef) operationArgContainer.mo7477getObjectPtLUHM(1);
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo7477getObjectPtLUHM(0);
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager, operationErrorContext != null ? OperationKt.withCurrentStackTrace(operationErrorContext, slotWriter) : null);
        }

        /* renamed from: getChanges-w8_IdGo, reason: not valid java name */
        public final int m7434getChangesw8_IdGo() {
            return 0;
        }

        /* renamed from: getEffectiveNodeIndex-w8_IdGo, reason: not valid java name */
        public final int m7435getEffectiveNodeIndexw8_IdGo() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "changes" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "effectiveNodeIndex" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int element = ((IntRef) operationArgContainer.mo7477getObjectPtLUHM(0)).getElement();
            List list = (List) operationArgContainer.mo7477getObjectPtLUHM(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i3 = element + i2;
                applier.insertBottomUp(i3, obj);
                applier.insertTopDown(i3, obj);
            }
        }

        /* renamed from: getEffectiveNodeIndex-w8_IdGo, reason: not valid java name */
        public final int m7436getEffectiveNodeIndexw8_IdGo() {
            return 0;
        }

        /* renamed from: getNodes-w8_IdGo, reason: not valid java name */
        public final int m7437getNodesw8_IdGo() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "effectiveNodeIndex" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "nodes" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable = 0;
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo7477getObjectPtLUHM(2);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo7477getObjectPtLUHM(3);
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo7477getObjectPtLUHM(1);
            MovableContentState movableContentStateMovableContentStateResolve$runtime = (MovableContentState) operationArgContainer.mo7477getObjectPtLUHM(0);
            if (movableContentStateMovableContentStateResolve$runtime == null && (movableContentStateMovableContentStateResolve$runtime = compositionContext.movableContentStateResolve$runtime(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new e();
            }
            List<GapAnchor> listMoveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, SlotTableKt.asGapBufferSlotTable(movableContentStateMovableContentStateResolve$runtime.getSlotStorage$runtime()), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            ControlledComposition composition$runtime = movableContentStateReference2.getComposition$runtime();
            x.d(composition$runtime, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.adoptAnchoredScopes$runtime(slotWriter, listMoveIntoGroupFrom, (RecomposeScopeOwner) composition$runtime);
        }

        /* renamed from: getFrom-w8_IdGo, reason: not valid java name */
        public final int m7438getFromw8_IdGo() {
            return 2;
        }

        /* renamed from: getParentCompositionContext-w8_IdGo, reason: not valid java name */
        public final int m7439getParentCompositionContextw8_IdGo() {
            return 1;
        }

        /* renamed from: getResolvedState-w8_IdGo, reason: not valid java name */
        public final int m7440getResolvedStatew8_IdGo() {
            return 0;
        }

        /* renamed from: getTo-w8_IdGo, reason: not valid java name */
        public final int m7441getTow8_IdGo() {
            return 3;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "resolvedState" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "resolvedCompositionContext" : ObjectParameter.m7459equalsimpl0(i2, 2) ? TypedValues.TransitionType.S_FROM : ObjectParameter.m7459equalsimpl0(i2, 3) ? TypedValues.TransitionType.S_TO : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class DeactivateCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        private DeactivateCurrentGroup() {
            int i2 = 0;
            super(i2, i2, 3, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            GapComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: WazeSource */
    public final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable = 0;
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            IntRef intRef = (IntRef) operationArgContainer.mo7477getObjectPtLUHM(0);
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(1);
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.setElement(OperationKt.positionToInsert(slotWriter, gapAnchor, applier));
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m7442getAnchorw8_IdGo() {
            return 1;
        }

        /* renamed from: getEffectiveNodeIndexOut-w8_IdGo, reason: not valid java name */
        public final int m7443getEffectiveNodeIndexOutw8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "effectiveNodeIndexOut" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "anchor" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class Downs extends Operation {
        public static final int $stable = 0;
        public static final Downs INSTANCE = new Downs();

        /* JADX WARN: Illegal instructions before constructor call */
        private Downs() {
            int i2 = 1;
            super(0, i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) operationArgContainer.mo7477getObjectPtLUHM(0)) {
                applier.down(obj);
            }
        }

        /* renamed from: getNodes-w8_IdGo, reason: not valid java name */
        public final int m7444getNodesw8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "nodes" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class EndCompositionScope extends Operation {
        public static final int $stable = 0;
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ((l) operationArgContainer.mo7477getObjectPtLUHM(0)).invoke((Composition) operationArgContainer.mo7477getObjectPtLUHM(1));
        }

        /* renamed from: getAction-w8_IdGo, reason: not valid java name */
        public final int m7445getActionw8_IdGo() {
            return 0;
        }

        /* renamed from: getComposition-w8_IdGo, reason: not valid java name */
        public final int m7446getCompositionw8_IdGo() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "anchor" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "composition" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class EndCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        private EndCurrentGroup() {
            int i2 = 0;
            super(i2, i2, 3, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.endGroup();
        }
    }

    /* compiled from: WazeSource */
    public final class EndMovableContentPlacement extends Operation {
        public static final int $stable = 0;
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        /* JADX WARN: Illegal instructions before constructor call */
        private EndMovableContentPlacement() {
            int i2 = 0;
            super(i2, i2, 3, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    /* compiled from: WazeSource */
    public final class EndResumingScope extends Operation {
        public static final int $stable = 0;
        public static final EndResumingScope INSTANCE = new EndResumingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        private EndResumingScope() {
            int i2 = 1;
            super(0, i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.endResumingScope((RecomposeScopeImpl) operationArgContainer.mo7477getObjectPtLUHM(0));
        }

        /* renamed from: getScope-w8_IdGo, reason: not valid java name */
        public final int m7447getScopew8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "scope" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class EnsureGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        private EnsureGroupStarted() {
            int i2 = 1;
            super(0, i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.ensureStarted((GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(0));
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m7448getAnchorw8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "anchor" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class EnsureRootGroupStarted extends Operation {
        public static final int $stable = 0;
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        private EnsureRootGroupStarted() {
            int i2 = 0;
            super(i2, i2, 3, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.ensureStarted(0);
        }
    }

    /* compiled from: WazeSource */
    public final class InsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object objInvoke = ((a) operationArgContainer.mo7477getObjectPtLUHM(0)).invoke();
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(1);
            int i2 = operationArgContainer.getInt(0);
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.updateNode(gapAnchor, objInvoke);
            applier.insertTopDown(i2, objInvoke);
            applier.down(objInvoke);
        }

        /* renamed from: getFactory-w8_IdGo, reason: not valid java name */
        public final int m7449getFactoryw8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected GapAnchor getGroupAnchor(OperationArgContainer operationArgContainer, SlotWriter slotWriter) {
            return (GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(1);
        }

        /* renamed from: getGroupAnchor-w8_IdGo, reason: not valid java name */
        public final int m7450getGroupAnchorw8_IdGo() {
            return 1;
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "insertIndex" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "factory" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "groupAnchor" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class InsertSlots extends Operation {
        public static final int $stable = 0;
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo7477getObjectPtLUHM(1);
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(0);
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, gapAnchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m7451getAnchorw8_IdGo() {
            return 0;
        }

        /* renamed from: getFromSlotTable-w8_IdGo, reason: not valid java name */
        public final int m7452getFromSlotTablew8_IdGo() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "anchor" : ObjectParameter.m7459equalsimpl0(i2, 1) ? TypedValues.TransitionType.S_FROM : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class InsertSlotsWithFixups extends Operation {
        public static final int $stable = 0;
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            OperationErrorContext operationErrorContextWithCurrentStackTrace;
            SlotTable slotTable = (SlotTable) operationArgContainer.mo7477getObjectPtLUHM(1);
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(0);
            FixupList fixupList = (FixupList) operationArgContainer.mo7477getObjectPtLUHM(2);
            SlotWriter slotWriterOpenWriter = slotTable.openWriter();
            if (operationErrorContext != null) {
                try {
                    operationErrorContextWithCurrentStackTrace = OperationKt.withCurrentStackTrace(operationErrorContext, slotWriter);
                } catch (Throwable th) {
                    slotWriterOpenWriter.close(false);
                    throw th;
                }
            } else {
                operationErrorContextWithCurrentStackTrace = null;
            }
            fixupList.executeAndFlushAllPendingFixups(applier, slotWriterOpenWriter, rememberManager, operationErrorContextWithCurrentStackTrace);
            slotWriterOpenWriter.close(true);
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, gapAnchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m7453getAnchorw8_IdGo() {
            return 0;
        }

        /* renamed from: getFixups-w8_IdGo, reason: not valid java name */
        public final int m7454getFixupsw8_IdGo() {
            return 2;
        }

        /* renamed from: getFromSlotTable-w8_IdGo, reason: not valid java name */
        public final int m7455getFromSlotTablew8_IdGo() {
            return 1;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "anchor" : ObjectParameter.m7459equalsimpl0(i2, 1) ? TypedValues.TransitionType.S_FROM : ObjectParameter.m7459equalsimpl0(i2, 2) ? "fixups" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class MoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.moveGroup(operationArgContainer.getInt(0));
        }

        public final int getOffset() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? TypedValues.CycleType.S_WAVE_OFFSET : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class MoveNode extends Operation {
        public static final int $stable = 0;
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
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

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? TypedValues.TransitionType.S_FROM : i2 == 1 ? TypedValues.TransitionType.S_TO : i2 == 2 ? "count" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class PostInsertNodeFixup extends Operation {
        public static final int $stable = 0;
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        /* JADX WARN: Illegal instructions before constructor call */
        private PostInsertNodeFixup() {
            int i2 = 1;
            super(i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(0);
            int i2 = operationArgContainer.getInt(0);
            applier.up();
            x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(i2, slotWriter.node(gapAnchor));
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected GapAnchor getGroupAnchor(OperationArgContainer operationArgContainer, SlotWriter slotWriter) {
            return (GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(0);
        }

        /* renamed from: getGroupAnchor-w8_IdGo, reason: not valid java name */
        public final int m7463getGroupAnchorw8_IdGo() {
            return 0;
        }

        public final int getInsertIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "insertIndex" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "groupAnchor" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable = 0;
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ControlledComposition controlledComposition = (ControlledComposition) operationArgContainer.mo7477getObjectPtLUHM(0);
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo7477getObjectPtLUHM(2);
            ((CompositionContext) operationArgContainer.mo7477getObjectPtLUHM(1)).movableContentStateReleased$runtime(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(controlledComposition, movableContentStateReference, slotWriter, null), applier);
        }

        /* renamed from: getComposition-w8_IdGo, reason: not valid java name */
        public final int m7464getCompositionw8_IdGo() {
            return 0;
        }

        /* renamed from: getParentCompositionContext-w8_IdGo, reason: not valid java name */
        public final int m7465getParentCompositionContextw8_IdGo() {
            return 1;
        }

        /* renamed from: getReference-w8_IdGo, reason: not valid java name */
        public final int m7466getReferencew8_IdGo() {
            return 2;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "composition" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "parentCompositionContext" : ObjectParameter.m7459equalsimpl0(i2, 2) ? TypedValues.Custom.S_REFERENCE : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class Remember extends Operation {
        public static final int $stable = 0;
        public static final Remember INSTANCE = new Remember();

        /* JADX WARN: Illegal instructions before constructor call */
        private Remember() {
            int i2 = 1;
            super(0, i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.remembering((RememberObserverHolder) operationArgContainer.mo7477getObjectPtLUHM(0));
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m7467getValuew8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "value" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class RememberPausingScope extends Operation {
        public static final int $stable = 0;
        public static final RememberPausingScope INSTANCE = new RememberPausingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        private RememberPausingScope() {
            int i2 = 1;
            super(0, i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.rememberPausingScope((RecomposeScopeImpl) operationArgContainer.mo7477getObjectPtLUHM(0));
        }

        /* renamed from: getScope-w8_IdGo, reason: not valid java name */
        public final int m7468getScopew8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "scope" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class RemoveCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        private RemoveCurrentGroup() {
            int i2 = 0;
            super(i2, i2, 3, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: WazeSource */
    public final class RemoveNode extends Operation {
        public static final int $stable = 0;
        public static final RemoveNode INSTANCE = new RemoveNode();

        /* JADX WARN: Illegal instructions before constructor call */
        private RemoveNode() {
            int i2 = 2;
            super(i2, 0, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.remove(operationArgContainer.getInt(0), operationArgContainer.getInt(1));
        }

        public final int getCount() {
            return 1;
        }

        public final int getRemoveIndex() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "removeIndex" : i2 == 1 ? "count" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class ResetSlots extends Operation {
        public static final int $stable = 0;
        public static final ResetSlots INSTANCE = new ResetSlots();

        /* JADX WARN: Illegal instructions before constructor call */
        private ResetSlots() {
            int i2 = 0;
            super(i2, i2, 3, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.reset();
        }
    }

    /* compiled from: WazeSource */
    public final class SideEffect extends Operation {
        public static final int $stable = 0;
        public static final SideEffect INSTANCE = new SideEffect();

        /* JADX WARN: Illegal instructions before constructor call */
        private SideEffect() {
            int i2 = 1;
            super(0, i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.sideEffect((a) operationArgContainer.mo7477getObjectPtLUHM(0));
        }

        /* renamed from: getEffect-w8_IdGo, reason: not valid java name */
        public final int m7469getEffectw8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "effect" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable = 0;
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        private SkipToEndOfCurrentGroup() {
            int i2 = 0;
            super(i2, i2, 3, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.skipToGroupEnd();
        }
    }

    /* compiled from: WazeSource */
    public final class StartResumingScope extends Operation {
        public static final int $stable = 0;
        public static final StartResumingScope INSTANCE = new StartResumingScope();

        /* JADX WARN: Illegal instructions before constructor call */
        private StartResumingScope() {
            int i2 = 1;
            super(0, i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.startResumingScope((RecomposeScopeImpl) operationArgContainer.mo7477getObjectPtLUHM(0));
        }

        /* renamed from: getScope-w8_IdGo, reason: not valid java name */
        public final int m7470getScopew8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "scope" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class TrimParentValues extends Operation {
        public static final int $stable = 0;
        public static final TrimParentValues INSTANCE = new TrimParentValues();

        private TrimParentValues() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i2 = operationArgContainer.getInt(0);
            int parent = slotWriter.getParent();
            int iSlotsStartIndex$runtime = slotWriter.slotsStartIndex$runtime(parent);
            int iSlotsEndIndex$runtime = slotWriter.slotsEndIndex$runtime(parent);
            for (int iMax = Math.max(iSlotsStartIndex$runtime, iSlotsEndIndex$runtime - i2); iMax < iSlotsEndIndex$runtime; iMax++) {
                Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(iMax)];
                if (obj instanceof RememberObserverHolder) {
                    rememberManager.forgetting((RememberObserverHolder) obj);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            slotWriter.trimTailSlots(i2);
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "count" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UpdateAnchoredValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateAnchoredValue INSTANCE = new UpdateAnchoredValue();

        private UpdateAnchoredValue() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object objMo7477getObjectPtLUHM = operationArgContainer.mo7477getObjectPtLUHM(0);
            GapAnchor gapAnchor = (GapAnchor) operationArgContainer.mo7477getObjectPtLUHM(1);
            boolean z = objMo7477getObjectPtLUHM instanceof RememberObserverHolder;
            int i2 = operationArgContainer.getInt(0);
            if (z) {
                rememberManager.remembering((RememberObserverHolder) objMo7477getObjectPtLUHM);
            }
            Object obj = slotWriter.set(slotWriter.anchorIndex(gapAnchor), i2, objMo7477getObjectPtLUHM);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) obj);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }

        /* renamed from: getAnchor-w8_IdGo, reason: not valid java name */
        public final int m7471getAnchorw8_IdGo() {
            return 1;
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m7472getValuew8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "groupSlotIndex" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "value" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "anchor" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UpdateAuxData extends Operation {
        public static final int $stable = 0;
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        /* JADX WARN: Illegal instructions before constructor call */
        private UpdateAuxData() {
            int i2 = 1;
            super(0, i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.updateAux(operationArgContainer.mo7477getObjectPtLUHM(0));
        }

        /* renamed from: getData-w8_IdGo, reason: not valid java name */
        public final int m7473getDataw8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "data" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UpdateNode extends Operation {
        public static final int $stable = 0;
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.apply((p) operationArgContainer.mo7477getObjectPtLUHM(1), operationArgContainer.mo7477getObjectPtLUHM(0));
        }

        /* renamed from: getBlock-w8_IdGo, reason: not valid java name */
        public final int m7474getBlockw8_IdGo() {
            return 1;
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m7475getValuew8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "value" : ObjectParameter.m7459equalsimpl0(i2, 1) ? "block" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UpdateValue extends Operation {
        public static final int $stable = 0;
        public static final UpdateValue INSTANCE = new UpdateValue();

        /* JADX WARN: Illegal instructions before constructor call */
        private UpdateValue() {
            int i2 = 1;
            super(i2, i2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object objMo7477getObjectPtLUHM = operationArgContainer.mo7477getObjectPtLUHM(0);
            boolean z = objMo7477getObjectPtLUHM instanceof RememberObserverHolder;
            int i2 = operationArgContainer.getInt(0);
            if (z) {
                rememberManager.remembering((RememberObserverHolder) objMo7477getObjectPtLUHM);
            }
            Object obj = slotWriter.set(slotWriter.getCurrentGroup(), i2, objMo7477getObjectPtLUHM);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting((RememberObserverHolder) obj);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }

        public final int getGroupSlotIndex() {
            return 0;
        }

        /* renamed from: getValue-w8_IdGo, reason: not valid java name */
        public final int m7476getValuew8_IdGo() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "groupSlotIndex" : super.intParamName(i2);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        /* renamed from: objectParamName-PtL-UHM */
        public String mo7431objectParamNamePtLUHM(int i2) {
            return ObjectParameter.m7459equalsimpl0(i2, 0) ? "value" : super.mo7431objectParamNamePtLUHM(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class Ups extends Operation {
        public static final int $stable = 0;
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i2 = operationArgContainer.getInt(0);
            for (int i3 = 0; i3 < i2; i3++) {
                applier.up();
            }
        }

        public final int getCount() {
            return 0;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public String intParamName(int i2) {
            return i2 == 0 ? "count" : super.intParamName(i2);
        }
    }

    /* compiled from: WazeSource */
    public final class UseCurrentNode extends Operation {
        public static final int $stable = 0;
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        /* JADX WARN: Illegal instructions before constructor call */
        private UseCurrentNode() {
            int i2 = 0;
            super(i2, i2, 3, null);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.reuse();
        }
    }

    public /* synthetic */ Operation(int i2, int i3, int i4, o oVar) {
        this(1 == (i4 & 1) ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, null);
    }

    protected abstract void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext);

    public final void executeWithComposeStackTrace(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        GapAnchor groupAnchor = getGroupAnchor(operationArgContainer, slotWriter);
        try {
            execute(operationArgContainer, applier, slotWriter, rememberManager, operationErrorContext);
        } catch (Throwable th) {
            OperationKt.access$attachComposeStackTrace(th, operationErrorContext, slotWriter, groupAnchor);
            throw th;
        }
    }

    protected GapAnchor getGroupAnchor(OperationArgContainer operationArgContainer, SlotWriter slotWriter) {
        return null;
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

    /* renamed from: objectParamName-PtL-UHM, reason: not valid java name */
    public String mo7431objectParamNamePtLUHM(int i2) {
        return "ObjectParameter(" + i2 + ')';
    }

    public String toString() {
        return getName();
    }

    /* compiled from: WazeSource */
    public final class TestOperation extends Operation {
        public static final int $stable = 8;
        private final q<Applier<?>, SlotWriter, RememberManager, ab> block;
        private final List<Integer> intParams;
        private final List<ObjectParameter<Object>> objParams;

        /* JADX WARN: Multi-variable type inference failed */
        public TestOperation(int i2, int i3, q<? super Applier<?>, ? super SlotWriter, ? super RememberManager, ab> qVar) {
            super(i2, i3, null);
            this.block = qVar;
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(Integer.valueOf(i4));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList2.add(ObjectParameter.m7456boximpl(i5));
            }
            this.objParams = arrayList2;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        protected void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            this.block.invoke(applier, slotWriter, rememberManager);
        }

        public final q<Applier<?>, SlotWriter, RememberManager, ab> getBlock() {
            return this.block;
        }

        public final List<Integer> getIntParams() {
            return this.intParams;
        }

        public final List<ObjectParameter<Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
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
            qVar = (i4 & 4) != 0 ? new q() { // from class: androidx.compose.runtime.composer.gapbuffer.changelist.Operation$TestOperation$$ExternalSyntheticLambda0
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

    public /* synthetic */ Operation(int i2, int i3, o oVar) {
        this(i2, i3);
    }

    private Operation(int i2, int i3) {
        this.ints = i2;
        this.objects = i3;
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class ObjectParameter<T> {
        private final int offset;

        private /* synthetic */ ObjectParameter(int i2) {
            this.offset = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ObjectParameter m7456boximpl(int i2) {
            return new ObjectParameter(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7458equalsimpl(int i2, Object obj) {
            return (obj instanceof ObjectParameter) && i2 == ((ObjectParameter) obj).m7462unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7459equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7461toStringimpl(int i2) {
            return "ObjectParameter(offset=" + i2 + ')';
        }

        public boolean equals(Object obj) {
            return m7458equalsimpl(this.offset, obj);
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return this.offset;
        }

        public String toString() {
            return m7461toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7462unboximpl() {
            return this.offset;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m7457constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7460hashCodeimpl(int i2) {
            return i2;
        }
    }
}
