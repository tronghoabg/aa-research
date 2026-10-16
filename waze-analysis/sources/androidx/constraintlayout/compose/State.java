package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.CorePixelDp;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.widgets.HelperWidget;
import h.g.b.x;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class State extends androidx.constraintlayout.core.state.State {
    public static final int $stable = 8;
    private final Density density;
    private long rootIncomingConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    public State(Density density) {
        this.density = density;
        setDpToPixel(new CorePixelDp() { // from class: androidx.constraintlayout.compose.State$$ExternalSyntheticLambda0
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float toPixels(float f2) {
                return State._init_$lambda$0(this.f$0, f2);
            }
        });
    }

    static final float _init_$lambda$0(State state, float f2) {
        return state.density.getDensity() * f2;
    }

    public static /* synthetic */ void getLayoutDirection$annotations() {
    }

    @Override // androidx.constraintlayout.core.state.State
    public int convertDimension(Object obj) {
        return obj instanceof Dp ? this.density.mo2121roundToPx0680j_4(((Dp) obj).m11178unboximpl()) : super.convertDimension(obj);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final Object getKeyId$constraintlayout_compose(HelperWidget helperWidget) {
        Object next;
        Iterator<T> it = this.mHelperReferences.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((HelperReference) ((Map.Entry) next).getValue()).getHelperWidget(), helperWidget)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: getRootIncomingConstraints-msEJaDk, reason: not valid java name */
    public final long m11632getRootIncomingConstraintsmsEJaDk() {
        return this.rootIncomingConstraints;
    }

    public final void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setRootIncomingConstraints-BRTryo0, reason: not valid java name */
    public final void m11633setRootIncomingConstraintsBRTryo0(long j2) {
        this.rootIncomingConstraints = j2;
    }
}
