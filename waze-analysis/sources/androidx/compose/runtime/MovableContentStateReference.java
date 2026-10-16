package androidx.compose.runtime;

import h.a.i;
import h.g.b.x;
import h.k;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MovableContentStateReference {
    public static final int $stable = 8;
    private final Anchor anchor;
    private final ControlledComposition composition;
    private final MovableContent<Object> content;
    private List<? extends k<RecomposeScopeImpl, ? extends Object>> invalidations;
    private final PersistentCompositionLocalMap locals;
    private final List<MovableContentStateReference> nestedReferences;
    private final Object parameter;
    private final SlotStorage slotStorage;

    public MovableContentStateReference(MovableContent<Object> movableContent, Object obj, ControlledComposition controlledComposition, SlotStorage slotStorage, Anchor anchor, List<? extends k<RecomposeScopeImpl, ? extends Object>> list, PersistentCompositionLocalMap persistentCompositionLocalMap, List<MovableContentStateReference> list2) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotStorage = slotStorage;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
        this.nestedReferences = list2;
    }

    public final Anchor getAnchor$runtime() {
        return this.anchor;
    }

    public final ControlledComposition getComposition$runtime() {
        return this.composition;
    }

    public final MovableContent<Object> getContent$runtime() {
        return this.content;
    }

    public final List<k<RecomposeScopeImpl, Object>> getInvalidations$runtime() {
        return this.invalidations;
    }

    public final PersistentCompositionLocalMap getLocals$runtime() {
        return this.locals;
    }

    public final List<MovableContentStateReference> getNestedReferences$runtime() {
        return this.nestedReferences;
    }

    public final Object getParameter$runtime() {
        return this.parameter;
    }

    public final SlotStorage getSlotStorage$runtime() {
        return this.slotStorage;
    }

    public final void setInvalidations$runtime(List<? extends k<RecomposeScopeImpl, ? extends Object>> list) {
        this.invalidations = list;
    }

    public final void transferPendingInvalidations$runtime() {
        if (this.anchor.getValid()) {
            List<? extends k<RecomposeScopeImpl, ? extends Object>> list = this.invalidations;
            ControlledComposition controlledComposition = this.composition;
            x.d(controlledComposition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            this.invalidations = i.af(list, ((CompositionImpl) controlledComposition).extractInvalidationsOf$runtime(this.anchor));
        }
    }
}
