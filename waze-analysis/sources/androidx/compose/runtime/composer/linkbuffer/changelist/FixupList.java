package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.composer.DebugStringFormattable;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operation;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operations;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.au;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FixupList extends DebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void createAndInsertNode(a<? extends Object> aVar, int i2, long j2) {
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(insertNodeFixup);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, aVar);
        operations.intArgs[operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()] = i2;
        Operations.WriteScope.m7552setLongimpl(operations, 1, 2, j2);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        Operations operations2 = this.pendingOperations;
        operations2.pushOp(postInsertNodeFixup);
        operations2.intArgs[operations2.intArgsSize - operations2.opCodes[operations2.opCodesSize - 1].getInts()] = i2;
        Operations.WriteScope.m7552setLongimpl(operations2, 1, 2, j2);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixup);
    }

    public final void createAndInsertNodeByAnchor(a<? extends Object> aVar, int i2, LinkAnchor linkAnchor) {
        Operation.InsertNodeFixupByAnchor insertNodeFixupByAnchor = Operation.InsertNodeFixupByAnchor.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(insertNodeFixupByAnchor);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, aVar);
        operations.intArgs[operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()] = i2;
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 1, linkAnchor);
        operations.ensureAllArgumentsPushedFor(insertNodeFixupByAnchor);
        Operation.PostInsertNodeFixupByAnchor postInsertNodeFixupByAnchor = Operation.PostInsertNodeFixupByAnchor.INSTANCE;
        Operations operations2 = this.pendingOperations;
        operations2.pushOp(postInsertNodeFixupByAnchor);
        operations2.intArgs[operations2.intArgsSize - operations2.opCodes[operations2.opCodesSize - 1].getInts()] = i2;
        Operations.WriteScope.m7553setObjectaWHcuVo(operations2, 0, linkAnchor);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixupByAnchor);
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> applier, SlotTableEditor slotTableEditor, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.executeAndFlushAllPendingOperations(applier, slotTableEditor, rememberManager, operationErrorContext);
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    @Override // androidx.compose.runtime.composer.DebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n".concat(this.operations.toDebugString(str)));
        }
        return sb.toString();
    }

    public final <V, T> void updateNode(V v, p<? super T, ? super V, ab> pVar) {
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(updateNode);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 0, v);
        x.d(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        au.h(pVar, 2);
        Operations.WriteScope.m7553setObjectaWHcuVo(operations, 1, pVar);
        operations.ensureAllArgumentsPushedFor(updateNode);
    }
}
