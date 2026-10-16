package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operation;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operations;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.au;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void createAndInsertNode(a<? extends Object> aVar, int i2, GapAnchor gapAnchor) {
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        Operations operations = this.operations;
        operations.pushOp(insertNodeFixup);
        Operations.WriteScope.m7488setObjectsGr0YRc(operations, 0, aVar);
        operations.intArgs[operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()] = i2;
        Operations.WriteScope.m7488setObjectsGr0YRc(operations, 1, gapAnchor);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        Operations operations2 = this.pendingOperations;
        operations2.pushOp(postInsertNodeFixup);
        operations2.intArgs[operations2.intArgsSize - operations2.opCodes[operations2.opCodesSize - 1].getInts()] = i2;
        Operations.WriteScope.m7488setObjectsGr0YRc(operations2, 0, gapAnchor);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixup);
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager, operationErrorContext);
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

    @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationsDebugStringFormattable
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
        Operations.WriteScope.m7488setObjectsGr0YRc(operations, 0, v);
        x.d(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        au.h(pVar, 2);
        Operations.WriteScope.m7488setObjectsGr0YRc(operations, 1, pVar);
        operations.ensureAllArgumentsPushedFor(updateNode);
    }
}
