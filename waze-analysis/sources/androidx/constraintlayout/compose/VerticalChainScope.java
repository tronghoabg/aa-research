package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.constraintlayout.core.parser.CLObject;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class VerticalChainScope {
    public static final int $stable = 0;
    private final HorizontalAnchorable bottom;
    private final Object id;
    private final ConstrainedLayoutReference parent = new ConstrainedLayoutReference("parent");
    private final HorizontalAnchorable top;

    public VerticalChainScope(Object obj, CLObject cLObject) {
        this.id = obj;
        this.top = new ChainHorizontalAnchorable(cLObject, 0);
        this.bottom = new ChainHorizontalAnchorable(cLObject, 1);
    }

    public final HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    public final Object getId$constraintlayout_compose() {
        return this.id;
    }

    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final HorizontalAnchorable getTop() {
        return this.top;
    }
}
