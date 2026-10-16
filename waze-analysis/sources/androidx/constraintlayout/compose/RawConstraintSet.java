package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RawConstraintSet implements ConstraintSet {
    public static final int $stable = 0;
    private final CLObject clObject;
    private final ConstraintSetParser.LayoutVariables layoutVariables = new ConstraintSetParser.LayoutVariables();

    public RawConstraintSet(CLObject cLObject) {
        this.clObject = cLObject;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(State state, List<? extends Measurable> list) {
        ConstraintSetParser.populateState(this.clObject, state, this.layoutVariables);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.RawConstraintSet");
        return x.n(this.clObject, ((RawConstraintSet) obj).clObject);
    }

    public int hashCode() {
        return this.clObject.hashCode();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public /* synthetic */ boolean isDirty(List list) {
        return true;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public /* synthetic */ ConstraintSet override(String str, float f2) {
        return this;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public /* synthetic */ void applyTo(androidx.constraintlayout.core.state.Transition transition, int i2) {
    }
}
