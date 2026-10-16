package androidx.compose.runtime;

import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LinkCompositionDataImpl implements CompositionData, CompositionInstance {
    public static final int $stable = 8;
    private final Composition composition;

    public LinkCompositionDataImpl(Composition composition) {
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
        return SlotTableKt.asLinkBufferSlotTable(((CompositionImpl) composition).getSlotStorage$runtime());
    }

    public boolean equals(Object obj) {
        return (obj instanceof LinkCompositionDataImpl) && x.n(this.composition, ((LinkCompositionDataImpl) obj).composition);
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
        SlotTable slotTableAsLinkBufferSlotTable = SlotTableKt.asLinkBufferSlotTable(slotTable);
        CompositionContext context = getContext(composition);
        if (context == null || (numFindSubcompositionContextGroup = LinkComposerKt.findSubcompositionContextGroup(slotTableAsLinkBufferSlotTable, context)) == null) {
            return null;
        }
        return SlotTableKt.compositionGroupOf(slotTableAsLinkBufferSlotTable, numFindSubcompositionContextGroup.intValue());
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
        return parent != null ? new LinkCompositionDataImpl(parent) : null;
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
