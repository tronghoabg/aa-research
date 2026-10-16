package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OperationKt {
    public static final /* synthetic */ Throwable access$attachComposeStackTrace(Throwable th, OperationErrorContext operationErrorContext, SlotWriter slotWriter, GapAnchor gapAnchor) {
        attachComposeStackTrace(th, operationErrorContext, slotWriter, gapAnchor);
        return th;
    }

    private static final Throwable attachComposeStackTrace(Throwable th, final OperationErrorContext operationErrorContext, final SlotWriter slotWriter, final GapAnchor gapAnchor) {
        if (operationErrorContext == null) {
            return th;
        }
        ComposeStackTraceKt.attachComposeStackTrace(th, new a() { // from class: androidx.compose.runtime.composer.gapbuffer.changelist.OperationKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return OperationKt.attachComposeStackTrace$lambda$0(gapAnchor, slotWriter, operationErrorContext);
            }
        });
        return th;
    }

    static final ComposeStackTrace attachComposeStackTrace$lambda$0(GapAnchor gapAnchor, SlotWriter slotWriter, OperationErrorContext operationErrorContext) {
        if (gapAnchor != null) {
            slotWriter.seek(gapAnchor);
        }
        List listBuildTrace$default = ComposeStackTraceBuilderKt.buildTrace$default(slotWriter, null, 0, null, 7, null);
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

    private static final int currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int iGroupSize = parent + 1;
        int iNodeCount = 0;
        while (iGroupSize < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, iGroupSize)) {
                if (true == slotWriter.isNode(iGroupSize)) {
                    iNodeCount = 0;
                }
                iGroupSize++;
            } else {
                iNodeCount += slotWriter.isNode(iGroupSize) ? 1 : slotWriter.nodeCount(iGroupSize);
                iGroupSize += slotWriter.groupSize(iGroupSize);
            }
        }
        return iNodeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(SlotWriter slotWriter, GapAnchor gapAnchor, Applier<Object> applier) {
        int iAnchorIndex = slotWriter.anchorIndex(gapAnchor);
        if (slotWriter.getCurrentGroup() >= iAnchorIndex) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        positionToParentOf(slotWriter, applier, iAnchorIndex);
        int iCurrentNodeIndex = currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < iAnchorIndex) {
            if (slotWriter.indexInCurrentGroup(iAnchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    iCurrentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                iCurrentNodeIndex += slotWriter.skipGroup();
            }
        }
        if (slotWriter.getCurrentGroup() != iAnchorIndex) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        return iCurrentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i2) {
        while (!slotWriter.indexInParent(i2)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private static final void withCurrentStackTrace(OperationErrorContext operationErrorContext, SlotWriter slotWriter, GapAnchor gapAnchor, a<ab> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            access$attachComposeStackTrace(th, operationErrorContext, slotWriter, gapAnchor);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OperationErrorContext withCurrentStackTrace(final OperationErrorContext operationErrorContext, final SlotWriter slotWriter) {
        return new OperationErrorContext() { // from class: androidx.compose.runtime.composer.gapbuffer.changelist.OperationKt.withCurrentStackTrace.1
            @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
            public List<ComposeStackTraceFrame> buildStackTrace(Integer num) {
                OperationErrorContext operationErrorContext2 = operationErrorContext;
                SlotWriter slotWriter2 = slotWriter;
                List<ComposeStackTraceFrame> listBuildStackTrace = operationErrorContext2.buildStackTrace(null);
                int parent = slotWriter2.getParent();
                if (parent < 0) {
                    return listBuildStackTrace;
                }
                SlotWriter slotWriter3 = slotWriter;
                return i.af(ComposeStackTraceBuilderKt.buildTrace(slotWriter3, num, parent, Integer.valueOf(slotWriter3.parent(parent))), listBuildStackTrace);
            }

            @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
            public boolean getSourceInformationEnabled() {
                return operationErrorContext.getSourceInformationEnabled();
            }
        };
    }
}
