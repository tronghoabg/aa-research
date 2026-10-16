package androidx.compose.runtime;

import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GapCompositionDataImpl implements CompositionData, CompositionInstance {
    public static final int $stable = 8;
    private final Composition composition;

    public GapCompositionDataImpl(Composition composition) {
        this.composition = composition;
    }

    private final CompositionContext getContext(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getParent();
        }
        return null;
    }

    private final SlotTable getSlotTable() {
        Composition composition = this.composition;
        x.d(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        return SlotTableKt.asGapBufferSlotTable(((CompositionImpl) composition).getSlotStorage$runtime());
    }

    public boolean equals(Object obj) {
        return (obj instanceof GapCompositionDataImpl) && x.n(this.composition, ((GapCompositionDataImpl) obj).composition);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return getSlotTable().find(obj);
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionGroup findContextGroup() {
        SlotStorage slotTable;
        Integer numFindSubcompositionContextGroup;
        Composition parent = getParent(this.composition);
        if (parent == null || (slotTable = getSlotTable(parent)) == null) {
            return null;
        }
        Composition composition = this.composition;
        SlotTable slotTableAsGapBufferSlotTable = SlotTableKt.asGapBufferSlotTable(slotTable);
        CompositionContext context = getContext(composition);
        if (context == null || (numFindSubcompositionContextGroup = ComposeStackTraceBuilderKt.findSubcompositionContextGroup(slotTableAsGapBufferSlotTable, context)) == null) {
            return null;
        }
        return SlotTableKt.compositionGroupOf(slotTableAsGapBufferSlotTable, numFindSubcompositionContextGroup.intValue());
    }

    public final Composition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return getSlotTable().getCompositionGroups();
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionData getData() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionInstance getParent() {
        Composition parent = getParent(this.composition);
        return parent != null ? new GapCompositionDataImpl(parent) : null;
    }

    public int hashCode() {
        return this.composition.hashCode() * 31;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return getSlotTable().isEmpty();
    }

    private final Composition getParent(Composition composition) {
        CompositionContext context = getContext(composition);
        if (context != null) {
            return context.getComposition$runtime();
        }
        return null;
    }

    private final SlotStorage getSlotTable(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getSlotStorage$runtime();
        }
        return null;
    }
}
