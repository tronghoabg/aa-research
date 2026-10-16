package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.ScopeInvalidated;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableBuilder;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import h.k;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OperationKt {
    public static final /* synthetic */ Throwable access$attachComposeStackTrace(Throwable th, OperationErrorContext operationErrorContext, SlotTableEditor slotTableEditor, long j2) {
        attachComposeStackTrace(th, operationErrorContext, slotTableEditor, j2);
        return th;
    }

    private static final Throwable attachComposeStackTrace(Throwable th, final OperationErrorContext operationErrorContext, final SlotTableEditor slotTableEditor, final long j2) {
        if (operationErrorContext == null) {
            return th;
        }
        ComposeStackTraceKt.attachComposeStackTrace(th, new a() { // from class: androidx.compose.runtime.composer.linkbuffer.changelist.OperationKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return OperationKt.attachComposeStackTrace$lambda$0(j2, slotTableEditor, operationErrorContext);
            }
        });
        return th;
    }

    static final ComposeStackTrace attachComposeStackTrace$lambda$0(long j2, SlotTableEditor slotTableEditor, OperationErrorContext operationErrorContext) {
        if (j2 != -1) {
            slotTableEditor.seek(j2);
        }
        List listBuildTrace$default = SlotTableEditorKt.buildTrace$default(slotTableEditor, null, 0, 3, null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) i.U(listBuildTrace$default);
        Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        List<ComposeStackTraceFrame> listBuildStackTrace = operationErrorContext.buildStackTrace(groupOffset);
        if (groupOffset != null && !listBuildStackTrace.isEmpty()) {
            ComposeStackTraceFrame composeStackTraceFrame2 = (ComposeStackTraceFrame) i.P(listBuildStackTrace);
            List listAb = i.ab(listBuildStackTrace, 1);
            List listSingletonList = Collections.singletonList(ComposeStackTraceFrame.copy$default(composeStackTraceFrame2, 0, null, groupOffset, 3, null));
            x.e(listSingletonList, "singletonList(...)");
            listBuildStackTrace = i.af(listSingletonList, listAb);
        }
        return new ComposeStackTrace(i.af(listBuildTrace$default, listBuildStackTrace), operationErrorContext.getSourceInformationEnabled());
    }

    private static final int nodeIndex(SlotTableEditor slotTableEditor, int i2) {
        int iNodeCountOf = 0;
        if (i2 < 0) {
            return 0;
        }
        SlotTable table = slotTableEditor.getTable();
        int[] groups = table.getAddressSpace().getGroups();
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (i3 > 0) {
                if (slotTableEditor.isNode(i3)) {
                    break;
                }
                int iParentOf = slotTableEditor.parentOf(i3);
                int[] groups2 = table.getAddressSpace().getGroups();
                for (int root = iParentOf < 0 ? table.getRoot() : slotTableEditor.firstChildOf(iParentOf); root >= 0 && root != i4; root = groups2[root + 1]) {
                    iNodeCountOf += slotTableEditor.nodeCountOf(root);
                }
                i3 = groups[i3 + 2];
                i4 = iParentOf;
            } else if (i3 == 0) {
                ComposerKt.composeImmediateRuntimeError("Traversing parent of group not in the slot table: " + i2);
            }
        }
        return iNodeCountOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(SlotTableEditor slotTableEditor, long j2, Applier<Object> applier) {
        positionToParentOf(slotTableEditor, applier, j2);
        int parentGroup = slotTableEditor.getParentGroup();
        IntStack intStack = new IntStack();
        int[] groups = slotTableEditor.getTable().getAddressSpace().getGroups();
        int group = GroupHandleKt.getGroup(j2);
        int i2 = group;
        while (true) {
            if (i2 > 0) {
                if (i2 == parentGroup) {
                    break;
                }
                intStack.push(i2);
                i2 = groups[i2 + 2];
            } else if (i2 == 0) {
                ComposerKt.composeImmediateRuntimeError("Traversing parent of group not in the slot table: " + group);
            }
        }
        if (slotTableEditor.getParentGroup() != parentGroup) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure when inserting movable content");
        }
        int currentGroup = slotTableEditor.getCurrentGroup();
        boolean z = false;
        int iSkipGroup = 0;
        while (slotTableEditor.getCurrentGroup() != group) {
            if (intStack.tos == 0 || slotTableEditor.getCurrentGroup() != intStack.peek()) {
                iSkipGroup += slotTableEditor.skipGroup();
            } else {
                if (slotTableEditor.isNode()) {
                    applier.down(slotTableEditor.getNode());
                    z = true;
                    iSkipGroup = 0;
                }
                slotTableEditor.startGroup();
                intStack.pop();
            }
        }
        return iSkipGroup + (z ? 0 : nodeIndex(slotTableEditor, currentGroup));
    }

    private static final void positionToParentOf(SlotTableEditor slotTableEditor, Applier<Object> applier, long j2) {
        if (slotTableEditor.getParentGroup() >= 0) {
            MutableIntSet mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
            SlotTable table = slotTableEditor.getTable();
            int iParentOf = slotTableEditor.parentOf(GroupHandleKt.getGroup(j2));
            int[] groups = table.getAddressSpace().getGroups();
            int i2 = iParentOf;
            while (i2 > 0) {
                mutableIntSetMutableIntSetOf.add(i2);
                i2 = groups[i2 + 2];
            }
            if (i2 == 0) {
                ComposerKt.composeImmediateRuntimeError("Traversing parent of group not in the slot table: " + iParentOf);
            }
            while (slotTableEditor.getParentGroup() >= 0 && !mutableIntSetMutableIntSetOf.contains(slotTableEditor.getParentGroup())) {
                if (slotTableEditor.isParentGroupANode()) {
                    applier.up();
                }
                slotTableEditor.endGroup();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseMovableGroup(final ControlledComposition controlledComposition, CompositionContext compositionContext, final MovableContentStateReference movableContentStateReference, SlotTableEditor slotTableEditor, Applier<?> applier) {
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(slotTableEditor.getTable().getAddressSpace(), false, false);
        slotTableBuilder.buildStart();
        MovableContent<Object> content$runtime = movableContentStateReference.getContent$runtime();
        slotTableBuilder.startNewGroup(MovableContentKt.movableContentKey, content$runtime != Composer.Companion.getEmpty() ? 16777216 : 0, content$runtime, null, null);
        slotTableBuilder.addFlags(268435456);
        slotTableBuilder.append(movableContentStateReference.getParameter$runtime());
        slotTableBuilder.moveFrom(slotTableEditor, slotTableEditor.getTable().getAddressSpace().getGroups()[LinkAnchorKt.asLinkAnchor(movableContentStateReference.getAnchor$runtime()).getAddress() + 3] & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        slotTableBuilder.endGroup();
        SlotTable slotTableBuild = slotTableBuilder.build();
        MovableContentState movableContentState = new MovableContentState(slotTableBuild);
        if (slotTableBuild.hasRecomposeScopes(slotTableBuild.getRoot())) {
            SlotTableKt.adoptScopesInGroupToNewParent(slotTableBuild, slotTableBuild.getRoot(), new RecomposeScopeOwner() { // from class: androidx.compose.runtime.composer.linkbuffer.changelist.OperationKt$releaseMovableGroup$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
                    InvalidationResult invalidationResultInvalidate;
                    ControlledComposition controlledComposition2 = controlledComposition;
                    RecomposeScopeOwner recomposeScopeOwner = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner == null || (invalidationResultInvalidate = recomposeScopeOwner.invalidate(recomposeScopeImpl, obj)) == null) {
                        invalidationResultInvalidate = InvalidationResult.IGNORED;
                    }
                    if (invalidationResultInvalidate != InvalidationResult.IGNORED) {
                        return invalidationResultInvalidate;
                    }
                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                    List<k<RecomposeScopeImpl, Object>> invalidations$runtime = movableContentStateReference2.getInvalidations$runtime();
                    if (obj == null) {
                        obj = ScopeInvalidated.INSTANCE;
                    }
                    movableContentStateReference2.setInvalidations$runtime(i.ag(invalidations$runtime, new k(recomposeScopeImpl, obj)));
                    return InvalidationResult.SCHEDULED;
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recordReadOf(Object obj) {
                }
            });
        }
        compositionContext.movableContentStateReleased$runtime(movableContentStateReference, movableContentState, applier);
    }

    private static final void withCurrentStackTrace(OperationErrorContext operationErrorContext, SlotTableEditor slotTableEditor, long j2, a<ab> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            access$attachComposeStackTrace(th, operationErrorContext, slotTableEditor, j2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OperationErrorContext withCurrentStackTrace(final OperationErrorContext operationErrorContext, final SlotTableEditor slotTableEditor) {
        return new OperationErrorContext() { // from class: androidx.compose.runtime.composer.linkbuffer.changelist.OperationKt.withCurrentStackTrace.1
            @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
            public List<ComposeStackTraceFrame> buildStackTrace(Integer num) {
                OperationErrorContext operationErrorContext2 = operationErrorContext;
                SlotTableEditor slotTableEditor2 = slotTableEditor;
                List<ComposeStackTraceFrame> listBuildStackTrace = operationErrorContext2.buildStackTrace(null);
                int parentGroup = slotTableEditor2.getParentGroup();
                return parentGroup < 0 ? listBuildStackTrace : i.af(SlotTableEditorKt.buildTrace(slotTableEditor, num, parentGroup), listBuildStackTrace);
            }

            @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
            public boolean getSourceInformationEnabled() {
                return operationErrorContext.getSourceInformationEnabled();
            }
        };
    }
}
