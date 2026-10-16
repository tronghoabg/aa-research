package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.constraintlayout.core.parser.CLObject;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class HorizontalChainScope {
    public static final int $stable = 0;
    private final VerticalAnchorable absoluteLeft;
    private final VerticalAnchorable absoluteRight;
    private final VerticalAnchorable end;
    private final Object id;
    private final ConstrainedLayoutReference parent = new ConstrainedLayoutReference("parent");
    private final VerticalAnchorable start;

    public HorizontalChainScope(Object obj, CLObject cLObject) {
        this.id = obj;
        this.start = new ChainVerticalAnchorable(cLObject, -2);
        this.absoluteLeft = new ChainVerticalAnchorable(cLObject, 0);
        this.end = new ChainVerticalAnchorable(cLObject, -1);
        this.absoluteRight = new ChainVerticalAnchorable(cLObject, 1);
    }

    public final VerticalAnchorable getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final VerticalAnchorable getAbsoluteRight() {
        return this.absoluteRight;
    }

    public final VerticalAnchorable getEnd() {
        return this.end;
    }

    public final Object getId$constraintlayout_compose() {
        return this.id;
    }

    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final VerticalAnchorable getStart() {
        return this.start;
    }
}
